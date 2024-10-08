package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public abstract class FCG {
    public static final C50332FYn A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C50332FYn) userSession.A01(C50332FYn.class, new C51793G2c(userSession, 34));
    }

    public static final String A01(UserMonetizationProductType userMonetizationProductType) {
        switch (DbU.A02(userMonetizationProductType, 0)) {
            case 1:
                return "affiliate";
            case 2:
            case 15:
                return "live";
            case 3:
                return "branded_content";
            case 4:
                return "branded_content_deal_brand";
            case 5:
                return "branded_content_deal_creator";
            case 7:
                return AnonymousClass000.A00(1217);
            case 9:
                return "subscriptions";
            case 10:
                return "igtv";
            case 11:
                return "incentive_platform";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "incentive_platform_speaker_engagement";
            case 13:
                return "reels_overlay_revshare";
            default:
                return "unknown";
        }
    }

    public static final String A02(UserMonetizationProductType userMonetizationProductType) {
        switch (DbU.A02(userMonetizationProductType, 0)) {
            case 1:
                return "affiliate";
            case 2:
                return "badges_incentives";
            case 3:
            case 4:
            case 5:
                return "branded_content";
            case 7:
                return AnonymousClass000.A00(1217);
            case 9:
                return "subscriptions";
            case 10:
                return "revshare";
            case 11:
                return "incentive_platform";
            case 13:
                return "reels_overlay_ads";
            case 15:
                return "badges";
            default:
                return "unknown";
        }
    }
}
