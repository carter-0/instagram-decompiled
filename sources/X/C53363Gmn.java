package X;

import java.util.List;

/* renamed from: X.Gmn  reason: case insensitive filesystem */
public final class C53363Gmn extends AnonymousClass0T0 {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C53363Gmn(Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, List list, boolean z) {
        0qQ.A0B(num, 4);
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z;
        this.A03 = num;
        this.A06 = list;
        this.A00 = bool;
        this.A01 = num2;
        this.A02 = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53363Gmn) {
                C53363Gmn gmn = (C53363Gmn) obj;
                if (!0qQ.A0K(this.A04, gmn.A04) || !0qQ.A0K(this.A05, gmn.A05) || this.A07 != gmn.A07 || this.A03 != gmn.A03 || !0qQ.A0K(this.A06, gmn.A06) || !0qQ.A0K(this.A00, gmn.A00) || !0qQ.A0K(this.A01, gmn.A01) || !0qQ.A0K(this.A02, gmn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A09(this.A07, ((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + HWK.A00(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C53363Gmn() {
        this((Boolean) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (String) null, (String) null, (List) null, false);
    }
}
