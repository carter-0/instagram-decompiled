package X;

import java.io.Serializable;
import java.util.Collection;

public final class T00 implements 1UV, Serializable {
    public final Collection A00;

    public final boolean apply(Object obj) {
        try {
            return this.A00.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T00) {
            return this.A00.equals(((T00) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public T00(Collection collection) {
        collection.getClass();
        this.A00 = collection;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Predicates.in(");
        return Pxg.A0q(this.A00, A1A);
    }
}
