package X;

import java.io.File;

public final class TKF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ RF9 A02;
    public final /* synthetic */ C7341Q4r A03;
    public final /* synthetic */ File A04;

    public TKF(RF9 rf9, C7341Q4r q4r, File file, int i, long j) {
        this.A03 = q4r;
        this.A04 = file;
        this.A02 = rf9;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        this.A03.A00.DiZ(this.A02, this.A04, this.A00, this.A01);
    }
}
