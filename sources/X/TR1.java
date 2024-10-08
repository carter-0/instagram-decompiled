package X;

import android.os.Process;
import java.util.concurrent.TimeUnit;

public final class TR1 extends Thread {
    public final /* synthetic */ C11327SNe A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR1(C11327SNe sNe) {
        super("NativeMetricsLogWriter");
        this.A00 = sNe;
    }

    public final void run() {
        Process.setThreadPriority(19);
        C11327SNe sNe = this.A00;
        C11327SNe.A00(sNe);
        sNe.A03.postDelayed(this, TimeUnit.HOURS.toMillis(4));
    }
}
