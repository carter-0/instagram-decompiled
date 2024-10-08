package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2zp  reason: invalid class name and case insensitive filesystem */
public final class C235382zp implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass07V A01;
    public final C230692q2 A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cb, code lost:
        r1 = r6.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d3, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        if (r1 > 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d7, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00df, code lost:
        if (r5 > 1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
        if (r0 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        r0.ACw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        if (r8.equals(r0) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0102, code lost:
        if (X.182.A06(r3, r14, 36328873499246226L) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (X.182.A06(r3, r14, 36328873499442837L) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        if (X.A17.A00(r14, X.1Au.A00(r14)) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
        r0 = X.AnonymousClass1B0.A02;
        r0 = X.AnonymousClass1B1.A00(r14).A00(X.1B2.A0T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        if (r0 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r19, X.C252093oY r20) {
        /*
            r18 = this;
            r3 = 0
            r4 = r19
            X.0qQ.A0B(r4, r3)
            r2 = 1
            r11 = r20
            X.0qQ.A0B(r11, r2)
            r5 = r18
            com.instagram.common.session.UserSession r14 = r5.A00
            java.lang.String r9 = r5.A03
            java.lang.Object r15 = r4.A03
            X.0qQ.A06(r15)
            X.1Xj r15 = (X.1Xj) r15
            java.lang.Object r7 = r4.A04
            r6 = r7
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            int r17 = r6.getPosition()
            X.07V r13 = r5.A01
            r0 = 2
            X.0qQ.A0B(r15, r0)
            X.1Xy r0 = r15.A0C
            X.5qg r0 = r0.Beg()
            if (r0 == 0) goto L_0x007f
            java.lang.Boolean r1 = r0.BuK()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            r0 = 9
            X.Wvs r1 = new X.Wvs
            r1.<init>(r14, r0)
            java.lang.Class<X.A6a> r0 = X.C39709A6a.class
            java.lang.Object r0 = r14.A01(r0, r1)
            X.A6a r0 = (X.C39709A6a) r0
            java.lang.String r1 = r15.getId()
            if (r1 == 0) goto L_0x0184
            android.util.LruCache r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x007f
            X.0Tu r8 = X.0Tu.A05
            r0 = 36318363714132066(0x81075c00011862, double:3.031217682905015E-306)
            boolean r0 = X.182.A06(r8, r14, r0)
            if (r0 == 0) goto L_0x007f
            com.instagram.comments.request.CommentsFetcher r12 = new com.instagram.comments.request.CommentsFetcher
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            X.7aA r9 = X.C333797aA.NOT_SET
            r0 = 36599838691036796(0x82075c00040e7c, double:3.2092235917083244E-306)
            long r0 = X.182.A01(r8, r14, r0)
            r12.A03(r9, r10, r0)
        L_0x007f:
            java.lang.Integer r0 = r11.CEk(r4)
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x0159
            if (r0 != r2) goto L_0x00de
            X.0qQ.A06(r7)
            boolean r0 = r5.A00(r15, r6)
            if (r0 == 0) goto L_0x00de
            X.2q2 r4 = r5.A02
            int r5 = r6.A0D
            int r0 = r6.getPosition()
            int r5 = r5 - r0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36328151948934161(0x81104300433c11, double:3.037407802007918E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            java.lang.String r8 = "never"
            r7 = r8
            if (r0 != 0) goto L_0x00c2
            r0 = 36328151949065235(0x81104300453c13, double:3.03740780209081E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0128
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0128
        L_0x00c2:
            int r0 = r8.hashCode()
            r9 = 0
            switch(r0) {
                case -774141521: goto L_0x00e9;
                case 104712844: goto L_0x00ec;
                case 1235140567: goto L_0x00f1;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            r9 = 1
        L_0x00cb:
            int r1 = r6.getPosition()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00df
            if (r1 > r2) goto L_0x00df
        L_0x00d7:
            if (r9 == 0) goto L_0x00de
        L_0x00d9:
            X.2mt r0 = r4.A03
            r0.ACw()
        L_0x00de:
            return
        L_0x00df:
            if (r5 > r2) goto L_0x00d7
            X.2mt r0 = r4.A01
            if (r0 == 0) goto L_0x00d7
            r0.ACw()
            goto L_0x00d7
        L_0x00e9:
            java.lang.String r0 = "off_peak"
            goto L_0x00f3
        L_0x00ec:
            boolean r0 = r8.equals(r7)
            goto L_0x0125
        L_0x00f1:
            java.lang.String r0 = "off_absolute_peak"
        L_0x00f3:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00ca
            r0 = 36328873499246226(0x8110eb00033e92, double:3.037864113330718E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0119
            r0 = 36328873499442837(0x8110eb00063e95, double:3.0378641134550554E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x00ca
            X.1Av r0 = X.1Au.A00(r14)
            boolean r0 = X.A17.A00(r14, r0)
            if (r0 != 0) goto L_0x00ca
        L_0x0119:
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r14)
            X.1B2 r0 = X.1B2.A0T
            boolean r0 = r1.A00(r0)
        L_0x0125:
            if (r0 != 0) goto L_0x00cb
            goto L_0x00ca
        L_0x0128:
            r0 = 36328151948999698(0x81104300443c12, double:3.037407802049364E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x013e
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x013e
            goto L_0x00c2
        L_0x013e:
            r0 = 36328151949130772(0x81104300463c14, double:3.0374078021322556E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0155
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0155
            goto L_0x00c2
        L_0x0155:
            java.lang.String r8 = "off_absolute_peak"
            goto L_0x00c2
        L_0x0159:
            X.0qQ.A06(r7)
            boolean r0 = r5.A00(r15, r6)
            if (r0 == 0) goto L_0x00de
            X.2q2 r4 = r5.A02
            int r3 = r6.A0D
            int r0 = r6.getPosition()
            int r3 = r3 - r0
            int r1 = r6.getPosition()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0179
            if (r1 > r2) goto L_0x0179
            goto L_0x00d9
        L_0x0179:
            if (r3 > r2) goto L_0x00d9
            X.2mt r0 = r4.A01
            if (r0 == 0) goto L_0x00d9
            r0.ACw()
            goto L_0x00d9
        L_0x0184:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235382zp.ATF(X.30Y, X.3oY):void");
    }

    public C235382zp(AnonymousClass07V r1, UserSession userSession, C230692q2 r3, String str) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = r1;
    }

    private final boolean A00(1Xj r4, AnonymousClass3W1 r5) {
        if (!r5.A0p()) {
            0wb.A03("LoadMoreTriggerAction:evaluate", 002.A0R("position in media state is not set, media type is ", r4.BR7().name()));
        } else if (r5.A2q || r5.getPosition() + this.A02.A00 < r5.A0D) {
            return false;
        } else {
            return true;
        }
        return false;
    }
}
