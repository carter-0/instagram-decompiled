package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HZn  reason: case insensitive filesystem */
public abstract class C54957HZn {
    public static final void A00(C286575Wy r12, Modifier modifier, C328557Fg r14, int i) {
        int i2;
        boolean A1U = AnonymousClass7TF.A1U(0, modifier, r14);
        r12.ExV(-286670338);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, r14);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2039112636, "com.instagram.direct.messagethread.compose.SenderAvatar (SenderAvatar.kt:27)");
            }
            C328547Ff r5 = r14.A01;
            if (r5 instanceof AnonymousClass7G5) {
                Object AJO = r12.AJO(C55419HhP.A00);
                AnonymousClass2DN A00 = 1zC.A00(r12, r14.A00);
                Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(modifier, 18.0f, 0.0f, 10.0f, 0.0f), 28.0f);
                long A0F = C51966G9m.A0F(r12);
                AnonymousClass5ZQ r8 = AnonymousClass5ZN.A00;
                Modifier A01 = AnonymousClass6FZ.A01(C304816Fi.A03(A0C, r8, 0.5f, A0F), r8);
                boolean A1T = C51968G9o.A1T(r12, AJO, C51967G9n.A1Z(r12, r5, -1623847145), C51972G9s.A1L(i2));
                Object ECw = r12.ECw();
                if (A1T || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58195Inz(9, AJO, r5, r14);
                    r12.FLL(ECw);
                }
                C51965G9l.A1X(r12, false);
                AnonymousClass6G3.A08(r12, C287635aW.A05(A01, (C287625aV) null, (String) null, (C62320sa) ECw, A1U), A00, C288075bK.A00);
            }
            if (0fL.A02()) {
                0fL.A00(-1047791153);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r14, modifier, i, 12);
        }
    }
}
