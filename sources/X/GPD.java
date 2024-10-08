package X;

public final class GPD extends AnonymousClass0T0 implements C46224DRf {
    public final String A00;
    public final String A01;
    public final C62320sa A02;

    public GPD(String str, String str2, C62320sa r4) {
        0qQ.A0B(r4, 2);
        this.A00 = str;
        this.A02 = r4;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPD) {
                GPD gpd = (GPD) obj;
                if (!0qQ.A0K(this.A00, gpd.A00) || !0qQ.A0K(this.A02, gpd.A02) || !0qQ.A0K(this.A01, gpd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0E(this.A01);
    }
}
