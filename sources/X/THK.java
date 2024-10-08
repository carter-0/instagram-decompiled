package X;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

public final /* synthetic */ class THK implements Runnable {
    public final /* synthetic */ ReferenceQueue A00;
    public final /* synthetic */ Set A01;

    public /* synthetic */ THK(ReferenceQueue referenceQueue, Set set) {
        this.A00 = referenceQueue;
        this.A01 = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.A00;
        Set set = this.A01;
        while (!set.isEmpty()) {
            try {
                TRU tru = (TRU) referenceQueue.remove();
                if (tru.A01.remove(tru)) {
                    tru.clear();
                    tru.A00.run();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
