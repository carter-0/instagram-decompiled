package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cxo  reason: case insensitive filesystem */
public final class C45514Cxo {
    public static CEL parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("ad_duration_warning_threshold".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0X(r6);
                } else {
                    ArrayList arrayList = null;
                    if ("optimized_daily_budget_options".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                Integer A0X = AnonymousClass7TF.A0X(r6);
                                if (A0X != null) {
                                    arrayList.add(A0X);
                                }
                            }
                        }
                        r5.A03 = arrayList;
                    } else if ("override_budget_minimum".equals(A17)) {
                        r5.A02 = AnonymousClass7TF.A0X(r6);
                    } else if ("recommended_budgets".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                UMp parseFromJson = CVA.parseFromJson(r6);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r5.A04 = arrayList;
                    } else {
                        1XY.A01(r6, r5, A17);
                    }
                }
                r6.A0z();
            }
            r5.A00 = new UMq(r5.A01, r5.A02, r5.A03, r5.A04);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
