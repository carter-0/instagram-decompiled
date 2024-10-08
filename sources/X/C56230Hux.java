package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;

/* renamed from: X.Hux  reason: case insensitive filesystem */
public abstract class C56230Hux {
    /* JADX WARNING: type inference failed for: r13v1, types: [X.JNb, java.lang.Object] */
    public static final void A00(C286575Wy r12, Modifier modifier, C62320sa r14, 0sL r15, AnonymousClass62P r16, int i, int i2, long j) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r5 = r14;
        0sL r4 = r15;
        AnonymousClass62P r3 = r16;
        DbZ.A0t(0, r3, r15, r14);
        r12.ExV(-786591552);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r12, r3) | i;
        } else {
            i3 = i5;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0C(r12, j2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r12, r15);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r14);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if ((i2 & 16) != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-2017092224, "com.instagram.barcelona.feed.post.ui.MultiAccountLikePopup (MultiAccountLikePopup.kt:46)");
            }
            I5L.A01(r12, new Object(), (C56020HrS) null, r5, AnonymousClass5PI.A01(r12, new J7M(j2, r3, r4, 1), -1114261406), ((i3 >> 6) & 112) | 3072, 4);
            if (0fL.A02()) {
                0fL.A00(1665227335);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59193J9x(r3, r4, r5, modifier2, i5, i4, 1, j2);
        }
    }

    public static final void A01(C286575Wy r20, User user, 0sP r22, int i, long j) {
        int i2;
        User user2 = user;
        0sP r6 = r22;
        AnonymousClass7TF.A1B(user2, 0, r6);
        C286575Wy r15 = r20;
        r15.ExV(-2006077094);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, user2) | i;
        } else {
            i2 = i3;
        }
        long j2 = j;
        if ((i & 48) == 0) {
            i2 |= G9t.A0C(r15, j2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r6);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-962690252, "com.instagram.barcelona.feed.post.ui.MultiAccountUserLikeRow (MultiAccountLikePopup.kt:98)");
            }
            Object A0m = C51967G9n.A0m(r15, -295646954);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r9 = (C284945Oz) C51974G9v.A0Z(r15, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            C285245Qk r12 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r12);
            AnonymousClass5RD A0V = C51968G9o.A0V(r15);
            int A00 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r15, A0T);
            C51973G9u.A0y(r15, A0H);
            C51971G9r.A12(r15, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            AnonymousClass6FX r3 = AnonymousClass6FX.A00;
            C304096Cd.A02(r15, C51971G9r.A0Q(C287195Zj.A0B(r12, 0.0f, 0.0f, 8.0f, 0.0f), 20.0f), user2.Bh3());
            AnonymousClass5ZZ.A0a(r15, r3.A00(r12), user2.getUsername(), 32764);
            boolean A1W = C51971G9r.A1W(r9);
            boolean A1Z = C51974G9v.A1Z(r15, -697474079, i2);
            Object ECw = r15.ECw();
            if (A1Z || ECw == obj) {
                ECw = new MMX(r9, r6, 46);
                r15.FLL(ECw);
            }
            AnonymousClass6DO.A01(r15, (Modifier) null, C51965G9l.A0y(A0H, ECw, false), (C62320sa) null, i2 & 112, 108, j2, A1W, false, false);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(898090128);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59132J7o(j2, user2, r6, i3, 1);
        }
    }
}
