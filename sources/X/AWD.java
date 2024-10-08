package X;

import java.util.concurrent.Executor;

public final class AWD implements AnonymousClass9GF {
    public final C3736296h A00;
    public final AnonymousClass9GD A01;
    public final Executor A02;

    public AWD(C3736296h r1, AnonymousClass9GD r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void FPX(AnonymousClass9GD r3) {
        this.A02.execute(new C40978AmO(this, r3));
    }
}
