package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.HvR  reason: case insensitive filesystem */
public abstract class C56257HvR {
    public static final void A00(C286575Wy r15, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        C286575Wy r10 = r15;
        r15.ExV(-931653645);
        int i6 = i3;
        int i7 = i3 & 1;
        int i8 = 4;
        int i9 = i2;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = G9t.A05(r15, i5) | i2;
        } else {
            i4 = i9;
        }
        if ((i4 & 11) != 2 || !r15.Bwn()) {
            if (i7 != 0) {
                i5 = 0;
            }
            if (0fL.A02()) {
                0fL.A01(-1082350797, "com.instagram.comments.mvvm.view.compose.CommentShimmer (CommentShimmer.kt:24)");
            }
            if (i5 > 0) {
                i8 = i5;
            }
            int min = Math.min(10, i8);
            C55984Hqp A03 = C56666I6v.A03(r10, (List) null, 0.0f, 0.0f, 0, 1572864, 63, 0);
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
            int A00 = C287425a7.A00(r10);
            C286565Wx r7 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r10, r6);
            C51973G9u.A0y(r10, r7);
            C51971G9r.A12(r10, A0Z, A04);
            0sL r2 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r2, A00);
            }
            C51965G9l.A18(r10, A01);
            r10.ExS(-1621377539);
            for (int i10 = 0; i10 < min; i10++) {
                A01(r10, A03, 0);
            }
            if (C51971G9r.A1S(r10, r7, false)) {
                0fL.A00(-476876712);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7I(i5, i9, i6, 0);
        }
    }

    public static final void A01(C286575Wy r16, C55984Hqp hqp, int i) {
        int i2;
        C286575Wy r6 = r16;
        r6.ExV(1721229984);
        int i3 = i;
        C55984Hqp hqp2 = hqp;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r6, hqp2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1748195238, "com.instagram.comments.mvvm.view.compose.ShimmerCommentRow (CommentShimmer.kt:39)");
            }
            C285245Qk r3 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r3, 12.0f, 12.0f, 0.0f, 28.0f);
            int i4 = ((i2 << 3) & 112) | 6;
            AnonymousClass7TF.A1H(A0B, hqp2);
            if (C51967G9n.A1U(r6, -1967563413)) {
                0fL.A01(-1939772385, "com.instagram.compose.ui.shimmer.shimmerContent (Shimmer.kt:35)");
            }
            boolean z = false;
            C56666I6v.A04(r6, 0);
            Modifier A0X = C51970G9q.A0X(A0B, C58985J1w.A00);
            r6.ExS(-1338123810);
            if ((((i4 & 112) ^ 48) > 32 && r6.AGu(hqp2)) || (i4 & 48) == 32) {
                z = true;
            }
            Object ECw = r6.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new J6I(hqp2, 48);
                r6.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            Modifier A01 = C289575dp.A01(A0X, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-825658818);
            }
            C286565Wx.A0L(A0H, false);
            AnonymousClass5RD A0V = C51968G9o.A0V(r6);
            int A00 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r6, A01);
            C62320sa r0 = C287485aD.A00;
            C51973G9u.A0z(r6, A0H, r0);
            0sL r15 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A0V, A04, r15);
            0sL r12 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r6, A012);
            Modifier A0C = C287205Zk.A0C(r3, 36.0f);
            long j = AnonymousClass5RW.A01;
            C287675aa.A02(r6, C304766Fd.A01(A0C, AnonymousClass5ZN.A00, j), 0);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r6, r3);
            C51973G9u.A0z(r6, A0H, r0);
            C287595aO.A00(r6, A0Z, r15);
            if (C51965G9l.A1Y(r6, A0H, A042, A0w) || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r12, A002);
            }
            C287595aO.A00(r6, A013, A1K);
            C287675aa.A02(r6, C51969G9p.A0X(C287205Zk.A08(C287195Zj.A0B(C287205Zk.A07(r3, 0.4f), 12.0f, 0.0f, 0.0f, 0.0f), 12.0f), 7.0f, j), 0);
            C287675aa.A02(r6, C51969G9p.A0X(C287205Zk.A08(C287195Zj.A0B(C287205Zk.A07(r3, 0.8f), 12.0f, 6.0f, 0.0f, 0.0f), 12.0f), 7.0f, j), 0);
            if (C51971G9r.A1R(r6)) {
                0fL.A00(-629068236);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, hqp2, i3, 24);
        }
    }
}
