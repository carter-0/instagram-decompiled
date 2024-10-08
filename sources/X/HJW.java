package X;

public final class HJW extends HQE {
    public static final HJW A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof HJW);
    }

    public final int hashCode() {
        return -1210187353;
    }

    public final String toString() {
        return "InitialLoadComplete";
    }
}
