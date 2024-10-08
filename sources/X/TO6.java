package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class TO6 implements Executor {
    public boolean A00 = false;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final Executor A02;

    public TO6(Executor executor) {
        this.A02 = executor;
    }

    public static void A01(TO6 to6) {
        TGF tgf;
        synchronized (to6) {
            if (!to6.A00 && (tgf = (TGF) to6.A01.poll()) != null) {
                to6.A00 = true;
                to6.A02.execute(tgf);
            }
        }
    }

    public static TO6 A00() {
        if (C11160SCr.A02 == null) {
            synchronized (C11160SCr.class) {
                if (C11160SCr.A02 == null) {
                    int max = Math.max(0, Math.min(5, 32));
                    if (max != 5) {
                        0KC.A0P("RtiExecutor", "Core pool size override from %d to %d", new Object[]{5, Integer.valueOf(max)});
                    }
                    C11160SCr.A02 = new ThreadPoolExecutor(max, 128, 1, TimeUnit.SECONDS, C11160SCr.A00, C11160SCr.A01);
                }
            }
        }
        return new TO6(C11160SCr.A02);
    }

    public final void execute(Runnable runnable) {
        this.A01.add(new TGF(this, runnable));
        A01(this);
    }
}
