package com.fitied.playn.tryout.crowtest.crowtest.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.fitied.playn.tryout.crowtest.crowtest.core.CrowTest;

public class CrowTestJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("com/fitied/playn/tryout/crowtest/crowtest/resources");
    PlayN.run(new CrowTest());
  }
}
