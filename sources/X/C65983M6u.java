package X;

import java.io.IOException;

/* renamed from: X.M6u  reason: case insensitive filesystem */
public final class C65983M6u implements Runnable {
    public final /* synthetic */ C64144LQg A00;
    public final /* synthetic */ IOException A01;

    public C65983M6u(C64144LQg lQg, IOException iOException) {
        this.A00 = lQg;
        this.A01 = iOException;
    }

    public final void run() {
        this.A00.A07.A02(this.A01);
    }
}
