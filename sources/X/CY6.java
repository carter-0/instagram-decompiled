package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CY6 {
    public static Map A00(C266554Zl r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List B3g = r4.B3g();
        if (B3g != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(B3g);
            Iterator it = B3g.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("facepile_users", A0r);
        }
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), A1H);
        }
        if (r4.BfT() != null) {
            A1H.put("primary_button_text", r4.BfT());
        }
        if (r4.getSubtitle() != null) {
            A1H.put("subtitle", r4.getSubtitle());
        }
        if (r4.getTitle() != null) {
            C41845B3m.A12(r4.getTitle(), A1H);
        }
        if (r4.CAh() != null) {
            C41845B3m.A11(r4.CAh(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
