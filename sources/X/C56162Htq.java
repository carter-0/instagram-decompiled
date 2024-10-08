package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Htq  reason: case insensitive filesystem */
public abstract class C56162Htq {
    public static final void A00(I1S i1s, C286575Wy r12, Modifier modifier, C62320sa r14, 0sP r15, int i, int i2) {
        int i3;
        C286625Xd ASQ;
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r10 = r12;
        r12.ExV(645832757);
        int i5 = i2;
        I1S i1s2 = i1s;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r12, i1s) | i;
        } else {
            i3 = i6;
        }
        C62320sa r5 = r14;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r12, r14);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0Q(r12, modifier);
        }
        0sP r7 = r15;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r15);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-846606578, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:63)");
            }
            HP4 hp4 = (HP4) i1s.A00.getValue();
            if (!(hp4 instanceof C52886GeM)) {
                if (0fL.A02()) {
                    0fL.A00(-1780568114);
                }
                ASQ = r12.ASQ();
                if (ASQ != null) {
                    i4 = 0;
                    ASQ.A06 = new JG8(i1s2, r5, modifier2, r7, i6, i5, i4);
                }
                return;
            }
            boolean AGu = r12.AGu(hp4);
            Object ECw = r12.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = new IH4(AnonymousClass5TW.A01(((C52886GeM) hp4).A00));
                r10.FLL(ECw);
            }
            I68.A03(r10, modifier2, (IH4) ECw, r14, r7, C51969G9p.A04(i3, i3 & 112), 0);
            if (0fL.A02()) {
                0fL.A00(-413824949);
            }
        } else {
            r12.Evl();
        }
        ASQ = r10.ASQ();
        if (ASQ != null) {
            i4 = 1;
            ASQ.A06 = new JG8(i1s2, r5, modifier2, r7, i6, i5, i4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.I1S r14, X.C286575Wy r15, androidx.compose.ui.Modifier r16, X.C62320sa r17, X.0sP r18, X.0sL r19, int r20, int r21, boolean r22) {
        /*
            r2 = r22
            r12 = r16
            r0 = -84584070(0xfffffffffaf5597a, float:-6.3696377E35)
            r3 = r15
            r15.ExV(r0)
            r15 = r21
            r0 = r21 & 1
            r9 = r14
            r14 = r20
            if (r0 == 0) goto L_0x0116
            r0 = r20 | 6
        L_0x0016:
            r1 = r21 & 2
            r10 = r17
            if (r1 == 0) goto L_0x010b
            r0 = r0 | 48
        L_0x001e:
            r1 = r21 & 4
            r11 = r18
            if (r1 == 0) goto L_0x0100
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r6 = r21 & 8
            if (r6 == 0) goto L_0x00f5
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r4 = r21 & 16
            if (r4 == 0) goto L_0x00ea
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0032:
            r5 = r21 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            r13 = r19
            if (r5 != 0) goto L_0x0042
            r1 = r20 & r1
            if (r1 != 0) goto L_0x0043
            int r1 = X.G9t.A0J(r3, r13)
        L_0x0042:
            r0 = r0 | r1
        L_0x0043:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r1) goto L_0x0067
            boolean r1 = r3.Bwn()
            if (r1 == 0) goto L_0x0067
            r3.Evl()
        L_0x0055:
            X.5Xd r0 = r3.ASQ()
            if (r0 == 0) goto L_0x0066
            r16 = 0
            X.JAe r8 = new X.JAe
            r17 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A06 = r8
        L_0x0066:
            return
        L_0x0067:
            if (r6 == 0) goto L_0x006b
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
        L_0x006b:
            r8 = 1
            boolean r2 = X.C51966G9m.A1R(r4, r2)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x007e
            r4 = 1988624797(0x7688019d, float:1.3792678E33)
            java.lang.String r1 = "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)"
            X.0fL.A01(r4, r1)
        L_0x007e:
            if (r2 == 0) goto L_0x00e8
            X.HxZ r7 = X.C56380HxZ.A00
            r6 = 0
            r5 = 2
            r4 = 42
            X.MH2 r1 = new X.MH2
            r1.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r6, (int) r5, (int) r4)
            androidx.compose.ui.Modifier r5 = X.C304916Fs.A00(r12, r7, r1)
        L_0x008f:
            X.5RD r4 = X.C51966G9m.A0a(r8)
            int r6 = X.C287425a7.A00(r3)
            r7 = r3
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r1 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r3, r5)
            X.C51973G9u.A0y(r3, r7)
            X.C51971G9r.A12(r3, r4, r1)
            X.0sL r4 = X.C287485aD.A02
            boolean r1 = r7.A0K
            if (r1 != 0) goto L_0x00b4
            boolean r1 = X.C51972G9s.A1Q(r3, r6)
            if (r1 != 0) goto L_0x00b7
        L_0x00b4:
            X.C51971G9r.A13(r3, r4, r6)
        L_0x00b7:
            X.C51965G9l.A18(r3, r5)
            int r1 = r0 >> 15
            r1 = r1 & 14
            X.C51967G9n.A1P(r3, r13, r1)
            r18 = 0
            int r21 = X.C51965G9l.A01(r0)
            int r0 = r0 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r21 = r21 | r0
            r22 = 4
            r16 = r9
            r17 = r3
            r19 = r10
            r20 = r11
            A00(r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.C51967G9n.A1R(r3)
            if (r0 == 0) goto L_0x0055
            r0 = 1667946625(0x636ad881, float:4.332139E21)
            X.0fL.A00(r0)
            goto L_0x0055
        L_0x00e8:
            r5 = r12
            goto L_0x008f
        L_0x00ea:
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0032
            int r1 = X.G9t.A0c(r3, r2)
            r0 = r0 | r1
            goto L_0x0032
        L_0x00f5:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x002c
            int r1 = X.G9t.A0R(r3, r12)
            r0 = r0 | r1
            goto L_0x002c
        L_0x0100:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0026
            int r1 = X.G9t.A0G(r3, r11)
            r0 = r0 | r1
            goto L_0x0026
        L_0x010b:
            r1 = r20 & 48
            if (r1 != 0) goto L_0x001e
            int r1 = X.G9t.A0F(r3, r10)
            r0 = r0 | r1
            goto L_0x001e
        L_0x0116:
            r0 = r20 & 6
            if (r0 != 0) goto L_0x0122
            int r0 = X.G9t.A0O(r3, r9)
            r0 = r0 | r20
            goto L_0x0016
        L_0x0122:
            r0 = r14
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56162Htq.A01(X.I1S, X.5Wy, androidx.compose.ui.Modifier, X.0sa, X.0sP, X.0sL, int, int, boolean):void");
    }
}
