package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CxX  reason: case insensitive filesystem */
public final class C45497CxX {
    public static C43882CGw parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C43882CGw cGw = new C43882CGw();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1V(A17)) {
                    cGw.A02 = r5.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(685).equals(A17)) {
                        C41846B3n.A1A(r5);
                    } else if ("clips_ads_items".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C41938B7p parseFromJson = C41939B7q.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        cGw.A01 = arrayList;
                    } else if ("next_max_id".equals(A17)) {
                        cGw.A00 = AnonymousClass7TG.A0l(r5);
                    } else {
                        AnonymousClass93W.A00(r5, cGw, A17);
                    }
                }
                r5.A0z();
            }
            cGw.A01();
            return cGw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
