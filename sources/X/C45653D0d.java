package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0d  reason: case insensitive filesystem */
public final class C45653D0d {
    public static C43881CGv parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C43881CGv cGv = new C43881CGv();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ad_media_items".equals(A17)) {
                    ArrayList arrayList = null;
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
                    cGv.A00 = arrayList;
                } else {
                    AnonymousClass93W.A00(r5, cGv, A17);
                }
                r5.A0z();
            }
            cGv.A01();
            return cGv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
