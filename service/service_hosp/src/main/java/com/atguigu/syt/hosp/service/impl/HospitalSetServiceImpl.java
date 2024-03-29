package com.atguigu.syt.hosp.service.impl;

import com.atguigu.syt.hosp.mapper.HospitalSetMapper;
import com.atguigu.syt.hosp.service.HospitalSetService;
import com.atguigu.syt.model.hosp.HospitalSet;
import com.atguigu.syt.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: HANG
 * @Date: 2022/3/22 15:37
 * @Desc:
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    @Override
    public String getSignKey(String hoscode) {
        return null;
    }

    @Override
    public SignInfoVo getSignInfoVo(String hoscode) {
        return null;
    }
}
