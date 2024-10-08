package X;

import java.io.Serializable;

public final class T01 implements 1UV, Serializable {
    public final Object A00 = Object.class;

    public final boolean apply(Object obj) {
        return Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T01)) {
            return false;
        }
        Class<Object> cls = Object.class;
        return cls.equals(cls);
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Predicates.equalTo(");
        return Pxg.A0q(Object.class, A1A);
    }
}
