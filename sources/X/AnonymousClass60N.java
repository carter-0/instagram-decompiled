package X;

/* renamed from: X.60N  reason: invalid class name */
public final class AnonymousClass60N extends AnonymousClass0T0 implements AnonymousClass60O {
    public final Boolean A00;
    public final Float A01;
    public final Long A02;
    public final String A03;

    public AnonymousClass60N(Boolean bool, Float f, Long l, String str) {
        0qQ.A0B(str, 4);
        this.A00 = bool;
        this.A02 = l;
        this.A01 = f;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60N) {
                AnonymousClass60N r5 = (AnonymousClass60N) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.A01;
        if (f != null) {
            i = f.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.A03.hashCode();
    }
}
