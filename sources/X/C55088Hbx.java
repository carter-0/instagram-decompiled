package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;

/* renamed from: X.Hbx  reason: case insensitive filesystem */
public abstract class C55088Hbx {
    public static final void A00(AnonymousClass62P r33, C286575Wy r34, int i) {
        int i2;
        AnonymousClass62P r8 = r33;
        0qQ.A0B(r8, 0);
        C286575Wy r0 = r34;
        r0.ExV(-1588544858);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r0, r8) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2117787334, "com.instagram.profile.fragment.HighlightCardPreview (HighlightCardPreview.kt:32)");
            }
            long A08 = C51966G9m.A08(r0);
            C285245Qk r2 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C287205Zk.A08(r2, 180.0f), 16.0f, 30.0f, 16.0f, 0.0f);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A02, r0, C287215Zl.A04);
            int A002 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, A0B);
            C62320sa r23 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r23);
            0sL r22 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A00, A04, r22);
            0sL r9 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r9, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            Iterator A17 = C51968G9o.A17(r0, r8, 496949772);
            int i4 = 0;
            while (A17.hasNext()) {
                Object next = A17.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                0eP r13 = (0eP) next;
                if (i4 < 2) {
                    r0.ExS(382475531);
                    Modifier A0P = C51968G9o.A0P(C287205Zk.A08(C287205Zk.A0D(r2, 100.0f), 180.0f), 12.0f);
                    AnonymousClass5RD A003 = C287675aa.A00(C287215Zl.A06, false);
                    int A004 = C287425a7.A00(r0);
                    AnonymousClass5RM A042 = C286565Wx.A04(r1);
                    Modifier A012 = C287435a8.A01(r0, A0P);
                    C51973G9u.A0z(r0, r1, r23);
                    C287595aO.A00(r0, A003, r22);
                    if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A004)) {
                        C51971G9r.A13(r0, r9, A004);
                    }
                    C287595aO.A00(r0, A012, A1K);
                    C289515dj r11 = C289515dj.A00;
                    AnonymousClass6G3.A09(r0, r11.CmS(r2), 1zC.A00(r0, (ImageUrl) r13.A01), C288075bK.A03);
                    C286575Wy r26 = r0;
                    AnonymousClass5ZZ.A0J(r26, C287195Zj.A0B(r2, 0.0f, 0.0f, 0.0f, 12.0f), (AnonymousClass5Z4) null, (String) r13.A00, 3120, 32624, G9w.A05(r0), AnonymousClass5Z7.A01(14));
                    r0.ASN();
                    if (i4 != C51966G9m.A06(r8)) {
                        C51967G9n.A13(r0, r2, 8.0f);
                    }
                } else if (i4 == 2) {
                    r0.ExS(383506374);
                    Modifier A013 = AnonymousClass6FZ.A01(C287205Zk.A08(C287205Zk.A0D(r2, 50.0f), 180.0f), AnonymousClass5ZN.A02(12.0f, 0.0f, 0.0f, 12.0f));
                    r0.ExS(-1373095266);
                    boolean AGt = r0.AGt(A08);
                    Object ECw = r0.ECw();
                    if (AGt || ECw == AnonymousClass5XT.A00) {
                        ECw = new GQ2(A08, 9);
                        r0.FLL(ECw);
                    }
                    Modifier A0H = C51975G9x.A0H(r1, A013, ECw);
                    AnonymousClass5RD A0a = C51966G9m.A0a(false);
                    int A005 = C287425a7.A00(r0);
                    AnonymousClass5RM A043 = C286565Wx.A04(r1);
                    Modifier A014 = C287435a8.A01(r0, A0H);
                    C51973G9u.A0z(r0, r1, r23);
                    C287595aO.A00(r0, A0a, r22);
                    if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A005)) {
                        C51971G9r.A13(r0, r9, A005);
                    }
                    C287595aO.A00(r0, A014, A1K);
                    C289515dj r5 = C289515dj.A00;
                    AnonymousClass2DN A006 = 1zC.A00(r0, (ImageUrl) ((0eP) r8.get(2)).A01);
                    C286575Wy r262 = r0;
                    AnonymousClass6G3.A00(r262, C287215Zl.A0B, AnonymousClass6FZ.A00(r5.CmS(r2)), (C288195bW) null, A006, C288075bK.A00, (String) null, 0.0f, 27704, 96);
                    r0.ASN();
                } else {
                    r0.ExS(384530800);
                }
                C286565Wx.A0L(r1, false);
                i4 = i5;
            }
            if (C51971G9r.A1S(r0, r1, false)) {
                0fL.A00(-454963904);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r8, i3, 38);
        }
    }
}
