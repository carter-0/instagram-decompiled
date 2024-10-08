package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6w2  reason: invalid class name and case insensitive filesystem */
public enum C322566w2 {
    ITEM_TYPE_HEADER_REQUEST_BANNER(0),
    ITEM_TYPE_USER_INFO(1),
    ITEM_TYPE_USER_INFO_WITH_COBROADCAST(2),
    ITEM_TYPE_ACTION_BUTTONS(3),
    ITEM_TYPE_SHOP_ROW(4),
    ITEM_TYPE_REEL_TRAY(5),
    ITEM_TYPE_EMPTY_PROFILE_NOTICE(7),
    ITEM_TYPE_STANDALONE_USER_CHAINING(8),
    ITEM_TYPE_DIVIDER(9),
    ITEM_TYPE_USER_INFO_NOT_FOUND(10),
    ITEM_TYPE_BUSINESS_ONBOARDING_CHECKLIST(11),
    ITEM_TYPE_USER_PAY_FANCLUB_UPSELL(12),
    ITEM_TYPE_PRODASH_HYPERCARD(13),
    ITEM_TYPE_FAN_CLUB_GUIDED_ACTIVATION_BANNER(14),
    ITEM_TYPE_RECS_FROM_FRIENDS_BANNER(15),
    ITEM_TYPE_PUBLIC_HIGHLIGHTS_EMPTY_PROFILE_NOTICE(16),
    ITEM_TYPE_PROFILE_EMPTY_NOTICE_WITH_USER_ACTION(17),
    ITEM_TYPE_HEADER_LIMITS_OFF_BANNER(18);
    
    public static final Map A01 = null;
    public static final C322566w2[] A02 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C322566w2[] r0;
        A03 = 0oU.A00(r0);
        C322566w2[] values = values();
        A02 = values;
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C322566w2 r1 : values) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C322566w2(int i) {
        this.A00 = i;
    }
}
