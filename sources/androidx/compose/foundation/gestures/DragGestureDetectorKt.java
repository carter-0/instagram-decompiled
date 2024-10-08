package androidx.compose.foundation.gestures;

import X.0sL;
import X.0sP;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass6FR;
import X.AnonymousClass6Gj;
import X.C304926Ft;
import X.C58247Ioq;
import X.C60340gF;
import X.C62320sa;
import X.GPU;
import X.J6G;
import X.JJQ;
import java.util.List;

public abstract class DragGestureDetectorKt {
    public static final float A00 = (0.125f / 18.0f);

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (X.C289295dM.A06(r8.A06, r8.A07) == 0) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0047 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6GK r14, X.AnonymousClass4D7 r15, long r16) {
        /*
            r6 = 1
            boolean r0 = X.C66144MDw.A02(r6, r15)
            if (r0 == 0) goto L_0x00a8
            r5 = r15
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a8
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r13 = 0
            if (r0 == 0) goto L_0x0076
            if (r0 != r6) goto L_0x00af
            java.lang.Object r7 = r5.A02
            X.0rl r7 = (X.0rl) r7
            java.lang.Object r0 = r5.A01
            X.6GK r14 = X.C51965G9l.A0O(r0, r1)
        L_0x002a:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r9 = r1.A03
            int r12 = r9.size()
            r11 = 0
        L_0x0033:
            if (r11 >= r12) goto L_0x0047
            java.lang.Object r8 = r9.get(r11)
            r0 = r8
            X.GPU r0 = (X.GPU) r0
            long r2 = r0.A05
            long r0 = r7.A00
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0048
            int r11 = r11 + 1
            goto L_0x0033
        L_0x0047:
            r8 = r13
        L_0x0048:
            X.GPU r8 = (X.GPU) r8
            if (r8 == 0) goto L_0x00bb
            boolean r0 = X.GPS.A02(r8)
            if (r0 == 0) goto L_0x0067
            int r3 = r9.size()
            r2 = 0
        L_0x0057:
            if (r2 >= r3) goto L_0x0090
            java.lang.Object r1 = r9.get(r2)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0091
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0067:
            long r2 = r8.A07
            long r0 = r8.A06
            long r9 = X.C289295dM.A06(r0, r2)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            goto L_0x0099
        L_0x0076:
            X.0eS.A00(r1)
            r0 = r14
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            X.6Ft r0 = r0.A01
            r1 = r16
            boolean r0 = A08(r0, r1)
            if (r0 != 0) goto L_0x00bb
            X.0rl r7 = new X.0rl
            r7.<init>()
            r7.A00 = r1
            goto L_0x0099
        L_0x0090:
            r1 = r13
        L_0x0091:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x00b4
            long r0 = r1.A05
            r7.A00 = r0
        L_0x0099:
            r5.A01 = r14
            r5.A02 = r7
            r5.A00 = r6
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r14.AD0(r0, r5)
            if (r1 != r4) goto L_0x002a
            return r4
        L_0x00a8:
            X.MDw r5 = new X.MDw
            r5.<init>(r6, r15)
            goto L_0x0015
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b4:
            boolean r0 = r8.A02()
            if (r0 != 0) goto L_0x00bb
            return r8
        L_0x00bb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(X.6GK, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass6GK r11, X.AnonymousClass4D7 r12, long r13) {
        /*
            r3 = 2
            boolean r0 = X.C66144MDw.A02(r3, r12)
            if (r0 == 0) goto L_0x0028
            r7 = r12
            X.MDw r7 = (X.C66144MDw) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r8 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 != r8) goto L_0x0032
            java.lang.Object r9 = r7.A02
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r5 = r7.A01
            goto L_0x002e
        L_0x0028:
            X.MDw r7 = new X.MDw
            r7.<init>(r3, r12)
            goto L_0x0015
        L_0x002e:
            X.0eS.A00(r2)     // Catch:{ TSe -> 0x008d }
            return r0
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0037:
            X.0eS.A00(r2)
            r1 = r11
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r1
            X.6FP r2 = r1.A04
            X.6Ft r1 = r2.A01
            boolean r1 = A08(r1, r13)
            if (r1 != 0) goto L_0x0092
            X.6Ft r1 = r2.A01
            java.util.List r10 = r1.A03
            r9 = 0
            int r4 = r10.size()
        L_0x0050:
            if (r9 >= r4) goto L_0x0066
            java.lang.Object r5 = r10.get(r9)
            r1 = r5
            X.GPU r1 = (X.GPU) r1
            long r1 = r1.A05
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1Q(r3)
            if (r1 != 0) goto L_0x0067
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0066:
            r5 = r0
        L_0x0067:
            if (r5 == 0) goto L_0x0092
            X.0rm r9 = X.C51965G9l.A11()
            X.0rm r4 = X.C51965G9l.A11()
            r4.A00 = r5
            X.5RG r1 = r11.CEf()
            long r2 = r1.BOW()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ TSe -> 0x008d }
            r1.<init>(r0, r4, r9)     // Catch:{ TSe -> 0x008d }
            r7.A01 = r5     // Catch:{ TSe -> 0x008d }
            r7.A02 = r9     // Catch:{ TSe -> 0x008d }
            r7.A00 = r8     // Catch:{ TSe -> 0x008d }
            java.lang.Object r1 = r11.FNY(r7, r1, r2)     // Catch:{ TSe -> 0x008d }
            if (r1 != r6) goto L_0x0092
            return r6
        L_0x008d:
            java.lang.Object r0 = r9.A00
            if (r0 != 0) goto L_0x0092
            return r5
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(X.6GK, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass6GK r5, X.AnonymousClass4D7 r6, X.0sP r7, long r8) {
        /*
            r3 = 3
            boolean r0 = X.C66144MDw.A02(r3, r6)
            if (r0 == 0) goto L_0x0050
            r4 = r6
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x0056
            java.lang.Object r7 = r4.A02
            X.0sP r7 = (X.0sP) r7
            java.lang.Object r0 = r4.A01
            X.6GK r5 = X.C51965G9l.A0O(r0, r3)
        L_0x002a:
            X.GPU r3 = (X.GPU) r3
            if (r3 != 0) goto L_0x0034
            r1 = 0
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0034:
            boolean r0 = X.GPS.A02(r3)
            if (r0 != 0) goto L_0x002f
            r7.invoke(r3)
            long r8 = r3.A05
            goto L_0x0043
        L_0x0040:
            X.0eS.A00(r3)
        L_0x0043:
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r1
            java.lang.Object r3 = A00(r5, r4, r8)
            if (r3 != r2) goto L_0x002a
            return r2
        L_0x0050:
            X.MDw r4 = new X.MDw
            r4.<init>(r3, r6)
            goto L_0x0015
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(X.6GK, X.4D7, X.0sP, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r2 == 0.0f) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (A08(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6).A04.A01, r1) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0056 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass6GK r12, X.AnonymousClass4D7 r13, X.0sP r14, long r15) {
        /*
            r6 = r12
            r1 = r15
            r5 = r14
            r7 = 0
            r9 = r13
            boolean r0 = X.ME0.A02(r7, r13)
            if (r0 == 0) goto L_0x00e5
            r8 = r9
            X.ME0 r8 = (X.ME0) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00e5
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0019:
            java.lang.Object r3 = r8.A06
            X.1Hj r12 = X.1Hj.A02
            int r0 = r8.A00
            r10 = 1
            if (r0 == 0) goto L_0x0098
            if (r0 != r10) goto L_0x00ec
            java.lang.Object r7 = r8.A05
            X.0rl r7 = (X.0rl) r7
            java.lang.Object r9 = r8.A04
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r0 = r8.A03
            java.lang.Object r6 = r8.A02
            X.6GK r6 = (X.AnonymousClass6GK) r6
            java.lang.Object r5 = r8.A01
            X.0sP r5 = (X.0sP) r5
            X.0eS.A00(r3)
        L_0x0039:
            X.6Ft r3 = (X.C304926Ft) r3
            java.util.List r13 = r3.A03
            int r15 = r13.size()
            r14 = 0
        L_0x0042:
            if (r14 >= r15) goto L_0x0056
            java.lang.Object r11 = r13.get(r14)
            r1 = r11
            X.GPU r1 = (X.GPU) r1
            long r3 = r1.A05
            long r1 = r7.A00
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 == 0) goto L_0x0057
            int r14 = r14 + 1
            goto L_0x0042
        L_0x0056:
            r11 = 0
        L_0x0057:
            X.GPU r11 = (X.GPU) r11
            if (r11 == 0) goto L_0x00aa
            boolean r14 = X.GPS.A02(r11)
            if (r14 == 0) goto L_0x0076
            int r4 = r13.size()
            r3 = 0
        L_0x0066:
            if (r3 >= r4) goto L_0x00c7
            java.lang.Object r2 = r13.get(r3)
            r1 = r2
            X.GPU r1 = (X.GPU) r1
            boolean r1 = r1.A0B
            if (r1 != 0) goto L_0x00c8
            int r3 = r3 + 1
            goto L_0x0066
        L_0x0076:
            long r3 = r11.A07
            long r1 = r11.A06
            long r2 = X.C289295dM.A06(r1, r3)
            if (r0 != 0) goto L_0x008a
            float r2 = X.C289295dM.A00(r2)
        L_0x0084:
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b0
            goto L_0x00d0
        L_0x008a:
            X.6Gj r1 = X.AnonymousClass6Gj.Vertical
            if (r0 != r1) goto L_0x0093
            float r2 = X.C289295dM.A02(r2)
            goto L_0x0084
        L_0x0093:
            float r2 = X.C289295dM.A01(r2)
            goto L_0x0084
        L_0x0098:
            X.0eS.A00(r3)
            X.6Gj r0 = X.AnonymousClass6Gj.Horizontal
            r3 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r3 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r3
            X.6FP r3 = r3.A04
            X.6Ft r3 = r3.A01
            boolean r3 = A08(r3, r1)
            if (r3 == 0) goto L_0x00be
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x00b0:
            r2 = 1
            boolean r1 = r11.A02()
            if (r1 != 0) goto L_0x00aa
            if (r14 != 0) goto L_0x00ab
            r5.invoke(r11)
            long r1 = r11.A05
        L_0x00be:
            X.0rl r7 = new X.0rl
            r7.<init>()
            r7.A00 = r1
            r9 = r6
            goto L_0x00d0
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            X.GPU r2 = (X.GPU) r2
            if (r2 == 0) goto L_0x00b0
            long r1 = r2.A05
            r7.A00 = r1
        L_0x00d0:
            r8.A01 = r5
            r8.A02 = r6
            r8.A03 = r0
            r8.A04 = r9
            r8.A05 = r7
            r8.A00 = r10
            X.GWN r1 = X.GWN.Main
            java.lang.Object r3 = r9.AD0(r1, r8)
            if (r3 != r12) goto L_0x0039
            return r12
        L_0x00e5:
            X.ME0 r8 = new X.ME0
            r8.<init>(r7, r13)
            goto L_0x0019
        L_0x00ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(X.6GK, X.4D7, X.0sP, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r1 == 0.0f) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (A08(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6).A04.A01, r0) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.AnonymousClass6GK r12, X.AnonymousClass4D7 r13, X.0sP r14, long r15) {
        /*
            r6 = r12
            r0 = r15
            r5 = r14
            r9 = 1
            r7 = r13
            boolean r2 = X.ME0.A02(r9, r13)
            if (r2 == 0) goto L_0x00e4
            r8 = r7
            X.ME0 r8 = (X.ME0) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x00e4
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0019:
            java.lang.Object r3 = r8.A06
            X.1Hj r12 = X.1Hj.A02
            int r2 = r8.A00
            if (r2 == 0) goto L_0x0097
            if (r2 != r9) goto L_0x00eb
            java.lang.Object r7 = r8.A05
            X.0rl r7 = (X.0rl) r7
            java.lang.Object r10 = r8.A04
            X.6GK r10 = (X.AnonymousClass6GK) r10
            java.lang.Object r2 = r8.A03
            java.lang.Object r6 = r8.A02
            X.6GK r6 = (X.AnonymousClass6GK) r6
            java.lang.Object r5 = r8.A01
            X.0sP r5 = (X.0sP) r5
            X.0eS.A00(r3)
        L_0x0038:
            X.6Ft r3 = (X.C304926Ft) r3
            java.util.List r13 = r3.A03
            int r15 = r13.size()
            r14 = 0
        L_0x0041:
            if (r14 >= r15) goto L_0x0055
            java.lang.Object r11 = r13.get(r14)
            r0 = r11
            X.GPU r0 = (X.GPU) r0
            long r3 = r0.A05
            long r0 = r7.A00
            int r16 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0056
            int r14 = r14 + 1
            goto L_0x0041
        L_0x0055:
            r11 = 0
        L_0x0056:
            X.GPU r11 = (X.GPU) r11
            if (r11 == 0) goto L_0x00a9
            boolean r14 = X.GPS.A02(r11)
            if (r14 == 0) goto L_0x0075
            int r4 = r13.size()
            r3 = 0
        L_0x0065:
            if (r3 >= r4) goto L_0x00c6
            java.lang.Object r1 = r13.get(r3)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00c7
            int r3 = r3 + 1
            goto L_0x0065
        L_0x0075:
            long r3 = r11.A07
            long r0 = r11.A06
            long r3 = X.C289295dM.A06(r0, r3)
            if (r2 != 0) goto L_0x0089
            float r1 = X.C289295dM.A00(r3)
        L_0x0083:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            goto L_0x00cf
        L_0x0089:
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
            if (r2 != r0) goto L_0x0092
            float r1 = X.C289295dM.A02(r3)
            goto L_0x0083
        L_0x0092:
            float r1 = X.C289295dM.A01(r3)
            goto L_0x0083
        L_0x0097:
            X.0eS.A00(r3)
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
            r3 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r3 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r3
            X.6FP r3 = r3.A04
            X.6Ft r3 = r3.A01
            boolean r3 = A08(r3, r0)
            if (r3 == 0) goto L_0x00bd
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x00af:
            r1 = 1
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x00a9
            if (r14 != 0) goto L_0x00aa
            r5.invoke(r11)
            long r0 = r11.A05
        L_0x00bd:
            X.0rl r7 = new X.0rl
            r7.<init>()
            r7.A00 = r0
            r10 = r6
            goto L_0x00cf
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x00af
            long r0 = r1.A05
            r7.A00 = r0
        L_0x00cf:
            r8.A01 = r5
            r8.A02 = r6
            r8.A03 = r2
            r8.A04 = r10
            r8.A05 = r7
            r8.A00 = r9
            X.GWN r0 = X.GWN.Main
            java.lang.Object r3 = r10.AD0(r0, r8)
            if (r3 != r12) goto L_0x0038
            return r12
        L_0x00e4:
            X.ME0 r8 = new X.ME0
            r8.<init>(r9, r13)
            goto L_0x0019
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(X.6GK, X.4D7, X.0sP, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.0rl, java.lang.Object] */
    public static final Object A07(AnonymousClass6FR r9, AnonymousClass4D7 r10, C62320sa r11, C62320sa r12, 0sP r13, 0sL r14) {
        JJQ A002 = JJQ.A00(r13, 3);
        C62320sa r4 = r12;
        Object A01 = ForEachGestureKt.A01(r9, r10, new DragGestureDetectorKt$detectDragGestures$9((AnonymousClass6Gj) null, (AnonymousClass4D7) null, C58247Ioq.A00, r4, J6G.A00(r11, 20), r14, A002, new Object()));
        Object obj = 1Hj.A02;
        if (A01 != obj) {
            A01 = C60340gF.A00;
        }
        if (A01 != obj) {
            return C60340gF.A00;
        }
        return A01;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.Ikz, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf A[SYNTHETIC] */
    public static final java.lang.Object A05(X.AnonymousClass6GK r16, X.AnonymousClass4D7 r17, X.0sL r18, int r19, long r20) {
        /*
            r4 = r18
            r9 = r16
            r3 = 0
            r5 = r17
            boolean r0 = r5 instanceof X.C58067Ikz
            if (r0 == 0) goto L_0x0136
            r8 = r5
            X.Ikz r8 = (X.C58067Ikz) r8
            int r0 = r8.A08
            if (r0 != r3) goto L_0x0136
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0136
            int r2 = r2 - r1
            r8.A01 = r2
        L_0x001d:
            java.lang.Object r1 = r8.A07
            X.1Hj r10 = X.1Hj.A02
            int r2 = r8.A01
            r7 = 2
            r18 = 1
            r12 = 0
            if (r2 == 0) goto L_0x004f
            r0 = r18
            if (r2 == r0) goto L_0x009b
            if (r2 != r7) goto L_0x013d
            float r6 = r8.A00
            java.lang.Object r13 = r8.A06
            X.GPU r13 = (X.GPU) r13
            java.lang.Object r11 = r8.A05
            X.GWR r11 = (X.GWR) r11
            java.lang.Object r5 = r8.A04
            X.0rl r5 = (X.0rl) r5
            java.lang.Object r9 = r8.A03
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r4 = r8.A02
            X.0sL r4 = (X.0sL) r4
            X.0eS.A00(r1)
        L_0x0048:
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0082
        L_0x004e:
            return r12
        L_0x004f:
            X.0eS.A00(r1)
            X.6Gj r13 = X.AnonymousClass6Gj.Horizontal
            r0 = r9
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            X.6Ft r2 = r0.A01
            r0 = r20
            boolean r2 = A08(r2, r0)
            if (r2 != 0) goto L_0x004e
            X.5RG r3 = r9.CEf()
            r2 = r19
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r7)
            float r6 = r3.C8x()
            if (r2 == 0) goto L_0x0076
            float r2 = A00
            float r6 = r6 * r2
        L_0x0076:
            X.0rl r5 = new X.0rl
            r5.<init>()
            r5.A00 = r0
            X.GWR r11 = new X.GWR
            r11.<init>(r13)
        L_0x0082:
            r8.A02 = r4
            r8.A03 = r9
            r8.A04 = r5
            r8.A05 = r11
            r8.A06 = r12
            r8.A00 = r6
            r0 = r18
            r8.A01 = r0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r9.AD0(r0, r8)
            if (r1 != r10) goto L_0x00b0
            return r10
        L_0x009b:
            float r6 = r8.A00
            java.lang.Object r11 = r8.A05
            X.GWR r11 = (X.GWR) r11
            java.lang.Object r5 = r8.A04
            X.0rl r5 = (X.0rl) r5
            java.lang.Object r9 = r8.A03
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r4 = r8.A02
            X.0sL r4 = (X.0sL) r4
            X.0eS.A00(r1)
        L_0x00b0:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r15 = r1.A03
            int r17 = r15.size()
            r14 = 0
        L_0x00b9:
            r0 = r17
            if (r14 >= r0) goto L_0x00cf
            java.lang.Object r13 = r15.get(r14)
            r0 = r13
            X.GPU r0 = (X.GPU) r0
            long r2 = r0.A05
            long r0 = r5.A00
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x00d0
            int r14 = r14 + 1
            goto L_0x00b9
        L_0x00cf:
            r13 = 0
        L_0x00d0:
            X.GPU r13 = (X.GPU) r13
            if (r13 == 0) goto L_0x004e
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.GPS.A02(r13)
            if (r0 == 0) goto L_0x00ff
            int r3 = r15.size()
            r2 = 0
        L_0x00e5:
            if (r2 >= r3) goto L_0x00f5
            java.lang.Object r1 = r15.get(r2)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00f6
            int r2 = r2 + 1
            goto L_0x00e5
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x004e
            long r0 = r1.A05
            r5.A00 = r0
            goto L_0x0082
        L_0x00ff:
            X.5dM r0 = r11.A00(r13, r6)
            if (r0 == 0) goto L_0x011f
            long r0 = r0.A00
            float r0 = X.C289295dM.A01(r0)
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r4.invoke(r13, r0)
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0119
            return r13
        L_0x0119:
            r0 = 0
            r11.A00 = r0
            goto L_0x0082
        L_0x011f:
            X.GWN r0 = X.GWN.Final
            r8.A02 = r4
            r8.A03 = r9
            r8.A04 = r5
            r8.A05 = r11
            r8.A06 = r13
            r8.A00 = r6
            r8.A01 = r7
            java.lang.Object r0 = r9.AD0(r0, r8)
            if (r0 != r10) goto L_0x0048
            return r10
        L_0x0136:
            X.Ikz r8 = new X.Ikz
            r8.<init>(r3, r5)
            goto L_0x001d
        L_0x013d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(X.6GK, X.4D7, X.0sL, int, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Ikz, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cc A[SYNTHETIC] */
    public static final java.lang.Object A06(X.AnonymousClass6GK r16, X.AnonymousClass4D7 r17, X.0sL r18, int r19, long r20) {
        /*
            r2 = r18
            r9 = r16
            r8 = 1
            r4 = r17
            boolean r0 = r4 instanceof X.C58067Ikz
            if (r0 == 0) goto L_0x0133
            r7 = r4
            X.Ikz r7 = (X.C58067Ikz) r7
            int r0 = r7.A08
            if (r0 != r8) goto L_0x0133
            int r3 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0133
            int r3 = r3 - r1
            r7.A01 = r3
        L_0x001d:
            java.lang.Object r0 = r7.A07
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A01
            r5 = 2
            r18 = 0
            if (r1 == 0) goto L_0x004c
            if (r1 == r8) goto L_0x0098
            if (r1 != r5) goto L_0x013a
            float r4 = r7.A00
            java.lang.Object r13 = r7.A06
            X.GPU r13 = (X.GPU) r13
            java.lang.Object r10 = r7.A05
            X.GWR r10 = (X.GWR) r10
            java.lang.Object r3 = r7.A04
            X.0rl r3 = (X.0rl) r3
            java.lang.Object r9 = r7.A03
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r2 = r7.A02
            X.0sL r2 = (X.0sL) r2
            X.0eS.A00(r0)
        L_0x0045:
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x007f
        L_0x004b:
            return r18
        L_0x004c:
            X.0eS.A00(r0)
            X.6Gj r11 = X.AnonymousClass6Gj.Vertical
            r0 = r9
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            X.6Ft r3 = r0.A01
            r0 = r20
            boolean r3 = A08(r3, r0)
            if (r3 != 0) goto L_0x004b
            X.5RG r4 = r9.CEf()
            r3 = r19
            boolean r3 = X.AnonymousClass7TF.A1S(r3, r5)
            float r4 = r4.C8x()
            if (r3 == 0) goto L_0x0073
            float r3 = A00
            float r4 = r4 * r3
        L_0x0073:
            X.0rl r3 = new X.0rl
            r3.<init>()
            r3.A00 = r0
            X.GWR r10 = new X.GWR
            r10.<init>(r11)
        L_0x007f:
            r7.A02 = r2
            r7.A03 = r9
            r7.A04 = r3
            r7.A05 = r10
            r0 = r18
            r7.A06 = r0
            r7.A00 = r4
            r7.A01 = r8
            X.GWN r0 = X.GWN.Main
            java.lang.Object r0 = r9.AD0(r0, r7)
            if (r0 != r6) goto L_0x00ad
            return r6
        L_0x0098:
            float r4 = r7.A00
            java.lang.Object r10 = r7.A05
            X.GWR r10 = (X.GWR) r10
            java.lang.Object r3 = r7.A04
            X.0rl r3 = (X.0rl) r3
            java.lang.Object r9 = r7.A03
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r2 = r7.A02
            X.0sL r2 = (X.0sL) r2
            X.0eS.A00(r0)
        L_0x00ad:
            X.6Ft r0 = (X.C304926Ft) r0
            java.util.List r15 = r0.A03
            int r17 = r15.size()
            r14 = 0
        L_0x00b6:
            r0 = r17
            if (r14 >= r0) goto L_0x00cc
            java.lang.Object r13 = r15.get(r14)
            r0 = r13
            X.GPU r0 = (X.GPU) r0
            long r11 = r0.A05
            long r0 = r3.A00
            int r16 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x00cd
            int r14 = r14 + 1
            goto L_0x00b6
        L_0x00cc:
            r13 = 0
        L_0x00cd:
            X.GPU r13 = (X.GPU) r13
            if (r13 == 0) goto L_0x004b
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x004b
            boolean r0 = X.GPS.A02(r13)
            if (r0 == 0) goto L_0x00fc
            int r12 = r15.size()
            r11 = 0
        L_0x00e2:
            if (r11 >= r12) goto L_0x00f2
            java.lang.Object r1 = r15.get(r11)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00f3
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x004b
            long r0 = r1.A05
            r3.A00 = r0
            goto L_0x007f
        L_0x00fc:
            X.5dM r0 = r10.A00(r13, r4)
            if (r0 == 0) goto L_0x011c
            long r0 = r0.A00
            float r0 = X.C289295dM.A02(r0)
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r2.invoke(r13, r0)
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0116
            return r13
        L_0x0116:
            r0 = 0
            r10.A00 = r0
            goto L_0x007f
        L_0x011c:
            X.GWN r0 = X.GWN.Final
            r7.A02 = r2
            r7.A03 = r9
            r7.A04 = r3
            r7.A05 = r10
            r7.A06 = r13
            r7.A00 = r4
            r7.A01 = r5
            java.lang.Object r0 = r9.AD0(r0, r7)
            if (r0 != r6) goto L_0x0045
            return r6
        L_0x0133:
            X.Ikz r7 = new X.Ikz
            r7.<init>(r8, r4)
            goto L_0x001d
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A06(X.6GK, X.4D7, X.0sL, int, long):java.lang.Object");
    }

    public static final boolean A08(C304926Ft r7, long j) {
        Object obj;
        List list = r7.A03;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((GPU) obj).A05 == j) {
                break;
            }
            i++;
        }
        GPU gpu = (GPU) obj;
        if (gpu != null && gpu.A0B) {
            z = true;
        }
        return !z;
    }
}
