package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ThreadHeaderStyle;

/* renamed from: X.HUt  reason: case insensitive filesystem */
public abstract class C54837HUt {
    public static final void A00(C286575Wy r19, Modifier modifier, ThreadHeaderStyle threadHeaderStyle, String str, int i, int i2) {
        int i3;
        long j;
        AnonymousClass5Z4 r14;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r12 = r19;
        r12.ExV(-105960312);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r12, str2) | i;
        } else {
            i3 = i5;
        }
        ThreadHeaderStyle threadHeaderStyle2 = threadHeaderStyle;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, threadHeaderStyle2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r12, modifier2);
        }
        if ((i3 & 147) != 146 || !r12.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1563536548, "com.instagram.barcelona.feed.post.ui.PostContainerHeader (PostContainerHeader.kt:22)");
            }
            boolean A1W = AnonymousClass7TF.A1W(threadHeaderStyle2, ThreadHeaderStyle.BOLD);
            Modifier A03 = C287195Zj.A03(AnonymousClass6DP.A00(G9t.A0p(r12, modifier2), 0.0f, false));
            C287325Zx r0 = C287275Zs.A07;
            C287265Zr r9 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r0, r12, r9, 0);
            int A00 = C287425a7.A00(r12);
            C286565Wx r7 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r12, A03);
            C51973G9u.A0y(r12, r7);
            C51971G9r.A12(r12, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            Modifier AB0 = C304676Et.A00.AB0(r9, Modifier.A00);
            if (A1W) {
                j = C51970G9q.A0L(r12, -53818136);
            } else {
                j = C51967G9n.A0a(r12, -53817110).A0t;
            }
            C286565Wx.A0L(r7, false);
            long A012 = AnonymousClass5Z7.A01(14);
            if (A1W) {
                r14 = C51967G9n.A0b(r12, -53812916).A01;
            } else {
                r14 = C51967G9n.A0b(r12, -53811646).A00;
            }
            C286565Wx.A0L(r7, false);
            AnonymousClass5ZZ.A0J(r12, AB0, r14, str2, (i3 & 14) | 3072, 16240, j, A012);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-665471572);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Y(threadHeaderStyle2, modifier2, str2, i4, i, 0);
        }
    }
}
