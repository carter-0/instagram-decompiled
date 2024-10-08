package X;

import java.util.concurrent.CopyOnWriteArraySet;

public final class TG5 implements Runnable {
    public final /* synthetic */ C13773Tgo A00;
    public final /* synthetic */ Q6H A01;

    public TG5(C13773Tgo tgo, Q6H q6h) {
        this.A01 = q6h;
        this.A00 = tgo;
    }

    public final void run() {
        Q6H q6h = this.A01;
        CopyOnWriteArraySet copyOnWriteArraySet = q6h.A0C;
        C13773Tgo tgo = this.A00;
        if (copyOnWriteArraySet.contains(tgo)) {
            try {
                tgo.onHostResume();
            } catch (RuntimeException e) {
                q6h.A0C(e);
            }
        }
    }
}
