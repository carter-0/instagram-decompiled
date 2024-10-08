package X;

/* renamed from: X.5aV  reason: invalid class name and case insensitive filesystem */
public final class C287625aV {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C287625aV) || i != ((C287625aV) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        if (i == 6) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public /* synthetic */ C287625aV(int i) {
        this.A00 = i;
    }
}
