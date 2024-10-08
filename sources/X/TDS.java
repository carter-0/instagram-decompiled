package X;

import java.util.Deque;

public final /* synthetic */ class TDS implements Runnable {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ TDS(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void run() {
        Runnable runnable = this.A00;
        Deque deque = (Deque) C8496Qvs.A01.get();
        AnonymousClass3Qk.A02(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
