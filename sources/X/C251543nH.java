package X;

import java.util.ArrayDeque;

/* renamed from: X.3nH  reason: invalid class name and case insensitive filesystem */
public final class C251543nH implements C251513nE {
    public final int A00;
    public final C251513nE A01;
    public final /* synthetic */ C251483nB A02;

    public C251543nH(C251513nE r1, C251483nB r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void Dzt(boolean z) {
        this.A01.Dzt(z);
    }

    public final void onExit() {
        Runnable runnable;
        int i = this.A00;
        C251483nB r2 = this.A02;
        synchronized (r2) {
            C251533nG r1 = (C251533nG) r2.A01.get(i);
            if (r1 != null) {
                r1.A00 = null;
                r1.A00 = null;
                ArrayDeque arrayDeque = r1.A01;
                if (!(arrayDeque == null || (runnable = (Runnable) arrayDeque.poll()) == null)) {
                    runnable.run();
                }
            }
            this.A01.onExit();
        }
    }
}
