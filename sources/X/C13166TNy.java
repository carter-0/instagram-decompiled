package X;

import java.util.concurrent.Executor;

/* renamed from: X.TNy  reason: case insensitive filesystem */
public final /* synthetic */ class C13166TNy implements Executor {
    public final /* synthetic */ C10902S0c A00;
    public final /* synthetic */ C365498nD A01;
    public final /* synthetic */ C10272RpW A02;
    public final /* synthetic */ Executor A03;

    public /* synthetic */ C13166TNy(C10902S0c s0c, C365498nD r2, C10272RpW rpW, Executor executor) {
        this.A03 = executor;
        this.A02 = rpW;
        this.A00 = s0c;
        this.A01 = r2;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.A03;
        C10272RpW rpW = this.A02;
        C10902S0c s0c = this.A00;
        C365498nD r2 = this.A01;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            if (rpW.A00.A0D()) {
                s0c.A00();
                throw e;
            } else {
                r2.A00(e);
                throw e;
            }
        }
    }
}
