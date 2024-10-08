package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7WX  reason: invalid class name */
public final class AnonymousClass7WX {
    public boolean A00;
    public final UserSession A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;

    public AnonymousClass7WX(UserSession userSession, C62320sa r3, C62320sa r4, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(r7, 6);
        this.A01 = userSession;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r5;
        this.A06 = r6;
        this.A03 = r7;
        this.A02 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r7 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r1.A0v != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass7WX r15) {
        /*
            r6 = 1
            r15.A00 = r6
            com.instagram.common.session.UserSession r4 = r15.A01
            X.0sa r0 = r15.A04
            java.lang.Object r5 = r0.invoke()
            com.instagram.direct.capabilities.Capabilities r5 = (com.instagram.direct.capabilities.Capabilities) r5
            X.0sa r0 = r15.A05
            java.lang.Object r9 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            X.0sa r0 = r15.A07
            java.lang.Object r12 = r0.invoke()
            X.9HC r12 = (X.AnonymousClass9HC) r12
            X.0sa r0 = r15.A06
            java.lang.Object r10 = r0.invoke()
            X.7N8 r10 = (X.AnonymousClass7N8) r10
            X.0sa r0 = r15.A03
            java.lang.Object r2 = r0.invoke()
            X.7Zg r2 = (X.C333517Zg) r2
            X.7S7 r8 = r2.C6l()
            boolean r0 = r8.CdE()
            r7 = 1
            if (r0 == 0) goto L_0x0058
            X.7GL r3 = X.AnonymousClass7GK.A08
            X.0sa r0 = r15.A02
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.2Er r2 = r2.Api()
            if (r2 == 0) goto L_0x0102
            boolean r1 = r3.A04(r4, r2, r0)
            boolean r0 = r8.EtG()
            if (r0 != 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00f6
        L_0x0058:
            r0 = 22
            X.9Ko r1 = new X.9Ko
            r1.<init>(r15, r0)
            X.7Nd r2 = X.C330517Nd.A00
            X.0qQ.A0B(r5, r6)
            r0 = 8
            X.0qQ.A0B(r2, r0)
            if (r9 == 0) goto L_0x00f3
            if (r12 == 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r1 = r1.invoke()
            X.7SD r1 = (X.AnonymousClass7SD) r1
            X.9Gx r0 = X.C376179Gx.MESSAGE_REPLY
            boolean r0 = r5.A00(r0)
            r15 = 0
            if (r0 == 0) goto L_0x0081
            r13 = 1
            if (r7 != 0) goto L_0x0082
        L_0x0081:
            r13 = 0
        L_0x0082:
            X.9HW r4 = X.AnonymousClass9HV.A00(r4)
            X.3t3 r3 = r1.A0P
            r0 = 46
            boolean r0 = r4.A00(r3, r0)
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r1.A0n
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r1.A0s
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r1.A0t
            if (r0 != 0) goto L_0x00a1
            boolean r0 = r1.A0v
            r14 = 1
            if (r0 == 0) goto L_0x00a2
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            X.0eM r0 = r12.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = r0 ^ 1
            boolean r0 = r1.A0s
            if (r0 == 0) goto L_0x00f4
            int r1 = r1.A08
            r0 = 29
            if (r1 != r0) goto L_0x00f4
            if (r3 != 0) goto L_0x00d8
            X.0eM r0 = r12.A1M
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d8
            X.0eM r0 = r12.A1N
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d9
        L_0x00d8:
            r15 = 1
        L_0x00d9:
            X.7Ne r11 = new X.7Ne
            r11.<init>(r2)
            r2 = 2131431566(0x7f0b108e, float:1.8484865E38)
            java.lang.Object r1 = r9.getTag(r2)
            boolean r0 = r1 instanceof X.C330537Nf
            if (r0 == 0) goto L_0x00f9
            X.7Nf r1 = (X.C330537Nf) r1
            if (r1 == 0) goto L_0x00f9
            r1.A07 = r13
            r1.A06 = r14
            r1.A08 = r15
        L_0x00f3:
            return
        L_0x00f4:
            r15 = r3
            goto L_0x00d9
        L_0x00f6:
            r7 = 0
            goto L_0x0058
        L_0x00f9:
            X.7Nf r8 = new X.7Nf
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r9.setTag(r2, r8)
            return
        L_0x0102:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WX.A00(X.7WX):void");
    }
}
