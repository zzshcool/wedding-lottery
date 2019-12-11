package com.wedding.lottery.util;

import com.wedding.lottery.model.UserInfo;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/***
 * 先過濾候選人投表者&重複投票者
 * 在從頭票者抽出來
 */
@Slf4j
public class LotteryUtil {

    @Setter
    private static List<UserInfo> list;

    public static UserInfo getWinner(String name) {

        HashMap<String, UserInfo> map = new HashMap<>();
        for (UserInfo u : list) {
            if (u.getCandidate().equals(name)) {
                map.put(u.getWinner(), u);
            }
        }

        List<UserInfo> lotteryList = new ArrayList<>();
        map.forEach((k, v) -> {
            lotteryList.add(v);
        });

        log.info("----------- lotteryList size = {} -------------", lotteryList.size());

        Random r = new Random(System.currentTimeMillis());
        log.info(" lotteryList : {}", map);
        int seed = r.nextInt(lotteryList.size());
        return lotteryList.get(seed);
    }

}
