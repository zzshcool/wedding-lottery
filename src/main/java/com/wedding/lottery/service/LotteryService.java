package com.wedding.lottery.service;


import com.wedding.lottery.model.UserInfo;
import com.wedding.lottery.util.GoogleSheetsService;
import com.wedding.lottery.util.LotteryUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class LotteryService {


    public List<UserInfo> getWinner(String name) {
        List<UserInfo> userList = GoogleSheetsService.getUserList();
        LotteryUtil.setList(userList);
        List<UserInfo> winner = LotteryUtil.getWinners(name);
        return winner;
    }


    public Integer countByName(String name) {
        List<UserInfo> userList = GoogleSheetsService.getUserList();
        int count = 0;
        for (UserInfo user : userList) {
            if (user.getCandidate().equals(name))
                count++;
        }
        return count;
    }

    public List<UserInfo> getUserListByName(String name) {
        List<UserInfo> userList = GoogleSheetsService.getUserList();
        List<UserInfo> reslut = new ArrayList<>();
        for (UserInfo u : userList) {
            if (u.getCandidate().equals(name))
                reslut.add(u);
        }
        return reslut;
    }
}
