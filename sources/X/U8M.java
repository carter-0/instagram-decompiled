package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel;

public final class U8M extends 2YL {
    public final 2Fk A00;

    public /* synthetic */ U8M(UserSession userSession, C16602Uxw uxw, String str, String str2, String str3) {
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel;
        AnonymousClass7TG.A1O(userSession, str);
        0qQ.A0B(uxw, 5);
        if (str3 != null) {
            organicLeadGenCtaLabel = (OrganicLeadGenCtaLabel) OrganicLeadGenCtaLabel.A01.get(DbY.A0j(str3));
            if (organicLeadGenCtaLabel == null) {
                organicLeadGenCtaLabel = OrganicLeadGenCtaLabel.UNRECOGNIZED;
            }
        } else {
            organicLeadGenCtaLabel = OrganicLeadGenCtaLabel.A07;
        }
        LeadGenEntryPoint leadGenEntryPoint = uxw.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A02();
        A0a.A0A("api/v1/lead_gen/create_or_edit_ig_lead_gen_config_v2/");
        A0a.A0Q(C43792CDk.class, C45533Cy7.class);
        A0a.A9m("fb_auth_token", str);
        if (str2 != null) {
            A0a.A9m("form_id", str2);
        }
        if (leadGenEntryPoint != null) {
            A0a.A9m("entrypoint", leadGenEntryPoint.A00);
        }
        1OC A0T = DbT.A0T(A0a, "organic_cta_label", organicLeadGenCtaLabel.A00);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CreateOrEditLeadGenConfigResponseV2>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CreateOrEditLeadGenConfigResponseV2>>");
        this.A00 = DbT.A0G(new MC9(JUM.A01(new C66161MFy(34, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(33, (AnonymousClass4D7) null), A0T.A03(328738175))), 52));
    }
}
