package X;

import android.os.Process;

/* renamed from: X.Wud  reason: case insensitive filesystem */
public final class C20562Wud extends Thread {
    public final /* synthetic */ VQX A00;

    public C20562Wud(VQX vqx) {
        this.A00 = vqx;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ((C20368Wq8) this.A00.A00.take()).run();
            } catch (InterruptedException unused) {
            }
        }
    }
}
