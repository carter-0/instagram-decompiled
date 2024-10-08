package X;

public final class HJV extends HQE {
    public static final HJV A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof HJV);
    }

    public final int hashCode() {
        return -1873036608;
    }

    public final String toString() {
        return "EmptyState";
    }
}
