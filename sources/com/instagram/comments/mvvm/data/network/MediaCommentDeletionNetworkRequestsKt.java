package com.instagram.comments.mvvm.data.network;

public abstract class MediaCommentDeletionNetworkRequestsKt {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r0 == r3) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.util.Collection r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 6
            boolean r0 = X.C58074Il6.A02(r3, r12)
            if (r0 == 0) goto L_0x009b
            r5 = r12
            X.Il6 r5 = (X.C58074Il6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r5.A00
            r6 = 1
            if (r1 == 0) goto L_0x006a
            if (r1 != r6) goto L_0x00a7
            X.0eS.A00(r0)
        L_0x0023:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003c
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.GyY r0 = (X.C54049GyY) r0
            X.JRW r0 = r0.A00
            if (r0 != 0) goto L_0x0045
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0049
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0045:
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0049:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x009a
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a2
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r0 = r3.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Object r0 = r0.A00()
            X.1XT r0 = (X.AnonymousClass1XT) r0
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r0.getErrorCode()
        L_0x0063:
            X.5sO r3 = X.C41845B3m.A0c(r0)
            return r3
        L_0x0068:
            r0 = 0
            goto L_0x0063
        L_0x006a:
            X.0eS.A00(r0)
            r7 = 0
            r4 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "media/%s/comment/bulk_delete/"
            r2.A0K(r0, r1)
            java.lang.Class<X.GyY> r1 = X.C54049GyY.class
            java.lang.Class<X.Hub> r0 = X.C56208Hub.class
            r2.A0O(r4, r1, r0, r7)
            java.lang.String r0 = ","
            java.lang.String r1 = X.DbT.A0z(r0, r11, r4)
            java.lang.String r0 = "comment_ids_to_delete"
            X.C51968G9o.A1L(r2, r0, r1, r10)
            X.1OC r0 = X.DbT.A0U(r2, r6)
            r5.A00 = r6
            java.lang.Object r0 = r0.A01(r5)
            if (r0 != r3) goto L_0x0023
        L_0x009a:
            return r3
        L_0x009b:
            X.Il6 r5 = new X.Il6
            r5.<init>(r3, r12)
            goto L_0x0015
        L_0x00a2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaCommentDeletionNetworkRequestsKt.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.Collection, X.4D7):java.lang.Object");
    }
}
