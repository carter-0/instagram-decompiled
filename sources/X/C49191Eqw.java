package X;

/* renamed from: X.Eqw  reason: case insensitive filesystem */
public abstract class C49191Eqw {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        if (r5 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r8 != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C61079JwH A00(android.os.Bundle r14, com.instagram.common.session.UserSession r15) {
        /*
            r2 = 0
            r3 = 1
            X.0qQ.A0B(r15, r3)
            java.lang.String r0 = "LikesListFragment.MEDIA_ID"
            java.lang.String r8 = r14.getString(r0)
            java.lang.String r0 = "LikesListFragment.BROADCAST_ID"
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "FollowListFragment.RequestParametersSelectedFilters"
            r10 = 0
            java.lang.String r11 = r14.getString(r0, r10)
            if (r8 == 0) goto L_0x00bd
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "LikesListFragment.TIME_ORDERED"
            boolean r13 = r14.getBoolean(r0)
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r12 = r14.getInt(r0, r2)
            java.lang.String r0 = "fragment_argument_ad_retrieval_key"
            java.lang.String r0 = r14.getString(r0)
            X.1Xl r7 = X.C324666zh.A00(r15, r0, r8)
            if (r7 == 0) goto L_0x00bb
            X.1Xj r0 = r7.BPf()
            if (r0 == 0) goto L_0x00bb
            X.1Xy r0 = r0.A0C
            X.DSk r5 = r0.Ba6()
            if (r5 == 0) goto L_0x00b7
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321078133466178(0x8109d400012442, double:3.032934292621997E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r9 = r5.getMediaId()
        L_0x005b:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321078133466178(0x8109d400012442, double:3.032934292621997E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = ","
            java.util.List r0 = r5.Ba5()
            java.lang.String r10 = X.C2612548w.A00(r1, r0)
        L_0x0072:
            X.NhX r6 = new X.NhX
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L_0x0077:
            char[] r1 = new char[r3]
            r0 = 95
            r1[r2] = r0
            java.util.List r0 = X.00l.A0Q(r8, r1, r2)
            java.lang.Object r10 = X.00k.A0L(r0)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0087:
            java.lang.String r0 = r15.A06
            boolean r0 = X.2R8.A07(r0, r10)
            if (r0 == 0) goto L_0x00b4
            java.lang.String r5 = "self_likers"
        L_0x0091:
            r0 = 236(0xec, float:3.31E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r4 = r14.getBoolean(r0, r2)
            r0 = 976(0x3d0, float:1.368E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1
            int r0 = r14.getInt(r1, r0)
            long r0 = (long) r0
            X.QP4 r2 = new X.QP4
            r2.<init>(r0, r3, r4)
            r1 = 30
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r2, (java.lang.String) r5, (int) r1)
            return r0
        L_0x00b4:
            java.lang.String r5 = "likers"
            goto L_0x0091
        L_0x00b7:
            r9 = r10
            if (r5 == 0) goto L_0x0072
            goto L_0x005b
        L_0x00bb:
            r9 = r10
            goto L_0x0072
        L_0x00bd:
            if (r1 == 0) goto L_0x00cd
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00cd
            X.NhW r6 = new X.NhW
            r6.<init>(r1, r11)
            if (r8 == 0) goto L_0x0087
            goto L_0x0077
        L_0x00cd:
            java.lang.String r0 = "Either mediaId or broadcastId must be provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49191Eqw.A00(android.os.Bundle, com.instagram.common.session.UserSession):X.JwH");
    }
}
