package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CyZ  reason: case insensitive filesystem */
public abstract class C45561CyZ {
    public static C278054wA parseFromJson(16F r18) {
        16F r3 = r18;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            User user = null;
            C42122BIa bIa = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Long l = null;
            Long l2 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("charity_user".equals(A17)) {
                    user = C41845B3m.A0a(r3, false);
                } else if ("consumption_sheet_config".equals(A17)) {
                    bIa = C44858Cm9.parseFromJson(r3);
                } else if ("donations_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if ("donations_count_current_session_only".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r3);
                } else if ("formatted_amount_raised".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("formatted_amount_raised_current_session_only".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("formatted_amount_raised_during_live_str".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("formatted_amount_raised_of_goal_amount_str".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("formatted_donations_count".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("formatted_donations_count_current_session_only".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("fundraiser_title".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if ("live_fundraiser_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else {
                    l2 = C41847B3o.A14(r3, l2, A17, "standalone_fundraiser_id");
                }
                r3.A0z();
            }
            return new C278054wA(bIa, user, num, num2, l, l2, str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, C278054wA r5) {
        r4.A0c();
        User user = r5.A01;
        if (user != null) {
            C41845B3m.A0w(r4, user, "charity_user");
        }
        C42122BIa bIa = r5.A00;
        if (bIa != null) {
            r4.A0q("consumption_sheet_config");
            r4.A0c();
            Boolean bool = bIa.A01;
            if (bool != null) {
                r4.A0S("can_viewer_donate", bool.booleanValue());
            }
            C42039BEr bEr = bIa.A00;
            if (bEr != null) {
                r4.A0q("donation_amount_config");
                r4.A0c();
                Integer num = bEr.A00;
                if (num != null) {
                    r4.A0P("default_selected_donation_value", num.intValue());
                }
                List list = bEr.A05;
                if (list != null) {
                    Iterator A0s = C41845B3m.A0s(r4, "donation_amount_selector_values", list);
                    while (A0s.hasNext()) {
                        Number number = (Number) A0s.next();
                        if (number != null) {
                            r4.A0g(number.intValue());
                        }
                    }
                    r4.A0Y();
                }
                Integer num2 = bEr.A01;
                if (num2 != null) {
                    r4.A0P("maximum_donation_amount", num2.intValue());
                }
                Integer num3 = bEr.A02;
                if (num3 != null) {
                    r4.A0P("minimum_donation_amount", num3.intValue());
                }
                Integer num4 = bEr.A03;
                if (num4 != null) {
                    r4.A0P("prefill_amount", num4.intValue());
                }
                String str = bEr.A04;
                if (str != null) {
                    r4.A0R("user_currency", str);
                }
                r4.A0Z();
            }
            String str2 = bIa.A02;
            if (str2 != null) {
                r4.A0R("donation_disabled_message", str2);
            }
            String str3 = bIa.A03;
            if (str3 != null) {
                r4.A0R("donation_url", str3);
            }
            String str4 = bIa.A04;
            if (str4 != null) {
                r4.A0R("privacy_disclaimer", str4);
            }
            String str5 = bIa.A05;
            if (str5 != null) {
                r4.A0R("profile_fundraiser_id", str5);
            }
            String str6 = bIa.A06;
            if (str6 != null) {
                r4.A0R("you_donated_message", str6);
            }
            r4.A0Z();
        }
        Integer num5 = r5.A02;
        if (num5 != null) {
            r4.A0P("donations_count", num5.intValue());
        }
        Integer num6 = r5.A03;
        if (num6 != null) {
            r4.A0P("donations_count_current_session_only", num6.intValue());
        }
        String str7 = r5.A06;
        if (str7 != null) {
            r4.A0R("formatted_amount_raised", str7);
        }
        String str8 = r5.A07;
        if (str8 != null) {
            r4.A0R("formatted_amount_raised_current_session_only", str8);
        }
        String str9 = r5.A08;
        if (str9 != null) {
            r4.A0R("formatted_amount_raised_during_live_str", str9);
        }
        String str10 = r5.A09;
        if (str10 != null) {
            r4.A0R("formatted_amount_raised_of_goal_amount_str", str10);
        }
        String str11 = r5.A0A;
        if (str11 != null) {
            r4.A0R("formatted_donations_count", str11);
        }
        String str12 = r5.A0B;
        if (str12 != null) {
            r4.A0R("formatted_donations_count_current_session_only", str12);
        }
        String str13 = r5.A0C;
        if (str13 != null) {
            r4.A0R("formatted_goal_amount", str13);
        }
        String str14 = r5.A0D;
        if (str14 != null) {
            r4.A0R("fundraiser_title", str14);
        }
        Long l = r5.A04;
        if (l != null) {
            r4.A0Q("live_fundraiser_id", l.longValue());
        }
        Long l2 = r5.A05;
        if (l2 != null) {
            r4.A0Q("standalone_fundraiser_id", l2.longValue());
        }
        r4.A0Z();
    }
}
