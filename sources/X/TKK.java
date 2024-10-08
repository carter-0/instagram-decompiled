package X;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class TKK implements Runnable {
    public final /* synthetic */ C10902S0c A00;
    public final /* synthetic */ C365498nD A01;
    public final /* synthetic */ C10272RpW A02;
    public final /* synthetic */ S26 A03;
    public final /* synthetic */ Callable A04;

    public /* synthetic */ TKK(C10902S0c s0c, C365498nD r2, C10272RpW rpW, S26 s26, Callable callable) {
        this.A03 = s26;
        this.A02 = rpW;
        this.A00 = s0c;
        this.A04 = callable;
        this.A01 = r2;
    }

    public final void run() {
        S26 s26 = this.A03;
        C10272RpW rpW = this.A02;
        C10902S0c s0c = this.A00;
        Callable callable = this.A04;
        C365498nD r3 = this.A01;
        AnonymousClass9GD r5 = rpW.A00;
        if (!r5.A0D()) {
            try {
                AtomicBoolean atomicBoolean = s26.A01;
                if (!atomicBoolean.get()) {
                    R2v r2v = (R2v) s26;
                    synchronized (r2v) {
                        r2v.A00.FPF();
                    }
                    atomicBoolean.set(true);
                }
                if (r5.A0D()) {
                    s0c.A00();
                    return;
                }
                Object call = callable.call();
                try {
                    if (r5.A0D()) {
                        s0c.A00();
                        return;
                    } else {
                        r3.A01(call);
                        return;
                    }
                } catch (Exception e) {
                    if (!r5.A0D()) {
                        r3.A00(e);
                        return;
                    }
                }
            } catch (RuntimeException e2) {
                throw new C8992RKk("Internal error has occurred when executing ML Kit tasks", (Throwable) e2);
            }
        }
        s0c.A00();
    }
}
