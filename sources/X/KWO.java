package X;

public final class KWO extends AnonymousClass5GP {
    public final Throwable A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KWO) {
                KWO kwo = (KWO) obj;
                if (!0qQ.A0K(this.A00, kwo.A00) || !0qQ.A0K(this.A01, kwo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public KWO(Object obj, Throwable th) {
        super(obj);
        this.A00 = th;
        this.A01 = obj;
    }
}
