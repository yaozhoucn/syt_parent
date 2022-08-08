package com.atguigu.syt.hosp.service;

import com.atguigu.syt.model.hosp.HospitalSet;
import com.atguigu.syt.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: HANG
 * @Date: 2022/3/22 15:34
 * @Desc:
 */
public interface HospitalSetService extends IService<HospitalSet> {

    //2 根据传递过来医院编码，查询数据库，查询签名
    String getSignKey(String hoscode);

    //获取医院签名信息
    SignInfoVo getSignInfoVo(String hoscode);
}
