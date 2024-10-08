package X;

import java.util.List;

/* renamed from: X.DsX  reason: case insensitive filesystem */
public final class C47185DsX extends AnonymousClass0T0 implements G8M {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47185DsX) {
                C47185DsX dsX = (C47185DsX) obj;
                if (!0qQ.A0K(this.A03, dsX.A03) || !0qQ.A0K(this.A00, dsX.A00) || !0qQ.A0K(this.A01, dsX.A01) || !0qQ.A0K(this.A02, dsX.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0K(this.A03))));
    }

    public C47185DsX(String str, String str2, String str3, List list) {
        AnonymousClass7TG.A1U(list, str, str2);
        0qQ.A0B(str3, 4);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
