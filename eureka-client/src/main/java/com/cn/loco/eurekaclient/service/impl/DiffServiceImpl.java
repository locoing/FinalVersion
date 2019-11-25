package com.cn.loco.eurekaclient.service.impl;

import com.cn.loco.eurekaclient.service.DiffService;
import com.cn.loco.eurekaclient.utils.diff_match_patch;
import org.springframework.stereotype.Service;

@Service
public class DiffServiceImpl implements DiffService {

    @Override
    public void diff() {
        diff_match_patch diffMatchPatch = new diff_match_patch();
    }
}
