package com.instagram.notifications.badging.ui.viewmodel;

import X.02o;
import X.AnonymousClass2g3;

public final class BaseBadgeViewModel$special$$inlined$map$3$2 implements 02o {
    public final /* synthetic */ AnonymousClass2g3 A00;
    public final /* synthetic */ 02o A01;

    public BaseBadgeViewModel$special$$inlined$map$3$2(AnonymousClass2g3 r1, 02o r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        if (r4.isEmpty() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 34
            boolean r0 = X.AnonymousClass9JT.A00(r3, r14)
            if (r0 == 0) goto L_0x00e3
            r7 = r14
            X.9JT r7 = (X.AnonymousClass9JT) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e3
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r8) goto L_0x00ea
            X.0eS.A00(r1)
        L_0x0024:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0027:
            X.0eS.A00(r1)
            X.02o r5 = r12.A01
            X.2aX r13 = (X.2aX) r13
            X.2g3 r9 = r12.A00
            java.util.List r0 = r13.A04
            if (r0 == 0) goto L_0x00c0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x003d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r4 = r10.next()
            r3 = r4
            X.2aX r3 = (X.2aX) r3
            java.util.Map r0 = r9.A0F
            java.util.Set r1 = r0.keySet()
            X.2aE r0 = r3.A03
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 == 0) goto L_0x003d
            int r1 = r3.A01
            int r0 = r3.A00
            int r1 = r1 + r0
            if (r1 == 0) goto L_0x003d
            r2.add(r4)
            goto L_0x003d
        L_0x0063:
            X.3Pr r1 = X.C241563Pr.A00
            X.3Ps r0 = new X.3Ps
            r0.<init>(r1)
            java.util.List r1 = X.00k.A0g(r2, r0)
            if (r1 == 0) goto L_0x00c0
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
        L_0x007f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r10 = r11.next()
            X.2aX r10 = (X.2aX) r10
            X.2aE r2 = r10.A03
            boolean r0 = r2 instanceof X.AnonymousClass4DE
            if (r0 == 0) goto L_0x00be
            r0 = r2
            X.4DE r0 = (X.AnonymousClass4DE) r0
            if (r0 == 0) goto L_0x00be
            X.2aD r1 = r0.A01
            if (r1 == 0) goto L_0x00be
        L_0x009a:
            int r3 = r10.A01
            int r0 = r10.A00
            int r3 = r3 + r0
            java.util.Map r0 = r9.A0F
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00ba
            int r2 = r0.intValue()
        L_0x00ad:
            java.lang.String r1 = r1.BOD()
            X.9Is r0 = new X.9Is
            r0.<init>((int) r3, (int) r2, (java.lang.String) r1)
            r4.add(r0)
            goto L_0x007f
        L_0x00ba:
            r2 = 2131239377(0x7f0821d1, float:1.809506E38)
            goto L_0x00ad
        L_0x00be:
            r1 = r2
            goto L_0x009a
        L_0x00c0:
            X.0sn r4 = X.0sn.A00
        L_0x00c2:
            int r3 = r9.A04
            int r1 = r13.A01
            int r0 = r13.A00
            int r1 = r1 + r0
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r4.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x00d3
        L_0x00d2:
            r2 = 1
        L_0x00d3:
            r1 = 8
            X.9IR r0 = new X.9IR
            r0.<init>((java.util.List) r4, (int) r3, (int) r1, (boolean) r2)
            r7.A00 = r8
            java.lang.Object r0 = r5.emit(r0, r7)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x00e3:
            X.9JT r7 = new X.9JT
            r7.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x00ea:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$3$2.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
