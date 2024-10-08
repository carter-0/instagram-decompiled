package X;

import java.util.List;

/* renamed from: X.N8j  reason: case insensitive filesystem */
public final class C68272N8j extends AnonymousClass0T0 implements C74253Prh {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68272N8j) {
                C68272N8j n8j = (C68272N8j) obj;
                if (!0qQ.A0K(this.A02, n8j.A02) || !0qQ.A0K(this.A03, n8j.A03) || !0qQ.A0K(this.A00, n8j.A00) || !0qQ.A0K(this.A04, n8j.A04) || !0qQ.A0K(this.A01, n8j.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A02)))));
    }

    public C68272N8j(String str, String str2, String str3, List list, List list2) {
        C51974G9v.A1P(str, list, str2, list2);
        0qQ.A0B(str3, 5);
        this.A02 = str;
        this.A03 = list;
        this.A00 = str2;
        this.A04 = list2;
        this.A01 = str3;
    }
}
