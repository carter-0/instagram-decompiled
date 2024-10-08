package X;

import java.util.Set;

/* renamed from: X.Qw9  reason: case insensitive filesystem */
public abstract class C8513Qw9 extends C13242TRi implements Set {
    public transient C8518QwE A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0E : this) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }
}
