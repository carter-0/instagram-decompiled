package X;

import android.os.Process;

public final class MYE implements Runnable {
    public final /* synthetic */ MY0 A00;

    public MYE(MY0 my0) {
        this.A00 = my0;
    }

    public final void run() {
        MY0 my0 = this.A00;
        Process.setThreadPriority(my0.A02);
        my0.A00 = true;
        JTO.A0E(my0.A04).postDelayed(this, my0.A03);
    }
}
