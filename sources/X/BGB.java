package X;

public final class BGB extends AnonymousClass0T0 implements DS4 {
    public final BFZ A00;
    public final C53452Gok A01;
    public final C42100BHd A02;

    public final BGB F8d(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGB) {
                BGB bgb = (BGB) obj;
                if (!0qQ.A0K(this.A00, bgb.A00) || !0qQ.A0K(this.A01, bgb.A01) || !0qQ.A0K(this.A02, bgb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public BGB(BFZ bfz, C53452Gok gok, C42100BHd bHd) {
        this.A00 = bfz;
        this.A01 = gok;
        this.A02 = bHd;
    }

    public final DS4 E87(1E9 r1) {
        return this;
    }
}
