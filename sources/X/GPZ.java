package X;

public final class GPZ extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final C62320sa A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPZ) {
                GPZ gpz = (GPZ) obj;
                if (!0qQ.A0K(this.A02, gpz.A02) || !0qQ.A0K(this.A03, gpz.A03) || !0qQ.A0K(this.A01, gpz.A01) || !0qQ.A0K(this.A00, gpz.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A00);
    }

    public GPZ(String str, String str2, String str3, C62320sa r4) {
        this.A02 = str;
        this.A03 = r4;
        this.A01 = str2;
        this.A00 = str3;
    }
}
