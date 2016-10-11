package com.bnsantos.buildflavors;

import android.app.Application;

import com.bnsantos.buildflavors.provider.Provider;


public abstract class App extends Application {
  public abstract Provider getProvider();
}
