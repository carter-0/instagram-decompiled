package X;

public final class HIC extends HQ2 {
    public static final HIC A00 = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof HIC);
    }

    public final int hashCode() {
        return -154571434;
    }

    public final String toString() {
        return "SuggestionsSearchScreen";
    }
}
