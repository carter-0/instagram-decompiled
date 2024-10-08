package X;

import java.util.List;

/* renamed from: X.JxR  reason: case insensitive filesystem */
public final class C61115JxR extends AnonymousClass0T0 implements MWL {
    public final C61113JxP A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final Integer A04;

    public C61115JxR(C61113JxP jxP, Integer num, String str, List list, List list2) {
        0qQ.A0B(list, 3);
        this.A04 = num;
        this.A00 = jxP;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61115JxR) {
                C61115JxR jxR = (C61115JxR) obj;
                if (!0qQ.A0K(this.A04, jxR.A04) || !0qQ.A0K(this.A00, jxR.A00) || !0qQ.A0K(this.A02, jxR.A02) || !0qQ.A0K(this.A03, jxR.A03) || !0qQ.A0K(this.A01, jxR.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, ((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A01);
    }
}
