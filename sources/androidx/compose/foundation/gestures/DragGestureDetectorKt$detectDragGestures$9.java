package androidx.compose.foundation.gestures;

import X.0rl;
import X.0sK;
import X.0sL;
import X.0sP;
import X.AnonymousClass4D7;
import X.AnonymousClass6Gj;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C60340gF;
import X.C62320sa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
public final class DragGestureDetectorKt$detectDragGestures$9 extends C267894cP implements 0sL {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ AnonymousClass6Gj A0A;
    public final /* synthetic */ C62320sa A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ 0sP A0D;
    public final /* synthetic */ 0sL A0E;
    public final /* synthetic */ 0sK A0F;
    public final /* synthetic */ 0rl A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$9(AnonymousClass6Gj r2, AnonymousClass4D7 r3, C62320sa r4, C62320sa r5, 0sP r6, 0sL r7, 0sK r8, 0rl r9) {
        super(2, r3);
        this.A0C = r4;
        this.A0G = r9;
        this.A0A = r2;
        this.A0F = r8;
        this.A0E = r7;
        this.A0B = r5;
        this.A0D = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        C62320sa r3 = this.A0C;
        0rl r8 = this.A0G;
        AnonymousClass6Gj r1 = this.A0A;
        0sK r7 = this.A0F;
        AnonymousClass4D7 r2 = r11;
        ? dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(r1, r2, r3, this.A0B, this.A0D, this.A0E, r7, r8);
        dragGestureDetectorKt$detectDragGestures$9.A09 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.GPU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.GPU} */
    /* JADX WARNING: type inference failed for: r6v0, types: [androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.0rl, java.lang.Object] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0176 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a7  */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r22
            X.1Hj r13 = X.1Hj.A02
            r6 = r21
            int r3 = r6.A01
            r20 = 4
            r19 = 3
            r9 = 2
            r5 = 0
            r2 = 1
            r18 = 0
            if (r3 == 0) goto L_0x0094
            if (r3 == r2) goto L_0x00a8
            if (r3 == r9) goto L_0x00d4
            r0 = r19
            if (r3 == r0) goto L_0x013c
            r0 = r20
            if (r3 == r0) goto L_0x01df
            java.lang.Object r7 = r6.A05
            X.0rl r7 = (X.0rl) r7
            java.lang.Object r9 = r6.A04
            X.6GK r9 = (X.AnonymousClass6GK) r9
            java.lang.Object r10 = r6.A03
            java.lang.Object r5 = r6.A02
            X.0sL r5 = (X.0sL) r5
            java.lang.Object r4 = r6.A09
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.0eS.A00(r1)
        L_0x0034:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r11 = r1.A03
            int r15 = r11.size()
            r14 = 0
        L_0x003d:
            if (r14 >= r15) goto L_0x0051
            java.lang.Object r8 = r11.get(r14)
            r0 = r8
            X.GPU r0 = (X.GPU) r0
            long r2 = r0.A05
            long r0 = r7.A00
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x0052
            int r14 = r14 + 1
            goto L_0x003d
        L_0x0051:
            r8 = 0
        L_0x0052:
            X.GPU r8 = (X.GPU) r8
            if (r8 == 0) goto L_0x0232
            boolean r12 = X.GPS.A02(r8)
            if (r12 == 0) goto L_0x0071
            int r3 = r11.size()
            r2 = 0
        L_0x0061:
            if (r2 >= r3) goto L_0x0254
            java.lang.Object r1 = r11.get(r2)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0255
            int r2 = r2 + 1
            goto L_0x0061
        L_0x0071:
            long r2 = r8.A07
            long r0 = r8.A06
            long r1 = X.C289295dM.A06(r0, r2)
            if (r10 != 0) goto L_0x0086
            float r1 = X.C289295dM.A00(r1)
        L_0x007f:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0279
            goto L_0x025d
        L_0x0086:
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
            if (r10 != r0) goto L_0x008f
            float r1 = X.C289295dM.A02(r1)
            goto L_0x007f
        L_0x008f:
            float r1 = X.C289295dM.A01(r1)
            goto L_0x007f
        L_0x0094:
            X.0eS.A00(r1)
            java.lang.Object r4 = r6.A09
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.GWN r0 = X.GWN.Initial
            r6.A09 = r4
            r6.A01 = r2
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r6, r5)
            if (r1 != r13) goto L_0x00af
            return r13
        L_0x00a8:
            java.lang.Object r4 = r6.A09
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.0eS.A00(r1)
        L_0x00af:
            X.GPU r1 = (X.GPU) r1
            X.0sa r0 = r6.A0C
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L_0x00c2
            r1.A01()
        L_0x00c2:
            r6.A09 = r4
            r6.A02 = r1
            r6.A08 = r3
            r6.A01 = r9
            X.GWN r0 = X.GWN.Main
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r6, r5)
            if (r5 == r13) goto L_0x0239
            r12 = r1
            goto L_0x00e2
        L_0x00d4:
            boolean r3 = r6.A08
            java.lang.Object r12 = r6.A02
            X.GPU r12 = (X.GPU) r12
            java.lang.Object r4 = r6.A09
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.0eS.A00(r1)
            r5 = r1
        L_0x00e2:
            X.GPU r5 = (X.GPU) r5
            X.0rl r2 = r6.A0G
            r0 = 0
            r2.A00 = r0
            if (r3 == 0) goto L_0x0205
            long r0 = r5.A05
            int r10 = r5.A04
            X.6Gj r8 = r6.A0A
            r3 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r3 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r3
            X.6FP r3 = r3.A04
            X.6Ft r3 = r3.A01
            boolean r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A08(r3, r0)
            if (r3 != 0) goto L_0x0237
            X.5RG r7 = r4.CEf()
            boolean r3 = X.AnonymousClass7TF.A1S(r10, r9)
            float r7 = r7.C8x()
            if (r3 == 0) goto L_0x0110
            float r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r7 = r7 * r3
        L_0x0110:
            X.0rl r3 = new X.0rl
            r3.<init>()
            r3.A00 = r0
            X.GWR r9 = new X.GWR
            r9.<init>(r8)
            r8 = r4
        L_0x011d:
            r6.A09 = r8
            r6.A02 = r5
            r6.A03 = r4
            r6.A04 = r2
            r6.A05 = r3
            r6.A06 = r9
            r0 = r18
            r6.A07 = r0
            r6.A00 = r7
            r0 = r19
            r6.A01 = r0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r4.AD0(r0, r6)
            if (r1 != r13) goto L_0x0157
            return r13
        L_0x013c:
            float r7 = r6.A00
            java.lang.Object r9 = r6.A06
            X.GWR r9 = (X.GWR) r9
            java.lang.Object r3 = r6.A05
            X.0rl r3 = (X.0rl) r3
            java.lang.Object r2 = r6.A04
            X.0rl r2 = (X.0rl) r2
            java.lang.Object r4 = r6.A03
            X.6GK r4 = (X.AnonymousClass6GK) r4
            java.lang.Object r5 = r6.A02
            java.lang.Object r8 = r6.A09
            X.6GK r8 = (X.AnonymousClass6GK) r8
            X.0eS.A00(r1)
        L_0x0157:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r15 = r1.A03
            int r17 = r15.size()
            r14 = 0
        L_0x0160:
            r0 = r17
            if (r14 >= r0) goto L_0x0176
            java.lang.Object r12 = r15.get(r14)
            r0 = r12
            X.GPU r0 = (X.GPU) r0
            long r10 = r0.A05
            long r0 = r3.A00
            int r16 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0177
            int r14 = r14 + 1
            goto L_0x0160
        L_0x0176:
            r12 = 0
        L_0x0177:
            X.GPU r12 = (X.GPU) r12
            if (r12 == 0) goto L_0x0237
            boolean r0 = r12.A02()
            if (r0 != 0) goto L_0x0237
            boolean r0 = X.GPS.A02(r12)
            if (r0 == 0) goto L_0x01a7
            int r11 = r15.size()
            r10 = 0
        L_0x018c:
            if (r10 >= r11) goto L_0x019c
            java.lang.Object r1 = r15.get(r10)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x019d
            int r10 = r10 + 1
            goto L_0x018c
        L_0x019c:
            r1 = 0
        L_0x019d:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x0237
            long r0 = r1.A05
            r3.A00 = r0
            goto L_0x011d
        L_0x01a7:
            X.5dM r0 = r9.A00(r12, r7)
            if (r0 == 0) goto L_0x01c2
            long r0 = r0.A00
            r12.A01()
            r2.A00 = r0
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x01bc
            r4 = r8
            goto L_0x0207
        L_0x01bc:
            r0 = 0
            r9.A00 = r0
            goto L_0x011d
        L_0x01c2:
            X.GWN r1 = X.GWN.Final
            r6.A09 = r8
            r6.A02 = r5
            r6.A03 = r4
            r6.A04 = r2
            r6.A05 = r3
            r6.A06 = r9
            r6.A07 = r12
            r6.A00 = r7
            r0 = r20
            r6.A01 = r0
            java.lang.Object r0 = r4.AD0(r1, r6)
            if (r0 != r13) goto L_0x01fe
            return r13
        L_0x01df:
            float r7 = r6.A00
            java.lang.Object r12 = r6.A07
            X.GPU r12 = (X.GPU) r12
            java.lang.Object r9 = r6.A06
            X.GWR r9 = (X.GWR) r9
            java.lang.Object r3 = r6.A05
            X.0rl r3 = (X.0rl) r3
            java.lang.Object r2 = r6.A04
            X.0rl r2 = (X.0rl) r2
            java.lang.Object r4 = r6.A03
            X.6GK r4 = (X.AnonymousClass6GK) r4
            java.lang.Object r5 = r6.A02
            java.lang.Object r8 = r6.A09
            X.6GK r8 = (X.AnonymousClass6GK) r8
            X.0eS.A00(r1)
        L_0x01fe:
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x011d
            goto L_0x0237
        L_0x0205:
            if (r12 == 0) goto L_0x0237
        L_0x0207:
            X.0sK r7 = r6.A0F
            X.0rl r3 = r6.A0G
            long r0 = r3.A00
            X.5dM r2 = new X.5dM
            r2.<init>(r0)
            r7.invoke(r5, r12, r2)
            X.0sL r5 = r6.A0E
            long r0 = r3.A00
            X.5dM r2 = new X.5dM
            r2.<init>(r0)
            r5.invoke(r12, r2)
            long r0 = r12.A05
            X.6Gj r10 = r6.A0A
            r2 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r2
            X.6FP r2 = r2.A04
            X.6Ft r2 = r2.A01
            boolean r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A08(r2, r0)
            if (r2 == 0) goto L_0x024b
        L_0x0232:
            X.0sa r0 = r6.A0B
            r0.invoke()
        L_0x0237:
            X.0gF r13 = X.C60340gF.A00
        L_0x0239:
            return r13
        L_0x023a:
            long r0 = X.GPS.A00(r8)
            X.5dM r2 = new X.5dM
            r2.<init>(r0)
            r5.invoke(r8, r2)
            r8.A01()
            long r0 = r8.A05
        L_0x024b:
            X.0rl r7 = new X.0rl
            r7.<init>()
            r7.A00 = r0
            r9 = r4
            goto L_0x025d
        L_0x0254:
            r1 = 0
        L_0x0255:
            X.GPU r1 = (X.GPU) r1
            if (r1 == 0) goto L_0x0279
            long r0 = r1.A05
            r7.A00 = r0
        L_0x025d:
            r6.A09 = r4
            r6.A02 = r5
            r6.A03 = r10
            r6.A04 = r9
            r6.A05 = r7
            r0 = r18
            r6.A06 = r0
            r6.A07 = r0
            r0 = 5
            r6.A01 = r0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r9.AD0(r0, r6)
            if (r1 != r13) goto L_0x0034
            return r13
        L_0x0279:
            boolean r0 = r8.A02()
            if (r0 != 0) goto L_0x0232
            if (r12 == 0) goto L_0x023a
            X.0sP r0 = r6.A0D
            r0.invoke(r8)
            goto L_0x0237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$9) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
