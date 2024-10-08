package X;

/* renamed from: X.96v  reason: invalid class name and case insensitive filesystem */
public abstract class C3737696v {
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01aa, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ab, code lost:
        X.0wb.A02(X.0kg.A09, "PushNotificationManager_hpke_error", "Error while registering token with HPKE encryption paramaters", r10);
        r3 = new android.content.Intent(r8, com.instagram.notifications.push.IgPushRegistrationService.class);
        r3.putExtra("PushRegistrationService.GUID", X.0qv.A02.A05(r8));
        r3.putExtra("PushRegistrationService.DEVICE_TOKEN", r7);
        r3.putExtra("PushRegistrationService.PUSH_DEVICE_TYPE", r1);
        r3.putExtra("PushRegistrationService.PUSH_CHANNEL_TYPE", r1.A01);
        r3.putExtra("PushRegistrationService.IS_MAIN_PUSH_CHANNEL", r6);
        r3.putExtra("PushRegistrationService.PUSH_DEVICE_SUB_TYPE", r5);
        r3.putExtra("PushRegistrationService.USER_ID", r4);
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ed, code lost:
        if ((r2 instanceof com.instagram.common.session.UserSession) != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ef, code lost:
        r1 = X.AnonymousClass0BO.A00(r2).BNy((java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fa, code lost:
        r3.putExtra("PushRegistrationService.LOGGED_IN_USERS", X.C239023El.A00(',').A02(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0209, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0196 A[Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01aa A[ExcHandler: NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException (r10v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0015] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Context r11, com.instagram.common.notifications.push.intf.PushChannelType r12, X.0lg r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18) {
        /*
            r5 = r17
            r6 = r18
            r4 = r15
            r7 = r14
            r2 = r13
            r1 = r12
            r8 = r11
            X.96w r9 = X.C3737796w.A00(r11)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r10 = "HPKE_CLIENT_KEYPAIR"
            java.security.KeyPair r15 = r9.A01(r10)     // Catch:{ NotFoundException -> 0x0015, NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa, NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa, NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa, NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            goto L_0x00b1
        L_0x0015:
            java.math.BigInteger r0 = X.AnonymousClass9E6.A01     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "EC"
            java.security.KeyPairGenerator r11 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            if (r11 == 0) goto L_0x0196
            java.lang.String r3 = "secp256r1"
            java.security.spec.ECGenParameterSpec r0 = new java.security.spec.ECGenParameterSpec     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r0.<init>(r3)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r11.initialize(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.KeyPair r15 = r11.generateKeyPair()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            monitor-enter(r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            android.content.Context r0 = r9.A00     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            X.96z r3 = X.C3737896x.A00(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            java.lang.String r14 = "pk_"
            java.lang.String r0 = X.002.A0R(r14, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            boolean r0 = r3.contains(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r12 = "sk_"
            java.lang.String r0 = X.002.A0R(r12, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            boolean r0 = r3.contains(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
            if (r0 != 0) goto L_0x00ac
            android.content.Context r0 = r9.A00     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            X.96z r3 = X.C3737896x.A00(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.lang.String r0 = X.002.A0R(r14, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            boolean r0 = r3.contains(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = X.002.A0R(r12, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            boolean r0 = r3.contains(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            if (r0 != 0) goto L_0x009b
            java.security.PublicKey r0 = r15.getPublic()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.security.interfaces.ECPublicKey r0 = (java.security.interfaces.ECPublicKey) r0     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            r11 = 0
            java.lang.String r13 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.security.PrivateKey r0 = r15.getPrivate()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.security.interfaces.ECPrivateKey r0 = (java.security.interfaces.ECPrivateKey) r0     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.lang.String r11 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.lang.String r0 = X.002.A0R(r14, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r13)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            java.lang.String r0 = X.002.A0R(r12, r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r11)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            r0.apply()     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            goto L_0x00b0
        L_0x009b:
            java.lang.String r3 = "KeyAlias already exists in store. The entry must be explicitly deleted before overwriting it."
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
            throw r0     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x00a3 }
        L_0x00a3:
            r3 = move-exception
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ all -> 0x00aa }
            r0.<init>(r3)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            throw r0     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
        L_0x00ac:
            java.security.KeyPair r15 = r9.A01(r10)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x018c }
        L_0x00b0:
            monitor-exit(r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
        L_0x00b1:
            java.security.PublicKey r0 = r15.getPublic()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            boolean r0 = r0 instanceof java.security.interfaces.ECPublicKey     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            if (r0 == 0) goto L_0x0180
            java.security.PublicKey r0 = r15.getPublic()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.interfaces.ECPublicKey r0 = (java.security.interfaces.ECPublicKey) r0     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.spec.ECPoint r0 = r0.getW()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            X.AnonymousClass9E6.A00(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.PrivateKey r0 = r15.getPrivate()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            boolean r0 = r0 instanceof java.security.interfaces.ECPrivateKey     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            if (r0 == 0) goto L_0x019e
            kotlin.enums.EnumEntries r0 = X.AnonymousClass9E7.A02     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            kotlin.enums.EnumEntries r0 = X.AnonymousClass9E8.A03     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            kotlin.enums.EnumEntries r0 = X.AnonymousClass9E9.A03     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            kotlin.enums.EnumEntries r0 = X.AnonymousClass9EA.A04     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.Class<com.instagram.notifications.push.IgPushRegistrationService> r0 = com.instagram.notifications.push.IgPushRegistrationService.class
            android.content.Intent r3 = new android.content.Intent     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r3.<init>(r8, r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            X.0qv r0 = X.0qv.A02     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r9 = r0.A05(r8)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.GUID"
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.DEVICE_TOKEN"
            r3.putExtra(r0, r7)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_TYPE"
            r3.putExtra(r0, r1)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r9 = r1.A01     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.PUSH_CHANNEL_TYPE"
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.IS_MAIN_PUSH_CHANNEL"
            r3.putExtra(r0, r6)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_SUB_TYPE"
            r3.putExtra(r0, r5)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.USER_ID"
            r3.putExtra(r0, r4)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.TRIGGER"
            r9 = r16
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.PublicKey r0 = r15.getPublic()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            boolean r0 = r0 instanceof java.security.interfaces.ECPublicKey     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            if (r0 == 0) goto L_0x0178
            java.security.PublicKey r0 = r15.getPublic()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.interfaces.ECPublicKey r0 = (java.security.interfaces.ECPublicKey) r0     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.spec.ECPoint r0 = r0.getW()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            byte[] r9 = X.AnonymousClass9E6.A01(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r0 = 2
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.HPKE_CLIENT_PUBLIC_KEY"
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.HPKE_CLIENT_KEYSTORE_ID"
            r3.putExtra(r0, r10)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r15 = 1
            r0 = 48
            long r15 = r15 << r0
            r13 = 16
            r0 = 32
            long r13 = r13 << r0
            r11 = 1
            r0 = 16
            long r11 = r11 << r0
            r9 = 0
            r0 = 8
            long r9 = r9 << r0
            long r15 = r15 + r13
            long r15 = r15 + r11
            long r15 = r15 + r9
            java.lang.String r9 = java.lang.Long.toHexString(r15)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.HPKE_CIPHERSUITE"
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r9.<init>()     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            if (r0 == 0) goto L_0x0168
            X.0BQ r9 = X.AnonymousClass0BO.A00(r2)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            X.0tB r9 = (X.0tB) r9     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r0 = 0
            java.util.List r9 = r9.BNy(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
        L_0x0168:
            r0 = 44
            X.3El r0 = X.C239023El.A00(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r9 = r0.A02(r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.lang.String r0 = "PushRegistrationService.LOGGED_IN_USERS"
            r3.putExtra(r0, r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            return r3
        L_0x0178:
            java.lang.String r0 = "Non-EC keys are not supported for encoding"
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r3.<init>(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            goto L_0x01a9
        L_0x0180:
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.KeyStoreException r3 = new java.security.KeyStoreException     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r3.<init>(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            goto L_0x01a9
        L_0x018c:
            r3 = move-exception
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ all -> 0x0193 }
            r0.<init>(r3)     // Catch:{ all -> 0x0193 }
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            goto L_0x01a9
        L_0x0196:
            java.lang.String r0 = "Could not get instance of KeyPairGenerator for algorithm EC."
            java.security.NoSuchAlgorithmException r3 = new java.security.NoSuchAlgorithmException     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r3.<init>(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            goto L_0x01a9
        L_0x019e:
            r0 = 244(0xf4, float:3.42E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            java.security.KeyStoreException r3 = new java.security.KeyStoreException     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
            r3.<init>(r0)     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
        L_0x01a9:
            throw r3     // Catch:{ NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException -> 0x01aa }
        L_0x01aa:
            r10 = move-exception
            X.0kg r9 = X.0kg.A09
            java.lang.String r3 = "PushNotificationManager_hpke_error"
            java.lang.String r0 = "Error while registering token with HPKE encryption paramaters"
            X.0wb.A02(r9, r3, r0, r10)
            java.lang.Class<com.instagram.notifications.push.IgPushRegistrationService> r0 = com.instagram.notifications.push.IgPushRegistrationService.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8, r0)
            X.0qv r0 = X.0qv.A02
            java.lang.String r8 = r0.A05(r8)
            java.lang.String r0 = "PushRegistrationService.GUID"
            r3.putExtra(r0, r8)
            java.lang.String r0 = "PushRegistrationService.DEVICE_TOKEN"
            r3.putExtra(r0, r7)
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_TYPE"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "PushRegistrationService.PUSH_CHANNEL_TYPE"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "PushRegistrationService.IS_MAIN_PUSH_CHANNEL"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_SUB_TYPE"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "PushRegistrationService.USER_ID"
            r3.putExtra(r0, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x01fa
            X.0BQ r1 = X.AnonymousClass0BO.A00(r2)
            X.0tB r1 = (X.0tB) r1
            r0 = 0
            java.util.List r1 = r1.BNy(r0)
        L_0x01fa:
            r0 = 44
            X.3El r0 = X.C239023El.A00(r0)
            java.lang.String r1 = r0.A02(r1)
            java.lang.String r0 = "PushRegistrationService.LOGGED_IN_USERS"
            r3.putExtra(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3737696v.A00(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, X.0lg, java.lang.String, java.lang.String, java.lang.String, int, boolean):android.content.Intent");
    }
}
