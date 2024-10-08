package X;

public abstract class RR1 {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.google.android.gms.location.LocationResult r18) {
        /*
            r17 = this;
            r2 = r17
            X.Qxe r2 = (X.C8598Qxe) r2
            r0 = r18
            if (r18 == 0) goto L_0x00a2
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r0 == 0) goto L_0x00a2
            int r0 = r0 + -1
            java.lang.Object r3 = r1.get(r0)
            android.location.Location r3 = (android.location.Location) r3
            if (r3 == 0) goto L_0x00a2
            java.util.HashSet r8 = X.AnonymousClass7TE.A1F()
            r13 = -1
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = -1
            double r9 = r3.getLatitude()
            double r11 = r3.getLongitude()
            long r6 = r3.getTime()
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            long r0 = r3.getTime()
            int r4 = (int) r0
            long r15 = (long) r4
        L_0x003b:
            boolean r0 = r3.hasAccuracy()
            if (r0 == 0) goto L_0x0046
            float r0 = r3.getAccuracy()
            int r13 = (int) r0
        L_0x0046:
            boolean r0 = r3.hasAltitude()
            if (r0 == 0) goto L_0x0051
            double r0 = r3.getAltitude()
            int r14 = (int) r0
        L_0x0051:
            com.facebook.locationsharing.core.models.Location r7 = new com.facebook.locationsharing.core.models.Location
            r7.<init>(r8, r9, r11, r13, r14, r15)
            com.instagram.direct.locationsharing.service.DirectLiveLocationService r0 = r2.A00
            X.S2X r6 = r0.A02
            if (r6 != 0) goto L_0x0067
            java.lang.String r0 = "repositoriesManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0067:
            java.util.Map r0 = r6.A01
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)
        L_0x006d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.7Ag r2 = (X.C327307Ag) r2
            java.util.Map r0 = r6.A03
            java.lang.Object r1 = r0.get(r1)
            X.7Ae r1 = (X.C327287Ae) r1
            if (r1 == 0) goto L_0x006d
            X.Ru1 r4 = new X.Ru1
            r4.<init>(r1, r7, r2)
            r0 = 1
            X.Sl0 r3 = new X.Sl0
            r3.<init>(r0, r1, r2, r6)
            X.7Ae r2 = r4.A00
            r1 = 2
            X.Sl1 r0 = new X.Sl1
            r0.<init>(r1, r3, r4)
            r2.AYj(r0)
            goto L_0x006d
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RR1.A00(com.google.android.gms.location.LocationResult):void");
    }
}
