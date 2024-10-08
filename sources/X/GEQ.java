package X;

import java.util.List;

public final class GEQ extends AnonymousClass0T0 implements C59524JMw {
    public final CharSequence A00;
    public final List A01;
    public final boolean A02;
    public final String A03;
    public final boolean A04;

    public GEQ(CharSequence charSequence, String str, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 5);
        this.A03 = str;
        this.A00 = charSequence;
        this.A02 = z;
        this.A04 = z2;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GEQ) {
                GEQ geq = (GEQ) obj;
                if (!0qQ.A0K(this.A03, geq.A03) || !0qQ.A0K(this.A00, geq.A00) || this.A02 != geq.A02 || this.A04 != geq.A04 || !0qQ.A0K(this.A01, geq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A00)) * 31)));
    }
}
