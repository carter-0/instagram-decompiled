package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.HSx  reason: case insensitive filesystem */
public abstract class C54790HSx {
    public static final void A00(C286575Wy r27, String str, String str2, 0sP r30, int i, int i2, boolean z) {
        int i3;
        Object gpg;
        String str3 = str;
        0qQ.A0B(str3, 0);
        String str4 = str2;
        AnonymousClass7TF.A1C(str4, 2, r30);
        C286575Wy r6 = r27;
        r6.ExV(-1540499588);
        int i4 = i2;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r6, str3) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r6, i5);
        }
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r6, str4);
        }
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r6, r30);
        }
        boolean z2 = z;
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A0c(r6, z2);
        }
        if ((i3 & 9363) != 9362 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2108599800, "com.instagram.aistudio.editor.CustomAiCreationScreen (CustomAiCreationScreen.kt:34)");
            }
            Object A0m = C51967G9n.A0m(r6, -819062277);
            Object obj = AnonymousClass5XT.A00;
            C56547I1b i1b = (C56547I1b) C51972G9s.A0k(r6, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            0rm A11 = C51965G9l.A11();
            Object A0m2 = C51967G9n.A0m(r6, -819060324);
            if (A0m2 == obj) {
                if (str3.length() <= i5) {
                    gpg = IPY.A00;
                } else {
                    gpg = new C53510Gpg(str4);
                }
                A0m2 = G9t.A0o(r6, gpg);
            }
            C286565Wx.A0L(A0H, false);
            A11.A00 = A0m2;
            C285245Qk r11 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(I28.A02(r6, JJP.A00(r11, C287655aY.A00, 0)), 0.0f, 0.0f, 0.0f, 40.0f);
            AnonymousClass5RD A0X = C51968G9o.A0X(r6);
            int A00 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r6, A0B);
            C51973G9u.A0y(r6, A0H);
            C51971G9r.A12(r6, A0X, A04);
            0sL r12 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r12, A00);
            }
            C51965G9l.A18(r6, A01);
            UserSession A0h = C51968G9o.A0h(r6);
            I7M.A07(r6, (C59486JLk) null, (CharSequence) null, C288035bG.A00(r6, 2131964564), 4090);
            String A002 = C288035bG.A00(r6, 2131964563);
            Modifier A0U = C51970G9q.A0U(C287195Zj.A0B(r11, 0.0f, 24.0f, 0.0f, 0.0f), i1b);
            int A042 = DbS.A04(AnonymousClass7TF.A0H(A0h), A0h, 36605550998525190L);
            int A043 = DbS.A04(AnonymousClass7TF.A0H(A0h), A0h, 36605550998525190L);
            C58770IxH ixH = new C58770IxH(A11, r30, str4, i5, 2);
            I7P.A04(r6, A0U, (C59485JLj) C51966G9m.A17(A11.A00), 1, Integer.valueOf(i5), str3, A002, ixH, A042, A043, i3 & 14, ((i3 << 3) & 896) | 48, 59264);
            r6.ASN();
            r6.ExS(-819010164);
            boolean A1K = C51972G9s.A1K(i3 & 57344);
            Object ECw = r6.ECw();
            if (A1K || ECw == obj) {
                ECw = new MG9(i1b, (AnonymousClass4D7) null, 5, z2);
                r6.FLL(ECw);
            }
            if (C51972G9s.A1S(r6, A0H, ECw, true)) {
                0fL.A00(329029263);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J82(str3, str4, r30, i5, i4, z2);
        }
    }
}
