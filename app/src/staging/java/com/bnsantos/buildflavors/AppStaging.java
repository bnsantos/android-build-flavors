package com.bnsantos.buildflavors;


import com.bnsantos.buildflavors.provider.Provider;
import com.bnsantos.buildflavors.provider.ProviderStagingImpl;

public class AppStaging extends App {
  @Override
  public Provider getProvider() {
    return new ProviderStagingImpl();
  }
}
