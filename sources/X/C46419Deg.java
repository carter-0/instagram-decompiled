package X;

import java.util.List;

/* renamed from: X.Deg  reason: case insensitive filesystem */
public final class C46419Deg extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final List A03;
    public final boolean A04;

    public C46419Deg(String str, String str2, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 1);
        AnonymousClass7TG.A1R(str, str2);
        this.A03 = list;
        this.A04 = z;
        this.A02 = z2;
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46419Deg) {
                C46419Deg deg = (C46419Deg) obj;
                if (!0qQ.A0K(this.A03, deg.A03) || this.A04 != deg.A04 || this.A02 != deg.A02 || !0qQ.A0K(this.A00, deg.A00) || !0qQ.A0K(this.A01, deg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0K(this.A03)))));
    }
}
