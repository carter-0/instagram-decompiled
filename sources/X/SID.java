package X;

import android.security.keystore.StrongBoxUnavailableException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;

public final class SID {
    public final KeyStore A00;

    public static void A00(SID sid, RDV rdv, String str, byte[] bArr, boolean z) {
        SID sid2 = sid;
        RDV rdv2 = rdv;
        String str2 = str;
        byte[] bArr2 = bArr;
        boolean z2 = z;
        try {
            sid2.A02(rdv2, str2, bArr2, true, z2);
        } catch (ProviderException e) {
            if (e instanceof StrongBoxUnavailableException) {
                try {
                    sid2.A02(rdv2, str2, bArr2, false, z2);
                } catch (ProviderException e2) {
                    throw new Exception("Unable to generate attested key", e2);
                }
            } else {
                throw new Exception("Unable to generate attested key", e);
            }
        }
    }

    public final KeyStore.Entry A01(String str) {
        try {
            return this.A00.getEntry(str, (KeyStore.ProtectionParameter) null);
        } catch (NullPointerException | UnsupportedOperationException | GeneralSecurityException | ProviderException e) {
            throw new Exception("Unable to get entry", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        throw new java.lang.Exception("Unable to generate attested key", r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061 A[SYNTHETIC, Splitter:B:13:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[ExcHandler: NullPointerException | GeneralSecurityException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0, NullPointerException | GeneralSecurityException -> 0x00a0 }, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.RDV r6, java.lang.String r7, byte[] r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            java.util.Date r4 = new java.util.Date     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r4.<init>()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r1.setTime(r4)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r3 = 1
            r0 = 10
            r1.add(r3, r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.util.Date r2 = r1.getTime()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r0 = 12
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r1.<init>(r7, r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.String[] r0 = r6.A02     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setDigests(r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setCertificateNotBefore(r4)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setCertificateNotAfter(r2)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            if (r8 == 0) goto L_0x0031
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setAttestationChallenge(r8)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
        L_0x0031:
            int r0 = r6.ordinal()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r2 = 0
            if (r0 == r3) goto L_0x003b
            if (r0 != r2) goto L_0x0049
            goto L_0x0040
        L_0x003b:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.String r0 = "PSS"
            goto L_0x0044
        L_0x0040:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.String r0 = "PKCS1"
        L_0x0044:
            r1[r2] = r0     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r4.setSignaturePaddings(r1)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
        L_0x0049:
            java.lang.String r2 = r6.A01     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r2, r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r4.setIsStrongBoxBacked(r9)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            android.security.keystore.KeyGenParameterSpec r0 = r4.build()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r1.initialize(r0)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.security.KeyPair r0 = r1.generateKeyPair()     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            if (r10 == 0) goto L_0x0090
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.security.PrivateKey r1 = r0.getPrivate()     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.Class<android.security.keystore.KeyInfo> r0 = android.security.keystore.KeyInfo.class
            java.security.spec.KeySpec r2 = r2.getKeySpec(r1, r0)     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            java.lang.String r0 = "key spec should not be null!"
            X.17k.A07(r2, r0)     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            android.security.keystore.KeyInfo r2 = (android.security.keystore.KeyInfo) r2     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            r0 = 31
            if (r1 < r0) goto L_0x0084
            int r1 = r2.getSecurityLevel()     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            r0 = -1
            if (r1 == r0) goto L_0x0090
            goto L_0x008b
        L_0x0084:
            boolean r0 = r2.isInsideSecureHardware()     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            if (r0 == 0) goto L_0x0091
            return
        L_0x008b:
            if (r1 == r3) goto L_0x0090
            r0 = 2
            if (r1 != r0) goto L_0x0091
        L_0x0090:
            return
        L_0x0091:
            X.QcC r0 = new X.QcC     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            r0.<init>()     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
            throw r0     // Catch:{ GeneralSecurityException -> 0x0097, NullPointerException | GeneralSecurityException -> 0x00a0 }
        L_0x0097:
            r2 = move-exception
            java.lang.String r1 = "Unable to determine if attested key is hardware backed"
            X.QcC r0 = new X.QcC     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            r0.<init>(r1, r2)     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
            throw r0     // Catch:{ NullPointerException | GeneralSecurityException -> 0x00a0 }
        L_0x00a0:
            r2 = move-exception
            java.lang.String r1 = "Unable to generate attested key"
            X.RJV r0 = new X.RJV
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SID.A02(X.RDV, java.lang.String, byte[], boolean, boolean):void");
    }

    public SID() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.A00 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | GeneralSecurityException e) {
            throw new Exception("Unable to create or load AndroidKeyStore", e);
        }
    }
}
