package X;

import java.io.Serializable;

public final class TAF implements Comparable, Serializable {
    public String A00;
    public int A01;
    public Class A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && obj.getClass() == getClass() && ((TAF) obj).A02 == this.A02;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((TAF) obj).A00);
    }

    public final int hashCode() {
        return this.A01;
    }

    public final String toString() {
        return this.A00;
    }

    public TAF(Class cls) {
        this.A02 = cls;
        String name = cls.getName();
        this.A00 = name;
        this.A01 = name.hashCode();
    }

    public TAF() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = 0;
    }
}
