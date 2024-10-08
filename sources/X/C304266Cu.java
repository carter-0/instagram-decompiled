package X;

/* renamed from: X.6Cu  reason: invalid class name and case insensitive filesystem */
public final class C304266Cu extends 0Yg implements 0sP {
    public final /* synthetic */ C299585vR A00;
    public final /* synthetic */ C304226Cq A01;
    public final /* synthetic */ C299725vk A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sL A06;
    public final /* synthetic */ 0sK A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C304266Cu(C299585vR r2, C304226Cq r3, C299725vk r4, C62320sa r5, 0sP r6, 0sP r7, 0sL r8, 0sK r9) {
        super(1);
        this.A01 = r3;
        this.A05 = r6;
        this.A06 = r8;
        this.A00 = r2;
        this.A04 = r7;
        this.A07 = r9;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        if (r0 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00db, code lost:
        r2.invoke(r1, java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Number r6 = (java.lang.Number) r6
            int r1 = r6.intValue()
            X.6Cq r4 = r5.A01
            X.5Tq r0 = r4.A00()
            java.util.List r0 = r0.A03(r1, r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.62b r0 = (X.C3022062b) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "web_url_span"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "mention_span"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "ig_mention_span"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "expand_text_span"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "tag_span"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0014
        L_0x004b:
            X.62b r3 = (X.C3022062b) r3
            r0 = 0
            if (r3 == 0) goto L_0x005b
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x005b
            int r1 = r2.hashCode()
            switch(r1) {
                case -1585652571: goto L_0x0065;
                case -1247948288: goto L_0x0072;
                case -763846449: goto L_0x0088;
                case 791117751: goto L_0x00a0;
                case 2009314431: goto L_0x00c6;
                default: goto L_0x005b;
            }
        L_0x005b:
            X.0sa r0 = r5.A03
            if (r0 == 0) goto L_0x0062
            r0.invoke()
        L_0x0062:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0065:
            java.lang.String r0 = "web_url_span"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.0sP r0 = r5.A05
            java.lang.Object r2 = r3.A02
            goto L_0x00c2
        L_0x0072:
            java.lang.String r0 = "ig_mention_span"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.0sL r2 = r5.A06
            java.lang.Object r1 = r3.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            java.lang.String r1 = X.00l.A0F(r0, r1)
            r0 = 1
            goto L_0x00db
        L_0x0088:
            java.lang.String r1 = "tag_span"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x005b
            X.0sK r4 = r5.A07
            java.lang.Object r3 = r3.A02
            java.lang.String r2 = "tags"
            X.5vk r1 = r5.A02
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = r1.A03
        L_0x009c:
            r4.invoke(r3, r2, r0)
            goto L_0x0062
        L_0x00a0:
            java.lang.String r0 = "expand_text_span"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.5vR r0 = r5.A00
            X.5vR r2 = X.C299585vR.ExpandDisabled
            if (r0 == r2) goto L_0x00be
            X.5Oz r0 = r4.A04
            X.5vR r2 = X.C299585vR.Expanded
            r0.Epw(r2)
            X.5Oz r1 = r4.A03
            if (r1 == 0) goto L_0x00be
            X.5Tq r0 = r4.A05
            r1.Epw(r0)
        L_0x00be:
            X.0sP r0 = r5.A04
            if (r0 == 0) goto L_0x0062
        L_0x00c2:
            r0.invoke(r2)
            goto L_0x0062
        L_0x00c6:
            java.lang.String r0 = "mention_span"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.0sL r2 = r5.A06
            java.lang.Object r1 = r3.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "@"
            java.lang.String r1 = X.00l.A0F(r0, r1)
            r0 = 0
        L_0x00db:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r1, r0)
            goto L_0x0062
        L_0x00e3:
            r3 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304266Cu.invoke(java.lang.Object):java.lang.Object");
    }
}
