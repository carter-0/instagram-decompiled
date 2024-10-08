package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDt  reason: case insensitive filesystem */
public abstract class C16993VDt {
    public static C17348VSb parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17348VSb vSb = new C17348VSb();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A19(A17)) {
                    vSb.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("event_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17347VSa parseFromJson = C16992VDs.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vSb.A01 = arrayList;
                }
                r4.A0z();
            }
            return vSb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
