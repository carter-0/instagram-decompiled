package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.96S  reason: invalid class name */
public final class AnonymousClass96S {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r7 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.C9995Rkp.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3737396s A00(android.content.Context r12, X.C3737396s r13, boolean r14) {
        /*
            java.lang.String r5 = "FirebaseInstanceId"
            r11 = 3
            android.util.Log.isLoggable(r5, r11)
            java.util.Properties r10 = new java.util.Properties
            r10.<init>()
            java.security.KeyPair r3 = r13.A01
            java.security.PublicKey r0 = r3.getPublic()
            byte[] r0 = r0.getEncoded()
            r2 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)
            java.lang.String r0 = "pub"
            r10.setProperty(r0, r1)
            java.security.PrivateKey r0 = r3.getPrivate()
            byte[] r0 = r0.getEncoded()
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)
            java.lang.String r0 = "pri"
            r10.setProperty(r0, r1)
            long r0 = r13.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cre"
            r10.setProperty(r0, r1)
            java.io.File r1 = A04(r12)
            r4 = 0
            r1.createNewFile()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00a9 }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x00a9 }
            java.nio.channels.FileChannel r7 = r6.getChannel()     // Catch:{ all -> 0x009b }
            r7.lock()     // Catch:{ all -> 0x008b }
            r0 = 0
            if (r14 == 0) goto L_0x007a
            long r8 = r7.size()     // Catch:{ all -> 0x008b }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007a
            r7.position(r0)     // Catch:{ 9G4 | IOException -> 0x006c }
            X.96s r13 = A03(r7)     // Catch:{ 9G4 | IOException -> 0x006c }
            r7.close()     // Catch:{ all -> 0x009b }
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            return r13
        L_0x006c:
            r3 = move-exception
            boolean r2 = android.util.Log.isLoggable(r5, r11)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x008b }
            java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008b }
        L_0x007a:
            r7.position(r0)     // Catch:{ all -> 0x008b }
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r7)     // Catch:{ all -> 0x008b }
            r10.store(r0, r4)     // Catch:{ all -> 0x008b }
            r7.close()     // Catch:{ all -> 0x009b }
            r6.close()     // Catch:{ IOException -> 0x00a9 }
            return r13
        L_0x008b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x008d }
        L_0x008d:
            r2 = move-exception
            if (r7 == 0) goto L_0x009a
            r7.close()     // Catch:{ all -> 0x0094 }
            goto L_0x009a
        L_0x0094:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00     // Catch:{ all -> 0x009b }
            r0.A00(r3, r1)     // Catch:{ all -> 0x009b }
        L_0x009a:
            throw r2     // Catch:{ all -> 0x009b }
        L_0x009b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x009d }
        L_0x009d:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a8
        L_0x00a2:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00     // Catch:{ IOException -> 0x00a9 }
            r0.A00(r3, r1)     // Catch:{ IOException -> 0x00a9 }
        L_0x00a8:
            throw r2     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to write key: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96S.A00(android.content.Context, X.96s, boolean):X.96s");
    }

    public static C3737396s A01(SharedPreferences sharedPreferences) {
        long j;
        String string = sharedPreferences.getString(AnonymousClass96R.A00("|P|"), (String) null);
        String string2 = sharedPreferences.getString(AnonymousClass96R.A00("|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair A05 = A05(string, string2);
        String string3 = sharedPreferences.getString(AnonymousClass96R.A00("cre"), (String) null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C3737396s(A05, j);
        }
        j = 0;
        return new C3737396s(A05, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r5 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C9995Rkp.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        X.C9995Rkp.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3737396s A02(java.io.File r10) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r10)
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x002f }
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r5.lock(r6, r8, r10)     // Catch:{ all -> 0x001f }
            X.96s r0 = A03(r5)     // Catch:{ all -> 0x001f }
            r5.close()     // Catch:{ all -> 0x002f }
            r4.close()
            return r0
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r2 = move-exception
            if (r5 == 0) goto L_0x002e
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002e
        L_0x0028:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00     // Catch:{ all -> 0x002f }
            r0.A00(r3, r1)     // Catch:{ all -> 0x002f }
        L_0x002e:
            throw r2     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0036:
            r1 = move-exception
            X.RQz r0 = X.C9995Rkp.A00
            r0.A00(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96S.A02(java.io.File):X.96s");
    }

    public static C3737396s A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new Exception("Invalid properties file");
        }
        try {
            return new C3737396s(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new Exception(e);
        }
    }

    public static File A04(Context context) {
        String obj;
        if (TextUtils.isEmpty("")) {
            obj = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes(ReactWebViewManager.HTML_ENCODING), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                obj = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        return new File(noBackupFilesDir, obj);
    }

    public static KeyPair A05(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new Exception(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new Exception(e2);
        }
    }

    public static final void A06(Context context, C3737396s r5) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (r5.equals(A01(sharedPreferences))) {
                return;
            }
        } catch (AnonymousClass9G4 unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String A00 = AnonymousClass96R.A00("|P|");
        KeyPair keyPair = r5.A01;
        edit.putString(A00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(AnonymousClass96R.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(AnonymousClass96R.A00("cre"), String.valueOf(r5.A00));
        edit.commit();
    }

    public final C3737396s A07(Context context) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(C249703kE.FLAG_MOVED);
            C3737396s r4 = new C3737396s(instance.generateKeyPair(), System.currentTimeMillis());
            C3737396s A00 = A00(context, r4, true);
            if (A00 == null || A00.equals(r4)) {
                Log.isLoggable("FirebaseInstanceId", 3);
                A06(context, r4);
                return r4;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            return A00;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
