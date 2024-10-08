package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HUl  reason: case insensitive filesystem */
public abstract class C54829HUl {
    public static final void A00(C286575Wy r19, Modifier modifier, 0sL r21, 0sK r22, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r14 = r19;
        r14.ExV(-1990252798);
        int i4 = i2;
        0sL r13 = r21;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r14, r13) | i;
        } else {
            i3 = i5;
        }
        0sK r12 = r22;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, r12);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r14, modifier2);
        }
        if ((i3 & 147) != 146 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(433073275, "com.instagram.barcelona.feed.post.ui.CompactPostTextWithMediaScaffold (CompactPostTextWithMediaScaffold.kt:20)");
            }
            Modifier A05 = C287195Zj.A05(modifier2);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r14, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r9 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r14, A05);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r14, r9, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A02, A04, r7);
            0sL r5 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r5, A00);
            }
            0sL A1K = C51966G9m.A1K(r14, A01);
            AnonymousClass6FX r0 = AnonymousClass6FX.A00;
            C285245Qk r3 = Modifier.A00;
            Modifier A002 = r0.A00(r3);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r14, A002);
            C51973G9u.A0z(r14, r9, r8);
            C287595aO.A00(r14, A0Z, r7);
            if (C51965G9l.A1Y(r14, r9, A042, A0w) || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r5, A003);
            }
            C287595aO.A00(r14, A012, A1K);
            r14.ExS(173830906);
            if (r21 != null) {
                C51967G9n.A1P(r14, r13, i3 & 14);
            }
            C286565Wx.A0L(r9, false);
            r14.ASN();
            r14.ExS(-468412368);
            if (r22 != null) {
                Modifier A0C = C287205Zk.A0C(r3, 50.0f);
                int i7 = ((i3 << 6) & 7168) | 6;
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A004 = C287425a7.A00(r14);
                AnonymousClass5RM A043 = C286565Wx.A04(r9);
                Modifier A013 = C287435a8.A01(r14, A0C);
                C51973G9u.A0z(r14, r9, r8);
                C287595aO.A00(r14, A0a, r7);
                if (C51965G9l.A1Y(r14, r9, A043, A0w) || !C51972G9s.A1Q(r14, A004)) {
                    C51971G9r.A13(r14, r5, A004);
                }
                C287595aO.A00(r14, A013, A1K);
                C51967G9n.A1M(C289515dj.A00, r14, r12, ((i7 >> 6) & 112) | 6);
                r14.ASN();
            }
            if (C51971G9r.A1S(r14, r9, false)) {
                0fL.A00(1701555700);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            Modifier modifier3 = modifier2;
            ASQ.A06 = new JG6(i5, i4, 13, r12, r13, modifier3);
        }
    }
}
