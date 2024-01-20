package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.classes.Holiday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidaysController {
    public static Holiday[] BuildArray() {
        String[] datesArr = { "01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024",
                "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024" };
        String[] namesArr = { "Confraternização Mundial", "Carnaval", "Carnaval", "Sexta-feira Santa", "Tiradentes",
                "Dia do Trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados",
                "Proclamação da República", "Dia Nacional de Zumbi e da Consciência Negra", "Natal" };

        Holiday[] holidaysArr = new Holiday[namesArr.length];

        for (int i = 0; i < namesArr.length; i++) {
            holidaysArr[i] = new Holiday(datesArr[i], namesArr[i]);
        }

        return holidaysArr;
    }

    @GetMapping
    public String getAllHolidays() {
        Holiday[] holidaysArr = BuildArray();

        String list = "";
        for (int i = 0; i < holidaysArr.length; i++) {
            list += holidaysArr[i].getHoliday() + " |\n";
        }

        return list;
    }

    @GetMapping("/{date}")
    public String getHoliday(@PathVariable("date") String date) {
        if (!(date.contains("-2024"))) {
            return "Data inválida";
        }

        Holiday[] holidaysArr = BuildArray();

        for (int i = 0; i < holidaysArr.length; ++i) {
            if (date.equals(holidaysArr[i].getDate())) {
                String name = holidaysArr[i].getName();
                return "Dia " + date + " é " + name + "! 🎉";
            }
        }

        return "Dia " + date + " não é feriado 🥲";
    }

}