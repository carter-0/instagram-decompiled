package X;

import com.instagram.business.promote.model.PromoteAudience;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VmR  reason: case insensitive filesystem */
public final class C18151VmR {
    public static C15242UXc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("available_audiences".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            PromoteAudience parseFromJson = VAP.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A01 = arrayList;
                } else if ("should_show_regulated_categories_toggle".equals(A17)) {
                    r0.A02 = r4.A0d();
                } else if ("error".equals(A17)) {
                    r0.A00 = C44284CcS.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
