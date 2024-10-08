package X;

import android.util.Log;

public final class TDD implements Runnable {
    public final Runnable A00;

    public final void run() {
        try {
            this.A00.run();
        } catch (Exception e) {
            Log.e(002.A0R("TransportRuntime.", "Executor"), "Background execution failure.", e);
        }
    }

    public TDD(Runnable runnable) {
        this.A00 = runnable;
    }
}
