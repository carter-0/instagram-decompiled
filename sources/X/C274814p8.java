package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4p8  reason: invalid class name and case insensitive filesystem */
public final class C274814p8 {
    public static C274814p8 A02;
    public C274824p9 A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static synchronized C274814p8 A00() {
        C274814p8 r0;
        synchronized (C274814p8.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new C274814p8();
                A02 = r0;
            }
        }
        return r0;
    }

    public final C21493Xck A01(int i, int i2) {
        long j;
        C274824p9 r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        if (r0.A03) {
            this.A01.clear();
            this.A00.A03 = false;
        }
        if (i2 == 0) {
            j = (long) i;
        } else {
            j = ((long) i2) << (i + 32);
        }
        ConcurrentHashMap concurrentHashMap = this.A01;
        Long valueOf = Long.valueOf(j);
        C21493Xck xck = (C21493Xck) concurrentHashMap.get(valueOf);
        if (xck != null) {
            xck.A0B = true;
        }
        C21493Xck xck2 = new C21493Xck(i, i2);
        concurrentHashMap.put(valueOf, xck2);
        C274824p9 r4 = this.A00;
        if (r4.A03) {
            return xck2;
        }
        r4.A00 = SystemClock.uptimeMillis();
        if (r4.A02) {
            return xck2;
        }
        r4.A02 = true;
        Handler handler = r4.A01;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            r4.A01 = handler;
        }
        handler.postDelayed(new Ai3(r4), 30000);
        return xck2;
    }

    public final void A02(int i, int i2) {
        long j;
        if (this.A00 != null) {
            if (i2 == 0) {
                j = (long) i;
            } else {
                j = ((long) i2) << (i + 32);
            }
            ConcurrentHashMap concurrentHashMap = this.A01;
            C21493Xck xck = (C21493Xck) concurrentHashMap.remove(Long.valueOf(j));
            if (xck != null) {
                xck.A0C = true;
                xck.A06 = SystemClock.uptimeMillis();
                C274844pB r8 = this.A00.A04;
                if (r8.A05 == -1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - r8.A02;
                    xck.A00++;
                    xck.A08 += uptimeMillis;
                }
            }
            if (concurrentHashMap.isEmpty()) {
                this.A00.A00();
            }
        }
    }
}
