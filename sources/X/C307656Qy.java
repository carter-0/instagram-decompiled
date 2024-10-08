package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Qy  reason: invalid class name and case insensitive filesystem */
public final class C307656Qy implements C307666Qz {
    public Map A00;
    public final Handler A01;
    public final 16f A02;
    public final AnonymousClass6R0 A03 = new AnonymousClass6R0();
    public final Object A04;

    public C307656Qy() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_CleanupThread", 19);
        handlerThread.start();
        Object obj = new Object();
        this.A04 = obj;
        synchronized (obj) {
            16f r0 = new 16f(50);
            this.A02 = r0;
            this.A00 = r0.A04();
        }
        this.A01 = new Handler(handlerThread.getLooper());
    }

    public final void A00(C7318Q3u q3u, Q3K q3k, T9F t9f, String str, long j, long j2) {
        16f r6;
        Runnable runnable;
        long j3 = j;
        String str2 = str;
        0qQ.A0B(str2, 0);
        try {
            1KZ.A01(002.A0T("BloksComponentQueryLRUMemoryCache", 002.A0R("storeResponseForKey:", str2), ':'));
            Object obj = this.A04;
            synchronized (obj) {
                r6 = this.A02;
                C7315Q3r q3r = (C7315Q3r) r6.A02(str2);
                if (!(q3r == null || (runnable = q3r.A02) == null)) {
                    this.A01.removeCallbacks(runnable);
                }
            }
            C7316Q3s q3s = new C7316Q3s(this, str2);
            Handler handler = this.A01;
            Q3K q3k2 = q3k;
            if (q3k2 == Q3K.PARALLEL_FETCH && j == 0) {
                j3 = 5;
            }
            handler.postDelayed(q3s, TimeUnit.SECONDS.toMillis(j3));
            synchronized (obj) {
                try {
                    r6.A06(str2, new C7317Q3t(q3u, q3k2, t9f, q3s, j2));
                    LinkedHashMap A042 = r6.A04();
                    this.A00 = A042;
                    this.A03.A01(new AnonymousClass6RJ(A042));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            1KZ.A00();
        } catch (Throwable th2) {
            1KZ.A00();
            throw th2;
        }
    }

    public final void A01(String str) {
        try {
            1KZ.A01(002.A0T("BloksComponentQueryLRUMemoryCache", "removeResponseForKey", ':'));
            synchronized (this.A04) {
                16f r0 = this.A02;
                r0.A03(str);
                LinkedHashMap A042 = r0.A04();
                this.A00 = A042;
                this.A03.A01(new AnonymousClass6RJ(A042));
            }
            1KZ.A00();
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }

    public final C7315Q3r EzP(String str) {
        C7315Q3r q3r;
        try {
            1KZ.A01(002.A0T("BloksComponentQueryLRUMemoryCache", 002.A0R("syncFetchResponseForKey:", str), ':'));
            synchronized (this.A04) {
                q3r = (C7315Q3r) this.A02.A02(str);
            }
            1KZ.A00();
            return q3r;
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }
}
