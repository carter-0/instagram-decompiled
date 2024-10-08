package X;

/* renamed from: X.8RW  reason: invalid class name */
public final class AnonymousClass8RW extends AnonymousClass8RS implements AnonymousClass8RT {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8RW) && this.A00 == ((AnonymousClass8RW) obj).A00);
    }

    public final int hashCode() {
        return this.A00 * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Speed(segmentIndex=");
        sb.append(this.A00);
        sb.append(", recordingSpeed=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8RW(int i) {
        this.A00 = i;
    }
}
