package X;

import java.util.List;

/* renamed from: X.Hu3  reason: case insensitive filesystem */
public abstract class C56174Hu3 {
    public static final void A01(SOO soo, List list) {
        0qQ.A0B(soo, 0);
        int A06 = C51966G9m.A06(list);
        if (A06 >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C268074ci r1 = (C268074ci) list.get(i);
                Object A00 = HRU.A00(r1);
                if (A00 == null) {
                    0qQ.A0B(r1, 0);
                    r1.BaX();
                    A00 = new C54761HRt();
                }
                Sd4 A002 = soo.A00(A00);
                if (A002 != null) {
                    A002.A0a = r1;
                    2d3 r0 = A002.A0I;
                    if (r0 != null) {
                        r0.A0m = r1;
                    }
                }
                0qQ.A0B(r1, 0);
                r1.BaX();
                if (i2 <= A06) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public static final 0eP A00(C286575Wy r5, C284945Oz r6, C55961HqS hqS, Sd5 sd5) {
        AnonymousClass7TG.A1U(hqS, r6, sd5);
        r5.ExT(-441911751);
        Object A0f = G9w.A0f(r5, -3687241);
        Object obj = AnonymousClass5XT.A00;
        if (A0f == obj) {
            A0f = new C56864IFl(hqS);
            r5.FLL(A0f);
        }
        C286565Wx A0G = C51965G9l.A0G(r5);
        C56864IFl iFl = (C56864IFl) A0f;
        r5.ExT(-3686930);
        boolean AGu = r5.AGu(257);
        Object ECw = r5.ECw();
        if (AGu || ECw == obj) {
            ECw = AnonymousClass7TE.A1L(new C11602Sd2(r6, iFl, sd5), new C58718IwR(22, (Object) iFl, (Object) r6));
            r5.FLL(ECw);
        }
        C286565Wx.A0I(A0G);
        0eP r0 = (0eP) ECw;
        C286565Wx.A0I(A0G);
        return r0;
    }
}
