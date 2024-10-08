package X;

import java.util.List;

/* renamed from: X.Gm4  reason: case insensitive filesystem */
public final class C53318Gm4 extends AnonymousClass0T0 {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public Integer A02 = null;
    public Integer A03 = null;
    public Integer A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public List A08 = null;
    public List A09 = null;
    public List A0A = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53318Gm4) {
                C53318Gm4 gm4 = (C53318Gm4) obj;
                if (!0qQ.A0K(this.A05, gm4.A05) || this.A03 != gm4.A03 || !0qQ.A0K(this.A00, gm4.A00) || !0qQ.A0K(this.A01, gm4.A01) || !0qQ.A0K(this.A09, gm4.A09) || !0qQ.A0K(this.A0A, gm4.A0A) || !0qQ.A0K(this.A08, gm4.A08) || !0qQ.A0K(this.A07, gm4.A07) || !0qQ.A0K(this.A06, gm4.A06) || !0qQ.A0K(this.A02, gm4.A02) || !0qQ.A0K(this.A04, gm4.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A0E = AnonymousClass7TG.A0E(this.A05) * 31;
        Integer num = this.A03;
        if (num == null) {
            A0D = 0;
        } else {
            A0D = C51971G9r.A0D(num, Hd7.A00(num));
        }
        return ((((((((((((((((((A0E + A0D) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }
}
