package X;

/* renamed from: X.TyX  reason: case insensitive filesystem */
public abstract class C14568TyX {
    public final C46626Di6 A00;
    public final X5O A01;

    public C46626Di6 A00() {
        return this.A00;
    }

    public X5O A01() {
        if (this instanceof C14578Tyi) {
            return ((C14578Tyi) this).A01;
        }
        if (this instanceof C16400UuI) {
            return ((C16400UuI) this).A01;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public Boolean A02() {
        boolean z;
        if (this instanceof C14578Tyi) {
            z = ((C14578Tyi) this).A02;
        } else if (this instanceof C16400UuI) {
            z = ((C16400UuI) this).A02;
        } else {
            throw AnonymousClass00P.createAndThrow();
        }
        return Boolean.valueOf(z);
    }

    public Integer A03() {
        if (this instanceof C16399UuH) {
            return ((C16399UuH) this).A00;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public Integer A04() {
        int i;
        if (this instanceof C14578Tyi) {
            i = ((C14578Tyi) this).A00;
        } else if (this instanceof C16400UuI) {
            i = ((C16400UuI) this).A00;
        } else {
            throw AnonymousClass00P.createAndThrow();
        }
        return Integer.valueOf(i);
    }

    public C14568TyX(C46626Di6 di6, X5O x5o) {
        this.A01 = x5o;
        this.A00 = di6;
    }
}
