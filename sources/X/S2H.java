package X;

import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class S2H {
    public SOI A00;
    public final ReferenceQueue A01 = new ReferenceQueue();
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Executor A03;

    public S2H() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new TOJ(0));
        this.A03 = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new TB1(this));
    }

    public final synchronized void A00(C13892TjF tjF, C11909Sii sii) {
        TRV trv = (TRV) this.A02.put(tjF, new TRV(tjF, sii, this.A01));
        if (trv != null) {
            trv.clear();
        }
    }
}
