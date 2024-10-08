package X;

/* renamed from: X.8RG  reason: invalid class name */
public final class AnonymousClass8RG extends AnonymousClass8RH {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8RG) && this.A00 == ((AnonymousClass8RG) obj).A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnSelected(canAddTransition=");
        sb.append(this.A00);
        sb.append(", canTapToCut=");
        sb.append(false);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return (i * 31) + C54732HQn.A00();
    }

    public AnonymousClass8RG(boolean z) {
        this.A00 = z;
    }

    public AnonymousClass8RG() {
        this(false);
    }
}
