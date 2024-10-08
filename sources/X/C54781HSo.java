package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HSo  reason: case insensitive filesystem */
public abstract class C54781HSo {
    public static final void A00(C286575Wy r29, C66378MPk mPk, String str, C62320sa r32, 0sP r33, int i, int i2) {
        int i3;
        C66378MPk mPk2 = mPk;
        0qQ.A0B(mPk2, 0);
        String str2 = str;
        C62320sa r27 = r32;
        0sP r26 = r33;
        C51974G9v.A1M(str2, r26, r27);
        C286575Wy r3 = r29;
        r3.ExV(-766917981);
        int i4 = i2;
        if ((i2 & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r3, mPk2, i4) ? 1 : 0) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r3, i5);
        }
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r3, str2);
        }
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r3, r26);
        }
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A0I(r3, r27);
        }
        if ((i3 & 9363) != 9362 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-38944468, "com.instagram.aistudio.editor.AiEditProfilePictureScreen (AiEditProfilePictureScreen.kt:33)");
            }
            C56838IEj A00 = I28.A00(r3);
            C285245Qk r11 = Modifier.A00;
            if (0fL.A02()) {
                0fL.A01(-1744703664, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
            }
            IF1 if1 = I4O.A0N.A00(r3).A09;
            if (0fL.A02()) {
                0fL.A00(2016669136);
            }
            0sP r6 = C287655aY.A00;
            Modifier A01 = I28.A01(A00, JJP.A00(C51966G9m.A0V(C287435a8.A02(r11, r6, JJQ.A00(if1, 6))), r6, 0));
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r3, C287215Zl.A00);
            int A002 = C287425a7.A00(r3);
            C286565Wx r62 = (C286565Wx) r3;
            AnonymousClass5RM A04 = C286565Wx.A04(r62);
            Modifier A012 = C287435a8.A01(r3, A01);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r3, r62, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r3, A0Z, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r62.A0K || !C51972G9s.A1Q(r3, A002)) {
                C51971G9r.A13(r3, r12, A002);
            }
            0sL A1K = C51966G9m.A1K(r3, A012);
            AnonymousClass5RD A003 = C287395a4.A00(C287275Zs.A02, r3, C287215Zl.A05);
            int A004 = C287425a7.A00(r3);
            AnonymousClass5RM A042 = C286565Wx.A04(r62);
            Modifier A013 = C287435a8.A01(r3, r11);
            C51973G9u.A0z(r3, r62, r14);
            C287595aO.A00(r3, A003, r13);
            if (C51965G9l.A1Y(r3, r62, A042, A0w) || !C51972G9s.A1Q(r3, A004)) {
                C51971G9r.A13(r3, r12, A004);
            }
            C287595aO.A00(r3, A013, A1K);
            C54783HSq.A00(r3, mPk2, (String) null, (C62320sa) null, (C62320sa) null, 280, (i3 & 14) | 12586032, 116, false, false, false);
            r3.ASN();
            r3.ExS(-828146617);
            C64477Lce lce = C64477Lce.A00;
            if (!mPk2.equals(lce)) {
                C286575Wy r8 = r3;
                AnonymousClass5ZZ.A0W(r8, C287195Zj.A0B(r11, 0.0f, 8.0f, 0.0f, 8.0f), C51966G9m.A0b(r3), C288035bG.A00(r3, 2131952759), C51966G9m.A0M(r3));
            }
            C286565Wx.A0L(r62, false);
            C286575Wy r7 = r3;
            String str3 = str2;
            C62320sa r10 = r27;
            0sP r112 = r26;
            C54780HSn.A00(r7, Integer.valueOf(i5), str3, r10, r112, C51969G9p.A04(i3 >> 3, ((i3 >> 6) & 14) | (i3 & 112)), !mPk2.equals(lce));
            if (C51967G9n.A1R(r3)) {
                0fL.A00(792304063);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9N(r26, r27, mPk2, str2, i4, i5, 0);
        }
    }
}
