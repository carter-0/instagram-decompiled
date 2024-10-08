package X;

public final class RBD extends WZG {
    public final int A00;
    public final Object A01;

    public RBD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DZN() {
        if (this.A00 == 0) {
            DbS.A1U(this.A01);
        }
    }

    public final void onCancel() {
        if (this.A00 != 0) {
            ((SJD) this.A01).A00.finish();
        }
    }

    public final void onDismiss() {
        if (1 - this.A00 == 0) {
            ((SJD) this.A01).A00.finish();
        }
    }
}
