package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Clo  reason: case insensitive filesystem */
public abstract class C44838Clo {
    public static C60984Jug parseFromJson(16F r22) {
        16F r3 = r22;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            JVH jvh = null;
            BIY biy = null;
            String str6 = null;
            BIW biw = null;
            String str7 = null;
            String str8 = null;
            BIX bix = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("country_code".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("error_codes".equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            C15050ULg parseFromJson = C44835Cll.parseFromJson(r3);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("follow_up_action_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("instagram_data_policy_setting_description".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("instagram_data_policy_url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("is_organic_generic_form".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("lead_gen_data".equals(A17)) {
                    jvh = C44836Clm.parseFromJson(r3);
                } else if ("lead_gen_deep_link_user_status".equals(A17)) {
                    biy = C44842Cls.parseFromJson(r3);
                } else if ("next_button_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("page".equals(A17)) {
                    biw = C44839Clp.parseFromJson(r3);
                } else if ("primary_button_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("privacy_setting_description".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if ("quality_ad_unit".equals(A17)) {
                    bix = C44840Clq.parseFromJson(r3);
                } else if ("secure_sharing_text_instagram".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r3.A1P();
                    }
                } else if ("select_text_hint".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r3.A1P();
                    }
                } else if ("send_description".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r3.A1P();
                    }
                } else if ("short_secure_sharing_text_instagram".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            return new C60984Jug(jvh, biw, bix, biy, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
