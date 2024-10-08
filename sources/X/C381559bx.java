package X;

import java.util.List;

/* renamed from: X.9bx  reason: invalid class name and case insensitive filesystem */
public final class C381559bx extends AnonymousClass0T0 {
    public C62511Kh1 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final 0eP A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381559bx) {
                C381559bx r5 = (C381559bx) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A02)))))) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C381559bx(C62511Kh1 kh1, String str, String str2, String str3, String str4, List list, List list2, 0eP r9) {
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass7TG.A1R(list, list2);
        0qQ.A0B(r9, 6);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = list;
        this.A07 = list2;
        this.A06 = r9;
        this.A01 = str4;
        this.A00 = kh1;
    }
}
