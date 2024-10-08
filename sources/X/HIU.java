package X;

public final class HIU extends HQ4 {
    public static final HIU A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof HIU);
    }

    public final int hashCode() {
        return 1128183703;
    }

    public final String toString() {
        return "ConsumeNavigationUpdate";
    }
}
