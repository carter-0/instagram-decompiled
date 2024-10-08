package X;

public final class IZR implements C295005nO {
    public final int A00;
    public final int A01;
    public final Object A02;

    public IZR(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onFinish() {
        switch (this.A00) {
            case 0:
                C51967G9n.A0w(this.A01, (0sP) this.A02);
                return;
            case 1:
                double d = C7218Pzn.A0e;
                ((C7218Pzn) this.A02).A0X.DMu(this.A01);
                return;
            default:
                if (C55262Her.A00((0lg) this.A02).booleanValue() && this.A01 == 0) {
                    GBU.A07 = true;
                    C56658I6n.A00();
                    return;
                }
                return;
        }
    }
}
