package X;

import java.util.Map;

public final class TKE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12381SsV A01;
    public final /* synthetic */ Exception A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public TKE(C12381SsV ssV, Exception exc, Map map, int i, boolean z) {
        this.A01 = ssV;
        this.A02 = exc;
        this.A04 = z;
        this.A00 = i;
        this.A03 = map;
    }

    public final void run() {
        C13727Tfx tfx = this.A01.A00;
        Exception exc = this.A02;
        boolean z = this.A04;
        tfx.DEh(exc, this.A03, this.A00, z);
    }
}
