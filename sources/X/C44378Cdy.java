package X;

import java.io.IOException;

/* renamed from: X.Cdy  reason: case insensitive filesystem */
public abstract class C44378Cdy {
    public static C42074BGc parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("app_action_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("app_icon_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("content_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("link".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if (C41845B3m.A19(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r10.A1P();
                    }
                } else if ("preview_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new C42074BGc(str, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
