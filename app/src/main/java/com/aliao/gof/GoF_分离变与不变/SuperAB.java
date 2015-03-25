package com.aliao.gof.GoF_分离变与不变;

import com.aliao.gof.utils.L;

/**
 * Created by 丽双 on 2015/3/25.
 */
public abstract class SuperAB {
    public void template_print(){
        L.d("AA print x = " + hook_getData());
    }
    abstract String hook_getData();
}
