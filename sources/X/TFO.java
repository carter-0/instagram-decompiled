package X;

import java.util.List;

public final class TFO implements Runnable {
    public final /* synthetic */ Q93 A00;
    public final /* synthetic */ String A01;

    public TFO(Q93 q93, String str) {
        this.A00 = q93;
        this.A01 = str;
    }

    public final void run() {
        List<C13549TcL> list = this.A00.A05;
        synchronized (list) {
            for (C13549TcL Dvu : list) {
                Dvu.Dvu(this.A01);
            }
        }
    }
}
