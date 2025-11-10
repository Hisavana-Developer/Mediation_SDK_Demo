package com.mediation.ssp.util;

import android.util.Log;

import com.cloud.hisavana.sdk.config.AdxServerConfig;

public class DemoConstants {

    public static final String LOG_TAG = "Hisavina";
    public static final String APP_ID = "211227vpZInkdX";
    public static final String SLOT_ID_BANNER = "220927LcY0xn9b";
    public static final String SLOT_ID_SPLASH = "2209270yYwZgEQ";
    public static final String SLOT_ID_NATIVE = "220927r5cPdpZ5";
    public static final String SLOT_ID_INTERSTITIAL = "220927IZEqXT9M";
    public static final String SLOT_ID_VIDEO = "2209270m7IgWJU";
    public static final String SLOT_ID_HOT_APP = "220927b5RqdzC4";
   // public static final boolean IS_DEBUG = Log.isLoggable("is_debug", Log.DEBUG);
    public static final boolean IS_DEBUG =  true;

    public static final boolean TEST_DEVICE = Log.isLoggable("test_device", Log.DEBUG);

    public static final String TEST_APP_ID = "testsid880";
    public static final String TEST_SLOT_ID_BANNER = "banner_1";
    public static final String TEST_SLOT_ID_SPLASH = "splash_1";
    public static final String TEST_SLOT_ID_NATIVE = "native_1";
    public static final String TEST_SLOT_ID_INTERSTITIAL= "interstitial_1";
    public static final String TEST_SLOT_ID_VIDEO = "video_1";
    public static final String TEST_SLOT_ID_ICON = "icon_app";

    public static String getAppId() {
        // 广告SDK 环境设置
        AdxServerConfig.setAppModle(IS_DEBUG ? AdxServerConfig.TEST : AdxServerConfig.RELEASE);
        return IS_DEBUG ? TEST_APP_ID : APP_ID;
    }

    public static String getBannerSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_BANNER : SLOT_ID_BANNER;
    }

    public static String getSplashSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_SPLASH : SLOT_ID_SPLASH;
    }

    public static String getNativeSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_NATIVE : SLOT_ID_NATIVE;
    }

    public static String getInterstitialSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_INTERSTITIAL : SLOT_ID_INTERSTITIAL;
    }

    public static String getRewardedSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_VIDEO : SLOT_ID_VIDEO;
    }

    public static String getIconSlotId() {
        return IS_DEBUG ? TEST_SLOT_ID_ICON : SLOT_ID_HOT_APP;
    }

    public static final String USER_AGREE_PRIVACY = "user_agree_privacy";

}
