package com.wedding.lottery.controller;


import com.wedding.lottery.enums.CandidateEnum;
import com.wedding.lottery.model.UserInfo;
import com.wedding.lottery.service.LotteryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Api(value = "Wedding Lottery 開獎")
@RestController
@RequestMapping("/")
public class LotteryController {

    @Autowired
    LotteryService lotteryService;

    @ApiOperation(value = "直接抽出幸運兒")
    @GetMapping("/lottery/winner")
    public UserInfo getWinner(@RequestParam CandidateEnum name) {
        return lotteryService.getWinner(name.getName());
    }

    @ApiOperation(value = "該位候選人-投票人數")
    @GetMapping("/lottery/count")
    public Integer getSizeByCandidate(@RequestParam CandidateEnum name) {
        return lotteryService.countByName(name.getName());
    }

    @ApiOperation(value = "投候選人有誰?")
    @GetMapping("/lottery/user/list")
    public List<UserInfo> getUserListByCandidate(@RequestParam CandidateEnum name) {
        return lotteryService.getUserListByName(name.getName());
    }
}
