package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D0J {
    public static CEU parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("formatted_incentive_match_for_account".equals(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("formatted_total_amount_earned_by_account".equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else if ("media_insights".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C60968JuQ parseFromJson = C44568Ch2.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("start_date".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0X(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            String str = r5.A02;
            String str2 = r5.A03;
            0qQ.A0A(str2);
            List list = r5.A04;
            0qQ.A0A(list);
            r5.A00 = new C60925Jtj(r5.A01, str, str2, list);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
