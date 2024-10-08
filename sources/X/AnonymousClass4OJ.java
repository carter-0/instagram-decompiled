package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4OJ  reason: invalid class name */
public final class AnonymousClass4OJ implements Handler.Callback {
    public final Handler A00;
    public final C263624Ms A01;
    public final AnonymousClass4MZ A02;
    public final C263444Ma A03;
    public final String A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final Thread A06;

    public AnonymousClass4OJ(Looper looper, C263624Ms r4, AnonymousClass4MZ r5, C263444Ma r6, String str) {
        0qQ.A0B(looper, 3);
        this.A01 = r4;
        this.A04 = str;
        this.A02 = r5;
        this.A03 = r6;
        Handler handler = new Handler(looper, this);
        this.A00 = handler;
        Thread thread = handler.getLooper().getThread();
        0qQ.A07(thread);
        this.A06 = thread;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r7 = "GrootPlayerLogger"
            X.0SG r4 = X.0NT.A02(r7, r0)
            int r0 = r9.what     // Catch:{ all -> 0x0055 }
            r5 = 1
            if (r0 != r5) goto L_0x0051
            java.lang.Object r6 = r9.obj     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r6, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0055 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.A05     // Catch:{ all -> 0x0055 }
            boolean r0 = r3.get()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0051
            X.4Ms r1 = r8.A01     // Catch:{ all -> 0x0055 }
            X.4Mt r2 = r1.A0I     // Catch:{ all -> 0x0055 }
            boolean r0 = r2.A0J()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0N     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x0055 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r6}     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Heartbeat: vid %s, reason: %s"
            X.27B.A01(r7, r0, r1)     // Catch:{ all -> 0x0055 }
            r2.A08()     // Catch:{ all -> 0x0055 }
            boolean r0 = r3.get()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0051
            android.os.Handler r3 = r8.A00     // Catch:{ all -> 0x0055 }
            android.os.Message r2 = r3.obtainMessage(r5, r6)     // Catch:{ all -> 0x0055 }
            r0 = 0
            r3.sendMessageDelayed(r2, r0)     // Catch:{ all -> 0x0055 }
        L_0x0051:
            r4.close()
            return r5
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OJ.handleMessage(android.os.Message):boolean");
    }

    public static final void A00(AnonymousClass4OJ r3, Runnable runnable) {
        try {
            Runnable A002 = 0ST.A00(runnable, "GrootPlayerLogger", 0);
            if (Thread.currentThread() == r3.A06) {
                A002.run();
            } else {
                r3.A00.post(A002);
            }
        } finally {
            AnonymousClass4PS.A00();
        }
    }
}
