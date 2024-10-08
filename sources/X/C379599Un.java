package X;

/* renamed from: X.9Un  reason: invalid class name and case insensitive filesystem */
public final class C379599Un extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C379599Un(String str, String str2, String str3, String str4, String str5, int i) {
        this.A05 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C379599Un)) {
                return false;
            }
            C379599Un r3 = (C379599Un) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A02, r3.A02) || this.A01 != r3.A01 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A05, r3.A05) || !0qQ.A0K(this.A06, r3.A06)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C379599Un)) {
                return false;
            }
            C379599Un r32 = (C379599Un) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A06, r32.A06) || !0qQ.A0K(this.A03, r32.A03) || this.A01 != r32.A01) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        if (this.A00 != 0) {
            int hashCode3 = ((this.A02.hashCode() * 31) + this.A01) * 31;
            String str = this.A03;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            hashCode = (((((hashCode3 + hashCode2) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
            i = this.A06.hashCode();
        } else {
            hashCode = ((((((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A03.hashCode()) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public C379599Un(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        0qQ.A0B(str, 1);
        AnonymousClass7TG.A1R(str3, str4);
        0qQ.A0B(str5, 6);
        this.A02 = str;
        this.A01 = i;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
