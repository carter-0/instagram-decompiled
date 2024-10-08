package X;

import com.facebook.systrace.Systrace;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.WiJ  reason: case insensitive filesystem */
public final class C19946WiJ implements Runnable {
    public final /* synthetic */ WJb A00;

    public C19946WiJ(WJb wJb) {
        this.A00 = wJb;
    }

    public final void run() {
        int i;
        0fc.A01(8192, "DispatchEventsRunnable", -981503000);
        try {
            WJb wJb = this.A00;
            Systrace.A05(8192, "ScheduleDispatchFrameCallback", wJb.A0D.getAndIncrement());
            int i2 = 0;
            wJb.A0F = false;
            0Sd.A00(wJb.A0E);
            synchronized (wJb.A08) {
                try {
                    int i3 = wJb.A00;
                    if (i3 > 0) {
                        if (i3 > 1) {
                            Arrays.sort(wJb.A02, 0, i3, WJb.A0G);
                        }
                        while (true) {
                            i = wJb.A00;
                            if (i2 >= i) {
                                break;
                            }
                            W0S w0s = wJb.A02[i2];
                            if (w0s != null) {
                                Systrace.A05(8192, w0s.A07(), w0s.A01);
                                w0s.A0C(wJb.A0E);
                                w0s.A04 = false;
                                w0s.A09();
                            }
                            i2++;
                        }
                        Arrays.fill(wJb.A02, 0, i, (Object) null);
                        wJb.A00 = 0;
                        wJb.A03.clear();
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            Iterator it = wJb.A0C.iterator();
            if (it.hasNext()) {
                it.next();
                th = new NullPointerException("onBatchEventDispatched");
                throw th;
            }
        } finally {
            0fc.A00(8192, 1695580238);
        }
    }
}
