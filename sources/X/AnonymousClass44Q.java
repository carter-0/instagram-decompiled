package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44Q  reason: invalid class name */
public final class AnonymousClass44Q implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44Q(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r6 = r3.A01;
        r12 = r2.BJy();
        r6 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r19, X.AnonymousClass653 r20, java.util.List r21, java.util.Map r22, X.0sL r23, X.0sL r24, boolean r25) {
        /*
            r18 = this;
            r0 = 0
            r1 = r22
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r5 = r19
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r4 = r20
            X.0qQ.A0B(r4, r0)
            r0 = 5
            r3 = r23
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L_0x015f
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r4 = r4.A02
            X.0qQ.A06(r4)
            java.lang.Object r2 = r3.invoke(r2, r5)
            X.2Eq r2 = (X.2Eq) r2
            if (r2 != 0) goto L_0x003a
            X.XPd r3 = X.C21215XPd.A00
            return r3
        L_0x003a:
            r3 = r18
            X.0c5 r1 = X.0c9.A04     // Catch:{ IOException -> 0x0148 }
            com.instagram.common.session.UserSession r0 = r3.A00     // Catch:{ IOException -> 0x0148 }
            X.0c9 r0 = r1.A01(r0, r4)     // Catch:{ IOException -> 0x0148 }
            X.4li r9 = X.C272954lh.parseFromJson(r0)     // Catch:{ IOException -> 0x0148 }
            if (r9 == 0) goto L_0x0145
            X.2Dm r6 = r3.A01     // Catch:{ IOException -> 0x0148 }
            com.instagram.model.direct.DirectThreadKey r12 = r2.BJy()     // Catch:{ IOException -> 0x0148 }
            X.2Dr r6 = (X.2Dr) r6     // Catch:{ IOException -> 0x0148 }
            r17 = 0
            X.48S r5 = r6.A0P(r12)     // Catch:{ IOException -> 0x0148 }
            if (r5 == 0) goto L_0x0145
            java.lang.String r7 = r12.A00     // Catch:{ IOException -> 0x0148 }
            if (r7 == 0) goto L_0x0075
            java.lang.String r4 = "delta"
            X.0wc r2 = r6.A05     // Catch:{ IOException -> 0x0148 }
            if (r2 == 0) goto L_0x0075
            r1 = 1
            boolean r0 = r9.A08     // Catch:{ IOException -> 0x0148 }
            if (r0 == r1) goto L_0x006a
            r1 = 0
        L_0x006a:
            X.3U9 r0 = r5.A0I     // Catch:{ IOException -> 0x0148 }
            boolean r0 = r0.Axj()     // Catch:{ IOException -> 0x0148 }
            if (r0 == r1) goto L_0x0075
            X.C3265677h.A0d(r2, r7, r4, r1)     // Catch:{ IOException -> 0x0148 }
        L_0x0075:
            monitor-enter(r5)     // Catch:{ IOException -> 0x0148 }
            X.3U9 r10 = r5.A0I     // Catch:{ all -> 0x0126 }
            X.0eM r11 = r10.A05     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0126 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0126 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00c1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r10.A03     // Catch:{ all -> 0x0126 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r1.readLock()     // Catch:{ all -> 0x0126 }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x0126 }
            r4 = 0
            if (r0 != 0) goto L_0x00a0
            int r2 = r1.getReadHoldCount()     // Catch:{ all -> 0x0126 }
            r0 = 0
        L_0x0098:
            if (r0 >= r2) goto L_0x00a1
            r7.unlock()     // Catch:{ all -> 0x0126 }
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()     // Catch:{ all -> 0x0126 }
            r1.lock()     // Catch:{ all -> 0x0126 }
            X.3S9 r8 = r10.A01     // Catch:{ all -> 0x00b8 }
            r8.A1P = r9     // Catch:{ all -> 0x00b8 }
        L_0x00ac:
            if (r4 >= r2) goto L_0x00b4
            r7.lock()     // Catch:{ all -> 0x0126 }
            int r4 = r4 + 1
            goto L_0x00ac
        L_0x00b4:
            r1.unlock()     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x00b8:
            r0 = move-exception
        L_0x00b9:
            if (r4 >= r2) goto L_0x0122
            r7.lock()     // Catch:{ all -> 0x0126 }
            int r4 = r4 + 1
            goto L_0x00b9
        L_0x00c1:
            X.3S9 r8 = r10.A01     // Catch:{ all -> 0x0126 }
            monitor-enter(r8)     // Catch:{ all -> 0x0126 }
            r8.A1P = r9     // Catch:{ all -> 0x011f }
            monitor-exit(r8)     // Catch:{ all -> 0x0126 }
        L_0x00c7:
            monitor-exit(r5)     // Catch:{ IOException -> 0x0148 }
            java.lang.Object r0 = r11.getValue()     // Catch:{ IOException -> 0x0148 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x0148 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0148 }
            if (r0 == 0) goto L_0x0116
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r10.A03     // Catch:{ IOException -> 0x0148 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r1.readLock()     // Catch:{ IOException -> 0x0148 }
            int r0 = r1.getWriteHoldCount()     // Catch:{ IOException -> 0x0148 }
            r4 = 0
            if (r0 != 0) goto L_0x00ee
            int r2 = r1.getReadHoldCount()     // Catch:{ IOException -> 0x0148 }
            r0 = 0
        L_0x00e6:
            if (r0 >= r2) goto L_0x00ef
            r7.unlock()     // Catch:{ IOException -> 0x0148 }
            int r0 = r0 + 1
            goto L_0x00e6
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()     // Catch:{ IOException -> 0x0148 }
            r1.lock()     // Catch:{ IOException -> 0x0148 }
            r8.A1P = r9     // Catch:{ all -> 0x0109 }
            X.3SB r0 = r8.A14     // Catch:{ all -> 0x0109 }
            r0.A03(r9)     // Catch:{ all -> 0x0109 }
        L_0x00fd:
            if (r4 >= r2) goto L_0x0105
            r7.lock()     // Catch:{ IOException -> 0x0148 }
            int r4 = r4 + 1
            goto L_0x00fd
        L_0x0105:
            r1.unlock()     // Catch:{ IOException -> 0x0148 }
            goto L_0x012d
        L_0x0109:
            r0 = move-exception
        L_0x010a:
            if (r4 >= r2) goto L_0x0112
            r7.lock()     // Catch:{ IOException -> 0x0148 }
            int r4 = r4 + 1
            goto L_0x010a
        L_0x0112:
            r1.unlock()     // Catch:{ IOException -> 0x0148 }
            goto L_0x012b
        L_0x0116:
            monitor-enter(r8)     // Catch:{ IOException -> 0x0148 }
            r8.A1P = r9     // Catch:{ all -> 0x0129 }
            X.3SB r0 = r8.A14     // Catch:{ all -> 0x0129 }
            r0.A03(r9)     // Catch:{ all -> 0x0129 }
            goto L_0x012c
        L_0x011f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0126 }
            goto L_0x0125
        L_0x0122:
            r1.unlock()     // Catch:{ all -> 0x0126 }
        L_0x0125:
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0148 }
            goto L_0x012b
        L_0x0129:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IOException -> 0x0148 }
        L_0x012b:
            throw r0     // Catch:{ IOException -> 0x0148 }
        L_0x012c:
            monitor-exit(r8)     // Catch:{ IOException -> 0x0148 }
        L_0x012d:
            r14 = 0
            java.lang.Integer r13 = X.AnonymousClass05K.A0D     // Catch:{ IOException -> 0x0148 }
            X.2Kb r11 = new X.2Kb     // Catch:{ IOException -> 0x0148 }
            r15 = r14
            r16 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x0148 }
            X.1Ng r0 = r6.A06     // Catch:{ IOException -> 0x0148 }
            r0.A00(r11)     // Catch:{ IOException -> 0x0148 }
            X.2Dr.A0F(r6, r5)     // Catch:{ IOException -> 0x0148 }
            X.2FF r0 = r6.A09     // Catch:{ IOException -> 0x0148 }
            r0.accept(r11)     // Catch:{ IOException -> 0x0148 }
        L_0x0145:
            X.6BL r3 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x0148 }
            return r3
        L_0x0148:
            r2 = move-exception
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "Invalid disappearingModeMetadata payload"
            X.0KC.A0F(r1, r0, r2)
            X.0qQ.A07(r1)
            X.6BQ r3 = new X.6BQ
            r3.<init>(r2, r1, r0)
            return r3
        L_0x015f:
            X.6BO r3 = X.AnonymousClass6BO.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44Q.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
