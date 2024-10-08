package com.instagram.comments.mvvm.data.network;

public abstract class MediaHiddenCommentNetworkFetcherKt {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C333847aF r14, com.instagram.common.session.UserSession r15, java.lang.String r16, X.AnonymousClass4D7 r17, boolean r18) {
        /*
            r6 = r15
            r8 = r16
            r11 = r18
            r0 = 4
            r4 = r17
            boolean r0 = X.C66140MDs.A01(r0, r4)
            if (r0 == 0) goto L_0x00af
            r2 = r4
            X.MDs r2 = (X.C66140MDs) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00af
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001c:
            java.lang.Object r1 = r2.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r12) goto L_0x00f4
            boolean r11 = r2.A05
            java.lang.Object r8 = r2.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r2.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r14 = r2.A01
            X.7aF r14 = (X.C333847aF) r14
            X.0eS.A00(r1)
        L_0x0038:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00eb
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r3 = r1.A00
            X.CG1 r3 = (X.CG1) r3
            java.util.List r0 = r3.A01
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x004e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.1bK r0 = (X.1bK) r0
            java.util.Set r1 = r14.A02
            java.lang.String r0 = r0.A0r
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = ""
        L_0x0063:
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x004e
            r5.add(r2)
            goto L_0x004e
        L_0x006d:
            X.0eS.A00(r1)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x00f9
            X.9In r0 = r14.A00
            X.1NY r4 = X.AnonymousClass7TG.A0b(r15)
            java.lang.String r0 = r0.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "hidden_comments/%s/hidden_comments/"
            r4.A0K(r0, r1)
            java.lang.Class<X.CG1> r1 = X.CG1.class
            java.lang.Class<X.D0l> r0 = X.C45661D0l.class
            r4.A0Q(r1, r0)
            java.lang.String r0 = "directly_hidden_only"
            r4.A0C(r0, r12)
            java.lang.String r1 = r14.A01
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "next_min_id"
            r4.A0G(r0, r1)
        L_0x009a:
            X.1OC r0 = r4.A0M()
            r2.A01 = r14
            r2.A02 = r15
            r2.A03 = r8
            r2.A05 = r11
            r2.A00 = r12
            java.lang.Object r1 = r0.A01(r2)
            if (r1 != r3) goto L_0x0038
            return r3
        L_0x00af:
            X.MDs r2 = new X.MDs
            r2.<init>(r4)
            goto L_0x001c
        L_0x00b6:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r5.iterator()
        L_0x00be:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r7 = r4.next()
            X.1bK r7 = (X.1bK) r7
            java.lang.String r1 = r7.A0r
            if (r1 == 0) goto L_0x00d3
            java.util.Set r0 = r14.A02
            r0.add(r1)
        L_0x00d3:
            java.util.Set r10 = r14.A02
            r9 = 0
            r13 = 0
            X.9IV r0 = X.C335837dc.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x00be
            r2.add(r0)
            goto L_0x00be
        L_0x00e1:
            java.lang.String r1 = r3.A00
            boolean r0 = r3.A02
            X.Gkv r3 = new X.Gkv
            r3.<init>(r1, r2, r0)
            return r3
        L_0x00eb:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f9:
            X.HyW r3 = X.C56438HyW.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaHiddenCommentNetworkFetcherKt.A00(X.7aF, com.instagram.common.session.UserSession, java.lang.String, X.4D7, boolean):java.lang.Object");
    }
}
