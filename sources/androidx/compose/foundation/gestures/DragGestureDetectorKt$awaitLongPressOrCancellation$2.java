package androidx.compose.foundation.gestures;

import X.0rm;
import X.0sL;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {901, 918}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends C267894cP implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ 0rm A04;
    public final /* synthetic */ 0rm A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(AnonymousClass4D7 r2, 0rm r3, 0rm r4) {
        super(2, r2);
        this.A04 = r3;
        this.A05 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        ? dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(r5, this.A04, this.A05);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.A03 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r1 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r12.A00 = r1;
        r9.A05.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r5 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:46:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            X.1Hj r8 = X.1Hj.A02
            r9 = r18
            int r0 = r9.A01
            r17 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00f3
            int r5 = r9.A00
            if (r0 == r6) goto L_0x009a
            java.lang.Object r10 = r9.A02
            X.6Ft r10 = (X.C304926Ft) r10
            java.lang.Object r0 = r9.A03
            X.6GK r4 = X.C51965G9l.A0O(r0, r1)
        L_0x001c:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0032
            X.GPU r0 = X.C51965G9l.A0P(r3, r1)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0097
            r5 = 1
        L_0x0032:
            X.0rm r12 = r9.A04
            java.lang.Object r0 = r12.A00
            X.GPU r0 = (X.GPU) r0
            long r0 = r0.A05
            boolean r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A08(r10, r0)
            if (r0 == 0) goto L_0x0072
            java.util.List r10 = r10.A03
            int r3 = r10.size()
            r2 = 0
        L_0x0047:
            if (r2 >= r3) goto L_0x00fd
            java.lang.Object r1 = r10.get(r2)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x00fd
            r12.A00 = r1
            X.0rm r0 = r9.A05
            r0.A00 = r1
        L_0x005c:
            if (r5 != 0) goto L_0x00fd
        L_0x005e:
            X.GWN r0 = X.GWN.Main
            r9.A03 = r4
            r9.A02 = r7
            r9.A00 = r5
            r9.A01 = r6
            java.lang.Object r1 = r4.AD0(r0, r9)
            if (r1 != r8) goto L_0x00a0
            return r8
        L_0x006f:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0072:
            X.0rm r14 = r9.A05
            java.util.List r15 = r10.A03
            int r13 = r15.size()
            r11 = 0
        L_0x007b:
            if (r11 >= r13) goto L_0x0093
            java.lang.Object r10 = r15.get(r11)
            r0 = r10
            X.GPU r0 = (X.GPU) r0
            long r2 = r0.A05
            java.lang.Object r0 = r12.A00
            X.GPU r0 = (X.GPU) r0
            long r0 = r0.A05
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0094
            int r11 = r11 + 1
            goto L_0x007b
        L_0x0093:
            r10 = 0
        L_0x0094:
            r14.A00 = r10
            goto L_0x005c
        L_0x0097:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x009a:
            java.lang.Object r0 = r9.A03
            X.6GK r4 = X.C51965G9l.A0O(r0, r1)
        L_0x00a0:
            r10 = r1
            X.6Ft r10 = (X.C304926Ft) r10
            java.util.List r13 = r10.A03
            int r2 = r13.size()
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00b9
            X.GPU r0 = X.C51965G9l.A0P(r13, r1)
            boolean r0 = X.GPS.A02(r0)
            if (r0 == 0) goto L_0x00ba
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00b9:
            r5 = 1
        L_0x00ba:
            int r12 = r13.size()
            r11 = 0
        L_0x00bf:
            if (r11 >= r12) goto L_0x00e0
            X.GPU r14 = X.C51965G9l.A0P(r13, r11)
            boolean r0 = r14.A02()
            if (r0 != 0) goto L_0x00df
            r0 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.6FP r0 = r0.A04
            long r2 = r0.A00
            long r0 = r4.B36()
            boolean r0 = X.GPS.A04(r14, r2, r0)
            if (r0 != 0) goto L_0x00df
            int r11 = r11 + 1
            goto L_0x00bf
        L_0x00df:
            r5 = 1
        L_0x00e0:
            X.GWN r1 = X.GWN.Final
            r9.A03 = r4
            r9.A02 = r10
            r9.A00 = r5
            r0 = r17
            r9.A01 = r0
            java.lang.Object r1 = r4.AD0(r1, r9)
            if (r1 != r8) goto L_0x001c
            return r8
        L_0x00f3:
            X.0eS.A00(r1)
            java.lang.Object r4 = r9.A03
            X.6GK r4 = (X.AnonymousClass6GK) r4
            r5 = 0
            goto L_0x005e
        L_0x00fd:
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
