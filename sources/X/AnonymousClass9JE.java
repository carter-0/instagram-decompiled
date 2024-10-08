package X;

import java.util.List;

/* renamed from: X.9JE  reason: invalid class name */
public final class AnonymousClass9JE extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public AnonymousClass9JE(AnonymousClass4OA r2, C20882X2k x2k, String str, String str2, List list) {
        this.A05 = 0;
        0qQ.A0B(str, 3);
        this.A00 = r2;
        this.A02 = list;
        this.A03 = str;
        this.A01 = x2k;
        this.A04 = str2;
    }

    public final boolean equals(Object obj) {
        AnonymousClass9JE r3;
        Object obj2;
        Object obj3;
        switch (this.A05) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JE) {
                    r3 = (AnonymousClass9JE) obj;
                    if (r3.A05 == 0 && this.A00 == r3.A00 && 0qQ.A0K(this.A02, r3.A02) && 0qQ.A0K(this.A03, r3.A03)) {
                        obj2 = this.A01;
                        obj3 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JE) {
                    r3 = (AnonymousClass9JE) obj;
                    if (r3.A05 == 1 && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A00, r3.A00)) {
                        obj2 = this.A02;
                        obj3 = r3.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9JE)) {
                    return false;
                }
                r3 = (AnonymousClass9JE) obj;
                if (r3.A05 != 2 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || this.A00 != r3.A00) {
                    return false;
                }
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        if (!0qQ.A0K(this.A04, r3.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i2;
        Object obj;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        switch (this.A05) {
            case 0:
                i = ((((((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31;
                String str = this.A04;
                if (str != null) {
                    hashCode4 = str.hashCode();
                    break;
                } else {
                    hashCode4 = 0;
                    break;
                }
            case 1:
                String str2 = this.A03;
                i = 0;
                if (str2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = str2.hashCode();
                }
                int i3 = hashCode * 31;
                Object obj2 = this.A01;
                if (obj2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj2.hashCode();
                }
                int i4 = (i3 + hashCode2) * 31;
                Object obj3 = this.A00;
                if (obj3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj3.hashCode();
                }
                i2 = (i4 + hashCode3) * 31;
                obj = this.A02;
                break;
            default:
                String str3 = this.A03;
                i = 0;
                if (str3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = str3.hashCode();
                }
                int i5 = hashCode6 * 31;
                Object obj4 = this.A01;
                if (obj4 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = obj4.hashCode();
                }
                int i6 = (i5 + hashCode7) * 31;
                Object obj5 = this.A02;
                if (obj5 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = obj5.hashCode();
                }
                i2 = (i6 + hashCode8) * 31;
                obj = this.A00;
                break;
        }
        if (obj == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = obj.hashCode();
        }
        hashCode4 = (i2 + hashCode5) * 31;
        String str4 = this.A04;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i + hashCode4;
    }

    public AnonymousClass9JE(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A04 = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JE() {
        this((Object) null, (Object) null, (Object) null, (String) null, (String) null, 2);
        this.A05 = 2;
        this.A05 = 2;
    }
}
