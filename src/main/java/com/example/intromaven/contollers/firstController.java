package com.example.intromaven.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
    @GetMapping()
    public String startPage (){
        return "Приложение запужено";
    }
    @GetMapping("/info")
    public String introProject(){
        return "Ф.И.О.: Хайбуллин И.М.}; " +
                "Название проекта: 'Maven'; " +
                "Дата создания проекта: 14.03.2023; " +
                "Описание проекта: Создание web-приложения" ;
    }
}