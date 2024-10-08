package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class N4F extends AnonymousClass0T0 {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public N4F() {
        this((ImageUrl) null, AnonymousClass05K.A00, "", 0sn.A00, 0, false, false);
    }

    public static final N4F A00(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(num, 0, str);
        0qQ.A0B(list, 6);
        return new N4F(imageUrl, num, str, list, j, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4F) {
                N4F n4f = (N4F) obj;
                if (!(this.A02 == n4f.A02 && this.A05 == n4f.A05 && 0qQ.A0K(this.A01, n4f.A01) && 0qQ.A0K(this.A03, n4f.A03) && this.A00 == n4f.A00 && this.A06 == n4f.A06 && 0qQ.A0K(this.A04, n4f.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static N4F A01(N4F n4f, Integer num, List list, boolean z) {
        return A00(n4f.A01, num, n4f.A03, list, n4f.A00, z, n4f.A06);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "Ready";
                break;
            case 2:
                str = "Loading";
                break;
            default:
                str = "Empty";
                break;
        }
        int A0F = C51968G9o.A0F(str, intValue);
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A09(this.A06, C51972G9s.A07(this.A00, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A09(this.A05, A0F) + AnonymousClass7TG.A0C(this.A01)) * 31))));
    }

    public N4F(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2) {
        0qQ.A0B(str, 4);
        this.A02 = num;
        this.A05 = z;
        this.A01 = imageUrl;
        this.A03 = str;
        this.A00 = j;
        this.A06 = z2;
        this.A04 = list;
    }
}
