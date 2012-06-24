package com.fitied.playn.tryout.crowtest.crowtest.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.fitied.playn.tryout.crowtest.crowtest.core.CrowTest;

public class CrowTestActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("com/fitied/playn/tryout/crowtest/crowtest/resources");
    PlayN.run(new CrowTest());
  }
}
