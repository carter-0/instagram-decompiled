package X;

import java.util.List;

/* renamed from: X.Gli  reason: case insensitive filesystem */
public final class C53296Gli extends AnonymousClass0T0 {
    public final int A00;
    public final C61084JwM A01;
    public final DUO A02;
    public final List A03;
    public final List A04;
    public final int A05;
    public final Long A06;

    public C53296Gli(C61084JwM jwM, DUO duo, Long l, List list, List list2, int i, int i2) {
        DbW.A1O(list, 1, list2);
        this.A04 = list;
        this.A02 = duo;
        this.A00 = i;
        this.A05 = i2;
        this.A06 = l;
        this.A03 = list2;
        this.A01 = jwM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53296Gli) {
                C53296Gli gli = (C53296Gli) obj;
                if (!0qQ.A0K(this.A04, gli.A04) || !0qQ.A0K(this.A02, gli.A02) || this.A00 != gli.A00 || this.A05 != gli.A05 || !0qQ.A0K(this.A06, gli.A06) || !0qQ.A0K(this.A03, gli.A03) || !0qQ.A0K(this.A01, gli.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A03, (((((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + this.A05) * 31) + AnonymousClass7TE.A0L(this.A06)) * 31));
    }
}
