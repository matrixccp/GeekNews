package com.codeest.geeknews.di.component;

import android.app.Activity;

import com.codeest.geeknews.di.FragmentScope;
import com.codeest.geeknews.di.module.FragmentModule;
import com.codeest.geeknews.model.http.RetrofitHelper;
import com.codeest.geeknews.ui.zhihu.fragment.DailyFragment;
import com.codeest.geeknews.ui.zhihu.fragment.HotFragment;
import com.codeest.geeknews.ui.zhihu.fragment.SectionFragment;
import com.codeest.geeknews.ui.zhihu.fragment.ZhihuMainFragment;
import com.codeest.geeknews.ui.zhihu.fragment.ThemeFragment;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    RetrofitHelper getRetrofitHelper();

    Activity getActivity();

    void inject(ZhihuMainFragment zhihuMainFragment);

    void inject(DailyFragment dailyFragment);

    void inject(ThemeFragment themeFragment);

    void inject(SectionFragment sectionFragment);

    void inject(HotFragment hotFragment);

}
