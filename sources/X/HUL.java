package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public abstract class HUL {
    public static final void A00(C286575Wy r22, Modifier modifier, ImageUrl imageUrl, 0sP r25, 0sP r26, int i, int i2) {
        int i3;
        0sP r6 = r26;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1Q(r25, r6);
        C286575Wy r5 = r22;
        r5.ExV(-1672106423);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r5, modifier2) | i;
        } else {
            i3 = i6;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r5, imageUrl2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r5, r25);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r5, r6);
        }
        if ((i3 & 1171) != 1170 || !r5.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1013613691, "com.instagram.archive.updateshub.UpdatesHubHeaderNux (UpdatesHubHeaderNux.kt:31)");
            }
            AnonymousClass5RD A0M = C51975G9x.A0M(r5, C287215Zl.A00, i3);
            int A00 = C287425a7.A00(r5);
            C286565Wx r2 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r5, modifier2);
            C51973G9u.A0y(r5, r2);
            C51971G9r.A12(r5, A0M, A04);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r1, A00);
            }
            C51965G9l.A18(r5, A01);
            C285245Qk r10 = Modifier.A00;
            HUJ.A00(r5, C287195Zj.A09(r10, 0.0f, 28.0f), imageUrl2, r25, (i3 & 112) | 6 | (i3 & 896));
            String A002 = C304346Dc.A00(r5, 2131976086);
            Modifier A0T = C51966G9m.A0T(r10);
            AnonymousClass5ZZ.A0W(r5, C287195Zj.A0A(A0T, 0.0f, 0.0f, 0.0f), AnonymousClass5aQ.A01(r5).A04, A002, C51966G9m.A0H(r5));
            String A003 = C304346Dc.A00(r5, 2131976084);
            C286575Wy r9 = r5;
            AnonymousClass5ZZ.A0W(r9, C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 24.0f), C51966G9m.A0c(r5), A003, C51966G9m.A0H(r5));
            String A004 = C304346Dc.A00(r5, 2131976085);
            Modifier A0B = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 12.0f);
            boolean z = false;
            C52399GQy A02 = AnonymousClass6CA.A00.A02(r5);
            r5.ExS(-1988652121);
            int i7 = i3 & 7168;
            if (i7 == 2048) {
                z = true;
            }
            Object ECw = r5.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new MME(r6, 47);
                r5.FLL(ECw);
            }
            AnonymousClass6CE.A02(r5, A0B, A02, A004, C51965G9l.A0y(r2, ECw, false));
            String A005 = C304346Dc.A00(r5, 2131967970);
            Modifier A0B2 = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 28.0f);
            AnonymousClass6CB A006 = AnonymousClass6CA.A00(r5);
            boolean A1X = C51970G9q.A1X(r5, -1988642840, i7, C249703kE.FLAG_MOVED);
            Object ECw2 = r5.ECw();
            if (A1X || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MME(r6, 48);
                r5.FLL(ECw2);
            }
            AnonymousClass6CE.A02(r5, A0B2, A006, A005, C51965G9l.A0y(r2, ECw2, false));
            if (C51967G9n.A1R(r5)) {
                0fL.A00(812500279);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r25, r6, modifier2, imageUrl2, i6, i4, 6);
        }
    }
}
