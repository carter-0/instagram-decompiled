package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CYE {
    public static Map A00(AnonymousClass605 r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List B4z = r4.B4z();
        if (B4z != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(B4z);
            Iterator it = B4z.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("featured_user_list", A0r);
        }
        if (r4.B9t() != null) {
            A1H.put("group", r4.B9t().A08());
        }
        if (r4.BXK() != null) {
            A1H.put("num_total_notes", r4.BXK());
        }
        return 0Yt.A0B(A1H);
    }
}
