package X;

/* renamed from: X.MEm  reason: case insensitive filesystem */
public final class C66151MEm extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66151MEm(Object obj, String str, String str2, String str3, String str4, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEm, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        AnonymousClass4D7 r6 = r10;
        switch (i2) {
            case 0:
                str3 = this.A04;
                str4 = this.A05;
                str2 = this.A06;
                str = this.A03;
                i = 0;
                break;
            case 1:
                str = this.A03;
                str2 = this.A06;
                str3 = this.A04;
                str4 = this.A05;
                i = 1;
                break;
            default:
                str = this.A03;
                str3 = this.A04;
                str2 = this.A06;
                str4 = this.A05;
                i = 2;
                break;
        }
        return new C66151MEm(obj2, str3, str4, str2, str, r6, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MEm, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f6, code lost:
        if (r0 != r1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0113, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0117, code lost:
        X.0eS.A00(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 != r1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r3 = r0.A01
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            switch(r3) {
                case 0: goto L_0x0053;
                case 1: goto L_0x002d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r8 = 1
            if (r2 != 0) goto L_0x0117
            X.0eS.A00(r17)
            java.lang.Object r2 = r0.A02
            X.Ghc r2 = (X.C53044Ghc) r2
            X.3ju r7 = r2.A0H
            java.lang.String r6 = r0.A03
            java.lang.String r5 = r0.A04
            java.lang.String r4 = r0.A06
            java.lang.String r3 = r0.A05
            X.HJ9 r2 = new X.HJ9
            r2.<init>(r6, r5, r4, r3)
            r0.A00 = r8
            java.lang.Object r0 = r7.ELH(r2, r0)
        L_0x002a:
            if (r0 != r1) goto L_0x011a
            return r1
        L_0x002d:
            r3 = 1
            if (r2 != 0) goto L_0x0117
            X.0eS.A00(r17)
            java.lang.Object r2 = r0.A02
            X.Mtj r2 = (X.C67730Mtj) r2
            X.KWk r5 = r2.A00
            java.lang.String r6 = r0.A03
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A04
            java.lang.String r9 = r0.A05
            r0.A00 = r3
            X.4HW r3 = r5.A00
            r10 = 0
            com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2 r4 = new com.instagram.direct.inbox.customerdetails.repository.BusinessInboxCustomerDetailsRepository$saveCustomerDetails$2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0gF r2 = X.C60340gF.A00
            java.lang.Object r0 = r3.A00(r2, r0, r4)
            goto L_0x00f6
        L_0x0053:
            r6 = 1
            if (r2 != 0) goto L_0x0117
            X.0eS.A00(r17)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.Object r9 = r0.A02
            com.instagram.appreciation.funding.AppreciationFundingViewModel r9 = (com.instagram.appreciation.funding.AppreciationFundingViewModel) r9
            X.LRg r10 = r9.A03
            int r8 = r9.A01
            java.lang.String r11 = r0.A04
            r2 = 2
            X.0qQ.A0B(r11, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.Jr7 r4 = X.C64165LRg.A00(r10, r5, r2)
            X.JTR.A1K(r4, r8)
            X.LRb r3 = X.C64165LRg.A01(r4, r10, r11)
            com.instagram.appreciation.analytics.LoggingFanData r2 = r10.A01
            X.C64160LRb.A01(r4, r2, r3)
            X.Jr7 r7 = X.C64165LRg.A00(r10, r5, r5)
            X.JTR.A1K(r7, r8)
            X.LRb r4 = X.C64165LRg.A01(r7, r10, r11)
            java.lang.String r3 = r2.A03
            X.0sm r2 = X.0Yt.A0E()
            r4.A03(r7, r3, r2)
            X.Lim r10 = r9.A04
            java.lang.String r4 = r0.A05
            java.lang.String r12 = r0.A06
            java.lang.String r13 = r0.A03
            r0.A00 = r6
            X.LFO r3 = r10.A00
            X.LNj r2 = r3.A01
            X.Jw9 r9 = r2.A00()
            if (r9 == 0) goto L_0x00fa
            java.lang.Object r7 = r9.A04
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x00fa
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x00fa
            java.util.ArrayList r14 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r5 = r7.iterator()
        L_0x00b7:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00cb
            java.lang.Object r2 = r5.next()
            X.JuK r2 = (X.C60962JuK) r2
            X.JuK r2 = X.LHF.A00(r2)
            r14.add(r2)
            goto L_0x00b7
        L_0x00cb:
            X.05G r8 = r10.A01
            java.lang.Object r7 = r9.A01
            X.JwJ r7 = (X.C61081JwJ) r7
            java.lang.Object r5 = r9.A00
            java.lang.Integer r5 = (java.lang.Integer) r5
            X.K2O r2 = new X.K2O
            r2.<init>(r7, r5, r11, r14)
            X.C41847B3o.A1T(r2, r8, r6)
            boolean r7 = X.DbW.A1S(r6, r4, r11)
            r15 = 0
            X.MGN r2 = new X.MGN
            r5 = r11
            r6 = r15
            r2.<init>((java.lang.Object) r3, (java.lang.String) r4, (java.lang.String) r5, (X.AnonymousClass4D7) r6, (int) r7)
            X.032 r2 = X.AnonymousClass0Zq.A00(r2)
            X.MFm r8 = new X.MFm
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r8, r2)
        L_0x00f6:
            if (r0 != r1) goto L_0x0113
            goto L_0x002a
        L_0x00fa:
            X.05G r6 = r10.A01
            X.0sn r14 = X.0sn.A00
            r8 = 0
            r4 = 6
            java.lang.String r3 = "no available packs"
            r2 = 5
            X.Jvb r0 = new X.Jvb
            r0.<init>(r3, r4, r2)
            X.K2R r7 = new X.K2R
            r9 = r0
            r10 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0 = 0
            X.C41847B3o.A1T(r7, r6, r0)
        L_0x0113:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x002a
        L_0x0117:
            X.0eS.A00(r17)
        L_0x011a:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66151MEm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66151MEm) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
