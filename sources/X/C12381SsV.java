package X;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.SsV  reason: case insensitive filesystem */
public final class C12381SsV implements C13727Tfx {
    public final C13727Tfx A00;
    public final ExecutorService A01;

    public final void D5I(String str, int i, Map map) {
        this.A01.execute(new C13057TJn(this, str, map, i));
    }

    public final void DEh(Exception exc, Map map, int i, boolean z) {
        this.A01.execute(new TKE(this, exc, map, i, z));
    }

    public C12381SsV(C13727Tfx tfx, ExecutorService executorService) {
        this.A00 = tfx;
        this.A01 = executorService;
    }
}
