package X;

import java.util.List;

/* renamed from: X.GqB  reason: case insensitive filesystem */
public final class C53540GqB extends AnonymousClass0T0 implements C59642JRk {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53540GqB) {
                C53540GqB gqB = (C53540GqB) obj;
                if (!0qQ.A0K(this.A02, gqB.A02) || !0qQ.A0K(this.A00, gqB.A00) || this.A03 != gqB.A03 || !0qQ.A0K(this.A01, gqB.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0K(this.A02))));
    }

    public C53540GqB(List list, boolean z, String str, String str2) {
        C51974G9v.A1L(list, str, str2);
        this.A02 = list;
        this.A00 = str;
        this.A03 = z;
        this.A01 = str2;
    }
}
