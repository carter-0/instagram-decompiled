package X;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;

/* renamed from: X.9Ax  reason: invalid class name and case insensitive filesystem */
public final class C374819Ax {
    public static final Object A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.util.Log.w("AndroidKeystoreKmsClient", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        java.lang.Thread.sleep((long) ((int) (java.lang.Math.random() * 40.0d)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = "AndroidKeyStore";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = java.security.KeyStore.getInstance(r2);
        r1.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = r1.containsAlias(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        throw new java.security.GeneralSecurityException(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String r6) {
        /*
            java.lang.Object r5 = A00
            monitor-enter(r5)
            java.lang.String r4 = X.C374829Ay.A00(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r2)     // Catch:{ IOException -> 0x0016 }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException -> 0x0016 }
            boolean r0 = r1.containsAlias(r4)     // Catch:{ all -> 0x001d }
            goto L_0x0040
        L_0x0016:
            r1 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x001d }
            r0.<init>(r1)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            throw r0     // Catch:{ NullPointerException -> 0x001f }
        L_0x001f:
            java.lang.String r1 = "AndroidKeystoreKmsClient"
            java.lang.String r0 = "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0084 }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x0084 }
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ all -> 0x0084 }
            long r0 = (long) r0     // Catch:{ all -> 0x0084 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0032 }
        L_0x0032:
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r2)     // Catch:{ IOException -> 0x007b }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException -> 0x007b }
            boolean r0 = r1.containsAlias(r4)     // Catch:{ all -> 0x0082 }
        L_0x0040:
            if (r0 != 0) goto L_0x0078
            java.lang.String r3 = X.C374829Ay.A00(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r2 = javax.crypto.KeyGenerator.getInstance(r0, r2)     // Catch:{ all -> 0x0084 }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ all -> 0x0084 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0084 }
            r0 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setKeySize(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "GCM"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0084 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setBlockModes(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0084 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ all -> 0x0084 }
            android.security.keystore.KeyGenParameterSpec r0 = r0.build()     // Catch:{ all -> 0x0084 }
            r2.init(r0)     // Catch:{ all -> 0x0084 }
            r2.generateKey()     // Catch:{ all -> 0x0084 }
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            return r0
        L_0x007b:
            r1 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0082 }
            r0.<init>(r1)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C374819Ax.A00(java.lang.String):boolean");
    }

    public final C374839Az A01(String str) {
        C374839Az r3;
        try {
            synchronized (A00) {
                r3 = new C374839Az(C374829Ay.A00(str));
                byte[] A002 = AnonymousClass9B0.A00(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(A002, r3.AOH(r3.ASD(A002, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return r3;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
