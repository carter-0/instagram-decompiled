package X;

/* renamed from: X.9JA  reason: invalid class name */
public final class AnonymousClass9JA extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass9JA(AnonymousClass849 r2, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(r2, 3);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r2;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9JA r3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9JA)) {
                    return false;
                }
                r3 = (AnonymousClass9JA) obj;
                if (r3.A00 != 0 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A02, r3.A02) || this.A01 != r3.A01) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9JA)) {
                    return false;
                }
                r3 = (AnonymousClass9JA) obj;
                if (r3.A00 != 1 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A01, r3.A01)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9JA)) {
                    return false;
                }
                AnonymousClass9JA r32 = (AnonymousClass9JA) obj;
                if (r32.A00 != 2 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A02, r32.A02) || this.A04 != r32.A04 || !0qQ.A0K(this.A01, r32.A01)) {
                    return false;
                }
                return true;
        }
        if (this.A04 != r3.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode;
        int hashCode2;
        switch (this.A00) {
            case 0:
                i = (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
                break;
            case 1:
                String str = this.A02;
                int i4 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i5 = hashCode * 31;
                String str2 = this.A03;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i6 = (i5 + hashCode2) * 31;
                Object obj = this.A01;
                if (obj != null) {
                    i4 = obj.hashCode();
                }
                i = i6 + i4;
                break;
            default:
                int hashCode3 = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
                int i7 = 1237;
                if (this.A04) {
                    i7 = 1231;
                }
                i2 = (hashCode3 + i7) * 31;
                i3 = this.A01.hashCode();
                break;
        }
        i2 = i * 31;
        i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public AnonymousClass9JA(C61078JwG jwG, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = jwG;
    }

    public AnonymousClass9JA(Integer num, String str, String str2, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A04 = z;
    }
}
