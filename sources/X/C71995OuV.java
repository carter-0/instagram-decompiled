package X;

/* renamed from: X.OuV  reason: case insensitive filesystem */
public final class C71995OuV implements C3030867i {
    public final int A00;
    public final Object A01;

    public C71995OuV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void cancel() {
        switch (this.A00) {
            case 0:
                1OC r2 = (1OC) this.A01;
                r2.A00 = new C68514NLl(1);
                r2.cancel();
                return;
            case 1:
                ((C67620Mqs) this.A01).A01.cancel(true);
                return;
            default:
                ((C67195Mjr) this.A01).A03.A01();
                return;
        }
    }
}
