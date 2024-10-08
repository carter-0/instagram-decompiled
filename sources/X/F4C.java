package X;

import java.io.IOException;
import java.util.ArrayList;

public final class F4C {
    public static C47323Duq parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("daily_time_limit_without_extensions_seconds".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0X(r6);
                } else if ("guardian_daily_limit".equals(A17)) {
                    r5.A03 = AnonymousClass7TF.A0X(r6);
                } else if (AnonymousClass000.A00(168).equals(A17)) {
                    r5.A01 = C298915uF.parseFromJson(r6);
                } else if ("quiet_time_intervals".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C47214Dt1 parseFromJson = C48348Ed5.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            r5.A00 = new C47193Dsf(r5.A01, r5.A02, r5.A03, r5.A04);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
