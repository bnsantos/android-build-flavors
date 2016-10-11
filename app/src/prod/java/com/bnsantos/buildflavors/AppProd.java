package com.bnsantos.buildflavors;

import com.bnsantos.buildflavors.provider.Provider;
import com.bnsantos.buildflavors.provider.ProviderProdImpl;


public class AppProd extends App {
  @Override
  public Provider getProvider() {
    return new ProviderProdImpl();
  }
}
