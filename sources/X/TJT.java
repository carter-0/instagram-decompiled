package X;

import java.util.Timer;

public final class TJT implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ S1Z A01;
    public final /* synthetic */ C11039S6r A02;
    public final /* synthetic */ C62320sa A03;

    public TJT(S1Z s1z, C11039S6r s6r, C62320sa r3, long j) {
        this.A02 = s6r;
        this.A00 = j;
        this.A03 = r3;
        this.A01 = s1z;
    }

    public final void run() {
        C11039S6r s6r = this.A02;
        Timer timer = s6r.A00;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        timer2.schedule(new C13260TSa(this.A01, this.A03), this.A00);
        s6r.A00 = timer2;
    }
}
