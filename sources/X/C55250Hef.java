package X;

/* renamed from: X.Hef  reason: case insensitive filesystem */
public abstract class C55250Hef {
    public static final void A00(C286575Wy r9, C53371Gmv gmv, C62320sa r11, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C53371Gmv gmv2 = gmv;
        C62320sa r4 = r11;
        boolean A1Z = AnonymousClass7TG.A1Z(gmv, r11);
        r9.ExV(-1626869895);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r9, gmv) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r11);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1999410267, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetHeader (ClipsSpinsReplyBottomSheetHeader.kt:28)");
            }
            String str = gmv.A03;
            if (str == null) {
                if (0fL.A02()) {
                    0fL.A00(-814525572);
                }
                ASQ = r9.ASQ();
                if (ASQ != null) {
                    i3 = 36;
                } else {
                    return;
                }
            } else {
                String str2 = gmv.A02;
                if (str2 == null) {
                    if (0fL.A02()) {
                        0fL.A00(71392268);
                    }
                    ASQ = r9.ASQ();
                    if (ASQ != null) {
                        i3 = 35;
                    } else {
                        return;
                    }
                } else {
                    if (C51972G9s.A1U(r9, C51967G9n.A0C(C51969G9p.A0U(), 12.0f), new C59148J8e(gmv2, r4, str2, str, gmv.A04, A1Z ? 1 : 0), -2063481545)) {
                        0fL.A00(-1328917735);
                    }
                }
            }
            JGM.A01(ASQ, gmv, r11, i, i3);
        }
        r9.Evl();
        ASQ = r9.ASQ();
        if (ASQ != null) {
            i3 = 34;
            JGM.A01(ASQ, gmv, r11, i, i3);
        }
    }
}
