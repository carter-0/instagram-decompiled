package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.HYp  reason: case insensitive filesystem */
public abstract class C54933HYp {
    public static final void A00(C286575Wy r17, String str, 0sP r19, AnonymousClass62P r20, int i) {
        float f;
        String str2 = str;
        0sP r2 = r19;
        AnonymousClass62P r0 = r20;
        boolean A1b = C51973G9u.A1b(r0, str2, r2);
        C286575Wy r12 = r17;
        if (C51967G9n.A1T(r12, 1938582004)) {
            0fL.A01(-1450875304, "com.instagram.creator.achievements.modules.views.ChallengeCardHScrollRow (ChallengeCardHScrollRow.kt:32)");
        }
        float A01 = C51972G9s.A01(r12);
        if (r0.size() == A1b) {
            f = A01 - 32.0f;
        } else {
            f = 290.0f;
        }
        C285245Qk r11 = Modifier.A00;
        AnonymousClass5RD A0Z = C51969G9p.A0Z(r12, 0);
        int A00 = C287425a7.A00(r12);
        C286565Wx r9 = (C286565Wx) r12;
        AnonymousClass5RM A04 = C286565Wx.A04(r9);
        Modifier A012 = C287435a8.A01(r12, r11);
        C51973G9u.A0y(r12, r9);
        C51971G9r.A12(r12, A0Z, A04);
        0sL r6 = C287485aD.A02;
        if (r9.A0K || !C51972G9s.A1Q(r12, A00)) {
            C51971G9r.A13(r12, r6, A00);
        }
        C51965G9l.A18(r12, A012);
        Modifier A0T = C51966G9m.A0T(r11);
        int i2 = i;
        C52747Gbz.A00(r12, A0T, (C59488JLm) null, (HL9) null, str2, C51965G9l.A03(i2), 60);
        LazyListState A0A = C51967G9n.A0A(r12);
        boolean A1W = C51970G9q.A1W(r0.size(), A1b ? 1 : 0);
        C287245Zp r13 = C287215Zl.A04;
        AnonymousClass6HY.A00(C304696Ev.A00(A0A, r12), C287275Zs.A00(), new C304826Fj(16.0f, 0.0f, 16.0f, 0.0f), A0A, r12, r13, A0T, new C58748Iwv(r0, r2, f, 11), 221574, 8, false, A1W);
        if (C51967G9n.A1R(r12)) {
            0fL.A00(193116069);
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r2, r0, str2, i2, 10);
        }
    }
}
