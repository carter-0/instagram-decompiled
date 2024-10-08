package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;

/* renamed from: X.HXo  reason: case insensitive filesystem */
public abstract class C54906HXo {
    public static final void A00(Bitmap bitmap, C286575Wy r17, AnonymousClass5S2 r18, C62320sa r19, float f, int i, int i2) {
        int i3;
        float f2 = f;
        AnonymousClass5S2 r4 = r18;
        C62320sa r3 = r19;
        AnonymousClass7TF.A1C(r4, 1, r3);
        C286575Wy r12 = r17;
        r12.ExV(64533065);
        int i4 = i2;
        Bitmap bitmap2 = bitmap;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r12, bitmap2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, r4);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A01(r12, f2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r3);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i6 != 0) {
                f2 = 1.0f;
            }
            if (0fL.A02()) {
                0fL.A01(1973474724, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCaptureImage (PotatoCaptureImage.kt:37)");
            }
            if (bitmap != null) {
                C285245Qk r9 = Modifier.A00;
                Modifier A00 = HRI.A00(C51966G9m.A0T(r9), f2, f2);
                AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A06, false);
                int A003 = C287425a7.A00(r12);
                C286565Wx r11 = (C286565Wx) r12;
                AnonymousClass5RM A04 = C286565Wx.A04(r11);
                Modifier A01 = C287435a8.A01(r12, A00);
                C51973G9u.A0y(r12, r11);
                C51971G9r.A12(r12, A002, A04);
                0sL r6 = C287485aD.A02;
                if (r11.A0K || !C51972G9s.A1Q(r12, A003)) {
                    C51971G9r.A13(r12, r6, A003);
                }
                C51965G9l.A18(r12, A01);
                AnonymousClass6G3.A01(r12, C287635aW.A05(AnonymousClass6FZ.A01(C287205Zk.A0C(r9, 280.0f), r4), (C287625aV) null, (String) null, r3, true), (C288195bW) null, new C3018360g(bitmap2), C288075bK.A00, C288035bG.A00(r12, 2131969703), 24576, 232);
                r12.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(291345080);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9B(bitmap2, r4, r3, f2, i5, i4, 2);
        }
    }
}
