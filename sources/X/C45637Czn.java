package X;

import java.io.IOException;

/* renamed from: X.Czn  reason: case insensitive filesystem */
public abstract class C45637Czn {
    public static C42083BGm parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("fb_entity_author_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("fb_entity_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("fb_entity_subtype".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("fb_entity_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("fb_entity_url".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("fb_reshare_session_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                } else if ("mib_extid".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r11.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new C42083BGm(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42083BGm bGm, boolean z) {
        if (z) {
            r2.A0c();
        }
        String str = bGm.A00;
        if (str != null) {
            r2.A0R("fb_entity_author_id", str);
        }
        String str2 = bGm.A01;
        if (str2 != null) {
            r2.A0R("fb_entity_id", str2);
        }
        String str3 = bGm.A02;
        if (str3 != null) {
            r2.A0R("fb_entity_subtype", str3);
        }
        String str4 = bGm.A03;
        if (str4 != null) {
            r2.A0R("fb_entity_type", str4);
        }
        String str5 = bGm.A04;
        if (str5 != null) {
            r2.A0R("fb_entity_url", str5);
        }
        String str6 = bGm.A05;
        if (str6 != null) {
            r2.A0R("fb_reshare_session_id", str6);
        }
        String str7 = bGm.A06;
        if (str7 != null) {
            r2.A0R("mib_extid", str7);
        }
        String str8 = bGm.A07;
        if (str8 != null) {
            r2.A0R("pk", str8);
        }
        if (z) {
            r2.A0Z();
        }
    }
}
