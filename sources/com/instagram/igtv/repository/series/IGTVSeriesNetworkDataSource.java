package com.instagram.igtv.repository.series;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class IGTVSeriesNetworkDataSource {
    public final UserSession A00;

    public IGTVSeriesNetworkDataSource(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r9, java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r8 = this;
            r3 = 7
            boolean r0 = X.ME3.A03(r3, r12)
            if (r0 == 0) goto L_0x0067
            r4 = r12
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r6) goto L_0x0071
            X.0eS.A00(r0)
        L_0x0023:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006c
            X.5sO r5 = X.DbU.A0f()
        L_0x0030:
            return r5
        L_0x0031:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r8.A00
            r3 = 0
            java.lang.String r1 = "title"
            int r2 = X.DbW.A03(r6, r9, r11)
            X.1NY r7 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "igtv/series/create/"
            r7.A0A(r0)
            r7.A9m(r1, r9)
            java.lang.String r0 = "description"
            r7.A9m(r0, r10)
            java.lang.String r0 = "igtv_composer_session_id"
            r7.A9m(r0, r11)
            java.lang.Class<X.K1O> r1 = X.K1O.class
            java.lang.Class<X.LJ3> r0 = X.LJ3.class
            X.1OC r1 = X.DbW.A0L(r7, r1, r0, r6)
            r4.A00 = r6
            r0 = 426341436(0x1969743c, float:1.2069291E-23)
            java.lang.Object r0 = r1.A02(r4, r0, r2, r3)
            if (r0 != r5) goto L_0x0023
            return r5
        L_0x0067:
            X.ME3 r4 = X.ME3.A01(r8, r12, r3)
            goto L_0x0015
        L_0x006c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A02(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C63640L1c r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r11 = this;
            r3 = 10
            r5 = r17
            boolean r0 = X.ME3.A03(r3, r5)
            if (r0 == 0) goto L_0x004e
            r4 = r5
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x0058
            X.0eS.A00(r0)
        L_0x0026:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0033
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0053
            X.5sO r3 = X.DbU.A0f()
        L_0x0033:
            return r3
        L_0x0034:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r5 = r11.A00
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            X.1OC r1 = X.C63293Kuc.A00(r5, r6, r7, r8, r9, r10)
            r4.A00 = r2
            r0 = 695(0x2b7, float:9.74E-43)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x004e:
            X.ME3 r4 = X.ME3.A01(r11, r5, r3)
            goto L_0x0018
        L_0x0053:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A00(X.L1c, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C63640L1c r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r11 = this;
            r3 = 11
            boolean r0 = X.ME3.A03(r3, r15)
            if (r0 == 0) goto L_0x004b
            r4 = r15
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x0055
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0050
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r5 = r11.A00
            r8 = 0
            r6 = r12
            r7 = r13
            r10 = r14
            r9 = r8
            X.1OC r1 = X.C63293Kuc.A00(r5, r6, r7, r8, r9, r10)
            r4.A00 = r2
            r0 = 694(0x2b6, float:9.73E-43)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x004b:
            X.ME3 r4 = X.ME3.A01(r11, r15, r3)
            goto L_0x0016
        L_0x0050:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A01(X.L1c, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r7 = this;
            r4 = 12
            boolean r0 = X.ME3.A03(r4, r11)
            if (r0 == 0) goto L_0x0069
            r3 = r11
            X.ME3 r3 = (X.ME3) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r5) goto L_0x0073
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006e
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A0B(r8, r5)
            java.lang.String r6 = "title"
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "igtv/series/%s/update/"
            r2.A0K(r0, r1)
            r2.A9m(r6, r9)
            java.lang.String r0 = "description"
            r2.A9m(r0, r10)
            java.lang.Class<X.K1O> r1 = X.K1O.class
            java.lang.Class<X.LJ3> r0 = X.LJ3.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r5)
            r3.A00 = r5
            r0 = 554276501(0x21099695, float:4.66167E-19)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0069:
            X.ME3 r3 = X.ME3.A01(r7, r11, r4)
            goto L_0x0016
        L_0x006e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A03(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 8
            boolean r0 = X.ME3.A03(r3, r8)
            if (r0 == 0) goto L_0x005b
            r5 = r8
            X.ME3 r5 = (X.ME3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0065
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0060
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.0qQ.A0B(r7, r3)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "igtv/series/%s/delete/"
            r2.A0K(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r3)
            r5.A00 = r3
            r0 = 130635817(0x7c95829, float:3.0294935E-34)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005b:
            X.ME3 r5 = X.ME3.A01(r6, r8, r3)
            goto L_0x0016
        L_0x0060:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A04(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.ME3.A03(r3, r8)
            if (r0 == 0) goto L_0x005a
            r5 = r8
            X.ME3 r5 = (X.ME3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0064
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005f
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.0qQ.A0B(r7, r3)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "igtv/series/all_user_series/%s/"
            r2.A0K(r0, r1)
            java.lang.Class<X.K1C> r1 = X.K1C.class
            java.lang.Class<X.LJ6> r0 = X.LJ6.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r3)
            r5.A00 = r3
            r0 = 794(0x31a, float:1.113E-42)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005a:
            X.ME3 r5 = X.ME3.A01(r6, r8, r3)
            goto L_0x0016
        L_0x005f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource.A05(java.lang.String, X.4D7):java.lang.Object");
    }
}
