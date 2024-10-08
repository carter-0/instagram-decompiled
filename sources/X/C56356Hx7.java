package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;
import java.util.Arrays;

/* renamed from: X.Hx7  reason: case insensitive filesystem */
public abstract class C56356Hx7 {
    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(1959280337);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1731149790, "com.instagram.wonderwall.ui.compose.components.WallFeedFooterLoading (WallFeedLoading.kt:61)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r5);
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
            int A002 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A0T);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r1, A002);
            }
            C51965G9l.A18(r6, A01);
            GQD.A01(r6, C287205Zk.A0C(r5, 36.0f));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-1220674738);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 17);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.JLF, java.lang.Object] */
    public static final void A01(C286575Wy r23, int i) {
        C286575Wy r12 = r23;
        r12.ExV(1674311318);
        int i2 = i;
        if (i != 0 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1793494366, "com.instagram.wonderwall.ui.compose.components.WallFeedLoading (WallFeedLoading.kt:30)");
            }
            Modifier A05 = C287195Zj.A05(Modifier.A00);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r12, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r12);
            C286565Wx r1 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r12, A05);
            C51973G9u.A0y(r12, r1);
            C51971G9r.A12(r12, A02, A04);
            0sL r4 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r4, A00);
            }
            C51965G9l.A18(r12, A01);
            Float valueOf = Float.valueOf(0.5f);
            Float valueOf2 = Float.valueOf(0.3f);
            C55984Hqp A03 = C56666I6v.A03(r12, AnonymousClass62Q.A04(Arrays.copyOf(new Float[]{valueOf, valueOf2, Float.valueOf(0.1f), valueOf2, valueOf}, 5)), 400.0f, 135.0f, 800, 1797168, 5, 0);
            ? obj = new Object();
            C304756Fc A012 = C287275Zs.A01(12.0f);
            C304826Fj r9 = new C304826Fj(12.0f, 12.0f, 12.0f, 12.0f);
            boolean A1Y = C51967G9n.A1Y(r12, A03, -1354401989);
            Object ECw = r12.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new MPC(A03, 43);
                r12.FLL(ECw);
            }
            C286565Wx.A0L(r1, false);
            C56165Htu.A00((AnonymousClass6HS) null, A012, r9, (LazyStaggeredGridState) null, obj, r12, (Modifier) null, (0sP) ECw, 12.0f, 102435840, 150, false, false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1266114112);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i2, 18);
        }
    }
}
