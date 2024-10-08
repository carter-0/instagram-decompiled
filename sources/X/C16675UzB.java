package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UzB  reason: case insensitive filesystem */
public enum C16675UzB {
    SAVED("saved"),
    CHECKOUT("checkout"),
    CHECKOUT_HOME_RECONSIDERATION("checkout_home_reconsideration"),
    PROFILE_SHOP("profile_shop"),
    PROFILE_SHOP_RECONSIDERATION("profile_shop_reconsideration"),
    PRODUCT_DETAILS_PAGE("product_details_page"),
    PRODUCT_COLLECTION("product_collection"),
    PRODUCT_COLLECTION_STICKER("product_collection_sticker"),
    PRODUCT_INSTANT_COLLECTION("product_instant_collection"),
    PRODUCTS_FROM_FOLLOWED_BRANDS("products_from_followed_brands"),
    PRODUCTS_FROM_SAVED_MEDIA("products_from_saved_media"),
    PRODUCTS_FROM_LIKED_MEDIA("products_from_liked_media"),
    LIKED("liked"),
    CART("bag"),
    RECENTLY_VIEWED("recently_viewed"),
    DROPS("drops"),
    INCENTIVE("incentives"),
    SHOP_HOME("shop_home"),
    SHOP_THE_LOOK("shop_the_look"),
    LIVE_VIEWER("live_viewer"),
    POST_LIVE("post_live"),
    IGTV_VIEWER("igtv_viewer"),
    DISCOUNTS("discounts"),
    STOREFRONT("storefront"),
    SHOPPABLE_MEDIA_VIEWER("shoppable_media_viewer"),
    UPCOMING_EVENT_BOTTOM_SHEET("upcoming_event_bottom_sheet"),
    UPCOMING_EVENT_PAGE("upcoming_event_page"),
    UPCOMING_EVENT_POST_LIVE("upcoming_event_post_live"),
    FEATURED_PRODUCTS("featured_products"),
    SIMILAR_PRODUCTS("similar_products");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16675UzB[] uzBArr;
        A02 = 0oU.A00(uzBArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (C16675UzB uzB : values()) {
            linkedHashMap.put(uzB.A00, uzB);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16675UzB(String str) {
        this.A00 = str;
    }
}
