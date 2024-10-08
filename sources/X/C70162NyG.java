package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyG  reason: case insensitive filesystem */
public abstract class C70162NyG {
    public static C72646PDz parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C72646PDz pDz = new C72646PDz();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("message_search_result_items".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            OC4 parseFromJson = C70161NyF.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    pDz.A01 = arrayList;
                } else if ("has_more".equals(A17)) {
                    pDz.A02 = r5.A0d();
                } else if ("next_offset".equals(A17)) {
                    pDz.A00 = r5.A1D();
                }
                r5.A0z();
            }
            return pDz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
