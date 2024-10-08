package X;

public final class KNW extends KNP {
    public static final KNW A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof KNW);
    }

    public final int hashCode() {
        return 1052515148;
    }

    public final String toString() {
        return "OnAdjustBackPressed";
    }
}
