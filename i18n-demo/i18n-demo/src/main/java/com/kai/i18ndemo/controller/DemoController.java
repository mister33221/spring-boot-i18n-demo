package com.kai.i18ndemo.controller;


import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DemoController {

    // MessageSource: 可以讀取訊息檔案
    private MessageSource messageSource;

    public DemoController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(Locale locale) {
        System.out.println("locale: " + locale);
        String message = messageSource.getMessage("current.locale", null, locale);
        return ResponseEntity.ok(message);
    }

}
