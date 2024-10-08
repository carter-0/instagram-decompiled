package X;

import java.util.concurrent.Callable;

/* renamed from: X.5g0  reason: invalid class name and case insensitive filesystem */
public final class C290815g0 implements AnonymousClass11X {
    public 2Cn A00;
    public final int A01;
    public final 1GK A02;

    public final String getName() {
        return "ListenableTask";
    }

    public final void onCancel() {
    }

    public final int getRunnableId() {
        return this.A01;
    }

    public final void onFinish() {
        2Cn r2 = this.A00;
        if (r2 != null) {
            r2.onFinish();
            1GK r1 = this.A02;
            if (!r1.A0D()) {
                r2.onSuccess(r1.A07());
                return;
            }
            Exception A06 = r1.A06();
            0qQ.A0A(A06);
            r2.onFail(A06);
        }
    }

    public final void onStart() {
        2Cn r0 = this.A00;
        if (r0 != null) {
            r0.onStart();
        }
    }

    public final void run() {
        this.A02.run();
    }

    public C290815g0(Callable callable, int i) {
        this.A01 = i;
        this.A02 = new C268414dM(callable, i);
    }
}
