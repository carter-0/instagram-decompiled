package X;

import java.util.List;

/* renamed from: X.GLb  reason: case insensitive filesystem */
public final class C52260GLb extends AnonymousClass0T0 implements C46224DRf {
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52260GLb) {
                C52260GLb gLb = (C52260GLb) obj;
                if (!0qQ.A0K(this.A03, gLb.A03) || this.A04 != gLb.A04 || !0qQ.A0K(this.A01, gLb.A01) || !0qQ.A0K(this.A02, gLb.A02) || !0qQ.A0K(this.A00, gLb.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0K(this.A03)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C52260GLb(Boolean bool, Long l, String str, List list, boolean z) {
        this.A03 = list;
        this.A04 = z;
        this.A01 = l;
        this.A02 = str;
        this.A00 = bool;
    }
}
