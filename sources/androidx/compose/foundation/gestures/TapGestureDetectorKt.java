package androidx.compose.foundation.gestures;

import X.0sK;
import X.0sP;
import X.19E;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass6FR;
import X.C59703JUk;
import X.C60340gF;
import X.GQW;
import X.JTw;

public abstract class TapGestureDetectorKt {
    public static final 0sK A00 = new GQW(2, (AnonymousClass4D7) null);

    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r5 = r11.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r4 >= r5) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r12 = X.C51965G9l.A0P(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r12.A02() != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (X.GPS.A04(r12, ((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r14).A04.A00, r14.B36()) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r0 = X.GWN.Final;
        r10.A01 = r14;
        r10.A02 = r15;
        r10.A00 = 2;
        r1 = r14.AD0(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (r1 != r9) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[LOOP:0: B:11:0x003a->B:14:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[EDGE_INSN: B:41:0x00bb->B:38:0x00bb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004c A[EDGE_INSN: B:42:0x004c->B:16:0x004c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6GK r14, X.GWN r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = 7
            r4 = r16
            boolean r0 = X.C66144MDw.A02(r3, r4)
            if (r0 == 0) goto L_0x00af
            r10 = r4
            X.MDw r10 = (X.C66144MDw) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r10.A03
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            r13 = 0
            r8 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r6) goto L_0x0059
            if (r0 != r8) goto L_0x00b6
            java.lang.Object r15 = r10.A02
            X.GWN r15 = (X.GWN) r15
            java.lang.Object r0 = r10.A01
            X.6GK r14 = X.C51965G9l.A0O(r0, r1)
        L_0x0031:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x003a:
            if (r1 >= r2) goto L_0x004c
            X.GPU r0 = X.C51965G9l.A0P(r3, r1)
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00bb
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0049:
            X.0eS.A00(r1)
        L_0x004c:
            r10.A01 = r14
            r10.A02 = r15
            r10.A00 = r6
            java.lang.Object r1 = r14.AD0(r15, r10)
            if (r1 != r9) goto L_0x0063
            return r9
        L_0x0059:
            java.lang.Object r15 = r10.A02
            X.GWN r15 = (X.GWN) r15
            java.lang.Object r0 = r10.A01
            X.6GK r14 = X.C51965G9l.A0O(r0, r1)
        L_0x0063:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r11 = r1.A03
            int r2 = r11.size()
            r1 = 0
        L_0x006c:
            if (r1 >= r2) goto L_0x00bc
            X.GPU r0 = X.C51965G9l.A0P(r11, r1)
            boolean r0 = X.GPS.A01(r0)
            if (r0 != 0) goto L_0x009d
            int r5 = r11.size()
            r4 = 0
        L_0x007d:
            if (r4 >= r5) goto L_0x00a0
            X.GPU r12 = X.C51965G9l.A0P(r11, r4)
            boolean r0 = r12.A02()
            if (r0 != 0) goto L_0x00bb
            r0 = r14
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            long r2 = r0.A00
            long r0 = r14.B36()
            boolean r0 = X.GPS.A04(r12, r2, r0)
            if (r0 != 0) goto L_0x00bb
            int r4 = r4 + 1
            goto L_0x007d
        L_0x009d:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x00a0:
            X.GWN r0 = X.GWN.Final
            r10.A01 = r14
            r10.A02 = r15
            r10.A00 = r8
            java.lang.Object r1 = r14.AD0(r0, r10)
            if (r1 != r9) goto L_0x0031
            return r9
        L_0x00af:
            X.MDw r10 = new X.MDw
            r10.<init>(r3, r4)
            goto L_0x0017
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bb:
            return r13
        L_0x00bc:
            java.lang.Object r9 = r11.get(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(X.6GK, X.GWN, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071 A[SYNTHETIC] */
    public static final java.lang.Object A01(X.AnonymousClass6GK r9, X.GWN r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r7 = 0
            boolean r0 = X.JUN.A00(r7, r11)
            if (r0 == 0) goto L_0x006b
            r6 = r11
            X.JUN r6 = (X.JUN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r5) goto L_0x0076
            boolean r12 = r6.A04
            java.lang.Object r10 = r6.A02
            X.GWN r10 = (X.GWN) r10
            java.lang.Object r0 = r6.A01
            X.6GK r9 = X.C51965G9l.A0O(r0, r1)
        L_0x002c:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r4 = r1.A03
            int r3 = r4.size()
            r2 = 0
        L_0x0035:
            if (r2 >= r3) goto L_0x0071
            java.lang.Object r1 = r4.get(r2)
            X.GPU r1 = (X.GPU) r1
            if (r12 == 0) goto L_0x0054
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x005c
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x005c
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x005c
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0035
        L_0x0050:
            X.0eS.A00(r1)
            goto L_0x005c
        L_0x0054:
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x005c
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x004d
        L_0x005c:
            r6.A01 = r9
            r6.A02 = r10
            r6.A04 = r12
            r6.A00 = r5
            java.lang.Object r1 = r9.AD0(r10, r6)
            if (r1 != r8) goto L_0x002c
            return r8
        L_0x006b:
            X.JUN r6 = new X.JUN
            r6.<init>(r7, r11)
            goto L_0x0015
        L_0x0071:
            java.lang.Object r0 = r4.get(r7)
            return r0
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(X.6GK, X.GWN, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[LOOP:0: B:10:0x002f->B:11:0x0031, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC] */
    public static final java.lang.Object A02(X.AnonymousClass6GK r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 4
            boolean r0 = X.MEC.A03(r3, r8)
            if (r0 == 0) goto L_0x005d
            r6 = r8
            X.MEC r6 = (X.MEC) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r4) goto L_0x0066
            java.lang.Object r0 = r6.A01
            X.6GK r7 = X.C51965G9l.A0O(r0, r1)
        L_0x0026:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x002f:
            if (r1 >= r2) goto L_0x003b
            X.GPU r0 = X.C51965G9l.A0P(r3, r1)
            r0.A01()
            int r1 = r1 + 1
            goto L_0x002f
        L_0x003b:
            int r2 = r3.size()
            r1 = 0
        L_0x0040:
            if (r1 >= r2) goto L_0x0063
            X.GPU r0 = X.C51965G9l.A0P(r3, r1)
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0050
            int r1 = r1 + 1
            goto L_0x0040
        L_0x004d:
            X.0eS.A00(r1)
        L_0x0050:
            r6.A01 = r7
            r6.A00 = r4
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r7.AD0(r0, r6)
            if (r1 != r5) goto L_0x0026
            return r5
        L_0x005d:
            X.MEC r6 = new X.MEC
            r6.<init>(r3, r8)
            goto L_0x0015
        L_0x0063:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(X.6GK, X.4D7):java.lang.Object");
    }

    public static final Object A03(AnonymousClass6FR r8, AnonymousClass4D7 r9, 0sP r10, 0sP r11, 0sP r12, 0sK r13) {
        0sK r2 = r13;
        Object A002 = 19E.A00(r9, new JTw((Object) r8, (Object) r2, (Object) r11, (Object) r10, (Object) r12, (AnonymousClass4D7) null, 1));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }

    public static final Object A05(AnonymousClass6FR r3, AnonymousClass4D7 r4, 0sP r5, 0sK r6) {
        return A03(r3, r4, (0sP) null, (0sP) null, r5, r6);
    }

    public static final Object A04(AnonymousClass6FR r6, AnonymousClass4D7 r7, 0sP r8, 0sK r9) {
        0sK r1 = r9;
        Object A002 = 19E.A00(r7, new C59703JUk((Object) r1, (Object) new PressGestureScopeImpl(r6), (Object) r8, (Object) r6, (AnonymousClass4D7) null, 1));
        if (A002 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A002;
    }
}
