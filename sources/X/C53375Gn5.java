package X;

import java.util.List;

/* renamed from: X.Gn5  reason: case insensitive filesystem */
public final class C53375Gn5 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C53375Gn5(String str, String str2, String str3, String str4, String str5, List list) {
        C51972G9s.A1C(str2, str4);
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53375Gn5) {
                    C53375Gn5 gn5 = (C53375Gn5) obj;
                    if (gn5.A00 == 0 && 0qQ.A0K(this.A03, gn5.A03) && 0qQ.A0K(this.A06, gn5.A06) && 0qQ.A0K(this.A05, gn5.A05) && 0qQ.A0K(this.A04, gn5.A04) && 0qQ.A0K(this.A02, gn5.A02)) {
                        obj2 = this.A01;
                        obj3 = gn5.A01;
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
                if (obj instanceof C53375Gn5) {
                    C53375Gn5 gn52 = (C53375Gn5) obj;
                    if (gn52.A00 == 1 && 0qQ.A0K(this.A05, gn52.A05) && this.A01 == gn52.A01 && 0qQ.A0K(this.A06, gn52.A06) && 0qQ.A0K(this.A03, gn52.A03) && 0qQ.A0K(this.A04, gn52.A04)) {
                        obj2 = this.A02;
                        obj3 = gn52.A02;
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
                if (obj instanceof C53375Gn5) {
                    C53375Gn5 gn53 = (C53375Gn5) obj;
                    if (gn53.A00 == 2 && 0qQ.A0K(this.A06, gn53.A06) && 0qQ.A0K(this.A01, gn53.A01) && 0qQ.A0K(this.A04, gn53.A04) && 0qQ.A0K(this.A02, gn53.A02) && 0qQ.A0K(this.A03, gn53.A03)) {
                        obj2 = this.A05;
                        obj3 = gn53.A05;
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
        int A0O;
        String str;
        int A0L;
        switch (this.A00) {
            case 0:
                int A0O2 = AnonymousClass7TE.A0O(this.A03);
                A0O = (AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A08(this.A06, A0O2) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31;
                A0L = AnonymousClass7TE.A0L(this.A01);
                break;
            case 1:
                A0O = (((((((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                str = this.A02;
                break;
            default:
                A0O = (AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A06)))) + AnonymousClass7TG.A0E(this.A03)) * 31;
                str = this.A05;
                break;
        }
        A0L = C41845B3m.A00(str);
        return A0O + A0L;
    }

    public C53375Gn5(String str, String str2, String str3, String str4, String str5, AnonymousClass62O r7) {
        this.A06 = str;
        this.A01 = r7;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = str5;
    }

    public C53375Gn5(C62601KiY kiY, String str, String str2, String str3, String str4, String str5) {
        this.A05 = str;
        this.A01 = kiY;
        this.A06 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A02 = str5;
    }
}
