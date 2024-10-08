package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

public final class F1Q {
    public final void A00(0lg r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        long j;
        Long l;
        AnonymousClass7TG.A1T(r5, str, str2);
        0qQ.A0B(str4, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "instagram_notification_inline_survey_response");
        if (A0e.isSampled()) {
            A0e.AAJ("extra_data_token", str6);
            A0e.AAJ("n_pk", str5);
            A0e.AAJ("channel", str3);
            Long A0n = 00y.A0n(10, str);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = -1;
            }
            A0e.A9F("qp_id", Long.valueOf(j));
            A0e.AAJ("question_id", str2);
            A0e.A9H(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, map);
            A0e.AAJ("notification_type", str4);
            if (str7 != null) {
                l = 00y.A0n(10, str7);
            } else {
                l = null;
            }
            A0e.A9F("tessa_survey_config_id", l);
            A0e.Cgf();
        }
    }
}
