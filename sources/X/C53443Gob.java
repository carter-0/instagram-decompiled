package X;

import java.util.List;

/* renamed from: X.Gob  reason: case insensitive filesystem */
public final class C53443Gob extends AnonymousClass0T0 implements C59632JRa {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final String A07;

    public C53443Gob(String str, String str2, String str3, String str4, List list, List list2, List list3, List list4) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(list, list2, str2, str3, list3);
        AnonymousClass7TF.A1F(list4, 7, str4);
        this.A00 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A01 = str2;
        this.A07 = str3;
        this.A05 = list3;
        this.A06 = list4;
        this.A02 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53443Gob) {
                C53443Gob gob = (C53443Gob) obj;
                if (!0qQ.A0K(this.A00, gob.A00) || !0qQ.A0K(this.A03, gob.A03) || !0qQ.A0K(this.A04, gob.A04) || !0qQ.A0K(this.A01, gob.A01) || !0qQ.A0K(this.A07, gob.A07) || !0qQ.A0K(this.A05, gob.A05) || !0qQ.A0K(this.A06, gob.A06) || !0qQ.A0K(this.A02, gob.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A00))))))));
    }
}
