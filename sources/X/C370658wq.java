package X;

import java.util.List;

/* renamed from: X.8wq  reason: invalid class name and case insensitive filesystem */
public final class C370658wq extends AnonymousClass0T0 implements C370668wr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C370658wq(String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C370658wq) {
                C370658wq r5 = (C370658wq) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        List list = this.A04;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}
