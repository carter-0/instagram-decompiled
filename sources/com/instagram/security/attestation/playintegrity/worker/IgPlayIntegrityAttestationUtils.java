package com.instagram.security.attestation.playintegrity.worker;

public abstract class IgPlayIntegrityAttestationUtils {
    /* JADX WARNING: type inference failed for: r14v2, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A[Catch:{ TQ5 -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r10, X.1Ln r11, X.0lg r12, java.lang.String r13, X.AnonymousClass4D7 r14, X.C262094Cc r15, int r16, boolean r17) {
        /*
            r2 = r13
            r6 = r11
            r7 = 0
            r4 = 25
            r5 = r14
            boolean r0 = X.ME9.A03(r4, r14)
            if (r0 == 0) goto L_0x0035
            r14 = r5
            X.ME9 r14 = (X.ME9) r14
            int r3 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0035
            int r3 = r3 - r1
            r14.A00 = r3
        L_0x001a:
            java.lang.Object r8 = r14.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r14.A00
            java.lang.String r5 = ""
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r1) goto L_0x003f
            java.lang.Object r7 = r14.A03
            X.S0q r7 = (X.C10915S0q) r7
            java.lang.Object r6 = r14.A02
            X.0Ak r6 = (X.0Ak) r6
            java.lang.Object r2 = r14.A01
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x003b
        L_0x0035:
            X.ME9 r14 = new X.ME9
            r14.<init>(r4, r5)
            goto L_0x001a
        L_0x003b:
            X.0eS.A00(r8)     // Catch:{ TQ5 -> 0x009a }
            goto L_0x0086
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0044:
            X.0eS.A00(r8)
            X.0qv r0 = X.0qv.A02
            java.lang.String r9 = r0.A04(r10)
            if (r9 == 0) goto L_0x00fd
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00fd
            if (r11 == 0) goto L_0x005c
            java.lang.String r0 = "app_scoped_device_id"
            r11.A0R(r0, r9)
        L_0x005c:
            X.02m r8 = X.C51965G9l.A0l()
            X.RoF r11 = new X.RoF
            r11.<init>(r10)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = X.Pxf.A0z()
            com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient r10 = new com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient
            r10.<init>(r9, r0)
            X.S7S r13 = new X.S7S     // Catch:{ TQ5 -> 0x0098 }
            r13.<init>(r6, r8)     // Catch:{ TQ5 -> 0x0098 }
            boolean r17 = X.AnonymousClass7TF.A1P(r17)
            r14.A01 = r2     // Catch:{ TQ5 -> 0x0096 }
            r14.A02 = r6     // Catch:{ TQ5 -> 0x0096 }
            r14.A03 = r7     // Catch:{ TQ5 -> 0x0096 }
            r14.A00 = r1     // Catch:{ TQ5 -> 0x0096 }
            java.lang.Object r8 = r10.A00(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ TQ5 -> 0x0096 }
            if (r8 != r3) goto L_0x0086
            return r3
        L_0x0086:
            X.JV7 r8 = (X.JV7) r8     // Catch:{ TQ5 -> 0x0096 }
            if (r7 == 0) goto L_0x008e
            X.1pf r0 = r7.A00     // Catch:{ TQ5 -> 0x0096 }
            r0.A00 = r8     // Catch:{ TQ5 -> 0x0096 }
        L_0x008e:
            r0 = 10
            X.9IP r3 = new X.9IP     // Catch:{ TQ5 -> 0x0096 }
            r3.<init>((int) r0, (java.lang.Object) r8, (boolean) r1)     // Catch:{ TQ5 -> 0x0096 }
            return r3
        L_0x0096:
            r8 = move-exception
            goto L_0x009b
        L_0x0098:
            r8 = move-exception
            goto L_0x009b
        L_0x009a:
            r8 = move-exception
        L_0x009b:
            java.lang.String r0 = "Play Integrity attestation failed during GraphQL execution"
            X.0KC.A0F(r2, r0, r8)
            X.0wj r1 = X.0wj.A01
            r0 = 817896512(0x30c01c40, float:1.3977868E-9)
            X.0f9 r2 = r1.AEf(r2, r0)
            java.lang.String r1 = r8.getMessage()
            java.lang.String r0 = "error"
            X.AnonymousClass7TF.A19(r2, r0, r1, r8)
            java.lang.Throwable r1 = r8.getCause()
            X.RHJ r9 = X.RHJ.A0b
            boolean r0 = r1 instanceof X.C8360QpI
            if (r0 == 0) goto L_0x00f3
            X.RKT r1 = (X.RKT) r1
            com.google.android.gms.common.api.Status r0 = r1.A00
            int r2 = r0.A00
            X.RHJ r9 = X.RHJ.A00(r2)
            if (r6 == 0) goto L_0x00da
            java.lang.String r1 = "integrity_service"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
            long r2 = (long) r2
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            java.lang.String r0 = "integrity_error_code"
            r6.A0Q(r0, r1)
        L_0x00da:
            if (r7 == 0) goto L_0x00e2
            r8.getMessage()
            r7.A00(r9)
        L_0x00e2:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r9)
            X.JV7 r1 = new X.JV7
            r1.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r5, (java.util.List) r0)
            r0 = 10
            X.9IP r3 = new X.9IP
            r3.<init>((int) r0, (java.lang.Object) r1, (boolean) r4)
            return r3
        L_0x00f3:
            if (r6 == 0) goto L_0x00da
            java.lang.String r1 = "api_network_or_graphql"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
            goto L_0x00da
        L_0x00fd:
            if (r11 == 0) goto L_0x0106
            java.lang.String r1 = "empty_app_scoped_device_id"
            java.lang.String r0 = "error_type"
            r11.A0R(r0, r1)
        L_0x0106:
            X.RHJ r0 = X.RHJ.A0N
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.JV7 r2 = new X.JV7
            r2.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r5, (java.util.List) r0)
            r1 = 10
            X.9IP r0 = new X.9IP
            r0.<init>((int) r1, (java.lang.Object) r2, (boolean) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.worker.IgPlayIntegrityAttestationUtils.A00(android.content.Context, X.1Ln, X.0lg, java.lang.String, X.4D7, X.4Cc, int, boolean):java.lang.Object");
    }
}
