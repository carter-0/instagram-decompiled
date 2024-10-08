package X;

import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CWE {
    public static CommerceReviewStatisticsDict parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Float f = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("average_rating".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r6);
                } else if (!"rating_stars".equals(A17)) {
                    num = C41847B3o.A13(r6, num, A17, "review_count");
                } else if (r6.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r6.A1J() != 16L.A08) {
                        if (r6.A11() == 16L.A0G) {
                            str = null;
                        } else {
                            str = r6.A1P();
                        }
                        arrayList.add(CUS.A00(str));
                    }
                } else {
                    arrayList = null;
                }
                r6.A0z();
            }
            return new CommerceReviewStatisticsDict(f, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
