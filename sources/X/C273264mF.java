package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4mF  reason: invalid class name and case insensitive filesystem */
public final class C273264mF {
    public static C273264mF A06;
    public 0fA A00;
    public Thread A01;
    public C273304mJ A02;
    public final Object A03 = new Object();
    public final List A04;
    public final List A05;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Object r8) {
        /*
            r7 = this;
            r1 = r8
            boolean r0 = r8 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 != 0) goto L_0x0043
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r6 = r0.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
        L_0x000f:
            if (r4 >= r5) goto L_0x0066
            r3 = r6[r4]
            java.lang.Class<java.util.concurrent.ThreadPoolExecutor> r1 = java.util.concurrent.ThreadPoolExecutor.class
            java.lang.Class r0 = r3.getType()
            boolean r0 = r1.isAssignableFrom(r0)
            r2 = 1
            if (r0 == 0) goto L_0x002a
            r3.setAccessible(r2)
            java.lang.Object r1 = r3.get(r8)     // Catch:{ all -> 0x002a }
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1     // Catch:{ all -> 0x002a }
            goto L_0x0045
        L_0x002a:
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            java.lang.Class r0 = r3.getType()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x004b
            r3.setAccessible(r2)
            java.lang.Object r1 = r3.get(r8)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004b
            boolean r0 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 == 0) goto L_0x004b
        L_0x0043:
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
        L_0x0045:
            if (r1 == 0) goto L_0x0066
            java.lang.Object r3 = r7.A03
            monitor-enter(r3)
            goto L_0x004e
        L_0x004b:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x004e:
            boolean r0 = r8 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0060
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8     // Catch:{ all -> 0x0063 }
        L_0x0054:
            java.util.List r2 = r7.A04     // Catch:{ all -> 0x0063 }
            X.TLD r0 = new X.TLD     // Catch:{ all -> 0x0063 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0063 }
            r2.add(r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x0062
        L_0x0060:
            r8 = r1
            goto L_0x0054
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273264mF.A04(java.lang.Object):void");
    }

    public static C273264mF A00() {
        C273264mF r0 = A06;
        if (r0 != null) {
            return r0;
        }
        C273264mF r02 = new C273264mF();
        A06 = r02;
        return r02;
    }

    public final void A01(Handler handler) {
        synchronized (this.A03) {
            if (!C273274mG.A07.contains(handler.getLooper())) {
                this.A04.add(new C273274mG(handler));
            }
        }
    }

    public final void A02(Looper looper) {
        synchronized (this.A03) {
            if (!C273274mG.A07.contains(looper)) {
                this.A04.add(new C273274mG(new Handler(looper)));
            }
        }
    }

    public final void A03(C273294mI r3) {
        synchronized (this.A03) {
            this.A02.A01.add(r3);
        }
    }

    public final void A05(String str, Throwable th) {
        long j;
        0fA r2 = this.A00;
        if (r2 != null) {
            0f9 AEg = r2.AEg(true, str, 157812016);
            AEg.ERJ(th);
            AEg.ABR("app_in_foreground_v2", 0LA.A07());
            long uptimeMillis = SystemClock.uptimeMillis();
            if (0LA.A04 == null) {
                j = 0;
            } else {
                j = 0LA.A04.A00;
            }
            AEg.ABP("time_since_app_start", uptimeMillis - j);
            AEg.ABQ("asl_session_id", 0LA.A01());
            AEg.report();
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.4mI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.4mI, java.lang.Object] */
    public C273264mF() {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = new ArrayList();
        ApiExemption.enableUnsafeExemption();
        ApiExemption.removeRestriction_DO_NOT_USE();
        HandlerThread handlerThread = new HandlerThread("watchdog.monitor", 0);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        Set set = C273274mG.A07;
        C273304mJ r0 = new C273304mJ(handlerThread.getLooper());
        this.A02 = r0;
        arrayList.add(r0);
        A02(Looper.getMainLooper());
        A03(new Object());
        A03(new C273324mL());
        A03(new Object());
    }
}
