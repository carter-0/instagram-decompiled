package X;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.ToL  reason: case insensitive filesystem */
public final class C14019ToL implements Runnable {
    public int A00;
    public long A01;
    public Handler A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C14004To6 A04;

    public C14019ToL(C14004To6 to6, int i) {
        this.A04 = to6;
        this.A03 = i;
        SystemClock.elapsedRealtime();
    }

    public final void A00(Handler handler) {
        this.A02 = handler;
        this.A01 = SystemClock.elapsedRealtime();
        int i = this.A00 + 1;
        this.A00 = i;
        this.A04.A03.markerPoint(566768946, this.A03, 002.A0O("post_ping_", i));
        Handler handler2 = this.A02;
        0qQ.A0A(handler2);
        handler2.post(this);
    }

    public final void run() {
        if (SystemClock.elapsedRealtime() - this.A01 < 20 || this.A00 >= 10) {
            C14004To6 to6 = this.A04;
            if (to6.A04 != null) {
                String str = 1Rm.A00().A00;
                0qQ.A07(str);
                to6.A03.markerAnnotate(566768946, this.A03, "completion_endpoint", str);
            }
            to6.A03.markerEnd(566768946, this.A03, 2);
            return;
        }
        A00(this.A02);
    }
}
