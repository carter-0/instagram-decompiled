package X;

public final class NYQ extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final C328667Fr A01;
    public final C69604Nom A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NYQ(C328667Fr r2, C69604Nom nom) {
        super(r2.A0B);
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = nom;
        this.A00 = r2.A0C;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYQ) {
                NYQ nyq = (NYQ) obj;
                if (!0qQ.A0K(this.A01, nyq.A01) || !0qQ.A0K(this.A02, nyq.A02) || Float.compare(0.6666667f, 0.6666667f) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + Float.floatToIntBits(0.6666667f);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
