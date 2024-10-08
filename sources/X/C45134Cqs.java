package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cqs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45134Cqs {
    public static Map A00(DU1 du1) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List AdK = du1.AdK();
        if (AdK != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(AdK);
            Iterator it = AdK.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("audience_facepile_users", A0r);
        }
        if (du1.AdM() != null) {
            A1H.put("audience_size", du1.AdM());
        }
        return 0Yt.A0B(A1H);
    }
}
