package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8qB  reason: invalid class name and case insensitive filesystem */
public enum C367098qB {
    POST_PRODUCT_TAG("post_product_tag"),
    POST_PRODUCT_COLLECTION_TAG("post_product_collection_tag"),
    POST_DISCOUNT_TAG("post_discount_tag"),
    STORY_PRODUCT_STICKER("story_product_sticker"),
    STORY_MULTI_PRODUCT_STICKER("story_multi_product_sticker"),
    STORY_PRODUCT_COLLECTION_STICKER("story_seller_collection_sticker"),
    STORY_STOREFRONT_STICKER("story_storefront_sticker"),
    STORY_PRODUCT_SWIPEUP("story_product_swipeup"),
    STORY_MULTI_PRODUCT_SWIPEUP("story_multi_product_swipeup"),
    STORY_SHOP_SWIPEUP("story_shop_swipeup"),
    STORY_COLLECTION_SWIPEUP("story_collection_swipeup"),
    STORY_INCENTIVE_SWIPEUP("story_incentive_swipeup"),
    STORY_ORGANIC_PRODUCT_TAGGING_STICKER("story_opt_sticker"),
    POST_OPT_TAG("post_opt_tag"),
    CLIPS_OPT_TAG("clips_opt_tag");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C367098qB[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C367098qB r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C367098qB(String str) {
        this.A00 = str;
    }
}
