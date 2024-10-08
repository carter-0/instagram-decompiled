package com.instagram.comments.mvvm.data.network;

public abstract class RestrictedCommentNetworkRequestsKt {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C335907dj r6, com.instagram.common.session.UserSession r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 11
            boolean r0 = X.C58074Il6.A02(r3, r8)
            if (r0 == 0) goto L_0x006b
            r5 = r8
            X.Il6 r5 = (X.C58074Il6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r3) goto L_0x0076
            X.0eS.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0039
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x002c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0071
            X.5sO r1 = X.DbU.A0f()
        L_0x0038:
            return r1
        L_0x0039:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0042:
            X.0eS.A00(r1)
            X.1YZ r0 = X.1YZ.A02
            if (r0 != 0) goto L_0x004e
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x004e:
            java.lang.String r2 = r6.A0K
            X.1NY r1 = X.DbZ.A0L(r7)
            java.lang.String r0 = "restrict_action/approve_restricted_comment/"
            r1.A0A(r0)
            java.lang.String r0 = "comment_id"
            X.DbX.A1M(r1, r0, r2)
            X.1OC r0 = r1.A0M()
            r5.A00 = r3
            java.lang.Object r1 = r0.A01(r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x006b:
            X.Il6 r5 = new X.Il6
            r5.<init>(r3, r8)
            goto L_0x0016
        L_0x0071:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A00(X.7dj, com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r5, java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 10
            boolean r0 = X.C58074Il6.A02(r3, r8)
            if (r0 == 0) goto L_0x006e
            r4 = r8
            X.Il6 r4 = (X.C58074Il6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r1) goto L_0x0079
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.7ax r0 = (X.C334247ax) r0
            java.util.List r0 = r0.getItems()
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0038:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0044
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0074
            X.5sO r3 = X.DbU.A0f()
        L_0x0044:
            return r3
        L_0x0045:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0038
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004e:
            X.0eS.A00(r3)
            X.1YZ r0 = X.1YZ.A02
            if (r0 != 0) goto L_0x005a
            X.5sO r2 = X.DbU.A0f()
            return r2
        L_0x005a:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.AnonymousClass7TF.A1B(r6, r1, r7)
            X.1OC r0 = X.C334237aw.A01(r5, r6, r7)
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x006e:
            X.Il6 r4 = new X.Il6
            r4.<init>(r3, r8)
            goto L_0x0016
        L_0x0074:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.RestrictedCommentNetworkRequestsKt.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
