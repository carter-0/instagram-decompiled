package X;

import com.fbpay.ptt.impl.javacpp.PttImpl;
import java.util.Map;
import java.util.concurrent.Executor;

public final class S2R {
    public final /* synthetic */ C13617Tdj A00;
    public final /* synthetic */ C11246SHg A01;
    public final /* synthetic */ PttImpl A02;
    public final /* synthetic */ Executor A03;

    public final void A00(Throwable th, Map map) {
        Executor executor;
        Runnable tkg;
        Throwable th2 = th;
        if (th == null) {
            executor = this.A01.A01;
            tkg = new C12987TGu(this, map);
        } else {
            C11246SHg sHg = this.A01;
            C13617Tdj tdj = this.A00;
            executor = this.A03;
            tkg = new TKG(tdj, sHg, (Object) null, (String) null, th2);
        }
        executor.execute(tkg);
    }

    public S2R(C13617Tdj tdj, C11246SHg sHg, PttImpl pttImpl, Executor executor) {
        this.A01 = sHg;
        this.A02 = pttImpl;
        this.A00 = tdj;
        this.A03 = executor;
    }
}
