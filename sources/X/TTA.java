package X;

import com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient;

public final class TTA extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTA(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A03 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A07 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.TTA, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        int i;
        AnonymousClass4D7 r5 = r10;
        switch (this.A03) {
            case 0:
                obj2 = this.A06;
                obj3 = this.A05;
                obj4 = this.A04;
                z = this.A07;
                i = 0;
                break;
            case 1:
                int i2 = this.A00;
                return new TTA((C10199RoF) this.A02, (0lg) this.A05, (IgPlayIntegrityAttestationClient) this.A06, (S7S) this.A04, r5, i2, this.A07);
            default:
                obj2 = this.A06;
                obj3 = this.A05;
                obj4 = this.A04;
                z = this.A07;
                i = 2;
                break;
        }
        return new TTA(obj2, obj3, obj4, r5, i, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Gn5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.JV7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: X.Gn5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.JV7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.JV7} */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.TTA, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0254, code lost:
        if (r14 == null) goto L_0x0256;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5 A[SYNTHETIC, Splitter:B:42:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r2 = r20
            r0 = r21
            int r1 = r2.A03
            switch(r1) {
                case 0: goto L_0x01c6;
                case 1: goto L_0x0118;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r2.A01
            java.lang.String r8 = "validate_end"
            r13 = 0
            java.lang.String r3 = "nonce_end"
            r10 = 3
            r9 = 2
            r11 = 1
            r7 = 533737437(0x1fd02fdd, float:8.817061E-20)
            if (r1 == 0) goto L_0x0029
            int r6 = r2.A00
            if (r1 == r11) goto L_0x0055
            if (r1 == r9) goto L_0x009a
            java.lang.Object r5 = r2.A02
            X.0eS.A00(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x00f9
        L_0x0029:
            X.0eS.A00(r0)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r6 = r0.nextInt()
            java.lang.Object r5 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r5 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r5
            X.02m r1 = r5.A02
            r1.markerStart(r7, r6)
            java.lang.String r0 = "nonce_start"
            r1.markerPoint(r7, r6, r0)     // Catch:{ all -> 0x010d }
            java.lang.Object r1 = r2.A05     // Catch:{ all -> 0x010d }
            X.0lg r1 = (X.0lg) r1     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r5.A04     // Catch:{ all -> 0x010d }
            r2.A00 = r6     // Catch:{ all -> 0x010d }
            r2.A01 = r11     // Catch:{ all -> 0x010d }
            java.lang.Object r0 = com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A01(r1, r5, r0, r2)     // Catch:{ all -> 0x010d }
            if (r0 != r4) goto L_0x0058
            return r4
        L_0x0055:
            X.0eS.A00(r0)     // Catch:{ all -> 0x010d }
        L_0x0058:
            X.R7f r0 = (X.C8741R7f) r0     // Catch:{ all -> 0x010d }
            java.lang.Object r5 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r5 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r5
            X.02m r1 = r5.A02
            r1.markerPoint(r7, r6, r3)
            java.lang.String r1 = "Server did not respond with a nonce"
            if (r0 == 0) goto L_0x0108
            X.Tiy r0 = r0.A00
            if (r0 == 0) goto L_0x0256
            X.QPd r0 = (X.QPd) r0
            java.lang.String r12 = r0.A00
            if (r12 == 0) goto L_0x0108
            int r0 = r12.length()
            if (r0 != 0) goto L_0x007c
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r1)
            throw r4
        L_0x007c:
            X.1Ln r3 = r5.A00
            if (r3 == 0) goto L_0x0089
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "has_challenge_nonce"
            r3.A0O(r0, r1)
        L_0x0089:
            com.instagram.security.attestation.playintegrity.client.IgGooglePlayIntegrityAttestor r1 = r5.A03
            android.content.Context r0 = r5.A01
            r2.A02 = r12
            r2.A00 = r6
            r2.A01 = r9
            java.lang.Object r0 = r1.A00(r0, r12, r2)
            if (r0 != r4) goto L_0x00a1
            return r4
        L_0x009a:
            java.lang.Object r12 = r2.A02
            java.lang.String r12 = (java.lang.String) r12
            X.0eS.A00(r0)
        L_0x00a1:
            X.BBV r0 = (X.BBV) r0
            java.lang.String r11 = r0.A00
            java.lang.Object r1 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r1 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r1
            X.1Ln r5 = r1.A00
            if (r5 == 0) goto L_0x00bd
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x00b4
            r13 = 1
        L_0x00b4:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "has_integrity_token"
            r5.A0O(r0, r3)
        L_0x00bd:
            java.lang.Object r3 = r2.A04
            java.util.Collection r3 = (java.util.Collection) r3
            X.RHJ r0 = X.RHJ.NO_ERROR
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r3 = X.00k.A0S(r0, r3)
            r0 = 0
            X.JV7 r5 = new X.JV7
            r5.<init>((int) r0, (java.lang.String) r12, (java.lang.String) r11, (java.util.List) r3)
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0102
            X.02m r3 = r1.A02     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "validate_start"
            r3.markerPoint(r7, r6, r0)     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r2.A05     // Catch:{ all -> 0x00ee }
            X.0lg r0 = (X.0lg) r0     // Catch:{ all -> 0x00ee }
            r2.A02 = r5     // Catch:{ all -> 0x00ee }
            r2.A00 = r6     // Catch:{ all -> 0x00ee }
            r2.A01 = r10     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A00(r5, r0, r1, r2)     // Catch:{ all -> 0x00ee }
            if (r0 != r4) goto L_0x00f9
            return r4
        L_0x00ee:
            r4 = move-exception
            java.lang.Object r0 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            X.02m r0 = r0.A02
            r0.markerPoint(r7, r6, r8)
            throw r4
        L_0x00f9:
            java.lang.Object r1 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r1 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r1
            X.02m r0 = r1.A02
            r0.markerPoint(r7, r6, r8)
        L_0x0102:
            X.02m r0 = r1.A02
            r0.markerEnd(r7, r6, r9)
            return r5
        L_0x0108:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r1)
            throw r4
        L_0x010d:
            r1 = move-exception
            java.lang.Object r0 = r2.A06
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r0 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient) r0
            X.02m r0 = r0.A02
            r0.markerPoint(r7, r6, r3)
            throw r1
        L_0x0118:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r2.A01
            r3 = 1
            if (r1 == 0) goto L_0x012a
            if (r1 != r3) goto L_0x0125
            X.0eS.A00(r0)
            return r0
        L_0x0125:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
            throw r4
        L_0x012a:
            X.0eS.A00(r0)
            com.google.common.util.concurrent.SettableFuture r5 = new com.google.common.util.concurrent.SettableFuture
            r5.<init>()
            java.lang.Object r6 = r2.A05
            X.0lg r6 = (X.0lg) r6
            java.lang.Object r1 = r2.A06
            com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient r1 = (com.instagram.security.attestation.playintegrity.client.IgPlayIntegrityAttestationClient) r1
            java.lang.String r0 = r1.A00
            X.RtA r13 = new X.RtA
            r13.<init>(r6, r0)
            int r0 = r2.A00
            X.SE4 r11 = new X.SE4
            r11.<init>(r0)
            X.RqK r15 = new X.RqK
            r15.<init>(r6)
            java.util.concurrent.ScheduledExecutorService r1 = r1.A01
            java.lang.Object r12 = r2.A02
            X.RoF r12 = (X.C10199RoF) r12
            java.lang.Object r14 = r2.A04
            X.S7S r14 = (X.S7S) r14
            boolean r0 = r2.A07
            X.SNi r10 = new X.SNi
            r16 = r1
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.RqJ r9 = new X.RqJ
            r9.<init>(r5)
            X.S7S r0 = r10.A04
            X.02m r7 = r0.A01
            int r6 = r0.A00
            r1 = 533737437(0x1fd02fdd, float:8.817061E-20)
            r7.markerStart(r1, r6)
            java.lang.String r0 = "nonce_start"
            r7.markerPoint(r1, r6, r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.RtA r1 = r10.A03
            com.google.common.util.concurrent.SettableFuture r7 = new com.google.common.util.concurrent.SettableFuture
            r7.<init>()
            X.0lg r0 = r1.A00
            X.1NY r6 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "attestation/create_android_playintegrity/"
            r6.A0A(r0)
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "app_scoped_device_id"
            r6.A9m(r0, r1)
            java.lang.Class<X.R7f> r1 = X.C8741R7f.class
            java.lang.Class<X.SAC> r0 = X.SAC.class
            r6.A0Q(r1, r0)
            X.1OC r6 = r6.A0M()
            r1 = 8
            X.R8p r0 = new X.R8p
            r0.<init>((java.lang.Object) r7, (int) r1)
            r6.A00 = r0
            X.1ET r0 = X.1ES.A01()
            r0.schedule(r6)
            r0 = 2
            X.T0S r1 = new X.T0S
            r1.<init>(r0, r8, r9, r10)
            java.util.concurrent.ScheduledExecutorService r0 = r10.A06
            X.C255183ti.A04(r1, r7, r0)
            r2.A01 = r3
            java.lang.Object r5 = X.C70357O3j.A00(r5, r2)
            if (r5 != r4) goto L_0x01c5
            return r4
        L_0x01c5:
            return r5
        L_0x01c6:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r2.A01
            java.lang.String r6 = "validate_end"
            java.lang.String r11 = "nonce_end"
            r7 = 2
            r3 = 533731830(0x1fd019f6, float:8.8134375E-20)
            r4 = 1
            if (r1 == 0) goto L_0x01f0
            if (r1 == r4) goto L_0x01e9
            if (r1 != r7) goto L_0x01e4
            int r1 = r2.A00
            java.lang.Object r4 = r2.A02
            X.0eS.A00(r0)     // Catch:{ all -> 0x038e }
            goto L_0x0399
        L_0x01e4:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
            throw r4
        L_0x01e9:
            int r1 = r2.A00
            java.lang.Object r10 = r2.A02
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0241
        L_0x01f0:
            X.0eS.A00(r0)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt()
            java.lang.Object r12 = r2.A06
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r12 = (com.instagram.security.attestation.keystore.client.KeyAttestationClient) r12
            X.02m r13 = r12.A02
            r13.markerStart(r3, r1)
            X.S4R r9 = r12.A01
            java.lang.String r8 = "w6CmevIyM/PL6Q5uUDw="
            X.SID r0 = r9.A00
            java.security.KeyStore r0 = r0.A00     // Catch:{ NullPointerException | GeneralSecurityException -> 0x03b6 }
            boolean r0 = r0.containsAlias(r8)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x03b6 }
            if (r0 == 0) goto L_0x0226
            java.lang.String r10 = r9.A00()
            X.1Ln r9 = r12.A00
            if (r9 == 0) goto L_0x0228
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "has_existing_key"
            r9.A0O(r0, r8)
            goto L_0x0228
        L_0x0226:
            java.lang.String r10 = ""
        L_0x0228:
            java.lang.String r0 = "nonce_start"
            r13.markerPoint(r3, r1, r0)     // Catch:{ all -> 0x03ab }
            java.lang.Object r8 = r2.A05     // Catch:{ all -> 0x03ab }
            X.0lg r8 = (X.0lg) r8     // Catch:{ all -> 0x03ab }
            java.lang.String r0 = r12.A03     // Catch:{ all -> 0x03ab }
            r2.A02 = r10     // Catch:{ all -> 0x03ab }
            r2.A00 = r1     // Catch:{ all -> 0x03ab }
            r2.A01 = r4     // Catch:{ all -> 0x03ab }
            java.lang.Object r0 = com.instagram.security.attestation.keystore.client.KeyAttestationClient.A01(r8, r12, r0, r10, r2)     // Catch:{ all -> 0x03ab }
            if (r0 != r5) goto L_0x0244
            return r5
        L_0x0241:
            X.0eS.A00(r0)     // Catch:{ all -> 0x03ab }
        L_0x0244:
            X.R7g r0 = (X.C8742R7g) r0     // Catch:{ all -> 0x03ab }
            java.lang.Object r8 = r2.A06
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r8 = (com.instagram.security.attestation.keystore.client.KeyAttestationClient) r8
            X.02m r9 = r8.A02
            r9.markerPoint(r3, r1, r11)
            r11 = 0
            if (r0 == 0) goto L_0x0261
            X.Tix r14 = r0.A00
            if (r14 != 0) goto L_0x0262
        L_0x0256:
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r4 = X.AnonymousClass00P.createAndThrow()
            throw r4
        L_0x0261:
            r14 = r11
        L_0x0262:
            java.lang.String r12 = "Server did not respond with a challenge nonce"
            if (r14 == 0) goto L_0x03a6
            X.QPc r14 = (X.QPc) r14
            java.lang.String r0 = r14.A00
            r17 = r0
            if (r0 == 0) goto L_0x03a6
            int r0 = r17.length()
            if (r0 != 0) goto L_0x0279
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r12)
            throw r4
        L_0x0279:
            X.1Ln r13 = r8.A00
            if (r13 == 0) goto L_0x0286
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "has_challenge_nonce"
            r13.A0O(r0, r12)
        L_0x0286:
            java.lang.String r0 = r14.A01
            r16 = r0
            X.1Ln r13 = r8.A00
            if (r13 == 0) goto L_0x0297
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "has_key_nonce"
            r13.A0O(r0, r12)
        L_0x0297:
            boolean r0 = X.AnonymousClass7TF.A1V(r16)
            r18 = 0
            if (r0 == 0) goto L_0x0324
            X.S4R r15 = r8.A01
            java.lang.String r14 = "w6CmevIyM/PL6Q5uUDw="
            X.SID r13 = r15.A00
            java.security.KeyStore r12 = r13.A00     // Catch:{ NullPointerException | GeneralSecurityException -> 0x0311 }
            boolean r0 = r12.containsAlias(r14)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x0311 }
            if (r0 == 0) goto L_0x02bb
            r12.deleteEntry(r14)     // Catch:{ GeneralSecurityException -> 0x02b2 }
            goto L_0x02bb
        L_0x02b2:
            r2 = move-exception
            java.lang.String r1 = "Unable to delete key"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        L_0x02bb:
            if (r16 == 0) goto L_0x02c1
            byte[] r11 = X.C66582MXn.A1a(r16)
        L_0x02c1:
            X.RDV r10 = X.RDV.EC
            boolean r0 = r15.A01
            X.SID.A00(r13, r10, r14, r11, r0)
            java.lang.String r10 = r15.A00()
            java.security.cert.Certificate[] r0 = r12.getCertificateChain(r14)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x0308 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x0308 }
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r13 = r0.iterator()     // Catch:{ CertificateEncodingException -> 0x02ff }
        L_0x02dc:
            boolean r0 = r13.hasNext()     // Catch:{ CertificateEncodingException -> 0x02ff }
            if (r0 == 0) goto L_0x031a
            java.lang.Object r11 = r13.next()     // Catch:{ CertificateEncodingException -> 0x02ff }
            java.security.cert.Certificate r11 = (java.security.cert.Certificate) r11     // Catch:{ CertificateEncodingException -> 0x02ff }
            java.lang.String r0 = "-----BEGIN CERTIFICATE-----\n"
            r12.append(r0)     // Catch:{ CertificateEncodingException -> 0x02ff }
            byte[] r11 = r11.getEncoded()     // Catch:{ CertificateEncodingException -> 0x02ff }
            r0 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r11, r0)     // Catch:{ CertificateEncodingException -> 0x02ff }
            r12.append(r0)     // Catch:{ CertificateEncodingException -> 0x02ff }
            java.lang.String r0 = "-----END CERTIFICATE-----\n"
            r12.append(r0)     // Catch:{ CertificateEncodingException -> 0x02ff }
            goto L_0x02dc
        L_0x02ff:
            r2 = move-exception
            java.lang.String r1 = "Unable to encode attestation certificates"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        L_0x0308:
            r2 = move-exception
            java.lang.String r1 = "Unable to get certificate chain"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        L_0x0311:
            r2 = move-exception
            java.lang.String r1 = "Unable to check key existance"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        L_0x031a:
            java.lang.String r0 = r12.toString()
            java.lang.String r11 = r0.trim()
            r18 = r11
        L_0x0324:
            X.1Ln r12 = r8.A00
            if (r12 == 0) goto L_0x032d
            java.lang.String r0 = "key_hash"
            r12.A0R(r0, r10)
        L_0x032d:
            if (r11 == 0) goto L_0x0343
            X.1Ln r11 = r8.A00
            if (r11 == 0) goto L_0x0343
            int r0 = r18.length()
            if (r0 > 0) goto L_0x033a
            r4 = 0
        L_0x033a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "has_encoded_certificate_chain"
            r11.A0O(r0, r4)
        L_0x0343:
            byte[] r12 = X.C66582MXn.A1a(r17)
            X.S4R r11 = r8.A01
            X.RDV r4 = X.RDV.EC
            java.lang.String r0 = "w6CmevIyM/PL6Q5uUDw="
            byte[] r4 = r11.A01(r4, r0, r12)
            r0 = 10
            java.lang.String r15 = android.util.Base64.encodeToString(r4, r0)
            X.0qQ.A0A(r15)
            java.lang.Object r4 = r2.A04
            java.util.Collection r4 = (java.util.Collection) r4
            X.RHJ r0 = X.RHJ.NO_ERROR
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r19 = X.00k.A0S(r0, r4)
            X.Gn5 r4 = new X.Gn5
            r13 = r4
            r14 = r17
            r17 = r10
            r13.<init>((java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.util.List) r19)
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x03a2
            java.lang.String r0 = "validate_start"
            r9.markerPoint(r3, r1, r0)     // Catch:{ all -> 0x038e }
            java.lang.Object r0 = r2.A05     // Catch:{ all -> 0x038e }
            X.0lg r0 = (X.0lg) r0     // Catch:{ all -> 0x038e }
            r2.A02 = r4     // Catch:{ all -> 0x038e }
            r2.A00 = r1     // Catch:{ all -> 0x038e }
            r2.A01 = r7     // Catch:{ all -> 0x038e }
            java.lang.Object r0 = com.instagram.security.attestation.keystore.client.KeyAttestationClient.A00(r4, r0, r8, r2)     // Catch:{ all -> 0x038e }
            if (r0 != r5) goto L_0x0399
            return r5
        L_0x038e:
            r4 = move-exception
            java.lang.Object r0 = r2.A06
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r0 = (com.instagram.security.attestation.keystore.client.KeyAttestationClient) r0
            X.02m r0 = r0.A02
            r0.markerPoint(r3, r1, r6)
            throw r4
        L_0x0399:
            java.lang.Object r0 = r2.A06
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r0 = (com.instagram.security.attestation.keystore.client.KeyAttestationClient) r0
            X.02m r9 = r0.A02
            r9.markerPoint(r3, r1, r6)
        L_0x03a2:
            r9.markerEnd(r3, r1, r7)
            return r4
        L_0x03a6:
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0z(r12)
            throw r4
        L_0x03ab:
            r4 = move-exception
            java.lang.Object r0 = r2.A06
            com.instagram.security.attestation.keystore.client.KeyAttestationClient r0 = (com.instagram.security.attestation.keystore.client.KeyAttestationClient) r0
            X.02m r0 = r0.A02
            r0.markerPoint(r3, r1, r11)
            throw r4
        L_0x03b6:
            r2 = move-exception
            java.lang.String r1 = "Unable to check key existance"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TTA) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTA(C10199RoF roF, 0lg r3, IgPlayIntegrityAttestationClient igPlayIntegrityAttestationClient, S7S s7s, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A03 = 1;
        this.A05 = r3;
        this.A06 = igPlayIntegrityAttestationClient;
        this.A00 = i;
        this.A02 = roF;
        this.A04 = s7s;
        this.A07 = z;
    }
}
