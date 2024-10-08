package X;

import java.util.List;

/* renamed from: X.5GI  reason: invalid class name */
public final class AnonymousClass5GI extends AnonymousClass0T0 implements AnonymousClass508 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass5GI(String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5GI) {
                AnonymousClass5GI r5 = (AnonymousClass5GI) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A03.hashCode()) * 31;
        List list = this.A04;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }
}
