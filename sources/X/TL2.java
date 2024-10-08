package X;

import android.content.Intent;
import java.util.concurrent.Executor;

public final class TL2 implements Runnable {
    public final int A00;
    public final Intent A01;
    public final Sg6 A02;

    public static void A00(Intent intent, Sg6 sg6, Executor executor, int i) {
        executor.execute(new TL2(intent, sg6, i));
    }

    public final void run() {
        this.A02.A02(this.A01, this.A00);
    }

    public TL2(Intent intent, Sg6 sg6, int i) {
        this.A02 = sg6;
        this.A01 = intent;
        this.A00 = i;
    }
}
