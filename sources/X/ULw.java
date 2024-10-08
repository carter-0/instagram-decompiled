package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ULw extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ULw(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4) {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, 2);
        this.A06 = 2;
    }

    public final boolean equals(Object obj) {
        ULw uLw;
        String str;
        String str2;
        switch (this.A06) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ULw)) {
                    return false;
                }
                uLw = (ULw) obj;
                if (uLw.A06 != 0 || !0qQ.A0K(this.A03, uLw.A03) || !0qQ.A0K(this.A04, uLw.A04) || !0qQ.A0K(this.A05, uLw.A05) || this.A01 != uLw.A01 || this.A00 != uLw.A00) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ULw)) {
                    return false;
                }
                uLw = (ULw) obj;
                if (uLw.A06 != 1 || this.A00 != uLw.A00 || this.A01 != uLw.A01 || !0qQ.A0K(this.A03, uLw.A03) || !0qQ.A0K(this.A05, uLw.A05) || !0qQ.A0K(this.A04, uLw.A04)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ULw) {
                    ULw uLw2 = (ULw) obj;
                    if (uLw2.A06 == 2 && this.A01 == uLw2.A01 && this.A00 == uLw2.A00 && 0qQ.A0K(this.A04, uLw2.A04) && 0qQ.A0K(this.A05, uLw2.A05) && 0qQ.A0K(this.A02, uLw2.A02)) {
                        str = this.A03;
                        str2 = uLw2.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        str = this.A02;
        str2 = uLw.A02;
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E;
        String str;
        switch (this.A06) {
            case 0:
                int A08 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03));
                return C41845B3m.A01(this.A02, (((AnonymousClass7TF.A08(this.A05, A08) + this.A01) * 31) + this.A00) * 31);
            case 1:
                A0E = ((((((((this.A00 * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                str = this.A02;
                break;
            default:
                A0E = ((((((((this.A01 * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31;
                str = this.A03;
                break;
        }
        return A0E + C41845B3m.A00(str);
    }

    public ULw(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A06 = i3;
        if (1 - i3 != 0) {
            this.A01 = i;
            this.A00 = i2;
            this.A04 = str;
            this.A05 = str2;
            this.A02 = str3;
            this.A03 = str4;
            return;
        }
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    public ULw(String str, String str2, String str3, int i, int i2, String str4, int i3) {
        this.A06 = 0;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ULw() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, 1);
        this.A06 = 1;
        this.A06 = 1;
    }
}
