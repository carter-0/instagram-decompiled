package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hvb  reason: case insensitive filesystem */
public abstract class C56267Hvb {
    public static final void A00(Bitmap bitmap, C286575Wy r14, AnonymousClass5S2 r15, ImageUrl imageUrl, String str, C62320sa r18, C62320sa r19, C62320sa r20, C62320sa r21, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        AnonymousClass5S2 r9 = r15;
        C62320sa r6 = r18;
        C62320sa r4 = r19;
        C62320sa r8 = r20;
        C51974G9v.A0d(2, r15, r6, r4, r8);
        C62320sa r7 = r21;
        0qQ.A0B(r7, 7);
        C286575Wy r3 = r14;
        r14.ExV(365474314);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str2) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, imageUrl2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, r15);
        }
        Bitmap bitmap2 = bitmap;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, bitmap);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r14, r6);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r14, r4);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r14, r8);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r14, r7);
        }
        if ((4793491 & i2) != 4793490 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(803209562, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoContributionPostCaptureScreen (PotatoContributionPostCaptureScreen.kt:55)");
            }
            if (C51975G9x.A1U(r3, new C59177J9h(bitmap2, r15, imageUrl, str, r18, r8, r4, r21), 1822135624, AnonymousClass5aQ.A00(r14).A0c)) {
                0fL.A00(398290102);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBI(r4, imageUrl2, r6, r7, r8, r9, bitmap2, str2, i3, 1);
        }
    }

    public static final void A01(C289525dk r21, C286575Wy r22, ImageUrl imageUrl, C62320sa r24, C62320sa r25, int i) {
        int i2;
        C286575Wy r1 = r22;
        r1.ExV(1341015850);
        int i3 = i;
        C289525dk r11 = r21;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r1, r11) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r1, imageUrl2);
        }
        C62320sa r26 = r24;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r1, r26);
        }
        C62320sa r12 = r25;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r1, r12);
        }
        if ((i2 & 1171) != 1170 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-346569542, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.CaptureButtons (PotatoContributionPostCaptureScreen.kt:117)");
            }
            C285245Qk r9 = Modifier.A00;
            Alignment alignment = C287215Zl.A07;
            Modifier A07 = C287195Zj.A07(r11.AAz(alignment, r11.AAz(alignment, r9)), 20.0f);
            long A09 = C51965G9l.A09(r1);
            AnonymousClass5aQ.A02(r1);
            AnonymousClass5ZQ r6 = AnonymousClass5ZM.A02;
            Modifier A01 = C304766Fd.A01(A07, r6, A09);
            float f = 12.0f;
            if (imageUrl != null) {
                f = 8.0f;
            }
            Modifier A072 = C287195Zj.A07(A01, f);
            Object A0m = C51967G9n.A0m(r1, -1601858849);
            Object obj = AnonymousClass5XT.A00;
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            Modifier A0B = G9w.A0B((C287605aT) C51972G9s.A0l(r1, A0m, obj), A072, r26);
            AnonymousClass5RD A0L = C51975G9x.A0L(r1);
            int A00 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r1, A0B);
            C51973G9u.A0y(r1, A0H);
            C51971G9r.A12(r1, A0L, A04);
            0sL r3 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r1, A00)) {
                C51971G9r.A13(r1, r3, A00);
            }
            C51965G9l.A18(r1, A012);
            r1.ExS(1397136500);
            if (imageUrl != null) {
                GRY.A03(r1, C51966G9m.A0o(r1, imageUrl2, i2 >> 3), C57115IPe.A00);
                C51967G9n.A13(r1, r9, 6.0f);
            }
            C286565Wx.A0L(A0H, false);
            String A002 = C288035bG.A00(r1, 2131952258);
            long A013 = AnonymousClass5Z7.A01(17);
            C286575Wy r18 = r1;
            AnonymousClass5ZZ.A0p(r18, C51965G9l.A0S(r1), A002, 16370, AnonymousClass5aQ.A00(r1).A14, A013);
            r1.ASN();
            Modifier A073 = C287195Zj.A07(r11.AAz(C287215Zl.A08, r9), 20.0f);
            long j = AnonymousClass5aQ.A00(r1).A0r;
            AnonymousClass5aQ.A02(r1);
            Modifier A0G = G9w.A0G(C304766Fd.A01(A073, r6, j));
            C286565Wx.A0L(A0H, false);
            Modifier A0B2 = G9w.A0B((C287605aT) C51974G9v.A0W(r1, obj, -1601826017), A0G, r12);
            String A003 = C288035bG.A00(r1, 2131969704);
            long A014 = AnonymousClass5Z7.A01(17);
            C286575Wy r13 = r1;
            AnonymousClass5ZZ.A0K(r13, A0B2, C51965G9l.A0S(r1), A003, 3072, 16368, G9w.A05(r1), A014);
            if (0fL.A02()) {
                0fL.A00(-1439361935);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(r11, imageUrl2, r26, r12, i3, 5);
        }
    }
}
