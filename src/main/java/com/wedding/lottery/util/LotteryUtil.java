package com.wedding.lottery.util;

import com.wedding.lottery.model.UserInfo;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

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
         *
         */
        Random r = new Random();
        log.info(" list : {}", list);
        int seed = r.nextInt(list.size());
        return list.get(seed);
    }

}
