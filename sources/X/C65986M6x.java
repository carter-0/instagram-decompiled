package X;

import java.io.IOException;

/* renamed from: X.M6x  reason: case insensitive filesystem */
public final class C65986M6x implements Runnable {
    public final /* synthetic */ C66478MTg A00;
    public final /* synthetic */ IOException A01;

    public C65986M6x(C66478MTg mTg, IOException iOException) {
        this.A00 = mTg;
        this.A01 = iOException;
    }

    public final void run() {
        this.A00.DEa(this.A01);
    }
}
