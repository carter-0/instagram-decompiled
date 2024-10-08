package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrlBase;

/* renamed from: X.HUj  reason: case insensitive filesystem */
public abstract class C54827HUj {
    public static final void A00(C286575Wy r9, Modifier modifier, JV7 jv7, 0sP r12, int i, int i2) {
        int i3;
        AnonymousClass7TF.A1H(jv7, r12);
        r9.ExV(-906842530);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r9, jv7) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r9, r12);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= G9t.A0Q(r9, modifier);
        }
        if ((i3 & 147) != 146 || !r9.Bwn()) {
            if (i6 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-426115586, "com.instagram.barcelona.feed.mediaviewer.ui.WearableAttributionCTA (WearableAttributionCTA.kt:24)");
            }
            Modifier A0X = C51969G9p.A0X(modifier, 10.0f, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C291445hJ.A0K & 63)], AnonymousClass5RW.A03(C291445hJ.A0K), AnonymousClass5RW.A02(C291445hJ.A0K), AnonymousClass5RW.A01(C291445hJ.A0K), 0.2f));
            r9.ExS(-1560895054);
            boolean A1S = AnonymousClass7TF.A1S(i3 & 112, 32) | C51968G9o.A1Q(i3);
            Object ECw = r9.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0u(r9, r12, jv7, 41);
            }
            C286565Wx r6 = (C286565Wx) r9;
            Modifier A09 = C287195Zj.A09(G9w.A0D(r9, r6, A0X, (C62320sa) ECw), 8.0f, 4.0f);
            AnonymousClass5RD A0V = C51968G9o.A0V(r9);
            int A00 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r9, A09);
            C51973G9u.A0y(r9, r6);
            C51971G9r.A12(r9, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r1, A00);
            }
            C51965G9l.A18(r9, A01);
            C304096Cd.A03(r9, C287195Zj.A0B(C287205Zk.A0C(Modifier.A00, 14.0f), 0.0f, 0.0f, 4.0f, 0.0f), (ImageUrlBase) jv7.A00, 432);
            AnonymousClass5ZZ.A0h(r9, AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0f(r9), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16777214, C51966G9m.A0I(r9), 0, 0, 0), jv7.A02);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(45760000);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 12, modifier, jv7, r12);
        }
    }
}
