package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.4Ht  reason: invalid class name and case insensitive filesystem */
public abstract class C263104Ht {
    public static C263144Hx parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            C263124Hv r3 = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("can_viewer_donate".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("currency".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("donation_amount_config".equals(A0q)) {
                    r3 = C263114Hu.parseFromJson(r12);
                } else if ("donation_disabled_message".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("donation_url".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("has_viewer_donated".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("privacy_disclaimer".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("profile_fundraiser_id".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("you_donated_message".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            return new C263144Hx(r3, bool, bool2, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C263144Hx r4) {
        r3.A0c();
        Boolean bool = r4.A01;
        if (bool != null) {
            r3.A0S("can_viewer_donate", bool.booleanValue());
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0R("currency", str);
        }
        C263134Hw r1 = r4.A00;
        if (r1 != null) {
            r3.A0q("donation_amount_config");
            C263124Hv FEW = r1.FEW();
            r3.A0c();
            Integer num = FEW.A00;
            if (num != null) {
                r3.A0P("default_selected_donation_value", num.intValue());
            }
            List<Number> list = FEW.A05;
            if (list != null) {
                16P.A03(r3, "donation_amount_selector_values");
                for (Number number : list) {
                    if (number != null) {
                        r3.A0g(number.intValue());
                    }
                }
                r3.A0Y();
            }
            Integer num2 = FEW.A01;
            if (num2 != null) {
                r3.A0P("maximum_donation_amount", num2.intValue());
            }
            Integer num3 = FEW.A02;
            if (num3 != null) {
                r3.A0P("minimum_donation_amount", num3.intValue());
            }
            Integer num4 = FEW.A03;
            if (num4 != null) {
                r3.A0P("prefill_amount", num4.intValue());
            }
            String str2 = FEW.A04;
            if (str2 != null) {
                r3.A0R("user_currency", str2);
            }
            r3.A0Z();
        }
        String str3 = r4.A04;
        if (str3 != null) {
            r3.A0R("donation_disabled_message", str3);
        }
        String str4 = r4.A05;
        if (str4 != null) {
            r3.A0R("donation_url", str4);
        }
        Boolean bool2 = r4.A02;
        if (bool2 != null) {
            r3.A0S("has_viewer_donated", bool2.booleanValue());
        }
        String str5 = r4.A06;
        if (str5 != null) {
            r3.A0R("privacy_disclaimer", str5);
        }
        String str6 = r4.A07;
        if (str6 != null) {
            r3.A0R("profile_fundraiser_id", str6);
        }
        String str7 = r4.A08;
        if (str7 != null) {
            r3.A0R("you_donated_message", str7);
        }
        r3.A0Z();
    }
}
