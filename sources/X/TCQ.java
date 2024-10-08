package X;

import java.util.Queue;

public final class TCQ implements Runnable {
    public final /* synthetic */ C12231Spl A00;

    public TCQ(C12231Spl spl) {
        this.A00 = spl;
    }

    public final void run() {
        C12231Spl spl = this.A00;
        TO6 to6 = C12231Spl.A0E;
        spl.A09.set(false);
        while (true) {
            Queue queue = spl.A08;
            if (!queue.isEmpty()) {
                ((Runnable) queue.remove()).run();
            } else {
                return;
            }
        }
    }
}
