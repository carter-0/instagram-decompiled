package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import java.util.List;

public abstract class I3F {
    public static final void A00(C286575Wy r18, Modifier modifier, User user, int i) {
        int i2;
        Modifier modifier2 = modifier;
        User user2 = user;
        boolean A1U = AnonymousClass7TF.A1U(0, modifier2, user2);
        C286575Wy r10 = r18;
        r10.ExV(415706182);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, user2);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-160969575, "com.instagram.wonderwall.ui.compose.screens.WallUserMentionItem (WallMentionTypeAheadScreen.kt:89)");
            }
            AnonymousClass5RD A0M = C51975G9x.A0M(r10, C287215Zl.A00, i2);
            int A00 = C287425a7.A00(r10);
            C286565Wx r6 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r10, modifier2);
            C51973G9u.A0y(r10, r6);
            C51971G9r.A12(r10, A0M, A04);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r4, A00);
            }
            C51965G9l.A18(r10, A01);
            AnonymousClass2DN A002 = 1zC.A00(r10, user2.Bh3());
            String username = user2.getUsername();
            C285245Qk r62 = Modifier.A00;
            AnonymousClass6G3.A0B(r10, C51971G9r.A0Q(r62, 56.0f), A002, username, 0);
            String username2 = user2.getUsername();
            AnonymousClass5ZZ.A0B(r10, C287205Zk.A0D(C287195Zj.A0B(r62, 0.0f, 4.0f, 0.0f, 0.0f), 56.0f), C51966G9m.A0b(r10), username2, 3, A1U ? 1 : 0, 2, 48, 390, 11132, 0);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-269203661);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, user2, modifier2, i3, 22);
        }
    }

    public static final void A02(C286575Wy r14, List list, 0sP r16, int i) {
        int i2;
        List list2 = list;
        0sP r4 = r16;
        AnonymousClass7TF.A1H(list, r4);
        C286575Wy r12 = r14;
        r14.ExV(-384383244);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, list) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r4);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1489116327, "com.instagram.wonderwall.ui.compose.screens.WallUserMentionRow (WallMentionTypeAheadScreen.kt:73)");
            }
            boolean z = true;
            Modifier A0U = C51966G9m.A0U(Modifier.A00);
            C287245Zp r13 = C287215Zl.A04;
            C304826Fj r10 = new C304826Fj(16.0f, 0.0f, 16.0f, 0.0f);
            C304756Fc A01 = C287275Zs.A01(16.0f);
            boolean A1Z = C51967G9n.A1Z(r12, list, -2061015206);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1Z | z;
            Object ECw = r12.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new J6T(29, (Object) r4, (Object) list2);
                r12.FLL(ECw);
            }
            C51965G9l.A1X(r12, false);
            AnonymousClass6HY.A02(A01, r10, (LazyListState) null, r12, r13, A0U, (0sP) ECw, 12804486, 74);
            if (0fL.A02()) {
                0fL.A00(-2021292269);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGM(list2, r4, i3, 23);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r3.AGw(r11) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        if ((r23 & 4) != 0) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r16, androidx.compose.ui.Modifier r17, X.C60173Jgs r18, java.lang.String r19, X.C62320sa r20, X.0sP r21, int r22, int r23) {
        /*
            r11 = r18
            r2 = 0
            r10 = r17
            X.0qQ.A0B(r10, r2)
            r0 = 1
            r14 = r19
            r12 = r20
            r13 = r21
            X.AnonymousClass7TG.A0w(r0, r14, r12, r13)
            r0 = -455359441(0xffffffffe4dbc42f, float:-3.2431788E22)
            r3 = r16
            r3.ExV(r0)
            r16 = r23
            r0 = r23 & 1
            r15 = r22
            if (r0 == 0) goto L_0x0192
            r1 = r22 | 6
        L_0x0024:
            r0 = r23 & 2
            if (r0 == 0) goto L_0x0187
            r1 = r1 | 48
        L_0x002a:
            r0 = r15 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003d
            r0 = r23 & 4
            if (r0 != 0) goto L_0x003a
            boolean r4 = r3.AGw(r11)
            r0 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x003c
        L_0x003a:
            r0 = 128(0x80, float:1.794E-43)
        L_0x003c:
            r1 = r1 | r0
        L_0x003d:
            r0 = r23 & 8
            if (r0 == 0) goto L_0x017c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r0 = r23 & 16
            if (r0 == 0) goto L_0x0171
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0049:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r0) goto L_0x0068
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x0068
            r3.Evl()
        L_0x0058:
            X.5Xd r0 = r3.ASQ()
            if (r0 == 0) goto L_0x0067
            r17 = 9
            X.JA8 r9 = new X.JA8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A06 = r9
        L_0x0067:
            return
        L_0x0068:
            r3.Ewr()
            r0 = r22 & 1
            if (r0 == 0) goto L_0x0145
            boolean r0 = r3.Aw3()
            if (r0 != 0) goto L_0x0145
            r3.Evl()
            r0 = r23 & 4
            if (r0 == 0) goto L_0x007e
        L_0x007c:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x007e:
            boolean r0 = X.C51967G9n.A1S(r3)
            if (r0 == 0) goto L_0x008c
            r4 = -1968214745(0xffffffff8aaf6d27, float:-1.6892946E-32)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.screens.WallMentionTypeAheadScreen (WallMentionTypeAheadScreen.kt:48)"
            X.0fL.A01(r4, r0)
        L_0x008c:
            X.0Ud r0 = r11.A04
            r9 = 0
            java.lang.Object r8 = X.G9w.A0g(r3, r0, r2)
            X.JwK r8 = (X.C61082JwK) r8
            r0 = 1119879168(0x42c00000, float:96.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A08(r10, r0)
            androidx.compose.ui.Modifier r6 = X.G9t.A0p(r3, r0)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A09
            X.5RD r5 = X.C287675aa.A00(r0, r2)
            int r7 = X.C287425a7.A00(r3)
            r0 = r3
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r4 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r3, r6)
            X.C51973G9u.A0y(r3, r0)
            X.C51971G9r.A12(r3, r5, r4)
            X.0sL r5 = X.C287485aD.A02
            boolean r4 = r0.A0K
            if (r4 != 0) goto L_0x00c6
            boolean r4 = X.C51972G9s.A1Q(r3, r7)
            if (r4 != 0) goto L_0x00c9
        L_0x00c6:
            X.C51971G9r.A13(r3, r5, r7)
        L_0x00c9:
            X.C51965G9l.A18(r3, r6)
            boolean r4 = r8.A01
            if (r4 == 0) goto L_0x0120
            r4 = 1860510750(0x6ee5241e, float:3.5457865E28)
            X.5Qk r4 = X.C51965G9l.A0K(r3, r4)
            androidx.compose.ui.Modifier r18 = X.C287205Zk.A04(r4)
            X.GSc r19 = X.C52423GSb.A01(r3)
            long r22 = X.C51966G9m.A0L(r3)
            r20 = 70
            r21 = r2
            r17 = r3
            X.GQD.A02(r17, r18, r19, r20, r21, r22)
        L_0x00ec:
            X.C286565Wx.A0L(r0, r2)
        L_0x00ef:
            r3.ASN()
            r2 = -1018842181(0xffffffffc345b3bb, float:-197.70207)
            boolean r2 = X.C51967G9n.A1Z(r3, r11, r2)
            boolean r1 = X.C51972G9s.A1M(r1)
            r2 = r2 | r1
            java.lang.Object r1 = r3.ECw()
            if (r2 != 0) goto L_0x0108
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0112
        L_0x0108:
            r2 = 38
            X.MGy r1 = new X.MGy
            r1.<init>(r11, r14, r9, r2)
            r3.FLL(r1)
        L_0x0112:
            boolean r0 = X.C51972G9s.A1S(r3, r0, r1, r14)
            if (r0 == 0) goto L_0x0058
            r0 = -1883701138(0xffffffff8fb9006e, float:-1.8242574E-29)
            X.0fL.A00(r0)
            goto L_0x0058
        L_0x0120:
            java.lang.Object r5 = r8.A00
            java.util.List r5 = (java.util.List) r5
            boolean r4 = X.AnonymousClass7TE.A1b(r5)
            if (r4 == 0) goto L_0x0138
            r4 = 1860726324(0x6ee86e34, float:3.5966875E28)
            r3.ExS(r4)
            int r4 = r1 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            A02(r3, r5, r13, r4)
            goto L_0x00ec
        L_0x0138:
            r4 = 1860855563(0x6eea670b, float:3.6272032E28)
            r3.ExS(r4)
            X.C286565Wx.A0L(r0, r2)
            r12.invoke()
            goto L_0x00ef
        L_0x0145:
            r0 = r23 & 4
            if (r0 == 0) goto L_0x007e
            com.instagram.common.session.UserSession r0 = X.C51968G9o.A0h(r3)
            X.KCQ r8 = new X.KCQ
            r8.<init>(r0)
            X.07g r7 = X.C51975G9x.A0P(r3)
            if (r7 == 0) goto L_0x01a1
            r6 = 0
            X.2YQ r5 = X.C51975G9x.A0Q(r7)
            java.lang.Class<X.Jgs> r4 = X.C60173Jgs.class
            r0 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r3.ExT(r0)
            X.2YL r0 = X.C54765HRx.A00(r8, r7, r5, r4, r6)
            X.2YL r11 = X.C51975G9x.A0O(r0, r3)
            X.Jgs r11 = (X.C60173Jgs) r11
            goto L_0x007c
        L_0x0171:
            r0 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0I(r3, r13)
            r1 = r1 | r0
            goto L_0x0049
        L_0x017c:
            r0 = r15 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0043
            int r0 = X.G9t.A0H(r3, r12)
            r1 = r1 | r0
            goto L_0x0043
        L_0x0187:
            r0 = r22 & 48
            if (r0 != 0) goto L_0x002a
            int r0 = X.G9t.A0P(r3, r14)
            r1 = r1 | r0
            goto L_0x002a
        L_0x0192:
            r0 = r22 & 6
            if (r0 != 0) goto L_0x019e
            int r1 = X.G9t.A0O(r3, r10)
            r1 = r1 | r22
            goto L_0x0024
        L_0x019e:
            r1 = r15
            goto L_0x0024
        L_0x01a1:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3F.A01(X.5Wy, androidx.compose.ui.Modifier, X.Jgs, java.lang.String, X.0sa, X.0sP, int, int):void");
    }
}
