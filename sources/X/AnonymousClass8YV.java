package X;

/* renamed from: X.8YV  reason: invalid class name */
public final class AnonymousClass8YV extends AnonymousClass8YP {
    public final AnonymousClass89v A00;
    public final AnonymousClass51M A01;
    public final 0sL A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8YV) {
                AnonymousClass8YV r5 = (AnonymousClass8YV) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateFirstFrameEvent(videoSegment=");
        sb.append(this.A01);
        sb.append(", onBitmapReady=");
        sb.append(this.A02);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass8YV(AnonymousClass89v r1, AnonymousClass51M r2, 0sL r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
