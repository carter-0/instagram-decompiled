package X;

/* renamed from: X.5lP  reason: invalid class name and case insensitive filesystem */
public final class C293825lP extends 0ng {
    public final /* synthetic */ C293835lQ A00;
    public final /* synthetic */ 1bC A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C293825lP(C293835lQ r4, 1bC r5) {
        super(519, 4, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r4 != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.1bC r8 = r13.A01
            android.os.SystemClock.uptimeMillis()
            android.database.sqlite.SQLiteDatabase r3 = X.1bC.A00(r8)
            if (r3 == 0) goto L_0x016f
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            r0 = -1302868137(0xffffffffb257cf57, float:-1.2561791E-8)
            X.AnonymousClass0fa.A01(r3, r0)
            X.1bC.A0A(r8)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2Dr r6 = r8.A04     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2ED r2 = r6.A0C     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.A0G     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            boolean r0 = r2.A0L     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x0037
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1.lock()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2EJ r0 = r2.A00     // Catch:{ all -> 0x0031 }
            X.2EJ r10 = r0.A03()     // Catch:{ all -> 0x0031 }
            goto L_0x0042
        L_0x0031:
            r2 = move-exception
            r1.unlock()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0155
        L_0x0037:
            java.lang.Object r1 = r2.A0D     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            monitor-enter(r1)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2EJ r0 = r2.A00     // Catch:{ all -> 0x014b }
            X.2EJ r10 = r0.A03()     // Catch:{ all -> 0x014b }
            monitor-exit(r1)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0045
        L_0x0042:
            r1.unlock()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x0045:
            com.instagram.common.session.UserSession r5 = r8.A01     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            boolean r4 = X.2El.A03(r5)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            boolean r0 = X.2El.A0C(r5)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x0054
            r2 = 1
            if (r4 == 0) goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2EN r0 = X.2EN.A05     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1.add(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2EN r0 = X.2EN.A04     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1.add(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r4 == 0) goto L_0x006b
            X.2EN r0 = X.2EN.A06     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1.add(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x006b:
            if (r2 == 0) goto L_0x00c9
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.0qQ.A07(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.ArrayList r0 = r6.A0R(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x0081:
            boolean r0 = r12.hasNext()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r12.next()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.3U9 r0 = (X.AnonymousClass3U9) r0     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJz()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.48S r11 = r6.A0P(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r11 == 0) goto L_0x0081
            X.3U9 r0 = r11.A0I     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            int r0 = r0.B6d()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            boolean r0 = r9.containsKey(r4)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r9.get(r4)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x014e
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            int r2 = r0.intValue()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r1 = 10
            r0 = 3
            if (r2 >= r1) goto L_0x00bc
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            r0 = 20
        L_0x00bc:
            X.1bC.A03(r11, r8, r7, r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            int r0 = r2 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r9.put(r4, r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0081
        L_0x00c9:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.0qQ.A07(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.ArrayList r0 = r6.A0R(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r2 = 0
        L_0x00d9:
            boolean r0 = r4.hasNext()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r4.next()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.3U9 r0 = (X.AnonymousClass3U9) r0     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJz()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.48S r1 = r6.A0P(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r1 == 0) goto L_0x00d9
            r0 = 20
            if (r2 < r0) goto L_0x00f4
            r0 = 3
        L_0x00f4:
            X.1bC.A03(r1, r8, r7, r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00fa:
            X.2PB r9 = X.2PA.A00(r5)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r0 = 0
            X.0qQ.A0B(r10, r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2Ot r0 = X.AnonymousClass2Oq.A06     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            X.2Oq r0 = r0.A00()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r8 = 0
            if (r0 == 0) goto L_0x0147
            android.database.sqlite.SQLiteDatabase r7 = r0.A00()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            if (r7 == 0) goto L_0x0147
            java.lang.Object r6 = r9.A01     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            monitor-enter(r6)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            java.lang.String r5 = "session"
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            r0 = 3
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0143 }
            r2.<init>(r0)     // Catch:{ all -> 0x0143 }
            com.instagram.common.session.UserSession r0 = r9.A00     // Catch:{ all -> 0x0143 }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "user_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0143 }
            byte[] r1 = r9.A0A(r4, r10)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "value"
            r2.put(r0, r1)     // Catch:{ all -> 0x0143 }
            r0 = -1779352897(0xffffffff95f13abf, float:-9.743181E-26)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0143 }
            r7.replace(r5, r8, r2)     // Catch:{ all -> 0x0143 }
            r0 = 1659532258(0x62ea73e2, float:2.1624442E21)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0146
        L_0x0143:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0155
        L_0x0146:
            monitor-exit(r6)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x0147:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0169
        L_0x014b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            goto L_0x0155
        L_0x014e:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
            r2.<init>(r0)     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x0155:
            throw r2     // Catch:{ SQLiteException -> 0x015d, IllegalStateException -> 0x0156 }
        L_0x0156:
            r1 = move-exception
            X.2Ot r0 = X.AnonymousClass2Oq.A06     // Catch:{ all -> 0x0164 }
            r0.A02(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0169
        L_0x015d:
            r1 = move-exception
            X.2Ot r0 = X.AnonymousClass2Oq.A06     // Catch:{ all -> 0x0164 }
            r0.A02(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            X.AnonymousClass48L.A00(r3)
            throw r0
        L_0x0169:
            X.AnonymousClass48L.A00(r3)
            android.os.SystemClock.uptimeMillis()
        L_0x016f:
            X.5lQ r0 = r13.A00
            if (r0 == 0) goto L_0x0185
            X.2Dr r1 = r0.A00
            monitor-enter(r1)
            X.2En r0 = r1.A0F     // Catch:{ all -> 0x0181 }
            r0.A0A()     // Catch:{ all -> 0x0181 }
            X.2F9 r0 = r1.A0E     // Catch:{ all -> 0x0181 }
            r0.A01()     // Catch:{ all -> 0x0181 }
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0184:
            monitor-exit(r1)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C293825lP.run():void");
    }
}
