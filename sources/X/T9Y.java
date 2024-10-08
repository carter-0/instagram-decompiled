package X;

import java.io.Serializable;

public final class T9Y implements Serializable {
    public String A00;
    public final Class A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            T9Y t9y = (T9Y) obj;
            if (this.A01 != t9y.A01 || !2Ob.A00(this.A00, t9y.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A02;
    }

    public final String toString() {
        String A0g;
        String name = this.A01.getName();
        String str = this.A00;
        if (str == null) {
            A0g = "null";
        } else {
            A0g = 002.A0g("'", str, "'");
        }
        return 002.A11("[NamedType, class ", name, ", name: ", A0g, "]");
    }

    public T9Y(Class cls, String str) {
        this.A01 = cls;
        this.A02 = cls.getName().hashCode() + AnonymousClass7TG.A0E(str);
        this.A00 = (str == null || str.isEmpty()) ? null : str;
    }
}
