package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.96R  reason: invalid class name */
public final class AnonymousClass96R {
    public final Context A00;
    public final SharedPreferences A01;
    public final AnonymousClass96S A02;
    public final Map A03 = new 01r(0);

    public final synchronized void A02() {
        this.A03.clear();
        Context context = this.A00;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        for (File file : noBackupFilesDir.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.96S] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        java.lang.String.valueOf(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass96R(android.content.Context r5) {
        /*
            r4 = this;
            X.96S r3 = new X.96S
            r3.<init>()
            java.lang.String r2 = "FirebaseInstanceId"
            r4.<init>()
            r1 = 0
            X.0yf r0 = new X.0yf
            r0.<init>(r1)
            r4.A03 = r0
            r4.A00 = r5
            java.lang.String r0 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r0, r1)
            r4.A01 = r0
            r4.A02 = r3
            java.io.File r3 = r5.getNoBackupFilesDir()
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0065
            boolean r0 = r1.createNewFile()     // Catch:{ IOException -> 0x0056 }
            if (r0 == 0) goto L_0x0065
            r1 = r4
            monitor-enter(r1)     // Catch:{ IOException -> 0x0056 }
            android.content.SharedPreferences r0 = r4.A01     // Catch:{ all -> 0x0053 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0053 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0053 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0056 }
            if (r0 != 0) goto L_0x0065
            r4.A02()     // Catch:{ IOException -> 0x0056 }
            X.95g r0 = X.C3734195g.A00()     // Catch:{ IOException -> 0x0056 }
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x0056 }
            r0.A06()     // Catch:{ IOException -> 0x0056 }
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0056 }
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r1.getMessage()
            java.lang.String.valueOf(r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96R.<init>(android.content.Context):void");
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf("").length() + 3 + String.valueOf(str).length());
        sb.append("");
        sb.append("|S|");
        sb.append(str);
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf("").length() + 4 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("");
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }
}
