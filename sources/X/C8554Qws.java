package X;

import java.util.Set;

/* renamed from: X.Qws  reason: case insensitive filesystem */
public abstract class C8554Qws extends C13245TRl implements Set {
    public transient C8553Qwr A00;

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

    public C8553Qwr A09() {
        C8553Qwr qwr = this.A00;
        if (qwr != null) {
            return qwr;
        }
        C8553Qwr A0A = A0A();
        this.A00 = A0A;
        return A0A;
    }

    public C8553Qwr A0A() {
        Object[] array = toArray();
        return C8553Qwr.A03(array, array.length);
    }

    public final int hashCode() {
        return C9724Rfh.A00(this);
    }
}
