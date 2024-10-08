package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.4ka  reason: invalid class name and case insensitive filesystem */
public final class C272364ka extends 1P0 {
    public final /* synthetic */ 2AY A00;
    public final /* synthetic */ 0sP A01;

    public C272364ka(2AY r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        MonetizationEligibilityDecision monetizationEligibilityDecision;
        int A03 = AnonymousClass0fD.A03(1853429629);
        AnonymousClass371 r8 = (AnonymousClass371) obj;
        int A032 = AnonymousClass0fD.A03(-2096981652);
        0qQ.A0B(r8, 0);
        MonetizationRepository A002 = AnonymousClass2o3.A00(this.A00.A00);
        for (C272664lA r0 : ((C272674lB) r8.FH3()).A00) {
            A002.A01(r0);
            0sP r2 = this.A01;
            if (r0.A02 == CanUseCreatorMonetizationProduct.CAN_USE_PRODUCT) {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.ELIGIBLE;
            } else {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.NOT_ELIGIBLE;
            }
            r2.invoke(monetizationEligibilityDecision);
        }
        AnonymousClass0fD.A0A(-11831373, A032);
        AnonymousClass0fD.A0A(-89168814, A03);
    }
}
