package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ki5  reason: case insensitive filesystem */
public enum C62572Ki5 {
    HERO("hero"),
    AUTOPLAY("autoplay"),
    AUTOPLAY_FULLSCREEN("autoplay_fullscreen"),
    COLLECTION_TILE("collection_tile"),
    THUMBNAIL("thumbnail"),
    GRID("grid"),
    HSCROLL_XSMALL("hscroll_xsmall"),
    HSCROLL_SMALL("hscroll_small"),
    HSCROLL_LARGE("hscroll_large"),
    HSCROLL_USER("hscroll_user"),
    HSCROLL_XSMALL_LIVE("hscroll_xsmall_live"),
    CREATOR_BAR("creator_bar"),
    HEADER("header"),
    SPINNER("spinner"),
    FETCH_RETRY("fetch_retry"),
    SEARCH("search"),
    PENDING_MEDIA("pending_media"),
    QP_MEGAPHONE("qp_megaphone"),
    APP_UPSELL("upsell"),
    UNRECOGNIZED("unrecognized");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62572Ki5[] ki5Arr;
        A02 = 0oU.A00(ki5Arr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (C62572Ki5 ki5 : values()) {
            A0x.put(ki5.A00, ki5);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62572Ki5(String str) {
        this.A00 = str;
    }
}
