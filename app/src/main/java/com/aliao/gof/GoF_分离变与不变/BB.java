package com.aliao.gof.GoF_分离变与不变;

import com.aliao.gof.utils.L;

/**
 * Created by 丽双 on 2015/3/25.
 */
public class BB {

    private int x;

    public BB(int k){
        x = k;
    }

    public void print(){
        L.d("BB print x = " + x);
    }

    /**
     * 步骤二：分离变化和不变的部分，将变化的部分写入hook函数 hook_getData()
     * @return
     */
    public void template_print(){
        L.d("AA print x = "+hook_getData());
    }
    public String hook_getData(){
        return String.valueOf(x);
    }

}
