package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BudgetRecommendationType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CVA {
    public static UMp parseFromJson(16F r10) {
        String A00;
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            BEZ bez = null;
            ArrayList arrayList = null;
            C42027BEc bEc = null;
            BudgetRecommendationType budgetRecommendationType = null;
            UNS uns = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r1 = 16L.A09;
                A00 = C273654mx.A00(91);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("daily_budget".equals(A17)) {
                    bez = CX9.parseFromJson(r10);
                } else if ("daily_budgets_for_durations".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            UMw parseFromJson = CX8.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (TraceFieldType.Duration.equals(A17)) {
                    bEc = CXI.parseFromJson(r10);
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    budgetRecommendationType = (BudgetRecommendationType) BudgetRecommendationType.A01.get(str);
                    if (budgetRecommendationType == null) {
                        budgetRecommendationType = BudgetRecommendationType.UNRECOGNIZED;
                    }
                } else if ("similar_advertiser_budget_recommendation".equals(A17)) {
                    uns = C44357Cdd.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (budgetRecommendationType != null || !(r10 instanceof 0c9)) {
                return new UMp(budgetRecommendationType, bez, bEc, uns, arrayList);
            }
            AnonymousClass7TF.A1L(A00, r10, "BudgetRecommendationImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
