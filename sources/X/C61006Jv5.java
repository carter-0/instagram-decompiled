package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Jv5  reason: case insensitive filesystem */
public final class C61006Jv5 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C61006Jv5(N46 n46, C266444Yx r3, List list, long j, boolean z) {
        this.A02 = r3;
        this.A03 = list;
        this.A05 = z;
        this.A01 = j;
        this.A04 = n46;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61006Jv5)) {
                return false;
            }
            C61006Jv5 jv5 = (C61006Jv5) obj;
            if (jv5.A00 != 1 || !0qQ.A0K(this.A02, jv5.A02) || !0qQ.A0K(this.A03, jv5.A03) || this.A05 != jv5.A05 || this.A01 != jv5.A01) {
                return false;
            }
            obj2 = this.A04;
            obj3 = jv5.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61006Jv5)) {
                return false;
            }
            C61006Jv5 jv52 = (C61006Jv5) obj;
            if (jv52.A00 != 0 || this.A01 != jv52.A01 || !0qQ.A0K(this.A03, jv52.A03) || !0qQ.A0K(this.A04, jv52.A04) || this.A05 != jv52.A05) {
                return false;
            }
            obj2 = this.A02;
            obj3 = jv52.A02;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return C51972G9s.A07(this.A01, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0C(this.A02) * 31))) + AnonymousClass7TE.A0L(this.A04);
        }
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A05, (((C51975G9x.A03(this.A01) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31));
    }

    public C61006Jv5(C266444Yx r2, C266444Yx r3, ImageUrl imageUrl, long j, boolean z) {
        this.A01 = j;
        this.A03 = imageUrl;
        this.A04 = r2;
        this.A05 = z;
        this.A02 = r3;
    }
}
