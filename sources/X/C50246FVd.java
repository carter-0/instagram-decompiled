package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.FVd  reason: case insensitive filesystem */
public final class C50246FVd implements 1NF {
    public final int A00;
    public final Object A01;

    public C50246FVd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        if (this.A00 != 0) {
            return C49110EpZ.parseFromJson(16P.A00(str));
        }
        return C48879Elf.parseFromJson(16P.A00(str));
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        if (this.A00 != 0) {
            RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            String str = regFlowExtras.A07;
            if (str != null) {
                A0K.A0R("device_verification_result", str);
            }
            String str2 = regFlowExtras.A06;
            if (str2 != null) {
                A0K.A0R("device_verification_nonce", str2);
            }
            if (regFlowExtras.A01 != null) {
                A0K.A0q("country_code_data");
                CountryCodeData countryCodeData = regFlowExtras.A01;
                A0K.A0c();
                String str3 = countryCodeData.A01;
                if (str3 != null) {
                    A0K.A0R("country_code", str3);
                }
                String str4 = countryCodeData.A02;
                if (str4 != null) {
                    A0K.A0R("display_string", str4);
                }
                String str5 = countryCodeData.A00;
                if (str5 != null) {
                    A0K.A0R("country", str5);
                }
                A0K.A0Z();
            }
            String str6 = regFlowExtras.A0R;
            if (str6 != null) {
                A0K.A0R("phone_number_without_country_code", str6);
            }
            String str7 = regFlowExtras.A0Q;
            if (str7 != null) {
                A0K.A0R("phone_number_with_country_code", str7);
            }
            String str8 = regFlowExtras.A08;
            if (str8 != null) {
                A0K.A0R("email", str8);
            }
            String str9 = regFlowExtras.A0O;
            if (str9 != null) {
                A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
            }
            String str10 = regFlowExtras.A0Z;
            if (str10 != null) {
                A0K.A0R(Dd6.A00(), str10);
            }
            String str11 = regFlowExtras.A0W;
            if (str11 != null) {
                A0K.A0R("suggested_username", str11);
            }
            String str12 = regFlowExtras.A0P;
            if (str12 != null) {
                A0K.A0R("password", str12);
            }
            A0K.A0S("skip_password", regFlowExtras.A11);
            String str13 = regFlowExtras.A05;
            if (str13 != null) {
                A0K.A0R("confirmation_code", str13);
            }
            String str14 = regFlowExtras.A0B;
            if (str14 != null) {
                A0K.A0R("force_sign_up_code", str14);
            }
            String str15 = regFlowExtras.A0D;
            if (str15 != null) {
                A0K.A0R("google_id_token", str15);
            }
            if (regFlowExtras.A0e != null) {
                16P.A03(A0K, "username_suggestions");
                Iterator it = regFlowExtras.A0e.iterator();
                while (it.hasNext()) {
                    C41846B3n.A18(A0K, it);
                }
                A0K.A0Y();
            }
            if (regFlowExtras.A0f != null) {
                16P.A03(A0K, "username_suggestions_with_metadata");
                for (C49512Ewr ewr : regFlowExtras.A0f) {
                    if (ewr != null) {
                        A0K.A0c();
                        String str16 = ewr.A01;
                        if (str16 != null) {
                            A0K.A0R(Dd6.A00(), str16);
                        }
                        String str17 = ewr.A00;
                        if (str17 != null) {
                            A0K.A0R("prototype", str17);
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            if (regFlowExtras.A02 != null) {
                A0K.A0q("solution");
                C17959Vis vis = regFlowExtras.A02;
                A0K.A0c();
                if (vis.A00 != null) {
                    16P.A03(A0K, "solutions");
                    for (C17958Vir vir : vis.A00) {
                        if (vir != null) {
                            A0K.A0c();
                            if (vir.A00 != null) {
                                16P.A03(A0K, "sublist");
                                for (Number number : vir.A00) {
                                    if (number != null) {
                                        A0K.A0g(number.intValue());
                                    }
                                }
                                A0K.A0Y();
                            }
                            A0K.A0Z();
                        }
                    }
                    A0K.A0Y();
                }
                A0K.A0Z();
            }
            String str18 = regFlowExtras.A0S;
            if (str18 != null) {
                A0K.A0R("registration_flow", str18);
            }
            String str19 = regFlowExtras.A0N;
            if (str19 != null) {
                A0K.A0R("last_registration_step", str19);
            }
            String str20 = regFlowExtras.A0V;
            if (str20 != null) {
                A0K.A0R("signup_type", str20);
            }
            String str21 = regFlowExtras.A04;
            if (str21 != null) {
                A0K.A0R("actor_id", str21);
            }
            String str22 = regFlowExtras.A0T;
            if (str22 != null) {
                A0K.A0R("sac_intent", str22);
            }
            String str23 = regFlowExtras.A0U;
            if (str23 != null) {
                A0K.A0R("sac_upsell_surface", str23);
            }
            A0K.A0S("skip_email", regFlowExtras.A10);
            A0K.A0S("allow_contact_sync", regFlowExtras.A0h);
            A0K.A0S("has_sms_consent", regFlowExtras.A0q);
            A0K.A0S("gdpr_required", regFlowExtras.A0n);
            String str24 = regFlowExtras.A0C;
            if (str24 != null) {
                A0K.A0R("gdpr_s", str24);
            }
            String str25 = regFlowExtras.A0X;
            if (str25 != null) {
                A0K.A0R("tos_version", str25);
            }
            A0K.A0S("tos_acceptance_not_required", regFlowExtras.A12);
            A0K.A0Q("cache_time", regFlowExtras.A00);
            A0K.A0S("force_create_account", regFlowExtras.A0l);
            A0K.A0S("requested_username_change", regFlowExtras.A0x);
            String str26 = regFlowExtras.A0Y;
            if (str26 != null) {
                A0K.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str26);
            }
            A0K.A0S("one_tap_opt_in", regFlowExtras.A0w);
            A0K.A0S("age_required", regFlowExtras.A0g);
            A0K.A0S("is_eligible_to_register", regFlowExtras.A0s);
            A0K.A0S("is_supervised_user", regFlowExtras.A0v);
            if (regFlowExtras.A03 != null) {
                A0K.A0q("user_birth_date");
                UserBirthDate userBirthDate = regFlowExtras.A03;
                A0K.A0c();
                A0K.A0P("birth_year", userBirthDate.A02);
                A0K.A0P("birth_month", userBirthDate.A01);
                A0K.A0P("birth_day", userBirthDate.A00);
                A0K.A0Z();
            }
            A0K.A0S("existing_account_dialog_shown", regFlowExtras.A0k);
            A0K.A0S("is_simple_sac_enabled", regFlowExtras.A0u);
            String str27 = regFlowExtras.A0J;
            if (str27 != null) {
                A0K.A0R("last_logged_in_user_id", str27);
            }
            String str28 = regFlowExtras.A0M;
            if (str28 != null) {
                A0K.A0R("last_logged_in_username", str28);
            }
            String str29 = regFlowExtras.A09;
            if (str29 != null) {
                A0K.A0R("fb_access_token", str29);
            }
            A0K.A0S("is_cal_flow", regFlowExtras.A0r);
            A0K.A0S("force_signup_with_fb_after_cp_claiming", regFlowExtras.A0m);
            String str30 = regFlowExtras.A0b;
            if (str30 != null) {
                A0K.A0R("vpc_link", str30);
            }
            String str31 = regFlowExtras.A0d;
            if (str31 != null) {
                A0K.A0R("vpc_token", str31);
            }
            String str32 = regFlowExtras.A0c;
            if (str32 != null) {
                A0K.A0R("vpc_status", str32);
            }
            String str33 = regFlowExtras.A0a;
            if (str33 != null) {
                A0K.A0R("vpc_invite_id", str33);
            }
            String str34 = regFlowExtras.A0H;
            if (str34 != null) {
                A0K.A0R("last_logged_in_user_auth_header", str34);
            }
            String str35 = regFlowExtras.A0G;
            if (str35 != null) {
                A0K.A0R("last_logged_in_user_access_token", str35);
            }
            A0K.A0S("sac_cal_flow", regFlowExtras.A0t);
            A0K.A0S("sac_cal_user_consent_accepted", regFlowExtras.A0y);
            String str36 = regFlowExtras.A0K;
            if (str36 != null) {
                A0K.A0R("last_logged_in_user_phone_number_with_country_code", str36);
            }
            String str37 = regFlowExtras.A0L;
            if (str37 != null) {
                A0K.A0R("last_logged_in_user_phone_number_without_country_code", str37);
            }
            String str38 = regFlowExtras.A0I;
            if (str38 != null) {
                A0K.A0R("last_logged_in_user_email", str38);
            }
            A0K.A0S("should_link_to_main", regFlowExtras.A0z);
            A0K.A0S("convert_to_group", regFlowExtras.A0i);
            String str39 = regFlowExtras.A0E;
            if (str39 != null) {
                A0K.A0R("group_biography", str39);
            }
            String str40 = regFlowExtras.A0F;
            if (str40 != null) {
                A0K.A0R("group_external_url", str40);
            }
            A0K.A0S("group_should_be_private", regFlowExtras.A0o);
            A0K.A0S(AnonymousClass000.A00(153), regFlowExtras.A0p);
            A0K.A0S("create_group_thread", regFlowExtras.A0j);
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        }
        C49343Ety ety = (C49343Ety) obj;
        StringWriter stringWriter2 = new StringWriter();
        17W A0K2 = AnonymousClass7TF.A0K(stringWriter2);
        if (ety.A00 != null) {
            16P.A03(A0K2, "entries");
            Iterator it2 = ety.A00.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0f = DbT.A0f(it2);
                if (A0f != null) {
                    C330897Or.A00(A0K2, A0f);
                }
            }
            A0K2.A0Y();
        }
        return AnonymousClass7TG.A0k(A0K2, stringWriter2);
    }
}
