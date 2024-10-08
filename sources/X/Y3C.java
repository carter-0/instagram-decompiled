package X;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class Y3C implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ XU1 A01;
    public final /* synthetic */ Object A02;

    public Y3C(XU1 xu1, Object obj, int i) {
        this.A01 = xu1;
        this.A00 = i;
        this.A02 = obj;
    }

    public final void run() {
        XU1 xu1 = this.A01;
        if (xu1.A01 == null) {
            synchronized (xu1) {
                if (xu1.A01 == null) {
                    xu1.A01 = (Set) xu1.A03.get();
                }
            }
        }
        for (YA7 ya7 : xu1.A01) {
            int i = this.A00;
            Object obj = this.A02;
            if (ya7.Esn(i, obj)) {
                ScheduledExecutorService scheduledExecutorService = xu1.A02;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = (ScheduledExecutorService) xu1.A05.get();
                    xu1.A02 = scheduledExecutorService;
                }
                ya7.DR7(obj, scheduledExecutorService, i);
            }
        }
    }
}
