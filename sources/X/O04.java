package X;

public abstract class O04 {
    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final void A00(com.instagram.common.session.UserSession r8, com.instagram.model.direct.DirectThreadKey r9, java.lang.String r10) {
        /*
            X.AnonymousClass7TG.A1N(r8, r9)
            X.2Dm r6 = X.1bJ.A00(r8)
            X.2Dr r6 = (X.2Dr) r6
            X.48S r0 = r6.A0P(r9)
            if (r0 == 0) goto L_0x0068
            X.3U9 r7 = r0.A0I
            X.0qQ.A07(r7)
            X.0eM r0 = r7.A05
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0037
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x002f:
            if (r0 >= r2) goto L_0x0038
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x002f
        L_0x0037:
            r2 = 0
        L_0x0038:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r7.A01     // Catch:{ all -> 0x004b }
            r0.A1S = r5     // Catch:{ all -> 0x004b }
        L_0x0043:
            if (r3 >= r2) goto L_0x0062
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0043
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            if (r3 >= r2) goto L_0x0054
            r4.lock()
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0054:
            r1.unlock()
            throw r0
        L_0x0058:
            X.3S9 r1 = r7.A01
            monitor-enter(r1)
            r1.A1S = r5     // Catch:{ all -> 0x005f }
            monitor-exit(r1)
            goto L_0x0065
        L_0x005f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0062:
            r1.unlock()
        L_0x0065:
            r6.FLo(r9)
        L_0x0068:
            java.lang.String r0 = r9.A00
            if (r0 == 0) goto L_0x0084
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r10}
            java.lang.String r0 = "direct_v2/threads/%s/dismiss_suggestion/%s/"
            r2.A0K(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r0 = X.DbU.A0S(r2, r1, r0)
            X.1ES.A03(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O04.A00(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, java.lang.String):void");
    }
}
