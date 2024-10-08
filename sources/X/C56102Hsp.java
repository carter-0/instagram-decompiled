package X;

/* renamed from: X.Hsp  reason: case insensitive filesystem */
public final class C56102Hsp {
    public final Integer A00;
    public final String A01;
    public final C62320sa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56102Hsp) {
                C56102Hsp hsp = (C56102Hsp) obj;
                if (!0qQ.A0K(this.A01, hsp.A01) || !0qQ.A0K(this.A02, hsp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, ((AnonymousClass7TG.A0E(this.A01) * 31) + 64218586) * 31) + 1231;
    }

    public C56102Hsp(String str, Integer num, C62320sa r3) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SearchOverlayNavigationBarModel(title=");
        A1A.append(this.A01);
        A1A.append(", action=");
        A1A.append("CLOSE");
        A1A.append(", onActionClick=");
        A1A.append(this.A02);
        A1A.append(", enableSearchEndActionAddOn=");
        return G9t.A1C(A1A, true);
    }
}
