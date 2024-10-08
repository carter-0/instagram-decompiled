package X;

public final class JYS extends AnonymousClass4AA {
    public final MSP A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JYS) {
                JYS jys = (JYS) obj;
                if (this.A01 != jys.A01 || !0qQ.A0K(this.A00, jys.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51965G9l.A05(this.A01));
    }

    public JYS(MSP msp, boolean z) {
        this.A01 = z;
        this.A00 = msp;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return true;
    }
}
