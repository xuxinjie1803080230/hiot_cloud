package com.example.hiot_cloud.test.dagger2test;

import com.example.hiot_cloud.test.mvptest.TestMvpActivity;

import dagger.Component;

/**
 * 测试注入器接口
 */
@Component(modules = TestModule.class)
public interface PresenterComponent {
    void inject(TestMvpActivity testMvpActivity);
}
