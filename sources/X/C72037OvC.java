package X;

/* renamed from: X.OvC  reason: case insensitive filesystem */
public final class C72037OvC implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C72037OvC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r1.A02(r0);
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        return r2.thenAccept(new X.C73452Pcu(r1, (X.0sP) r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            r6 = r11
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0073;
                case 2: goto L_0x003c;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r10.A01
            X.MYb r5 = (X.MYb) r5
            java.lang.Object r4 = r10.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r10.A03
            X.NAE r3 = (X.NAE) r3
            java.lang.Object r2 = r10.A04
            X.OMq r2 = (X.OMq) r2
            boolean r0 = X.AnonymousClass7TE.A1a(r11)
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "Failed to issue receiver fetch request"
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
            X.Oxl r0 = new X.Oxl
            r0.<init>(r1)
            X.1aU r0 = X.1aU.A09(r0)
            return r0
        L_0x002c:
            java.lang.String r0 = "mailbox_instagram_open_xma_receiver_fetch"
            X.4fh r1 = X.AnonymousClass6F9.A00(r0)
            X.Ox3 r0 = new X.Ox3
            r0.<init>(r3, r5, r2, r4)
            X.1aU r0 = X.1aU.A07(r0, r1)
            return r0
        L_0x003c:
            boolean r0 = r11 instanceof X.C68709NTv
            java.lang.Object r6 = r10.A03
            X.NUW r6 = (X.NUW) r6
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "IMPLICIT_BACKUP_ALREADY_EXISTS"
            r6.A0H(r0)
        L_0x0049:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x004c:
            java.lang.String r0 = "IMPLICIT_BACKUP_CREATION_ATTEMPT"
            r6.A0B(r0)
            java.lang.Object r5 = r10.A04
            X.OBN r5 = (X.OBN) r5
            java.lang.Object r4 = r10.A01
            X.OO6 r4 = (X.OO6) r4
            X.1a8 r3 = r5.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            java.lang.Object r0 = r10.A02
            android.content.Context r0 = (android.content.Context) r0
            X.P0w r2 = new X.P0w
            r2.<init>(r0, r5, r6)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.1aU r1 = r4.A04(r3, r1)
            r0 = 3
            X.PU8.A00(r1, r3, r2, r0)
            goto L_0x0049
        L_0x0073:
            boolean r0 = r11 instanceof X.C68709NTv
            if (r0 == 0) goto L_0x0090
            X.OUY r0 = X.OUY.A00
            java.lang.Object r5 = r10.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.util.concurrent.CompletableFuture r2 = r0.A00(r5)
            java.lang.Object r9 = r10.A04
            java.lang.Object r8 = r10.A01
            java.lang.Object r7 = r10.A02
            r4 = 11
            X.Ixb r3 = new X.Ixb
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = 3
            goto L_0x00cc
        L_0x0090:
            java.lang.Object r1 = r10.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            X.NU0 r0 = X.NU0.A00
            goto L_0x00a7
        L_0x009a:
            boolean r0 = r11 instanceof X.C68691NTd
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r1 = r10.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            X.0qQ.A0A(r1)
            X.NTh r0 = X.C68695NTh.A00
        L_0x00a7:
            r1.A02(r0)
            r1.A00()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00b0:
            boolean r0 = r11 instanceof X.C68690NTc
            if (r0 == 0) goto L_0x00d6
            X.OUY r0 = X.OUY.A00
            java.lang.Object r5 = r10.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.util.concurrent.CompletableFuture r2 = r0.A00(r5)
            java.lang.Object r9 = r10.A04
            java.lang.Object r8 = r10.A01
            java.lang.Object r7 = r10.A02
            r4 = 10
            X.Ixb r3 = new X.Ixb
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = 2
        L_0x00cc:
            X.Pcu r0 = new X.Pcu
            r0.<init>((int) r1, (X.0sP) r3)
            java.util.concurrent.CompletableFuture r0 = r2.thenAccept(r0)
            return r0
        L_0x00d6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72037OvC.apply(java.lang.Object):java.lang.Object");
    }
}
