package X;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.TimeUnit;

public final class TR0 extends Thread {
    public final /* synthetic */ C11327SNe A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TR0(C11327SNe sNe) {
        super("NativeMetricsLogWriter");
        this.A00 = sNe;
    }

    public final void run() {
        Process.setThreadPriority(19);
        C11327SNe sNe = this.A00;
        C11327SNe sNe2 = C11327SNe.A06;
        if (0SZ.A00(sNe.A00, 002.A0R("nativemetrics_", sNe.A02))) {
            Context context = sNe.A00;
            0qQ.A0A(context);
            sNe.A01 = new C10181Rnw(context, sNe.A02);
            C11327SNe.A00(sNe);
            sNe.A03.postDelayed(sNe.A05, TimeUnit.MINUTES.toMillis(2));
        }
    }
}
