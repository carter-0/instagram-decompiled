package X;

import com.instagram.api.schemas.BudgetRecommendationType;
import java.util.List;

public final class UMp extends AnonymousClass0T0 implements C21008X9j {
    public final BudgetRecommendationType A00;
    public final XA0 A01;
    public final List A02;
    public final DR5 A03;
    public final DR8 A04;

    public UMp(BudgetRecommendationType budgetRecommendationType, DR5 dr5, DR8 dr8, XA0 xa0, List list) {
        0qQ.A0B(budgetRecommendationType, 4);
        this.A03 = dr5;
        this.A02 = list;
        this.A04 = dr8;
        this.A00 = budgetRecommendationType;
        this.A01 = xa0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMp) {
                UMp uMp = (UMp) obj;
                if (!0qQ.A0K(this.A03, uMp.A03) || !0qQ.A0K(this.A02, uMp.A02) || !0qQ.A0K(this.A04, uMp.A04) || this.A00 != uMp.A00 || !0qQ.A0K(this.A01, uMp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, ((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
