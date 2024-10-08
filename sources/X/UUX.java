package X;

import com.instagram.common.session.UserSession;

public final class UUX extends C63973LGd {
    public final UserSession A00;

    public final int A00() {
        return (int) 182.A01(0Tu.A05, this.A00, 36597716979878796L);
    }

    public final Integer A04() {
        Integer num = AnonymousClass05K.A00;
        try {
            String A04 = 182.A04(0Tu.A05, this.A00, 36879191954817268L);
            if (!A04.equals("H264")) {
                if (A04.equals("H265")) {
                    return AnonymousClass05K.A01;
                }
                throw new IllegalArgumentException(A04);
            }
        } catch (IllegalArgumentException e) {
            C363058j1.A02.A06("sup:BitrateLadderProvider", "Unable to find enum from configured string.  Fallback to H264", e);
        }
        return num;
    }

    public final String A05() {
        return DbV.A12(182.A04(0Tu.A05, this.A00, 36879191954424051L));
    }

    public UUX(UserSession userSession) {
        this.A00 = userSession;
    }
}
