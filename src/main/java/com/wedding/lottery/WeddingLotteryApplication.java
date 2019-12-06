package com.wedding.lottery;

import com.wedding.lottery.util.GoogleSheetsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.GeneralSecurityException;


@Slf4j
@SpringBootApplication
public class WeddingLotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeddingLotteryApplication.class, args);
    }
}
