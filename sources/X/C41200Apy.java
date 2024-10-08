package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Apy  reason: case insensitive filesystem */
public final /* synthetic */ class C41200Apy implements Runnable {
    public final /* synthetic */ AnonymousClass8GD A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C41200Apy(AnonymousClass8GD r1, Exception exc, Object obj, boolean z) {
        this.A03 = z;
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = exc;
    }

    public final void run() {
        boolean z = this.A03;
        AnonymousClass8GD r2 = this.A00;
        Object obj = this.A02;
        Exception exc = this.A01;
        if (z) {
            r2.A02(obj);
            return;
        }
        if (!(exc instanceof CancellationException)) {
            exc.getClass();
        }
        r2.A01(exc);
    }
}
