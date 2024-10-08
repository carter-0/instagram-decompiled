package X;

import java.io.File;

public final /* synthetic */ class M51 implements Runnable {
    public final /* synthetic */ File A00;

    public /* synthetic */ M51(File file) {
        this.A00 = file;
    }

    public final void run() {
        this.A00.mkdirs();
    }
}
