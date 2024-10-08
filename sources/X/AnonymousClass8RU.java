package X;

/* renamed from: X.8RU  reason: invalid class name */
public final class AnonymousClass8RU extends AnonymousClass8RH {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8RU) && this.A00 == ((AnonymousClass8RU) obj).A00);
    }

    public final String toString() {
        return 002.A0L("Reorder(isDragged=", ')', this.A00);
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AnonymousClass8RU(boolean z) {
        this.A00 = z;
    }
}
