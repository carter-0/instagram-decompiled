package X;

import com.instagram.leadgen.core.api.LeadForm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D1O {
    public static CEW parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (AnonymousClass000.A00(2680).equals(A17)) {
                    ArrayList arrayList = null;
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            LeadForm parseFromJson = C44846Clw.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("error".equals(A17)) {
                    r5.A02 = C44847Clx.parseFromJson(r6);
                } else if ("page_info".equals(A17)) {
                    r5.A01 = C44845Clv.parseFromJson(r6);
                } else if ("suggested_media".equals(A17)) {
                    r5.A03 = C44849Clz.parseFromJson(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A04;
            r5.A00 = new C61212Jz5(r5.A01, r5.A02, r5.A03, list);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
