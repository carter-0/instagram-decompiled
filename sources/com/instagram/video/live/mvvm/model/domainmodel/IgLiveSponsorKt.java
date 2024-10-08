package com.instagram.video.live.mvvm.model.domainmodel;

public abstract class IgLiveSponsorKt {
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r10, java.util.List r11, X.AnonymousClass4D7 r12) {
        /*
            r0 = 15
            boolean r0 = X.ME1.A02(r0, r12)
            if (r0 == 0) goto L_0x00a5
            r7 = r12
            X.ME1 r7 = (X.ME1) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A07
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L_0x009d
            if (r0 != r8) goto L_0x00ac
            java.lang.Object r6 = r7.A03
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r10 = r7.A02
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r11 = r7.A01
            java.util.List r11 = (java.util.List) r11
            X.0eS.A00(r1)
        L_0x0030:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004d
            com.instagram.pendingmedia.model.BrandedContentTag r9 = X.JTO.A0l(r6)
            com.instagram.user.model.User r0 = r9.A00
            if (r0 != 0) goto L_0x0030
            X.17i r1 = X.17h.A00(r10)
            java.lang.String r0 = r9.A01
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x007a
            r9.A00 = r0
            goto L_0x0030
        L_0x004d:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r4 = r11.iterator()
        L_0x0055:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009c
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.JTO.A0l(r4)
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
            com.instagram.user.model.User r1 = r0.A00
            if (r1 != 0) goto L_0x0071
            X.17i r1 = X.17h.A00(r10)
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r1 = r1.A02(r0)
        L_0x0071:
            X.L7H r0 = new X.L7H
            r0.<init>(r1, r3, r2)
            r5.add(r0)
            goto L_0x0055
        L_0x007a:
            java.lang.String r4 = r9.A01
            if (r4 == 0) goto L_0x0030
            X.ME1.A00(r11, r10, r6, r9, r7)
            r7.A05 = r4
            r7.A06 = r7
            r7.A00 = r8
            X.3Pl r3 = X.JTQ.A0m(r7)
            X.441 r2 = X.AnonymousClass441.A02
            r1 = 4
            X.FnE r0 = new X.FnE
            r0.<init>(r1, r9, r3)
            r2.A02(r10, r0, r4)
            java.lang.Object r0 = r3.A00()
            if (r0 != r5) goto L_0x0030
        L_0x009c:
            return r5
        L_0x009d:
            X.0eS.A00(r1)
            java.util.Iterator r6 = r11.iterator()
            goto L_0x0030
        L_0x00a5:
            X.ME1 r7 = new X.ME1
            r7.<init>(r12)
            goto L_0x0016
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt.A00(com.instagram.common.session.UserSession, java.util.List, X.4D7):java.lang.Object");
    }
}
