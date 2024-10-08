package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.TxW  reason: case insensitive filesystem */
public abstract class C14510TxW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ad4ad_in_story";
            case 2:
                return "suggested_users_in_story";
            case 3:
                return "story_survey";
            case 4:
                return "story_creation_upsell";
            case 5:
                return AnonymousClass000.A00(4070);
            case 6:
                return "reconsideration_products_for_you_in_story";
            case 7:
                return "continue_shopping_in_story";
            case 8:
                return "visit_these_shops_again_in_story";
            case 9:
                return "ig_ads_consent_growth_story_netego";
            case 10:
                return "bloks_netego_in_story";
            case 11:
                return AnonymousClass000.A00(382);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "ig_insights_story_netego";
            case 13:
                return C273654mx.A00(3319);
            case 14:
                return C273654mx.A00(3030);
            case 15:
                return AnonymousClass000.A00(4108);
            default:
                return "ads_bakeoff_survey_in_story";
        }
    }
}
