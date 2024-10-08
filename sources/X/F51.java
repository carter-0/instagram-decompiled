package X;

import com.instagram.business.model.BoostGuidanceItemResponse;
import java.io.IOException;
import java.util.ArrayList;

public final class F51 {
    public static C47330Dux parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C47330Dux dux = new C47330Dux();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("boost_guidance_items".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            BoostGuidanceItemResponse parseFromJson = C48736EjL.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dux.A00 = arrayList;
                } else {
                    1XY.A01(r5, dux, A17);
                }
                r5.A0z();
            }
            return dux;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
