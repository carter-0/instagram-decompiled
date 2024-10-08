package androidx.compose.foundation.text.selection;

import X.C304926Ft;
import X.C51965G9l;
import java.util.List;

public abstract class SelectionGesturesKt {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[Catch:{ CancellationException -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1 A[Catch:{ CancellationException -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4 A[Catch:{ CancellationException -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C59629JQx r9, X.AnonymousClass6GK r10, X.C304926Ft r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 1
            boolean r0 = X.C66146MDy.A02(r3, r12)
            if (r0 == 0) goto L_0x002b
            r5 = r12
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r7 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 2
            if (r0 == 0) goto L_0x0043
            if (r0 == r3) goto L_0x0036
            if (r0 != r4) goto L_0x0031
            java.lang.Object r9 = r5.A02
            X.JQx r9 = (X.C59629JQx) r9
            java.lang.Object r10 = r5.A01
            X.6GK r10 = (X.AnonymousClass6GK) r10
            goto L_0x00a8
        L_0x002b:
            X.MDy r5 = new X.MDy
            r5.<init>(r12)
            goto L_0x0015
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            java.lang.Object r2 = r5.A03
            X.GPU r2 = (X.GPU) r2
            java.lang.Object r9 = r5.A02
            X.JQx r9 = (X.C59629JQx) r9
            java.lang.Object r10 = r5.A01
            X.6GK r10 = (X.AnonymousClass6GK) r10
            goto L_0x005f
        L_0x0043:
            X.0eS.A00(r7)
            java.util.List r0 = r11.A03     // Catch:{ CancellationException -> 0x00da }
            java.lang.Object r2 = X.00k.A0I(r0)     // Catch:{ CancellationException -> 0x00da }
            X.GPU r2 = (X.GPU) r2     // Catch:{ CancellationException -> 0x00da }
            long r0 = r2.A05     // Catch:{ CancellationException -> 0x00da }
            r5.A01 = r10     // Catch:{ CancellationException -> 0x00da }
            r5.A02 = r9     // Catch:{ CancellationException -> 0x00da }
            r5.A03 = r2     // Catch:{ CancellationException -> 0x00da }
            r5.A00 = r3     // Catch:{ CancellationException -> 0x00da }
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(r10, r5, r0)     // Catch:{ CancellationException -> 0x00da }
            if (r7 != r6) goto L_0x0062
            return r6
        L_0x005f:
            X.0eS.A00(r7)     // Catch:{ CancellationException -> 0x00da }
        L_0x0062:
            X.GPU r7 = (X.GPU) r7     // Catch:{ CancellationException -> 0x00da }
            if (r7 == 0) goto L_0x00d7
            X.5RG r1 = r10.CEf()     // Catch:{ CancellationException -> 0x00da }
            int r0 = r2.A04     // Catch:{ CancellationException -> 0x00da }
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)     // Catch:{ CancellationException -> 0x00da }
            float r8 = r1.C8x()     // Catch:{ CancellationException -> 0x00da }
            if (r0 == 0) goto L_0x0079
            float r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00     // Catch:{ CancellationException -> 0x00da }
            float r8 = r8 * r0
        L_0x0079:
            long r2 = r2.A06     // Catch:{ CancellationException -> 0x00da }
            long r0 = r7.A06     // Catch:{ CancellationException -> 0x00da }
            long r2 = X.C289295dM.A06(r2, r0)     // Catch:{ CancellationException -> 0x00da }
            float r2 = X.C289295dM.A00(r2)     // Catch:{ CancellationException -> 0x00da }
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r2 = X.C51970G9q.A1T(r2)
            if (r2 == 0) goto L_0x00d7
            r9.DmN(r0)     // Catch:{ CancellationException -> 0x00da }
            long r2 = r7.A05     // Catch:{ CancellationException -> 0x00da }
            r0 = 16
            X.J6M r1 = X.J6M.A00(r9, r0)     // Catch:{ CancellationException -> 0x00da }
            r5.A01 = r10     // Catch:{ CancellationException -> 0x00da }
            r5.A02 = r9     // Catch:{ CancellationException -> 0x00da }
            r0 = 0
            r5.A03 = r0     // Catch:{ CancellationException -> 0x00da }
            r5.A00 = r4     // Catch:{ CancellationException -> 0x00da }
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r10, r5, r1, r2)     // Catch:{ CancellationException -> 0x00da }
            if (r7 != r6) goto L_0x00ab
            return r6
        L_0x00a8:
            X.0eS.A00(r7)     // Catch:{ CancellationException -> 0x00da }
        L_0x00ab:
            boolean r0 = X.AnonymousClass7TE.A1a(r7)     // Catch:{ CancellationException -> 0x00da }
            if (r0 == 0) goto L_0x00d4
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r10 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r10     // Catch:{ CancellationException -> 0x00da }
            X.6FP r0 = r10.A04     // Catch:{ CancellationException -> 0x00da }
            X.6Ft r0 = r0.A01     // Catch:{ CancellationException -> 0x00da }
            java.util.List r4 = r0.A03     // Catch:{ CancellationException -> 0x00da }
            r3 = 0
            int r2 = r4.size()     // Catch:{ CancellationException -> 0x00da }
        L_0x00be:
            if (r3 >= r2) goto L_0x00d0
            X.GPU r1 = X.C51965G9l.A0P(r4, r3)     // Catch:{ CancellationException -> 0x00da }
            boolean r0 = X.GPS.A01(r1)     // Catch:{ CancellationException -> 0x00da }
            if (r0 == 0) goto L_0x00cd
            r1.A01()     // Catch:{ CancellationException -> 0x00da }
        L_0x00cd:
            int r3 = r3 + 1
            goto L_0x00be
        L_0x00d0:
            r9.onStop()     // Catch:{ CancellationException -> 0x00da }
            goto L_0x00d7
        L_0x00d4:
            r9.onCancel()     // Catch:{ CancellationException -> 0x00da }
        L_0x00d7:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x00da:
            r0 = move-exception
            r9.onCancel()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A00(X.JQx, X.6GK, X.6Ft, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[SYNTHETIC] */
    public static final java.lang.Object A02(X.AnonymousClass6GK r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 7
            boolean r0 = X.MEC.A03(r3, r10)
            if (r0 == 0) goto L_0x0050
            r8 = r10
            X.MEC r8 = (X.MEC) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0015:
            java.lang.Object r7 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r5) goto L_0x0057
            java.lang.Object r0 = r8.A01
            X.6GK r9 = X.C51965G9l.A0O(r0, r7)
        L_0x0026:
            X.6Ft r7 = (X.C304926Ft) r7
            java.util.List r4 = r7.A03
            int r3 = r4.size()
            r2 = 0
        L_0x002f:
            if (r2 >= r3) goto L_0x0056
            X.GPU r1 = X.C51965G9l.A0P(r4, r2)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0043
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0040:
            X.0eS.A00(r7)
        L_0x0043:
            X.GWN r0 = X.GWN.Main
            r8.A01 = r9
            r8.A00 = r5
            java.lang.Object r7 = r9.AD0(r0, r8)
            if (r7 != r6) goto L_0x0026
            return r6
        L_0x0050:
            X.MEC r8 = new X.MEC
            r8.<init>(r3, r10)
            goto L_0x0015
        L_0x0056:
            return r7
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(X.6GK, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C55693Hlq r16, X.JLM r17, X.AnonymousClass6GK r18, X.C304926Ft r19, X.AnonymousClass4D7 r20) {
        /*
            r6 = r18
            r3 = 8
            r4 = r20
            boolean r0 = X.C66144MDw.A02(r3, r4)
            if (r0 == 0) goto L_0x0106
            r5 = r4
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0106
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r5.A03
            X.1Hj r12 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 0
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 == r7) goto L_0x0112
            if (r0 != r8) goto L_0x010d
            java.lang.Object r0 = r5.A01
            X.6GK r6 = X.C51965G9l.A0O(r0, r2)
        L_0x002f:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 == 0) goto L_0x013c
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r6 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6
            X.6FP r0 = r6.A04
            X.6Ft r0 = r0.A01
            java.util.List r3 = r0.A03
            int r2 = r3.size()
        L_0x0041:
            if (r4 >= r2) goto L_0x013c
            X.GPU r1 = X.C51965G9l.A0P(r3, r4)
            boolean r0 = X.GPS.A01(r1)
            if (r0 == 0) goto L_0x0050
            r1.A01()
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0053:
            X.0eS.A00(r2)
            r11 = r16
            X.GPU r14 = r11.A01
            r0 = r19
            java.util.List r10 = r0.A03
            X.GPU r9 = X.C51965G9l.A0P(r10, r4)
            if (r14 == 0) goto L_0x0103
            long r2 = r9.A0A
            long r0 = r14.A0A
            long r2 = r2 - r0
            X.5RG r1 = r11.A02
            long r15 = r1.Ayj()
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0103
            int r0 = r14.A04
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r8)
            float r13 = r1.C8x()
            if (r0 == 0) goto L_0x0082
            float r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r13 = r13 * r0
        L_0x0082:
            long r2 = r14.A06
            long r0 = r9.A06
            long r0 = X.C289295dM.A06(r2, r0)
            float r0 = X.C289295dM.A00(r0)
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0103
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
        L_0x0098:
            r11.A01 = r9
            X.GPU r3 = X.C51965G9l.A0P(r10, r4)
            int r0 = r11.A00
            if (r0 == r7) goto L_0x0100
            if (r0 == r8) goto L_0x00fd
            X.JRo r14 = X.C56491HzN.A02
        L_0x00a6:
            long r0 = r3.A06
            r2 = r17
            r13 = r2
            X.IFe r13 = (X.C56857IFe) r13
            X.Gb5 r10 = r13.A00
            X.5Oz r9 = r10.A0J
            boolean r9 = X.C51971G9r.A1W(r9)
            if (r9 == 0) goto L_0x013c
            X.5Oz r11 = r10.A0K
            int r9 = X.C51973G9u.A05(r11)
            if (r9 == 0) goto L_0x013c
            X.Gc7 r9 = r10.A03
            if (r9 == 0) goto L_0x013c
            X.5Oz r9 = r9.A0C
            java.lang.Object r9 = r9.getValue()
            if (r9 == 0) goto L_0x013c
            X.I1b r9 = r10.A04
            if (r9 == 0) goto L_0x00d2
            r9.A01()
        L_0x00d2:
            r10.A01 = r0
            r0 = -1
            r10.A00 = r0
            r10.A0E(r7)
            X.5Tl r15 = X.C51966G9m.A0i(r11)
            long r0 = r10.A01
            r18 = r7
            r16 = r0
            r13.A00(r14, r15, r16, r18)
            long r0 = r3.A05
            r7 = 42
            X.J6U r3 = new X.J6U
            r3.<init>(r7, r2, r14)
            r5.A01 = r6
            r5.A02 = r2
            r5.A00 = r8
            java.lang.Object r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r6, r5, r3, r0)
            if (r2 != r12) goto L_0x002f
            return r12
        L_0x00fd:
            X.JRo r14 = X.C56491HzN.A03
            goto L_0x00a6
        L_0x0100:
            X.JRo r14 = X.C56491HzN.A01
            goto L_0x00a6
        L_0x0103:
            r11.A00 = r7
            goto L_0x0098
        L_0x0106:
            X.MDw r5 = new X.MDw
            r5.<init>(r3, r4)
            goto L_0x001a
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0112:
            java.lang.Object r0 = r5.A01
            X.6GK r1 = X.C51965G9l.A0O(r0, r2)
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 == 0) goto L_0x013c
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r1
            X.6FP r0 = r1.A04
            X.6Ft r0 = r0.A01
            java.util.List r3 = r0.A03
            int r2 = r3.size()
        L_0x012a:
            if (r4 >= r2) goto L_0x013c
            X.GPU r1 = X.C51965G9l.A0P(r3, r4)
            boolean r0 = X.GPS.A01(r1)
            if (r0 == 0) goto L_0x0139
            r1.A01()
        L_0x0139:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x013c:
            X.0gF r12 = X.C60340gF.A00
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A01(X.Hlq, X.JLM, X.6GK, X.6Ft, X.4D7):java.lang.Object");
    }

    public static final boolean A03(C304926Ft r5) {
        List list = r5.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C51965G9l.A0P(list, i).A04 != 2) {
                return false;
            }
        }
        return true;
    }
}
