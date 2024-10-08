package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8dQ  reason: invalid class name and case insensitive filesystem */
public final class C359748dQ extends LruCache implements C359668dI, AnonymousClass0lh, AnonymousClass6Q3 {
    public C359748dQ() {
        super(20);
    }

    public final void AUh(Context context, C359708dM r18) {
        C359798dV r9;
        Throwable th;
        long j;
        C359708dM r7 = r18;
        put(r7.A01(), r7);
        C359768dS r6 = C359768dS.A04;
        1Kg.A02(002.A0R("IgBloksDataProps", "_parallelFetchData"));
        Context context2 = context;
        try {
            r9 = r6.A01(r7);
            if (r9 == null) {
                try {
                    1Kg.A02(002.A0R("IgBloksDataProps", "_getData"));
                    C359918dh A00 = C359818dX.A00(new C359808dW(context2, r7), (C359698dL) r7);
                    1Kg.A01();
                    synchronized (r6.A02) {
                        r9 = r6.A01(r7);
                        if (r9 != null) {
                            A00.A02();
                        } else {
                            r6.A01.remove(r7.A01());
                            r6.A00.put(r7.A01(), new C359798dV(A00, 0, 0));
                            A00.A03(0);
                            r7.A00();
                            r7.A00();
                        }
                    }
                    1Kg.A01();
                } catch (Throwable th2) {
                    th = th2;
                    if (r9 != null) {
                        j = r9.A01;
                        r7.A00();
                        r7.A00();
                        if (j != 0 ? r9 != null : !(r9 == null || r9.A00 != 3)) {
                            r9.A02.A03(2);
                        }
                        if (!(j == 0 || j == -1)) {
                            r6.A03(context2, r7, j);
                        }
                        1Kg.A01();
                        throw th;
                    }
                    j = 0;
                    r7.A00();
                    r7.A00();
                    r9.A02.A03(2);
                    r6.A03(context2, r7, j);
                    1Kg.A01();
                    throw th;
                }
            }
            long j2 = r9.A01;
            r7.A00();
            r7.A00();
            if (j2 != 0 || r9.A00 == 3) {
                r9.A02.A03(2);
            }
            if (!(j2 == 0 || j2 == -1)) {
                r6.A03(context2, r7, j2);
            }
            1Kg.A01();
        } catch (Throwable th3) {
            th = th3;
            r9 = null;
            j = 0;
            r7.A00();
            r7.A00();
            r9.A02.A03(2);
            r6.A03(context2, r7, j);
            1Kg.A01();
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C359708dM r4 = (C359708dM) obj2;
        if (z) {
            C359768dS.A04.A02(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r6 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C359928di BnC(android.content.Context r13, X.C359708dM r14) {
        /*
            r12 = this;
            java.lang.String r0 = r14.A01()
            r12.put(r0, r14)
            X.8dS r5 = X.C359768dS.A04
            r10 = -1
            r8 = 0
            r3 = 0
            X.8dV r6 = r5.A01(r14)     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x0026
            long r0 = r6.A01     // Catch:{ all -> 0x00a1 }
            r14.A00()     // Catch:{ all -> 0x00a1 }
            r14.A00()     // Catch:{ all -> 0x00a1 }
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0024
            X.8dV r6 = r5.A02(r14)     // Catch:{ all -> 0x00a1 }
        L_0x0024:
            if (r6 != 0) goto L_0x003e
        L_0x0026:
            X.8dW r1 = new X.8dW     // Catch:{ all -> 0x00a1 }
            r1.<init>(r13, r14)     // Catch:{ all -> 0x00a1 }
            r0 = r14
            X.8dL r0 = (X.C359698dL) r0     // Catch:{ all -> 0x00a1 }
            X.8dh r0 = X.C359818dX.A00(r1, r0)     // Catch:{ all -> 0x00a1 }
            r14.A00()     // Catch:{ all -> 0x00a1 }
            r14.A00()     // Catch:{ all -> 0x00a1 }
            X.8dV r6 = new X.8dV     // Catch:{ all -> 0x00a1 }
            r6.<init>(r0, r8, r3)     // Catch:{ all -> 0x00a1 }
            r8 = 1
        L_0x003e:
            int r9 = r6.A00     // Catch:{ all -> 0x0079 }
            X.8di r7 = r6.A02     // Catch:{ all -> 0x0079 }
            long r0 = r6.A01
            r14.A00()
            r14.A00()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            if (r8 == 0) goto L_0x0061
            X.8dT r4 = r5.A02
            monitor-enter(r4)
            X.0yf r3 = r5.A00     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r14.A01()     // Catch:{ all -> 0x005e }
            r3.put(r2, r6)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x0061:
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            r5.A03(r13, r14, r0)
        L_0x0068:
            if (r8 == 0) goto L_0x0074
            if (r9 == 0) goto L_0x006f
            r0 = 4
            if (r9 != r0) goto L_0x0074
        L_0x006f:
            r0 = 0
        L_0x0070:
            r7.A03(r0)
        L_0x0073:
            return r7
        L_0x0074:
            r0 = 3
            if (r9 != r0) goto L_0x0073
            r0 = 2
            goto L_0x0070
        L_0x0079:
            r7 = move-exception
            long r1 = r6.A01
            r14.A00()
            r14.A00()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            if (r8 == 0) goto L_0x0099
            X.8dT r4 = r5.A02
            monitor-enter(r4)
            X.0yf r3 = r5.A00     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r14.A01()     // Catch:{ all -> 0x0096 }
            r3.put(r0, r6)     // Catch:{ all -> 0x0096 }
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            throw r0
        L_0x0099:
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            r5.A03(r13, r14, r1)
            throw r7
        L_0x00a1:
            r7 = move-exception
        L_0x00a2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359748dQ.BnC(android.content.Context, X.8dM):X.8di");
    }

    public final C359798dV CNk(Context context, C359708dM r3) {
        remove(r3.A01());
        return C359768dS.A04.A02(r3);
    }

    public final void D7G() {
        evictAll();
    }

    /* JADX INFO: finally extract failed */
    public final AnonymousClass34S E3Z(Context context, C359708dM r11, long j) {
        0yf r3;
        AnonymousClass34S r2;
        put(r11.A01(), r11);
        C359768dS r8 = C359768dS.A04;
        1Kg.A02(002.A0R("IgBloksDataProps", "_registerForPrefetch"));
        try {
            String A01 = r11.A01();
            C359778dT r6 = r8.A02;
            synchronized (r6) {
                try {
                    r3 = r8.A01;
                    if (!r3.containsKey(A01)) {
                        r3.put(A01, Long.valueOf(SystemClock.uptimeMillis()));
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            1Kg.A01();
            long millis = TimeUnit.SECONDS.toMillis(j);
            1Kg.A02(002.A0R("IgBloksDataProps", "_prefetchData"));
            synchronized (r6) {
                if (((Long) r3.remove(r11.A01())) == null) {
                    try {
                        r2 = new AnonymousClass34S((Object) null, false);
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                } else {
                    C359798dV A012 = r8.A01(r11);
                    if (A012 != null) {
                        C359798dV r4 = new C359798dV(A012.A02, A012.A00, millis);
                        r8.A00.put(r11.A01(), r4);
                        r11.A00();
                        r8.A03(context, r11, millis);
                        r2 = new AnonymousClass34S(r4.A02, false);
                    } else {
                        C359918dh A00 = C359818dX.A00(new C359808dW(context, r11), (C359698dL) r11);
                        C359798dV r42 = new C359798dV(A00, 3, millis);
                        synchronized (r6) {
                            try {
                                r8.A00.put(r11.A01(), r42);
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                    break;
                                }
                            }
                        }
                        A00.A03(3);
                        r8.A03(context, r11, millis);
                        r2 = new AnonymousClass34S(A00, true);
                    }
                }
            }
            1Kg.A01();
            return r2;
            throw th;
        } catch (Throwable th4) {
            1Kg.A01();
            throw th4;
        }
    }

    public final void onSessionWillEnd() {
        AnonymousClass6Q4 r0;
        C276594ta r02 = C64361Kj.A00().A07;
        if (!(r02 == null || (r0 = (AnonymousClass6Q4) r02.A00()) == null)) {
            r0.A00.remove(this);
        }
        evictAll();
    }
}
