package X;

import java.io.Serializable;

public abstract class T9D implements Serializable {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public final Object A01() {
        if (this instanceof C7861Qbl) {
            return ((C7861Qbl) this).A00;
        }
        throw AnonymousClass7TE.A0z("Optional.get() cannot be called on an absent value");
    }
}
