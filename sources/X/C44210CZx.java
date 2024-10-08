package X;

import com.instagram.api.schemas.LiveNoteResponseInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CZx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44210CZx {
    public static Map A00(LiveNoteResponseInfoIntf liveNoteResponseInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List C2Q = liveNoteResponseInfoIntf.C2Q();
        if (C2Q != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(C2Q);
            Iterator it = C2Q.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("subscribed_users", A0r);
        }
        liveNoteResponseInfoIntf.C7V();
        return C41845B3m.A0u("timer_end_timestamp", Long.valueOf(liveNoteResponseInfoIntf.C7V()), A1H);
    }
}
