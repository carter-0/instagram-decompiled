package X;

/* renamed from: X.LBr  reason: case insensitive filesystem */
public final class C63908LBr {
    public final 0wc A00;

    public final void A00(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "avatar_stickers_measurement_global_sticker_tray_launch");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            if (num.intValue() != 0) {
                str2 = "story";
            } else {
                str2 = "message_thread";
            }
            r2.A06("referrer_surface", str2);
            if (num2.intValue() != 0) {
                str3 = "message_reply";
            } else {
                str3 = "story_composer";
            }
            r2.A06(AnonymousClass000.A00(1906), str3);
            r2.A03("from_avatar_tab", false);
            JTR.A1I(A0e, r2, str);
            JTQ.A15(A0e, "navigation");
        }
    }

    public C63908LBr(0wc r1) {
        this.A00 = r1;
    }
}
