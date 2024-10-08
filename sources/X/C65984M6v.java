package X;

import java.io.FileNotFoundException;

/* renamed from: X.M6v  reason: case insensitive filesystem */
public final class C65984M6v implements Runnable {
    public final /* synthetic */ C64144LQg A00;
    public final /* synthetic */ FileNotFoundException A01;

    public C65984M6v(C64144LQg lQg, FileNotFoundException fileNotFoundException) {
        this.A00 = lQg;
        this.A01 = fileNotFoundException;
    }

    public final void run() {
        this.A00.A07.A02(this.A01);
    }
}
