package X;

import java.io.File;

/* renamed from: X.M5n  reason: case insensitive filesystem */
public final class C65950M5n implements Runnable {
    public final /* synthetic */ C15331Uag A00;
    public final /* synthetic */ File A01;

    public C65950M5n(C15331Uag uag, File file) {
        this.A00 = uag;
        this.A01 = file;
    }

    public final void run() {
        C15331Uag.A00(this.A00, this.A01, "image");
    }
}
