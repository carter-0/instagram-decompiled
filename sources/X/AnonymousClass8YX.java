package X;

/* renamed from: X.8YX  reason: invalid class name */
public final class AnonymousClass8YX extends AnonymousClass8YP {
    public final AnonymousClass51M A00;
    public final AnonymousClass89v A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8YX) {
                AnonymousClass8YX r5 = (AnonymousClass8YX) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass51M r0 = this.A00;
        return ((((r0 == null ? 0 : r0.hashCode()) * 31) + C54732HQn.A00()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateSegmentEvent(videoSegment=");
        sb.append(this.A00);
        sb.append(", isStackTimeline=");
        sb.append(false);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8YX(AnonymousClass89v r1, AnonymousClass51M r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
