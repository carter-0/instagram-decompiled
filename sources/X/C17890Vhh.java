package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Vhh  reason: case insensitive filesystem */
public final class C17890Vhh {
    public final VRM A00;
    public final VRN A01;
    public final C49671F1d A02;
    public final ExecutorService A03;
    public final C18724Vyy A04;

    public C17890Vhh(VRM vrm, VRN vrn, C49671F1d f1d, ExecutorService executorService, C18724Vyy vyy) {
        this.A02 = f1d;
        this.A01 = vrn;
        this.A00 = vrm;
        this.A03 = executorService;
        this.A04 = vyy;
    }

    public final void A00(EVX evx) {
        this.A03.execute(new C20265Wo4(0sr.A1L(new EVX[]{evx}), this));
    }
}
