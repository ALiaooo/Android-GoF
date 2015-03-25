package com.aliao.gof.GoF_分离变与不变;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aliao.gof.R;

/**
 * Created by 丽双 on 2015/3/25.
 */
public class SeperateVariantFragment extends Fragment implements View.OnClickListener{

    private Button mBtnPrint;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_seperate_variant, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {

        mBtnPrint = (Button) view.findViewById(R.id.btn_seperate_variant_print);
        mBtnPrint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_seperate_variant_print:
                orignalPrint();

                break;
        }
    }

    /**
     * 第一步：观察类AA和类BB不变和变化的地方：
     *         不变：print函数的写法
     *         变化：AA类里print函数输出字符串，BB类里print函数输出整型
     *         所以变化的部分就是输出的变量x（数据类型）
     *
     * 第二步：分离变化和不变的部分，将变化的部分写入hook函数 hook_getData(),print函数演化为template_print函数
     *         此时template_print()函数含有不变的部分，而hook')getData()含有会变的部分
     *
     * 第三步：将不变部分写入抽象类
     *         新建类SuperAB，并且定义抽象的hook_getData()卡榫函数
     *         新建类A和类B分别继承SuperAB
     *         对应Android，AF的用意就是吸收不变的部分，所以像SuperAB这样的抽象父类会被纳入框架（AF）里，类A,类B这样的子类别会被纳入应用程序里
     *         这父、子类别的沟通就是框架与应用程序之间的沟通
     */
    private void orignalPrint() {
        AA aa = new AA("Hello I'm AA");
        aa.print();

        BB bb = new BB(6);
        bb.print();

        //改进后调用template_print()
        A a = new A("A");
        a.template_print();
    }
}
