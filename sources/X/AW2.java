package X;

import java.util.concurrent.Executor;

public final class AW2 implements C3736496j, C3736596k, C3736696l, AnonymousClass9GF {
    public final C41771B0a A00;
    public final AnonymousClass9GD A01;
    public final Executor A02;

    public AW2(C41771B0a b0a, AnonymousClass9GD r2, Executor executor) {
        this.A02 = executor;
        this.A00 = b0a;
        this.A01 = r2;
    }

    public final void D0c() {
        this.A01.A07();
    }

    public final void FPX(AnonymousClass9GD r3) {
        this.A02.execute(new C40980AmQ(this, r3));
    }

    public final void onFailure(Exception exc) {
        this.A01.A0B(exc);
    }

    public final void onSuccess(Object obj) {
        this.A01.A0C(obj);
    }
}
