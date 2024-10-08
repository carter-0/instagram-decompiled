package X;

import java.io.Serializable;

public final class Y1Q implements Serializable {
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.A00.equals(((Y1Q) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }
}
