package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Q4r  reason: case insensitive filesystem */
public final class C7341Q4r implements C13835TiA {
    public final C13835TiA A00;
    public final ExecutorService A01;

    public final void D0g(SJL sjl) {
        0qQ.A0B(sjl, 0);
        this.A01.execute(new C12969TGc(sjl, this));
    }

    public final void DiZ(RF9 rf9, File file, int i, long j) {
        0qQ.A0B(file, 0);
        RF9 rf92 = rf9;
        this.A01.execute(new TKF(rf92, this, file, i, j));
    }

    public final void DiX(RF9 rf9, float f) {
        this.A01.execute(new C7342Q4s(rf9, this, f));
    }

    public final void Dib(SRW srw, RF9 rf9, int i) {
        this.A01.execute(new C13058TJo(srw, rf9, this, i));
    }

    public final void onStart() {
        this.A01.execute(new TD1(this));
    }

    public final void onSuccess() {
        this.A01.execute(new TD2(this));
    }

    public C7341Q4r(C13835TiA tiA, ExecutorService executorService) {
        this.A00 = tiA;
        this.A01 = executorService;
    }

    public final void DDC(AnonymousClass4ZS r3, SJL sjl) {
        AnonymousClass7TG.A1N(r3, sjl);
        this.A01.execute(new C13035TIr(r3, sjl, this));
    }
}
