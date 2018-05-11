package com.kickstarter.libs.utils;

import java.util.regex.Pattern;

public final class Secrets {
  private Secrets() {}

  public static final Boolean IS_OSS = true;
  public static final String FIELD_REPORT_EMAIL = "android@kickstarter.com";

  public static final class Api {
    public static final class Client {
      public static final String LOCAL = "local";
      public static final String PRODUCTION = "production";
      public static final String STAGING = "staging";
    }

    public static final class Endpoint {
      public static final String PRODUCTION = "https://api.dev";
      public static final String STAGING = "https://api.dev";

      public static String hqHost(final String env) {
        return "https://api.dev";
      }
    }
  }

  public static final class HockeyAppId {
    public static final String EXTERNAL = "beefb0d5beefb0d5beefb0d5beefb0d5";
    public static final String INTERNAL = "beefb0d5beefb0d5beefb0d5beefb0d5";
  }

  public static final class KoalaEndpoint {
    public static final String STAGING = "https://koala.dev";
    public static final String PRODUCTION = "https://koala.dev";
  }

  public static final class RegExpPattern {
    public static final Pattern API = Pattern.compile("\\Aapi\\z");
    public static final Pattern HIVEQUEEN = Pattern.compile("\\Adev\\z");
    public static final Pattern ANDROID_PAY_1 = Pattern.compile("\\Apay\\z");
    public static final Pattern ANDROID_PAY_2 = Pattern.compile("\\Apay\\z");
    public static final Pattern STAGING = Pattern.compile("\\Astaging\\z");
  }

  public static final class WebEndpoint {
    public static final String PRODUCTION = "https://www.kickstarter.com";
    public static final String STAGING = "https://staging.com";
  }
}
