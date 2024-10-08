package X;

/* renamed from: X.44I  reason: invalid class name */
public final class AnonymousClass44I implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44I(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        r10 = r14.A00;
        r4 = r1.BJy();
        r10 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r15, X.AnonymousClass653 r16, java.util.List r17, java.util.Map r18, X.0sL r19, X.0sL r20, boolean r21) {
        /*
            r14 = this;
            r0 = 0
            r1 = r18
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r15, r0)
            r0 = 2
            r4 = r16
            X.0qQ.A0B(r4, r0)
            r0 = 5
            r3 = r19
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L_0x00f9
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "replace"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r1 = r3.invoke(r2, r15)
            X.2Eq r1 = (X.2Eq) r1
            if (r1 != 0) goto L_0x0033
            X.XPd r2 = X.C21215XPd.A00
            return r2
        L_0x0033:
            java.lang.String r0 = r4.A02     // Catch:{ IOException -> 0x00ea }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x00ea }
            X.BB5 r6 = X.C44679Cix.parseFromJson(r0)     // Catch:{ IOException -> 0x00ea }
            if (r6 == 0) goto L_0x00e7
            X.2Dm r10 = r14.A00     // Catch:{ IOException -> 0x00ea }
            com.instagram.model.direct.DirectThreadKey r4 = r1.BJy()     // Catch:{ IOException -> 0x00ea }
            X.2Dr r10 = (X.2Dr) r10     // Catch:{ IOException -> 0x00ea }
            X.48S r11 = r10.A0P(r4)     // Catch:{ IOException -> 0x00ea }
            if (r11 == 0) goto L_0x00e7
            int r8 = r6.A00     // Catch:{ IOException -> 0x00ea }
            r0 = 3
            if (r8 == r0) goto L_0x00b9
            X.3U9 r9 = r11.A0I     // Catch:{ IOException -> 0x00ea }
            X.0eM r0 = r9.A05     // Catch:{ IOException -> 0x00ea }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x00ea }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IOException -> 0x00ea }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x00ea }
            if (r0 == 0) goto L_0x00a4
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r9.A03     // Catch:{ IOException -> 0x00ea }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r1.readLock()     // Catch:{ IOException -> 0x00ea }
            int r0 = r1.getWriteHoldCount()     // Catch:{ IOException -> 0x00ea }
            r5 = 0
            if (r0 != 0) goto L_0x007c
            int r3 = r1.getReadHoldCount()     // Catch:{ IOException -> 0x00ea }
            r0 = 0
        L_0x0074:
            if (r0 >= r3) goto L_0x007d
            r7.unlock()     // Catch:{ IOException -> 0x00ea }
            int r0 = r0 + 1
            goto L_0x0074
        L_0x007c:
            r3 = 0
        L_0x007d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()     // Catch:{ IOException -> 0x00ea }
            r2.lock()     // Catch:{ IOException -> 0x00ea }
            X.3S9 r0 = r9.A01     // Catch:{ all -> 0x009b }
            X.3SB r1 = r0.A1K     // Catch:{ all -> 0x009b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x009b }
            r1.A03(r0)     // Catch:{ all -> 0x009b }
        L_0x008f:
            if (r5 >= r3) goto L_0x0097
            r7.lock()     // Catch:{ IOException -> 0x00ea }
            int r5 = r5 + 1
            goto L_0x008f
        L_0x0097:
            r2.unlock()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00b9
        L_0x009b:
            r0 = move-exception
        L_0x009c:
            if (r5 >= r3) goto L_0x00b4
            r7.lock()     // Catch:{ IOException -> 0x00ea }
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00a4:
            X.3S9 r2 = r9.A01     // Catch:{ IOException -> 0x00ea }
            monitor-enter(r2)     // Catch:{ IOException -> 0x00ea }
            X.3SB r1 = r2.A1K     // Catch:{ all -> 0x00b1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00b1 }
            r1.A03(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b8
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x00ea }
            goto L_0x00b7
        L_0x00b4:
            r2.unlock()     // Catch:{ IOException -> 0x00ea }
        L_0x00b7:
            throw r0     // Catch:{ IOException -> 0x00ea }
        L_0x00b8:
            monitor-exit(r2)     // Catch:{ IOException -> 0x00ea }
        L_0x00b9:
            java.lang.String r1 = r6.A01     // Catch:{ IOException -> 0x00ea }
            if (r1 == 0) goto L_0x00c3
            X.3U9 r0 = r11.A0I     // Catch:{ IOException -> 0x00ea }
            X.3S9 r0 = r0.A01     // Catch:{ IOException -> 0x00ea }
            r0.A1j = r1     // Catch:{ IOException -> 0x00ea }
        L_0x00c3:
            X.3U9 r9 = r11.A0I     // Catch:{ IOException -> 0x00ea }
            com.instagram.model.direct.DirectThreadKey r13 = r9.BJz()     // Catch:{ IOException -> 0x00ea }
            X.2EN r8 = r9.C3d()     // Catch:{ IOException -> 0x00ea }
            X.0qQ.A07(r8)     // Catch:{ IOException -> 0x00ea }
            X.2Eo r12 = X.2Eo.A04     // Catch:{ IOException -> 0x00ea }
            X.2Dr.A0C(r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00ea }
            X.1Ng r3 = r10.A06     // Catch:{ IOException -> 0x00ea }
            boolean r2 = r9.CUJ()     // Catch:{ IOException -> 0x00ea }
            java.lang.String r1 = r9.BA0()     // Catch:{ IOException -> 0x00ea }
            X.Osw r0 = new X.Osw     // Catch:{ IOException -> 0x00ea }
            r0.<init>(r4, r1, r2)     // Catch:{ IOException -> 0x00ea }
            r3.A00(r0)     // Catch:{ IOException -> 0x00ea }
        L_0x00e7:
            X.6BL r2 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x00ea }
            return r2
        L_0x00ea:
            r3 = move-exception
            r2 = 1
            java.lang.String r1 = "invalid_thread_group_invite_link_format"
            java.lang.String r0 = "Invalid GroupInviteLink data format"
            X.0wb.A05(r1, r0, r2, r3)
            X.6BQ r2 = new X.6BQ
            r2.<init>(r3, r1, r0)
            return r2
        L_0x00f9:
            X.6BO r2 = X.AnonymousClass6BO.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44I.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
