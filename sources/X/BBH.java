package X;

import java.util.List;

public final class BBH extends AnonymousClass0T0 {
    public final long A00;
    public final DRC A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public BBH(DRC drc, String str, String str2, List list, List list2, long j) {
        0qQ.A0B(list, 4);
        this.A01 = drc;
        this.A02 = str;
        this.A00 = j;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBH) {
                BBH bbh = (BBH) obj;
                if (!0qQ.A0K(this.A01, bbh.A01) || !0qQ.A0K(this.A02, bbh.A02) || this.A00 != bbh.A00 || !0qQ.A0K(this.A04, bbh.A04) || !0qQ.A0K(this.A05, bbh.A05) || !0qQ.A0K(this.A03, bbh.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A01(this.A00, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31)) + AnonymousClass7TG.A0C(this.A05)) * 31) + C41845B3m.A00(this.A03);
    }
}
