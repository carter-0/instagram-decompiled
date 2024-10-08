package X;

/* renamed from: X.LEl  reason: case insensitive filesystem */
public abstract class C63945LEl {
    public final Integer A00;
    public final int A01;

    public final int A00() {
        if (this instanceof KKH) {
            return ((KKH) this).A00;
        }
        if (this instanceof KKG) {
            return ((KKG) this).A00;
        }
        return this.A01;
    }

    public final String A01() {
        if (this instanceof KKF) {
            return ((KKF) this).A00;
        }
        if (this instanceof KKE) {
            return ((KKE) this).A00;
        }
        if (this instanceof KKD) {
            return ((KKD) this).A00;
        }
        if (this instanceof KKC) {
            return ((KKC) this).A00;
        }
        if (this instanceof KKH) {
            return ((KKH) this).A01;
        }
        return ((KKG) this).A01;
    }

    public C63945LEl(int i, Integer num) {
        this.A01 = i;
        this.A00 = num;
    }
}
