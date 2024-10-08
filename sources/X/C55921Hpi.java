package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.Hpi  reason: case insensitive filesystem */
public final class C55921Hpi {
    public final UserSession A00;

    public final JM5 A00(1Xj r12) {
        String fundraiserId;
        0qQ.A0B(r12, 0);
        C65231bS B8b = r12.A0C.B8b();
        if (B8b == null || (fundraiserId = B8b.getFundraiserId()) == null) {
            return C57183IRw.A00;
        }
        String beneficiaryName = B8b.getBeneficiaryName();
        String progressStr = B8b.getProgressStr();
        String fundraiserTitle = B8b.getFundraiserTitle();
        FundraiserCampaignTypeEnum B8e = B8b.B8e();
        String id = r12.getId();
        if (id != null) {
            String A2n = r12.A2n();
            if (A2n != null) {
                return new C53541GqC(B8e, B8b.BvT(), beneficiaryName, fundraiserId, progressStr, fundraiserTitle, id, A2n, C51973G9u.A0j(this.A00, r12));
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C55921Hpi(UserSession userSession) {
        this.A00 = userSession;
    }
}
