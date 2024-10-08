package X;

import com.meta.compose.material.bottomsheet.AnchoredDraggableKt;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.Hri  reason: case insensitive filesystem */
public final class C56035Hri {
    public Float A00;
    public final C270284gU A01;
    public final AnchoredDraggableState A02;
    public final AnonymousClass5b9 A03;

    public C56035Hri(AnonymousClass5b9 r7, C270284gU r8, C268024cd r9, C54624HLh hLh, Float f, 0sP r12) {
        C51974G9v.A1P(hLh, r9, r8, r12);
        0qQ.A0B(r7, 5);
        this.A01 = r8;
        this.A03 = r7;
        this.A00 = f;
        C59098J6g A012 = C59098J6g.A01(r9, 25);
        this.A02 = new AnchoredDraggableState(r7, hLh, C58686Ivv.A00(r9, 35), A012, r12);
        if (this.A00 != null && hLh == C54624HLh.HalfExpanded) {
            throw AnonymousClass7TE.A0w("The initial value must not be set to HalfExpanded if an initial height is set.");
        }
    }

    public final Object A00(AnonymousClass4D7 r4) {
        C54624HLh hLh = C54624HLh.Hidden;
        AnchoredDraggableState anchoredDraggableState = this.A02;
        Object A002 = AnchoredDraggableKt.A00(anchoredDraggableState, hLh, r4, anchoredDraggableState.A02.B6X());
        1Hj r0 = 1Hj.A02;
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (((X.C56158Htm) r5.getValue()).A00.containsKey(r1) == false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r4 = r6.A02
            X.5Oz r5 = r4.A04
            java.lang.Object r0 = r5.getValue()
            X.Htm r0 = (X.C56158Htm) r0
            X.HLh r3 = X.C54624HLh.Expanded
            java.util.Map r0 = r0.A00
            boolean r2 = r0.containsKey(r3)
            X.5Oz r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.HLh r0 = (X.C54624HLh) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x0047
            java.lang.Object r0 = r5.getValue()
            X.Htm r0 = (X.C56158Htm) r0
            X.HLh r1 = X.C54624HLh.HalfExpanded
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            X.5PZ r0 = r4.A02
            float r0 = r0.B6X()
            java.lang.Object r1 = com.meta.compose.material.bottomsheet.AnchoredDraggableKt.A00(r4, r1, r7, r0)
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x0042
            X.0gF r1 = X.C60340gF.A00
        L_0x0042:
            if (r1 == r0) goto L_0x0046
            X.0gF r1 = X.C60340gF.A00
        L_0x0046:
            return r1
        L_0x0047:
            if (r2 != 0) goto L_0x0031
            X.HLh r1 = X.C54624HLh.Hidden
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56035Hri.A01(X.4D7):java.lang.Object");
    }
}
