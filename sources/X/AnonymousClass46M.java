package X;

/* renamed from: X.46M  reason: invalid class name */
public final class AnonymousClass46M implements C233992wo {
    public final /* synthetic */ C228572lt A00;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323045229603610L) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List CsY(java.util.List r11) {
        /*
            r10 = this;
            r6 = 0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r5 = r11.iterator()
        L_0x000a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r4 = r5.next()
            X.1Xg r4 = (X.1Xg) r4
            X.1Xn r0 = r4.A05
            X.1Xj r3 = X.1Xi.A02(r0)
            if (r3 == 0) goto L_0x000a
            X.1UQ r1 = r4.A06
            X.1UQ r0 = X.1UQ.A0Y
            if (r1 == r0) goto L_0x0028
            X.1UQ r0 = X.1UQ.A0H
            if (r1 != r0) goto L_0x000a
        L_0x0028:
            boolean r0 = r3.CcK()
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = r3.getId()
            if (r0 == 0) goto L_0x0038
            r2.put(r0, r4)
            goto L_0x000a
        L_0x0038:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0040:
            long r0 = X.AnonymousClass1B0.A02
            X.2lt r5 = r10.A00
            com.instagram.common.session.UserSession r4 = r5.A00
            X.1B0 r1 = X.AnonymousClass1B1.A00(r4)
            X.1B2 r0 = X.1B2.A0F
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0060
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323045229603610(0x810b9e00122b1a, double:3.034178292140169E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00f8
            X.2lu r0 = r5.A01
            X.5jR r4 = new X.5jR
            r4.<init>(r5, r2)
            com.instagram.common.session.UserSession r1 = r0.A00
            r5 = 0
            r0 = -2
            X.1NY r3 = new X.1NY
            r3.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A08(r0)
            java.lang.String r0 = "feed/invalidate_privacy_violating_media_v2/"
            r3.A0A(r0)
            java.io.StringWriter r9 = new java.io.StringWriter     // Catch:{ IOException -> 0x00d5 }
            r9.<init>()     // Catch:{ IOException -> 0x00d5 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00d5 }
            X.17W r8 = r0.A0A(r9)     // Catch:{ IOException -> 0x00d5 }
            r8.A0b()     // Catch:{ IOException -> 0x00d5 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ IOException -> 0x00d5 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x00d5 }
        L_0x009b:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x00d5 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r7.next()     // Catch:{ IOException -> 0x00d5 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x00d5 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x00d5 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ IOException -> 0x00d5 }
            X.1Xg r2 = (X.1Xg) r2     // Catch:{ IOException -> 0x00d5 }
            r8.A0c()     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r0 = "media_id"
            r8.A0R(r0, r1)     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r1 = "item_type"
            X.1UQ r0 = r2.A06     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00d5 }
            r8.A0R(r1, r0)     // Catch:{ IOException -> 0x00d5 }
            r8.A0Z()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x009b
        L_0x00ca:
            r8.A0Y()     // Catch:{ IOException -> 0x00d5 }
            r8.close()     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r1 = r9.toString()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00de
        L_0x00d5:
            r2 = move-exception
            java.lang.String r1 = "MainFeedInvalidateMediaNetworkSourceV2"
            java.lang.String r0 = "Failed to convert a map to json array"
            X.0KC.A0G(r1, r0, r2)
            r1 = 0
        L_0x00de:
            java.lang.String r0 = "media_ids_item_types"
            r3.A0G(r0, r1)
            java.lang.Class<X.5jS> r1 = X.C292745jS.class
            java.lang.Class<X.5jT> r0 = X.C292755jT.class
            r3.A0O(r5, r1, r0, r6)
            X.1OC r1 = r3.A0M()
            X.5jU r0 = new X.5jU
            r0.<init>(r4)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x00f8:
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46M.CsY(java.util.List):java.util.List");
    }

    public final void DFr(boolean z) {
    }

    public AnonymousClass46M(C228572lt r1) {
        this.A00 = r1;
    }
}
