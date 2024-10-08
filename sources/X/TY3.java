package X;

import com.facebookpay.logging.LoggingContext;

public final class TY3 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TY3(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public static void A00(AnonymousClass0Ag r1, LoggingContext loggingContext, Object obj, String str, int i) {
        C12411Sto.A03(r1, loggingContext, new TY3(obj, loggingContext, str, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        r1 = (com.facebookpay.logging.LoggingContext) r4.A02;
        X.C51971G9r.A1B(r3, r1);
        X.Pxe.A1S(r3, r4.A03);
        r1 = X.SQ1.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0116, code lost:
        r2 = (com.facebookpay.logging.LoggingContext) r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011a, code lost:
        X.SQ1.A03(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011d, code lost:
        r1 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011f, code lost:
        r0 = "target_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013b, code lost:
        if (r1 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013d, code lost:
        r3.A02(r1, "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        X.SQ1.A03(r3, (com.facebookpay.logging.LoggingContext) r4.A02);
        r1 = r4.A03;
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r3.A06(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r5.A0N(r3, "event_payload");
        X.C51969G9p.A1G(r5, r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0144;
                case 1: goto L_0x0124;
                case 2: goto L_0x0124;
                case 3: goto L_0x010f;
                case 4: goto L_0x0106;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00cd;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00ae;
                case 14: goto L_0x0098;
                case 15: goto L_0x008f;
                case 16: goto L_0x008f;
                case 17: goto L_0x007f;
                case 18: goto L_0x007f;
                case 19: goto L_0x0124;
                case 20: goto L_0x0124;
                case 21: goto L_0x0077;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x00b6;
                case 26: goto L_0x0005;
                case 27: goto L_0x006f;
                case 28: goto L_0x0067;
                case 29: goto L_0x0067;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x0046;
                case 33: goto L_0x0046;
                case 34: goto L_0x0046;
                case 35: goto L_0x003e;
                case 36: goto L_0x003e;
                case 37: goto L_0x003e;
                case 38: goto L_0x0036;
                case 39: goto L_0x0036;
                case 40: goto L_0x0036;
                case 41: goto L_0x002e;
                case 42: goto L_0x002e;
                case 43: goto L_0x0026;
                case 44: goto L_0x0026;
                case 45: goto L_0x0026;
                case 46: goto L_0x0106;
                case 47: goto L_0x0106;
                case 48: goto L_0x0164;
                case 49: goto L_0x0164;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Ln r5 = (X.1Ln) r5
            X.QID r3 = new X.QID
            r3.<init>()
        L_0x000c:
            java.lang.Object r0 = r4.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.SQ1.A03(r3, r0)
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "view_name"
        L_0x0018:
            r3.A06(r0, r1)
        L_0x001b:
            java.lang.String r0 = "event_payload"
            r5.A0N(r3, r0)
            java.lang.Object r0 = r4.A01
            X.C51969G9p.A1G(r5, r0)
            return r5
        L_0x0026:
            X.1Ln r5 = (X.1Ln) r5
            X.QIk r3 = new X.QIk
            r3.<init>()
            goto L_0x000c
        L_0x002e:
            X.1Ln r5 = (X.1Ln) r5
            X.QIj r3 = new X.QIj
            r3.<init>()
            goto L_0x000c
        L_0x0036:
            X.1Ln r5 = (X.1Ln) r5
            X.QIf r3 = new X.QIf
            r3.<init>()
            goto L_0x000c
        L_0x003e:
            X.1Ln r5 = (X.1Ln) r5
            X.QIT r3 = new X.QIT
            r3.<init>()
            goto L_0x000c
        L_0x0046:
            X.1Ln r5 = (X.1Ln) r5
            X.QIJ r3 = new X.QIJ
            r3.<init>()
            goto L_0x0055
        L_0x004e:
            X.1Ln r5 = (X.1Ln) r5
            X.QIH r3 = new X.QIH
            r3.<init>()
        L_0x0055:
            java.lang.Object r1 = r4.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            java.lang.String r0 = r4.A03
            X.Pxe.A1S(r3, r0)
            X.GkD r1 = X.SQ1.A00(r1)
            goto L_0x013d
        L_0x0067:
            X.1Ln r5 = (X.1Ln) r5
            X.QII r3 = new X.QII
            r3.<init>()
            goto L_0x000c
        L_0x006f:
            X.1Ln r5 = (X.1Ln) r5
            X.QIE r3 = new X.QIE
            r3.<init>()
            goto L_0x000c
        L_0x0077:
            X.1Ln r5 = (X.1Ln) r5
            X.QIA r3 = new X.QIA
            r3.<init>()
            goto L_0x000c
        L_0x007f:
            X.1Ln r5 = (X.1Ln) r5
            X.QI0 r3 = new X.QI0
            r3.<init>()
            X.XST r1 = X.XST.A03
            java.lang.String r0 = "credential_type"
            r3.A01(r1, r0)
            goto L_0x000c
        L_0x008f:
            X.1Ln r5 = (X.1Ln) r5
            X.QHy r3 = new X.QHy
            r3.<init>()
            goto L_0x000c
        L_0x0098:
            X.1Ln r5 = (X.1Ln) r5
            X.QIj r3 = new X.QIj
            r3.<init>()
            java.lang.Object r0 = r4.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.SQ1.A03(r3, r0)
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "autofill_service"
            goto L_0x0018
        L_0x00ae:
            X.1Ln r5 = (X.1Ln) r5
            X.QIf r3 = new X.QIf
            r3.<init>()
            goto L_0x0116
        L_0x00b6:
            X.1Ln r5 = (X.1Ln) r5
            X.QIC r3 = new X.QIC
            r3.<init>()
            java.lang.Object r0 = r4.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.SQ1.A03(r3, r0)
            java.lang.String r0 = r4.A03
            X.Pxe.A1S(r3, r0)
            java.lang.String r1 = "seller_checkout"
            goto L_0x011f
        L_0x00cd:
            X.1Ln r5 = (X.1Ln) r5
            java.lang.Object r2 = r4.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r5.A0R(r0, r1)
            X.2M7 r0 = X.2M7.A02
            X.Pxk.A0U(r0, r5)
            X.QIG r3 = new X.QIG
            r3.<init>()
            goto L_0x011a
        L_0x00e7:
            X.1Ln r5 = (X.1Ln) r5
            X.QIF r3 = new X.QIF
            r3.<init>()
            java.lang.Object r0 = r4.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r3, r0)
            goto L_0x011d
        L_0x00f6:
            X.1Ln r5 = (X.1Ln) r5
            X.QID r3 = new X.QID
            r3.<init>()
            goto L_0x0116
        L_0x00fe:
            X.1Ln r5 = (X.1Ln) r5
            X.QHv r3 = new X.QHv
            r3.<init>()
            goto L_0x0116
        L_0x0106:
            X.1Ln r5 = (X.1Ln) r5
            X.QIp r3 = new X.QIp
            r3.<init>()
            goto L_0x000c
        L_0x010f:
            X.1Ln r5 = (X.1Ln) r5
            X.QIp r3 = new X.QIp
            r3.<init>()
        L_0x0116:
            java.lang.Object r2 = r4.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
        L_0x011a:
            X.SQ1.A03(r3, r2)
        L_0x011d:
            java.lang.String r1 = r4.A03
        L_0x011f:
            java.lang.String r0 = "target_name"
            goto L_0x0018
        L_0x0124:
            X.1Ln r5 = (X.1Ln) r5
            X.N17 r3 = new X.N17
            r3.<init>()
            java.lang.Object r1 = r4.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r3, r1)
            java.lang.String r0 = r4.A03
            X.Pxe.A1S(r3, r0)
            X.GkD r1 = X.SQ1.A00(r1)
            if (r1 == 0) goto L_0x001b
        L_0x013d:
            java.lang.String r0 = "logging_policy"
            r3.A02(r1, r0)
            goto L_0x001b
        L_0x0144:
            java.lang.Object r0 = r4.A01     // Catch:{ Exception -> 0x015d }
            X.Tcd r0 = (X.C13564Tcd) r0     // Catch:{ Exception -> 0x015d }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x015d }
            java.lang.Object r2 = r4.A02     // Catch:{ Exception -> 0x015d }
            com.facebook.privacy.zone.policy.ZonePolicy r2 = (com.facebook.privacy.zone.policy.ZonePolicy) r2     // Catch:{ Exception -> 0x015d }
            java.lang.String r1 = r4.A03     // Catch:{ Exception -> 0x015d }
            com.facebook.privacy.zone.api.ZonedValue r0 = new com.facebook.privacy.zone.api.ZonedValue     // Catch:{ Exception -> 0x015d }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x015d }
            X.QYN r5 = new X.QYN     // Catch:{ Exception -> 0x015d }
            r5.<init>(r0)     // Catch:{ Exception -> 0x015d }
            return r5
        L_0x015d:
            r0 = move-exception
            X.QYM r5 = new X.QYM
            r5.<init>(r0)
            return r5
        L_0x0164:
            X.1Ln r5 = (X.1Ln) r5
            X.N1A r1 = new X.N1A
            r1.<init>()
            java.lang.Object r0 = r4.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.SQ1.A03(r1, r0)
            java.lang.String r0 = r4.A03
            X.Pxg.A1J(r5, r1, r0)
            java.lang.Object r0 = r4.A01
            X.C51969G9p.A1G(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TY3.invoke(java.lang.Object):java.lang.Object");
    }
}
