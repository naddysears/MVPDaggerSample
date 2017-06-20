package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nansari on 6/19/2017.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {

    void inject(FoodzActivity target);

    void inject(FoodActivity target);
}
