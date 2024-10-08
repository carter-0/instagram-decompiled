package com.instagram.security.attestation.keystore.client;

import X.02m;
import X.1Ln;
import X.S4R;

public final class KeyAttestationClient {
    public 1Ln A00;
    public final S4R A01;
    public final 02m A02;
    public final String A03;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53375Gn5 r6, X.0lg r7, com.instagram.security.attestation.keystore.client.KeyAttestationClient r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 9
            boolean r0 = X.MEB.A03(r3, r9)
            if (r0 == 0) goto L_0x0056
            r5 = r9
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x006c
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
            return r4
        L_0x002f:
            X.0eS.A00(r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r7)
            java.lang.String r0 = "attestation/validate/"
            r2.A0A(r0)
            r2.A03 = r6
            r2.A0L = r3
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 669957587(0x27eebdd3, float:6.6264078E-15)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0056:
            X.MEB r5 = X.MEB.A00(r8, r9, r3)
            goto L_0x0016
        L_0x005b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "Failed to validate attestation"
            X.RBJ r1 = new X.RBJ
            r1.<init>(r0)
            throw r1
        L_0x0067:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x006c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.client.KeyAttestationClient.A00(X.Gn5, X.0lg, com.instagram.security.attestation.keystore.client.KeyAttestationClient, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.0lg r6, com.instagram.security.attestation.keystore.client.KeyAttestationClient r7, java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 8
            boolean r0 = X.MEB.A03(r3, r10)
            if (r0 == 0) goto L_0x005c
            r5 = r10
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x0072
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0061
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
            return r4
        L_0x002f:
            X.0eS.A00(r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r0 = "attestation/create_android_keystore/"
            r2.A0A(r0)
            java.lang.String r0 = "app_scoped_device_id"
            r2.A9m(r0, r8)
            java.lang.String r0 = "key_hash"
            r2.A9m(r0, r9)
            java.lang.Class<X.R7g> r1 = X.C8742R7g.class
            java.lang.Class<X.SAB> r0 = X.SAB.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 669957587(0x27eebdd3, float:6.6264078E-15)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x005c:
            X.MEB r5 = X.MEB.A00(r7, r10, r3)
            goto L_0x0016
        L_0x0061:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "Failed to retrieve nonce(s) from the server"
            X.RBI r1 = new X.RBI
            r1.<init>(r0)
            throw r1
        L_0x006d:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0072:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.keystore.client.KeyAttestationClient.A01(X.0lg, com.instagram.security.attestation.keystore.client.KeyAttestationClient, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public KeyAttestationClient(S4R s4r, 02m r2, String str) {
        this.A01 = s4r;
        this.A03 = str;
        this.A02 = r2;
    }
}
