package X;

import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.ArA  reason: case insensitive filesystem */
public final class C41271ArA implements Runnable {
    public final FirebaseInstanceId A00;
    public final long A01;
    public final PowerManager.WakeLock A02;
    public final AnonymousClass96X A03;

    /* JADX WARNING: type inference failed for: r0v62, types: [X.96h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v75, types: [X.96h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9WL, android.content.BroadcastReceiver] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0235, code lost:
        if (r6.startsWith(r0) == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0244, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r13.edit().putString("topic_operation_queue", r6.substring(A00(",", r15).length())).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r1.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025d, code lost:
        if (r7 == null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r7.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026d, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0275, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = A00("Topic sync failed: ", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0280, code lost:
        android.util.Log.e("FirebaseInstanceId", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0290, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r11 = r15.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012e, code lost:
        if (r11.length != 2) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        r7 = r11[0];
        r14 = r11[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r6 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013a, code lost:
        if (r6 == 83) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
        if (r6 != 85) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0146, code lost:
        if (r7.equals("U") == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0148, code lost:
        r6 = com.google.firebase.iid.FirebaseInstanceId.A00(X.AnonymousClass96P.A01(r17), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        if (r4.A08(r6) != false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0156, code lost:
        r12 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r11 = r6.A01;
        r7 = X.AnonymousClass7TE.A0a();
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        if (r6.length() == 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        r6 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0170, code lost:
        r7.putString("gcm.topic", r6);
        r7.putString("delete", com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        com.google.firebase.iid.FirebaseInstanceId.A01(X.AnonymousClass96T.A00(r7, r9, r12, r11, A00("/topics/", r14)).A02(new X.AW0(r9), r9.A04).A02(new java.lang.Object(), X.A25.A00), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019e, code lost:
        r6 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01aa, code lost:
        if (r7.equals("S") == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ac, code lost:
        r6 = com.google.firebase.iid.FirebaseInstanceId.A00(X.AnonymousClass96P.A01(r17), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b8, code lost:
        if (r4.A08(r6) != false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ba, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r12 = r6.A01;
        r11 = X.AnonymousClass7TE.A0a();
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ce, code lost:
        if (r6.length() == 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d0, code lost:
        r6 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d4, code lost:
        r11.putString("gcm.topic", r6);
        com.google.firebase.iid.FirebaseInstanceId.A01(X.AnonymousClass96T.A00(r11, r9, r13, r12, A00("/topics/", r14)).A02(new X.AW0(r9), r9.A04).A02(new java.lang.Object(), X.A25.A00), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fa, code lost:
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ff, code lost:
        r6 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r7 = (X.C365498nD) r1.A02.remove(java.lang.Integer.valueOf(r1.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r11 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0216, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r13 = r11.A01;
        r6 = r13.getString("topic_operation_queue", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r0 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022b, code lost:
        if (r0.length() == 0) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022d, code lost:
        r0 = ",".concat(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r3 = r18
            X.PyW r1 = X.PyW.A00()     // Catch:{ all -> 0x02b0 }
            com.google.firebase.iid.FirebaseInstanceId r4 = r3.A00     // Catch:{ all -> 0x02b0 }
            X.95g r0 = r4.A02     // Catch:{ all -> 0x02b0 }
            r17 = r0
            X.C3734195g.A01(r17)     // Catch:{ all -> 0x02b0 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x02b0 }
            boolean r0 = r1.A01(r2)     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x001c
            android.os.PowerManager$WakeLock r0 = r3.A02     // Catch:{ all -> 0x02b0 }
            X.C60270fk.A00(r0)     // Catch:{ all -> 0x02b0 }
        L_0x001c:
            r0 = 1
            monitor-enter(r4)     // Catch:{ all -> 0x02b0 }
            r4.A01 = r0     // Catch:{ all -> 0x02ad }
            monitor-exit(r4)     // Catch:{ all -> 0x02b0 }
            X.96T r9 = r4.A00     // Catch:{ all -> 0x02b0 }
            X.96P r0 = r9.A01     // Catch:{ all -> 0x02b0 }
            int r0 = r0.A03()     // Catch:{ all -> 0x02b0 }
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0296
            X.PyW r5 = X.PyW.A00()     // Catch:{ all -> 0x02b0 }
            X.C3734195g.A01(r17)     // Catch:{ all -> 0x02b0 }
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x02b0 }
            if (r0 != 0) goto L_0x004f
            r0 = 75
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x02b0 }
            int r0 = r2.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x02b0 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02b0 }
            r5.A01 = r0     // Catch:{ all -> 0x02b0 }
        L_0x004f:
            java.lang.Boolean r0 = r5.A00     // Catch:{ all -> 0x02b0 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02b0 }
            if (r0 != 0) goto L_0x005d
            r1 = 3
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x02b0 }
        L_0x005d:
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x02b0 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x00aa
            X.C3734195g.A01(r17)     // Catch:{ all -> 0x02b0 }
            r0 = 567(0x237, float:7.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x02b0 }
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x02b0 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x0082
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x02b0 }
            if (r0 != 0) goto L_0x00aa
        L_0x0082:
            X.9WL r4 = new X.9WL     // Catch:{ all -> 0x02b0 }
            r4.<init>()     // Catch:{ all -> 0x02b0 }
            r4.A00 = r3     // Catch:{ all -> 0x02b0 }
            java.lang.String r1 = "FirebaseInstanceId"
            r0 = 3
            android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x02b0 }
            r0 = 2601(0xa29, float:3.645E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x02b0 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x02b0 }
            r1.<init>(r0)     // Catch:{ all -> 0x02b0 }
            X.ArA r0 = r4.A00     // Catch:{ all -> 0x02b0 }
            com.google.firebase.iid.FirebaseInstanceId r0 = r0.A00     // Catch:{ all -> 0x02b0 }
            X.95g r0 = r0.A02     // Catch:{ all -> 0x02b0 }
            X.C3734195g.A01(r0)     // Catch:{ all -> 0x02b0 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x02b0 }
            r0.registerReceiver(r4, r1)     // Catch:{ all -> 0x02b0 }
            goto L_0x029a
        L_0x00aa:
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = X.AnonymousClass96P.A01(r17)     // Catch:{ all -> 0x02b0 }
            java.lang.String r10 = "*"
            X.96f r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r10)     // Catch:{ all -> 0x02b0 }
            boolean r0 = r4.A08(r6)     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = X.AnonymousClass96P.A01(r17)     // Catch:{ IOException | SecurityException -> 0x0107 }
            java.lang.String r1 = r4.A05(r0, r10)     // Catch:{ IOException | SecurityException -> 0x0107 }
            if (r1 != 0) goto L_0x00cd
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r5, r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            goto L_0x0283
        L_0x00cd:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            if (r6 == 0) goto L_0x00db
            java.lang.String r0 = r6.A01     // Catch:{ IOException | SecurityException -> 0x0107 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            if (r0 != 0) goto L_0x0114
        L_0x00db:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            android.content.Intent r7 = new android.content.Intent     // Catch:{ IOException | SecurityException -> 0x0107 }
            r7.<init>(r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            java.lang.String r0 = "token"
            r7.putExtra(r0, r1)     // Catch:{ IOException | SecurityException -> 0x0107 }
            X.C3734195g.A01(r17)     // Catch:{ IOException | SecurityException -> 0x0107 }
            r0 = 201(0xc9, float:2.82E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r6 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IOException | SecurityException -> 0x0107 }
            r1.<init>(r2, r6)     // Catch:{ IOException | SecurityException -> 0x0107 }
            r1.setAction(r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            r0 = 933(0x3a5, float:1.307E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException | SecurityException -> 0x0107 }
            r1.putExtra(r0, r7)     // Catch:{ IOException | SecurityException -> 0x0107 }
            r2.sendBroadcast(r1)     // Catch:{ IOException | SecurityException -> 0x0107 }
            goto L_0x0114
        L_0x0107:
            r0 = move-exception
            java.lang.String r1 = "Token retrieval failed: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ all -> 0x02b0 }
            goto L_0x0280
        L_0x0114:
            X.96X r1 = r3.A03     // Catch:{ all -> 0x02b0 }
        L_0x0116:
            monitor-enter(r1)     // Catch:{ all -> 0x02b0 }
            java.lang.String r15 = X.AnonymousClass96X.A00(r1)     // Catch:{ all -> 0x0293 }
            r12 = 1
            if (r15 != 0) goto L_0x0125
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0293 }
            monitor-exit(r1)     // Catch:{ all -> 0x0293 }
            goto L_0x0296
        L_0x0125:
            monitor-exit(r1)     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = "!"
            java.lang.String[] r11 = r15.split(r0)     // Catch:{ all -> 0x02b0 }
            int r6 = r11.length     // Catch:{ all -> 0x02b0 }
            r0 = 2
            if (r6 != r0) goto L_0x0205
            r7 = r11[r8]     // Catch:{ all -> 0x02b0 }
            r14 = r11[r12]     // Catch:{ all -> 0x02b0 }
            int r6 = r7.hashCode()     // Catch:{ IOException -> 0x0275 }
            r0 = 83
            if (r6 == r0) goto L_0x01a4
            r0 = 85
            if (r6 != r0) goto L_0x0205
            java.lang.String r0 = "U"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x0275 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = X.AnonymousClass96P.A01(r17)     // Catch:{ IOException -> 0x0275 }
            X.96f r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r10)     // Catch:{ IOException -> 0x0275 }
            boolean r0 = r4.A08(r6)     // Catch:{ IOException -> 0x0275 }
            if (r0 != 0) goto L_0x026d
            java.lang.String r12 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r11 = r6.A01     // Catch:{ IOException -> 0x0275 }
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0275 }
            int r0 = r6.length()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r13 = "/topics/"
            if (r0 == 0) goto L_0x019e
            java.lang.String r6 = r13.concat(r6)     // Catch:{ IOException -> 0x0275 }
        L_0x0170:
            java.lang.String r0 = "gcm.topic"
            r7.putString(r0, r6)     // Catch:{ IOException -> 0x0275 }
            java.lang.String r6 = "delete"
            java.lang.String r0 = "1"
            r7.putString(r6, r0)     // Catch:{ IOException -> 0x0275 }
            java.lang.String r0 = A00(r13, r14)     // Catch:{ IOException -> 0x0275 }
            X.9GD r7 = X.AnonymousClass96T.A00(r7, r9, r12, r11, r0)     // Catch:{ IOException -> 0x0275 }
            java.util.concurrent.Executor r6 = r9.A04     // Catch:{ IOException -> 0x0275 }
            X.AW0 r0 = new X.AW0     // Catch:{ IOException -> 0x0275 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0275 }
            X.9GD r7 = r7.A02(r0, r6)     // Catch:{ IOException -> 0x0275 }
            java.util.concurrent.Executor r6 = X.A25.A00     // Catch:{ IOException -> 0x0275 }
            X.AVz r0 = new X.AVz     // Catch:{ IOException -> 0x0275 }
            r0.<init>()     // Catch:{ IOException -> 0x0275 }
            X.9GD r0 = r7.A02(r0, r6)     // Catch:{ IOException -> 0x0275 }
            com.google.firebase.iid.FirebaseInstanceId.A01(r0, r4)     // Catch:{ IOException -> 0x0275 }
            goto L_0x01fa
        L_0x019e:
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0275 }
            r6.<init>(r13)     // Catch:{ IOException -> 0x0275 }
            goto L_0x0170
        L_0x01a4:
            java.lang.String r0 = "S"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x0275 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = X.AnonymousClass96P.A01(r17)     // Catch:{ IOException -> 0x0275 }
            X.96f r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r10)     // Catch:{ IOException -> 0x0275 }
            boolean r0 = r4.A08(r6)     // Catch:{ IOException -> 0x0275 }
            if (r0 != 0) goto L_0x0265
            java.lang.String r13 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r12 = r6.A01     // Catch:{ IOException -> 0x0275 }
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0275 }
            int r0 = r6.length()     // Catch:{ IOException -> 0x0275 }
            java.lang.String r7 = "/topics/"
            if (r0 == 0) goto L_0x01ff
            java.lang.String r6 = r7.concat(r6)     // Catch:{ IOException -> 0x0275 }
        L_0x01d4:
            java.lang.String r0 = "gcm.topic"
            r11.putString(r0, r6)     // Catch:{ IOException -> 0x0275 }
            java.lang.String r0 = A00(r7, r14)     // Catch:{ IOException -> 0x0275 }
            X.9GD r7 = X.AnonymousClass96T.A00(r11, r9, r13, r12, r0)     // Catch:{ IOException -> 0x0275 }
            java.util.concurrent.Executor r6 = r9.A04     // Catch:{ IOException -> 0x0275 }
            X.AW0 r0 = new X.AW0     // Catch:{ IOException -> 0x0275 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0275 }
            X.9GD r7 = r7.A02(r0, r6)     // Catch:{ IOException -> 0x0275 }
            java.util.concurrent.Executor r6 = X.A25.A00     // Catch:{ IOException -> 0x0275 }
            X.AVz r0 = new X.AVz     // Catch:{ IOException -> 0x0275 }
            r0.<init>()     // Catch:{ IOException -> 0x0275 }
            X.9GD r0 = r7.A02(r0, r6)     // Catch:{ IOException -> 0x0275 }
            com.google.firebase.iid.FirebaseInstanceId.A01(r0, r4)     // Catch:{ IOException -> 0x0275 }
        L_0x01fa:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ IOException -> 0x0275 }
            goto L_0x0205
        L_0x01ff:
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0275 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0275 }
            goto L_0x01d4
        L_0x0205:
            monitor-enter(r1)     // Catch:{ all -> 0x02b0 }
            java.util.Map r6 = r1.A02     // Catch:{ all -> 0x0290 }
            int r0 = r1.A00     // Catch:{ all -> 0x0290 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0290 }
            java.lang.Object r7 = r6.remove(r0)     // Catch:{ all -> 0x0290 }
            X.8nD r7 = (X.C365498nD) r7     // Catch:{ all -> 0x0290 }
            X.96R r11 = r1.A01     // Catch:{ all -> 0x028e }
            monitor-enter(r11)     // Catch:{ all -> 0x028e }
            android.content.SharedPreferences r13 = r11.A01     // Catch:{ all -> 0x0289 }
            java.lang.String r12 = "topic_operation_queue"
            java.lang.String r0 = ""
            java.lang.String r6 = r13.getString(r12, r0)     // Catch:{ all -> 0x0289 }
            java.lang.String r14 = ","
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x028b }
            int r16 = r0.length()     // Catch:{ all -> 0x028b }
            if (r16 == 0) goto L_0x0244
            java.lang.String r0 = r14.concat(r0)     // Catch:{ all -> 0x028b }
        L_0x0231:
            boolean r0 = r6.startsWith(r0)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = A00(r14, r15)     // Catch:{ all -> 0x028b }
            int r0 = r0.length()     // Catch:{ all -> 0x028b }
            java.lang.String r6 = r6.substring(r0)     // Catch:{ all -> 0x028b }
            goto L_0x024a
        L_0x0244:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x028b }
            r0.<init>(r14)     // Catch:{ all -> 0x028b }
            goto L_0x0231
        L_0x024a:
            android.content.SharedPreferences$Editor r0 = r13.edit()     // Catch:{ all -> 0x0289 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r12, r6)     // Catch:{ all -> 0x0289 }
            r0.apply()     // Catch:{ all -> 0x0289 }
        L_0x0255:
            monitor-exit(r11)     // Catch:{ all -> 0x028b }
            int r0 = r1.A00     // Catch:{ all -> 0x0290 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0290 }
            monitor-exit(r1)     // Catch:{ all -> 0x0290 }
            if (r7 == 0) goto L_0x0116
            r0 = 0
            r7.A01(r0)     // Catch:{ all -> 0x02b0 }
            goto L_0x0116
        L_0x0265:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0275 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0275 }
            goto L_0x0274
        L_0x026d:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0275 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0275 }
        L_0x0274:
            throw r1     // Catch:{ IOException -> 0x0275 }
        L_0x0275:
            r0 = move-exception
            java.lang.String r1 = "Topic sync failed: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ all -> 0x02b0 }
        L_0x0280:
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x02b0 }
        L_0x0283:
            long r0 = r3.A01     // Catch:{ all -> 0x02b0 }
            r4.A07(r0)     // Catch:{ all -> 0x02b0 }
            goto L_0x029a
        L_0x0289:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x028b }
        L_0x028b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x028b }
            throw r0     // Catch:{ all -> 0x028e }
        L_0x028e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0290 }
        L_0x0290:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0290 }
            goto L_0x02af
        L_0x0293:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0293 }
            goto L_0x02af
        L_0x0296:
            monitor-enter(r4)     // Catch:{ all -> 0x02b0 }
            r4.A01 = r8     // Catch:{ all -> 0x02ad }
            monitor-exit(r4)     // Catch:{ all -> 0x02b0 }
        L_0x029a:
            X.PyW r0 = X.PyW.A00()
            X.C3734195g.A01(r17)
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x02ac
            android.os.PowerManager$WakeLock r0 = r3.A02
            X.C60270fk.A01(r0)
        L_0x02ac:
            return
        L_0x02ad:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02b0 }
        L_0x02af:
            throw r0     // Catch:{ all -> 0x02b0 }
        L_0x02b0:
            r2 = move-exception
            X.PyW r1 = X.PyW.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = r3.A00
            X.95g r0 = r0.A02
            X.C3734195g.A01(r0)
            android.content.Context r0 = r0.A00
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x02c9
            android.os.PowerManager$WakeLock r0 = r3.A02
            X.C60270fk.A01(r0)
        L_0x02c9:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41271ArA.run():void");
    }

    public C41271ArA(FirebaseInstanceId firebaseInstanceId, AnonymousClass96X r5, long j) {
        this.A00 = firebaseInstanceId;
        this.A03 = r5;
        this.A01 = j;
        C3734195g r0 = firebaseInstanceId.A02;
        C3734195g.A01(r0);
        PowerManager.WakeLock newWakeLock = ((PowerManager) r0.A00.getSystemService("power")).newWakeLock(1, "fiid-sync");
        0BX.A02(newWakeLock, "fiid-sync");
        this.A02 = newWakeLock;
        C60270fk.A02(newWakeLock);
    }

    public static String A00(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }
}
