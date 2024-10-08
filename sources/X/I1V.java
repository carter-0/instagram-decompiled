package X;

public final class I1V {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        if (i == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof I1V) || i != ((I1V) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ I1V(int i) {
        this.A00 = i;
    }
}
