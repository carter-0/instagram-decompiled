package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

public abstract class HV7 {
    public static final void A00(C286575Wy r26, Modifier modifier, 0sP r28, AnonymousClass62P r29, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0sP r3 = r28;
        AnonymousClass62P r2 = r29;
        boolean A1U = AnonymousClass7TF.A1U(0, r2, r3);
        C286575Wy r14 = r26;
        r14.ExV(1757043678);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, r2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, r3);
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
                0fL.A01(-462134330, "com.instagram.barcelona.feed.post.ui.RelevantTagsRow (RelevantTagsRow.kt:30)");
            }
            LazyListState A0A = C51967G9n.A0A(r14);
            C304756Fc A01 = C287275Zs.A01(12.0f);
            C287245Zp r15 = C287215Zl.A04;
            Modifier A09 = C287205Zk.A09(C287195Zj.A0B(AnonymousClass6DP.A00(modifier2, 0.0f, false), 12.0f, 11.0f, 16.0f, 11.0f), 28.0f);
            boolean A1X = C51974G9v.A1X(r14, 1110230314, i3) | C51973G9u.A1H(i3);
            Object ECw = r14.ECw();
            if (A1X || ECw == AnonymousClass5XT.A00) {
                ECw = new C59101J6j(4, (Object) r2, (Object) r3);
                r14.FLL(ECw);
            }
            C51965G9l.A1X(r14, false);
            HXE.A00((AnonymousClass6HS) null, A01, (C304836Fk) null, A0A, r14, r15, A09, (HLV) null, "relevant_tags_row", (0sP) ECw, (0sL) null, 102432774, 0, 1688, false, A1U);
            if (0fL.A02()) {
                0fL.A00(-944752368);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 15, modifier2, r29, r3);
        }
    }
}
