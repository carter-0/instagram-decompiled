package X;

/* renamed from: X.Jyu  reason: case insensitive filesystem */
public final class C61201Jyu extends AnonymousClass0T0 implements MQX {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61201Jyu) {
                C61201Jyu jyu = (C61201Jyu) obj;
                if (!0qQ.A0K(this.A00, jyu.A00) || !0qQ.A0K(this.A01, jyu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31 * 31;
    }

    public C61201Jyu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
