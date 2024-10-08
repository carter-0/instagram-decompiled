package X;

import com.instagram.common.session.UserSession;

public final class P2G implements C74392Pu8 {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r1v12, types: [X.1Xy, X.1Xx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011c, code lost:
        if (r5 > 0) goto L_0x011e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AWj(X.OU2 r20) {
        /*
            r19 = this;
            r0 = 0
            r1 = r20
            X.0qQ.A0B(r1, r0)
            X.0eM r4 = r1.A04
            java.lang.Object r0 = r4.getValue()
            if (r0 == 0) goto L_0x0016
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x00ba
        L_0x0016:
            X.0eM r2 = r1.A03
            java.lang.Object r0 = r2.getValue()
            if (r0 != 0) goto L_0x00ba
            java.lang.Object r3 = r2.getValue()
            X.OG9 r3 = (X.OG9) r3
            java.lang.Object r2 = r4.getValue()
            X.0eM r0 = r1.A08
            java.lang.String r0 = X.DbS.A0t(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r0)
            r0 = 45
            r1.append(r0)
            java.lang.String r7 = X.AnonymousClass7TF.A0i(r2, r1)
            r12 = 0
            if (r3 == 0) goto L_0x00b6
            java.lang.String r6 = r3.A04
            java.lang.String r18 = ""
            if (r6 != 0) goto L_0x0046
            r6 = r18
        L_0x0046:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x004c
            r18 = r0
        L_0x004c:
            r2 = 4
            int r0 = r3.A00
            r1 = 1
            boolean r5 = X.AnonymousClass7TF.A1S(r2, r0)
            java.lang.Integer r0 = r3.A02
            int r4 = X.C66582MXn.A06(r0)
            java.lang.Integer r0 = r3.A01
            int r3 = X.C51967G9n.A04(r0, r1)
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r6)
            X.1Xx r1 = new X.1Xx
            r1.<init>()
            r1.A5j = r7
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r2)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.model.mediasize.ImageInfoImpl r0 = new com.instagram.model.mediasize.ImageInfoImpl
            r6 = r0
            r7 = r12
            r8 = r12
            r9 = r12
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r1.EZf(r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            com.instagram.model.mediasize.VideoVersion r11 = new com.instagram.model.mediasize.VideoVersion
            r14 = r12
            r16 = r12
            r17 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r11)
            r1.EqT(r0)
            r1.A4n = r13
            r1.A4o = r15
            if (r5 == 0) goto L_0x00b7
            X.1iA r0 = X.1iA.A0a
        L_0x00a2:
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A4m = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            X.1hu r0 = new X.1hu
            r0.<init>(r12)
            X.1Xj r12 = new X.1Xj
            r12.<init>(r0, r1)
        L_0x00b6:
            return r12
        L_0x00b7:
            X.1iA r0 = X.1iA.A0Q
            goto L_0x00a2
        L_0x00ba:
            X.0eM r0 = r1.A03
            java.lang.Object r7 = r0.getValue()
            X.OG9 r7 = (X.OG9) r7
            X.0eM r0 = r1.A0C
            java.lang.Number r11 = X.C66580MXl.A0r(r0)
            X.0eM r0 = r1.A0B
            java.lang.Number r10 = X.C66580MXl.A0r(r0)
            java.lang.Number r9 = X.C66580MXl.A0r(r4)
            X.0eM r0 = r1.A05
            java.lang.Number r8 = X.C66580MXl.A0r(r0)
            X.0eM r0 = r1.A0A
            java.lang.String r3 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A02
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r1.A08
            java.lang.String r0 = X.DbS.A0t(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r0)
            r0 = 45
            r1.append(r0)
            java.lang.String r6 = X.AnonymousClass7TF.A0i(r9, r1)
            r4 = 4
            r12 = 0
            r5 = 1
            if (r9 == 0) goto L_0x013f
            if (r8 == 0) goto L_0x013f
            long r0 = r9.longValue()
            java.lang.String r3 = X.OXF.A02(r3, r12, r0)
            java.lang.String r2 = X.OXF.A02(r2, r12, r0)
            int r0 = r8.intValue()
            boolean r4 = X.AnonymousClass7TF.A1S(r4, r0)
            int r1 = X.C66582MXn.A06(r11)
            if (r10 == 0) goto L_0x011e
            int r5 = r10.intValue()
        L_0x011c:
            if (r5 <= 0) goto L_0x013c
        L_0x011e:
            if (r1 <= 0) goto L_0x013c
            float r1 = (float) r1
            float r0 = (float) r5
            float r1 = r1 / r0
        L_0x0123:
            if (r4 == 0) goto L_0x0135
            X.3Q2 r0 = X.AnonymousClass9T3.A02(r6)
            r0.A0i(r2)
            r0.A33 = r3
        L_0x012e:
            r0.A02 = r1
            X.5yB r12 = X.C63326Kv9.A00(r0)
            return r12
        L_0x0135:
            X.3Q2 r0 = X.AnonymousClass9T3.A01(r6)
            r0.A33 = r2
            goto L_0x012e
        L_0x013c:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0123
        L_0x013f:
            if (r7 == 0) goto L_0x00b6
            java.lang.String r3 = r7.A04
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x0148
            r3 = r0
        L_0x0148:
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L_0x014d
            r2 = r0
        L_0x014d:
            int r0 = r7.A00
            boolean r4 = X.AnonymousClass7TF.A1S(r4, r0)
            java.lang.Integer r0 = r7.A02
            int r1 = X.C66582MXn.A06(r0)
            java.lang.Integer r0 = r7.A01
            int r5 = X.C51967G9n.A04(r0, r5)
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2G.AWj(X.OU2):java.lang.Object");
    }

    public P2G(UserSession userSession) {
        this.A00 = userSession;
    }

    public final 2FW BZu(OU2 ou2) {
        return 2FW.A1A;
    }
}
