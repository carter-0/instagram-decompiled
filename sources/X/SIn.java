package X;

public final class SIn {
    public static final SIn A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SIn);
    }

    public final int hashCode() {
        return 355119173;
    }

    public final String toString() {
        return "AuthenticationNotSet";
    }
}
