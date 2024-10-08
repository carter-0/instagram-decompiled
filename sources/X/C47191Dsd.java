package X;

import java.util.List;

/* renamed from: X.Dsd  reason: case insensitive filesystem */
public final class C47191Dsd extends AnonymousClass0T0 implements G8Q {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47191Dsd) {
                C47191Dsd dsd = (C47191Dsd) obj;
                if (!0qQ.A0K(this.A00, dsd.A00) || !0qQ.A0K(this.A04, dsd.A04) || !0qQ.A0K(this.A01, dsd.A01) || !0qQ.A0K(this.A02, dsd.A02) || !0qQ.A0K(this.A03, dsd.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0O(this.A00)))));
    }

    public C47191Dsd(String str, String str2, String str3, String str4, List list) {
        AnonymousClass7TG.A1U(str, list, str2);
        AnonymousClass7TG.A1R(str3, str4);
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
