package com.instagram.security.attestation.playintegrity.client;

import X.02m;
import X.1Ln;
import X.AnonymousClass7TG;
import android.content.Context;

public final class PlayIntegrityAttestationClient {
    public 1Ln A00;
    public final Context A01;
    public final 02m A02;
    public final IgGooglePlayIntegrityAttestor A03;
    public final String A04;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.JV7 r6, X.0lg r7, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 13
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
            r2.A02 = r6
            r2.A0M = r3
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 1335113021(0x4f94353d, float:4.973034E9)
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
            X.RBL r1 = new X.RBL
            r1.<init>(r0)
            throw r1
        L_0x0067:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x006c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A00(X.JV7, X.0lg, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.0lg r6, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 12
            boolean r0 = X.MEB.A03(r3, r9)
            if (r0 == 0) goto L_0x0057
            r5 = r9
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x006d
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005c
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
            return r4
        L_0x002f:
            X.0eS.A00(r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r0 = "attestation/create_android_playintegrity/"
            r2.A0A(r0)
            java.lang.String r0 = "app_scoped_device_id"
            r2.A9m(r0, r8)
            java.lang.Class<X.R7f> r1 = X.C8741R7f.class
            java.lang.Class<X.SAC> r0 = X.SAC.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 1335113021(0x4f94353d, float:4.973034E9)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0057:
            X.MEB r5 = X.MEB.A00(r7, r9, r3)
            goto L_0x0016
        L_0x005c:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "Failed to retrieve nonce(s) from the server"
            X.RBK r1 = new X.RBK
            r1.<init>(r0)
            throw r1
        L_0x0068:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x006d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient.A01(X.0lg, com.instagram.security.attestation.playintegrity.client.PlayIntegrityAttestationClient, java.lang.String, X.4D7):java.lang.Object");
    }

    public PlayIntegrityAttestationClient(Context context, 02m r2, IgGooglePlayIntegrityAttestor igGooglePlayIntegrityAttestor, String str) {
        AnonymousClass7TG.A1P(igGooglePlayIntegrityAttestor, context);
        this.A03 = igGooglePlayIntegrityAttestor;
        this.A04 = str;
        this.A01 = context;
        this.A02 = r2;
    }
}
