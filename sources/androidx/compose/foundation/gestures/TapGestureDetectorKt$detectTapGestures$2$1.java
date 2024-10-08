package androidx.compose.foundation.gestures;

import X.0sK;
import X.0sL;
import X.0sP;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C267894cP;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
public final class TapGestureDetectorKt$detectTapGestures$2$1 extends C267894cP implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ PressGestureScopeImpl A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sK A0A;
    public final /* synthetic */ C262224Cq A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1(PressGestureScopeImpl pressGestureScopeImpl, AnonymousClass4D7 r3, 0sP r4, 0sP r5, 0sP r6, 0sK r7, C262224Cq r8) {
        super(2, r3);
        this.A0B = r8;
        this.A0A = r7;
        this.A08 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A06 = pressGestureScopeImpl;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        C262224Cq r7 = this.A0B;
        0sK r6 = this.A0A;
        ? tapGestureDetectorKt$detectTapGestures$2$1 = new TapGestureDetectorKt$detectTapGestures$2$1(this.A06, r10, this.A08, this.A07, this.A09, r6, r7);
        tapGestureDetectorKt$detectTapGestures$2$1.A05 = obj;
        return tapGestureDetectorKt$detectTapGestures$2$1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r14 = (X.GPU) r6;
        r14.A01();
        r6 = r1.A0B;
        r13 = r1.A06;
        r2 = new X.C59676JTh((java.lang.Object) r13, (X.AnonymousClass4D7) null, 5);
        r5 = X.19B.A00;
        X.1Eo.A05(r5, r2, r6);
        r3 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r3 == androidx.compose.foundation.gestures.TapGestureDetectorKt.A00) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        X.1Eo.A05(r5, new X.MHP(r13, r14, (X.AnonymousClass4D7) null, r3, 6), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r1.A08 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        r2 = r0.CEf().BOW();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r9 = X.C51965G9l.A11();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r2 = 4611686018427387903L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = new X.C58078IlA(0, (X.AnonymousClass4D7) null);
        r1.A05 = r0;
        r1.A02 = r14;
        r1.A03 = r9;
        r1.A04 = r9;
        r1.A01 = r2;
        r1.A00 = 2;
        r6 = r0.FNY(r1, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r6 == r4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r9.A00 = r6;
        r5 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r5 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        X.AnonymousClass7TE.A1Z(new X.C59712JUv(r1.A06, (X.AnonymousClass4D7) null, 3), r1.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        ((X.GPU) r5).A01();
        X.AnonymousClass7TE.A1Z(new X.C59712JUv(r1.A06, (X.AnonymousClass4D7) null, 4), r1.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r5 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r5 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        X.GPU.A00(r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00eb, code lost:
        r1.A05 = r0;
        r1.A02 = r9;
        r1.A03 = null;
        r1.A04 = null;
        r1.A01 = r2;
        r1.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        if (androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1) == r4) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        X.AnonymousClass7TE.A1Z(new X.C59712JUv(r1.A06, (X.AnonymousClass4D7) null, 5), r1.A0B);
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        r8 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        if (r8 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        if (r1.A07 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        if (r0 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        X.GPU.A00((X.GPU) r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        r1.A05 = r0;
        r1.A02 = r13;
        r1.A03 = null;
        r1.A04 = null;
        r1.A01 = r2;
        r1.A00 = 4;
        r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00;
        r6 = r0.FNZ(r1, new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2((X.GPU) r8, (X.AnonymousClass4D7) null), r0.CEf().Ayj());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        if (r6 == r4) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0150, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        r5 = (X.GPU) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0160, code lost:
        if (r5 == null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0162, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0164, code lost:
        if (r0 != null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0166, code lost:
        r8 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        r14 = r1.A0B;
        r9 = r1.A06;
        r6 = new X.C59676JTh((java.lang.Object) r9, (X.AnonymousClass4D7) null, 6);
        r8 = X.19B.A00;
        X.1Eo.A05(r8, r6, r14);
        r7 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r7 != androidx.compose.foundation.gestures.TapGestureDetectorKt.A00) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        X.1Eo.A05(r8, new X.MHP(r9, r5, (X.AnonymousClass4D7) null, r7, 7), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r8 = new X.C58079IlF(r9, (X.AnonymousClass4D7) null, r1.A07, r1.A09, r13, r14);
        r1.A05 = r0;
        r1.A02 = r13;
        r1.A03 = r5;
        r1.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a6, code lost:
        if (r0.FNY(r1, r8, r2) == r4) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cb, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r22
            X.1Hj r4 = X.1Hj.A02
            r1 = r21
            int r0 = r1.A00
            r10 = 0
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x005d;
                case 2: goto L_0x002f;
                case 3: goto L_0x00ff;
                case 4: goto L_0x0151;
                case 5: goto L_0x001f;
                default: goto L_0x000c;
            }
        L_0x000c:
            X.0eS.A00(r6)
        L_0x000f:
            X.4Cq r3 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r1.A06
            r1 = 2
            X.JUv r0 = new X.JUv
            r0.<init>(r2, r10, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x001c:
            X.0gF r4 = X.C60340gF.A00
        L_0x001e:
            return r4
        L_0x001f:
            java.lang.Object r5 = r1.A03
            X.GPU r5 = (X.GPU) r5
            java.lang.Object r13 = r1.A02
            X.0rm r13 = (X.0rm) r13
            java.lang.Object r0 = r1.A05
            X.6GK r0 = (X.AnonymousClass6GK) r0
            X.0eS.A00(r6)     // Catch:{ TSe -> 0x01a9 }
            goto L_0x001c
        L_0x002f:
            long r2 = r1.A01
            java.lang.Object r9 = r1.A04
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r13 = r1.A03
            X.0rm r13 = (X.0rm) r13
            java.lang.Object r14 = r1.A02
            X.GPU r14 = (X.GPU) r14
            java.lang.Object r0 = r1.A05
            X.6GK r0 = (X.AnonymousClass6GK) r0
            X.0eS.A00(r6)     // Catch:{ TSe -> 0x0045 }
            goto L_0x00bc
        L_0x0045:
            r9 = r13
            goto L_0x00e4
        L_0x0048:
            X.0eS.A00(r6)
            java.lang.Object r0 = r1.A05
            X.6GK r0 = (X.AnonymousClass6GK) r0
            r1.A05 = r0
            r3 = 1
            r1.A00 = r3
            X.GWN r2 = X.GWN.Main
            java.lang.Object r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r0, r2, r1, r3)
            if (r6 != r4) goto L_0x0063
            return r4
        L_0x005d:
            java.lang.Object r0 = r1.A05
            X.6GK r0 = X.C51965G9l.A0O(r0, r6)
        L_0x0063:
            r14 = r6
            X.GPU r14 = (X.GPU) r14
            r14.A01()
            X.4Cq r6 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r13 = r1.A06
            r3 = 5
            X.JTh r2 = new X.JTh
            r2.<init>((java.lang.Object) r13, (X.AnonymousClass4D7) r10, (int) r3)
            X.19B r5 = X.19B.A00
            X.1Eo.A05(r5, r2, r6)
            X.0sK r3 = r1.A0A
            X.0sK r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r3 == r2) goto L_0x008b
            r17 = 6
            X.MHP r12 = new X.MHP
            r15 = r10
            r16 = r3
            r12.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r13, (X.GPU) r14, (X.AnonymousClass4D7) r15, (X.0sK) r16, (int) r17)
            X.1Eo.A05(r5, r12, r6)
        L_0x008b:
            X.0sP r2 = r1.A08
            if (r2 == 0) goto L_0x009c
            X.5RG r2 = r0.CEf()
            long r2 = r2.BOW()
        L_0x0097:
            X.0rm r9 = X.C51965G9l.A11()
            goto L_0x00a2
        L_0x009c:
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            goto L_0x0097
        L_0x00a2:
            r5 = 0
            X.IlA r6 = new X.IlA     // Catch:{ TSe -> 0x00e4 }
            r6.<init>(r5, r10)     // Catch:{ TSe -> 0x00e4 }
            r1.A05 = r0     // Catch:{ TSe -> 0x00e4 }
            r1.A02 = r14     // Catch:{ TSe -> 0x00e4 }
            r1.A03 = r9     // Catch:{ TSe -> 0x00e4 }
            r1.A04 = r9     // Catch:{ TSe -> 0x00e4 }
            r1.A01 = r2     // Catch:{ TSe -> 0x00e4 }
            r5 = 2
            r1.A00 = r5     // Catch:{ TSe -> 0x00e4 }
            java.lang.Object r6 = r0.FNY(r1, r6, r2)     // Catch:{ TSe -> 0x00e4 }
            if (r6 == r4) goto L_0x001e
            r13 = r9
        L_0x00bc:
            r9.A00 = r6     // Catch:{ TSe -> 0x00e3 }
            java.lang.Object r5 = r13.A00     // Catch:{ TSe -> 0x00e3 }
            if (r5 != 0) goto L_0x00d0
            X.4Cq r8 = r1.A0B     // Catch:{ TSe -> 0x00e3 }
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06     // Catch:{ TSe -> 0x00e3 }
            r6 = 3
            X.JUv r5 = new X.JUv     // Catch:{ TSe -> 0x00e3 }
            r5.<init>(r7, r10, r6)     // Catch:{ TSe -> 0x00e3 }
            X.AnonymousClass7TE.A1Z(r5, r8)     // Catch:{ TSe -> 0x00e3 }
            goto L_0x0119
        L_0x00d0:
            X.GPU r5 = (X.GPU) r5     // Catch:{ TSe -> 0x00e3 }
            r5.A01()     // Catch:{ TSe -> 0x00e3 }
            X.4Cq r8 = r1.A0B     // Catch:{ TSe -> 0x00e3 }
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06     // Catch:{ TSe -> 0x00e3 }
            r6 = 4
            X.JUv r5 = new X.JUv     // Catch:{ TSe -> 0x00e3 }
            r5.<init>(r7, r10, r6)     // Catch:{ TSe -> 0x00e3 }
            X.AnonymousClass7TE.A1Z(r5, r8)     // Catch:{ TSe -> 0x00e3 }
            goto L_0x0119
        L_0x00e3:
            r9 = r13
        L_0x00e4:
            X.0sP r5 = r1.A08
            if (r5 == 0) goto L_0x00eb
            X.GPU.A00(r14, r5)
        L_0x00eb:
            r1.A05 = r0
            r1.A02 = r9
            r1.A03 = r10
            r1.A04 = r10
            r1.A01 = r2
            r5 = 3
            r1.A00 = r5
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1)
            if (r5 != r4) goto L_0x010b
            return r4
        L_0x00ff:
            long r2 = r1.A01
            java.lang.Object r9 = r1.A02
            X.0rm r9 = (X.0rm) r9
            java.lang.Object r0 = r1.A05
            X.6GK r0 = X.C51965G9l.A0O(r0, r6)
        L_0x010b:
            X.4Cq r8 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06
            r6 = 5
            X.JUv r5 = new X.JUv
            r5.<init>(r7, r10, r6)
            X.AnonymousClass7TE.A1Z(r5, r8)
            r13 = r9
        L_0x0119:
            java.lang.Object r8 = r13.A00
            if (r8 == 0) goto L_0x001c
            X.0sP r5 = r1.A07
            if (r5 != 0) goto L_0x012c
            X.0sP r0 = r1.A09
            if (r0 == 0) goto L_0x001c
        L_0x0125:
            X.GPU r8 = (X.GPU) r8
            X.GPU.A00(r8, r0)
            goto L_0x001c
        L_0x012c:
            X.GPU r8 = (X.GPU) r8
            r1.A05 = r0
            r1.A02 = r13
            r1.A03 = r10
            r1.A04 = r10
            r1.A01 = r2
            r5 = 4
            r1.A00 = r5
            X.0sK r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            X.5RG r5 = r0.CEf()
            long r5 = r5.Ayj()
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2
            r7.<init>(r8, r10)
            java.lang.Object r6 = r0.FNZ(r1, r7, r5)
            if (r6 != r4) goto L_0x015d
            return r4
        L_0x0151:
            long r2 = r1.A01
            java.lang.Object r13 = r1.A02
            X.0rm r13 = (X.0rm) r13
            java.lang.Object r0 = r1.A05
            X.6GK r0 = X.C51965G9l.A0O(r0, r6)
        L_0x015d:
            r5 = r6
            X.GPU r5 = (X.GPU) r5
            if (r5 != 0) goto L_0x0169
            X.0sP r0 = r1.A09
            if (r0 == 0) goto L_0x001c
            java.lang.Object r8 = r13.A00
            goto L_0x0125
        L_0x0169:
            X.4Cq r14 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r9 = r1.A06
            r7 = 6
            X.JTh r6 = new X.JTh
            r6.<init>((java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r7)
            X.19B r8 = X.19B.A00
            X.1Eo.A05(r8, r6, r14)
            X.0sK r7 = r1.A0A
            X.0sK r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r7 == r6) goto L_0x0190
            r20 = 7
            X.MHP r15 = new X.MHP
            r16 = r9
            r17 = r5
            r18 = r10
            r19 = r7
            r15.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r16, (X.GPU) r17, (X.AnonymousClass4D7) r18, (X.0sK) r19, (int) r20)
            X.1Eo.A05(r8, r15, r14)
        L_0x0190:
            X.0sP r11 = r1.A07     // Catch:{ TSe -> 0x01a9 }
            X.0sP r12 = r1.A09     // Catch:{ TSe -> 0x01a9 }
            X.IlF r8 = new X.IlF     // Catch:{ TSe -> 0x01a9 }
            r8.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r9, (X.AnonymousClass4D7) r10, (X.0sP) r11, (X.0sP) r12, (X.0rm) r13, (X.C262224Cq) r14)     // Catch:{ TSe -> 0x01a9 }
            r1.A05 = r0     // Catch:{ TSe -> 0x01a9 }
            r1.A02 = r13     // Catch:{ TSe -> 0x01a9 }
            r1.A03 = r5     // Catch:{ TSe -> 0x01a9 }
            r6 = 5
            r1.A00 = r6     // Catch:{ TSe -> 0x01a9 }
            java.lang.Object r0 = r0.FNY(r1, r8, r2)     // Catch:{ TSe -> 0x01a9 }
            if (r0 != r4) goto L_0x001c
            goto L_0x01cb
        L_0x01a9:
            X.0sP r3 = r1.A09
            if (r3 == 0) goto L_0x01b4
            java.lang.Object r2 = r13.A00
            X.GPU r2 = (X.GPU) r2
            X.GPU.A00(r2, r3)
        L_0x01b4:
            X.0sP r2 = r1.A08
            if (r2 == 0) goto L_0x01bb
            X.GPU.A00(r5, r2)
        L_0x01bb:
            r1.A05 = r10
            r1.A02 = r10
            r1.A03 = r10
            r2 = 6
            r1.A00 = r2
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x01cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
