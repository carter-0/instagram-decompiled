package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

public abstract class I6X {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r2 >= 51) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass5Z4 A00(X.C286575Wy r17, java.lang.CharSequence r18, boolean r19) {
        /*
            r8 = 0
            r2 = r18
            X.0qQ.A0B(r2, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r1 = -857343192(0xffffffffcce5fb28, float:-1.2057632E8)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.styleForText (Common.kt:69)"
            X.0fL.A01(r1, r0)
        L_0x0014:
            int r2 = r2.length()
            r0 = 1
            if (r2 != r0) goto L_0x0056
            r1 = 36
        L_0x001d:
            X.5Z4 r4 = X.C51965G9l.A0S(r17)
            r11 = 0
            long r13 = X.AnonymousClass5Z7.A01(r1)
            r3 = 0
            float r2 = (float) r1
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r2 = r2 * r0
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r15 = X.AnonymousClass5Z7.A00(r2, r0)
            r10 = 15597565(0xedfffd, float:2.1856844E-38)
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r8
            X.5Z4 r0 = X.AnonymousClass5Z4.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15)
            r1 = r19 ^ 1
            if (r1 != 0) goto L_0x0049
            X.5Z4 r0 = X.C51965G9l.A0S(r17)
        L_0x0049:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0055
            r1 = -1180123269(0xffffffffb9a8bf7b, float:-3.218612E-4)
            X.0fL.A00(r1)
        L_0x0055:
            return r0
        L_0x0056:
            r1 = 2
            r0 = 21
            if (r1 > r2) goto L_0x0066
            if (r2 >= r0) goto L_0x0060
            r1 = 28
            goto L_0x001d
        L_0x0060:
            r0 = 51
            r1 = 22
            if (r2 < r0) goto L_0x001d
        L_0x0066:
            r1 = 18
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6X.A00(X.5Wy, java.lang.CharSequence, boolean):X.5Z4");
    }

    public static final String A02(C286575Wy r3, WallText wallText) {
        String A01;
        0qQ.A0B(wallText, 0);
        if (0fL.A02()) {
            0fL.A01(1127523867, "com.instagram.wonderwall.ui.compose.components.value (Common.kt:117)");
        }
        if (wallText instanceof WallText.Raw) {
            A01 = ((WallText.Raw) wallText).A00;
        } else if (wallText instanceof WallText.Res) {
            WallText.Res res = (WallText.Res) wallText;
            int i = res.A00;
            String[] strArr = res.A01;
            A01 = C304346Dc.A01(r3, Arrays.copyOf(strArr, strArr.length), i);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (0fL.A02()) {
            0fL.A00(-1551845982);
        }
        return A01;
    }

    public static final void A03(C286575Wy r13, Modifier modifier, AnonymousClass2DO r15, String str, C62320sa r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass2DO r7 = r15;
        C62320sa r9 = r17;
        AnonymousClass7TF.A1C(r15, 0, r9);
        r13.ExV(1348330874);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, r15) | i;
        } else {
            i3 = i5;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, str2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r13, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r9);
        }
        if ((i3 & 1171) != 1170 || !r13.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-16239262, "com.instagram.wonderwall.ui.compose.components.IconButtonOnMedia (Common.kt:43)");
            }
            C287605aT r5 = (C287605aT) C51974G9v.A0V(r13, 2019989951);
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            Modifier A01 = C304766Fd.A01(C287205Zk.A0C(C287635aW.A04(r5, C288245bb.A00(r5, modifier2, 0.3f, true), r9), 26.0f), AnonymousClass5ZN.A00, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5aQ.A00(r13).A0c & 63)], AnonymousClass5RW.A03(AnonymousClass5aQ.A00(r13).A0c), AnonymousClass5RW.A02(AnonymousClass5aQ.A00(r13).A0c), AnonymousClass5RW.A01(AnonymousClass5aQ.A00(r13).A0c), 0.6f));
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r13, A01);
            C51973G9u.A0y(r13, A0H);
            C51971G9r.A12(r13, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A012);
            C288165bT.A07(r13, C287205Zk.A0C(Modifier.A00, 12.0f), r15, str, (i3 & 14) | 384 | (i3 & 112), C51973G9u.A09(r13, C51966G9m.A0E(r13)));
            if (C51967G9n.A1R(r13)) {
                0fL.A00(2027568236);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9N(r7, modifier2, r9, str2, i5, i4, 5);
        }
    }

    public static final void A04(C286575Wy r10, C55817Hnx hnx, int i) {
        int i2;
        String A00;
        0qQ.A0B(hnx, 0);
        C286575Wy r3 = r10;
        r10.ExV(980993503);
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r10, hnx, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-329791675, "com.instagram.wonderwall.ui.compose.components.WallDialog (Common.kt:88)");
            }
            C62320sa r8 = hnx.A04;
            Integer num = hnx.A03;
            r10.ExS(1892521006);
            String str = null;
            if (num == null) {
                A00 = null;
            } else {
                A00 = C304346Dc.A00(r10, num.intValue());
            }
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            Integer num2 = hnx.A02;
            r10.ExS(1892522862);
            if (num2 != null) {
                str = C304346Dc.A00(r10, num2.intValue());
            }
            C286565Wx.A0L(A0H, false);
            C56632I5m.A03(r3, A01(r10, hnx.A00), A01(r10, hnx.A01), A00, str, r8, 0, 3936);
            if (0fL.A02()) {
                0fL.A00(-540319847);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, hnx, i, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
        if (r8 == 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r12.AGt(r0) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r22, com.instagram.wonderwall.model.WallImage r23, java.lang.String r24, float r25, int r26, int r27, long r28) {
        /*
            r9 = r25
            r10 = r24
            r0 = r28
            r5 = 0
            r2 = -31953064(0xfffffffffe186f58, float:-5.0655196E37)
            r12 = r22
            r12.ExV(r2)
            r4 = r27 & 1
            r3 = r23
            r2 = r26
            if (r4 == 0) goto L_0x0135
            r4 = r26 | 6
        L_0x0019:
            r6 = r26 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r27 & 2
            if (r6 != 0) goto L_0x0029
            boolean r7 = r12.AGt(r0)
            r6 = 32
            if (r7 != 0) goto L_0x002b
        L_0x0029:
            r6 = 16
        L_0x002b:
            r4 = r4 | r6
        L_0x002c:
            r11 = r27 & 4
            if (r11 == 0) goto L_0x012a
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r8 = r27 & 8
            if (r8 == 0) goto L_0x011f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r7 = r4 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r7 != r6) goto L_0x0061
            boolean r6 = r12.Bwn()
            if (r6 == 0) goto L_0x0061
            r12.Evl()
        L_0x0047:
            X.5Xd r5 = r12.ASQ()
            if (r5 == 0) goto L_0x0060
            X.J8J r4 = new X.J8J
            r23 = r3
            r24 = r10
            r25 = r9
            r26 = r2
            r28 = r0
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r5.A06 = r4
        L_0x0060:
            return
        L_0x0061:
            r12.Ewr()
            r6 = r26 & 1
            r13 = 0
            if (r6 == 0) goto L_0x0108
            boolean r6 = r12.Aw3()
            if (r6 != 0) goto L_0x0108
            r12.Evl()
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0078
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0078:
            r6 = r9
        L_0x0079:
            boolean r7 = X.C51967G9n.A1S(r12)
            if (r7 == 0) goto L_0x0087
            r8 = -609000757(0xffffffffdbb362cb, float:-1.0098529E17)
            java.lang.String r7 = "com.instagram.wonderwall.ui.compose.components.WallImageView (Common.kt:128)"
            X.0fL.A01(r8, r7)
        L_0x0087:
            boolean r7 = r3 instanceof com.instagram.wonderwall.model.WallImage.Drawable
            if (r7 == 0) goto L_0x00be
            r7 = -803111396(0xffffffffd0217e1c, float:-1.08375859E10)
            r12.ExS(r7)
            r7 = r3
            com.instagram.wonderwall.model.WallImage$Drawable r7 = (com.instagram.wonderwall.model.WallImage.Drawable) r7
            int r7 = r7.A00
            X.2DO r14 = X.C287975bA.A00(r12, r7, r5)
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A0C(r7, r6)
            int r7 = r4 >> 3
            r16 = r7 & 112(0x70, float:1.57E-43)
            int r4 = r4 << 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r16 = r16 | r4
            r9 = r6
            r15 = r10
            r17 = r0
            X.C288165bT.A07(r12, r13, r14, r15, r16, r17)
        L_0x00b1:
            boolean r4 = X.C51970G9q.A1a(r12, r5)
            if (r4 == 0) goto L_0x0047
            r4 = -1541611679(0xffffffffa41cdf61, float:-3.4016317E-17)
            X.0fL.A00(r4)
            goto L_0x0047
        L_0x00be:
            r9 = r6
            boolean r7 = r3 instanceof com.instagram.wonderwall.model.WallImage.CircularAvatar
            if (r7 == 0) goto L_0x0144
            r7 = 873587497(0x3411e329, float:1.3586818E-7)
            r12.ExS(r7)
            r7 = r3
            com.instagram.wonderwall.model.WallImage$CircularAvatar r7 = (com.instagram.wonderwall.model.WallImage.CircularAvatar) r7
            com.instagram.user.model.User r8 = r7.A01
            com.instagram.common.typedurl.ImageUrl r8 = r8.Bh3()
            r21 = 0
            r15 = 0
            X.2DN r14 = X.1zC.A00(r12, r8)
            com.instagram.user.model.User r7 = r7.A00
            if (r7 == 0) goto L_0x0106
            com.instagram.common.typedurl.ImageUrl r8 = r7.Bh3()
        L_0x00e1:
            r7 = -803098954(0xffffffffd021aeb6, float:-1.08503265E10)
            r12.ExS(r7)
            if (r8 == 0) goto L_0x00ed
            X.2DN r15 = X.1zC.A00(r12, r8)
        L_0x00ed:
            X.C51965G9l.A1X(r12, r5)
            r17 = 0
            int r4 = r4 >> 9
            r19 = r4 & 14
            r20 = 1012(0x3f4, float:1.418E-42)
            r18 = r17
            r23 = r21
            r25 = r5
            r26 = r5
            r16 = r6
            X.GSL.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r26)
            goto L_0x00b1
        L_0x0106:
            r8 = r13
            goto L_0x00e1
        L_0x0108:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0116
            long r0 = X.C51966G9m.A0G(r12)
            long r0 = X.C51973G9u.A09(r12, r0)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0116:
            if (r11 == 0) goto L_0x0119
            r10 = r13
        L_0x0119:
            r6 = 1103101952(0x41c00000, float:24.0)
            if (r8 != 0) goto L_0x0079
            goto L_0x0078
        L_0x011f:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0038
            int r6 = X.G9t.A02(r12, r9)
            r4 = r4 | r6
            goto L_0x0038
        L_0x012a:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0032
            int r6 = X.G9t.A0Q(r12, r10)
            r4 = r4 | r6
            goto L_0x0032
        L_0x0135:
            r4 = r26 & 6
            if (r4 != 0) goto L_0x0141
            int r4 = X.G9t.A0O(r12, r3)
            r4 = r4 | r26
            goto L_0x0019
        L_0x0141:
            r4 = r2
            goto L_0x0019
        L_0x0144:
            r0 = -803112799(0xffffffffd02178a1, float:-1.08361492E10)
            X.Wub r0 = X.C51973G9u.A0n(r12, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6X.A05(X.5Wy, com.instagram.wonderwall.model.WallImage, java.lang.String, float, int, int, long):void");
    }

    public static final C53398GnV A01(C286575Wy r4, C55745Hmg hmg) {
        C53398GnV gnV;
        if (0fL.A02()) {
            0fL.A01(-1743215102, "com.instagram.wonderwall.ui.compose.components.dialogAction (Common.kt:104)");
        }
        if (hmg == null) {
            gnV = null;
        } else {
            gnV = new C53398GnV(hmg.A01, A02(r4, hmg.A00), hmg.A02, true);
        }
        if (0fL.A02()) {
            0fL.A00(-1519497444);
        }
        return gnV;
    }
}
