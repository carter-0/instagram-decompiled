package X;

import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Wv3 extends TimerTask {
    public final /* synthetic */ AnonymousClass7QL A00;

    public Wv3(AnonymousClass7QL r1) {
        this.A00 = r1;
    }

    public final void run() {
        C17415VUu vUu;
        AnonymousClass7QL r2 = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = r2.A08;
        if (!concurrentLinkedQueue.isEmpty() && (vUu = (C17415VUu) concurrentLinkedQueue.poll()) != null) {
            r2.A05.E3h(vUu);
        }
    }
}
