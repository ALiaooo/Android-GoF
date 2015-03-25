package com.aliao.gof.GoF_分离变与不变;

/**
 * Created by 丽双 on 2015/3/25.
 */
public class B extends SuperAB {

    private int x;

    public B(int k){
        x = k;
    }
    
    @Override
    String hook_getData() {
        return null;
    }
}
