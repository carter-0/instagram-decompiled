package com.instagram.user.userlist.data;

import X.MXY;

public final class LikesListRemoteDataSource implements MXY {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[LOOP:0: B:13:0x0038->B:15:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C74528PwN r12, com.instagram.common.session.UserSession r13, com.instagram.user.userlist.data.LikesListRemoteDataSource r14, X.AnonymousClass4D7 r15, long r16) {
        /*
            r3 = 11
            boolean r0 = X.C66139MDr.A01(r3, r15)
            if (r0 == 0) goto L_0x0077
            r5 = r15
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r3) goto L_0x009a
            java.lang.Object r12 = r5.A01
            X.PwN r12 = (X.C74528PwN) r12
            X.0eS.A00(r1)
        L_0x0028:
            X.N5F r12 = (X.N5F) r12
            java.util.List r0 = r12.A07
            if (r0 != 0) goto L_0x0030
            X.0sn r0 = X.0sn.A00
        L_0x0030:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.user.model.FollowStatus r0 = r1.B6o()
            X.AnonymousClass7TF.A1I(r1, r0, r7)
            goto L_0x0038
        L_0x004a:
            X.0eS.A00(r1)
            r0 = r12
            X.N5F r0 = (X.N5F) r0
            java.util.List r7 = r0.A07
            if (r7 != 0) goto L_0x0056
            X.0sn r7 = X.0sn.A00
        L_0x0056:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328632980880881(0x8110b300003df1, double:3.037712008547984E-306)
            r6 = r13
            boolean r11 = X.182.A06(r2, r13, r0)
            r10 = 0
            r8 = r16
            X.1OC r1 = X.C320126ro.A04(r6, r7, r8, r10, r11)
            r5.A01 = r12
            r5.A00 = r3
            r0 = 354231632(0x151d2550, float:3.1735332E-26)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x0077:
            X.MDr r5 = new X.MDr
            r5.<init>(r14, r15, r3)
            goto L_0x0016
        L_0x007d:
            java.lang.Integer r0 = r12.A05
            int r8 = X.DbX.A01(r0)
            X.1Xj r2 = r12.A01
            java.lang.Integer r3 = r12.A02
            java.lang.String r6 = r12.A06
            java.lang.Integer r4 = r12.A03
            com.instagram.api.schemas.GraphGuardianContentImpl r1 = r12.A00
            java.lang.Integer r5 = r12.A04
            X.Jvm r0 = new X.Jvm
            r0.<init>((com.instagram.api.schemas.GraphGuardianContent) r1, (X.1Xj) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.String) r6, (java.util.List) r7, (int) r8)
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
            return r4
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRemoteDataSource.A00(X.PwN, com.instagram.common.session.UserSession, com.instagram.user.userlist.data.LikesListRemoteDataSource, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.Peq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AXI(X.C72764PJa r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r7 = r18
            r5 = 1
            r3 = r19
            boolean r0 = r3 instanceof X.C73552Peq
            r8 = r17
            if (r0 == 0) goto L_0x0151
            r6 = r3
            X.Peq r6 = (X.C73552Peq) r6
            int r0 = r6.A06
            if (r0 != r5) goto L_0x0151
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0151
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001d:
            java.lang.Object r10 = r6.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 2
            r2 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r5) goto L_0x002f
            if (r0 != r3) goto L_0x0158
            X.0eS.A00(r10)
        L_0x002e:
            return r10
        L_0x002f:
            long r0 = r6.A01
            java.lang.Object r9 = r6.A04
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.A03
            X.PJa r7 = (X.C72764PJa) r7
            java.lang.Object r12 = r6.A02
            com.instagram.user.userlist.data.LikesListRemoteDataSource r12 = (com.instagram.user.userlist.data.LikesListRemoteDataSource) r12
            X.0eS.A00(r10)
            goto L_0x00d6
        L_0x0042:
            X.0eS.A00(r10)
            r9 = r7
            boolean r10 = r7 instanceof X.C69214NhU
            r1 = 0
            if (r10 == 0) goto L_0x00f6
            X.NhU r9 = (X.C69214NhU) r9
            java.lang.String r0 = r9.A00
            java.lang.Object[] r9 = X.C66581MXm.A1b(r0, r5)
            java.lang.String r0 = "media/%s/likers/"
        L_0x0055:
            java.lang.String r9 = java.lang.String.format(r0, r9)
            X.0qQ.A07(r9)
            boolean r0 = r7 instanceof X.C69215NhV
            if (r0 == 0) goto L_0x00f3
            r0 = r7
            X.NhV r0 = (X.C69215NhV) r0
            java.lang.String r13 = r0.A01
        L_0x0065:
            com.instagram.common.session.UserSession r14 = r7.A00
            X.1NY r12 = X.DbU.A0M(r14)
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            r12.A08(r11)
            r12.A0E = r9
            java.lang.String r15 = r7.A01
            java.lang.String r0 = "selected_filters"
            r12.A0G(r0, r15)
            r0 = 1666(0x682, float:2.335E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.A0G(r0, r13)
            java.lang.Class<X.CEg> r13 = X.C43814CEg.class
            java.lang.Class<X.Cyy> r0 = X.C45586Cyy.class
            r12.A0O(r2, r13, r0, r1)
            r15 = 0
            if (r10 == 0) goto L_0x00f0
            X.1E8 r1 = X.1E7.A00(r14)
            r0 = r7
            X.NhU r0 = (X.C69214NhU) r0
            java.lang.String r0 = r0.A00
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r0.Bi3()
        L_0x00a0:
            java.lang.String r13 = r14.A06
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 != 0) goto L_0x00f0
            X.0Tu r10 = X.0Tu.A05
            r0 = 36609626922882945(0x82104300191781, double:3.215413708941875E-306)
            long r0 = X.JTS.A05(r10, r14, r0)
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f0
            r12.A0A = r13
            r12.A07(r11)
            r12.A01 = r0
        L_0x00be:
            X.1OC r11 = r12.A0M()
            r6.A02 = r8
            r6.A03 = r7
            r6.A04 = r9
            r6.A01 = r0
            r6.A00 = r5
            r10 = 354231632(0x151d2550, float:3.1735332E-26)
            java.lang.Object r10 = r11.A00(r10, r6)
            if (r10 == r4) goto L_0x017a
            r12 = r8
        L_0x00d6:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r8 = r10 instanceof X.C239793Ih
            if (r8 == 0) goto L_0x0126
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r8 = r10.A00
            X.CEg r8 = (X.C43814CEg) r8
            X.N5F r8 = r8.A01
            if (r8 != 0) goto L_0x012f
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ee:
            r0 = r2
            goto L_0x00a0
        L_0x00f0:
            r0 = 0
            goto L_0x00be
        L_0x00f3:
            r13 = r2
            goto L_0x0065
        L_0x00f6:
            boolean r0 = r7 instanceof X.C69213NhT
            if (r0 == 0) goto L_0x0106
            X.NhT r9 = (X.C69213NhT) r9
            java.lang.String r0 = r9.A00
            java.lang.Object[] r9 = X.C66581MXm.A1b(r0, r5)
            java.lang.String r0 = "media/%s/likers_chrono/"
            goto L_0x0055
        L_0x0106:
            boolean r0 = r7 instanceof X.C69215NhV
            if (r0 == 0) goto L_0x0116
            X.NhV r9 = (X.C69215NhV) r9
            java.lang.String r0 = r9.A00
            java.lang.Object[] r9 = X.C66581MXm.A1b(r0, r5)
            java.lang.String r0 = "media/%s/likers_for_pac_ad/"
            goto L_0x0055
        L_0x0116:
            boolean r0 = r7 instanceof X.C69212NhS
            if (r0 == 0) goto L_0x017b
            X.NhS r9 = (X.C69212NhS) r9
            java.lang.String r0 = r9.A00
            java.lang.Object[] r9 = X.C66581MXm.A1b(r0, r5)
            java.lang.String r0 = "live/%s/likers/"
            goto L_0x0055
        L_0x0126:
            boolean r8 = r10 instanceof X.C297815sO
            if (r8 != 0) goto L_0x0134
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x012f:
            X.3Ih r10 = new X.3Ih
            r10.<init>(r8)
        L_0x0134:
            boolean r8 = r10 instanceof X.C239793Ih
            if (r8 == 0) goto L_0x015d
            com.instagram.common.session.UserSession r11 = r7.A00
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r10 = r10.A00
            X.PwN r10 = (X.C74528PwN) r10
            r6.A02 = r2
            r6.A03 = r2
            r6.A04 = r2
            r6.A00 = r3
            r13 = r6
            r14 = r0
            java.lang.Object r10 = A00(r10, r11, r12, r13, r14)
            if (r10 != r4) goto L_0x002e
            return r4
        L_0x0151:
            X.Peq r6 = new X.Peq
            r6.<init>(r8, r3, r5)
            goto L_0x001d
        L_0x0158:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015d:
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = "Error connecting to "
            java.lang.String r0 = X.002.A0R(r0, r9)
            X.0qQ.A0B(r0, r5)
            X.O1w r1 = new X.O1w
            r1.<init>()
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
            return r0
        L_0x0175:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x017a:
            return r4
        L_0x017b:
            boolean r0 = r7 instanceof X.C69211NhR
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "LikesListKey.AllModels is unsupported LikesListKey type"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0186:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRemoteDataSource.AXI(X.PJa, X.4D7):java.lang.Object");
    }
}
