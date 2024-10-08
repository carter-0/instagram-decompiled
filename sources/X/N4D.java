package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

public final class N4D extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public N4D(String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = z2;
        this.A01 = list;
        this.A02 = str;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4D) {
                    N4D n4d = (N4D) obj;
                    if (n4d.A00 == 1 && 0qQ.A0K(this.A02, n4d.A02) && this.A04 == n4d.A04 && 0qQ.A0K(this.A03, n4d.A03) && this.A05 == n4d.A05) {
                        obj2 = this.A01;
                        obj3 = n4d.A01;
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
                if (obj instanceof N4D) {
                    N4D n4d2 = (N4D) obj;
                    if (n4d2.A00 == 2 && 0qQ.A0K(this.A03, n4d2.A03) && this.A01 == n4d2.A01 && this.A05 == n4d2.A05 && this.A04 == n4d2.A04) {
                        obj2 = this.A02;
                        obj3 = n4d2.A02;
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
                if (obj instanceof N4D) {
                    N4D n4d3 = (N4D) obj;
                    if (n4d3.A00 == 3 && this.A05 == n4d3.A05 && this.A04 == n4d3.A04 && 0qQ.A0K(this.A01, n4d3.A01) && 0qQ.A0K(this.A02, n4d3.A02)) {
                        obj2 = this.A03;
                        obj3 = n4d3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int hashCode;
        String A002;
        switch (this.A00) {
            case 1:
                A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TG.A0E(this.A02) * 31)));
                hashCode = this.A01.hashCode();
                break;
            case 2:
                int A0E = AnonymousClass7TG.A0E(this.A03) * 31;
                int A0M = AnonymousClass7TE.A0M(this.A01);
                switch (A0M) {
                    case 1:
                        A002 = "IN_PROGRESS";
                        break;
                    case 2:
                        A002 = "ERROR";
                        break;
                    case 3:
                        A002 = "HIDDEN";
                        break;
                    case 4:
                        A002 = AnonymousClass000.A00(2268);
                        break;
                    default:
                        A002 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                }
                hashCode = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, C51971G9r.A0F(A002, A0M, A0E)));
                A09 = C41845B3m.A00(this.A02);
                break;
            default:
                A09 = AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A05))));
                hashCode = AnonymousClass7TG.A0E(this.A03);
                break;
        }
        return hashCode + A09;
    }

    public N4D(String str, String str2, List list, boolean z, boolean z2) {
        DbW.A1N(str2, 3, list);
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A05 = z2;
        this.A01 = list;
    }

    public N4D(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = num;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = str2;
    }

    public N4D(Integer num) {
        this(num, (String) null, (String) null, false, false);
    }
}
