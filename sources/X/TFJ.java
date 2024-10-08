package X;

import android.os.StrictMode;
import android.util.Log;

public final class TFJ implements Runnable {
    public final /* synthetic */ TOR A00;
    public final /* synthetic */ Runnable A01;

    public TFJ(TOR tor, Runnable runnable) {
        this.A00 = tor;
        this.A01 = runnable;
    }

    public final void run() {
        if (this.A00.A01) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.A01.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
