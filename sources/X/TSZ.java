package X;

import java.util.Timer;
import java.util.TimerTask;

public final class TSZ extends TimerTask {
    public final /* synthetic */ C7581QKw A00;

    public TSZ(C7581QKw qKw) {
        this.A00 = qKw;
    }

    public final void run() {
        C7581QKw qKw = this.A00;
        Timer timer = qKw.A0E;
        timer.cancel();
        timer.purge();
        if (qKw.A08) {
            if (qKw.A07 || (qKw.A05 && !qKw.A0F)) {
                AnonymousClass7TF.A0D().post(new TBO(qKw));
            }
            qKw.A04 = true;
        }
    }
}
