package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CYV {
    public static Map A00(C3499182k r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getColor() != null) {
            A1H.put("color", r3.getColor());
        }
        r3.B6u();
        A1H.put("follower_count", Integer.valueOf(r3.B6u()));
        if (r3.BAL() != null) {
            A1H.put("hallpass_id", r3.BAL());
        }
        r3.BRT();
        A1H.put("member_count", Integer.valueOf(r3.BRT()));
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
