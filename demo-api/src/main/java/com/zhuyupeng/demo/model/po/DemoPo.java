package com.zhuyupeng.demo.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DemoPo {
    private Integer demoId;
    private String demoName;
    private LocalDateTime createdTime;
}
