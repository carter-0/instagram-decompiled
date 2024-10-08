package X;

import java.io.Serializable;

/* renamed from: X.4el  reason: invalid class name and case insensitive filesystem */
public final class C269214el implements Serializable {
    public static final C269214el A02;
    public final C269224em A00;
    public final C269224em A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C269214el r5 = (C269214el) obj;
            if (!(r5.A01 == this.A01 && r5.A00 == this.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C269224em r1 = C269224em.DEFAULT;
        A02 = new C269214el(r1, r1);
    }

    public final int hashCode() {
        return this.A01.ordinal() + (this.A00.ordinal() << 2);
    }

    public final String toString() {
        return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", new Object[]{this.A01, this.A00});
    }

    public C269214el(C269224em r1, C269224em r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
