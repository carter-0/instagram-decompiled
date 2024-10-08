package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HUx {
    public static final void A00(C286575Wy r16, Modifier modifier, C62320sa r18, AnonymousClass62P r19, int i, int i2, int i3, boolean z) {
        int i4;
        Modifier modifier2;
        C285245Qk r7;
        Modifier modifier3 = modifier;
        AnonymousClass62P r10 = r19;
        0qQ.A0B(r10, 2);
        C286575Wy r15 = r16;
        r15.ExV(-1800456318);
        int i5 = i3;
        C62320sa r9 = r18;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = C41848B3p.A01(r15, r9) | i2;
        } else {
            i4 = i6;
        }
        int i7 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r15, i7);
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & 384) == 0) {
            i4 |= G9t.A0Q(r15, r10);
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i4 |= G9t.A0b(r15, z2);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i4 |= G9t.A0S(r15, modifier3);
        }
        if ((i4 & 9363) != 9362 || !r15.Bwn()) {
            if (i8 != 0) {
                modifier3 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-544043671, "com.instagram.barcelona.feed.post.ui.PostInlineReplyExpansion (PostInlineReplyExpansion.kt:29)");
            }
            Modifier A09 = C287205Zk.A09(C287195Zj.A0B(C304246Cs.A00(AnonymousClass6DP.A00(modifier3, 0.0f, false), AnonymousClass05K.A0Y, true, true), 0.0f, 8.0f, 16.0f, 8.0f), 34.0f);
            r15.ExS(370234014);
            if (r18 != null) {
                C285245Qk r6 = Modifier.A00;
                r7 = r6;
                C287625aV A0R = C51965G9l.A0R(0);
                boolean A1N = C51973G9u.A1N(r15, 370237175, i4);
                Object ECw = r15.ECw();
                if (A1N || ECw == AnonymousClass5XT.A00) {
                    ECw = C58713IwM.A01(r15, r9, 36);
                }
                C51965G9l.A1X(r15, false);
                modifier2 = C288235ba.A02(r15, r6, A0R, (C62320sa) ECw);
            } else {
                modifier2 = Modifier.A00;
                r7 = modifier2;
            }
            C286565Wx r62 = (C286565Wx) r15;
            Modifier A0B = C51967G9n.A0B(r62, A09, modifier2);
            AnonymousClass5RD A0W = C51968G9o.A0W(r15);
            int A00 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(r62);
            Modifier A01 = C287435a8.A01(r15, A0B);
            C51973G9u.A0y(r15, r62);
            C51971G9r.A12(r15, A0W, A04);
            0sL r3 = C287485aD.A02;
            if (r62.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r3, A00);
            }
            C51965G9l.A18(r15, A01);
            AnonymousClass6FX r1 = AnonymousClass6FX.A00;
            int i9 = i4 >> 3;
            C286575Wy r182 = r15;
            AnonymousClass62P r20 = r10;
            C304336Db.A01(r182, C287205Zk.A02(C287215Zl.A09, C287205Zk.A0D(r7, 60.0f)), r20, ((i4 >> 9) & 14) | (i9 & 112), 0, z);
            C54834HUq.A00(r15, r1.A00(r7), (C62320sa) null, i7, R.plurals.barcelona_expand_replies, (i9 & 14) | 384, 0);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(-831844878);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59155J8l(modifier3, r9, r10, i7, i6, i5, z2);
        }
    }
}
