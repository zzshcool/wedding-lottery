package com.wedding.lottery.util;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.wedding.lottery.model.UserInfo;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class GoogleSheetsService {

    private static final String range = "A2:E200";
    static final String spreadsheetId = "1QemHQpqKKm321f-Bw_lomflRep2l01TV5gwvqSINfQk";

    public static ValueRange getValues() throws IOException, GeneralSecurityException {
        Sheets service = GoogleSheetsUtil.getSheetsService();
        ValueRange readResult = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        return readResult;
    }


    public static List<UserInfo> getUserList() {
        ValueRange response = null;
        try {
            response = GoogleSheetsService.getValues();
        } catch (Exception e) {
            log.info("Exception -> {} ", e);
        }
        List<UserInfo> userList = new ArrayList<>();
        for (List list : response.getValues()) {
            UserInfo user = new UserInfo();
            user.setDate(String.valueOf(list.get(0)));
            user.setCandidate(String.valueOf(list.get(1)));
            user.setWinner(String.valueOf(list.get(2)));
            userList.add(user);
        }
        return userList;
    }

}
