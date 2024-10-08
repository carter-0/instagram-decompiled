package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Czl  reason: case insensitive filesystem */
public abstract class C45635Czl {
    public static BGi parseFromJson(16F r17) {
        16F r1 = r17;
        0qQ.A0B(r1, 0);
        try {
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Long l = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Boolean bool3 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                if (C41846B3n.A1a(r1, A0q)) {
                    user = C41845B3m.A0a(r1, false);
                } else if ("background_image_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                } else if ("countdown_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("digit_card_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("digit_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("end_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("end_ts".equals(A0q)) {
                    l = AnonymousClass7TF.A0Z(r1);
                } else if ("following_enabled".equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("is_owner".equals(A0q)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if ("start_background_color".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if (C41845B3m.A1A(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if (!"text_color".equals(A0q)) {
                    bool3 = C41847B3o.A0z(r1, bool3, A0q, "viewer_is_following");
                } else if (r1.A11() == 16L.A0G) {
                    str8 = null;
                } else {
                    str8 = r1.A1P();
                }
                r1.A0z();
            }
            return new BGi(user, bool, bool2, bool3, l, str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, BGi bGi, boolean z) {
        if (z) {
            r3.A0c();
        }
        User user = bGi.A00;
        if (user != null) {
            C41845B3m.A0w(r3, user, "attribution");
        }
        String str = bGi.A05;
        if (str != null) {
            r3.A0R("background_image_url", str);
        }
        String str2 = bGi.A06;
        if (str2 != null) {
            r3.A0R("countdown_id", str2);
        }
        String str3 = bGi.A07;
        if (str3 != null) {
            r3.A0R("digit_card_color", str3);
        }
        String str4 = bGi.A08;
        if (str4 != null) {
            r3.A0R("digit_color", str4);
        }
        String str5 = bGi.A09;
        if (str5 != null) {
            r3.A0R("end_background_color", str5);
        }
        Long l = bGi.A04;
        if (l != null) {
            r3.A0Q("end_ts", l.longValue());
        }
        Boolean bool = bGi.A01;
        if (bool != null) {
            r3.A0S("following_enabled", bool.booleanValue());
        }
        Boolean bool2 = bGi.A02;
        if (bool2 != null) {
            r3.A0S("is_owner", bool2.booleanValue());
        }
        String str6 = bGi.A0A;
        if (str6 != null) {
            r3.A0R("start_background_color", str6);
        }
        C41846B3n.A0z(r3, bGi.A0B);
        String str7 = bGi.A0C;
        if (str7 != null) {
            r3.A0R("text_color", str7);
        }
        Boolean bool3 = bGi.A03;
        if (bool3 != null) {
            r3.A0S("viewer_is_following", bool3.booleanValue());
        }
        if (z) {
            r3.A0Z();
        }
    }
}
