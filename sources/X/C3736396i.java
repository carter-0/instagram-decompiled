package X;

import java.util.concurrent.Executor;

/* renamed from: X.96i  reason: invalid class name and case insensitive filesystem */
public final class C3736396i implements C3736496j, C3736596k, C3736696l, AnonymousClass9GF {
    public final C3736296h A00;
    public final AnonymousClass9GD A01;
    public final Executor A02;

    public C3736396i(C3736296h r1, AnonymousClass9GD r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void D0c() {
        this.A01.A07();
    }

    public final void FPX(AnonymousClass9GD r3) {
        this.A02.execute(new C3736796m(this, r3));
    }

    public final void onFailure(Exception exc) {
        this.A01.A0B(exc);
    }

    public final void onSuccess(Object obj) {
        this.A01.A0C(obj);
    }
}
