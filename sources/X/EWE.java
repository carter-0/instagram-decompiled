package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EWE {
    STORE_FRONT_PRODUCT_GRID("store_front_product_grid"),
    STORE_FRONT_MENU_MANAGE_PRODUCTS("store_front_menu_manage_products"),
    STORE_FRONT_NULL_STATE_ADD_PRODUCTS("store_front_null_state_add_products"),
    STORE_FRONT_NULL_STATE_MANAGE_PRODUCTS("store_front_null_state_manage_products"),
    SELLER_JOURNEY_EMAIL_NOTIFICATION("seller_journey_email_notification"),
    SELLER_JOURNEY_PUSH_NOTIFICATION("seller_journey_push_notification"),
    SELLER_JOURNEY_ACTIVITY_FEED_NOTIFICATION("seller_journey_activity_feed_notification"),
    ONBOARDING_FLOW("onboarding_flow"),
    POST_ONBOARDING_NUX("post_onboarding_nux"),
    PRODUCT_DETAILS_PAGE("product_details_page");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWE[] eweArr;
        A02 = 0oU.A00(eweArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EWE ewe : values()) {
            A0x.put(ewe.A00, ewe);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EWE(String str) {
        this.A00 = str;
    }
}
