package X;

public final class WG5 implements X7Q {
    public final /* synthetic */ W1n A00;

    public WG5(W1n w1n) {
        this.A00 = w1n;
    }

    public final int Asq() {
        W1n w1n = this.A00;
        int BHc = w1n.A06.BHc();
        int BHR = w1n.A06.BHR();
        float height = w1n.A03.height();
        int i = w1n.A01;
        if (!(i == 1 || i == 3)) {
            BHc = BHR;
        }
        return (int) (((float) BHc) * height);
    }

    public final int Asw() {
        W1n w1n = this.A00;
        int BHc = w1n.A06.BHc();
        int BHR = w1n.A06.BHR();
        float width = w1n.A03.width();
        int i = w1n.A01;
        if (i == 1 || i == 3) {
            BHc = BHR;
        }
        return (int) (((float) BHc) * width);
    }

    public final C365468nA Avy() {
        return this.A00.A06.Bnc();
    }
}
