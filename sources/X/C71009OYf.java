package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OYf  reason: case insensitive filesystem */
public final class C71009OYf {
    public final UserSession A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();

    public static final void A00(C71009OYf oYf, OE3 oe3, long j) {
        List<C74413PuT> list = (List) oYf.A01.remove(Long.valueOf(j));
        if (list != null) {
            for (C74413PuT DFJ : list) {
                DFJ.DFJ(oe3);
            }
        }
    }

    public static final void A01(C71009OYf oYf, OE3 oe3, List list) {
        List<C74413PuT> list2 = (List) oYf.A02.remove(list);
        if (list2 != null) {
            for (C74413PuT DFJ : list2) {
                DFJ.DFJ(oe3);
            }
        }
    }

    public C71009OYf(UserSession userSession) {
        this.A00 = userSession;
    }
}
