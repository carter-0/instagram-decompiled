package X;

/* renamed from: X.VgW  reason: case insensitive filesystem */
public final class C17817VgW {
    public final /* synthetic */ VZ9 A00;
    public final /* synthetic */ X5z A01;
    public final /* synthetic */ byte[] A02;

    public C17817VgW(VZ9 vz9, X5z x5z, byte[] bArr) {
        this.A00 = vz9;
        this.A02 = bArr;
        this.A01 = x5z;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.V3d] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.V41 r21) {
        /*
            r20 = this;
            r0 = r20
            X.VZ9 r6 = r0.A00
            byte[] r4 = r0.A02
            X.X5z r3 = r0.A01
            r7 = r21
            int r11 = r7.A00     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
            java.lang.String r1 = r7.A05     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
            monitor-enter(r6)     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
            X.W2O r10 = r6.A02     // Catch:{ all -> 0x01bd }
            monitor-enter(r10)     // Catch:{ all -> 0x01bd }
            r14 = 0
            X.0qQ.A0B(r1, r14)     // Catch:{ all -> 0x01ba }
            r9 = 0
            java.util.HashMap r0 = X.W2O.A01(r10)     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            if (r0 == 0) goto L_0x0050
            java.util.Iterator r8 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            r5 = r9
        L_0x002b:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r2 = r8.next()     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            X.V4K r2 = (X.V4K) r2     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            boolean r0 = r2.A00()     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            if (r0 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x0045
            int r1 = r5.A01     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            int r0 = r2.A01     // Catch:{ JSONException -> 0x004d, IllegalArgumentException -> 0x0049 }
            if (r1 <= r0) goto L_0x002b
        L_0x0045:
            r5 = r2
            goto L_0x002b
        L_0x0047:
            r9 = r5
            goto L_0x0050
        L_0x0049:
            r10.A04()     // Catch:{ all -> 0x01ba }
            goto L_0x0050
        L_0x004d:
            r10.A04()     // Catch:{ all -> 0x01ba }
        L_0x0050:
            monitor-exit(r10)     // Catch:{ all -> 0x01bd }
            X.V40 r2 = X.VZ9.A00(r6, r9, r4, r11)     // Catch:{ all -> 0x01bd }
            if (r9 == 0) goto L_0x006a
            boolean r0 = r9.A00()     // Catch:{ all -> 0x01bd }
            X.W2O r1 = r6.A02     // Catch:{ all -> 0x01bd }
            if (r0 == 0) goto L_0x006e
            X.V4K[] r0 = new X.V4K[]{r9}     // Catch:{ all -> 0x01bd }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01bd }
            r1.A06(r0)     // Catch:{ all -> 0x01bd }
        L_0x006a:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
            goto L_0x0072
        L_0x006e:
            r1.A05(r9)     // Catch:{ all -> 0x01bd }
            goto L_0x006a
        L_0x0072:
            monitor-exit(r6)     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
            if (r2 == 0) goto L_0x0079
            r3.DoF(r2)
            return
        L_0x0079:
            int r13 = r7.A01
            X.VXY r2 = new X.VXY
            r2.<init>(r6, r3, r7, r4)
            java.lang.System.currentTimeMillis()
            if (r13 > 0) goto L_0x0096
            java.lang.String r0 = "Invalid number of tokens requested: "
            java.lang.String r0 = X.002.A0O(r0, r13)
            X.V1g r1 = new X.V1g
            r1.<init>(r0)
            X.X5z r0 = r2.A01
            r0.onFailure(r1)
            return
        L_0x0096:
            X.X8I r12 = r6.A00     // Catch:{ V1h -> 0x01b3 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ V1h -> 0x01b3 }
            r4.<init>(r13)     // Catch:{ V1h -> 0x01b3 }
            java.security.SecureRandom r11 = new java.security.SecureRandom     // Catch:{ V1h -> 0x01b3 }
            r11.<init>()     // Catch:{ V1h -> 0x01b3 }
            int r10 = r12.getCurveBytes()     // Catch:{ V1h -> 0x01b3 }
            r9 = 0
        L_0x00a7:
            byte[] r8 = new byte[r10]     // Catch:{ V1h -> 0x01b3 }
            r11.nextBytes(r8)     // Catch:{ V1h -> 0x01b3 }
            byte[] r5 = new byte[r10]     // Catch:{ V1h -> 0x01b3 }
            byte[] r3 = new byte[r10]     // Catch:{ V1h -> 0x01b3 }
            int r1 = r12.blind(r8, r5, r3)     // Catch:{ V1h -> 0x01b3 }
            if (r1 != 0) goto L_0x01a7
            X.V3d r0 = new X.V3d     // Catch:{ V1h -> 0x01b3 }
            r0.<init>()     // Catch:{ V1h -> 0x01b3 }
            r0.A02 = r8     // Catch:{ V1h -> 0x01b3 }
            r0.A01 = r3     // Catch:{ V1h -> 0x01b3 }
            r0.A00 = r5     // Catch:{ V1h -> 0x01b3 }
            r4.add(r0)     // Catch:{ V1h -> 0x01b3 }
            int r9 = r9 + 1
            if (r9 < r13) goto L_0x00a7
            int r9 = r4.size()
            byte[][] r8 = new byte[r9][]
            r3 = 0
        L_0x00cf:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x00e7
            java.lang.Object r0 = r4.get(r3)
            X.V3d r0 = (X.C16720V3d) r0
            byte[] r1 = r0.A00
            int r0 = r1.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r8[r3] = r0
            int r3 = r3 + 1
            goto L_0x00cf
        L_0x00e7:
            X.VLe r0 = r6.A01
            X.VXZ r5 = new X.VXZ
            r5.<init>(r2, r6, r7, r4)
            X.VXa r0 = r0.A00
            X.VRv r4 = r0.A03
            com.google.common.collect.ImmutableList$Builder r6 = new com.google.common.collect.ImmutableList$Builder
            r6.<init>()
            r3 = 0
        L_0x00f8:
            if (r3 >= r9) goto L_0x0112
            r1 = r8[r3]
            r0 = 8
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
            if (r2 == 0) goto L_0x010c
            java.lang.String r1 = "\n"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replace(r1, r0)
        L_0x010c:
            r6.add(r2)
            int r3 = r3 + 1
            goto L_0x00f8
        L_0x0112:
            com.google.common.collect.ImmutableList r1 = r6.build()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.google.common.collect.ImmutableList$Builder r8 = new com.google.common.collect.ImmutableList$Builder
            r8.<init>()
            X.3kO r3 = X.C66580MXl.A0J(r1)
        L_0x0123:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)
            X.2IV r1 = new X.2IV
            r1.<init>()
            java.lang.String r0 = "issue_data"
            r1.A09(r2, r0)
            r8.add(r1)
            goto L_0x0123
        L_0x013b:
            r15 = 0
            X.2IS r3 = new X.2IS
            r3.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r1 = "LS_IgdReceiverFetch"
            java.lang.String r0 = "projectName"
            r3.A04(r0, r1)
            X.2IV r2 = new X.2IV
            r2.<init>()
            com.google.common.collect.ImmutableList r1 = r8.build()
            java.lang.String r0 = "issue_element"
            r2.A05(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.String r0 = "request_proof"
            r2.A08(r0, r1)
            java.lang.String r0 = "message"
            r3.A00(r2, r0)
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "configId"
            r3.A04(r0, r1)
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            X.1vR r9 = X.C41845B3m.A06(r0)
            java.util.Map r11 = r3.getParamsCopy()
            java.util.Map r12 = r6.getParamsCopy()
            java.lang.Class<X.UQJ> r13 = X.UQJ.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "IGDirectACSIssueQuery"
            java.lang.String r18 = "xfb_messaging_acs_issue"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vo r3 = r4.A00
            r0 = 2
            X.WHv r2 = new X.WHv
            r2.<init>(r0, r4, r5)
            X.WHf r1 = new X.WHf
            r1.<init>(r5, r0)
            java.util.concurrent.ExecutorService r0 = r4.A01
            r3.ATM(r1, r2, r8, r0)
            return
        L_0x01a7:
            java.lang.String r0 = "VOPRF blind(...) returned error code: "
            java.lang.String r1 = X.002.A0O(r0, r1)     // Catch:{ V1h -> 0x01b3 }
            X.V1h r0 = new X.V1h     // Catch:{ V1h -> 0x01b3 }
            r0.<init>(r1)     // Catch:{ V1h -> 0x01b3 }
            throw r0     // Catch:{ V1h -> 0x01b3 }
        L_0x01b3:
            r1 = move-exception
            X.X5z r0 = r2.A01
            r0.onFailure(r1)
            return
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
            throw r0     // Catch:{ V1g | V1h | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            r3.onFailure(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17817VgW.A00(X.V41):void");
    }
}
