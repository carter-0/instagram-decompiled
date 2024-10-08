package X;

import java.io.Serializable;

public final class T03 implements 1UV, Serializable {
    public final AnonymousClass2hV A00;
    public final 1UV A01;

    public final boolean apply(Object obj) {
        return this.A01.apply(this.A00.apply(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T03)) {
            return false;
        }
        T03 t03 = (T03) obj;
        if (!this.A00.equals(t03.A00) || !this.A01.equals(t03.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public T03(AnonymousClass2hV r1, 1UV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("(");
        return Pxg.A0q(this.A00, A1A);
    }
}
