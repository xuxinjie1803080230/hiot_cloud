package com.example.hiot_cloud.injection.component;

import android.app.Application;
import android.content.Context;

import com.example.hiot_cloud.App;
import com.example.hiot_cloud.injection.ApplicationContext;
import com.example.hiot_cloud.injection.module.ApplicationModule;
import com.example.hiot_cloud.test.mvptest.TestMvpActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App application);


    @ApplicationContext
    Context context();

    Application application();


    @Component.Builder
    interface ApplicationModuleBuilder {
        ApplicationComponent build();

        ApplicationModuleBuilder applicationModule(ApplicationModule applicationModule);
    }
}
