package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CUT {
    public static Map A00(C257583xd r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B1b() != null) {
            List B1b = r4.B1b();
            ArrayList arrayList = null;
            if (B1b != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = B1b.iterator();
                while (it.hasNext()) {
                    C41848B3p.A1W(arrayList, it);
                }
            }
            A1H.put("end_scene_products", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
