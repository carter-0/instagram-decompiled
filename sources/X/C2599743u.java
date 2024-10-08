package X;

/* renamed from: X.43u  reason: invalid class name and case insensitive filesystem */
public final class C2599743u implements C2598643j {
    public final 2Dm A00;

    public C2599743u(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00b2=Splitter:B:40:0x00b2, B:83:0x0158=Splitter:B:83:0x0158} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r17, X.AnonymousClass653 r18, java.util.List r19, java.util.Map r20, X.0sL r21, X.0sL r22, boolean r23) {
        /*
            r16 = this;
            r0 = 0
            r1 = r20
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r5 = r17
            X.0qQ.A0B(r5, r0)
            r0 = 2
            r6 = r18
            X.0qQ.A0B(r6, r0)
            r0 = 5
            r3 = r21
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r0 = "direct_v2_user_id"
            java.lang.Object r4 = r1.get(r0)
            if (r2 == 0) goto L_0x0180
            if (r4 == 0) goto L_0x0180
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "add"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r6 = r16
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r3.invoke(r2, r5)
            X.2Eq r0 = (X.2Eq) r0
            if (r0 == 0) goto L_0x017d
            X.2Dm r2 = r6.A00
            com.instagram.model.direct.DirectThreadKey r10 = r0.BJy()
            X.2Dr r2 = (X.2Dr) r2
            monitor-enter(r2)
            r15 = 0
            X.48S r5 = r2.A0P(r10)     // Catch:{ all -> 0x017a }
            if (r5 == 0) goto L_0x0176
            X.3U9 r9 = r5.A0I     // Catch:{ all -> 0x017a }
            X.0eM r0 = r9.A05     // Catch:{ all -> 0x017a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x017a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x00a2
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.A03     // Catch:{ all -> 0x017a }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r1.readLock()     // Catch:{ all -> 0x017a }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x017a }
            r7 = 0
            if (r0 != 0) goto L_0x0076
            int r6 = r1.getReadHoldCount()     // Catch:{ all -> 0x017a }
            r0 = 0
        L_0x006e:
            if (r0 >= r6) goto L_0x0077
            r8.unlock()     // Catch:{ all -> 0x017a }
            int r0 = r0 + 1
            goto L_0x006e
        L_0x0076:
            r6 = 0
        L_0x0077:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.writeLock()     // Catch:{ all -> 0x017a }
            r3.lock()     // Catch:{ all -> 0x017a }
            X.3S9 r1 = r9.A01     // Catch:{ all -> 0x0099 }
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x008d
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0099 }
            r0.add(r4)     // Catch:{ all -> 0x0099 }
        L_0x008d:
            if (r7 >= r6) goto L_0x0095
            r8.lock()     // Catch:{ all -> 0x017a }
            int r7 = r7 + 1
            goto L_0x008d
        L_0x0095:
            r3.unlock()     // Catch:{ all -> 0x017a }
            goto L_0x00b3
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            if (r7 >= r6) goto L_0x0144
            r8.lock()     // Catch:{ all -> 0x017a }
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00a2:
            X.3S9 r1 = r9.A01     // Catch:{ all -> 0x017a }
            monitor-enter(r1)     // Catch:{ all -> 0x017a }
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0173 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x00b2
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0173 }
            r0.add(r4)     // Catch:{ all -> 0x0173 }
        L_0x00b2:
            monitor-exit(r1)     // Catch:{ all -> 0x017a }
        L_0x00b3:
            if (r23 == 0) goto L_0x00b8
            X.2Dr.A0F(r2, r5)     // Catch:{ all -> 0x017a }
        L_0x00b8:
            r12 = 0
            java.lang.Integer r11 = X.AnonymousClass05K.A0D     // Catch:{ all -> 0x017a }
            X.2Kb r9 = new X.2Kb     // Catch:{ all -> 0x017a }
            r13 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x017a }
            X.1Ng r0 = r2.A06     // Catch:{ all -> 0x017a }
            r0.A00(r9)     // Catch:{ all -> 0x017a }
            X.2FF r0 = r2.A09     // Catch:{ all -> 0x017a }
            r0.accept(r9)     // Catch:{ all -> 0x017a }
            goto L_0x0176
        L_0x00ce:
            java.lang.String r0 = "remove"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0180
            java.lang.Object r0 = r3.invoke(r2, r5)
            X.2Eq r0 = (X.2Eq) r0
            if (r0 == 0) goto L_0x017d
            X.2Dm r2 = r6.A00
            com.instagram.model.direct.DirectThreadKey r10 = r0.BJy()
            X.2Dr r2 = (X.2Dr) r2
            monitor-enter(r2)
            r15 = 0
            X.48S r5 = r2.A0P(r10)     // Catch:{ all -> 0x017a }
            if (r5 == 0) goto L_0x0176
            X.3U9 r9 = r5.A0I     // Catch:{ all -> 0x017a }
            X.0eM r0 = r9.A05     // Catch:{ all -> 0x017a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x017a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0148
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.A03     // Catch:{ all -> 0x017a }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r1.readLock()     // Catch:{ all -> 0x017a }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x017a }
            r7 = 0
            if (r0 != 0) goto L_0x0118
            int r6 = r1.getReadHoldCount()     // Catch:{ all -> 0x017a }
            r0 = 0
        L_0x0110:
            if (r0 >= r6) goto L_0x0119
            r8.unlock()     // Catch:{ all -> 0x017a }
            int r0 = r0 + 1
            goto L_0x0110
        L_0x0118:
            r6 = 0
        L_0x0119:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.writeLock()     // Catch:{ all -> 0x017a }
            r3.lock()     // Catch:{ all -> 0x017a }
            X.3S9 r1 = r9.A01     // Catch:{ all -> 0x013b }
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x013b }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x013b }
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x013b }
            r0.remove(r4)     // Catch:{ all -> 0x013b }
        L_0x012f:
            if (r7 >= r6) goto L_0x0137
            r8.lock()     // Catch:{ all -> 0x017a }
            int r7 = r7 + 1
            goto L_0x012f
        L_0x0137:
            r3.unlock()     // Catch:{ all -> 0x017a }
            goto L_0x0159
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            if (r7 >= r6) goto L_0x0144
            r8.lock()     // Catch:{ all -> 0x017a }
            int r7 = r7 + 1
            goto L_0x013c
        L_0x0144:
            r3.unlock()     // Catch:{ all -> 0x017a }
            goto L_0x0175
        L_0x0148:
            X.3S9 r1 = r9.A01     // Catch:{ all -> 0x017a }
            monitor-enter(r1)     // Catch:{ all -> 0x017a }
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0173 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x0173 }
            if (r0 == 0) goto L_0x0158
            java.util.List r0 = r1.A21     // Catch:{ all -> 0x0173 }
            r0.remove(r4)     // Catch:{ all -> 0x0173 }
        L_0x0158:
            monitor-exit(r1)     // Catch:{ all -> 0x017a }
        L_0x0159:
            if (r23 == 0) goto L_0x015e
            X.2Dr.A0F(r2, r5)     // Catch:{ all -> 0x017a }
        L_0x015e:
            r12 = 0
            java.lang.Integer r11 = X.AnonymousClass05K.A0D     // Catch:{ all -> 0x017a }
            X.2Kb r9 = new X.2Kb     // Catch:{ all -> 0x017a }
            r13 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x017a }
            X.1Ng r0 = r2.A06     // Catch:{ all -> 0x017a }
            r0.A00(r9)     // Catch:{ all -> 0x017a }
            X.2FF r0 = r2.A09     // Catch:{ all -> 0x017a }
            r0.accept(r9)     // Catch:{ all -> 0x017a }
            goto L_0x0176
        L_0x0173:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017a }
        L_0x0175:
            throw r0     // Catch:{ all -> 0x017a }
        L_0x0176:
            monitor-exit(r2)
            X.6BL r0 = X.AnonymousClass6BL.A00
            return r0
        L_0x017a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x017d:
            X.XPd r0 = X.C21215XPd.A00
            return r0
        L_0x0180:
            X.6BO r0 = X.AnonymousClass6BO.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2599743u.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
