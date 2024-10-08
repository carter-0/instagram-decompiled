package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.I2u  reason: case insensitive filesystem */
public abstract class C56590I2u {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: X.IxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: X.IxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r8 == X.AnonymousClass5XT.A00) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r6 == X.AnonymousClass5XT.A00) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0181, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r26, androidx.compose.ui.Modifier r27, X.C61070Jw8 r28, X.0sP r29, X.0sP r30, int r31, int r32) {
        /*
            r4 = r27
            r10 = 0
            r3 = r28
            r15 = r29
            r14 = r30
            boolean r1 = X.C51973G9u.A1b(r3, r15, r14)
            r0 = 1264827996(0x4b63be5c, float:1.4925404E7)
            r5 = r26
            r5.ExV(r0)
            r25 = r32
            r0 = r32 & 1
            r2 = r31
            if (r0 == 0) goto L_0x01d7
            r9 = r31 | 6
        L_0x001f:
            r0 = r32 & 2
            if (r0 == 0) goto L_0x01cc
            r9 = r9 | 48
        L_0x0025:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x01c1
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x01b6
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0031:
            r6 = r9 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r6 != r0) goto L_0x005c
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x005c
            r5.Evl()
        L_0x0040:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x005b
            r26 = 18
            X.JG8 r0 = new X.JG8
            r21 = r15
            r22 = r14
            r23 = r4
            r24 = r2
            r19 = r0
            r20 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r1.A06 = r0
        L_0x005b:
            return
        L_0x005c:
            if (r7 == 0) goto L_0x0060
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x0060:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006e
            r6 = 1699107479(0x65465297, float:5.8534505E22)
            java.lang.String r0 = "com.instagram.friendmap.view.compose.FriendMapEmojiSelectorContent (FriendMapEmojiSelectorContent.kt:46)"
            X.0fL.A01(r6, r0)
        L_0x006e:
            androidx.compose.foundation.lazy.LazyListState r26 = X.C51967G9n.A0A(r5)
            java.lang.Object r6 = r3.A01
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r0 = -1954498044(0xffffffff8b80ba04, float:-4.958369E-32)
            boolean r0 = X.C51967G9n.A1Y(r5, r6, r0)
            java.lang.Object r8 = r5.ECw()
            r12 = 6
            if (r0 != 0) goto L_0x0088
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r8 != r0) goto L_0x00ac
        L_0x0088:
            java.util.ArrayList r0 = X.00k.A0Q(r6, r12)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0094:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r6 = r7.next()
            r0 = r6
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            X.DbV.A1U(r6, r8, r0)
            goto L_0x0094
        L_0x00a9:
            r5.FLL(r8)
        L_0x00ac:
            X.5Wx r7 = X.C51965G9l.A0H(r5, r10)
            java.lang.Object r11 = r3.A00
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r0 = -1954493096(0xffffffff8b80cd58, float:-4.9612774E-32)
            boolean r0 = X.C51967G9n.A1Y(r5, r11, r0)
            java.lang.Object r6 = r5.ECw()
            if (r0 != 0) goto L_0x00c5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x00e9
        L_0x00c5:
            java.util.ArrayList r0 = X.00k.A0Q(r11, r12)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r0.iterator()
        L_0x00d1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r11 = r12.next()
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            X.DbV.A1U(r11, r6, r0)
            goto L_0x00d1
        L_0x00e6:
            r5.FLL(r6)
        L_0x00e9:
            X.C286565Wx.A0L(r7, r10)
            int r0 = r9 >> 9
            X.5RD r11 = X.C51976G9y.A0D(r5, r0)
            int r13 = X.C287425a7.A00(r5)
            X.5RM r0 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r5, r4)
            X.C51973G9u.A0y(r5, r7)
            X.C51971G9r.A12(r5, r11, r0)
            X.0sL r11 = X.C287485aD.A02
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x0110
            boolean r0 = X.C51972G9s.A1Q(r5, r13)
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            X.C51971G9r.A13(r5, r11, r13)
        L_0x0113:
            X.C51965G9l.A18(r5, r12)
            X.6Et r0 = X.C304676Et.A00
            r11 = -1935255056(0xffffffff8ca659f0, float:-2.563048E-31)
            r5.ExS(r11)
            java.lang.Object r12 = r3.A02
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            if (r12 == r11) goto L_0x0147
            java.lang.String r12 = r3.A03
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            r16 = 0
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0T(r11)
            androidx.compose.ui.Modifier r18 = X.C287195Zj.A03(r11)
            r11 = r9 & 112(0x70, float:1.57E-43)
            r11 = r11 | 384(0x180, float:5.38E-43)
            r24 = 56
            r19 = r16
            r21 = r16
            r20 = r12
            r22 = r15
            r23 = r11
            r17 = r5
            X.C52751Gc3.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0147:
            X.C286565Wx.A0L(r7, r10)
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r10 = r0.A00(r10, r1)
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r28 = X.C51967G9n.A0C(r10, r0)
            r0 = -1935237929(0xffffffff8ca69cd7, float:-2.5670744E-31)
            r5.ExS(r0)
            r10 = r9 & 14
            r0 = 4
            if (r10 == r0) goto L_0x016b
            r0 = r9 & 8
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r5.AGw(r3)
            if (r0 == 0) goto L_0x01b4
        L_0x016b:
            r10 = 1
        L_0x016c:
            boolean r0 = r5.AGw(r6)
            boolean r0 = X.C51968G9o.A1T(r5, r8, r0, r10)
            boolean r9 = X.C51973G9u.A1I(r9)
            r9 = r9 | r0
            java.lang.Object r0 = r5.ECw()
            if (r9 != 0) goto L_0x0183
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r0 != r9) goto L_0x0197
        L_0x0183:
            r17 = 5
            X.IxF r0 = new X.IxF
            r16 = r0
            r18 = r14
            r19 = r3
            r20 = r8
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r5.FLL(r0)
        L_0x0197:
            X.0sP r29 = X.C51965G9l.A0z(r7, r0)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r31 = 124(0x7c, float:1.74E-43)
            r27 = r5
            r32 = r1
            X.AnonymousClass6HY.A04(r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = X.C51967G9n.A1R(r5)
            if (r0 == 0) goto L_0x0040
            r0 = -2003323625(0xffffffff8897b517, float:-9.130556E-34)
            X.0fL.A00(r0)
            goto L_0x0040
        L_0x01b4:
            r10 = 0
            goto L_0x016c
        L_0x01b6:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0031
            int r0 = X.G9t.A0R(r5, r4)
            r9 = r9 | r0
            goto L_0x0031
        L_0x01c1:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002b
            int r0 = X.G9t.A0G(r5, r14)
            r9 = r9 | r0
            goto L_0x002b
        L_0x01cc:
            r0 = r31 & 48
            if (r0 != 0) goto L_0x0025
            int r0 = X.G9t.A0F(r5, r15)
            r9 = r9 | r0
            goto L_0x0025
        L_0x01d7:
            r0 = r31 & 6
            if (r0 != 0) goto L_0x01e7
            boolean r0 = X.G9t.A1T(r5, r3, r2)
            int r9 = X.C51970G9q.A05(r0)
            r9 = r9 | r31
            goto L_0x001f
        L_0x01e7:
            r9 = r2
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56590I2u.A00(X.5Wy, androidx.compose.ui.Modifier, X.Jw8, X.0sP, X.0sP, int, int):void");
    }

    public static final void A01(C286575Wy r18, Modifier modifier, C317486nL r20, 0sP r21, int i) {
        int i2;
        C286575Wy r12 = r18;
        r12.ExV(375196289);
        int i3 = i;
        0sP r3 = r21;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r3) | i;
        } else {
            i2 = i3;
        }
        C317486nL r4 = r20;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r4);
        }
        Modifier modifier2 = modifier;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r12, modifier2);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1603302225, "com.instagram.friendmap.view.compose.EmojiImage (FriendMapEmojiSelectorContent.kt:177)");
            }
            Object A0m = C51967G9n.A0m(r12, 917967394);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r7 = (C284945Oz) C51974G9v.A0Z(r12, A0m, obj, true);
            C286565Wx r6 = (C286565Wx) r12;
            C286565Wx.A0L(r6, false);
            r12.ExS(917969656);
            boolean AGw = r12.AGw(r4) | C51968G9o.A1Q(i2);
            Object ECw = r12.ECw();
            if (AGw || ECw == obj) {
                ECw = new C58185Inp(7, r4, r3);
                r12.FLL(ECw);
            }
            Modifier A0V = C51969G9p.A0V(r6, modifier2, ECw);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r12, A0V);
            C51973G9u.A0y(r12, r6);
            C51971G9r.A12(r12, A0Z, A04);
            0sL r8 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r8, A00);
            }
            C51965G9l.A18(r12, A01);
            String str = r4.A01;
            String str2 = r4.A02;
            SimpleImageUrl A002 = C336957fS.A00(str, str2);
            long A0J = C51966G9m.A0J(r12);
            Object A0m2 = C51967G9n.A0m(r12, 1561666458);
            if (A0m2 == obj) {
                A0m2 = new C58179Inj(r7, 28);
                r12.FLL(A0m2);
            }
            AnonymousClass2DN A02 = 1zC.A02(r12, A002, (C62320sa) null, C51965G9l.A0y(r6, A0m2, false), (C62320sa) null, 3072, 116, A0J, false, false);
            C285245Qk r10 = Modifier.A00;
            AnonymousClass6G3.A0B(r12, C287205Zk.A08(C287205Zk.A0D(r10, 50.0f), 64.0f), A02, str2, 384);
            r12.ExS(1561671264);
            if (C51971G9r.A1W(r7)) {
                GQD.A01(r12, C287205Zk.A0C(r10, 32.0f));
            }
            if (C51971G9r.A1S(r12, r6, false)) {
                0fL.A00(1284376100);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r3, r4, modifier2, i3, 47);
        }
    }

    public static final void A02(C286575Wy r7, Modifier modifier, List list, 0sP r10, int i) {
        int i2;
        r7.ExV(927917758);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r10);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r7, modifier);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-947417297, "com.instagram.friendmap.view.compose.EmojiRow (FriendMapEmojiSelectorContent.kt:153)");
            }
            int size = 6 - list.size();
            Modifier A07 = C287195Zj.A07(modifier, 4.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A05, r7, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, A07);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            Iterator A17 = C51968G9o.A17(r7, list, 1533247273);
            while (A17.hasNext()) {
                A01(r7, C287205Zk.A0C(Modifier.A00, 64.0f), (C317486nL) A17.next(), r10, ((i2 >> 3) & 14) | 384);
            }
            C286565Wx.A0I(r3);
            r7.ExS(1533252793);
            int i3 = 1;
            if (1 <= size) {
                while (true) {
                    C289585dr.A00(r7, C287205Zk.A0C(Modifier.A00, 64.0f));
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
            C286565Wx.A0I(r3);
            if (C51967G9n.A1R(r7)) {
                0fL.A00(-993850263);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r10, list, modifier, i, 48);
        }
    }
}
