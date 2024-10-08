package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Eet  reason: case insensitive filesystem */
public abstract class C48460Eet {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        EXD exd;
        Object A01 = r7.A01();
        0qQ.A0C(A01, Pxd.A00(2));
        RegFlowExtras regFlowExtras = (RegFlowExtras) C308206Td.A0B(r6).A01(RegFlowExtras.class, G1T.A00);
        Iterator A0u = AnonymousClass7TF.A0u((Map) A01);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            if (A13 != null) {
                switch (A13.hashCode()) {
                    case -1813199520:
                        if (!A13.equals("force_signup_code")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0B = (String) value;
                            break;
                        }
                    case -1615090447:
                        if (!A13.equals("tos_version")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0X = (String) value;
                            break;
                        }
                    case -757782465:
                        if (!A13.equals("gdpr_required")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0n = AnonymousClass7TE.A1a(value);
                            break;
                        }
                    case -570881039:
                        if (!A13.equals("gdpr_state")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0C = (String) value;
                            break;
                        }
                    case 3146030:
                        if (!A13.equals("flow")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            if (!0qQ.A0K(value, "phone")) {
                                if (!0qQ.A0K(value, "email")) {
                                    break;
                                } else {
                                    exd = EXD.A03;
                                }
                            } else {
                                exd = EXD.PHONE;
                            }
                            regFlowExtras.A03(exd);
                            break;
                        }
                    case 96619420:
                        if (!A13.equals("email")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A08 = (String) value;
                            break;
                        }
                    case 558076639:
                        if (!A13.equals("age_required")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0g = AnonymousClass7TE.A1a(value);
                            break;
                        }
                    case 1174780724:
                        if (!A13.equals("sms_consent")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0q = AnonymousClass7TE.A1a(value);
                            break;
                        }
                    case 1274229687:
                        if (!A13.equals("confirmation_code")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A05 = (String) value;
                            break;
                        }
                    case 1663300947:
                        if (!A13.equals("country_code_data")) {
                            break;
                        } else {
                            0qQ.A0C(value, Pxd.A00(21));
                            Map map = (Map) value;
                            String A11 = DbT.A11("country_number", map);
                            String A112 = DbT.A11("country", map);
                            String A113 = DbT.A11("display_string", map);
                            if (!(A11 == null || A113 == null || A112 == null)) {
                                regFlowExtras.A01 = new CountryCodeData(A11, A113, A112);
                                break;
                            }
                        }
                    case 1821199090:
                        if (!A13.equals("phone_number_without_country_code")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0R = (String) value;
                            break;
                        }
                    case 1980340746:
                        if (!A13.equals("phone_number_with_country_code")) {
                            break;
                        } else {
                            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0Q = (String) value;
                            break;
                        }
                }
            }
        }
        return null;
    }
}
