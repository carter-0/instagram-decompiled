package X;

public final class Xno {
    public boolean A00;
    public final YB5 A01;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A00 = true;
            notifyAll();
        }
    }

    public Xno(YB5 yb5) {
        this.A01 = yb5;
    }

    public Xno() {
        this(YB5.A00);
    }
}
