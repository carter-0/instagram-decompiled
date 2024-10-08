package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Uxo  reason: case insensitive filesystem */
public enum C16594Uxo {
    AT_SHOP_COLLECTIONS("at_shop_collections"),
    BUY_ON_IG("buy_on_ig"),
    CATEGORIES("categories"),
    CONTINUE_SHOPPING("continue_shopping"),
    COMMERCE_REWARDS("commerce_rewards"),
    CREATOR_SHOPS("creator_shops"),
    DROPS("drops"),
    GUIDES("guides"),
    HOLIDAY("holiday"),
    INTERNAL_MODULES("internal_modules"),
    ORDERS_HUB("orders_hub"),
    PROMOTIONS("promotions"),
    SALES("sales"),
    SELLER_COLLECTIONS("seller_collections"),
    SHOPPING_GUIDES("shopping_guides"),
    SUSTAINABLE("sustainable"),
    RECONSIDERATION_PRODUCTS_FOR_YOU("reconsideration_products_for_you"),
    RECONSIDERATION_PRODUCTS_FOR_YOU_IN_STORY("reconsideration_products_for_you_in_story"),
    VISIT_THESE_SHOPS_AGAIN_IN_STORY("visit_these_shops_again_in_story"),
    FIRESTARTER_BUYER_BOOTSTRAP("firestarter_buyer_bootstrap"),
    RECOMMENDATIONS_IN_EXPLORE_PRODUCTS("recommendations_in_explore_products"),
    INJECTED_FEED_UNIT_PRODUCTS("injected_feed_unit_products"),
    TRENDING("trending"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    WISH_LIST("wish_list"),
    YOUR_REVIEWS("your_reviews"),
    AFFILIATE_DISCOVERY("affiliate_discovery"),
    PRODUCT_SERP("product_serp"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16594Uxo[] uxoArr;
        A02 = 0oU.A00(uxoArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (C16594Uxo uxo : values()) {
            linkedHashMap.put(uxo.A00, uxo);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16594Uxo(String str) {
        this.A00 = str;
    }
}
