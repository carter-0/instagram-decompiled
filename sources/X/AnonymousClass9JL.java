package X;

import java.util.List;

/* renamed from: X.9JL  reason: invalid class name */
public final class AnonymousClass9JL extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass9JL(C381549bw r2, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(str, 3);
        0qQ.A0B(str2, 4);
        0qQ.A0B(str3, 5);
        0qQ.A0B(str4, 6);
        this.A01 = list;
        this.A02 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JL) {
                    AnonymousClass9JL r3 = (AnonymousClass9JL) obj;
                    if (r3.A00 == 0 && 0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A02, r3.A02) && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A04, r3.A04) && 0qQ.A0K(this.A05, r3.A05)) {
                        obj2 = this.A06;
                        obj3 = r3.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JL) {
                    AnonymousClass9JL r32 = (AnonymousClass9JL) obj;
                    if (r32.A00 == 1 && 0qQ.A0K(this.A05, r32.A05) && 0qQ.A0K(this.A03, r32.A03) && 0qQ.A0K(this.A04, r32.A04) && this.A02 == r32.A02 && 0qQ.A0K(this.A06, r32.A06)) {
                        obj2 = this.A01;
                        obj3 = r32.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JL) {
                    AnonymousClass9JL r33 = (AnonymousClass9JL) obj;
                    if (r33.A00 == 2 && 0qQ.A0K(this.A04, r33.A04) && 0qQ.A0K(this.A02, r33.A02) && 0qQ.A0K(this.A05, r33.A05) && 0qQ.A0K(this.A06, r33.A06) && 0qQ.A0K(this.A01, r33.A01)) {
                        obj2 = this.A03;
                        obj3 = r33.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int i2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                int i3 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                int i4 = hashCode * 31;
                Object obj2 = this.A02;
                if (obj2 != null) {
                    i3 = obj2.hashCode();
                }
                return ((((((((i4 + i3) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode();
            case 1:
                int hashCode8 = ((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31;
                String str = this.A06;
                i = 0;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                i2 = (hashCode8 + hashCode2) * 31;
                Object obj3 = this.A01;
                if (obj3 != null) {
                    i = obj3.hashCode();
                    break;
                }
                break;
            default:
                String str2 = this.A04;
                i = 0;
                if (str2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str2.hashCode();
                }
                int i5 = hashCode3 * 31;
                Object obj4 = this.A02;
                if (obj4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj4.hashCode();
                }
                int i6 = (i5 + hashCode4) * 31;
                String str3 = this.A05;
                if (str3 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str3.hashCode();
                }
                int i7 = (i6 + hashCode5) * 31;
                String str4 = this.A06;
                if (str4 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = str4.hashCode();
                }
                int i8 = (i7 + hashCode6) * 31;
                Object obj5 = this.A01;
                if (obj5 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = obj5.hashCode();
                }
                i2 = (i8 + hashCode7) * 31;
                String str5 = this.A03;
                if (str5 != null) {
                    i = str5.hashCode();
                    break;
                }
                break;
        }
        return i2 + i;
    }

    public AnonymousClass9JL(C391339sj r2, Integer num, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = r2;
        this.A06 = str4;
        this.A01 = num;
    }

    public AnonymousClass9JL(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = num2;
        this.A03 = str4;
    }
}
