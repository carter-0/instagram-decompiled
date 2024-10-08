package com.instagram.user.userlist.data;

import X.AnonymousClass0r6;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.IgBaseRepository;

public final class LikesListRepository extends IgBaseRepository {
    public final UserSession A00;
    public final AnonymousClass0r6 A01;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.MXY, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LikesListRepository(com.instagram.common.session.UserSession r8) {
        /*
            r7 = this;
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319351556676773(0x81084200021ca5, double:3.0318423985080105E-306)
            boolean r6 = X.182.A06(r3, r8, r0)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r2 = 1948631496(0x7425c1c8, float:5.2530477E31)
            r5 = 0
            X.1HY r1 = new X.1HY
            r1.<init>(r5)
            X.12T r0 = X.AnonymousClass12T.A00
            X.0nV r0 = X.JTP.A0U(r0, r2)
            X.4Cc r0 = r1.plus(r0)
            X.19S r4 = X.19E.A02(r0)
            r0 = 36319351556545700(0x81084200001ca4, double:3.0318423984251194E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x0091
            r0 = 20
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            X.3lq r1 = new X.3lq
            r1.<init>(r0, r2)
        L_0x003b:
            com.instagram.user.userlist.data.LikesListRemoteDataSource r0 = new com.instagram.user.userlist.data.LikesListRemoteDataSource
            r0.<init>()
            r7.<init>(r1, r0, r4)
            r7.A00 = r8
            X.NhR r4 = new X.NhR
            r4.<init>(r8, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.05G r1 = r7.A04
            r0 = 7
            X.MC8 r3 = new X.MC8
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1, (java.lang.Object) r4)
            if (r6 != 0) goto L_0x007b
            r0 = 54
            X.MC9 r0 = X.MC9.A00(r3, r0)
        L_0x005c:
            r7.A01 = r0
            if (r6 != 0) goto L_0x007a
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r8)
            X.64X r1 = new X.64X
            r1.<init>(r0)
            java.lang.Class<X.36g> r0 = X.C2370836g.class
            X.032 r1 = r1.A00(r0)
            r0 = 36
            X.0pz r1 = X.C66186MGx.A01(r7, r1, r0)
            X.4Cq r0 = r7.A03
            X.AnonymousClass11O.A03(r0, r1)
        L_0x007a:
            return
        L_0x007b:
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r8)
            r1 = 29
            X.JaL r0 = new X.JaL
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r2, (X.AnonymousClass4D7) r5, (int) r1)
            X.05S r1 = X.AnonymousClass0Zq.A01(r0)
            r0 = 54
            X.MC9 r0 = X.MC9.A00(r1, r0)
            goto L_0x005c
        L_0x0091:
            r1 = r5
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRepository.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C72764PJa r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 12
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x0057
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r1) goto L_0x002a
            if (r2 != r3) goto L_0x005d
            X.0eS.A00(r0)
        L_0x0027:
            X.0gF r4 = X.C60340gF.A00
        L_0x0029:
            return r4
        L_0x002a:
            java.lang.Object r2 = r5.A01
            com.instagram.repository.common.IgBaseRepository r2 = (com.instagram.repository.common.IgBaseRepository) r2
            X.0eS.A00(r0)
            goto L_0x0042
        L_0x0032:
            X.0eS.A00(r0)
            r5.A01 = r6
            r5.A00 = r1
            X.Lwf r0 = X.C65605Lwf.A00
            java.lang.Object r0 = r6.A03(r7, r0, r5)
            if (r0 == r4) goto L_0x0029
            r2 = r6
        L_0x0042:
            if (r0 == 0) goto L_0x0027
            X.KXC r1 = new X.KXC
            r1.<init>(r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            X.05G r0 = r2.A04
            java.lang.Object r0 = r0.emit(r1, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x0057:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRepository.A04(X.PJa, X.4D7):java.lang.Object");
    }
}
