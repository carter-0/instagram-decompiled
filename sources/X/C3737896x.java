package X;

/* renamed from: X.96x  reason: invalid class name and case insensitive filesystem */
public abstract class C3737896x {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = new java.security.GeneralSecurityException(r2.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        throw new java.security.KeyStoreException(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010b A[ExcHandler: IOException | GeneralSecurityException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass96z A00(android.content.Context r8) {
        /*
            java.lang.String r6 = "_androidx_security_master_key_"
            r3 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r6, r3)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r2 = 1
            java.lang.String r7 = "GCM"
            java.lang.String[] r0 = new java.lang.String[]{r7}     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setBlockModes(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r5 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r5}     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r1)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            android.security.keystore.KeyGenParameterSpec r4 = r0.build()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r8.getApplicationContext()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 == 0) goto L_0x00e8
            android.security.keystore.KeyGenParameterSpec r0 = X.C3737996y.A00     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            int r0 = r4.getKeySize()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 != r1) goto L_0x00d6
            java.lang.String[] r1 = r4.getBlockModes()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String[] r0 = new java.lang.String[]{r7}     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 == 0) goto L_0x00c2
            int r0 = r4.getPurposes()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 != r3) goto L_0x00b2
            java.lang.String[] r1 = r4.getEncryptionPaddings()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String[] r0 = new java.lang.String[]{r5}     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 == 0) goto L_0x009e
            boolean r0 = r4.isUserAuthenticationRequired()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 == 0) goto L_0x0072
            int r0 = r4.getUserAuthenticationValidityDurationSeconds()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 >= r2) goto L_0x0072
            java.lang.String r0 = "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
        L_0x0071:
            throw r1     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
        L_0x0072:
            java.lang.String r3 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r2)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            boolean r0 = r1.containsAlias(r3)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r2)     // Catch:{ ProviderException -> 0x0093, IOException | GeneralSecurityException -> 0x010b }
            r0.init(r4)     // Catch:{ ProviderException -> 0x0093, IOException | GeneralSecurityException -> 0x010b }
            r0.generateKey()     // Catch:{ ProviderException -> 0x0093, IOException | GeneralSecurityException -> 0x010b }
            goto L_0x00fb
        L_0x0093:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0, r2)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x009e:
            java.lang.String r1 = "invalid padding mode, want NoPadding got "
            java.lang.String[] r0 = r4.getEncryptionPaddings()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x00b2:
            java.lang.String r1 = "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "
            int r0 = r4.getPurposes()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = X.002.A0O(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x00c2:
            java.lang.String r1 = "invalid block mode, want GCM got "
            java.lang.String[] r0 = r4.getBlockModes()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x00d6:
            java.lang.String r2 = "invalid key size, want 256 bits got "
            int r1 = r4.getKeySize()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = " bits"
            java.lang.String r0 = X.002.A0c(r2, r0, r1)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x00e8:
            java.lang.String r2 = "KeyGenParamSpec's key alias does not match provided alias ("
            java.lang.String r1 = " vs "
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.String r0 = X.002.A0u(r2, r6, r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            r1.<init>(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            goto L_0x0071
        L_0x00fb:
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x010b }
            X.96z r0 = X.AnonymousClass96z.A00(r8, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0104 }
            return r0
        L_0x0104:
            r1 = move-exception
            java.security.KeyStoreException r0 = new java.security.KeyStoreException
            r0.<init>(r1)
            throw r0
        L_0x010b:
            r1 = move-exception
            java.security.KeyStoreException r0 = new java.security.KeyStoreException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3737896x.A00(android.content.Context):X.96z");
    }
}
