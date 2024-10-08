package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HYf  reason: case insensitive filesystem */
public abstract class C54923HYf {
    public static final void A00(C286575Wy r19, C60934Jts jts, C62320sa r21, int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2 = z;
        C286575Wy r12 = r19;
        r12.ExV(1592975817);
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = G9t.A05(r12, i6) | i2;
        } else {
            i4 = i7;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= G9t.A0Z(r12, z2);
        }
        C62320sa r3 = r21;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i7 & 896) == 0) {
            i4 |= G9t.A0G(r12, r3);
        }
        C60934Jts jts2 = jts;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i7 & 7168) == 0) {
            i4 |= G9t.A0R(r12, jts2);
        }
        if ((i4 & 5851) != 1170 || !r12.Bwn()) {
            boolean z3 = true;
            z2 = C51966G9m.A1R(i8, z2);
            if (0fL.A02()) {
                0fL.A01(-124823558, "com.instagram.creation.genai.themes.ui.AnimatedNullStateImage (AnimatedNullStateImage.kt:30)");
            }
            AnonymousClass2DO A0Y = C51966G9m.A0Y(r12, i4, i6);
            Modifier A02 = C287195Zj.A02(Modifier.A00);
            boolean A1P = C51973G9u.A1P(r12, 520297715, i4);
            Object ECw = r12.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r12, r3, 48);
            }
            C286565Wx A0G = C51965G9l.A0G(r12);
            Modifier A0G2 = C287205Zk.A0G(C288235ba.A01(r12, A02, (C287625aV) null, (String) null, (C62320sa) ECw, 6, z2), 104.0f, 180.0f);
            r12.ExS(520300866);
            if ((i4 & 7168) != 2048) {
                z3 = false;
            }
            Object ECw2 = r12.ECw();
            if (z3 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MP4(jts2, 34);
                r12.FLL(ECw2);
            }
            C286565Wx.A0I(A0G);
            Modifier A0X = C51970G9q.A0X(A0G2, (0sP) ECw2);
            float f = (float) jts2.A03;
            C286575Wy r20 = r12;
            AnonymousClass6G3.A0A(r20, HRG.A00(A0X, C55299HfS.A00, f, f), A0Y, C288075bK.A00, C288035bG.A00(r12, 2131961784), 24584);
            if (0fL.A02()) {
                0fL.A00(212658990);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8A(jts2, r3, i6, i7, i5, z2);
        }
    }
}
