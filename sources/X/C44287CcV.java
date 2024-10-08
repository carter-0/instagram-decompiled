package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CcV  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44287CcV {
    public static Map A00(AnonymousClass60G r4) {
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
        if (r4.BWw() != null) {
            A1H.put("num_items", r4.BWw());
        }
        if (r4.Bhp() != null) {
            A1H.put("prompt_id", r4.Bhp());
        }
        if (r4.Bhu() != null) {
            A1H.put("prompt_text", r4.Bhu());
        }
        if (r4.Bup() != null) {
            A1H.put("should_show_unseen_response_indicator", r4.Bup());
        }
        return 0Yt.A0B(A1H);
    }
}
