package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Sr8  reason: case insensitive filesystem */
public final class C12305Sr8 implements C13778Tgt {
    public boolean A00;
    public final Object A01 = Pxe.A0p();
    public volatile STN A02;

    public final void cancel() {
        AG6((String) null);
    }

    public final void AG6(String str) {
        STN stn = this.A02;
        if (stn != null) {
            synchronized (stn) {
            }
            ExecutorService executorService = stn.A0P;
            if (executorService != null) {
                executorService.execute(new C12910TCz(stn));
            }
            this.A02 = null;
        }
    }

    public final void FNH() {
        Object obj = this.A01;
        synchronized (obj) {
            if (!this.A00) {
                obj.wait();
            }
        }
    }

    public C12305Sr8(STN stn) {
        this.A02 = stn;
    }
}
