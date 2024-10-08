package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CyH  reason: case insensitive filesystem */
public abstract class C45543CyH {
    public static C42030BEf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("grid_media_ids".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            return new C42030BEf(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42030BEf bEf) {
        r2.A0c();
        List list = bEf.A00;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "grid_media_ids", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(r2, A0s);
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
