package X;

import java.io.Serializable;

public final class SyF implements C13641Te8, Serializable {
    public final Object A00;

    public SyF(Object obj) {
        this.A00 = obj;
    }

    public final Object FP1() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SyF)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((SyF) obj).A00;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public final String toString() {
        return 002.A0g("Suppliers.ofInstance(", this.A00.toString(), ")");
    }
}
