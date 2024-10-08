package com.facebook.instagrammem.mca;

public abstract class MailboxInstagramMem$BytesAvailableHandlerCallback {
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.A06.A01(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
        X.N2E.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void callbackJNI(byte[] r3, long r4, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            r1 = r2
            X.N2E r1 = (X.N2E) r1
            r0 = 0
            X.0qQ.A0B(r3, r0)
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r1)
            return
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            r0 = 1
            r1.A04 = r0     // Catch:{ all -> 0x001e }
        L_0x0013:
            monitor-exit(r1)
            X.RCq r0 = r1.A06     // Catch:{ IOException -> 0x001a }
            r0.A01(r3, r10)     // Catch:{ IOException -> 0x001a }
            return
        L_0x001a:
            X.N2E.A00(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback.callbackJNI(byte[], long, long, long, boolean):void");
    }
}
