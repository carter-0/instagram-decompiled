package X;

/* renamed from: X.8YO  reason: invalid class name */
public final class AnonymousClass8YO extends AnonymousClass8YP {
    public final AnonymousClass831 A00;
    public final AnonymousClass89v A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8YO) {
                AnonymousClass8YO r5 = (AnonymousClass8YO) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateWarmSegmentsEvent(segmentStore=");
        sb.append(this.A00);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8YO(AnonymousClass89v r1, AnonymousClass831 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
