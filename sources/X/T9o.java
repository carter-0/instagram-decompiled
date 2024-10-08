package X;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

public final class T9o implements Serializable {
    public static final T9o A05 = new T9o(Collections.emptySet(), false, false, false, true);
    public final Set A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public static T9o A00(Set set, boolean z, boolean z2, boolean z3) {
        return new T9o(set, z, z2, z3, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            T9o t9o = (T9o) obj;
            return this.A03 == t9o.A03 && this.A04 == t9o.A04 && this.A01 == t9o.A01 && this.A02 == t9o.A02 && this.A00.equals(t9o.A00);
        }
    }

    public final int hashCode() {
        int size = this.A00.size();
        int i = -3;
        if (this.A03) {
            i = 1;
        }
        int i2 = size + i;
        int i3 = -7;
        if (this.A01) {
            i3 = 3;
        }
        int i4 = i2 + i3;
        int i5 = -11;
        if (this.A02) {
            i5 = 7;
        }
        int i6 = i4 + i5;
        int i7 = -13;
        if (this.A04) {
            i7 = 11;
        }
        return i6 + i7;
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[]{this.A00, Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Boolean.valueOf(this.A02), Boolean.valueOf(this.A04)});
    }

    public T9o(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = set == null ? Collections.emptySet() : set;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }
}
