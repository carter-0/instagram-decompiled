package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;

/* renamed from: X.IlF  reason: case insensitive filesystem */
public final class C58079IlF extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58079IlF(PressGestureScopeImpl pressGestureScopeImpl, AnonymousClass4D7 r3, 0sP r4, 0sP r5, 0rm r6, C262224Cq r7) {
        super(2, r3);
        this.A03 = 2;
        this.A04 = r7;
        this.A05 = r4;
        this.A06 = r5;
        this.A01 = r6;
        this.A07 = pressGestureScopeImpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.0rh} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0124, code lost:
        if (r13 != r3) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015f, code lost:
        X.0eS.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0168, code lost:
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016a, code lost:
        r0 = r12.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016c, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0171, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0172, code lost:
        r0 = r12.A04;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r7 = r12
            int r0 = r12.A03
            X.1Hj r3 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x006b;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r1 = r12.A00
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0054
            if (r1 != r0) goto L_0x0066
            X.0eS.A00(r13)
        L_0x0013:
            X.GPU r13 = (X.GPU) r13
            if (r13 == 0) goto L_0x0033
            r13.A01()
            java.lang.Object r3 = r12.A04
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r12.A07
            r1 = 6
            X.JUv r0 = new X.JUv
            r0.<init>(r2, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            java.lang.Object r0 = r12.A05
            X.0sP r0 = (X.0sP) r0
            X.GPU.A00(r13, r0)
        L_0x0030:
            X.0gF r4 = X.C60340gF.A00
        L_0x0032:
            return r4
        L_0x0033:
            java.lang.Object r3 = r12.A04
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r2 = r12.A07
            r1 = 7
            X.JUv r0 = new X.JUv
            r0.<init>(r2, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            java.lang.Object r1 = r12.A06
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r12.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.GPU r0 = (X.GPU) r0
            X.GPU.A00(r0, r1)
            goto L_0x0030
        L_0x0054:
            X.0eS.A00(r13)
            java.lang.Object r1 = r12.A02
            X.6GK r1 = (X.AnonymousClass6GK) r1
            r12.A00 = r0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r1, r0, r12)
            if (r13 != r3) goto L_0x0013
            return r3
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x006b:
            int r1 = r12.A00
            r5 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x00ac
            if (r1 == r0) goto L_0x00c1
            if (r1 != r2) goto L_0x015f
            java.lang.Object r1 = r12.A02
            X.0rh r1 = (X.0rh) r1
            java.lang.Object r0 = r12.A01
            X.6GK r6 = X.C51965G9l.A0O(r0, r13)
        L_0x0080:
            X.GPU r13 = (X.GPU) r13
            if (r13 == 0) goto L_0x016f
            java.lang.Object r0 = r12.A06
            X.0sP r0 = (X.0sP) r0
            X.GPU.A00(r13, r0)
            java.lang.Object r4 = r12.A07
            X.0sL r4 = (X.0sL) r4
            float r0 = r1.A00
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r4.invoke(r13, r0)
            long r1 = r13.A05
            r0 = 22
            X.J6G r4 = X.J6G.A00(r4, r0)
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A00 = r5
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r6, r12, r4, r1)
            goto L_0x0124
        L_0x00ac:
            X.0eS.A00(r13)
            java.lang.Object r6 = r12.A01
            X.6GK r6 = (X.AnonymousClass6GK) r6
            r12.A01 = r6
            r12.A00 = r0
            r1 = 0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r6, r0, r12, r1)
            if (r13 != r3) goto L_0x00c7
            return r3
        L_0x00c1:
            java.lang.Object r0 = r12.A01
            X.6GK r6 = X.C51965G9l.A0O(r0, r13)
        L_0x00c7:
            X.GPU r13 = (X.GPU) r13
            X.0rh r1 = new X.0rh
            r1.<init>()
            long r10 = r13.A05
            int r9 = r13.A04
            X.JFw r8 = new X.JFw
            r8.<init>(r1, r2)
            r12.A01 = r6
            r12.A02 = r1
            r12.A00 = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A06(r6, r7, r8, r9, r10)
            if (r13 != r3) goto L_0x0080
            return r3
        L_0x00e4:
            int r0 = r12.A00
            r5 = 3
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0127
            if (r0 == r2) goto L_0x013c
            if (r0 != r4) goto L_0x015f
            java.lang.Object r1 = r12.A02
            X.0rh r1 = (X.0rh) r1
            java.lang.Object r0 = r12.A01
            X.6GK r6 = X.C51965G9l.A0O(r0, r13)
        L_0x00f9:
            X.GPU r13 = (X.GPU) r13
            if (r13 == 0) goto L_0x016f
            java.lang.Object r0 = r12.A06
            X.0sP r0 = (X.0sP) r0
            X.GPU.A00(r13, r0)
            java.lang.Object r4 = r12.A07
            X.0sL r4 = (X.0sL) r4
            float r0 = r1.A00
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r4.invoke(r13, r0)
            long r1 = r13.A05
            r0 = 21
            X.J6G r4 = X.J6G.A00(r4, r0)
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A00 = r5
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A03(r6, r12, r4, r1)
        L_0x0124:
            if (r13 != r3) goto L_0x0162
            return r3
        L_0x0127:
            X.0eS.A00(r13)
            java.lang.Object r6 = r12.A01
            X.6GK r6 = (X.AnonymousClass6GK) r6
            r12.A01 = r6
            r12.A00 = r2
            r1 = 0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r6, r0, r12, r1)
            if (r13 != r3) goto L_0x0142
            return r3
        L_0x013c:
            java.lang.Object r0 = r12.A01
            X.6GK r6 = X.C51965G9l.A0O(r0, r13)
        L_0x0142:
            X.GPU r13 = (X.GPU) r13
            X.0rh r1 = new X.0rh
            r1.<init>()
            long r10 = r13.A05
            int r9 = r13.A04
            X.JFw r8 = new X.JFw
            r8.<init>(r1, r2)
            r12.A01 = r6
            r12.A02 = r1
            r12.A00 = r4
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(r6, r7, r8, r9, r10)
            if (r13 != r3) goto L_0x00f9
            return r3
        L_0x015f:
            X.0eS.A00(r13)
        L_0x0162:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L_0x0172
            java.lang.Object r0 = r12.A05
        L_0x016c:
            X.DbS.A1U(r0)
        L_0x016f:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0172:
            java.lang.Object r0 = r12.A04
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58079IlF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.IlF, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        int i;
        0sL r6;
        0sP r5;
        C62320sa r4;
        C62320sa r3;
        AnonymousClass4D7 r2 = r10;
        switch (this.A03) {
            case 0:
                r5 = (0sP) this.A06;
                r6 = (0sL) this.A07;
                r3 = (C62320sa) this.A05;
                r4 = (C62320sa) this.A04;
                i = 0;
                break;
            case 1:
                r5 = (0sP) this.A06;
                r6 = (0sL) this.A07;
                r3 = (C62320sa) this.A05;
                r4 = (C62320sa) this.A04;
                i = 1;
                break;
            default:
                0sP r32 = (0sP) this.A05;
                0sP r42 = (0sP) this.A06;
                0rm r52 = (0rm) this.A01;
                ? ilF = new C58079IlF((PressGestureScopeImpl) this.A07, r2, r32, r42, r52, (C262224Cq) this.A04);
                ilF.A02 = obj;
                return ilF;
        }
        C58079IlF ilF2 = new C58079IlF(r2, r3, r4, r5, r6, i);
        ilF2.A01 = obj;
        return ilF2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58079IlF) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58079IlF(AnonymousClass4D7 r2, C62320sa r3, C62320sa r4, 0sP r5, 0sL r6, int i) {
        super(2, r2);
        this.A03 = i;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r3;
        this.A04 = r4;
    }
}
