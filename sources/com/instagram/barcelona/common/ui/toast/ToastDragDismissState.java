package com.instagram.barcelona.common.ui.toast;

import X.0qQ;
import X.0sK;
import X.C268024cd;
import X.C270284gU;
import X.C284895Os;
import X.C284945Oz;
import X.C51965G9l;
import X.C51967G9n;
import X.C51969G9p;
import X.C51970G9q;
import X.C56836IEh;
import X.C59099J6h;
import X.GQV;
import X.JNP;
import X.MMP;

public final class ToastDragDismissState {
    public final float A00;
    public final JNP A01;
    public final JNP A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final C270284gU A05 = C51965G9l.A0I((C284895Os) null, new MMP(this, 42));
    public final C270284gU A06 = C51965G9l.A0I((C284895Os) null, new MMP(this, 43));
    public final float A07;
    public final C270284gU A08;
    public final C270284gU A09;
    public final C268024cd A0A;

    public ToastDragDismissState(C270284gU r4, C270284gU r5, C268024cd r6) {
        0qQ.A0B(r6, 1);
        this.A0A = r6;
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r6.F06(100.0f);
        this.A00 = r6.F06(300.0f);
        Float A0g = C51967G9n.A0g();
        this.A03 = C51970G9q.A0S(A0g);
        this.A04 = C51969G9p.A0S(A0g);
        C59099J6h j6h = new C59099J6h(this, 23);
        0sK r0 = GQV.A00;
        this.A01 = new C56836IEh(j6h);
        this.A02 = new C56836IEh(new C59099J6h(this, 24));
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.Il3, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C284945Oz r13, X.AnonymousClass4D7 r14, float r15) {
        /*
            r12 = this;
            r4 = 1
            boolean r0 = r14 instanceof X.C58071Il3
            if (r0 == 0) goto L_0x0098
            r9 = r14
            X.Il3 r9 = (X.C58071Il3) r9
            int r0 = r9.A05
            if (r0 != r4) goto L_0x0098
            int r2 = r9.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0098
            int r2 = r2 - r1
            r9.A01 = r2
        L_0x0017:
            java.lang.Object r6 = r9.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r9.A01
            r5 = 0
            if (r0 == 0) goto L_0x003b
            if (r0 != r4) goto L_0x009f
            float r2 = r9.A00
            java.lang.Object r1 = r9.A02
            com.instagram.barcelona.common.ui.toast.ToastDragDismissState r1 = (com.instagram.barcelona.common.ui.toast.ToastDragDismissState) r1
            X.0eS.A00(r6)
        L_0x002b:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            X.4gU r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.DbS.A1U(r0)
        L_0x0038:
            X.0gF r3 = X.C60340gF.A00
        L_0x003a:
            return r3
        L_0x003b:
            X.0eS.A00(r6)
            X.4cd r1 = r12.A0A
            X.6HM r0 = new X.6HM
            r0.<init>(r1)
            X.6HQ r1 = new X.6HQ
            r1.<init>(r0)
            float r0 = X.C51971G9r.A02(r13)
            float r2 = X.C54734HQp.A00(r1, r0, r15)
            float r1 = java.lang.Math.abs(r2)
            float r0 = r12.A07
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0096
            float r0 = r12.A00
            float r2 = java.lang.Math.copySign(r0, r2)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x006f
            X.4gU r0 = r12.A08
            java.lang.Object r0 = r0.getValue()
            X.DbS.A1U(r0)
        L_0x006f:
            float r0 = X.C51971G9r.A02(r13)
            r11 = 0
            r1 = 0
            X.5b5 r7 = X.GQU.A00(r0, r15)
            java.lang.Float r8 = X.C51965G9l.A0q(r2)
            r0 = 22
            X.J6h r10 = new X.J6h
            r10.<init>(r13, r0)
            r9.A02 = r12
            r9.A00 = r2
            r9.A01 = r4
            X.5b7 r6 = X.C51972G9s.A0J(r1)
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r6, r7, r8, r9, r10, r11)
            if (r0 == r3) goto L_0x003a
            r1 = r12
            goto L_0x002b
        L_0x0096:
            r2 = 0
            goto L_0x006f
        L_0x0098:
            X.Il3 r9 = new X.Il3
            r9.<init>(r12, r14)
            goto L_0x0017
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.toast.ToastDragDismissState.A00(X.5Oz, X.4D7, float):java.lang.Object");
    }
}
