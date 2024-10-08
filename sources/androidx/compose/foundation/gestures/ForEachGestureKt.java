package androidx.compose.foundation.gestures;

import X.0sL;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass6FR;
import X.C60340gF;
import X.GNZ;

public abstract class ForEachGestureKt {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r0 = X.GWN.Final;
        r4.A01 = r7;
        r4.A00 = 1;
        r1 = r7.AD0(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r1 != r6) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d A[EDGE_INSN: B:28:0x007d->B:25:0x007d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6GK r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = 1
            boolean r0 = X.MEC.A03(r5, r8)
            if (r0 == 0) goto L_0x006b
            r4 = r8
            X.MEC r4 = (X.MEC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            if (r0 == 0) goto L_0x003e
            if (r0 != r5) goto L_0x0071
            java.lang.Object r7 = r4.A01
            X.6GK r7 = (X.AnonymousClass6GK) r7
            X.0eS.A00(r1)
        L_0x0026:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x002f:
            if (r1 >= r2) goto L_0x007d
            java.lang.Object r0 = r3.get(r1)
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x005e
            int r1 = r1 + 1
            goto L_0x002f
        L_0x003e:
            X.0eS.A00(r1)
            r0 = r7
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            X.6Ft r0 = r0.A01
            java.util.List r3 = r0.A03
            int r2 = r3.size()
            r1 = 0
        L_0x004f:
            if (r1 >= r2) goto L_0x007d
            java.lang.Object r0 = r3.get(r1)
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x005e
            int r1 = r1 + 1
            goto L_0x004f
        L_0x005e:
            X.GWN r0 = X.GWN.Final
            r4.A01 = r7
            r4.A00 = r5
            java.lang.Object r1 = r7.AD0(r0, r4)
            if (r1 != r6) goto L_0x0026
            return r6
        L_0x006b:
            X.MEC r4 = new X.MEC
            r4.<init>(r5, r8)
            goto L_0x0015
        L_0x0071:
            r0 = 1152(0x480, float:1.614E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007d:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.6GK, X.4D7):java.lang.Object");
    }

    public static final Object A01(AnonymousClass6FR r3, AnonymousClass4D7 r4, 0sL r5) {
        Object AD1 = r3.AD1(r4, new GNZ((AnonymousClass4D7) null, r4.getContext(), r5));
        if (AD1 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return AD1;
    }
}
