package X;

public final class QPl extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final C10488Rt3 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPl) {
                QPl qPl = (QPl) obj;
                if (!0qQ.A0K(this.A01, qPl.A01) || !0qQ.A0K(this.A00, qPl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public QPl(C10488Rt3 rt3, String str) {
        this.A01 = str;
        this.A00 = rt3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
