package X;

public final class WG6 implements X7Q {
    public final /* synthetic */ W1n A00;

    public WG6(W1n w1n) {
        this.A00 = w1n;
    }

    public final int Asq() {
        W1n w1n = this.A00;
        C367508qr A002 = w1n.A0E.A00(w1n.A06.Bnc(), w1n.A06.BHc(), w1n.A06.BHR());
        int i = A002.A01;
        int i2 = A002.A00;
        float height = w1n.A03.height();
        int i3 = w1n.A01;
        if (!(i3 == 1 || i3 == 3)) {
            i = i2;
        }
        return (int) (((float) i) * height);
    }

    public final int Asw() {
        W1n w1n = this.A00;
        C367508qr A002 = w1n.A0E.A00(w1n.A06.Bnc(), w1n.A06.BHc(), w1n.A06.BHR());
        int i = A002.A01;
        int i2 = A002.A00;
        float width = w1n.A03.width();
        int i3 = w1n.A01;
        if (i3 == 1 || i3 == 3) {
            i = i2;
        }
        return (int) (((float) i) * width);
    }

    public final C365468nA Avy() {
        return this.A00.A06.Bnc();
    }
}
