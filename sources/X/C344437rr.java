package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.7rr  reason: invalid class name and case insensitive filesystem */
public final class C344437rr {
    public final HashMap A00 = new HashMap();

    public final void A00(String str, int i) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (!hashMap.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, i);
                AnonymousClass0fe.A00(handlerThread);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                if (looper != null) {
                    hashMap.put(str, new Pair(handlerThread, new Handler(looper)));
                } else {
                    throw new IllegalArgumentException(002.A0R("Looper is null: ", str));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|20|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() {
        /*
            r5 = this;
            java.util.HashMap r4 = r5.A00
            monitor-enter(r4)
            java.util.Collection r0 = r4.values()     // Catch:{ all -> 0x0031 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0031 }
        L_0x000b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0031 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x0031 }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x0031 }
            r2.quitSafely()     // Catch:{ all -> 0x0031 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x000b
        L_0x0024:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r0.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x000b
        L_0x002c:
            r4.clear()     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344437rr.finalize():void");
    }

    public C344437rr() {
        A00("Lite-Controller-Thread", 0);
        A00("Lite-SurfacePipe-Thread", 0);
        A00("Lite-CPU-Frames-Thread", 0);
        A00("Lite-GPU-Monitor-Thread", 0);
    }
}
