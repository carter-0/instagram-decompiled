package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class S26 {
    public final SOD A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AtomicInteger A02 = new AtomicInteger(0);

    public final AnonymousClass9GD A01(C10272RpW rpW, Callable callable, Executor executor) {
        if (this.A02.get() > 0) {
            C10272RpW rpW2 = rpW;
            if (rpW.A00.A0D()) {
                AnonymousClass9GD r0 = new AnonymousClass9GD();
                r0.A07();
                return r0;
            }
            C10902S0c s0c = new C10902S0c();
            C365498nD r4 = new C365498nD(s0c.A00);
            this.A00.A02(new TKK(s0c, r4, rpW2, this, callable), new C13166TNy(s0c, r4, rpW, executor));
            return r4.A00;
        }
        throw Pxe.A0i();
    }

    public S26(SOD sod) {
        this.A00 = sod;
    }
}
