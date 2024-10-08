package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.registration.model.RegFlowExtras;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EpZ  reason: case insensitive filesystem */
public abstract class C49110EpZ {
    public static RegFlowExtras parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("device_verification_result".equals(A17)) {
                    regFlowExtras.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("device_verification_nonce".equals(A17)) {
                    regFlowExtras.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("country_code_data".equals(A17)) {
                    regFlowExtras.A01 = C49059Eod.parseFromJson(r4);
                } else if ("phone_number_without_country_code".equals(A17)) {
                    regFlowExtras.A0R = AnonymousClass7TG.A0l(r4);
                } else if ("phone_number_with_country_code".equals(A17)) {
                    regFlowExtras.A0Q = AnonymousClass7TG.A0l(r4);
                } else if ("email".equals(A17)) {
                    regFlowExtras.A08 = AnonymousClass7TG.A0l(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    regFlowExtras.A0O = AnonymousClass7TG.A0l(r4);
                } else if (Dd6.A00().equals(A17)) {
                    regFlowExtras.A0Z = AnonymousClass7TG.A0l(r4);
                } else if ("suggested_username".equals(A17)) {
                    regFlowExtras.A0W = AnonymousClass7TG.A0l(r4);
                } else if ("password".equals(A17)) {
                    regFlowExtras.A0P = AnonymousClass7TG.A0l(r4);
                } else if ("skip_password".equals(A17)) {
                    regFlowExtras.A11 = r4.A0d();
                } else if ("confirmation_code".equals(A17)) {
                    regFlowExtras.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("force_sign_up_code".equals(A17)) {
                    regFlowExtras.A0B = AnonymousClass7TG.A0l(r4);
                } else if ("google_id_token".equals(A17)) {
                    regFlowExtras.A0D = AnonymousClass7TG.A0l(r4);
                } else if ("username_suggestions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    regFlowExtras.A0e = arrayList;
                } else if ("username_suggestions_with_metadata".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C49512Ewr parseFromJson = C49113Epc.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    regFlowExtras.A0f = arrayList;
                } else if ("solution".equals(A17)) {
                    regFlowExtras.A02 = C49085EpA.parseFromJson(r4);
                } else if ("registration_flow".equals(A17)) {
                    regFlowExtras.A0S = AnonymousClass7TG.A0l(r4);
                } else if ("last_registration_step".equals(A17)) {
                    regFlowExtras.A0N = AnonymousClass7TG.A0l(r4);
                } else if ("signup_type".equals(A17)) {
                    regFlowExtras.A0V = AnonymousClass7TG.A0l(r4);
                } else if ("actor_id".equals(A17)) {
                    regFlowExtras.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("sac_intent".equals(A17)) {
                    regFlowExtras.A0T = AnonymousClass7TG.A0l(r4);
                } else if ("sac_upsell_surface".equals(A17)) {
                    regFlowExtras.A0U = AnonymousClass7TG.A0l(r4);
                } else if ("skip_email".equals(A17)) {
                    regFlowExtras.A10 = r4.A0d();
                } else if ("allow_contact_sync".equals(A17)) {
                    regFlowExtras.A0h = r4.A0d();
                } else if ("has_sms_consent".equals(A17)) {
                    regFlowExtras.A0q = r4.A0d();
                } else if ("gdpr_required".equals(A17)) {
                    regFlowExtras.A0n = r4.A0d();
                } else if ("gdpr_s".equals(A17)) {
                    regFlowExtras.A0C = AnonymousClass7TG.A0l(r4);
                } else if ("tos_version".equals(A17)) {
                    regFlowExtras.A0X = AnonymousClass7TG.A0l(r4);
                } else if ("tos_acceptance_not_required".equals(A17)) {
                    regFlowExtras.A12 = r4.A0d();
                } else if ("cache_time".equals(A17)) {
                    regFlowExtras.A00 = r4.A0y();
                } else if ("force_create_account".equals(A17)) {
                    regFlowExtras.A0l = r4.A0d();
                } else if ("requested_username_change".equals(A17)) {
                    regFlowExtras.A0x = r4.A0d();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    regFlowExtras.A0Y = AnonymousClass7TG.A0l(r4);
                } else if ("one_tap_opt_in".equals(A17)) {
                    regFlowExtras.A0w = r4.A0d();
                } else if ("age_required".equals(A17)) {
                    regFlowExtras.A0g = r4.A0d();
                } else if ("is_eligible_to_register".equals(A17)) {
                    regFlowExtras.A0s = r4.A0d();
                } else if ("is_supervised_user".equals(A17)) {
                    regFlowExtras.A0v = r4.A0d();
                } else if ("user_birth_date".equals(A17)) {
                    regFlowExtras.A03 = C49112Epb.parseFromJson(r4);
                } else if ("existing_account_dialog_shown".equals(A17)) {
                    regFlowExtras.A0k = r4.A0d();
                } else if ("is_simple_sac_enabled".equals(A17)) {
                    regFlowExtras.A0u = r4.A0d();
                } else if ("last_logged_in_user_id".equals(A17)) {
                    regFlowExtras.A0J = AnonymousClass7TG.A0l(r4);
                } else if ("last_logged_in_username".equals(A17)) {
                    regFlowExtras.A0M = AnonymousClass7TG.A0l(r4);
                } else if ("fb_access_token".equals(A17)) {
                    regFlowExtras.A09 = AnonymousClass7TG.A0l(r4);
                } else if ("is_cal_flow".equals(A17)) {
                    regFlowExtras.A0r = r4.A0d();
                } else if ("force_signup_with_fb_after_cp_claiming".equals(A17)) {
                    regFlowExtras.A0m = r4.A0d();
                } else if ("vpc_link".equals(A17)) {
                    regFlowExtras.A0b = AnonymousClass7TG.A0l(r4);
                } else if ("vpc_token".equals(A17)) {
                    regFlowExtras.A0d = AnonymousClass7TG.A0l(r4);
                } else if ("vpc_status".equals(A17)) {
                    regFlowExtras.A0c = AnonymousClass7TG.A0l(r4);
                } else if ("vpc_invite_id".equals(A17)) {
                    regFlowExtras.A0a = AnonymousClass7TG.A0l(r4);
                } else if ("last_logged_in_user_auth_header".equals(A17)) {
                    regFlowExtras.A0H = AnonymousClass7TG.A0l(r4);
                } else if ("last_logged_in_user_access_token".equals(A17)) {
                    regFlowExtras.A0G = AnonymousClass7TG.A0l(r4);
                } else if ("sac_cal_flow".equals(A17)) {
                    regFlowExtras.A0t = r4.A0d();
                } else if ("sac_cal_user_consent_accepted".equals(A17)) {
                    regFlowExtras.A0y = r4.A0d();
                } else if ("last_logged_in_user_phone_number_with_country_code".equals(A17)) {
                    regFlowExtras.A0K = AnonymousClass7TG.A0l(r4);
                } else if ("last_logged_in_user_phone_number_without_country_code".equals(A17)) {
                    regFlowExtras.A0L = AnonymousClass7TG.A0l(r4);
                } else if ("last_logged_in_user_email".equals(A17)) {
                    regFlowExtras.A0I = AnonymousClass7TG.A0l(r4);
                } else if ("should_link_to_main".equals(A17)) {
                    regFlowExtras.A0z = r4.A0d();
                } else if ("convert_to_group".equals(A17)) {
                    regFlowExtras.A0i = r4.A0d();
                } else if ("group_biography".equals(A17)) {
                    regFlowExtras.A0E = AnonymousClass7TG.A0l(r4);
                } else if ("group_external_url".equals(A17)) {
                    regFlowExtras.A0F = AnonymousClass7TG.A0l(r4);
                } else if ("group_should_be_private".equals(A17)) {
                    regFlowExtras.A0o = r4.A0d();
                } else if (AnonymousClass000.A00(153).equals(A17)) {
                    regFlowExtras.A0p = r4.A0d();
                } else if ("create_group_thread".equals(A17)) {
                    regFlowExtras.A0j = r4.A0d();
                }
                r4.A0z();
            }
            return regFlowExtras;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
