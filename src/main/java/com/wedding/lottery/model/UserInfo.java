package com.wedding.lottery.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel(value = "中獎人Model")
@Data
public class UserInfo {
    @ApiModelProperty(value = "生成時間")
    String date;
    @ApiModelProperty(value = "抽捧花候選人")
    String candidate;
    @ApiModelProperty(value = "中獎人")
    String winner;
}
