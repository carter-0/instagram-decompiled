package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Rii  reason: case insensitive filesystem */
public abstract class C9869Rii {
    public static final AnonymousClass2gB A00(Map map) {
        0qQ.A0B(map, 0);
        C10499RtE rtE = new C10499RtE(map.keySet());
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass2gB A0M = Pxh.A0M();
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            C10957S2p s2p = (C10957S2p) A0v.next();
            A0M.A0E(s2p.A02, new C11637Sdf(3, A1C, A0M, rtE, s2p));
        }
        return A0M;
    }
}
