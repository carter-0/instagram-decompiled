package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class IPL implements C250603lj {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final Set A05;

    public IPL(UserSession userSession, AnonymousClass4DU r3, String str, Set set, int i, int i2) {
        0qQ.A0B(r3, 2);
        this.A02 = userSession;
        this.A03 = r3;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = set;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        Integer num;
        String A012;
        0qQ.A0B(r6, 0);
        Set set = this.A05;
        String str = r6.A05;
        0qQ.A06(str);
        if (set.add(str)) {
            if (r7 != null) {
                num = r7.CEk(r6);
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A00) {
                0Aj A0N = C51972G9s.A0N(this.A03, this.A02);
                A0N.AAJ("media_thumbnail_section", "ads_products_tab");
                C51965G9l.A1L(A0N, this.A04);
                int i = this.A00;
                if (i != 0) {
                    int i2 = this.A01;
                    int i3 = i2 / i;
                    if ((i2 ^ i) < 0 && i3 * i != i2) {
                        i3--;
                    }
                    A012 = C320166rs.A01(i3, i2 % i);
                } else {
                    A012 = C320166rs.A01(0, 0);
                }
                0qQ.A0A(A012);
                A0N.AAJ("position", A012);
                G9w.A17(A0N);
            }
        }
    }
}
