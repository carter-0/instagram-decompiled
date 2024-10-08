package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CeR  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44407CeR {
    public static Map A00(DTR dtr) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtr.BnO() != null) {
            List BnO = dtr.BnO();
            ArrayList A0r = AnonymousClass7TG.A0r(BnO);
            Iterator it = BnO.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("requesters", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
