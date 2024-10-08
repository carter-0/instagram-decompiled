package com.instagram.security.attestation.keystore.worker;

public abstract class KeyAttestationUtils {
    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        r12.add(X.RHJ.A0B);
        r4 = new X.C53375Gn5("", "", (java.lang.String) null, "", (java.lang.String) null, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r2 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r2.A00.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        return new X.AnonymousClass9IP(9, (java.lang.Object) r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0134, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        X.0KC.A0F(r4, "Key attestation failure related to nonce", r8);
        X.AnonymousClass7TF.A19(X.0wj.A01.AEf(r4, 817903298), "error", "Key attestation failure related to nonce", r8);
        r3 = X.RHJ.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        if ((r8 instanceof X.RBI) != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0149, code lost:
        r3 = X.RHJ.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014d, code lost:
        r8.getMessage();
        r2.A00.A01 = new X.C53375Gn5("", "", (java.lang.String) null, "", (java.lang.String) null, X.AnonymousClass7TE.A1I(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017c, code lost:
        if ((r8 instanceof X.RBJ) != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        r3 = X.RHJ.A09;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0047, B:33:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3 A[Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ExcHandler: IllegalStateException (unused java.lang.IllegalStateException), PHI: r2 r12 
      PHI: (r2v6 X.RqI) = (r2v0 X.RqI), (r2v11 X.RqI), (r2v11 X.RqI) binds: [B:33:0x0091, B:10:0x0047, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v6 java.util.List) = (r12v0 java.util.List), (r12v8 java.util.List), (r12v8 java.util.List) binds: [B:33:0x0091, B:10:0x0047, B:11:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:10:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0134 A[ExcHandler: RJz (e X.RJz), PHI: r2 r4 r12 
      PHI: (r2v3 X.RqI) = (r2v0 X.RqI), (r2v11 X.RqI), (r2v11 X.RqI) binds: [B:33:0x0091, B:10:0x0047, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v13 java.lang.String), (r4v13 java.lang.String) binds: [B:33:0x0091, B:10:0x0047, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v3 java.util.List) = (r12v0 java.util.List), (r12v8 java.util.List), (r12v8 java.util.List) binds: [B:33:0x0091, B:10:0x0047, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r13, X.1Ln r14, X.0lg r15, X.C10320RqI r16, java.lang.String r17, java.util.List r18, X.AnonymousClass4D7 r19, X.C262094Cc r20, boolean r21) {
        /*
            r4 = r17
            r7 = r14
            r2 = r16
            r12 = r18
            r5 = 14
            r6 = r19
            boolean r0 = X.C66147MDz.A02(r5, r6)
            if (r0 == 0) goto L_0x0041
            r8 = r6
            X.MDz r8 = (X.C66147MDz) r8
            int r3 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0041
            int r3 = r3 - r1
            r8.A00 = r3
        L_0x001f:
            java.lang.Object r9 = r8.A05
            X.1Hj r3 = X.1Hj.A02
            int r10 = r8.A00
            java.lang.String r5 = "error"
            r6 = 817903298(0x30c036c2, float:1.3985402E-9)
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0056
            if (r10 != r1) goto L_0x0051
            java.lang.Object r12 = r8.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r2 = r8.A03
            X.RqI r2 = (X.C10320RqI) r2
            java.lang.Object r7 = r8.A02
            X.0Ak r7 = (X.0Ak) r7
            java.lang.Object r4 = r8.A01
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0047
        L_0x0041:
            X.MDz r8 = new X.MDz
            r8.<init>(r5, r6)
            goto L_0x001f
        L_0x0047:
            X.0eS.A00(r9)     // Catch:{ RJV -> 0x004e, RCI -> 0x004b, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            goto L_0x00af
        L_0x004b:
            r8 = move-exception
            goto L_0x00df
        L_0x004e:
            r8 = move-exception
            goto L_0x0103
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0056:
            X.0eS.A00(r9)
            X.0qv r9 = X.0qv.A02
            java.lang.String r11 = r9.A04(r13)
            if (r11 == 0) goto L_0x0184
            int r9 = r11.length()
            if (r9 == 0) goto L_0x0184
            if (r14 == 0) goto L_0x006e
            java.lang.String r9 = "app_scoped_device_id"
            r14.A0R(r9, r11)
        L_0x006e:
            java.lang.Class<X.S4R> r9 = X.S4R.class
            monitor-enter(r9)
            X.S4R r10 = X.S4R.A02     // Catch:{ all -> 0x0181 }
            if (r10 != 0) goto L_0x007c
            X.S4R r10 = new X.S4R     // Catch:{ all -> 0x0181 }
            r10.<init>(r1)     // Catch:{ all -> 0x0181 }
            X.S4R.A02 = r10     // Catch:{ all -> 0x0181 }
        L_0x007c:
            monitor-exit(r9)
            X.02m r9 = X.C51965G9l.A0l()
            X.0qQ.A0A(r10)
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r14 = new com.instagram.security.attestation.keystore.client.KeyAttestationClient
            r14.<init>(r10, r9, r11)
            if (r7 == 0) goto L_0x008d
            r14.A00 = r7
        L_0x008d:
            boolean r19 = X.AnonymousClass7TF.A1P(r21)
            r8.A01 = r4     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r8.A02 = r7     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r8.A03 = r2     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r8.A04 = r12     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r8.A00 = r1     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r17 = 0
            X.TTA r13 = new X.TTA     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r16 = r12
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r9 = r20
            java.lang.Object r9 = X.1Eo.A00(r8, r9, r13)     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            if (r9 != r3) goto L_0x00af
            return r3
        L_0x00af:
            X.Gn5 r9 = (X.C53375Gn5) r9     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            if (r2 == 0) goto L_0x00b7
            X.1pf r3 = r2.A00     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r3.A01 = r9     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
        L_0x00b7:
            r8 = 9
            X.9IP r3 = new X.9IP     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            r3.<init>((int) r8, (java.lang.Object) r9, (boolean) r1)     // Catch:{ RJV -> 0x0102, RCI -> 0x00de, RJz -> 0x0134, IllegalStateException -> 0x00bf }
            return r3
        L_0x00bf:
            X.RHJ r0 = X.RHJ.A0B
            r12.add(r0)
            r7 = 0
            java.lang.String r5 = ""
            X.Gn5 r4 = new X.Gn5
            r6 = r5
            r8 = r5
            r9 = r7
            r10 = r12
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10)
            if (r2 == 0) goto L_0x00d6
            X.1pf r0 = r2.A00
            r0.A01 = r4
        L_0x00d6:
            r0 = 9
            X.9IP r3 = new X.9IP
            r3.<init>((int) r0, (java.lang.Object) r4, (boolean) r1)
            return r3
        L_0x00de:
            r8 = move-exception
        L_0x00df:
            java.lang.String r3 = "Key attestation failed during GraphQL execution"
            X.0KC.A0F(r4, r3, r8)
            X.0wj r1 = X.0wj.A01
            X.0f9 r1 = r1.AEf(r4, r6)
            X.AnonymousClass7TF.A19(r1, r5, r3, r8)
            if (r7 == 0) goto L_0x00f6
            java.lang.String r3 = "api_network_or_graphql"
            java.lang.String r1 = "error_type"
            r7.A0R(r1, r3)
        L_0x00f6:
            if (r2 == 0) goto L_0x00ff
            java.lang.String r0 = "getMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00ff:
            X.RHJ r3 = X.RHJ.A02
            goto L_0x0163
        L_0x0102:
            r8 = move-exception
        L_0x0103:
            java.lang.String r9 = "Key attestation failed during AttestationKeystore operation"
            X.0KC.A0F(r4, r9, r8)
            X.RHJ r3 = X.RHJ.A0G
            boolean r1 = r8 instanceof X.C7887QcC
            if (r1 == 0) goto L_0x0125
            X.RHJ r3 = X.RHJ.A0F
            X.0wj r1 = X.0wj.A01
            X.0f9 r4 = r1.AEf(r4, r6)
            java.lang.String r1 = "Key attestation failed due to insecure key generation"
            X.AnonymousClass7TF.A19(r4, r5, r1, r8)
            if (r7 == 0) goto L_0x014b
            java.lang.String r4 = "insecure_key_attestation"
        L_0x011f:
            java.lang.String r1 = "error_type"
            r7.A0R(r1, r4)
            goto L_0x014b
        L_0x0125:
            X.0wj r1 = X.0wj.A01
            X.0f9 r1 = r1.AEf(r4, r6)
            X.AnonymousClass7TF.A19(r1, r5, r9, r8)
            if (r7 == 0) goto L_0x014b
            java.lang.String r4 = "other_key_attestation"
            goto L_0x011f
        L_0x0134:
            r8 = move-exception
            java.lang.String r3 = "Key attestation failure related to nonce"
            X.0KC.A0F(r4, r3, r8)
            X.0wj r1 = X.0wj.A01
            X.0f9 r1 = r1.AEf(r4, r6)
            X.AnonymousClass7TF.A19(r1, r5, r3, r8)
            X.RHJ r3 = X.RHJ.A0Z
            boolean r1 = r8 instanceof X.RBI
            if (r1 == 0) goto L_0x017a
            X.RHJ r3 = X.RHJ.A07
        L_0x014b:
            if (r2 == 0) goto L_0x0163
            r8.getMessage()
            X.1pf r1 = r2.A00
            r7 = 0
            java.util.List r10 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r5 = ""
            X.Gn5 r4 = new X.Gn5
            r6 = r5
            r8 = r5
            r9 = r7
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10)
            r1.A01 = r4
        L_0x0163:
            r12.add(r3)
            r5 = 0
            java.lang.String r3 = ""
            X.Gn5 r2 = new X.Gn5
            r4 = r3
            r6 = r3
            r7 = r5
            r8 = r12
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8)
            r1 = 9
            X.9IP r3 = new X.9IP
            r3.<init>((int) r1, (java.lang.Object) r2, (boolean) r0)
            return r3
        L_0x017a:
            boolean r1 = r8 instanceof X.RBJ
            if (r1 == 0) goto L_0x014b
            X.RHJ r3 = X.RHJ.A09
            goto L_0x014b
        L_0x0181:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0184:
            if (r14 == 0) goto L_0x018d
            java.lang.String r3 = "empty_app_scoped_device_id"
            java.lang.String r1 = "error_type"
            r14.A0R(r1, r3)
        L_0x018d:
            if (r16 == 0) goto L_0x01a4
            X.RHJ r3 = X.RHJ.A0N
            X.1pf r1 = r2.A00
            r5 = 0
            java.util.List r8 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r3 = ""
            X.Gn5 r2 = new X.Gn5
            r4 = r3
            r6 = r3
            r7 = r5
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.List) r8)
            r1.A01 = r2
        L_0x01a4:
            X.RHJ r1 = X.RHJ.A0N
            r12.add(r1)
            r9 = 0
            java.lang.String r7 = ""
            X.Gn5 r6 = new X.Gn5
            r8 = r7
            r10 = r7
            r11 = r9
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.util.List) r12)
            r2 = 9
            X.9IP r1 = new X.9IP
            r1.<init>((int) r2, (java.lang.Object) r6, (boolean) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(android.content.Context, X.1Ln, X.0lg, X.RqI, java.lang.String, java.util.List, X.4D7, X.4Cc, boolean):java.lang.Object");
    }
}
