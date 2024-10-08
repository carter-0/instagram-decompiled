package X;

import java.util.concurrent.Callable;

public final class THC implements Runnable {
    public final /* synthetic */ AnonymousClass9GD A00;
    public final /* synthetic */ Callable A01;

    public THC(AnonymousClass9GD r1, Callable callable) {
        this.A00 = r1;
        this.A01 = callable;
    }

    public final void run() {
        try {
            this.A00.A0C(this.A01.call());
        } catch (Exception e) {
            this.A00.A0B(e);
        } catch (Throwable th) {
            this.A00.A0B(C41845B3m.A0j(th));
        }
    }
}
