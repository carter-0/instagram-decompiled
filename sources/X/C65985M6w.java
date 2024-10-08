package X;

import java.io.File;

/* renamed from: X.M6w  reason: case insensitive filesystem */
public final class C65985M6w implements Runnable {
    public final /* synthetic */ C66478MTg A00;
    public final /* synthetic */ File A01;

    public C65985M6w(C66478MTg mTg, File file) {
        this.A00 = mTg;
        this.A01 = file;
    }

    public final void run() {
        this.A00.Dob(this.A01);
    }
}
