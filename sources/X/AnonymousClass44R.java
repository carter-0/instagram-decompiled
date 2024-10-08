package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44R  reason: invalid class name */
public final class AnonymousClass44R implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44R(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r5 = r3.A01;
        r11 = r2.BJy();
        r5 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r18, X.AnonymousClass653 r19, java.util.List r20, java.util.Map r21, X.0sL r22, X.0sL r23, boolean r24) {
        /*
            r17 = this;
            r0 = 0
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r5 = r18
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r4 = r19
            X.0qQ.A0B(r4, r0)
            r0 = 5
            r3 = r22
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L_0x00f5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r4 = r4.A02
            X.0qQ.A06(r4)
            java.lang.Object r2 = r3.invoke(r2, r5)
            X.2Eq r2 = (X.2Eq) r2
            if (r2 != 0) goto L_0x003a
            X.XPd r3 = X.C21215XPd.A00
            return r3
        L_0x003a:
            r3 = r17
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x00de }
            com.instagram.common.session.UserSession r0 = r3.A00     // Catch:{ IOException -> 0x00de }
            X.0c9 r0 = r1.A01(r0, r4)     // Catch:{ IOException -> 0x00de }
            X.CsR r9 = X.C44684Cj7.parseFromJson(r0)     // Catch:{ IOException -> 0x00de }
            if (r9 == 0) goto L_0x00db
            X.2Dm r5 = r3.A01     // Catch:{ IOException -> 0x00de }
            com.instagram.model.direct.DirectThreadKey r11 = r2.BJy()     // Catch:{ IOException -> 0x00de }
            X.2Dr r5 = (X.2Dr) r5     // Catch:{ IOException -> 0x00de }
            r16 = 0
            X.48S r4 = r5.A0P(r11)     // Catch:{ IOException -> 0x00de }
            if (r4 == 0) goto L_0x00db
            monitor-enter(r4)     // Catch:{ IOException -> 0x00de }
            X.3U9 r10 = r4.A0I     // Catch:{ all -> 0x00c0 }
            X.0eM r0 = r10.A05     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00c0 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00c0 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00ac
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r10.A03     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r1.readLock()     // Catch:{ all -> 0x00c0 }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x00c0 }
            r7 = 0
            if (r0 != 0) goto L_0x0085
            int r6 = r1.getReadHoldCount()     // Catch:{ all -> 0x00c0 }
            r0 = 0
        L_0x007d:
            if (r0 >= r6) goto L_0x0086
            r8.unlock()     // Catch:{ all -> 0x00c0 }
            int r0 = r0 + 1
            goto L_0x007d
        L_0x0085:
            r6 = 0
        L_0x0086:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()     // Catch:{ all -> 0x00c0 }
            r2.lock()     // Catch:{ all -> 0x00c0 }
            X.3S9 r0 = r10.A01     // Catch:{ all -> 0x00a3 }
            X.3Te r1 = r0.A0s     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0097
            boolean r0 = r9.A00     // Catch:{ all -> 0x00a3 }
            r1.A0L = r0     // Catch:{ all -> 0x00a3 }
        L_0x0097:
            if (r7 >= r6) goto L_0x009f
            r8.lock()     // Catch:{ all -> 0x00c0 }
            int r7 = r7 + 1
            goto L_0x0097
        L_0x009f:
            r2.unlock()     // Catch:{ all -> 0x00c0 }
            goto L_0x00c3
        L_0x00a3:
            r0 = move-exception
        L_0x00a4:
            if (r7 >= r6) goto L_0x00bc
            r8.lock()     // Catch:{ all -> 0x00c0 }
            int r7 = r7 + 1
            goto L_0x00a4
        L_0x00ac:
            X.3S9 r2 = r10.A01     // Catch:{ all -> 0x00c0 }
            monitor-enter(r2)     // Catch:{ all -> 0x00c0 }
            X.3Te r1 = r2.A0s     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x00b7
            boolean r0 = r9.A00     // Catch:{ all -> 0x00b9 }
            r1.A0L = r0     // Catch:{ all -> 0x00b9 }
        L_0x00b7:
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c3
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00bf
        L_0x00bc:
            r2.unlock()     // Catch:{ all -> 0x00c0 }
        L_0x00bf:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x00de }
            throw r0     // Catch:{ IOException -> 0x00de }
        L_0x00c3:
            monitor-exit(r4)     // Catch:{ IOException -> 0x00de }
            r13 = 0
            java.lang.Integer r12 = X.AnonymousClass05K.A0D     // Catch:{ IOException -> 0x00de }
            X.2Kb r10 = new X.2Kb     // Catch:{ IOException -> 0x00de }
            r14 = r13
            r15 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00de }
            X.1Ng r0 = r5.A06     // Catch:{ IOException -> 0x00de }
            r0.A00(r10)     // Catch:{ IOException -> 0x00de }
            X.2Dr.A0F(r5, r4)     // Catch:{ IOException -> 0x00de }
            X.2FF r0 = r5.A09     // Catch:{ IOException -> 0x00de }
            r0.accept(r10)     // Catch:{ IOException -> 0x00de }
        L_0x00db:
            X.6BL r3 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x00de }
            return r3
        L_0x00de:
            r2 = move-exception
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "Invalid channel hide setting payload"
            X.0KC.A0F(r1, r0, r2)
            X.0qQ.A07(r1)
            X.6BQ r3 = new X.6BQ
            r3.<init>(r2, r1, r0)
            return r3
        L_0x00f5:
            X.6BO r3 = X.AnonymousClass6BO.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44R.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
