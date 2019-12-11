package com.wedding.lottery.util;

import com.wedding.lottery.model.UserInfo;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Slf4j
public class LotteryUtil {

    @Setter
    private static List<UserInfo> list;

    public static UserInfo getWinner(String name) {

        /***
         * 先過濾候選人投表者
         * 在從頭票者抽出來
         */
        List<UserInfo> lotteryList = new ArrayList<>();
        for (UserInfo u : list) {
            if (u.getCandidate().equals(name))
                lotteryList.add(u);
        }

        log.info("----------- lotteryList size = {} -------------", lotteryList.size());

        Random r = new Random();
        log.info(" lotteryList : {}", lotteryList);
        int seed = r.nextInt(lotteryList.size());
        return lotteryList.get(seed);
    }

}
