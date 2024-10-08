package com.instagram.security.attestation.playintegrity.worker;

public abstract class PlayIntegrityAttestationUtils {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: X.QpI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: X.RK0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: X.RK0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: X.RK0} */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r0v38 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        r2.add(X.RHJ.A0B);
        r6 = new X.JV7(0, "", "", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (r5 != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r5.A00.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        return new X.AnonymousClass9IP(10, (java.lang.Object) r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ca, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        X.0KC.A0F(r8, "Play Integrity attestation failed due to IntegrityService issue (e.g. binder has died)", r6);
        X.AnonymousClass7TF.A19(X.0wj.A01.AEf(r8, 817896512), "error", "Play Integrity attestation failed due to IntegrityService issue (e.g. binder has died)", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r5 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        r0 = X.RHJ.A0D;
        r6.getMessage();
        r5.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r1 = X.RHJ.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        r10 = move-exception;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        X.0KC.A0F(r8, "Play Integrity attestation failure related to nonce", r10);
        X.AnonymousClass7TF.A19(X.0wj.A01.AEf(r8, 817896512), "error", "Play Integrity attestation failure related to nonce", r10);
        r1 = X.RHJ.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        if ((r10 instanceof X.RBK) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fd, code lost:
        r1 = X.RHJ.A07;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        r0 = r10 instanceof X.RBL;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (r0 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        r1 = X.RHJ.A09;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012d, code lost:
        r10 = move-exception;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013e, code lost:
        r6.A0R("error_type", "integrity_service");
        r6.A0Q("integrity_error_code", new java.lang.Long((long) r10.A00.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        r10.getMessage();
        r5.A00(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0049, B:24:0x0080] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[ExcHandler: IllegalStateException (unused java.lang.IllegalStateException), PHI: r2 r5 
      PHI: (r2v7 java.util.List) = (r2v8 java.util.List), (r2v0 java.util.List), (r2v10 java.util.List), (r2v10 java.util.List) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v6 X.S0q) = (r5v7 X.S0q), (r5v0 X.S0q), (r5v10 X.S0q), (r5v10 X.S0q) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:10:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca A[ExcHandler: RemoteException (r6v3 'e' android.os.RemoteException A[CUSTOM_DECLARE]), PHI: r2 r5 r8 
      PHI: (r2v6 java.util.List) = (r2v8 java.util.List), (r2v0 java.util.List), (r2v10 java.util.List), (r2v10 java.util.List) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 X.S0q) = (r5v7 X.S0q), (r5v0 X.S0q), (r5v10 X.S0q), (r5v10 X.S0q) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v4 java.lang.String) = (r8v5 java.lang.String), (r8v0 java.lang.String), (r8v7 java.lang.String), (r8v7 java.lang.String) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8 A[ExcHandler: RK0 (r10v5 'e' X.RK0 A[CUSTOM_DECLARE]), PHI: r2 r5 r8 
      PHI: (r2v5 java.util.List) = (r2v8 java.util.List), (r2v0 java.util.List), (r2v10 java.util.List), (r2v10 java.util.List) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v4 X.S0q) = (r5v7 X.S0q), (r5v0 X.S0q), (r5v10 X.S0q), (r5v10 X.S0q) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v3 java.lang.String) = (r8v5 java.lang.String), (r8v0 java.lang.String), (r8v7 java.lang.String), (r8v7 java.lang.String) binds: [B:28:0x009e, B:24:0x0080, B:10:0x0049, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r14, X.1Ln r15, X.0lg r16, X.C10915S0q r17, java.lang.String r18, java.util.List r19, X.AnonymousClass4D7 r20, X.C262094Cc r21, boolean r22) {
        /*
            r8 = r18
            r6 = r15
            r5 = r17
            r2 = r19
            r7 = 15
            r9 = r20
            boolean r0 = X.C66147MDz.A02(r7, r9)
            if (r0 == 0) goto L_0x0043
            r0 = r9
            X.MDz r0 = (X.C66147MDz) r0
            int r4 = r0.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L_0x0043
            int r4 = r4 - r3
            r0.A00 = r4
        L_0x001f:
            java.lang.Object r11 = r0.A05
            X.1Hj r10 = X.1Hj.A02
            int r12 = r0.A00
            java.lang.String r7 = "error"
            r9 = 817896512(0x30c01c40, float:1.3977868E-9)
            r1 = 1
            r3 = 0
            java.lang.String r4 = ""
            if (r12 == 0) goto L_0x0052
            if (r12 != r1) goto L_0x004d
            java.lang.Object r2 = r0.A04
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.A03
            X.S0q r5 = (X.C10915S0q) r5
            java.lang.Object r6 = r0.A02
            X.0Ak r6 = (X.0Ak) r6
            java.lang.Object r8 = r0.A01
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0049
        L_0x0043:
            X.MDz r0 = new X.MDz
            r0.<init>(r7, r9)
            goto L_0x001f
        L_0x0049:
            X.0eS.A00(r11)     // Catch:{ RCI -> 0x0109, RK0 -> 0x00e8, QpI -> 0x012d, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            goto L_0x009e
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0052:
            X.0eS.A00(r11)
            X.0qv r11 = X.0qv.A02
            java.lang.String r13 = r11.A04(r14)
            if (r13 == 0) goto L_0x0174
            int r11 = r13.length()
            if (r11 == 0) goto L_0x0174
            if (r15 == 0) goto L_0x006a
            java.lang.String r11 = "app_scoped_device_id"
            r15.A0R(r11, r13)
        L_0x006a:
            X.02m r12 = X.C51965G9l.A0l()
            com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor r11 = new com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor
            r11.<init>(r12)
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r15 = new com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient
            r15.<init>(r14, r12, r11, r13)
            if (r6 == 0) goto L_0x007c
            r15.A00 = r6
        L_0x007c:
            boolean r20 = X.AnonymousClass7TF.A1P(r22)
            r0.A01 = r8     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r0.A02 = r6     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r0.A03 = r5     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r0.A04 = r2     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r0.A00 = r1     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r18 = 0
            r19 = 2
            X.TTA r14 = new X.TTA     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r11 = r21
            java.lang.Object r11 = X.1Eo.A00(r0, r11, r14)     // Catch:{ RCI -> 0x0107, RK0 -> 0x00e8, QpI -> 0x00e6, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            if (r11 != r10) goto L_0x009e
            return r10
        L_0x009e:
            X.JV7 r11 = (X.JV7) r11     // Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            if (r5 == 0) goto L_0x00a6
            X.1pf r0 = r5.A00     // Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r0.A00 = r11     // Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
        L_0x00a6:
            r0 = 10
            X.9IP r10 = new X.9IP     // Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            r10.<init>((int) r0, (java.lang.Object) r11, (boolean) r1)     // Catch:{ RCI -> 0x00b0, RK0 -> 0x00e8, QpI -> 0x00ae, RemoteException -> 0x00ca, IllegalStateException -> 0x00b2 }
            return r10
        L_0x00ae:
            r10 = move-exception
            goto L_0x012e
        L_0x00b0:
            r10 = move-exception
            goto L_0x010a
        L_0x00b2:
            X.RHJ r0 = X.RHJ.A0B
            r2.add(r0)
            X.JV7 r6 = new X.JV7
            r6.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r4, (java.util.List) r2)
            if (r5 == 0) goto L_0x00c2
            X.1pf r0 = r5.A00
            r0.A00 = r6
        L_0x00c2:
            r0 = 10
            X.9IP r10 = new X.9IP
            r10.<init>((int) r0, (java.lang.Object) r6, (boolean) r1)
            return r10
        L_0x00ca:
            r6 = move-exception
            java.lang.String r1 = "Play Integrity attestation failed due to IntegrityService issue (e.g. binder has died)"
            X.0KC.A0F(r8, r1, r6)
            X.0wj r0 = X.0wj.A01
            X.0f9 r0 = r0.AEf(r8, r9)
            X.AnonymousClass7TF.A19(r0, r7, r1, r6)
            if (r5 == 0) goto L_0x00e3
            X.RHJ r0 = X.RHJ.A0D
            r6.getMessage()
            r5.A00(r0)
        L_0x00e3:
            X.RHJ r1 = X.RHJ.A0D
            goto L_0x0164
        L_0x00e6:
            r10 = move-exception
            goto L_0x012e
        L_0x00e8:
            r10 = move-exception
            java.lang.String r1 = "Play Integrity attestation failure related to nonce"
            X.0KC.A0F(r8, r1, r10)
            X.0wj r0 = X.0wj.A01
            X.0f9 r0 = r0.AEf(r8, r9)
            X.AnonymousClass7TF.A19(r0, r7, r1, r10)
            X.RHJ r1 = X.RHJ.A0Z
            boolean r0 = r10 instanceof X.RBK
            if (r0 == 0) goto L_0x0100
            X.RHJ r1 = X.RHJ.A07
            goto L_0x015c
        L_0x0100:
            boolean r0 = r10 instanceof X.RBL
            if (r0 == 0) goto L_0x015c
            X.RHJ r1 = X.RHJ.A09
            goto L_0x015c
        L_0x0107:
            r10 = move-exception
            goto L_0x010a
        L_0x0109:
            r10 = move-exception
        L_0x010a:
            java.lang.String r1 = "Play Integrity attestation failed during GraphQL execution"
            X.0KC.A0F(r8, r1, r10)
            X.0wj r0 = X.0wj.A01
            X.0f9 r0 = r0.AEf(r8, r9)
            X.AnonymousClass7TF.A19(r0, r7, r1, r10)
            if (r6 == 0) goto L_0x0121
            java.lang.String r1 = "api_network_or_graphql"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
        L_0x0121:
            if (r5 == 0) goto L_0x012a
            java.lang.String r0 = "getMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x012a:
            X.RHJ r1 = X.RHJ.A02
            goto L_0x0164
        L_0x012d:
            r10 = move-exception
        L_0x012e:
            java.lang.String r1 = "Play Integrity attestation failed while requesting integrity token from Google"
            X.0KC.A0F(r8, r1, r10)
            X.0wj r0 = X.0wj.A01
            X.0f9 r0 = r0.AEf(r8, r9)
            X.AnonymousClass7TF.A19(r0, r7, r1, r10)
            if (r6 == 0) goto L_0x0154
            java.lang.String r1 = "integrity_service"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
            com.google.android.gms.common.api.Status r0 = r10.A00
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            java.lang.String r0 = "integrity_error_code"
            r6.A0Q(r0, r7)
        L_0x0154:
            com.google.android.gms.common.api.Status r0 = r10.A00
            int r0 = r0.A00
            X.RHJ r1 = X.RHJ.A00(r0)
        L_0x015c:
            if (r5 == 0) goto L_0x0164
            r10.getMessage()
            r5.A00(r1)
        L_0x0164:
            r2.add(r1)
            X.JV7 r1 = new X.JV7
            r1.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r4, (java.util.List) r2)
            r0 = 10
            X.9IP r10 = new X.9IP
            r10.<init>((int) r0, (java.lang.Object) r1, (boolean) r3)
            return r10
        L_0x0174:
            if (r15 == 0) goto L_0x017d
            java.lang.String r1 = "empty_app_scoped_device_id"
            java.lang.String r0 = "error_type"
            r15.A0R(r0, r1)
        L_0x017d:
            if (r17 == 0) goto L_0x0184
            X.RHJ r0 = X.RHJ.A0N
            r5.A00(r0)
        L_0x0184:
            X.RHJ r0 = X.RHJ.A0N
            r2.add(r0)
            X.JV7 r5 = new X.JV7
            r5.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r4, (java.util.List) r2)
            r1 = 10
            X.9IP r0 = new X.9IP
            r0.<init>((int) r1, (java.lang.Object) r5, (boolean) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils.A00(android.content.Context, X.1Ln, X.0lg, X.S0q, java.lang.String, java.util.List, X.4D7, X.4Cc, boolean):java.lang.Object");
    }
}
