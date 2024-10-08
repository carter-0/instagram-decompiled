package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3YW  reason: invalid class name */
public final class AnonymousClass3YW {
    public C247733gp A00;
    public 1Xj A01;
    public List A02 = new ArrayList();
    public boolean A03;
    public final int A04;
    public final C227072ib A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final C247733gp A00() {
        17k.A0E(this.A03);
        C247733gp r0 = this.A00;
        r0.getClass();
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (((X.C247733gp) r5.get(0)).A0Z != X.AnonymousClass05K.A01) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r12.A4K() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3YW(android.content.Context r10, com.instagram.common.session.UserSession r11, X.1Xj r12, X.AnonymousClass3W1 r13, java.lang.String r14, boolean r15) {
        /*
            r9 = this;
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A02 = r0
            r9.A01 = r12
            int r0 = X.AnonymousClass3YX.A00(r12, r13, r15)
            r9.A04 = r0
            X.1sy r1 = r13.A0o
            X.1sy r0 = X.1sy.A0U
            r3 = 1
            r2 = 0
            if (r1 != r0) goto L_0x0027
            boolean r0 = r12.A4c()
            if (r0 != 0) goto L_0x0027
            boolean r1 = r12.A4K()
            r0 = 1
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r9.A06 = r0
            X.1i7 r0 = r12.A1X()
            java.util.List r0 = r0.A00
            X.0qQ.A0B(r0, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x003c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r6 = r7.next()
            r4 = r6
            X.3gp r4 = (X.C247733gp) r4
            if (r4 == 0) goto L_0x003c
            X.3pr r1 = r4.A06
            X.3pr r0 = X.C252883pr.Failure
            if (r1 != r0) goto L_0x005c
            java.util.List r0 = r4.A0M
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005c
            goto L_0x003c
        L_0x005c:
            r5.add(r6)
            goto L_0x003c
        L_0x0060:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = r5.get(r2)
            X.3gp r0 = (X.C247733gp) r0
            java.lang.Integer r1 = r0.A0Z
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4 = 1
            if (r1 == r0) goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            r9.A03 = r4
            if (r4 == 0) goto L_0x017d
            java.lang.Object r0 = r5.get(r2)
            X.3gp r0 = (X.C247733gp) r0
        L_0x007e:
            r9.A00 = r0
            X.4jz r8 = X.AnonymousClass3YY.A00(r12)
            if (r4 != 0) goto L_0x00e4
            if (r8 == 0) goto L_0x00e4
            java.lang.String r0 = r8.getQuestion()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = r8.getQuestion()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = r8.getPollId()
            if (r0 == 0) goto L_0x00e4
            boolean r0 = X.AnonymousClass3YY.A04(r11, r12)
            if (r0 == 0) goto L_0x00e4
            r9.A03 = r3
            X.D9g r0 = X.C65211bM.A00
            X.DDf r1 = r0.A00()
            java.lang.String r0 = r8.getPollId()
            r1.A0r = r0
            long r6 = r12.A1A()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.A0g = r0
            java.lang.String r0 = r12.getId()
            r1.A0n = r0
            java.lang.String r0 = r8.getQuestion()
            r1.A0t = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0f = r0
            X.1Xy r0 = r12.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            r1.A09 = r0
            X.1bK r1 = r1.A02()
            X.3gp r0 = new X.3gp
            r0.<init>(r1)
            r9.A00 = r0
            r0.A02(r12)
        L_0x00e4:
            X.2ib r0 = X.AnonymousClass3YZ.A00(r11)
            r9.A05 = r0
            X.1Xy r0 = r12.A0C
            X.4k1 r0 = r0.AlM()
            r6 = 0
            if (r0 == 0) goto L_0x00f4
            r6 = 1
        L_0x00f4:
            boolean r0 = r12.A4c()
            if (r0 != 0) goto L_0x017b
            X.1Xy r0 = r12.A0C
            java.lang.Boolean r0 = r0.BDM()
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x017b
        L_0x0108:
            X.1sy r1 = r13.A0o
            X.1sy r0 = X.1sy.A08
            if (r1 != r0) goto L_0x0110
            if (r6 == 0) goto L_0x017b
        L_0x0110:
            r1 = 1
        L_0x0111:
            java.lang.String r0 = "feed_contextual_chain"
            if (r14 != r0) goto L_0x0122
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x0122
            if (r1 != 0) goto L_0x012d
        L_0x011d:
            r9.A08 = r2
        L_0x011f:
            r9.A07 = r2
            return
        L_0x0122:
            if (r1 == 0) goto L_0x011d
            r0 = 2130971149(0x7f040a0d, float:1.7551028E38)
            boolean r0 = X.2Yu.A0L(r10, r0, r2)
            if (r0 != 0) goto L_0x011d
        L_0x012d:
            X.1sy r1 = r13.A0o
            X.1sy r0 = X.1sy.A08
            if (r1 == r0) goto L_0x0174
            X.3gp r1 = r12.A1W()
            if (r1 == 0) goto L_0x0169
            java.util.List r0 = r9.A02
            r0.add(r1)
        L_0x013e:
            boolean r0 = X.AnonymousClass3YY.A04(r11, r12)
            if (r0 != 0) goto L_0x0152
            int r1 = r12.A0r()
            java.util.List r0 = r9.A02
            if (r0 == 0) goto L_0x0167
            int r0 = r0.size()
            if (r0 >= r1) goto L_0x0167
        L_0x0152:
            r9.A08 = r3
            boolean r0 = r12.A4c()
            r1 = 0
            if (r0 != 0) goto L_0x0165
            r0 = 2130971150(0x7f040a0e, float:1.755103E38)
            boolean r0 = X.2Yu.A0L(r10, r0, r2)
            if (r0 != 0) goto L_0x0165
            r1 = 1
        L_0x0165:
            r2 = r1
            goto L_0x011f
        L_0x0167:
            r3 = 0
            goto L_0x0152
        L_0x0169:
            int r0 = r5.size()
            java.util.List r0 = r5.subList(r4, r0)
            r9.A02 = r0
            goto L_0x013e
        L_0x0174:
            boolean r0 = X.AnonymousClass3YY.A04(r11, r12)
            r9.A08 = r0
            goto L_0x011f
        L_0x017b:
            r1 = 0
            goto L_0x0111
        L_0x017d:
            r0 = 0
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YW.<init>(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.3W1, java.lang.String, boolean):void");
    }
}
