package X;

import java.util.List;

public final class KO5 extends C62782KmK {
    public final C61062Jw0 A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KO5) {
                KO5 ko5 = (KO5) obj;
                if (this.A02 != ko5.A02 || !0qQ.A0K(this.A00, ko5.A00) || !0qQ.A0K(this.A01, ko5.A01) || this.A03 != ko5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, (((C51965G9l.A05(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public KO5(C61062Jw0 jw0, List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = jw0;
        this.A01 = list;
        this.A03 = z2;
    }

    public KO5() {
        this((C61062Jw0) null, (List) null, false, false);
    }
}
