package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public final class OVF {
    public N4R A00;
    public final UserSession A01;
    public final ExecutorService A02;

    public static final synchronized void A00(OVF ovf, C62320sa r2) {
        synchronized (ovf) {
            if (ovf.A00 == null) {
                ovf.A00 = (N4R) r2.invoke();
            }
        }
    }

    public final void A01(C62320sa r5, 0sP r6) {
        if (182.A06(0Tu.A05, this.A01, 36323668000124284L)) {
            0nY.A00().ATE(new NSN(this, r5, r6));
            return;
        }
        ExecutorService executorService = this.A02;
        if (!executorService.isShutdown() && !executorService.isTerminated()) {
            try {
                executorService.execute(new C73333Pas(this, r5, r6));
            } catch (RejectedExecutionException e) {
                0KC.A0J("RtcCallComponentsExecutor", "Operation execution rejected", e);
            }
        }
    }

    public OVF(UserSession userSession) {
        this.A01 = userSession;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A02 = newSingleThreadExecutor;
    }
}
