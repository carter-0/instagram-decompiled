package X;

import java.util.Queue;

/* renamed from: X.AlA  reason: case insensitive filesystem */
public final /* synthetic */ class C40902AlA implements Runnable {
    public final /* synthetic */ C230712q4 A00;

    public /* synthetic */ C40902AlA(C230712q4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        Queue<1Ln> queue = this.A00.A00;
        synchronized (queue) {
            for (1Ln r2 : queue) {
                r2.A0R(AnonymousClass000.A00(5277), AnonymousClass000.A00(5312));
                r2.Cgf();
            }
            queue.clear();
        }
    }
}
