package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cdd  reason: case insensitive filesystem */
public abstract class C44357Cdd {
    public static UNS parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("conversion".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("conversion_duration_pairs".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            UMx parseFromJson = CXH.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("daily_budget".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else {
                    num3 = C41847B3o.A13(r11, num3, A17, TraceFieldType.Duration);
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("conversion", r11, "SimilarAdvertiserBudgetRecommendationImpl");
            } else if (num2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("daily_budget", r11, "SimilarAdvertiserBudgetRecommendationImpl");
            } else if (num3 != null || !(r11 instanceof 0c9)) {
                return new UNS(arrayList, num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L(TraceFieldType.Duration, r11, "SimilarAdvertiserBudgetRecommendationImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
