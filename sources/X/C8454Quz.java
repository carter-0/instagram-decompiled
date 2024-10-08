package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.Quz  reason: case insensitive filesystem */
public final class C8454Quz extends C13098TLf implements Serializable {
    public final Comparator A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8454Quz) {
            return this.A00.equals(((C8454Quz) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C8454Quz(Comparator comparator) {
        comparator.getClass();
        this.A00 = comparator;
    }
}
