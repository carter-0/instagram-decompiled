package X;

public abstract class RRB {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RRB);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A01(Long.MIN_VALUE, ((int) (0 >>> 32)) * 31) * 31 * 31;
    }
}
