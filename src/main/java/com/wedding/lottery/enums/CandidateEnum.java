package com.wedding.lottery.enums;

import lombok.Getter;

/**
 * 抽捧花候選人
 **/
public enum CandidateEnum {
    許羽沛("許羽沛"),
    丁子凡("丁子凡"),
    林旅寧("林旅寧"),
    邱天惠("邱天惠"),
    張瓊怡("張瓊怡"),
    陳珮榕("陳珮榕"),
    ;
    @Getter
    private String name;

    CandidateEnum(String name) {
        this.name = name;
    }
}


