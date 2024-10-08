package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.Alignment;

public abstract class I5L {
    public static final C267314bM A00 = new C286765Xs(C289465dd.A00(), C58255Ioy.A00);

    public static final void A00(C286575Wy r14, Alignment alignment, C56020HrS hrS, C62320sa r17, 0sL r18, int i, int i2, long j) {
        int i3;
        C56020HrS hrS2 = hrS;
        C62320sa r11 = r17;
        long j2 = j;
        Alignment alignment2 = alignment;
        C286575Wy r3 = r14;
        r14.ExV(295309329);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r3, alignment2) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0C(r3, j2);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r3, r11);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0R(r3, hrS2);
        }
        0sL r13 = r18;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i3 |= G9t.A0I(r3, r13);
        }
        if ((i3 & 9363) != 9362 || !r3.Bwn()) {
            if (i5 != 0) {
                alignment2 = C287215Zl.A0E;
            }
            if (i7 != 0) {
                j2 = C51971G9r.A0J();
            }
            if (i8 != 0) {
                r11 = null;
            }
            if (i9 != 0) {
                hrS2 = new C56020HrS(false, true);
            }
            if (0fL.A02()) {
                0fL.A01(50611481, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            boolean A1G = C51973G9u.A1G(i3) | C51972G9s.A1M(i3);
            Object ECw = r3.ECw();
            if (A1G || ECw == AnonymousClass5XT.A00) {
                ECw = new IH5(alignment2, j2);
                r3.FLL(ECw);
            }
            int i10 = i3 >> 3;
            A01(r3, (IH5) ECw, hrS2, r11, r13, C51969G9p.A04(i10, i10 & 112), 0);
            if (0fL.A02()) {
                0fL.A00(-260264653);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59193J9x(alignment2, r11, hrS2, r13, i6, i4, 0, j2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.window.PopupLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: X.Pmh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: X.IoO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.IoO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.Pmh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: androidx.compose.ui.window.PopupLayout} */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        if (r1 == r12) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        r17 = new X.C73963Pmh(r5, r7, r2, r24, r6, 0);
        r10.FLL(r17);
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0112, code lost:
        X.C286645Xf.A03(r10, r2, (X.0sP) r1);
        r4 = X.C51972G9s.A1X(r10, r6, r5, (X.AnonymousClass7TF.A1S(r4, 32) | r10.AGw(r2)) | X.AnonymousClass7TF.A1S(r14, 256));
        r1 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012d, code lost:
        if (r4 != false) goto L_0x0131;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012f, code lost:
        if (r1 != r12) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0131, code lost:
        r17 = new X.C58220IoO(r2, r24, r7, r5, r6, 0);
        r10.FLL(r17);
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0147, code lost:
        X.C286645Xf.A05(r10, (X.C62320sa) r1);
        r1 = X.C51975G9x.A1N(r0) | r10.AGw(r2);
        r0 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0159, code lost:
        if (r1 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015b, code lost:
        if (r0 != r12) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015d, code lost:
        r0 = new X.TYA(7, (java.lang.Object) r9, (java.lang.Object) r2);
        r10.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0166, code lost:
        X.C286645Xf.A03(r10, r9, (X.0sP) r0);
        r1 = r10.AGw(r2);
        r0 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0173, code lost:
        if (r1 != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0175, code lost:
        if (r0 != r12) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0177, code lost:
        r0 = new X.MH2((java.lang.Object) r2, (X.AnonymousClass4D7) null, 22, 42);
        r10.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0183, code lost:
        X.C286645Xf.A04(r10, r2, (X.0sL) r0);
        r3 = androidx.compose.ui.Modifier.A00;
        r1 = r10.AGw(r2);
        r0 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0192, code lost:
        if (r1 != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0194, code lost:
        if (r0 != r12) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0196, code lost:
        r0 = X.J6M.A00(r2, 43);
        r10.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019f, code lost:
        r6 = X.C51970G9q.A0W(r3, (X.0sP) r0);
        r0 = X.C51965G9l.A1Z(r10, r5, r10.AGw(r2));
        r1 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b1, code lost:
        if (r0 != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b3, code lost:
        if (r1 != r12) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b5, code lost:
        r1 = new X.IGS(1, r5, r2);
        r10.FLL(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01be, code lost:
        r4 = X.C287425a7.A00(r10);
        r3 = (X.C286565Wx) r10;
        r0 = X.C286565Wx.A04(r3);
        r2 = X.C287435a8.A01(r10, r6);
        X.C51973G9u.A0y(r10, r3);
        X.C51971G9r.A12(r10, r1, r0);
        r1 = X.C287485aD.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d7, code lost:
        if (r3.A0K != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01dd, code lost:
        if (X.C51972G9s.A1Q(r10, r4) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01df, code lost:
        X.C51971G9r.A13(r10, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e2, code lost:
        X.C51965G9l.A18(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e9, code lost:
        if (X.C51967G9n.A1R(r10) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01eb, code lost:
        X.0fL.A00(1125916248);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r26, X.C59529JNb r27, X.C56020HrS r28, X.C62320sa r29, X.0sL r30, int r31, int r32) {
        /*
            r7 = r28
            r24 = r29
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r10 = r26
            r10.ExV(r0)
            r25 = r32
            r0 = r32 & 1
            r9 = r27
            r8 = r31
            if (r0 == 0) goto L_0x0218
            r0 = r31 | 6
        L_0x0018:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x020b
            r0 = r0 | 48
        L_0x001e:
            r3 = r32 & 4
            if (r3 == 0) goto L_0x0200
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r1 = r32 & 8
            r32 = r30
            if (r1 == 0) goto L_0x01f3
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r2 = r0 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r2 != r1) goto L_0x0057
            boolean r1 = r10.Bwn()
            if (r1 == 0) goto L_0x0057
            r10.Evl()
        L_0x003b:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x0056
            r26 = 4
            X.JG8 r0 = new X.JG8
            r19 = r0
            r20 = r7
            r21 = r9
            r22 = r24
            r23 = r32
            r24 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r1.A06 = r0
        L_0x0056:
            return
        L_0x0057:
            r1 = 0
            if (r4 == 0) goto L_0x005c
            r24 = r1
        L_0x005c:
            if (r3 == 0) goto L_0x0065
            X.HrS r7 = new X.HrS
            r2 = 0
            r1 = 1
            r7.<init>(r2, r1)
        L_0x0065:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0073
            r2 = 1340569484(0x4fe7778c, float:7.766743E9)
            java.lang.String r1 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)"
            X.0fL.A01(r2, r1)
        L_0x0073:
            X.4bM r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A03
            java.lang.Object r1 = r10.AJO(r1)
            android.view.View r1 = (android.view.View) r1
            X.4cd r19 = X.C51970G9q.A0a(r10)
            X.4bM r2 = A00
            java.lang.Object r6 = r10.AJO(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = X.C51966G9m.A15(r10)
            r16 = 0
            X.5Q1 r15 = X.C287425a7.A01(r10)
            r2 = r32
            X.5Oz r4 = X.C287175Zh.A00(r10, r2)
            r2 = r16
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            X.Ioz r28 = X.C58256Ioz.A00
            r30 = 3072(0xc00, float:4.305E-42)
            r31 = 6
            r27 = r3
            r29 = r2
            java.lang.Object r13 = X.C305136Gr.A00(r26, r27, r28, r29, r30, r31)
            java.util.UUID r13 = (java.util.UUID) r13
            java.lang.Object r2 = r10.ECw()
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            r11 = 32
            if (r2 != r12) goto L_0x00dc
            androidx.compose.ui.window.PopupLayout r2 = new androidx.compose.ui.window.PopupLayout
            r20 = r9
            r21 = r7
            r22 = r6
            r23 = r13
            r17 = r2
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r14 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r13 = 8
            X.JGF r1 = new X.JGF
            r1.<init>(r13, r4, r2)
            r4 = 1
            X.5PJ r1 = X.AnonymousClass5PI.A04(r1, r14, r4)
            r2.setContent(r15, r1)
            r10.FLL(r2)
        L_0x00dc:
            boolean r1 = r10.AGw(r2)
            r4 = r0 & 112(0x70, float:1.57E-43)
            boolean r13 = X.AnonymousClass7TF.A1S(r4, r11)
            r1 = r1 | r13
            r14 = r0 & 896(0x380, float:1.256E-42)
            r13 = 256(0x100, float:3.59E-43)
            boolean r15 = X.AnonymousClass7TF.A1S(r14, r13)
            r1 = r1 | r15
            boolean r15 = X.C51972G9s.A1X(r10, r6, r5, r1)
            java.lang.Object r1 = r10.ECw()
            if (r15 != 0) goto L_0x00fc
            if (r1 != r12) goto L_0x0112
        L_0x00fc:
            X.Pmh r1 = new X.Pmh
            r17 = r1
            r18 = r5
            r19 = r7
            r20 = r2
            r21 = r24
            r22 = r6
            r23 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r10.FLL(r1)
        L_0x0112:
            X.0sP r1 = (X.0sP) r1
            X.C286645Xf.A03(r10, r2, r1)
            boolean r1 = r10.AGw(r2)
            boolean r4 = X.AnonymousClass7TF.A1S(r4, r11)
            r4 = r4 | r1
            boolean r1 = X.AnonymousClass7TF.A1S(r14, r13)
            r4 = r4 | r1
            boolean r4 = X.C51972G9s.A1X(r10, r6, r5, r4)
            java.lang.Object r1 = r10.ECw()
            if (r4 != 0) goto L_0x0131
            if (r1 != r12) goto L_0x0147
        L_0x0131:
            X.IoO r1 = new X.IoO
            r17 = r1
            r18 = r2
            r19 = r24
            r20 = r7
            r21 = r5
            r22 = r6
            r23 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r10.FLL(r1)
        L_0x0147:
            X.0sa r1 = (X.C62320sa) r1
            X.C286645Xf.A05(r10, r1)
            boolean r4 = r10.AGw(r2)
            boolean r1 = X.C51975G9x.A1N(r0)
            r1 = r1 | r4
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x015d
            if (r0 != r12) goto L_0x0166
        L_0x015d:
            r1 = 7
            X.TYA r0 = new X.TYA
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r2)
            r10.FLL(r0)
        L_0x0166:
            X.0sP r0 = (X.0sP) r0
            X.C286645Xf.A03(r10, r9, r0)
            boolean r1 = r10.AGw(r2)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x0177
            if (r0 != r12) goto L_0x0183
        L_0x0177:
            r4 = 22
            r1 = 42
            X.MH2 r0 = new X.MH2
            r0.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r3, (int) r4, (int) r1)
            r10.FLL(r0)
        L_0x0183:
            X.0sL r0 = (X.0sL) r0
            X.C286645Xf.A04(r10, r2, r0)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            boolean r1 = r10.AGw(r2)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x0196
            if (r0 != r12) goto L_0x019f
        L_0x0196:
            r0 = 43
            X.J6M r0 = X.J6M.A00(r2, r0)
            r10.FLL(r0)
        L_0x019f:
            X.0sP r0 = (X.0sP) r0
            androidx.compose.ui.Modifier r6 = X.C51970G9q.A0W(r3, r0)
            boolean r0 = r10.AGw(r2)
            boolean r0 = X.C51965G9l.A1Z(r10, r5, r0)
            java.lang.Object r1 = r10.ECw()
            if (r0 != 0) goto L_0x01b5
            if (r1 != r12) goto L_0x01be
        L_0x01b5:
            r0 = 1
            X.IGS r1 = new X.IGS
            r1.<init>(r0, r5, r2)
            r10.FLL(r1)
        L_0x01be:
            int r4 = X.C287425a7.A00(r10)
            r3 = r10
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r10, r6)
            X.C51973G9u.A0y(r10, r3)
            X.C51971G9r.A12(r10, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x01df
            boolean r0 = X.C51972G9s.A1Q(r10, r4)
            if (r0 != 0) goto L_0x01e2
        L_0x01df:
            X.C51971G9r.A13(r10, r1, r4)
        L_0x01e2:
            X.C51965G9l.A18(r10, r2)
            boolean r0 = X.C51967G9n.A1R(r10)
            if (r0 == 0) goto L_0x003b
            r0 = 1125916248(0x431c1e58, float:156.11853)
            X.0fL.A00(r0)
            goto L_0x003b
        L_0x01f3:
            r1 = r8 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x002c
            r1 = r32
            int r1 = X.G9t.A0H(r10, r1)
            r0 = r0 | r1
            goto L_0x002c
        L_0x0200:
            r1 = r8 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0024
            int r1 = X.G9t.A0Q(r10, r7)
            r0 = r0 | r1
            goto L_0x0024
        L_0x020b:
            r1 = r31 & 48
            if (r1 != 0) goto L_0x001e
            r1 = r24
            int r1 = X.G9t.A0F(r10, r1)
            r0 = r0 | r1
            goto L_0x001e
        L_0x0218:
            r0 = r31 & 6
            if (r0 != 0) goto L_0x0224
            int r0 = X.G9t.A0O(r10, r9)
            r0 = r0 | r31
            goto L_0x0018
        L_0x0224:
            r0 = r8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5L.A01(X.5Wy, X.JNb, X.HrS, X.0sa, X.0sL, int, int):void");
    }

    public static final boolean A02(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
