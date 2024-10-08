package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HYq  reason: case insensitive filesystem */
public abstract class C54934HYq {
    public static final void A00(C286575Wy r22, Modifier modifier, String str, String str2, 0sP r26, int i, int i2) {
        int i3;
        0sP r11 = r26;
        String str3 = str2;
        Modifier modifier2 = modifier;
        String str4 = str;
        0qQ.A0B(str4, 0);
        C286575Wy r0 = r22;
        r0.ExV(1506058392);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r0, str4) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r0, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r0, str3);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0H(r0, r11);
        }
        if ((i3 & 5851) != 1170 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                str3 = null;
            }
            if (i8 != 0) {
                r11 = null;
            }
            if (0fL.A02()) {
                0fL.A01(886898853, "com.instagram.creator.achievements.modules.views.CreatorTip (CreatorTip.kt:27)");
            }
            C287245Zp r6 = C287215Zl.A04;
            boolean z = true;
            boolean A1V = AnonymousClass7TF.A1V(str3);
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1P = C51973G9u.A1P(r0, -1162078676, i3);
            if ((i3 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object ECw = r0.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0y(r0, r11, str3, 30);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            Modifier A03 = C287195Zj.A03(C51969G9p.A0X(C287635aW.A05(modifier2, A0R, (String) null, (C62320sa) ECw, A1V), 8.0f, C51966G9m.A0C(r0)));
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r0, r6);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A03);
            C51973G9u.A0y(r0, A0H);
            C51971G9r.A12(r0, A0Q, A04);
            0sL r4 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r4, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r5 = AnonymousClass6FX.A00;
            C285245Qk r42 = Modifier.A00;
            C286575Wy r17 = r0;
            C288165bT.A07(r17, C287195Zj.A0B(r5.AB1(r6, r42), 0.0f, 0.0f, 16.0f, 0.0f), C287975bA.A00(r0, R.drawable.instagram_bulb_pano_outline_24, 0), "", 56, AnonymousClass5aQ.A00(r0).A0O);
            AnonymousClass5ZZ.A0M(r0, r5.A00(r42), C51966G9m.A0b(r0), str4, i3 & 14, C51966G9m.A0H(r0));
            r0.ExS(-106145238);
            if (str3 != null) {
                C288165bT.A07(r17, C287195Zj.A0B(r5.AB1(r6, r42), 16.0f, 0.0f, 0.0f, 0.0f), C287975bA.A00(r0, R.drawable.instagram_chevron_right_pano_filled_12, 0), "", 56, C51966G9m.A0L(r0));
            }
            if (C51971G9r.A1S(r0, A0H, false)) {
                0fL.A00(301069120);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(r11, modifier2, str4, str3, i5, i4, 5);
        }
    }
}
