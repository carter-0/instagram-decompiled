package X;

import java.util.concurrent.Callable;

public final /* synthetic */ class THL implements Runnable {
    public final /* synthetic */ C365498nD A00;
    public final /* synthetic */ Callable A01;

    public /* synthetic */ THL(C365498nD r1, Callable callable) {
        this.A01 = callable;
        this.A00 = r1;
    }

    public final void run() {
        Callable callable = this.A01;
        C365498nD r3 = this.A00;
        try {
            r3.A01(callable.call());
        } catch (C8992RKk e) {
            e = e;
            r3.A00(e);
        } catch (Exception e2) {
            e = new C8992RKk("Internal error has occurred when executing ML Kit tasks", (Throwable) e2);
            r3.A00(e);
        }
    }
}
