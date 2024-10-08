package X;

import android.graphics.Bitmap;

/* renamed from: X.HXp  reason: case insensitive filesystem */
public abstract class C54907HXp {
    public static final void A00(Bitmap bitmap, C286575Wy r17, AnonymousClass5S2 r18, C62320sa r19, C62320sa r20, C62320sa r21, C62320sa r22, 0sP r23, float f, int i, int i2) {
        int i3;
        AnonymousClass5S2 r8 = r18;
        C62320sa r10 = r19;
        C62320sa r11 = r20;
        0sP r12 = r23;
        C51974G9v.A0d(1, r8, r10, r11, r12);
        C62320sa r13 = r21;
        C62320sa r14 = r22;
        AnonymousClass7TF.A1F(r13, 7, r14);
        C286575Wy r3 = r17;
        r3.ExV(716975629);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r3, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r3, r8);
        }
        float f2 = f;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A01(r3, f2);
        }
        Bitmap bitmap2 = bitmap;
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r3, bitmap2);
        }
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A0I(r3, r10);
        }
        if ((196608 & i2) == 0) {
            i3 |= G9t.A0J(r3, r11);
        }
        if ((1572864 & i2) == 0) {
            i3 |= G9t.A0K(r3, r12);
        }
        if ((12582912 & i2) == 0) {
            i3 |= G9t.A0L(r3, r13);
        }
        if ((100663296 & i2) == 0) {
            i3 |= G9t.A0M(r3, r14);
        }
        if ((38347923 & i3) != 38347922 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1475937349, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCreationPostCaptureScreen (PotatoCreationPostCaptureScreen.kt:49)");
            }
            int A04 = DbS.A04(0Tu.A05, C51969G9p.A0j(r3), 36605705616364847L);
            if (C51975G9x.A1U(r3, new C59231JBj(r8, bitmap2, r10, r11, r12, r13, r14, f2, A04, i5, 0), -158441397, AnonymousClass5aQ.A00(r3).A0c)) {
                0fL.A00(1774929821);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59231JBj(r8, bitmap2, r10, r11, r12, r13, r14, f2, i5, i4, 1);
        }
    }
}
