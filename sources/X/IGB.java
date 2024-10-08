package X;

public final class IGB implements JNX {
    public final C55859Hog A00;
    public final 0sP A01;
    public final Object A02;

    public final Object BLq() {
        return this.A02;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IGB) {
            IGB igb = (IGB) obj;
            if (!0qQ.A0K(this.A00.A04, igb.A00.A04) || !0qQ.A0K(this.A01, igb.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00.A04));
    }

    public IGB(C55859Hog hog, 0sP r3) {
        this.A00 = hog;
        this.A01 = r3;
        this.A02 = hog.A04;
    }
}
