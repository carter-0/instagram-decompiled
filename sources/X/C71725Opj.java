package X;

import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.Opj  reason: case insensitive filesystem */
public final class C71725Opj implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public C71725Opj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        return com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOO(r0, r1, r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        return com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        return new com.facebook.msys.mca.MailboxNullable(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object run(com.facebook.msys.mca.Mailbox r15, com.facebook.msys.mci.sqliteholder.SqliteHolder r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            r13 = r16
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0101;
                case 2: goto L_0x005e;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00ef;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00be;
                case 9: goto L_0x00b5;
                case 10: goto L_0x00aa;
                case 11: goto L_0x00a1;
                case 12: goto L_0x0098;
                case 13: goto L_0x008f;
                case 14: goto L_0x0086;
                case 15: goto L_0x007c;
                case 16: goto L_0x0072;
                case 17: goto L_0x0045;
                case 18: goto L_0x002f;
                case 19: goto L_0x0012;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 0
            java.lang.Object r0 = com.facebook.urlblackhole.mca.MailboxUrlBlackholeJNI.dispatchCqlOO(r0, r13)
        L_0x000c:
            com.facebook.msys.mca.MailboxNullable r1 = new com.facebook.msys.mca.MailboxNullable
            r1.<init>(r0)
            return r1
        L_0x0012:
            java.lang.Object r0 = r14.A01
            X.OpN r0 = (X.C71703OpN) r0
            r1 = 30
            long r2 = r0.A01
            long r4 = r0.A00
            java.lang.String r6 = r0.A09
            java.lang.String r7 = r0.A08
            java.lang.Number r8 = r0.A04
            java.lang.String r9 = r0.A07
            java.lang.Number r10 = r0.A05
            java.lang.Object r11 = r0.A06
            r12 = 0
            r0 = 2
            java.lang.Object r0 = com.facebook.tamreportingshim.mca.MailboxTamReportingShimJNI.dispatchCqlOIJJOOOOOOOO(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x000c
        L_0x002f:
            java.lang.Object r0 = r14.A01
            X.OpH r0 = (X.C71697OpH) r0
            int r5 = r0.A00
            long r6 = r0.A02
            long r8 = r0.A01
            java.lang.String r10 = r0.A06
            java.lang.Object r11 = r0.A05
            java.lang.String r12 = r0.A07
            r4 = 1
            java.lang.Object r0 = com.facebook.tamreportingshim.mca.MailboxTamReportingShimJNI.dispatchCqlOIJJOOOO(r4, r5, r6, r8, r10, r11, r12, r13)
            goto L_0x000c
        L_0x0045:
            java.lang.Object r0 = r14.A01
            X.OoZ r0 = (X.C71654OoZ) r0
            long r2 = r0.A00
            java.lang.String r1 = r0.A03
            r0 = 0
            java.lang.Object r1 = com.facebook.tamreportingshim.mca.MailboxTamReportingShimJNI.dispatchCqlOJOO(r0, r2, r1, r13)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            if (r1 != 0) goto L_0x0058
            r0 = 0
            goto L_0x000c
        L_0x0058:
            X.NBG r0 = new X.NBG
            r0.<init>(r1)
            goto L_0x000c
        L_0x005e:
            r0 = 59
            java.lang.Object r0 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOO(r0, r13)
            goto L_0x000c
        L_0x0065:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 55
            java.lang.Object r0 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r13)
            goto L_0x000c
        L_0x0072:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 89
            goto L_0x0109
        L_0x007c:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 88
            goto L_0x0109
        L_0x0086:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 87
            goto L_0x0109
        L_0x008f:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 82
            goto L_0x0109
        L_0x0098:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 79
            goto L_0x0109
        L_0x00a1:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 76
            goto L_0x0109
        L_0x00aa:
            java.lang.Object r0 = r14.A01
            X.Ope r0 = (X.C71720Ope) r0
            long r1 = r0.A02
            java.lang.String r3 = r0.A05
            r0 = 75
            goto L_0x00d3
        L_0x00b5:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 74
            goto L_0x0109
        L_0x00be:
            java.lang.Object r0 = r14.A01
            X.Ope r0 = (X.C71720Ope) r0
            long r1 = r0.A02
            java.lang.String r3 = r0.A05
            r0 = 73
            goto L_0x00d3
        L_0x00c9:
            java.lang.Object r0 = r14.A01
            X.Ope r0 = (X.C71720Ope) r0
            long r1 = r0.A02
            java.lang.String r3 = r0.A05
            r0 = 72
        L_0x00d3:
            java.lang.Object r1 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOO(r0, r1, r3, r13)
            return r1
        L_0x00d8:
            java.lang.Object r0 = r14.A01
            X.Oou r0 = (X.C71675Oou) r0
            long r9 = r0.A03
            long r11 = r0.A02
            r8 = 5
            java.lang.Object r1 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJJO(r8, r9, r11, r13)
            return r1
        L_0x00e6:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 67
            goto L_0x0109
        L_0x00ef:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 63
            goto L_0x0109
        L_0x00f8:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 62
            goto L_0x0109
        L_0x0101:
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 56
        L_0x0109:
            java.lang.Object r1 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71725Opj.run(com.facebook.msys.mca.Mailbox, com.facebook.msys.mci.sqliteholder.SqliteHolder):java.lang.Object");
    }
}
