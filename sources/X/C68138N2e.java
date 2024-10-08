package X;

import java.util.List;

/* renamed from: X.N2e  reason: case insensitive filesystem */
public final class C68138N2e extends AnonymousClass0T0 {
    public final C69352Njr A00;
    public final O6C A01;
    public final O6C A02;
    public final List A03;

    public C68138N2e(C69352Njr njr, O6C o6c, O6C o6c2, List list) {
        AnonymousClass7TG.A0w(1, o6c, list, o6c2);
        this.A02 = o6c;
        this.A00 = njr;
        this.A03 = list;
        this.A01 = o6c2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68138N2e) {
                C68138N2e n2e = (C68138N2e) obj;
                if (!0qQ.A0K(this.A02, n2e.A02) || this.A00 != n2e.A00 || !0qQ.A0K(this.A03, n2e.A03) || !0qQ.A0K(this.A01, n2e.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31));
    }
}
