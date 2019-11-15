/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import java.util.Map;

/**
 *
 * @author okt19
 */
public class ErrorJson {
    
    private Integer status;
    private String error;
    private String message;
    private String timeStamp;
    private String trace;

    public ErrorJson(Integer status, Map<String, Object> errorAtributes) {
        this.status = status;
        this.error = (String) errorAtributes.get("error");
        this.message = (String) errorAtributes.get("message");
        this.timeStamp = (String) errorAtributes.get("timestamp").toString();
        this.trace = (String) errorAtributes.get("trace");
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }
}
