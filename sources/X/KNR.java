package X;

public final class KNR extends KNS {
    public static final KNR A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof KNR);
    }

    public final int hashCode() {
        return 3382795;
    }

    public final String toString() {
        return "OnAdjustBackPressed";
    }
}
