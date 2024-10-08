package X;

import com.facebook.react.bridge.CatalystInstanceImpl;

public final /* synthetic */ class TC8 implements Runnable {
    public final /* synthetic */ CatalystInstanceImpl A00;

    public /* synthetic */ TC8(CatalystInstanceImpl catalystInstanceImpl) {
        this.A00 = catalystInstanceImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        X.0fc.A00(8192, -1666469188);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.facebook.react.bridge.CatalystInstanceImpl r4 = r6.A00
            X.Rrl r5 = r4.mNativeModuleRegistry
            X.QZK r0 = r5.A00
            r0.A06()
            r2 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r1 = "NativeModuleRegistry_notifyJSInstanceDestroy"
            r0 = -1996504252(0xffffffff88ffc344, float:-1.5393161E-33)
            X.0fc.A01(r2, r1, r0)
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x0078 }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ all -> 0x0078 }
        L_0x0019:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0078 }
            com.facebook.react.bridge.ModuleHolder r1 = (com.facebook.react.bridge.ModuleHolder) r1     // Catch:{ all -> 0x0078 }
            monitor-enter(r1)     // Catch:{ all -> 0x0078 }
            com.facebook.react.bridge.NativeModule r0 = r1.mModule     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            r0.invalidate()     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            goto L_0x0019
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0032:
            r0 = -2141050097(0xffffffff80622b0f, float:-9.015325E-39)
            X.0fc.A00(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mPendingJSCalls
            r2 = 0
            int r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L_0x0042
            r2 = 1
        L_0x0042:
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.mBridgeIdleListeners
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006b
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.mBridgeIdleListeners
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            r1.next()
            if (r2 != 0) goto L_0x0063
            java.lang.String r0 = "onTransitionToBridgeIdle"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0063:
            java.lang.String r0 = "onBridgeDestroyed"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x006b:
            X.Ru8 r0 = r4.mReactQueueConfiguration
            com.facebook.react.bridge.queue.MessageQueueThreadImpl r1 = r0.A00
            X.TC9 r0 = new X.TC9
            r0.<init>(r4)
            r1.runOnQueue(r0)
            return
        L_0x0078:
            r1 = move-exception
            r0 = -1666469188(0xffffffff9cabb2bc, float:-1.1362033E-21)
            X.0fc.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TC8.run():void");
    }
}
