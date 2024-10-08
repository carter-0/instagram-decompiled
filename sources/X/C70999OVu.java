package X;

/* renamed from: X.OVu  reason: case insensitive filesystem */
public final class C70999OVu {
    public final C69363Nk3 A00;
    public final Boolean A01;

    public C70999OVu(C69363Nk3 nk3, Boolean bool) {
        this.A00 = nk3;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70999OVu) {
                C70999OVu oVu = (C70999OVu) obj;
                if (this.A00 != oVu.A00 || !0qQ.A0K(this.A01, oVu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        C69363Nk3 nk3 = this.A00;
        if (nk3 == null) {
            ordinal = -1;
        } else {
            ordinal = nk3.ordinal();
        }
        return ((ordinal + 31) * 31) + C51971G9r.A0E(this.A01);
    }

    public C70999OVu(C70528OAb oAb) {
        this.A00 = oAb.A00;
        this.A01 = oAb.A01;
    }
}
