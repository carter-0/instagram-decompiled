package X;

import android.util.SparseArray;

/* renamed from: X.47L  reason: invalid class name */
public enum AnonymousClass47L {
    AD_DESTINATION_WEB(1),
    AD_DESTINATION_APP_STORE(2),
    AD_DESTINATION_DEEPLINK(3),
    AD_DESTINATION_PHONE(4),
    AD_DESTINATION_MAP(5),
    AD_DESTINATION_CANVAS(6),
    AD_DESTINATION_LEAD_AD(7),
    AD_DESTINATION_PROFILE_VISIT(8),
    AD_DESTINATION_DIRECT_MESSAGE(10),
    IG_DESTINATION_SHOPPING_SHEET(12),
    IG_DESTINATION_MINI_SHOP_STOREFRONT(13),
    AD_DESTINATION_SHOPPING_PDP(14),
    IG_DESTINATION_MINI_SHOP_COLLECTION(17),
    IG_DESTINATION_BLOKS(20),
    IGTV_CHANNEL_DESTINATION(21),
    IGTV_VIDEO_DESTINATION(22),
    AD_DESTINATION_CLIPS_VIEWER(23),
    AD_DESTINATION_AUDIO_PAGE(24),
    AD_DESTINATION_CLIPS_PROFILE(25),
    AD_DESTINATION_AR_CAMERA(26),
    AD_DESTINATION_ORGANIC_COLLECTION(32),
    AD_DESTINATION_JOIN_CHANNEL(33);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (AnonymousClass47L r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass47L(int i) {
        this.A00 = i;
    }
}
