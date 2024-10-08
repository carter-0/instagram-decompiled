package X;

/* renamed from: X.XEc  reason: case insensitive filesystem */
public final class C21089XEc {
    public final int A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C21089XEc) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 * 31;
    }

    public C21089XEc(int i) {
        this.A00 = i;
    }
}
