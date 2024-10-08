package X;

import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.96z  reason: invalid class name */
public final class AnonymousClass96z implements SharedPreferences {
    public final SharedPreferences A00;
    public final AnonymousClass98Q A01;
    public final AnonymousClass97H A02;
    public final String A03 = "hpke_key_storage";
    public final CopyOnWriteArrayList A04;

    public AnonymousClass96z(SharedPreferences sharedPreferences, AnonymousClass98Q r5, AnonymousClass97H r6) {
        int A032 = AnonymousClass0fD.A03(-1851921766);
        this.A00 = sharedPreferences;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = new CopyOnWriteArrayList();
        AnonymousClass0fD.A0A(830691318, A032);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: X.9Az} */
    /* JADX WARNING: type inference failed for: r0v27, types: [X.9Ax, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.9Ax, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v46, types: [X.9Ax, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [X.9Ax, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|96|97) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:68|69|70|84|85) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0189 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01b5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4 A[SYNTHETIC, Splitter:B:45:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass96z A00(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r6 = "hpke_key_storage"
            com.google.crypto.tink.daead.DeterministicAeadConfig.A00()
            X.AnonymousClass98N.A00()
            android.content.Context r5 = r12.getApplicationContext()
            r8 = 0
            java.lang.String r0 = "AES256_SIV"
            X.9Au r10 = X.C374779At.A00(r0)
            java.lang.String r7 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            if (r5 == 0) goto L_0x01e3
            java.lang.String r3 = "android-keystore://"
            java.lang.String r11 = X.002.A0R(r3, r13)
            boolean r0 = r11.startsWith(r3)
            if (r0 == 0) goto L_0x01db
            java.lang.Object r12 = X.C374799Av.A00     // Catch:{ all -> 0x01d9 }
            monitor-enter(r12)     // Catch:{ all -> 0x01d9 }
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ all -> 0x01d6 }
            r4 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r4)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = r0.getString(r7, r8)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x01b6 }
            if (r0 != 0) goto L_0x0052
            java.lang.String r9 = "cannot use Android Keystore, it'll be disabled"
            X.9Ax r1 = new X.9Ax     // Catch:{ all -> 0x01d6 }
            r1.<init>()     // Catch:{ all -> 0x01d6 }
            boolean r0 = X.C374819Ax.A00(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x004a }
            X.9Az r9 = r1.A01(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x0045 }
            goto L_0x0085
        L_0x0045:
            r2 = move-exception
            if (r0 != 0) goto L_0x004b
            goto L_0x01c6
        L_0x004a:
            r2 = move-exception
        L_0x004b:
            java.lang.String r0 = "AndroidKeysetManager"
            android.util.Log.w(r0, r9, r2)     // Catch:{ all -> 0x01d6 }
            r9 = r8
            goto L_0x0085
        L_0x0052:
            byte[] r10 = X.C374809Aw.A01(r0)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x01b6 }
            X.9Ax r0 = new X.9Ax     // Catch:{ GeneralSecurityException | ProviderException -> 0x0078 }
            r0.<init>()     // Catch:{ GeneralSecurityException | ProviderException -> 0x0078 }
            X.9Az r2 = r0.A01(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x0078 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            r1.<init>(r10)     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            com.google.crypto.tink.BinaryKeysetReader r0 = new com.google.crypto.tink.BinaryKeysetReader     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            r0.<init>(r1)     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            X.9BV r0 = X.AnonymousClass9BV.A00(r2, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            X.9Cu r2 = X.C375239Cu.A00(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x0072 }
            goto L_0x00b8
        L_0x0072:
            r9 = move-exception
            X.9Cu r2 = X.C393249w8.A00(r10)     // Catch:{ IOException -> 0x01b5 }
            goto L_0x00b8
        L_0x0078:
            r9 = move-exception
            X.9Cu r2 = X.C393249w8.A00(r10)     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r1 = "AndroidKeysetManager"
            java.lang.String r0 = "cannot use Android Keystore, it'll be disabled"
            android.util.Log.w(r1, r0, r9)     // Catch:{ IOException -> 0x01b5 }
            goto L_0x00b8
        L_0x0085:
            X.97a r0 = X.C3738097a.DEFAULT_INSTANCE     // Catch:{ all -> 0x01d6 }
            X.9Cx r0 = r0.A0C()     // Catch:{ all -> 0x01d6 }
            X.9Cv r0 = (X.C375249Cv) r0     // Catch:{ all -> 0x01d6 }
            X.9Cu r2 = new X.9Cu     // Catch:{ all -> 0x01d6 }
            r2.<init>(r0)     // Catch:{ all -> 0x01d6 }
            r2.A03(r10)     // Catch:{ all -> 0x01d6 }
            X.9BV r0 = r2.A01()     // Catch:{ all -> 0x01d6 }
            X.97a r0 = r0.A01     // Catch:{ all -> 0x01d6 }
            X.98f r0 = X.C39842ABo.A00(r0)     // Catch:{ all -> 0x01d6 }
            X.978 r0 = r0.keyInfo_     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01d6 }
            X.98g r0 = (X.C3741298g) r0     // Catch:{ all -> 0x01d6 }
            int r0 = r0.keyId_     // Catch:{ all -> 0x01d6 }
            r2.A02(r0)     // Catch:{ all -> 0x01d6 }
            X.9D1 r1 = new X.9D1     // Catch:{ all -> 0x01d6 }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x01d6 }
            X.9BV r0 = r2.A01()     // Catch:{ all -> 0x01d6 }
            X.C374799Av.A00(r9, r0, r1)     // Catch:{ all -> 0x01d6 }
        L_0x00b8:
            X.9D1 r0 = new X.9D1     // Catch:{ all -> 0x01d6 }
            r0.<init>(r5, r7)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r12)     // Catch:{ all -> 0x01d6 }
            X.9BV r2 = r2.A01()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "AES256_GCM"
            X.9Au r10 = X.C374779At.A00(r0)
            java.lang.String r7 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            java.lang.String r11 = X.002.A0R(r3, r13)
            boolean r0 = r11.startsWith(r3)
            if (r0 == 0) goto L_0x01ad
            monitor-enter(r12)     // Catch:{ all -> 0x01d9 }
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ all -> 0x01aa }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r4)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r0.getString(r7, r8)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x018a }
            if (r0 != 0) goto L_0x00fa
            java.lang.String r9 = "cannot use Android Keystore, it'll be disabled"
            X.9Ax r1 = new X.9Ax     // Catch:{ all -> 0x01aa }
            r1.<init>()     // Catch:{ all -> 0x01aa }
            boolean r0 = X.C374819Ax.A00(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x00f8 }
            X.9Az r8 = r1.A01(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x00f3 }
            goto L_0x0132
        L_0x00f3:
            r3 = move-exception
            if (r0 != 0) goto L_0x012d
            goto L_0x019a
        L_0x00f8:
            r3 = move-exception
            goto L_0x012d
        L_0x00fa:
            byte[] r9 = X.C374809Aw.A01(r0)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x018a }
            X.9Ax r0 = new X.9Ax     // Catch:{ GeneralSecurityException | ProviderException -> 0x0120 }
            r0.<init>()     // Catch:{ GeneralSecurityException | ProviderException -> 0x0120 }
            X.9Az r3 = r0.A01(r11)     // Catch:{ GeneralSecurityException | ProviderException -> 0x0120 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            r1.<init>(r9)     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            com.google.crypto.tink.BinaryKeysetReader r0 = new com.google.crypto.tink.BinaryKeysetReader     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            r0.<init>(r1)     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            X.9BV r0 = X.AnonymousClass9BV.A00(r3, r0)     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            X.9Cu r3 = X.C375239Cu.A00(r0)     // Catch:{ IOException | GeneralSecurityException -> 0x011a }
            goto L_0x0165
        L_0x011a:
            r8 = move-exception
            X.9Cu r3 = X.C393249w8.A00(r9)     // Catch:{ IOException -> 0x0189 }
            goto L_0x0165
        L_0x0120:
            r8 = move-exception
            X.9Cu r3 = X.C393249w8.A00(r9)     // Catch:{ IOException -> 0x0189 }
            java.lang.String r1 = "AndroidKeysetManager"
            java.lang.String r0 = "cannot use Android Keystore, it'll be disabled"
            android.util.Log.w(r1, r0, r8)     // Catch:{ IOException -> 0x0189 }
            goto L_0x0165
        L_0x012d:
            java.lang.String r0 = "AndroidKeysetManager"
            android.util.Log.w(r0, r9, r3)     // Catch:{ all -> 0x01aa }
        L_0x0132:
            X.97a r0 = X.C3738097a.DEFAULT_INSTANCE     // Catch:{ all -> 0x01aa }
            X.9Cx r0 = r0.A0C()     // Catch:{ all -> 0x01aa }
            X.9Cv r0 = (X.C375249Cv) r0     // Catch:{ all -> 0x01aa }
            X.9Cu r3 = new X.9Cu     // Catch:{ all -> 0x01aa }
            r3.<init>(r0)     // Catch:{ all -> 0x01aa }
            r3.A03(r10)     // Catch:{ all -> 0x01aa }
            X.9BV r0 = r3.A01()     // Catch:{ all -> 0x01aa }
            X.97a r0 = r0.A01     // Catch:{ all -> 0x01aa }
            X.98f r0 = X.C39842ABo.A00(r0)     // Catch:{ all -> 0x01aa }
            X.978 r0 = r0.keyInfo_     // Catch:{ all -> 0x01aa }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01aa }
            X.98g r0 = (X.C3741298g) r0     // Catch:{ all -> 0x01aa }
            int r0 = r0.keyId_     // Catch:{ all -> 0x01aa }
            r3.A02(r0)     // Catch:{ all -> 0x01aa }
            X.9D1 r1 = new X.9D1     // Catch:{ all -> 0x01aa }
            r1.<init>(r5, r7)     // Catch:{ all -> 0x01aa }
            X.9BV r0 = r3.A01()     // Catch:{ all -> 0x01aa }
            X.C374799Av.A00(r8, r0, r1)     // Catch:{ all -> 0x01aa }
        L_0x0165:
            X.9D1 r0 = new X.9D1     // Catch:{ all -> 0x01aa }
            r0.<init>(r5, r7)     // Catch:{ all -> 0x01aa }
            monitor-exit(r12)     // Catch:{ all -> 0x01aa }
            X.9BV r1 = r3.A01()     // Catch:{ all -> 0x01d9 }
            java.lang.Class<X.97H> r0 = X.AnonymousClass97H.class
            java.lang.Object r3 = r2.A03(r0)
            X.97H r3 = (X.AnonymousClass97H) r3
            java.lang.Class<X.98Q> r0 = X.AnonymousClass98Q.class
            java.lang.Object r2 = r1.A03(r0)
            X.98Q r2 = (X.AnonymousClass98Q) r2
            android.content.SharedPreferences r1 = r5.getSharedPreferences(r6, r4)
            X.96z r0 = new X.96z
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0189:
            throw r8     // Catch:{ all -> 0x01aa }
        L_0x018a:
            java.lang.Object[] r1 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x01aa }
            java.io.CharConversionException r1 = new java.io.CharConversionException     // Catch:{ all -> 0x01aa }
            r1.<init>(r0)     // Catch:{ all -> 0x01aa }
            goto L_0x01a9
        L_0x019a:
            java.lang.Object[] r1 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "the master key %s exists but is unusable"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x01aa }
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ all -> 0x01aa }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x01aa }
        L_0x01a9:
            throw r1     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01aa }
            goto L_0x01d8
        L_0x01ad:
            java.lang.String r1 = "key URI must start with android-keystore://"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01b5:
            throw r9     // Catch:{ all -> 0x01d6 }
        L_0x01b6:
            java.lang.Object[] r1 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x01d6 }
            java.io.CharConversionException r1 = new java.io.CharConversionException     // Catch:{ all -> 0x01d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x01d5
        L_0x01c6:
            java.lang.Object[] r1 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "the master key %s exists but is unusable"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x01d6 }
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ all -> 0x01d6 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x01d6 }
        L_0x01d5:
            throw r1     // Catch:{ all -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01d6 }
        L_0x01d8:
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            throw r0
        L_0x01db:
            java.lang.String r1 = "key URI must start with android-keystore://"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            java.lang.String r1 = "need an Android context"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96z.A00(android.content.Context, java.lang.String):X.96z");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0135, code lost:
        X.AnonymousClass0fD.A0A(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0138, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object A01(java.lang.String r12) {
        /*
            r11 = this;
            r0 = -1744176116(0xffffffff9809fc0c, float:-1.7834086E-24)
            int r3 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r11.A03(r12)
            if (r0 != 0) goto L_0x0162
            java.lang.String r5 = "__NULL__"
            if (r12 != 0) goto L_0x0012
            r12 = r5
        L_0x0012:
            java.lang.String r6 = r11.A02(r12)     // Catch:{ GeneralSecurityException -> 0x014b }
            android.content.SharedPreferences r0 = r11.A00     // Catch:{ GeneralSecurityException -> 0x014b }
            r4 = 0
            java.lang.String r0 = r0.getString(r6, r4)     // Catch:{ GeneralSecurityException -> 0x014b }
            if (r0 != 0) goto L_0x0026
            r0 = 520924972(0x1f0caf2c, float:2.9791052E-20)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r4
        L_0x0026:
            r8 = 0
            byte[] r2 = X.C375539Dz.A01(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            X.98Q r1 = r11.A01     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ GeneralSecurityException -> 0x014b }
            byte[] r0 = r6.getBytes(r9)     // Catch:{ GeneralSecurityException -> 0x014b }
            byte[] r0 = r1.AOH(r2, r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r7.position(r8)     // Catch:{ GeneralSecurityException -> 0x014b }
            int r1 = r7.getInt()     // Catch:{ GeneralSecurityException -> 0x014b }
            if (r1 == 0) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x0048:
            r0 = 1
            if (r1 == r0) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 == r0) goto L_0x0061
            r0 = 4
            if (r1 == r0) goto L_0x005e
            r0 = 5
            if (r1 == r0) goto L_0x005b
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x0139
            goto L_0x006a
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x005e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x0061:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x0064:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x0067:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0058
        L_0x006a:
            int r0 = r0.intValue()     // Catch:{ GeneralSecurityException -> 0x014b }
            r10 = 1
            switch(r0) {
                case 0: goto L_0x0112;
                case 1: goto L_0x0097;
                case 2: goto L_0x0106;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00df;
                default: goto L_0x0072;
            }     // Catch:{ GeneralSecurityException -> 0x014b }
        L_0x0072:
            java.lang.String r1 = "Unhandled type for encrypted pref value: "
            switch(r0) {
                case 1: goto L_0x0083;
                case 2: goto L_0x0086;
                case 3: goto L_0x0089;
                case 4: goto L_0x008c;
                case 5: goto L_0x008f;
                default: goto L_0x0077;
            }     // Catch:{ GeneralSecurityException -> 0x014b }
        L_0x0077:
            java.lang.String r0 = "STRING"
        L_0x0079:
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ GeneralSecurityException -> 0x014b }
            r1.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x0092
        L_0x0083:
            java.lang.String r0 = "STRING_SET"
            goto L_0x0079
        L_0x0086:
            java.lang.String r0 = "INT"
            goto L_0x0079
        L_0x0089:
            java.lang.String r0 = "LONG"
            goto L_0x0079
        L_0x008c:
            java.lang.String r0 = "FLOAT"
            goto L_0x0079
        L_0x008f:
            java.lang.String r0 = "BOOLEAN"
            goto L_0x0079
        L_0x0092:
            r0 = 2072270220(0x7b84558c, float:1.3742366E36)
            goto L_0x0147
        L_0x0097:
            X.04u r6 = new X.04u     // Catch:{ GeneralSecurityException -> 0x014b }
            r6.<init>(r8)     // Catch:{ GeneralSecurityException -> 0x014b }
        L_0x009c:
            boolean r0 = r7.hasRemaining()     // Catch:{ GeneralSecurityException -> 0x014b }
            if (r0 == 0) goto L_0x00c1
            int r2 = r7.getInt()     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.ByteBuffer r1 = r7.slice()     // Catch:{ GeneralSecurityException -> 0x014b }
            r1.limit(r2)     // Catch:{ GeneralSecurityException -> 0x014b }
            int r0 = r7.position()     // Catch:{ GeneralSecurityException -> 0x014b }
            int r0 = r0 + r2
            r7.position(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.CharBuffer r0 = r9.decode(r1)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.String r0 = r0.toString()     // Catch:{ GeneralSecurityException -> 0x014b }
            r6.add(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            goto L_0x009c
        L_0x00c1:
            int r0 = r6.size()     // Catch:{ GeneralSecurityException -> 0x014b }
            if (r0 != r10) goto L_0x00d8
            java.lang.Object[] r0 = r6.A02     // Catch:{ GeneralSecurityException -> 0x014b }
            r0 = r0[r8]     // Catch:{ GeneralSecurityException -> 0x014b }
            boolean r1 = r5.equals(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r0 = 207521966(0xc5e88ae, float:1.7143388E-31)
            if (r1 == 0) goto L_0x00d8
            X.AnonymousClass0fD.A0A(r0, r3)
            return r4
        L_0x00d8:
            r0 = -5803314(0xffffffffffa772ce, float:NaN)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r6
        L_0x00df:
            byte r0 = r7.get()     // Catch:{ GeneralSecurityException -> 0x014b }
            if (r0 == 0) goto L_0x00e6
            r8 = 1
        L_0x00e6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ GeneralSecurityException -> 0x014b }
            r1 = 599770136(0x23bfc418, float:2.079131E-17)
            goto L_0x0135
        L_0x00ee:
            float r0 = r7.getFloat()     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r1 = 1857738525(0x6ebad71d, float:2.8912134E28)
            goto L_0x0135
        L_0x00fa:
            long r0 = r7.getLong()     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r1 = 1548779686(0x5c5080a6, float:2.34752982E17)
            goto L_0x0135
        L_0x0106:
            int r0 = r7.getInt()     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r1 = -1608400748(0xffffffffa021c094, float:-1.3700949E-19)
            goto L_0x0135
        L_0x0112:
            int r1 = r7.getInt()     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.ByteBuffer r0 = r7.slice()     // Catch:{ GeneralSecurityException -> 0x014b }
            r7.limit(r1)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.nio.CharBuffer r0 = r9.decode(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.String r2 = r0.toString()     // Catch:{ GeneralSecurityException -> 0x014b }
            boolean r0 = r2.equals(r5)     // Catch:{ GeneralSecurityException -> 0x014b }
            r1 = -1383811102(0xffffffffad84b7e2, float:-1.5088323E-11)
            if (r0 == 0) goto L_0x0135
            r0 = 983975180(0x3aa6450c, float:0.0012685372)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r4
        L_0x0135:
            X.AnonymousClass0fD.A0A(r1, r3)
            return r2
        L_0x0139:
            java.lang.String r0 = "Unknown type ID for encrypted pref value: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ GeneralSecurityException -> 0x014b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ GeneralSecurityException -> 0x014b }
            r1.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x014b }
            r0 = 97817828(0x5d494e4, float:1.9991078E-35)
        L_0x0147:
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ GeneralSecurityException -> 0x014b }
            throw r1     // Catch:{ GeneralSecurityException -> 0x014b }
        L_0x014b:
            r2 = move-exception
            java.lang.String r1 = "Could not decrypt value. "
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0, r2)
            r0 = -907744402(0xffffffffc9e4eb6e, float:-1875309.8)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0162:
            java.lang.String r0 = " is a reserved key for the encryption keyset."
            java.lang.String r0 = X.002.A0R(r12, r0)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            r0 = 118500844(0x7102dec, float:1.0846851E-34)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96z.A01(java.lang.String):java.lang.Object");
    }

    public final String A02(String str) {
        int A032 = AnonymousClass0fD.A03(-984523322);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String A002 = C375539Dz.A00(this.A02.ASE(str.getBytes(StandardCharsets.UTF_8), "hpke_key_storage".getBytes()));
            AnonymousClass0fD.A0A(1559495530, A032);
            return A002;
        } catch (GeneralSecurityException e) {
            SecurityException securityException = new SecurityException(002.A0R("Could not encrypt key. ", e.getMessage()), e);
            AnonymousClass0fD.A0A(2022963795, A032);
            throw securityException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if ("__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(r5) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.String r5) {
        /*
            r4 = this;
            r0 = -971340364(0xffffffffc61a85b4, float:-9889.426)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            boolean r2 = r0.equals(r5)
            r1 = 0
            r0 = -2103993837(0xffffffff82979a13, float:-2.227589E-37)
            if (r2 == 0) goto L_0x001f
        L_0x001b:
            r1 = 1
            r0 = 1609493432(0x5feeebb8, float:3.4432113E19)
        L_0x001f:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96z.A03(java.lang.String):boolean");
    }

    public final boolean contains(String str) {
        int A032 = AnonymousClass0fD.A03(72556438);
        if (!A03(str)) {
            boolean contains = this.A00.contains(A02(str));
            AnonymousClass0fD.A0A(767669160, A032);
            return contains;
        }
        SecurityException securityException = new SecurityException(002.A0R(str, " is a reserved key for the encryption keyset."));
        AnonymousClass0fD.A0A(812006849, A032);
        throw securityException;
    }

    public final SharedPreferences.Editor edit() {
        int A032 = AnonymousClass0fD.A03(1167497124);
        AL6 al6 = new AL6(this.A00.edit(), this);
        AnonymousClass0fD.A0A(-320757219, A032);
        return al6;
    }

    public final Map getAll() {
        int A032 = AnonymousClass0fD.A03(6185780);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.A00.getAll().entrySet()) {
            if (!A03((String) next.getKey())) {
                String str = (String) next.getKey();
                int A033 = AnonymousClass0fD.A03(-389898978);
                try {
                    String str2 = new String(this.A02.AOI(C375539Dz.A01(str), "hpke_key_storage".getBytes()), StandardCharsets.UTF_8);
                    if (str2.equals("__NULL__")) {
                        str2 = null;
                    }
                    AnonymousClass0fD.A0A(2069282356, A033);
                    hashMap.put(str2, A01(str2));
                } catch (GeneralSecurityException e) {
                    SecurityException securityException = new SecurityException(002.A0R("Could not decrypt key. ", e.getMessage()), e);
                    AnonymousClass0fD.A0A(2095253197, A033);
                    throw securityException;
                }
            }
        }
        AnonymousClass0fD.A0A(969624289, A032);
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        int A032 = AnonymousClass0fD.A03(-1421452866);
        Object A012 = A01(str);
        if (A012 != null && (A012 instanceof Boolean)) {
            z = ((Boolean) A012).booleanValue();
        }
        AnonymousClass0fD.A0A(-1092058375, A032);
        return z;
    }

    public final float getFloat(String str, float f) {
        int A032 = AnonymousClass0fD.A03(1603459862);
        Object A012 = A01(str);
        if (A012 != null && (A012 instanceof Float)) {
            f = ((Number) A012).floatValue();
        }
        AnonymousClass0fD.A0A(1347861230, A032);
        return f;
    }

    public final int getInt(String str, int i) {
        int A032 = AnonymousClass0fD.A03(-2117106430);
        Object A012 = A01(str);
        if (A012 != null && (A012 instanceof Integer)) {
            i = ((Number) A012).intValue();
        }
        AnonymousClass0fD.A0A(-2063711409, A032);
        return i;
    }

    public final long getLong(String str, long j) {
        int A032 = AnonymousClass0fD.A03(1574676678);
        Object A012 = A01(str);
        if (A012 != null && (A012 instanceof Long)) {
            j = ((Number) A012).longValue();
        }
        AnonymousClass0fD.A0A(-369074245, A032);
        return j;
    }

    public final String getString(String str, String str2) {
        int A032 = AnonymousClass0fD.A03(-363136516);
        Object A012 = A01(str);
        if (A012 != null && (A012 instanceof String)) {
            str2 = (String) A012;
        }
        AnonymousClass0fD.A0A(-1648736764, A032);
        return str2;
    }

    public final Set getStringSet(String str, Set set) {
        Set r1;
        int A032 = AnonymousClass0fD.A03(-1786496857);
        Object A012 = A01(str);
        if (A012 instanceof Set) {
            r1 = (Set) A012;
        } else {
            r1 = new 04u(0);
        }
        if (r1.size() > 0) {
            set = r1;
        }
        AnonymousClass0fD.A0A(-1979043509, A032);
        return set;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = AnonymousClass0fD.A03(-1369072202);
        this.A04.add(onSharedPreferenceChangeListener);
        AnonymousClass0fD.A0A(-1464660628, A032);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = AnonymousClass0fD.A03(1418184939);
        this.A04.remove(onSharedPreferenceChangeListener);
        AnonymousClass0fD.A0A(1053738293, A032);
    }
}
