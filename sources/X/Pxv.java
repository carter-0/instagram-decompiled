package X;

import java.util.Map;

public final class Pxv implements Map.Entry {
    public Pxv A00;
    public Pxv A01;
    public final Object A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pxv)) {
            return false;
        }
        Pxv pxv = (Pxv) obj;
        return this.A02.equals(pxv.A02) && this.A03.equals(pxv.A03);
    }

    public final Object getKey() {
        return this.A02;
    }

    public final Object getValue() {
        return this.A03;
    }

    public final int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    public final Object setValue(Object obj) {
        throw AnonymousClass7TE.A1B("An entry modification is not supported");
    }

    public Pxv(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A02);
        A1A.append("=");
        return AnonymousClass7TF.A0i(this.A03, A1A);
    }
}
