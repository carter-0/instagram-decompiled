package X;

/* renamed from: X.7a5  reason: invalid class name and case insensitive filesystem */
public final class C333757a5 extends C252733pa {
    public 1Xl A00;
    public final C54039GyO A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r1 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C333757a5(X.C54039GyO r13, X.C53335GmL r14, com.instagram.common.session.UserSession r15, java.lang.String r16) {
        /*
            r12 = this;
            r2 = 1
            r8 = r15
            X.0qQ.A0B(r15, r2)
            r11 = 2
            r9 = r16
            X.0qQ.A0B(r9, r11)
            r1 = 3
            r6 = 0
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            X.19S r1 = X.AnonymousClass43D.A01(r0, r1)
            java.lang.String r0 = "MediaSourceRepository"
            r7 = r12
            r12.<init>(r0, r1)
            r12.A01 = r13
            java.lang.String r4 = r14.A08
            java.lang.String r0 = r14.A09
            r5 = 0
            if (r0 == 0) goto L_0x00a8
            X.1Xl r0 = X.C324666zh.A00(r15, r4, r0)
            if (r0 == 0) goto L_0x00a8
            X.1Xj r1 = r0.BPf()
            if (r1 == 0) goto L_0x00a8
            boolean r0 = r1.A5D()
            if (r0 != r2) goto L_0x00a8
            X.1Xy r0 = r1.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x00a8
            java.util.Iterator r3 = r0.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x0041
        L_0x0058:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x00a8
        L_0x005c:
            r12.A00 = r1
            if (r1 == 0) goto L_0x006a
            X.1Xj r0 = r1.BPf()
            if (r0 == 0) goto L_0x006a
            X.7a7 r6 = X.C333767a6.A00(r15, r0)
        L_0x006a:
            X.02z r0 = X.106.A01(r6)
            r12.A02 = r0
            X.05F r0 = X.10b.A03(r0)
            r12.A03 = r0
            X.1Xl r0 = r12.A00
            if (r0 != 0) goto L_0x009c
            if (r13 == 0) goto L_0x0081
            java.lang.String r0 = "fetch_with_media"
            r13.A0K(r0, r2)
        L_0x0081:
            X.GyO r0 = r12.A01
            r10 = 0
            if (r0 == 0) goto L_0x008d
            X.34p r0 = r0.A00
            if (r0 == 0) goto L_0x008d
            r0.A08(r10)
        L_0x008d:
            X.4Cq r2 = r12.A01
            X.9KZ r6 = new X.9KZ
            r6.<init>(r7, r8, r9, r10, r11)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r6, r2)
        L_0x009b:
            return
        L_0x009c:
            if (r13 == 0) goto L_0x009b
            X.34p r0 = r13.A00
            if (r0 == 0) goto L_0x009b
            r0.A02()
            return
        L_0x00a6:
            r1 = r5
            goto L_0x0058
        L_0x00a8:
            X.1Xl r1 = X.C324666zh.A00(r15, r4, r9)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333757a5.<init>(X.GyO, X.GmL, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final void A00(0sP r5) {
        Object value = this.A03.getValue();
        if (value != null) {
            r5.invoke(value);
            return;
        }
        C262224Cq r3 = this.A01;
        AnonymousClass9KF r2 = new AnonymousClass9KF((Object) r5, (AnonymousClass4D7) null, (Object) this, 16);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A01(0sP r5) {
        1Xl r0 = this.A00;
        if (r0 != null) {
            r5.invoke(r0);
            return;
        }
        C262224Cq r3 = this.A01;
        AnonymousClass9KF r2 = new AnonymousClass9KF((Object) r5, (AnonymousClass4D7) null, (Object) this, 17);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }
}
