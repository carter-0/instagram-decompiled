package X;

/* renamed from: X.TyB  reason: case insensitive filesystem */
public final class C14546TyB {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final /* synthetic */ C14533Txt A06;

    public C14546TyB(C14533Txt txt, String str, long j) {
        this.A06 = txt;
        if (j < 0) {
            C14533Txt.A04(txt, 002.A0R("Negative Cache Recency Threshold Entered For Query: ", str));
        }
        txt.A0C.add(str);
        txt.CmE(002.A0R("recency_threshold_for_", str), j);
        this.A05 = str;
        this.A00 = AnonymousClass05K.A00;
        this.A04 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r5.A01 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.A00
            int r4 = r0.intValue()
            r0 = 3
            java.lang.String r3 = "CACHE"
            java.lang.String r2 = "ttrc_source_for_"
            if (r4 == r0) goto L_0x0036
            r0 = 2
            if (r4 == r0) goto L_0x0031
            X.Txt r2 = r5.A06
            java.lang.String r1 = "Unexpected call to addSourceAnnotation in state "
            if (r4 == 0) goto L_0x002e
            java.lang.String r0 = "CACHE_NOT_APPLICABLE_NETWORK_PENDING"
        L_0x0018:
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.C14533Txt.A04(r2, r0)
        L_0x001f:
            X.Txt r2 = r5.A06
            java.lang.String r1 = "prefetched_data_for_"
            java.lang.String r0 = r5.A05
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 0
            r2.CmG(r1, r0)
            return
        L_0x002e:
            java.lang.String r0 = "CACHE_AND_NETWORK_PENDING"
            goto L_0x0018
        L_0x0031:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x001f
            goto L_0x003e
        L_0x0036:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x004a
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x004a
        L_0x003e:
            X.Txt r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.002.A0R(r2, r0)
        L_0x0046:
            r1.CmF(r0, r3)
            goto L_0x001f
        L_0x004a:
            X.Txt r1 = r5.A06
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.002.A0R(r2, r0)
            java.lang.String r3 = "NETWORK"
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14546TyB.A00():void");
    }

    public C14546TyB(C14533Txt txt, String str) {
        this.A06 = txt;
        this.A05 = str;
        this.A00 = AnonymousClass05K.A01;
        this.A04 = -1;
        txt.A0D.add(str);
    }
}
