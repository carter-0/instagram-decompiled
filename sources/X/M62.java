package X;

import java.io.IOException;

public final class M62 implements Runnable {
    public final /* synthetic */ MTS A00;
    public final /* synthetic */ IOException A01;

    public M62(MTS mts, IOException iOException) {
        this.A00 = mts;
        this.A01 = iOException;
    }

    public final void run() {
        this.A00.onFailure(this.A01);
    }
}
