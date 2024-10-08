package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class N8Z extends AnonymousClass0T0 implements C74249Prd {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public N8Z(ImageUrl imageUrl, C69310NjB njB) {
        this(AnonymousClass7TE.A1I(njB), AnonymousClass7TE.A1I(imageUrl));
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof N8Z) || ((N8Z) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            N8Z n8z = (N8Z) obj;
            if (this.A01 == n8z.A01 && this.A02 == n8z.A02) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            N8Z n8z2 = (N8Z) obj;
            if (!0qQ.A0K(this.A01, n8z2.A01) || !0qQ.A0K(this.A02, n8z2.A02)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TE.A0K(this.A01));
    }

    public N8Z(C69310NjB njB) {
        this(AnonymousClass7TE.A1I(njB), (List) 0sn.A00);
    }

    public N8Z(List list) {
        this(list, (List) 0sn.A00);
    }

    public N8Z(List list, List list2) {
        this.A01 = list;
        this.A02 = list2;
    }

    public N8Z(C272074k3 r2, 1iA r3) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
    }
}
