package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.44D  reason: invalid class name */
public final class AnonymousClass44D implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44D(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        X.0KC.A0F(getClass().getSimpleName(), "Invalid takedown thread payload", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        return new X.AnonymousClass6BQ(r3, "BatchedPollsMessageDeltaProcessor", "Invalid takedown thread payload");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r11, X.AnonymousClass653 r12, java.util.List r13, java.util.Map r14, X.0sL r15, X.0sL r16, boolean r17) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r5 = r14.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00fa
            java.lang.String r1 = r12.A00
            java.lang.String r0 = "add"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "replace"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fa
        L_0x0024:
            java.lang.String r0 = r12.A02
            X.0qQ.A06(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00eb
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x00d5 }
            com.instagram.common.session.UserSession r1 = r10.A00     // Catch:{ IOException -> 0x00d5 }
            java.lang.String r0 = r12.A02     // Catch:{ IOException -> 0x00d5 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x00d5 }
            X.0c9 r0 = r2.A01(r1, r0)     // Catch:{ IOException -> 0x00d5 }
            X.N2U r8 = X.C370608wk.parseFromJson(r0)     // Catch:{ IOException -> 0x00d5 }
            if (r8 == 0) goto L_0x00c6
            long r3 = r8.A01     // Catch:{ IOException -> 0x00d5 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            X.2Dm r6 = r10.A01     // Catch:{ IOException -> 0x00d5 }
            X.3t0 r0 = new X.3t0     // Catch:{ IOException -> 0x00d5 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x00d5 }
            X.2Dr r6 = (X.2Dr) r6     // Catch:{ IOException -> 0x00d5 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x00d5 }
            com.instagram.model.direct.DirectThreadKey r7 = X.AnonymousClass6W4.A01(r0)     // Catch:{ all -> 0x00c3 }
            X.2En r0 = r6.A0F     // Catch:{ all -> 0x00c3 }
            X.48S r0 = r0.A04(r7)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00bf
            X.3U9 r9 = r0.A0I     // Catch:{ all -> 0x00c3 }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x00c3 }
            X.0eM r0 = r9.A05     // Catch:{ all -> 0x00c3 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00c3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b2
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.A03     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()     // Catch:{ all -> 0x00c3 }
            int r0 = r1.getWriteHoldCount()     // Catch:{ all -> 0x00c3 }
            r4 = 0
            if (r0 != 0) goto L_0x008d
            int r3 = r1.getReadHoldCount()     // Catch:{ all -> 0x00c3 }
            r0 = 0
        L_0x0085:
            if (r0 >= r3) goto L_0x008e
            r5.unlock()     // Catch:{ all -> 0x00c3 }
            int r0 = r0 + 1
            goto L_0x0085
        L_0x008d:
            r3 = 0
        L_0x008e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()     // Catch:{ all -> 0x00c3 }
            r2.lock()     // Catch:{ all -> 0x00c3 }
            X.3S9 r0 = r9.A01     // Catch:{ all -> 0x00a5 }
            r0.A1R = r8     // Catch:{ all -> 0x00a5 }
        L_0x0099:
            if (r4 >= r3) goto L_0x00a1
            r5.lock()     // Catch:{ all -> 0x00c3 }
            int r4 = r4 + 1
            goto L_0x0099
        L_0x00a1:
            r2.unlock()     // Catch:{ all -> 0x00c3 }
            goto L_0x00b8
        L_0x00a5:
            r1 = move-exception
        L_0x00a6:
            if (r4 >= r3) goto L_0x00ae
            r5.lock()     // Catch:{ all -> 0x00c3 }
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00ae:
            r2.unlock()     // Catch:{ all -> 0x00c3 }
            goto L_0x00be
        L_0x00b2:
            X.3S9 r0 = r9.A01     // Catch:{ all -> 0x00c3 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c3 }
            r0.A1R = r8     // Catch:{ all -> 0x00bc }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00b8:
            r6.FLo(r7)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bf
        L_0x00bc:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00be:
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00bf:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00d5 }
            X.6BL r0 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x00d5 }
            return r0
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x00d5 }
            throw r0     // Catch:{ IOException -> 0x00d5 }
        L_0x00c6:
            java.lang.String r3 = "TakedownThreadMetadataDeltaProcessor"
            java.lang.String r2 = "Failed to parse value as TakedownThreadMetadata"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ IOException -> 0x00d5 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00d5 }
            X.6BR r0 = new X.6BR     // Catch:{ IOException -> 0x00d5 }
            r0.<init>(r1, r3, r2)     // Catch:{ IOException -> 0x00d5 }
            return r0
        L_0x00d5:
            r3 = move-exception
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "Invalid takedown thread payload"
            X.0KC.A0F(r0, r2, r3)
            java.lang.String r1 = "BatchedPollsMessageDeltaProcessor"
            X.6BQ r0 = new X.6BQ
            r0.<init>(r3, r1, r2)
            return r0
        L_0x00eb:
            java.lang.String r3 = "TakedownThreadMetadataDeltaProcessor"
            java.lang.String r2 = "Failed to parse value as TakedownThreadMetadata"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r2)
            X.6BR r0 = new X.6BR
            r0.<init>(r1, r3, r2)
            return r0
        L_0x00fa:
            X.6BO r0 = X.AnonymousClass6BO.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44D.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
