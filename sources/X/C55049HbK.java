package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.HbK  reason: case insensitive filesystem */
public abstract class C55049HbK {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FEED_NETEGO";
                break;
            case 2:
                str = "FEED_ENGAGEMENT_UNIT";
                break;
            case 3:
                str = "FEED_ENGAGEMENT_UNIT_ITEM";
                break;
            case 4:
                str = "FEED_VIDEO";
                break;
            case 5:
                str = "FEED_COMMENT";
                break;
            case 6:
                str = "FEED_HSCROLL_AD";
                break;
            case 7:
                str = "FEED_MULTI_ADS";
                break;
            case 8:
                str = "SEARCH_FEED";
                break;
            case 9:
                str = "AD_STORY";
                break;
            case 10:
                str = "STORY";
                break;
            case 11:
                str = "STORY_ADS";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "STORY_COMMENT";
                break;
            case 13:
                str = "STORY_NETEGO";
                break;
            case 14:
                str = "EXPLORE";
                break;
            case 15:
                str = "EXPLORE_GRID";
                break;
            case 16:
                str = "SEARCH_GRID";
                break;
            case 17:
                str = "REELS_ADS";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = "REELS_NETEGO";
                break;
            case 19:
                str = "REELS_MULTI_ADS";
                break;
            case 20:
                str = "UPDATES_HUB";
                break;
            case 21:
                str = "BCN_TEXT_FEED";
                break;
            default:
                str = "FEED";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
