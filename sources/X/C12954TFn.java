package X;

import android.os.Process;

/* renamed from: X.TFn  reason: case insensitive filesystem */
public final class C12954TFn implements Runnable {
    public final /* synthetic */ 1Ti A00;
    public final /* synthetic */ Runnable A01;

    public C12954TFn(1Ti r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
        } catch (Throwable unused) {
        }
        this.A01.run();
    }
}
