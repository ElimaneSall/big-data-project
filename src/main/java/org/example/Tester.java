package org.example;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tester {

    public static void main(String[] args) {
        ClimatImpl climat = new ClimatImpl();

        Climat climat1 = new Climat(

                Timestamp.valueOf("2023-07-04 03:37:05"),
                10000,
                Timestamp.valueOf("2023-07-04 09:18:47"),
                "Clouds",
                new BigDecimal("23.010000000000048"),
                Timestamp.valueOf("2023-07-04 09:18:47"),
                new BigDecimal("19.410000000000025"),
                1015,
                Timestamp.valueOf("2023-07-04 09:18:57"),
                1015,
                Timestamp.valueOf("2023-07-04 19:03:19"),
                new BigDecimal("21.629999999999995"),
                75,
                35,
                932,
                new BigDecimal("2.4622902"));

        climat.saveClimat(climat1);
        System.out.println("Sucess");

    }
}
