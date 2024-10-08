package X;

import java.util.TimerTask;

public final class MCz extends TimerTask {
    public final /* synthetic */ C65365Ls6 A00;

    public MCz(C65365Ls6 ls6) {
        this.A00 = ls6;
    }

    public final void run() {
        C65365Ls6 ls6 = this.A00;
        ls6.A00 += 100 / ls6.A04;
        ls6.A00();
        if (ls6.A00 >= 100) {
            ls6.A05.cancel();
        }
    }
}
