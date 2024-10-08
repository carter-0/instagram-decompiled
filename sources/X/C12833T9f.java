package X;

import java.io.Serializable;
import java.util.Set;

/* renamed from: X.T9f  reason: case insensitive filesystem */
public final class C12833T9f implements Serializable {
    public static final C12833T9f A01 = new C12833T9f((Set) null);
    public final Set A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Set set = this.A00;
            Set set2 = ((C12833T9f) obj).A00;
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
            } else if (set.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.A00;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", new Object[]{this.A00});
    }

    public C12833T9f(Set set) {
        this.A00 = set;
    }
}
