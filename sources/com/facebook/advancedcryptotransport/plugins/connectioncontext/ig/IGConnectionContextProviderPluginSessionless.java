package com.facebook.advancedcryptotransport.plugins.connectioncontext.ig;

public final class IGConnectionContextProviderPluginSessionless extends Sessionless {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if ((java.lang.System.currentTimeMillis() - r7.A00) >= 30000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean IGConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered() {
        /*
            r8 = this;
            X.5oH r1 = X.C295485oG.A02
            monitor-enter(r1)
            X.5oG r7 = X.C295485oG.A03     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)
            monitor-enter(r7)
            boolean r0 = r7.A01     // Catch:{ all -> 0x001f }
            r6 = 0
            if (r0 == 0) goto L_0x001a
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x001f }
            long r0 = r7.A00     // Catch:{ all -> 0x001f }
            long r4 = r4 - r0
            r2 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r7.A01 = r6     // Catch:{ all -> 0x001f }
            monitor-exit(r7)
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.advancedcryptotransport.plugins.connectioncontext.ig.IGConnectionContextProviderPluginSessionless.IGConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered():boolean");
    }
}
