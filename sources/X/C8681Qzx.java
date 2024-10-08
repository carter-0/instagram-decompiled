package X;

import java.util.Set;

/* renamed from: X.Qzx  reason: case insensitive filesystem */
public abstract class C8681Qzx<E> extends 28x<E> implements Set<E> {
    public final int hashCode() {
        Set set;
        if (this instanceof Qzv) {
            set = ((Qzv) this).A00.A00;
        } else {
            set = ((Qzw) this).A00;
        }
        return set.hashCode();
    }

    public final boolean equals(Object obj) {
        Set set;
        if (obj != this) {
            if (this instanceof Qzv) {
                set = ((Qzv) this).A00.A00;
            } else {
                set = ((Qzw) this).A00;
            }
            if (set.equals(obj)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
