package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.Callable;

public final /* synthetic */ class TNI implements Callable {
    public final /* synthetic */ C10615Rv9 A00;
    public final /* synthetic */ T90 A01;

    public /* synthetic */ TNI(C10615Rv9 rv9, T90 t90) {
        this.A01 = t90;
        this.A00 = rv9;
    }

    public final Object call() {
        C12826T8v t8v;
        RJC rjc;
        C11167SDe FP0;
        T90 t90 = this.A01;
        C10615Rv9 rv9 = this.A00;
        C11143SBy.A00();
        C11143SBy.A00();
        if (!Boolean.parseBoolean("")) {
            t8v = C8510Qw6.A00;
        } else {
            Map map = C12826T8v.A07;
            if (map.get("detectorTaskWithResource#run") == null) {
                map.put("detectorTaskWithResource#run", new C12826T8v("detectorTaskWithResource#run"));
            }
            t8v = (C12826T8v) map.get("detectorTaskWithResource#run");
        }
        if (!(t8v instanceof C8510Qw6)) {
            t8v.A02 = AnonymousClass7TE.A0P(SystemClock.elapsedRealtimeNanos());
        }
        try {
            R2v r2v = t90.A02;
            synchronized (r2v) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    FP0 = r2v.A00.FP0(rv9);
                    R2v.A00(RJC.NO_ERROR, rv9, r2v, elapsedRealtime);
                    R2v.A04 = false;
                } catch (C8992RKk e) {
                    if (e.A00 == 14) {
                        rjc = RJC.A04;
                    } else {
                        rjc = RJC.A02;
                    }
                    R2v.A00(rjc, rv9, r2v, elapsedRealtime);
                    throw e;
                }
            }
            return FP0;
        } finally {
            try {
                t8v.close();
            } catch (Throwable th) {
                Class<Throwable> cls = Throwable.class;
                try {
                    cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
                throw th;
            }
        }
    }
}
