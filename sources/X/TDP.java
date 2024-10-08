package X;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.SystemClock;

public final class TDP implements Runnable {
    public final /* synthetic */ SHG A00;

    public TDP(SHG shg) {
        this.A00 = shg;
    }

    public final void run() {
        long j;
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        SHG shg = this.A00;
        if (myLooper == mainLooper) {
            C11200SFa sFa = shg.A00.A03;
            AnonymousClass3Qk.A02(sFa);
            sFa.A02.submit(this);
            return;
        }
        boolean A1P = AnonymousClass7TF.A1P((shg.A02 > 0 ? 1 : (shg.A02 == 0 ? 0 : -1)));
        shg.A02 = 0;
        if (!A1P) {
            return;
        }
        if (shg instanceof C8495Qvh) {
            C8490Qvc qvc = ((C8495Qvh) shg).A00;
            try {
                C8491Qvd qvd = qvc.A04;
                C11200SFa.A00();
                qvd.A0J();
                C11233SGt sGt = qvd.A00;
                if (sGt.A00(86400000)) {
                    sGt.A00 = SystemClock.elapsedRealtime();
                    ST5.A0B(qvd, "Deleting stale hits (if any)", 2);
                    qvd.A0E("Deleted stale hits, count", Integer.valueOf(qvd.A0K().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
                }
                qvc.A0L();
            } catch (SQLiteException e) {
                qvc.A0G("Failed to delete stale hits", e);
            }
            qvc.A05.A01(86400000);
        } else if (shg instanceof C8494Qvg) {
            C8490Qvc qvc2 = ((C8494Qvg) shg).A00;
            long j2 = qvc2.A00;
            C11200SFa.A00();
            qvc2.A0J();
            C8486QvY qvY = qvc2.A00.A0D;
            C11381SQt.A02(qvY);
            long A0L = qvY.A0L();
            if (A0L != 0) {
                j = Math.abs(C51966G9m.A07(A0L));
            } else {
                j = -1;
            }
            qvc2.A0F("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
            C8490Qvc.A03(qvc2);
            try {
                C8490Qvc.A04(qvc2);
                C11381SQt.A02(qvY);
                qvY.A0M();
                qvc2.A0L();
                qvc2.A0L();
                if (qvc2.A00 != j2) {
                    C8492Qve.A06(qvc2);
                }
            } catch (Exception e2) {
                qvc2.A0H("Local dispatch failed", e2);
                C11381SQt.A02(qvY);
                qvY.A0M();
                qvc2.A0L();
                qvc2.A0L();
            }
        } else {
            C8487QvZ qvZ = ((C8493Qvf) shg).A00;
            C11200SFa.A00();
            C11200SFa.A00();
            qvZ.A0J();
            if (qvZ.A00 != null) {
                ST5.A0B(qvZ, "Inactivity, disconnecting from device AnalyticsService", 2);
                qvZ.A0K();
            }
        }
    }
}
