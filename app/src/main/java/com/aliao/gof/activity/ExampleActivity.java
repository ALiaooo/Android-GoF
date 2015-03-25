package com.aliao.gof.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.aliao.gof.GoF_分离变与不变.SeperateVariantFragment;
import com.aliao.gof.utils.Constants;

/**
 * Created by 丽双 on 2015/3/25.
 */
public class ExampleActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fragment fragment = null;

        switch (getIntent().getIntExtra(Constants.GOF_FRAGMENT_INTEX, 0)){
            case Constants.SEPERATE_VARIANT_FRAGMENT_INTEX:
                if (null == fragment)
                    fragment = new SeperateVariantFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, fragment).commit();

    }
}
