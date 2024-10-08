package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2sR  reason: invalid class name and case insensitive filesystem */
public final class C231812sR implements AnonymousClass2sP {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final boolean A02;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if ((!r0.A00.getBoolean(r6.A09, false)) != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean Esp(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            X.1Xg r6 = (X.1Xg) r6
            X.1UQ r0 = r6.A06
            int r0 = r0.ordinal()
            r2 = 0
            r5 = r17
            switch(r0) {
                case 1: goto L_0x0089;
                case 4: goto L_0x0076;
                case 12: goto L_0x0076;
                case 13: goto L_0x0089;
                case 15: goto L_0x0076;
                case 16: goto L_0x0076;
                case 21: goto L_0x0076;
                case 24: goto L_0x0076;
                case 25: goto L_0x0076;
                case 26: goto L_0x0076;
                default: goto L_0x0010;
            }
        L_0x0010:
            X.1Xn r7 = r6.A05
            X.1Xj r1 = X.1Xi.A02(r7)
            com.instagram.common.session.UserSession r8 = r5.A00
            boolean r0 = r7 instanceof X.AnonymousClass3OA
            r6 = 0
            if (r0 != 0) goto L_0x002d
            X.1Xj r0 = X.1Xi.A02(r7)
            if (r0 == 0) goto L_0x0074
            X.1Xj r0 = X.1Xi.A02(r7)
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x0074
        L_0x002d:
            r4 = 1
        L_0x002e:
            boolean r3 = r7 instanceof X.AnonymousClass3O9
            if (r1 == 0) goto L_0x0045
            java.util.List r1 = r1.A0e
            X.3PG r0 = X.AnonymousClass3PG.CACHED
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0044
            X.3PG r0 = X.AnonymousClass3PG.LOCAL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r6 = 1
        L_0x0045:
            boolean r0 = X.C233832wY.A05(r8, r4, r3, r6)
            if (r0 == 0) goto L_0x00d5
            X.1Xj r10 = X.1Xi.A02(r7)
            if (r10 == 0) goto L_0x0073
            X.4jb r9 = new X.4jb
            r9.<init>(r8, r10)
            X.4DU r11 = r5.A01
            java.lang.String r0 = "afs_subscribed_invalidated_from_main_feed_filter"
            java.util.List r15 = java.util.Collections.singletonList(r0)
            java.lang.String r13 = "afs_subscribed"
            java.util.List r16 = java.util.Collections.singletonList(r13)
            int r0 = r10.A0m()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.String r14 = r10.A2p()
            X.C233822wX.A0O(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0073:
            return r2
        L_0x0074:
            r4 = 0
            goto L_0x002e
        L_0x0076:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Hig r0 = X.C54986HaJ.A00(r0)
            java.lang.String r1 = r6.A09
            X.0xa r0 = r0.A00
            boolean r0 = r0.getBoolean(r1, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0073
            goto L_0x0010
        L_0x0089:
            X.1Xn r0 = r6.A05
            X.1Xj r7 = X.1Xi.A02(r0)
            r7.getClass()
            com.instagram.common.session.UserSession r1 = r5.A00
            boolean r0 = r5.A02
            boolean r0 = X.1sc.A00(r1, r7, r2, r0)
            if (r0 == 0) goto L_0x0073
            r7.A3r()
            X.1Xy r0 = r7.A0C
            X.3y6 r0 = r0.B5M()
            if (r0 == 0) goto L_0x0010
            X.942 r0 = X.AnonymousClass941.A00(r1)
            X.0xa r4 = r0.A00
            java.lang.String r0 = r7.getId()
            r3 = 0
            java.lang.String r1 = r4.getString(r0, r3)
            java.lang.String r0 = "positive_feedback"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r7.getId()
            java.lang.String r1 = r4.getString(r0, r3)
            java.lang.String r0 = "dismissed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0010
        L_0x00ce:
            X.1Xy r0 = r7.A0C
            r0.EWb(r3)
            goto L_0x0010
        L_0x00d5:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231812sR.Esp(java.lang.Object):boolean");
    }

    public C231812sR(UserSession userSession, AnonymousClass4DU r5) {
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = 182.A06(0Tu.A05, userSession, 36312879040824667L);
    }
}
