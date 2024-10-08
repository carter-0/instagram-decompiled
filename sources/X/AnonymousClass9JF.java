package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.9JF  reason: invalid class name */
public final class AnonymousClass9JF extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public AnonymousClass9JF(AnonymousClass4O9 r3, AnonymousClass4OA r4) {
        this.A06 = 2;
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = null;
    }

    public final void A00(Integer num) {
        String str;
        0qQ.A0B(num, 0);
        if (num.intValue() != 0) {
            str = "off";
        } else {
            str = "on";
        }
        this.A05 = str;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        AnonymousClass9JF r3;
        Object obj4;
        Object obj5;
        switch (this.A06) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JF) {
                    r3 = (AnonymousClass9JF) obj;
                    if (r3.A06 == 0 && 0qQ.A0K(this.A04, r3.A04) && 0qQ.A0K(this.A05, r3.A05) && 0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A02, r3.A02)) {
                        obj4 = this.A03;
                        obj5 = r3.A03;
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
                if (obj instanceof AnonymousClass9JF) {
                    AnonymousClass9JF r32 = (AnonymousClass9JF) obj;
                    if (r32.A06 == 1 && 0qQ.A0K(this.A03, r32.A03) && 0qQ.A0K(this.A01, r32.A01) && 0qQ.A0K(this.A00, r32.A00) && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A04, r32.A04)) {
                        obj2 = this.A05;
                        obj3 = r32.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9JF)) {
                    return false;
                }
                AnonymousClass9JF r33 = (AnonymousClass9JF) obj;
                if (r33.A06 == 2 && this.A02 == r33.A02 && this.A00 == r33.A00 && this.A01 == r33.A01) {
                    return true;
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9JF) {
                    r3 = (AnonymousClass9JF) obj;
                    if (r3.A06 == 3 && 0qQ.A0K(this.A05, r3.A05) && 0qQ.A0K(this.A04, r3.A04)) {
                        obj4 = this.A01;
                        obj5 = r3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj4, obj5)) {
            return false;
        }
        obj2 = this.A00;
        obj3 = r3.A00;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        switch (this.A06) {
            case 0:
                int hashCode10 = this.A04.hashCode() * 31;
                String str = this.A05;
                i = 0;
                if (str == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = str.hashCode();
                }
                int hashCode11 = (((((hashCode10 + hashCode8) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
                Object obj2 = this.A03;
                if (obj2 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = obj2.hashCode();
                }
                i2 = (hashCode11 + hashCode9) * 31;
                obj = this.A00;
                break;
            case 1:
                Object obj3 = this.A03;
                i = 0;
                if (obj3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj3.hashCode();
                }
                int i3 = hashCode3 * 31;
                Object obj4 = this.A01;
                if (obj4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj4.hashCode();
                }
                int i4 = (i3 + hashCode4) * 31;
                Object obj5 = this.A00;
                if (obj5 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = obj5.hashCode();
                }
                int i5 = (i4 + hashCode5) * 31;
                Object obj6 = this.A02;
                if (obj6 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = obj6.hashCode();
                }
                int i6 = (i5 + hashCode6) * 31;
                String str2 = this.A04;
                if (str2 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = str2.hashCode();
                }
                i2 = (i6 + hashCode7) * 31;
                String str3 = this.A05;
                if (str3 != null) {
                    i = str3.hashCode();
                    break;
                }
                break;
            case 2:
                Object obj7 = this.A02;
                i = 0;
                if (obj7 == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj7.hashCode();
                }
                int i7 = hashCode * 31;
                Object obj8 = this.A00;
                if (obj8 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj8.hashCode();
                }
                i2 = (i7 + hashCode2) * 31;
                obj = this.A01;
                break;
            default:
                return (((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        String str;
        if (1 - this.A06 != 0) {
            return super.toString();
        }
        if (0qQ.A0K(this.A03, true)) {
            str = 002.A0R("", "VPN;");
        } else {
            str = "";
        }
        if (0qQ.A0K(this.A01, true)) {
            str = 002.A0R(str, "Enterprise;");
        }
        if (0qQ.A0K(this.A00, true)) {
            str = 002.A0R(str, "DUN;");
        }
        if (0qQ.A0K(this.A02, true)) {
            str = 002.A0R(str, "Metered;");
        }
        String str2 = this.A04;
        if (str2 != null && !str2.equals("")) {
            str = 002.A0h(str, "dhcpServerAddr=", str2, ';');
        }
        String str3 = this.A05;
        if (str3 == null || str3.equals("")) {
            return str;
        }
        return 002.A0h(str, "LocalAddrs=", str3, ';');
    }

    public AnonymousClass9JF(String str, String str2, List list, List list2) {
        ImageUrl imageUrl;
        this.A06 = 3;
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = list;
        this.A00 = list2;
        C317966o8 r0 = (C317966o8) 00k.A0J(list2);
        if (r0 != null) {
            imageUrl = r0.A0H;
        } else {
            imageUrl = null;
        }
        this.A03 = imageUrl;
        this.A02 = 00k.A0J(list2);
    }

    public AnonymousClass9JF(C68155N2v n2v, C59721JVf jVf, C53277GlP glP, Boolean bool, String str, String str2) {
        this.A06 = 0;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = glP;
        this.A02 = n2v;
        this.A03 = jVf;
        this.A00 = bool;
    }

    public AnonymousClass9JF() {
        this.A06 = 1;
        this.A06 = 1;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JF(AnonymousClass4O9 r3, AnonymousClass4OA r4, int i) {
        this((i & 1) != 0 ? null : r3, (i & 2) != 0 ? null : r4);
        this.A06 = 2;
    }
}
