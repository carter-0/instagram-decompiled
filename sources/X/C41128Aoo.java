package X;

import java.io.File;

/* renamed from: X.Aoo  reason: case insensitive filesystem */
public final class C41128Aoo implements Runnable {
    public final /* synthetic */ 1LH A00;
    public final /* synthetic */ 1LV A01;
    public final /* synthetic */ File A02;

    public C41128Aoo(1LH r1, 1LV r2, File file) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = file;
    }

    public final void run() {
        1Lh r2 = this.A00;
        if ((r2 instanceof 1Lh) && r2.A00) {
            1LV r1 = this.A01;
            File file = this.A02;
            synchronized (r2) {
                0qQ.A0A(file);
                r1.A03(r2, file);
            }
        }
    }
}
