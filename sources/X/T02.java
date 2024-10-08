package X;

import java.io.Serializable;

public final class T02 implements 1UV, Serializable {
    public final 1UV A00;

    public final boolean apply(Object obj) {
        return !this.A00.apply(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T02) {
            return this.A00.equals(((T02) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ -1;
    }

    public T02(1UV r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Predicates.not(");
        return Pxg.A0q(this.A00, A1A);
    }
}
