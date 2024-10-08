package X;

import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import java.util.List;

public final class Jv4 extends AnonymousClass0T0 {
    public final C62866Kng A00;
    public final ShoppingReconFeedEndpoint A01;
    public final Integer A02;
    public final List A03;
    public final List A04;

    public static final Jv4 A00(C62866Kng kng, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, List list, List list2) {
        0qQ.A0B(shoppingReconFeedEndpoint, 0);
        C51974G9v.A1P(list, list2, num, kng);
        return new Jv4(kng, shoppingReconFeedEndpoint, num, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jv4) {
                Jv4 jv4 = (Jv4) obj;
                if (!0qQ.A0K(this.A01, jv4.A01) || !0qQ.A0K(this.A04, jv4.A04) || !0qQ.A0K(this.A03, jv4.A03) || this.A02 != jv4.A02 || !0qQ.A0K(this.A00, jv4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A01)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Error";
                break;
            default:
                str = "Idle";
                break;
        }
        return AnonymousClass7TE.A0N(this.A00, C51971G9r.A0F(str, intValue, A07));
    }

    public Jv4(C62866Kng kng, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, Integer num, List list, List list2) {
        this.A01 = shoppingReconFeedEndpoint;
        this.A04 = list;
        this.A03 = list2;
        this.A02 = num;
        this.A00 = kng;
    }
}
