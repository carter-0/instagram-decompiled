package X;

public final class I1T {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        if (i == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof I1T) || i != ((I1T) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ I1T(int i) {
        this.A00 = i;
    }
}
