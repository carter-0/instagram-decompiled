package X;

import java.io.IOException;

/* renamed from: X.Czo  reason: case insensitive filesystem */
public abstract class C45638Czo {
    public static C42086BGp parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("fb_tag_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("fb_tag_name".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("fb_tag_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("fb_tag_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C42086BGp(str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42086BGp bGp) {
        r2.A0c();
        String str = bGp.A00;
        if (str != null) {
            r2.A0R("fb_tag_id", str);
        }
        String str2 = bGp.A01;
        if (str2 != null) {
            r2.A0R("fb_tag_name", str2);
        }
        String str3 = bGp.A02;
        if (str3 != null) {
            r2.A0R("fb_tag_type", str3);
        }
        String str4 = bGp.A03;
        if (str4 != null) {
            r2.A0R("fb_tag_url", str4);
        }
        String str5 = bGp.A04;
        if (str5 != null) {
            r2.A0R("pk", str5);
        }
        r2.A0Z();
    }
}
