package X;

public final class TFK implements Runnable {
    public final /* synthetic */ C7355Q6k A00;
    public final /* synthetic */ boolean A01;

    public TFK(C7355Q6k q6k, boolean z) {
        this.A00 = q6k;
        this.A01 = z;
    }

    public final void run() {
        C7355Q6k q6k = this.A00;
        boolean z = this.A01;
        C11424STg.A04();
        C10660Rvu rvu = (C10660Rvu) q6k.A01;
        boolean z2 = rvu.A00;
        rvu.A00 = z;
        if (z2 != z) {
            rvu.A02.D5r(z);
        }
    }
}
