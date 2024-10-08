package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3pU  reason: invalid class name and case insensitive filesystem */
public abstract class C252673pU extends AnonymousClass4D9 implements C249513ju {
    public final C249513ju A00;

    public C252673pU(C262094Cc r2, C249513ju r3, boolean z) {
        super(r2, z, true);
        this.A00 = r3;
    }

    public final boolean AI3(Throwable th) {
        return this.A00.AI3(th);
    }

    public final AnonymousClass38B BY2() {
        return this.A00.BY2();
    }

    public final AnonymousClass38B BY3() {
        return this.A00.BY3();
    }

    public final void CO2(0sP r2) {
        this.A00.CO2(r2);
    }

    public final boolean CQF() {
        return this.A00.CQF();
    }

    public final boolean CQG() {
        return this.A00.CQG();
    }

    public final AnonymousClass1IT CfF() {
        return this.A00.CfF();
    }

    public final Object E6v(AnonymousClass4D7 r2) {
        return this.A00.E6v(r2);
    }

    public final Object E6w(AnonymousClass4D7 r2) {
        return this.A00.E6w(r2);
    }

    public final Object ELH(Object obj, AnonymousClass4D7 r3) {
        return this.A00.ELH(obj, r3);
    }

    public final Object FIE() {
        return this.A00.FIE();
    }

    public final Object FIG(Object obj) {
        return this.A00.FIG(obj);
    }

    public final void AG7(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C250473lV(A0F(), (Throwable) null, this);
            }
            A0L(cancellationException);
        }
    }
}
