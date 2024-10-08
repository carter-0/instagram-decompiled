package X;

import java.util.HashSet;

public final class LGV {
    public String A00;
    public final 0wc A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();

    public final void A00(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, boolean z) {
        String str6;
        String str7;
        String str8;
        String str9;
        AnonymousClass7TF.A1E(str, 0, num2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, C273654mx.A00(1514));
        if (A0e.isSampled()) {
            0bb r4 = new 0bb();
            r4.A05(AnonymousClass000.A00(193), Long.valueOf(DbY.A04(00y.A0n(10, str2))));
            if (num2.intValue() != 0) {
                str6 = "static";
            } else {
                str6 = "animated_sticker";
            }
            r4.A06("sticker_type", str6);
            r4.A05("sticker_rank", DbS.A0j(i3));
            r4.A05("sticker_page_index", DbS.A0j(i4));
            JTS.A1D(r4, i, i2);
            int intValue = num3.intValue();
            if (intValue == 0) {
                str7 = "message_thread";
            } else if (intValue != 1) {
                str7 = "quick_reaction";
            } else {
                str7 = "story";
            }
            r4.A06("referrer_surface", str7);
            if (num4.intValue() != 0) {
                str8 = "story";
            } else {
                str8 = "message_thread";
            }
            r4.A06(C273654mx.A00(3367), str8);
            r4.A05(C273654mx.A00(3366), Long.valueOf(JTR.A0M(str3)));
            r4.A03("is_social_sticker", Boolean.valueOf(z));
            r4.A06("search_query", str4);
            r4.A06(C273654mx.A00(95), str5);
            if (00y.A0n(10, str3) == null) {
                r4.A06("sticker_usage_id_extra", str3);
            }
            JTR.A1I(A0e, r4, str);
            if (num.intValue() != 0) {
                str9 = "search";
            } else {
                str9 = "ranking";
            }
            JTQ.A15(A0e, str9);
        }
    }

    public final void A01(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, boolean z) {
        String str5;
        String str6;
        String str7;
        DbW.A1N(str, 0, num2);
        HashSet hashSet = this.A02;
        if (!hashSet.contains(str2)) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A01, C273654mx.A00(1512));
            if (A0e.isSampled()) {
                hashSet.add(str2);
                0bb r4 = new 0bb();
                r4.A05(AnonymousClass000.A00(193), Long.valueOf(DbZ.A07(str2)));
                JTS.A1D(r4, i, i2);
                if (num2.intValue() != 0) {
                    str5 = "static";
                } else {
                    str5 = "animated_sticker";
                }
                r4.A06("sticker_type", str5);
                r4.A05("sticker_rank", DbS.A0j(i3));
                r4.A05("sticker_page_index", DbS.A0j(i4));
                r4.A05("result_size", DbS.A0j(i5));
                int intValue = num3.intValue();
                if (intValue == 0) {
                    str6 = "message_thread";
                } else if (intValue != 1) {
                    str6 = "quick_reaction";
                } else {
                    str6 = "story";
                }
                r4.A06("referrer_surface", str6);
                r4.A03("is_social_sticker", Boolean.valueOf(z));
                r4.A06("search_query", str3);
                r4.A06(C273654mx.A00(95), str4);
                JTR.A1I(A0e, r4, str);
                if (num.intValue() != 0) {
                    str7 = "search";
                } else {
                    str7 = "ranking";
                }
                JTQ.A15(A0e, str7);
            }
        }
    }

    public final void A02(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        0qQ.A0B(str, 0);
        if (!0qQ.A0K(this.A00, str)) {
            this.A00 = str;
            this.A02.clear();
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, C273654mx.A00(1513));
        0bb r2 = new 0bb();
        int intValue = num.intValue();
        if (intValue == 0) {
            str2 = "message_thread";
        } else if (intValue != 1) {
            str2 = "quick_reaction";
        } else {
            str2 = "story";
        }
        r2.A06("referrer_surface", str2);
        if (num2.intValue() != 0) {
            str3 = "message_reply";
        } else {
            str3 = "story_composer";
        }
        r2.A06(AnonymousClass000.A00(1906), str3);
        if (A0e.isSampled()) {
            JTR.A1I(A0e, r2, str);
            JTQ.A15(A0e, "navigation");
        }
    }

    public final void A03(String str, String str2) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "avatar_stickers_measurement_avatar_sticker_tray_exit");
        0bb r1 = new 0bb();
        r1.A06("search_query", str2);
        if (A0e.isSampled()) {
            JTR.A1I(A0e, r1, str);
            JTQ.A15(A0e, "navigation");
        }
    }

    public final void A04(String str, String str2, String str3, int i) {
        0qQ.A0B(str3, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "avatar_stickers_measurement_avatar_sticker_tray_search");
        0bb r2 = new 0bb();
        r2.A06("search_query", str2);
        r2.A06("search_locale", str3);
        r2.A05("result_size", DbS.A0j(i));
        if (A0e.isSampled()) {
            JTR.A1I(A0e, r2, str);
            JTQ.A15(A0e, "search");
        }
    }

    public LGV(0wc r2) {
        this.A01 = r2;
    }
}
