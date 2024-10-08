package X;

/* renamed from: X.5V9  reason: invalid class name */
public final class AnonymousClass5V9 {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof AnonymousClass5V9) || i != ((AnonymousClass5V9) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (this.A00 == 1) {
            return "Touch";
        }
        return "Keyboard";
    }

    public /* synthetic */ AnonymousClass5V9(int i) {
        this.A00 = i;
    }
}
