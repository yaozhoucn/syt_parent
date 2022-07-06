package com.atguigu.syt.cmn.service;

import com.atguigu.syt.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: HANG
 * @Date: 2022/7/6 11:15
 * @Desc:
 */
public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChlidData(Long id);

    /**
     * 导出
     * @param response
     */
    void exportData(HttpServletResponse response);


}
