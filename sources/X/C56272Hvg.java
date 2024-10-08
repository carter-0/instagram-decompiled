package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.Hvg  reason: case insensitive filesystem */
public abstract class C56272Hvg {
    public static final void A00(C286575Wy r23, C59493JLr jLr, 0sP r25, int i, boolean z) {
        int i2;
        C59493JLr jLr2 = jLr;
        AnonymousClass7TF.A1B(jLr2, 0, r25);
        C286575Wy r5 = r23;
        r5.ExV(1102999237);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, jLr2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r5, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r5, r25);
        }
        if ((i2 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(930753694, "com.instagram.creation.genai.common.ui.ImageOptionThumbnail (CreationGenAIImageSelector.kt:71)");
            }
            Modifier modifier = Modifier.A00;
            Modifier A0P = C51968G9o.A0P(C54739HQw.A00(C287195Zj.A09(C287205Zk.A08(modifier, 100.0f), 4.0f, 0.0f), 0.5625f, false), 10.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r5);
            C286565Wx r2 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r5, A0P);
            C51973G9u.A0y(r5, r2);
            C51971G9r.A12(r5, A0a, A04);
            0sL r12 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r12, A00);
            }
            C51965G9l.A18(r5, A01);
            if (jLr2 instanceof IQK) {
                r5.ExS(-481397310);
                AnonymousClass6GC r14 = new AnonymousClass6GC(new C3018360g(((IQK) jLr2).A00));
                String A002 = C288035bG.A00(r5, 2131969729);
                float f = 0.8f;
                if (z) {
                    f = 1.0f;
                }
                C288095bM r20 = C288075bK.A00;
                String A003 = C288035bG.A00(r5, 2131973036);
                r5.ExS(1647056131);
                boolean AGw = r5.AGw(jLr2) | C51972G9s.A1N(i2);
                Object ECw = r5.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new C66291MMa(47, jLr2, r25);
                    r5.FLL(ECw);
                }
                Modifier A03 = C288235ba.A03(r5, modifier, A003, C51965G9l.A0y(r2, ECw, false));
                r5.ExS(1647060901);
                if (z) {
                    modifier = C51968G9o.A0Q(modifier, 10.0f, 2.0f, C51966G9m.A0E(r5));
                }
                AnonymousClass6G3.A00(r5, (Alignment) null, C51968G9o.A0P(C54739HQw.A00(C287205Zk.A08(C51967G9n.A0B(r2, A03, modifier), 100.0f), 0.5625f, false), 10.0f), (C288195bW) null, r14, r20, A002, f, 24576, 72);
            } else {
                C287675aa.A02(r5, C56666I6v.A01(r5, C51966G9m.A0X(modifier, C51967G9n.A0a(r5, -480224704).A0c).Ezh(C287205Zk.A01), C56666I6v.A03(r5, (List) null, 0.0f, 0.0f, 0, 1572864, 62, AnonymousClass5aQ.A00(r5).A0c), 0), 0);
            }
            if (C51971G9r.A1S(r5, r2, false)) {
                0fL.A00(1031083673);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 6, r25, jLr2, z2);
        }
    }

    public static final void A01(C286575Wy r14, String str, List list, 0sP r17, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        List list2 = list;
        0sP r2 = r17;
        AnonymousClass7TG.A1O(list2, r2);
        C286575Wy r13 = r14;
        r14.ExV(-819376631);
        int i4 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, list2);
        }
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0G(r14, r2);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(55491178, "com.instagram.creation.genai.common.ui.CreationGenAIImageSelector (CreationGenAIImageSelector.kt:42)");
            }
            if (list2.isEmpty()) {
                if (0fL.A02()) {
                    0fL.A00(-612571186);
                }
                ASQ = r14.ASQ();
                if (ASQ != null) {
                    i3 = 3;
                    ASQ.A06 = new C59141J7x(r2, list2, str2, i4, i3);
                }
                return;
            }
            LazyListState A00 = C305066Gi.A00(r14, 0, 0, 0, 3);
            Alignment alignment = C287215Zl.A06;
            C285245Qk r9 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r9, 0.0f, 10.0f);
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r14);
            C286565Wx r6 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r14, A09);
            C51973G9u.A0y(r14, r6);
            C51971G9r.A12(r14, A002, A04);
            0sL r7 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r7, A003);
            }
            C51965G9l.A18(r14, A01);
            C287355a0 r10 = C287275Zs.A02;
            C287245Zp r142 = C287215Zl.A04;
            C304826Fj r11 = new C304826Fj(12.0f, 0.0f, 12.0f, 0.0f);
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r9), 0.0f, 0.0f, 0.0f, 12.0f);
            boolean A1Z = C51967G9n.A1Z(r13, list2, -928992963) | C51973G9u.A1G(i2) | C51973G9u.A1I(i2);
            Object ECw = r13.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0z(r13, r2, list2, str2, 23);
            }
            AnonymousClass6HY.A02(r10, r11, A00, r13, r142, A0B, C51965G9l.A0z(r6, ECw), 12804486, 72);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-868681473);
            }
        } else {
            r14.Evl();
        }
        ASQ = r13.ASQ();
        if (ASQ != null) {
            i3 = 4;
            ASQ.A06 = new C59141J7x(r2, list2, str2, i4, i3);
        }
    }
}
