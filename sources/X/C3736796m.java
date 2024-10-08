package X;

import java.util.concurrent.Executor;

/* renamed from: X.96m  reason: invalid class name and case insensitive filesystem */
public final class C3736796m implements Runnable {
    public final /* synthetic */ C3736396i A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C3736796m(C3736396i r1, AnonymousClass9GD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            C3736396i r3 = this.A00;
            AnonymousClass9GD r2 = (AnonymousClass9GD) r3.A00.Ezj(this.A01);
            if (r2 == null) {
                r3.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AnonymousClass9GH.A01;
            r2.A04(r3, executor);
            r2.A0A(r3, executor);
            r2.A03.A00(new C3737296r(r3, executor));
            AnonymousClass9GD.A01(r2);
        } catch (AnonymousClass9GG e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            AnonymousClass9GD r1 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            r1.A0B(e);
        } catch (Exception e2) {
            this.A00.A01.A0B(e2);
        }
    }
}
