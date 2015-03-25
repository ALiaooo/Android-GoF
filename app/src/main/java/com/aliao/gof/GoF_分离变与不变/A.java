package com.aliao.gof.GoF_分离变与不变;

import com.aliao.gof.utils.L;

/**
 * Created by 丽双 on 2015/3/25.
 */
public class A extends SuperAB{

    private String x;

    public A(String str){
        x = str;
    }

    @Override
    String hook_getData() {
        return x;
    }
}
