package com.zhuyupeng.demo.controller;

import com.zhuyupeng.demo.model.po.DemoPo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Api(tags = "演示")
@Slf4j
@RestController
@RequestMapping("/demos")
public class DemoController {
    @ApiOperation("全部")
    @GetMapping
    public List<DemoPo> all() {
        return null;
    }

    @ApiOperation("全部")
    @GetMapping(params = "demoId")
    public List<DemoPo> all(@RequestParam Integer demoId) {
        System.out.println(demoId);
        return Arrays.asList(DemoPo.builder().build());
    }

    @ApiOperation("单个")
    @GetMapping("/{demoId}")
    public DemoPo one(@PathVariable Integer demoId) {
        System.out.println(demoId);
        return DemoPo.builder().createdTime(LocalDateTime.now()).build();
    }

    @ApiOperation("新增")
    @PostMapping
    public DemoPo newDemo(@RequestBody DemoPo newDemo) {
        return null;
    }

    @ApiOperation("更新或新增")
    @PutMapping("/{demoId}")
    public DemoPo replaceDemo(@RequestBody DemoPo newDemo, @PathVariable Integer demoId) {
        return null;
    }

    @ApiOperation("更新")
    @PatchMapping("/{demoId}")
    public DemoPo updateDemo(@RequestBody DemoPo newDemo, @PathVariable Integer demoId) {
        return null;
    }

    @ApiOperation("删除")
    @DeleteMapping("/{demoId}")
    public void deleteDemo(@PathVariable Integer demoId) {
    }
}