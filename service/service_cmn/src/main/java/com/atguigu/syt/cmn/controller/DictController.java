package com.atguigu.syt.cmn.controller;

import com.atguigu.syt.cmn.service.DictService;
import com.atguigu.syt.model.cmn.Dict;
import io.swagger.annotations.Api;
import com.atguigu.syt.common.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: HANG
 * @Date: 2022/7/6 11:28
 * @Desc:
 */
@Api(description = "数据字典接口")
@RestController
@RequestMapping("/admin/cmn/dict")
public class DictController {
    @Autowired
    private DictService dictService;

    //根据数据id查询子数据列表
    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id){
        List<Dict> dictList = dictService.findChlidData(id);
        return Result.ok(dictList);
    }

}
