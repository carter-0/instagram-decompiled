package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class QJS extends C275194pk implements Runnable, C275204pl {
    public Handler A00;
    public HandlerThread A01;
    public final BlockingQueue A02 = new LinkedBlockingQueue();

    public final void run() {
        while (true) {
            C274844pB r1 = null;
            try {
                r1 = (C274844pB) this.A02.take();
            } catch (InterruptedException unused) {
            }
            if (r1 != null) {
                A00(r1);
            }
        }
    }

    public final void E4R(C274844pB r2) {
        try {
            this.A02.put(r2);
        } catch (InterruptedException unused) {
        }
    }

    public final void start() {
        this.A00.post(this);
    }

    public QJS(C275074pY[] r3) {
        super(r3);
        HandlerThread A0J = Pxf.A0J("MQD-BlockProcessor", 10);
        this.A01 = A0J;
        A0J.start();
        this.A00 = Pxf.A0H(this.A01);
    }
}
