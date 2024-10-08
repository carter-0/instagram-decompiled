package X;

public final class IET implements JQ8 {
    public final Object A00;
    public final Object A01;

    public final Object BH7() {
        return this.A00;
    }

    public final Object C4Q() {
        return this.A01;
    }

    public final /* synthetic */ boolean CdX(Object obj, Object obj2) {
        if (!0qQ.A0K(obj, this.A00) || !0qQ.A0K(obj2, this.A01)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JQ8) {
            JQ8 jq8 = (JQ8) obj;
            if (!0qQ.A0K(this.A00, jq8.BH7()) || !0qQ.A0K(this.A01, jq8.C4Q())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = C51971G9r.A0E(this.A00) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A0E + i;
    }

    public IET(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
