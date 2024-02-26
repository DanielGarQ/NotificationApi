package com.notificationapi.notificationapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.notificationapi.notificationapi.service.NotificacionService;

@RestController
@RequestMapping("notificacion/v1")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping("/consultar")
    public String hello(){
        return "HELLO WOOORLD";
    }

}