package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Xvt  reason: case insensitive filesystem */
public final class C22129Xvt implements Y95 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C22129Xvt(Y95 y95, XtE xtE, C21496Xcu xcu, Executor executor, int i) {
        this.A00 = i;
        this.A01 = xtE;
        this.A03 = xcu;
        this.A02 = y95;
        this.A04 = executor;
    }

    public final /* bridge */ /* synthetic */ Object Ezi(XtE xtE) {
        int i = this.A00;
        C21496Xcu xcu = (C21496Xcu) this.A03;
        Object obj = this.A02;
        if (i != 0) {
            Y95 y95 = (Y95) obj;
            Executor executor = (Executor) this.A04;
            ExecutorService executorService = XtE.A0C;
            try {
                executor.execute(new TI5(y95, xtE, xcu));
                return null;
            } catch (Exception e) {
                xcu.A01(new RuntimeException("An exception was thrown by an Executor", e));
                return null;
            }
        } else {
            Y95 y952 = (Y95) obj;
            Executor executor2 = (Executor) this.A04;
            ExecutorService executorService2 = XtE.A0C;
            try {
                executor2.execute(new Y32(y952, xtE, xcu));
                return null;
            } catch (Exception e2) {
                xcu.A01(new RuntimeException("An exception was thrown by an Executor", e2));
                return null;
            }
        }
    }
}
