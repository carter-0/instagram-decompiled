package X;

/* renamed from: X.GQr  reason: case insensitive filesystem */
public abstract class C52392GQr {
    public static final void A00(C286575Wy r14, AnonymousClass62P r15, float f, float f2, float f3, float f4, int i, int i2) {
        int i3;
        C267314bM r4;
        Object AJO;
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        AnonymousClass62P r8 = r15;
        0qQ.A0B(r15, 0);
        C286575Wy r2 = r14;
        r14.ExV(355777594);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r2, r15) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A00(r2, f8);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A01(r2, f7);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A02(r2, f6);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A03(r2, f5);
        }
        if ((i3 & 9363) != 9362 || !r2.Bwn()) {
            if (i6 != 0) {
                f8 = 18.0f;
            }
            if (i7 != 0) {
                f7 = 0.4f;
            }
            if (i8 != 0) {
                f6 = 1.0f;
            }
            if (i9 != 0) {
                f5 = 2.0f;
            }
            if (0fL.A02()) {
                0fL.A01(-1332381180, "com.instagram.compose.ui.facepile.FacePile (FacePile.kt:53)");
            }
            float abs = Math.abs(f7) * f8;
            float f9 = f8 * f7;
            float f10 = (1.0f - f6) * f8;
            if (0fL.A02()) {
                0fL.A01(82660491, "com.instagram.compose.ui.facepile.getLayoutDirection (FacePile.kt:89)");
            }
            if (f7 < 0.0f) {
                r2.ExS(-442448242);
                r4 = AnonymousClass5YA.A07;
                Object AJO2 = r2.AJO(r4);
                AJO = AnonymousClass5Q8.Ltr;
                if (AJO2 == AJO) {
                    AJO = AnonymousClass5Q8.Rtl;
                }
            } else {
                r2.ExS(-442307533);
                r4 = AnonymousClass5YA.A07;
                AJO = r2.AJO(r4);
            }
            if (C51970G9q.A1a(r2, false)) {
                0fL.A00(411456574);
            }
            C51971G9r.A11(r2, r4.A02(AJO), new C52393GQs(r8, abs, f10, f8, f9, f5), -712986758);
            if (0fL.A02()) {
                0fL.A00(186411408);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59161J8r(r8, f8, f7, f6, f5, i5, i4);
        }
    }
}
