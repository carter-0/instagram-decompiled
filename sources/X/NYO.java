package X;

public final class NYO extends AnonymousClass7FV implements AnonymousClass7FW {
    public final C328697Fu A00;
    public final AnonymousClass79c A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYO) {
                NYO nyo = (NYO) obj;
                if (!0qQ.A0K(this.A00, nyo.A00) || !0qQ.A0K(this.A01, nyo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public NYO(C328697Fu r2, AnonymousClass79c r3) {
        super(r2.A04);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
