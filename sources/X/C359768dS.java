package X;

import android.os.Handler;

/* renamed from: X.8dS  reason: invalid class name and case insensitive filesystem */
public final class C359768dS {
    public static final C359768dS A04 = new C359768dS();
    public final 0yf A00 = new 01r(0);
    public final 0yf A01 = new 01r(0);
    public final C359778dT A02 = C359778dT.A00;
    public final Handler A03 = new Handler(C359788dU.A00);

    public static C359798dV A00(C359768dS r2, String str) {
        r2.A01.remove(str);
        C375959Fx r0 = C375959Fx.A03;
        synchronized (r0.A01) {
            r0.A00.remove(str);
        }
        return (C359798dV) r2.A00.remove(str);
    }

    public final C359798dV A02(C359708dM r3) {
        C359798dV A002;
        synchronized (this.A02) {
            A002 = A00(this, r3.A01());
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = java.lang.Boolean.TRUE.equals(r8.A00());
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r9 = r16.getApplicationContext();
        r8 = (X.C359698dL) r8;
        r6 = new android.os.Bundle();
        r6.putString("appId", r8.A03);
        r6.putLong("secondsUnderWhichToOnlyServeCache", r8.A01);
        r6.putLong("secondsCacheIsValidFor", r8.A00);
        r1 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r6.putSerializable("params", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r8 = new X.C359698dL();
        r8.A00 = r9.getApplicationContext();
        r9 = new java.util.BitSet(2);
        r9.clear();
        r0 = r6.getString("appId");
        r0.getClass();
        r8.A03 = r0;
        r9.set(1);
        r8.A01 = r6.getLong("secondsUnderWhichToOnlyServeCache", 0);
        r8.A00 = r6.getLong("secondsCacheIsValidFor", 0);
        r8.A05 = (java.util.HashMap) r6.getSerializable("params");
        X.C359718dN.A00(r9, new java.lang.String[]{"session", "appId"});
        r8.A04 = X.C359728dO.A00(r8.A05, r8.A03, (java.lang.String) null);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c4, code lost:
        r15.A03.postDelayed(new X.C375969Fy(r15, r8, r7), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r16, X.C359708dM r17, long r18) {
        /*
            r15 = this;
            r8 = r17
            r4 = 0
            r2 = r18
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00d5
            java.lang.String r7 = r8.A01()
            X.9Fx r9 = X.C375959Fx.A03
            X.8dT r1 = r15.A02
            monitor-enter(r1)
            X.0yf r0 = r15.A00     // Catch:{ all -> 0x00d2 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0025
            X.0yf r0 = r15.A01     // Catch:{ all -> 0x00d2 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0025
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            return
        L_0x0025:
            X.8dT r6 = r9.A01     // Catch:{ all -> 0x00d2 }
            monitor-enter(r6)     // Catch:{ all -> 0x00d2 }
            X.0yf r9 = r9.A00     // Catch:{ all -> 0x00cf }
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r9.getOrDefault(r7, r0)     // Catch:{ all -> 0x00cf }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00cf }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00cf }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cf }
            r9.put(r7, r0)     // Catch:{ all -> 0x00cf }
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r8.A00()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c4
            android.content.Context r9 = r16.getApplicationContext()
            X.8dL r8 = (X.C359698dL) r8
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r0 = r8.A03
            java.lang.String r12 = "appId"
            r6.putString(r12, r0)
            long r0 = r8.A01
            java.lang.String r11 = "secondsUnderWhichToOnlyServeCache"
            r6.putLong(r11, r0)
            long r0 = r8.A00
            java.lang.String r10 = "secondsCacheIsValidFor"
            r6.putLong(r10, r0)
            java.util.HashMap r1 = r8.A05
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "params"
            r6.putSerializable(r0, r1)
        L_0x0079:
            X.8dL r8 = new X.8dL
            r8.<init>()
            r14 = 0
            android.content.Context r0 = r9.getApplicationContext()
            r8.A00 = r0
            r0 = 2
            java.lang.String r9 = "session"
            r1 = 1
            java.lang.String[] r13 = new java.lang.String[]{r9, r12}
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>(r0)
            r9.clear()
            java.lang.String r0 = r6.getString(r12)
            r0.getClass()
            r8.A03 = r0
            r9.set(r1)
            long r0 = r6.getLong(r11, r4)
            r8.A01 = r0
            long r0 = r6.getLong(r10, r4)
            r8.A00 = r0
            java.lang.String r0 = "params"
            java.io.Serializable r0 = r6.getSerializable(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r8.A05 = r0
            X.C359718dN.A00(r9, r13)
            java.lang.String r1 = r8.A03
            java.util.HashMap r0 = r8.A05
            java.lang.String r0 = X.C359728dO.A00(r0, r1, r14)
            r8.A04 = r0
        L_0x00c4:
            X.9Fy r1 = new X.9Fy
            r1.<init>(r15, r8, r7)
            android.os.Handler r0 = r15.A03
            r0.postDelayed(r1, r2)
            return
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            throw r0
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359768dS.A03(android.content.Context, X.8dM, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C359798dV A01(X.C359708dM r7) {
        /*
            r6 = this;
            java.lang.String r1 = r7.A01()
            X.8dT r5 = r6.A02
            monitor-enter(r5)
            X.0yf r0 = r6.A00     // Catch:{ all -> 0x0038 }
            java.lang.Object r4 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            X.8dV r4 = (X.C359798dV) r4     // Catch:{ all -> 0x0038 }
            r3 = 0
            if (r4 == 0) goto L_0x0036
            X.8di r2 = r4.A02     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036
            X.8dW r0 = r2.A00     // Catch:{ all -> 0x0038 }
            X.8dM r0 = r0.A00     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r0.A01()     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r7.A01()     // Catch:{ all -> 0x0038 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002d
            r6.A02(r7)     // Catch:{ all -> 0x0038 }
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0035
            r2.A02()
            return r3
        L_0x0035:
            return r4
        L_0x0036:
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            return r3
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359768dS.A01(X.8dM):X.8dV");
    }
}
