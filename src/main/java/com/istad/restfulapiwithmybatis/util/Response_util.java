package com.istad.restfulapiwithmybatis.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Response_util<T> {
    public enum Status {
        OK, BAD_REQUEST, UNAUTHORIZED, EXCEPTION,
        VALIDATION_EXCEPTION, WRONG_CREDENTIAL, ACCESS_DENIED,
        NOT_FOUND, DUPLICATE_ENTRY, SUCCESS_DELETE, CREATE_SUCCESS,
        UPDATE_SUCCESS
    }

    private T payload;
    private Object message;
    private boolean success = false;
    private Object metadata;
    private Status status;

    // create the method
    public static <T> Response_util<T> ok() {
        Response_util<T> response = new Response_util<>();
        response.setSuccess(true);
        response.setStatus(Status.OK);
        return response;
    }

    public static <T> Response_util<T> badRequest() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.BAD_REQUEST);
        response.setSuccess(false);
        return response;
    }

    public static <T> Response_util<T> createSuccess() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.CREATE_SUCCESS);
        response.setSuccess(true);
        return response;
    }


    public static <T> Response_util<T> updateSuccess() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.UPDATE_SUCCESS);
        response.setSuccess(true);
        return response;
    }

    public static <T> Response_util<T> deleteSuccess() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.SUCCESS_DELETE);
        response.setSuccess(true);
        return response;
    }

    public static <T> Response_util<T> notFound() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.NOT_FOUND);
        return response;
    }

    public static <T> Response_util<T> exception() {
        Response_util<T> response = new Response_util<>();
        response.setStatus(Status.EXCEPTION);
        return response;
    }
}
