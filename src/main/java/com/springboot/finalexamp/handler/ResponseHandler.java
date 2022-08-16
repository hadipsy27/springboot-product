package com.springboot.finalexamp.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(HttpStatus status, boolean success, String message, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();

        // Asia/Jakarta Zone date time now
        Instant instantNow = Instant.now();
        ZoneId asiaJakarta = ZoneId.of("Asia/Jakarta");
        ZonedDateTime nowAsiaJakarta = ZonedDateTime.ofInstant(instantNow, asiaJakarta);

        try {
            map.put("data", responseObj);
            map.put("timestamp",nowAsiaJakarta);
            map.put("status", status.value());
            map.put("isSuccess", success);
            map.put("message", message);

            return new ResponseEntity<Object>(map,status);
        } catch (Exception e) {
            map.clear();
            map.put("data", null);
            map.put("timestamp", nowAsiaJakarta);
            map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            map.put("isSuccess",false);
            map.put("message", e.getMessage());
            return new ResponseEntity<Object>(map,status);
        }
    }
}
