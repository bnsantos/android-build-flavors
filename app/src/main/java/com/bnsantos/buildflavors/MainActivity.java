package com.bnsantos.buildflavors;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bnsantos.buildflavors.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private ActivityMainBinding mBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    mBinding.text.setText(BuildConfig.TEST);

    mBinding.button.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    String value = ((App) getApplication()).getProvider().getValue();
    mBinding.textView.setText(value);
  }
}
