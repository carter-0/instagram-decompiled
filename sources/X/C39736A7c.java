package X;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: X.A7c  reason: case insensitive filesystem */
public final class C39736A7c {
    public final C69371NkB A00;
    public final C391169sS A01;
    public final C391189sU A02;
    public final C391029sE A03;
    public final KeyPair A04;
    public final ECPrivateKey A05;
    public final ECPublicKey A06;

    /* JADX WARNING: type inference failed for: r1v36, types: [X.9uG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0241, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r1 = new java.security.KeyStoreException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0248, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0249, code lost:
        r1 = new java.security.KeyStoreException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1 = new java.security.KeyStoreException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0248 A[Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }, ExcHandler: IOException | GeneralSecurityException (r0v3 'e' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }]), Splitter:B:17:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d A[ExcHandler: IllegalArgumentException | SecurityException | GeneralSecurityException (r0v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:14:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39736A7c(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            r11.<init>()
            X.9uG r0 = X.C392129uG.A01
            if (r0 != 0) goto L_0x0020
            java.lang.Class<X.9uG> r3 = X.C392129uG.class
            monitor-enter(r3)
            X.9uG r0 = X.C392129uG.A01     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            X.9uG r1 = new X.9uG     // Catch:{ all -> 0x001d }
            r1.<init>()     // Catch:{ all -> 0x001d }
            android.content.Context r0 = r12.getApplicationContext()     // Catch:{ all -> 0x001d }
            r1.A00 = r0     // Catch:{ all -> 0x001d }
            X.C392129uG.A01 = r1     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r2
        L_0x0020:
            X.9uG r0 = X.C392129uG.A01
            r5 = 0
            android.content.Context r6 = r0.A00     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r7 = "_androidx_security_master_key_"
            r3 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r1.<init>(r7, r3)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r2 = 1
            java.lang.String r9 = "GCM"
            java.lang.String[] r0 = new java.lang.String[]{r9}     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setBlockModes(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r8 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r8}     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r1 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r1)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            android.security.keystore.KeyGenParameterSpec r4 = r0.build()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r6.getApplicationContext()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            boolean r0 = r7.equals(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 == 0) goto L_0x0100
            android.security.keystore.KeyGenParameterSpec r0 = X.C3737996y.A00     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            int r0 = r4.getKeySize()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 != r1) goto L_0x00ef
            java.lang.String[] r1 = r4.getBlockModes()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String[] r0 = new java.lang.String[]{r9}     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 == 0) goto L_0x00e0
            int r0 = r4.getPurposes()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 != r3) goto L_0x00d1
            java.lang.String[] r1 = r4.getEncryptionPaddings()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String[] r0 = new java.lang.String[]{r8}     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r4.isUserAuthenticationRequired()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 == 0) goto L_0x0096
            int r0 = r4.getUserAuthenticationValidityDurationSeconds()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 >= r2) goto L_0x0096
            java.lang.String r0 = "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
        L_0x0095:
            throw r2     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
        L_0x0096:
            java.lang.String r2 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r1)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r3 = 0
            r0.load(r3)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            boolean r0 = r0.containsAlias(r2)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)     // Catch:{ ProviderException -> 0x00b7, IOException | GeneralSecurityException -> 0x0248 }
            r0.init(r4)     // Catch:{ ProviderException -> 0x00b7, IOException | GeneralSecurityException -> 0x0248 }
            r0.generateKey()     // Catch:{ ProviderException -> 0x00b7, IOException | GeneralSecurityException -> 0x0248 }
            goto L_0x0111
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r2.<init>(r0, r1)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x00c2:
            java.lang.String r1 = "invalid padding mode, want NoPadding got "
            java.lang.String[] r0 = r4.getEncryptionPaddings()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TF.A0W(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x00d1:
            java.lang.String r1 = "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "
            int r0 = r4.getPurposes()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = X.002.A0O(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x00e0:
            java.lang.String r1 = "invalid block mode, want GCM got "
            java.lang.String[] r0 = r4.getBlockModes()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TF.A0W(r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x00ef:
            java.lang.String r2 = "invalid key size, want 256 bits got "
            int r1 = r4.getKeySize()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = " bits"
            java.lang.String r0 = X.002.A0c(r2, r0, r1)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x0100:
            java.lang.String r2 = "KeyGenParamSpec's key alias does not match provided alias ("
            java.lang.String r1 = " vs "
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = X.002.A0u(r2, r7, r1, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x0095
        L_0x0111:
            java.lang.String r0 = r4.getKeystoreAlias()     // Catch:{ IOException | GeneralSecurityException -> 0x0248, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            X.96z r2 = X.AnonymousClass96z.A00(r6, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0241, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d, IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = "pk_"
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r1 = r2.getString(r0, r3)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r0 = "sk_"
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            java.lang.String r4 = r2.getString(r0, r3)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            if (r1 == 0) goto L_0x024f
            if (r4 == 0) goto L_0x024f
            byte[] r1 = android.util.Base64.decode(r1, r5)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            r0.<init>(r1)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.security.PublicKey r2 = r3.generatePublic(r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            byte[] r1 = android.util.Base64.decode(r4, r5)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.security.spec.PKCS8EncodedKeySpec r0 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            r0.<init>(r1)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.security.PrivateKey r0 = r3.generatePrivate(r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            java.security.KeyPair r1 = new java.security.KeyPair     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            r1.<init>(r2, r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x023a }
            r11.A04 = r1
            java.security.PublicKey r0 = r1.getPublic()
            boolean r0 = r0 instanceof java.security.interfaces.ECPublicKey
            if (r0 == 0) goto L_0x022e
            java.security.PublicKey r0 = r1.getPublic()
            java.security.interfaces.ECPublicKey r0 = (java.security.interfaces.ECPublicKey) r0
            r11.A06 = r0
            java.security.spec.ECPoint r0 = r0.getW()
            X.C39865ACl.A00(r0)
            java.security.PrivateKey r0 = r1.getPrivate()
            boolean r0 = r0 instanceof java.security.interfaces.ECPrivateKey
            if (r0 == 0) goto L_0x0222
            java.security.PrivateKey r0 = r1.getPrivate()
            java.security.interfaces.ECPrivateKey r0 = (java.security.interfaces.ECPrivateKey) r0
            r11.A05 = r0
            r5 = 16
            long r1 = java.lang.Long.parseLong(r14, r5)     // Catch:{ Exception -> 0x0211 }
            r7 = 255(0xff, double:1.26E-321)
            r0 = 8
            long r3 = r1 >> r0
            long r7 = r7 & r3
            long r5 = r1 >> r5
            r9 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r9
            r0 = 32
            long r3 = r1 >> r0
            long r3 = r3 & r9
            r0 = 48
            long r1 = r1 >> r0
            long r1 = r1 & r9
            int r0 = (int) r7     // Catch:{ Exception -> 0x0211 }
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0211 }
            java.util.HashMap r7 = X.C391029sE.A01     // Catch:{ Exception -> 0x0211 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0211 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0211 }
            X.9sE r0 = (X.C391029sE) r0     // Catch:{ Exception -> 0x0211 }
            if (r0 == 0) goto L_0x01f9
            r11.A03 = r0     // Catch:{ Exception -> 0x0211 }
            int r0 = (int) r5     // Catch:{ Exception -> 0x0211 }
            java.util.HashMap r5 = X.C69371NkB.A04     // Catch:{ Exception -> 0x0211 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0211 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ Exception -> 0x0211 }
            X.NkB r0 = (X.C69371NkB) r0     // Catch:{ Exception -> 0x0211 }
            if (r0 == 0) goto L_0x01ed
            r11.A00 = r0     // Catch:{ Exception -> 0x0211 }
            int r0 = (int) r3     // Catch:{ Exception -> 0x0211 }
            java.util.HashMap r3 = X.C391189sU.A02     // Catch:{ Exception -> 0x0211 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0211 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x0211 }
            X.9sU r0 = (X.C391189sU) r0     // Catch:{ Exception -> 0x0211 }
            if (r0 == 0) goto L_0x0205
            r11.A02 = r0     // Catch:{ Exception -> 0x0211 }
            int r0 = (int) r1     // Catch:{ Exception -> 0x0211 }
            java.util.HashMap r1 = X.C391169sS.A02     // Catch:{ Exception -> 0x0211 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0211 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0211 }
            X.9sS r0 = (X.C391169sS) r0     // Catch:{ Exception -> 0x0211 }
            if (r0 == 0) goto L_0x01e1
            r11.A01 = r0     // Catch:{ Exception -> 0x0211 }
            return
        L_0x01e1:
            r0 = 203(0xcb, float:2.84E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ Exception -> 0x0211 }
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0211 }
            goto L_0x0210
        L_0x01ed:
            r0 = 478(0x1de, float:6.7E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ Exception -> 0x0211 }
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0211 }
            goto L_0x0210
        L_0x01f9:
            r0 = 479(0x1df, float:6.71E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ Exception -> 0x0211 }
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0211 }
            goto L_0x0210
        L_0x0205:
            r0 = 203(0xcb, float:2.84E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ Exception -> 0x0211 }
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException     // Catch:{ Exception -> 0x0211 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0211 }
        L_0x0210:
            throw r1     // Catch:{ Exception -> 0x0211 }
        L_0x0211:
            r1 = move-exception
            r0 = 557(0x22d, float:7.8E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r14)
            java.security.NoSuchAlgorithmException r2 = new java.security.NoSuchAlgorithmException
            r2.<init>(r0, r1)
            throw r2
        L_0x0222:
            r0 = 244(0xf4, float:3.42E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.security.KeyStoreException r0 = new java.security.KeyStoreException
            r0.<init>(r1)
            throw r0
        L_0x022e:
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.security.KeyStoreException r0 = new java.security.KeyStoreException
            r0.<init>(r1)
            throw r0
        L_0x023a:
            r0 = move-exception
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ NotFoundException -> 0x0264 }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x0264 }
            goto L_0x0263
        L_0x0241:
            r0 = move-exception
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x025c
        L_0x0248:
            r0 = move-exception
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            goto L_0x025c
        L_0x024f:
            java.lang.String r1 = "Key specified by keyAlias: "
            java.lang.String r0 = " does not exist in EncryptedSharedPreferences"
            java.lang.String r0 = X.002.A0g(r1, r13, r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
        L_0x025c:
            throw r1     // Catch:{ IllegalArgumentException | SecurityException | GeneralSecurityException -> 0x025d }
        L_0x025d:
            r0 = move-exception
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ NotFoundException -> 0x0264 }
            r1.<init>(r0)     // Catch:{ NotFoundException -> 0x0264 }
        L_0x0263:
            throw r1     // Catch:{ NotFoundException -> 0x0264 }
        L_0x0264:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39736A7c.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
