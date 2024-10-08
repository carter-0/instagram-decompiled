package com.instagram.mainactivity.camerabutton;

public final class CameraButtonDestinationFetcher$Companion {
    /* JADX WARNING: type inference failed for: r7v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r3 = 24
            boolean r0 = X.AnonymousClass9JT.A00(r3, r14)
            if (r0 == 0) goto L_0x0084
            r7 = r14
            X.9JT r7 = (X.AnonymousClass9JT) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A01
            X.1Hj r9 = X.1Hj.A02
            int r1 = r7.A00
            r4 = 0
            r8 = 2
            r6 = 4
            r5 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r5) goto L_0x00e8
            X.0eS.A00(r0)
        L_0x0027:
            r9 = r0
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008c
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.3jW r0 = (X.C249323jW) r0
            X.4is r0 = r0.A00
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            X.0eS.A00(r0)
            r0 = -2
            X.1NY r11 = new X.1NY
            r11.<init>(r13, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r11.A08(r3)
            java.lang.String r2 = "creatives/nav_bar_camera_destination/"
            r11.A0A(r2)
            java.lang.Class<X.3jW> r1 = X.C249323jW.class
            java.lang.Class<X.3jY> r0 = X.C249343jY.class
            r10 = 0
            r11.A0O(r4, r1, r0, r10)
            r11.A07(r3)
            r11.A0A = r2
            X.0Tu r2 = X.0Tu.A06
            r0 = 37164214573400372(0x8408a800010134, double:3.5661371722743194E-306)
            double r2 = X.182.A00(r2, r13, r0)
            long r0 = (long) r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r11.A01 = r0
            X.1OC r2 = r11.A0M()
            r7.A00 = r5
            r1 = 854662762(0x32f11e6a, float:2.8069923E-8)
            r0 = 3
            java.lang.Object r0 = r2.A02(r7, r1, r0, r10)
            if (r0 != r9) goto L_0x0027
            return r9
        L_0x0084:
            r0 = 42
            X.9JT r7 = new X.9JT
            r7.<init>(r12, r14, r3, r0)
            goto L_0x0016
        L_0x008c:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ac
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0096:
            com.instagram.api.schemas.NavBarCameraDestination r0 = r0.A00
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x00df
            if (r1 == r6) goto L_0x00dc
            if (r1 == r5) goto L_0x00d9
            r0 = 3
            if (r1 != r0) goto L_0x00a7
            X.80L r4 = X.AnonymousClass80L.A00
        L_0x00a7:
            X.3Ih r9 = new X.3Ih
            r9.<init>(r4)
        L_0x00ac:
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00e2
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r4 = r9.A00
            X.0wj r3 = X.0wj.A01
            r2 = 817903358(0x30c036fe, float:1.3985468E-9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error fetching most recently used camera destination: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.AEf(r0, r2)
            X.0gF r0 = X.C60340gF.A00
            X.5sO r9 = new X.5sO
            r9.<init>(r0)
        L_0x00d8:
            return r9
        L_0x00d9:
            X.80N r4 = X.AnonymousClass80N.A00
            goto L_0x00a7
        L_0x00dc:
            X.9QA r4 = X.AnonymousClass9QA.A00
            goto L_0x00a7
        L_0x00df:
            X.8jC r4 = X.C363138jC.A00
            goto L_0x00a7
        L_0x00e2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainactivity.camerabutton.CameraButtonDestinationFetcher$Companion.A00(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }
}
