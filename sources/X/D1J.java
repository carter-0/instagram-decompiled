package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D1J {
    public static CHI parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CHI chi = new CHI();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("country_code".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("error_message_brief".equals(A17)) {
                    chi.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("error_message_detail".equals(A17)) {
                    chi.A06 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A17(A17)) {
                    chi.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("instagram_data_policy_setting_description".equals(A17)) {
                    chi.A09 = AnonymousClass7TG.A0l(r4);
                } else if ("next_button_text".equals(A17)) {
                    chi.A0B = AnonymousClass7TG.A0l(r4);
                } else if ("primary_button_text".equals(A17)) {
                    chi.A0C = AnonymousClass7TG.A0l(r4);
                } else if ("privacy_setting_description".equals(A17)) {
                    chi.A0D = AnonymousClass7TG.A0l(r4);
                } else if ("secure_sharing_text_instagram".equals(A17)) {
                    chi.A0E = AnonymousClass7TG.A0l(r4);
                } else if ("select_text_hint".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("send_description".equals(A17)) {
                    chi.A0F = AnonymousClass7TG.A0l(r4);
                } else if ("short_secure_sharing_text_instagram".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("follow_up_action_url".equals(A17)) {
                    chi.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("instagram_data_policy_url".equals(A17)) {
                    chi.A0A = AnonymousClass7TG.A0l(r4);
                } else if ("lead_gen_data".equals(A17)) {
                    chi.A00 = C44781Cks.parseFromJson(r4);
                } else if ("page".equals(A17)) {
                    chi.A01 = C44783Cku.parseFromJson(r4);
                } else if ("quality_ad_unit".equals(A17)) {
                    chi.A02 = C44784Ckv.parseFromJson(r4);
                } else if ("trust_signal_payload".equals(A17)) {
                    chi.A03 = C16978VDe.parseFromJson(r4);
                } else if ("lead_gen_deep_link_user_status".equals(A17)) {
                    chi.A04 = C44785Ckw.parseFromJson(r4);
                } else if ("error_codes".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45287Ctq parseFromJson = C44760CkX.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    chi.A0G = arrayList;
                }
                r4.A0z();
            }
            return chi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
