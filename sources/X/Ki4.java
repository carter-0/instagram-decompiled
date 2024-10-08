package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Ki4 {
    MULTI_USER_JOINED("multi_user_joined"),
    SINGLE_USER_LEFT("single_user_left"),
    SOCIAL_CONTEXT("social_context"),
    USER_PAY_INCENTIVES("user_pay_incentives"),
    USER_PAY_RECOGNITION("user_pay_recognition"),
    SHOPPING_SOCIAL_CONTEXT("shopping_social_context"),
    SHOPPING_BRAND_INSIGHTS("shopping_brand_insights"),
    NOTIFICATION_UPSELL("notification_upsell"),
    FOLLOW_UPSELL("follow_upsell"),
    USER_FOLLOWED("user_followed"),
    VIEWER_LIST_DISCLAIMER("viewer_list_disclaimer"),
    LIVE_MODERATOR_UPSELL("live_moderator_upsell"),
    SHOPPING_SOCIAL_CONTEXT_DISCLAIMER("shopping_social_context_disclaimer"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        Ki4[] ki4Arr;
        A02 = 0oU.A00(ki4Arr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (Ki4 ki4 : values()) {
            A0x.put(ki4.A00, ki4);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    Ki4(String str) {
        this.A00 = str;
    }
}
