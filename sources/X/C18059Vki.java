package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vki  reason: case insensitive filesystem */
public final class C18059Vki {
    public final UserSession A00;

    public C18059Vki(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final MCA A00(LeadGenEntryPoint leadGenEntryPoint, String str, String str2) {
        AnonymousClass7TF.A1H(str, leadGenEntryPoint);
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        C13990Tnq.A1C(A0a, "lead_gen/available_lead_forms_for_business/", str);
        A0a.A9m("entrypoint", leadGenEntryPoint.A00);
        A0a.A9m("cursor", str2);
        1OC A0R = DbT.A0R((15p) null, A0a, CEW.class, D1O.class, false);
        int i = 581160428;
        if (leadGenEntryPoint == LeadGenEntryPoint.PROMOTE) {
            i = 1277614955;
        }
        return JUM.A01(new C66161MFy(24, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(23, (AnonymousClass4D7) null), A0R.A03(i)));
    }

    public final MCA A01(LeadGenEntryPoint leadGenEntryPoint, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        AnonymousClass7TF.A1H(str, str2);
        0qQ.A0B(str3, 2);
        DbW.A1O(str4, 3, leadGenEntryPoint);
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        C13990Tnq.A1C(A0a, "lead_gen/create_lead_form_v2/", str);
        A0a.A9m("client_mutation_id", "");
        A0a.A9m("actor_id", str4);
        A0a.A9m(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A0a.A9m("questions", str3);
        A0a.A9m("entrypoint", leadGenEntryPoint.A00);
        A0a.A0G(AnonymousClass000.A00(4219), str5);
        A0a.A0G("media_id", str6);
        A0a.A0H("is_generic_form", z);
        A0a.A0H("organic_create_config", z2);
        A0a.A0G("organic_cta_label", str7);
        A0a.A0G("flow_id", str8);
        1OC A0R = DbT.A0R((15p) null, A0a, CE4.class, D1P.class, false);
        int i = 232777748;
        if (leadGenEntryPoint == LeadGenEntryPoint.PROMOTE) {
            i = 1740337749;
        }
        return JUM.A01(new C66161MFy(30, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(29, (AnonymousClass4D7) null), A0R.A05(i, 3)));
    }

    public final MCA A02(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("lead_gen/get_lead_form_terms_of_service/");
        A0a.A9m("page_name", str);
        A0a.A9m("entrypoint", str2);
        return JUM.A01(new C66161MFy(32, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(31, (AnonymousClass4D7) null), DbT.A0R((15p) null, A0a, CEX.class, D1R.class, false).A03(1224978229)));
    }

    public final MCA A03(String str, String str2, String str3, String str4) {
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("lead_gen/submit_lead_form/");
        A0a.A9m("lead_form_id", str);
        A0a.A9m("business_igid", str2);
        A0a.A9m("fields_data", str3);
        A0a.A9m("client_mutation_id", "");
        A0a.A9m("entrypoint", str4);
        return JUM.A01(new C66161MFy(28, (AnonymousClass4D7) null), JUM.A00(new C66161MFy(27, (AnonymousClass4D7) null), DbU.A0S(A0a, CE3.class, D05.class).A03(1574121722)));
    }
}
