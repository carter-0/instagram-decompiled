package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

public abstract class O0T {
    public static void A00(0wc r6, Integer num, String str, String str2, String str3, String str4, boolean z) {
        int i;
        String A00;
        0qQ.A0B(str2, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r6, "mwb_cm_inform_treatment_event");
        if (A0e.isSampled()) {
            A0e.A8M(C69463Nm7.IMPRESSION, TraceFieldType.AdhocEventName);
            A0e.AAJ("message_id", str);
            A0e.A7p("is_forward", JTP.A0g(A0e, "attachment_id", str3, false));
            C66580MXl.A1J(A0e, str2);
            int intValue = num.intValue();
            if (intValue == 0) {
                i = 9;
            } else if (intValue != 1) {
                i = 6;
                if (intValue != 2) {
                    i = 8;
                }
            } else {
                i = 19;
            }
            AnonymousClass7TE.A1W(A0e, "message_type", i);
            0bb r2 = new 0bb();
            r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, String.valueOf(str4));
            if (z) {
                A00 = "media_label";
            } else {
                A00 = C273654mx.A00(3489);
            }
            r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
            A0e.AAK(r2, "inform_treatment");
            A0e.Cgf();
        }
    }
}
