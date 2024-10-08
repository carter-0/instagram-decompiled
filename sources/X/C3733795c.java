package X;

/* renamed from: X.95c  reason: invalid class name and case insensitive filesystem */
public final class C3733795c extends 0ng {
    public final /* synthetic */ AnonymousClass3R1 A00;
    public final /* synthetic */ C3733895d A01;
    public final /* synthetic */ Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3733795c(AnonymousClass3R1 r4, C3733895d r5, Integer num) {
        super(54, 3, true, true);
        this.A00 = r4;
        this.A02 = num;
        this.A01 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.3R1 r3 = r13.A00
            java.lang.Integer r0 = r13.A02
            java.lang.String r10 = X.C3733595a.A00(r0)
            r11 = 0
            X.0eM r0 = r3.A02     // Catch:{ IOException -> 0x009a }
            java.lang.Object r2 = r0.getValue()     // Catch:{ IOException -> 0x009a }
            com.google.firebase.iid.FirebaseInstanceId r2 = (com.google.firebase.iid.FirebaseInstanceId) r2     // Catch:{ IOException -> 0x009a }
            if (r2 == 0) goto L_0x008c
            X.0eM r0 = r3.A03     // Catch:{ IOException -> 0x009a }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException -> 0x009a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "FCM"
            java.lang.String r9 = r2.A05(r1, r0)     // Catch:{ IOException -> 0x009a }
            if (r9 == 0) goto L_0x008c
            r5 = 1
            android.content.Context r1 = r3.A00     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "com.google.firebase.fcm"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r11)     // Catch:{ IOException -> 0x009a }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "fcm_registration"
            android.content.SharedPreferences$Editor r4 = r1.putString(r0, r9)     // Catch:{ IOException -> 0x009a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x009a }
            java.lang.String r2 = "last_registration_time_ms"
            android.content.SharedPreferences$Editor r0 = r4.putLong(r2, r0)     // Catch:{ IOException -> 0x009a }
            r0.apply()     // Catch:{ IOException -> 0x009a }
            X.2Qi r1 = r3.A01     // Catch:{ IOException -> 0x009a }
            X.1XZ r6 = X.AnonymousClass3F2.A00()     // Catch:{ IOException -> 0x009a }
            android.content.Context r7 = r1.A01     // Catch:{ IOException -> 0x009a }
            com.instagram.common.notifications.push.intf.PushChannelType r8 = com.instagram.common.notifications.push.intf.PushChannelType.FCM     // Catch:{ IOException -> 0x009a }
            X.3R2 r0 = X.AnonymousClass3QY.A00()     // Catch:{ IOException -> 0x009a }
            com.instagram.common.notifications.push.intf.PushChannelType r0 = r0.BiL()     // Catch:{ IOException -> 0x009a }
            boolean r12 = r8.equals(r0)     // Catch:{ IOException -> 0x009a }
            r6.A05(r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x009a }
            X.1XZ r0 = r1.A00     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x0063
            r0.A03(r7, r8, r10, r11)     // Catch:{ IOException -> 0x009a }
        L_0x0063:
            X.0eM r0 = r1.A02     // Catch:{ IOException -> 0x009a }
            java.lang.Object r4 = r0.getValue()     // Catch:{ IOException -> 0x009a }
            X.2QH r4 = (X.AnonymousClass2QH) r4     // Catch:{ IOException -> 0x009a }
            if (r4 == 0) goto L_0x00ad
            r2 = 2131432706(0x7f0b1502, float:1.8487177E38)
            java.lang.Class r0 = X.AnonymousClass2QH.A00(r4, r2)     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x00ad
            android.content.Context r0 = r4.A03     // Catch:{ IOException -> 0x009a }
            X.2Qc r1 = X.AnonymousClass2Qc.A00(r0)     // Catch:{ IOException -> 0x009a }
            monitor-enter(r1)     // Catch:{ IOException -> 0x009a }
            android.app.job.JobScheduler r0 = r4.A01     // Catch:{ all -> 0x0089 }
            r0.cancel(r2)     // Catch:{ all -> 0x0089 }
            android.util.SparseBooleanArray r0 = r1.A00     // Catch:{ all -> 0x0089 }
            r0.put(r2, r11)     // Catch:{ all -> 0x0089 }
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x00ad
        L_0x0089:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ IOException -> 0x009a }
        L_0x008c:
            r5 = 0
            X.2Qi r2 = r3.A01     // Catch:{ IOException -> 0x009a }
            java.lang.String r1 = "Unknown error occurred"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x009a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x009a }
            r2.A00(r0, r10)     // Catch:{ IOException -> 0x009a }
            goto L_0x00ad
        L_0x009a:
            r2 = move-exception
            java.lang.String r0 = "FCMRegistrar_getToken"
            java.lang.String r1 = "Failed to get token"
            X.0wb.A06(r0, r1, r2)
            java.lang.String r0 = "FCMRegistrar"
            X.0KC.A0H(r0, r1, r2)
            X.2Qi r0 = r3.A01
            r0.A00(r2, r10)
            r5 = 0
        L_0x00ad:
            X.95d r0 = r13.A01
            if (r0 == 0) goto L_0x00b8
            X.4xg r1 = r0.A00
            r0 = r5 ^ 1
            r1.DMd(r0)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3733795c.run():void");
    }
}
