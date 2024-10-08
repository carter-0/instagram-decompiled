package X;

import androidx.compose.ui.Modifier;
import java.util.List;

public abstract class GSC {
    public static final 0eP A00;

    static {
        0sn r1 = 0sn.A00;
        A00 = new 0eP(r1, r1);
    }

    public static final void A00(C286575Wy r13, C286025Tq r14, List list, int i) {
        int i2;
        C286575Wy r6 = r13;
        r13.ExV(-1794596951);
        int i3 = i;
        C286025Tq r4 = r14;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, r14) | i;
        } else {
            i2 = i3;
        }
        List list2 = list;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, list);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1425840251, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C3022062b r0 = (C3022062b) list2.get(i4);
                0sK r5 = (0sK) r0.A02;
                int i5 = r0.A01;
                int i6 = r0.A00;
                GSZ gsz = GSZ.A00;
                C285245Qk r02 = Modifier.A00;
                int A002 = C287425a7.A00(r6);
                C286565Wx r132 = (C286565Wx) r6;
                AnonymousClass5RM A04 = C286565Wx.A04(r132);
                Modifier A01 = C287435a8.A01(r6, r02);
                C62320sa r1 = C287485aD.A00;
                r6.ExX();
                if (r132.A0K) {
                    r6.AMT(r1);
                } else {
                    r6.FMk();
                }
                C287595aO.A00(r6, gsz, C287485aD.A03);
                C287595aO.A00(r6, A04, C287485aD.A05);
                0sL r12 = C287485aD.A02;
                if (r132.A0K || !0qQ.A0K(r6.ECw(), Integer.valueOf(A002))) {
                    Integer valueOf = Integer.valueOf(A002);
                    r6.FLL(valueOf);
                    r6.ABr(valueOf, r12);
                }
                C287595aO.A00(r6, A01, C287485aD.A04);
                r5.invoke(r4.subSequence(i5, i6).A00, r6, 0);
                r6.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(2027916152);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r4, list2, i3, 3);
        }
    }
}
