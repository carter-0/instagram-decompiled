package X;

import android.os.Handler;
import android.os.SystemClock;

public final /* synthetic */ class Ai3 implements Runnable {
    public final /* synthetic */ C274824p9 A00;

    public /* synthetic */ Ai3(C274824p9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C274824p9 r6 = this.A00;
        if (!r6.A02) {
            return;
        }
        if (SystemClock.uptimeMillis() - r6.A00 > 30000) {
            r6.A00();
            r6.A03 = true;
            return;
        }
        Handler handler = r6.A01;
        if (handler == null) {
            handler = AnonymousClass7TF.A0D();
            r6.A01 = handler;
        }
        handler.postDelayed(new Ai3(r6), 30000);
    }
}
