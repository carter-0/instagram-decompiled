package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.Map;

public final class N4E extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public N4E(C48178EaK eaK, String str, List list, Map map, int i, boolean z) {
        C51974G9v.A0d(1, str, list, eaK, map);
        this.A05 = str;
        this.A01 = i;
        this.A06 = z;
        this.A02 = list;
        this.A03 = eaK;
        this.A04 = map;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4E) {
                    N4E n4e = (N4E) obj;
                    if (n4e.A00 == 0 && 0qQ.A0K(this.A05, n4e.A05) && this.A01 == n4e.A01 && 0qQ.A0K(this.A04, n4e.A04) && 0qQ.A0K(this.A03, n4e.A03) && this.A06 == n4e.A06) {
                        obj2 = this.A02;
                        obj3 = n4e.A02;
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
                if (!(obj instanceof N4E)) {
                    return false;
                }
                N4E n4e2 = (N4E) obj;
                if (n4e2.A00 != 1 || !0qQ.A0K(this.A03, n4e2.A03) || this.A06 != n4e2.A06 || !0qQ.A0K(this.A02, n4e2.A02) || !0qQ.A0K(this.A04, n4e2.A04) || !0qQ.A0K(this.A05, n4e2.A05) || this.A01 != n4e2.A01) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4E) {
                    N4E n4e3 = (N4E) obj;
                    if (n4e3.A00 == 2 && 0qQ.A0K(this.A05, n4e3.A05) && this.A01 == n4e3.A01 && this.A06 == n4e3.A06 && 0qQ.A0K(this.A02, n4e3.A02) && 0qQ.A0K(this.A03, n4e3.A03)) {
                        obj2 = this.A04;
                        obj3 = n4e3.A04;
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
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TE.A0O(this.A05) + this.A01) * 31)));
                obj = this.A02;
                break;
            case 1:
                int A0K = AnonymousClass7TE.A0K(this.A03);
                A09 = (AnonymousClass7TF.A07(this.A04, (AnonymousClass7TF.A09(this.A06, A0K) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A05)) * 31;
                i = this.A01;
                break;
            default:
                A09 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TE.A0O(this.A05) + this.A01) * 31)));
                obj = this.A04;
                break;
        }
        i = obj.hashCode();
        return A09 + i;
    }

    public N4E(C266444Yx r2, ImageUrl imageUrl, ImageUrl imageUrl2, String str, int i, boolean z) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A01 = i;
        this.A04 = imageUrl;
        this.A03 = imageUrl2;
        this.A06 = z;
        this.A02 = r2;
    }

    public N4E(MsysThreadSubtype msysThreadSubtype, MsysThreadId msysThreadId, Long l, String str, int i, boolean z) {
        this.A03 = msysThreadId;
        this.A06 = z;
        this.A02 = l;
        this.A04 = msysThreadSubtype;
        this.A05 = str;
        this.A01 = i;
    }

    public N4E() {
        this((C48178EaK) C47868EKo.A00, "", (List) 0sn.A00, (Map) 0Yt.A0E(), 0, false);
    }
}
