package X;

import java.io.IOException;

/* renamed from: X.EmV  reason: case insensitive filesystem */
public abstract class C48931EmV {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F0y, java.lang.Object] */
    public static C49666F0y parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("existing_user_intro_state".equals(A17)) {
                    obj.A02 = C48933EmX.parseFromJson(r3);
                } else if ("tos_data_policy_consent_state".equals(A17)) {
                    obj.A05 = C48933EmX.parseFromJson(r3);
                } else if ("age_consent_state".equals(A17)) {
                    obj.A00 = C48933EmX.parseFromJson(r3);
                } else if ("dob".equals(A17)) {
                    obj.A01 = C48933EmX.parseFromJson(r3);
                } else if ("parental_consent_intro".equals(A17)) {
                    obj.A04 = C48933EmX.parseFromJson(r3);
                } else if ("parental_consent_email".equals(A17)) {
                    obj.A03 = C48933EmX.parseFromJson(r3);
                } else if ("third_party_data_consent_state".equals(A17)) {
                    obj.A07 = C48933EmX.parseFromJson(r3);
                } else if ("third_party_data_intro".equals(A17)) {
                    obj.A09 = C48933EmX.parseFromJson(r3);
                } else if ("third_party_data_confirm".equals(A17)) {
                    obj.A06 = C48933EmX.parseFromJson(r3);
                } else if ("third_party_data_dialog".equals(A17)) {
                    obj.A08 = C48933EmX.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
