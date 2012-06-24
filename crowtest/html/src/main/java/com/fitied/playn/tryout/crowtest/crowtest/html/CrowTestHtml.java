package com.fitied.playn.tryout.crowtest.crowtest.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.fitied.playn.tryout.crowtest.crowtest.core.CrowTest;

public class CrowTestHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assets().setPathPrefix("crowtest/");
    PlayN.run(new CrowTest());
  }
}
