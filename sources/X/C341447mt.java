package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7mt  reason: invalid class name and case insensitive filesystem */
public final class C341447mt {
    public static final C341447mt A02 = new C341447mt();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static Handler A01(String str) {
        return A00((Handler.Callback) null, A02, str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.os.Handler r7, boolean r8, boolean r9) {
        /*
            X.7mt r2 = A02
            if (r7 == 0) goto L_0x0015
            java.util.Map r0 = r2.A00
            java.lang.Object r6 = r0.get(r7)
            android.os.HandlerThread r6 = (android.os.HandlerThread) r6
            java.lang.String r5 = "ThreadPool"
            if (r6 != 0) goto L_0x0016
            java.lang.String r0 = "Trying to quit thread not managed by ThreadPool - abort"
            X.0KC.A0D(r5, r0)
        L_0x0015:
            return
        L_0x0016:
            r0.remove(r7)
            monitor-enter(r2)
            java.util.Map r4 = r2.A01     // Catch:{ all -> 0x006e }
            java.lang.Object r3 = r4.get(r6)     // Catch:{ all -> 0x006e }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r3 = (com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus) r3     // Catch:{ all -> 0x006e }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.TAKEN     // Catch:{ all -> 0x006e }
            if (r3 != r0) goto L_0x0060
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r1 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.AVAILABLE     // Catch:{ all -> 0x006e }
            r4.put(r6, r1)     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r4.get(r6)     // Catch:{ all -> 0x005e }
            if (r0 != r1) goto L_0x0058
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.QUITTING     // Catch:{ all -> 0x005e }
            r4.put(r6, r0)     // Catch:{ all -> 0x005e }
            if (r9 != 0) goto L_0x003c
            r6.quitSafely()     // Catch:{ all -> 0x005e }
            goto L_0x003f
        L_0x003c:
            r6.quit()     // Catch:{ all -> 0x005e }
        L_0x003f:
            if (r8 == 0) goto L_0x004c
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x0050 }
            if (r0 == r6) goto L_0x004c
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.join(r0)     // Catch:{ InterruptedException -> 0x0050 }
        L_0x004c:
            r4.remove(r6)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0069
        L_0x0050:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005e }
            r0.interrupt()     // Catch:{ all -> 0x005e }
            goto L_0x0069
        L_0x0058:
            java.lang.String r0 = "Trying to kill thread that is not AVAILABLE"
            X.0KC.A0D(r5, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0069
        L_0x005e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0060:
            java.lang.String r1 = "Trying to quit thread that is not TAKEN but in %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x006e }
            X.0KC.A0P(r5, r1, r0)     // Catch:{ all -> 0x006e }
        L_0x0069:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            r4.size()
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341447mt.A02(android.os.Handler, boolean, boolean):void");
    }

    public static Handler A00(Handler.Callback callback, C341447mt r5, String str, int i) {
        Map map;
        boolean z;
        HandlerThread handlerThread;
        if (!str.isEmpty()) {
            synchronized (r5) {
                map = r5.A01;
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Thread) it.next()).getName().equals(str)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    0KC.A0P("ThreadPool", "Thread name already exists %s", new Object[]{str});
                }
                handlerThread = new HandlerThread("DO_NOT_USE_thread", i);
                AnonymousClass0fe.A00(handlerThread);
                handlerThread.setName(str);
            }
            handlerThread.start();
            if (handlerThread.isAlive()) {
                synchronized (r5) {
                    map.put(handlerThread, ThreadPoolImpl$LifeStatus.AVAILABLE);
                }
                Handler handler = new Handler(handlerThread.getLooper(), callback);
                r5.A00.put(handler, handlerThread);
                synchronized (r5) {
                    map.put(handlerThread, ThreadPoolImpl$LifeStatus.TAKEN);
                }
                map.size();
                return handler;
            }
            throw new RuntimeException("Thread start was unsuccessful");
        }
        throw new RuntimeException("Thread name cannot be empty");
    }
}
