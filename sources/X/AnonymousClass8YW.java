package X;

/* renamed from: X.8YW  reason: invalid class name */
public final class AnonymousClass8YW extends AnonymousClass8YP {
    public final AnonymousClass51M A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8YW) && 0qQ.A0K(this.A00, ((AnonymousClass8YW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveFirstFrameEvent(videoSegment=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8YW(AnonymousClass51M r1) {
        this.A00 = r1;
    }
}
