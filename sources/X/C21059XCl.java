package X;

import java.util.concurrent.Executor;

/* renamed from: X.XCl  reason: case insensitive filesystem */
public final class C21059XCl implements Executor {
    public final int A00;

    public C21059XCl(int i) {
        this.A00 = i;
    }

    public final void execute(Runnable runnable) {
        switch (this.A00) {
            case 0:
                C21057XCj.A00().A02(runnable);
                return;
            case 1:
                C21057XCj.A00().A01(runnable);
                return;
            case 2:
                C11424STg.A02().post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
