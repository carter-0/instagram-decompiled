package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.7qz  reason: invalid class name and case insensitive filesystem */
public final class C343897qz extends C343907r0 implements C343927r2 {
    public static volatile C344437rr A01;
    public final Handler A00;

    public static ATD A00(Context context, C343647qZ r3) {
        ATD atd = new ATD(context, new C343657qa(r3));
        atd.A02(new C343897qz(atd));
        return atd;
    }

    public static C344437rr A01() {
        C344437rr r0;
        if (A01 != null) {
            return A01;
        }
        synchronized (C344437rr.class) {
            if (A01 == null) {
                A01 = new C344437rr();
            }
            r0 = A01;
        }
        return r0;
    }

    public final C343937r3 BJv() {
        return C343927r2.A00;
    }

    public C343897qz(C343837qt r3) {
        this.A00 = r3;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    public final Handler BAM(String str) {
        Pair pair;
        HashMap hashMap = A01().A00;
        synchronized (hashMap) {
            pair = (Pair) hashMap.get(str);
        }
        if (pair != null) {
            return (Handler) pair.second;
        }
        throw new IllegalArgumentException(002.A0R("Handler not found: ", str));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E63(java.lang.String r5) {
        /*
            r4 = this;
            X.7rr r3 = A01()
            monitor-enter(r3)
            java.util.HashMap r1 = r3.A00     // Catch:{ all -> 0x002a }
            monitor-enter(r1)     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r1.remove(r5)     // Catch:{ all -> 0x0027 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x002a }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x002a }
            r2.quitSafely()     // Catch:{ all -> 0x002a }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r0.interrupt()     // Catch:{ all -> 0x002a }
        L_0x0025:
            monitor-exit(r3)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343897qz.E63(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7qt, java.lang.Object] */
    public C343897qz() {
        this(new Object());
    }
}
