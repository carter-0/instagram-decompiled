package X;

import java.io.IOException;

public abstract class LH6 {
    public static C61037Jvb parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("existing_prompt_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (AnonymousClass000.A00(355).equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("replied_to_media_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C61037Jvb(str, str2, str3, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61037Jvb jvb, 17Z r3) {
        r3.A0c();
        String str = jvb.A00;
        if (str != null) {
            r3.A0R("existing_prompt_id", str);
        }
        String str2 = jvb.A01;
        if (str2 != null) {
            r3.A0R(AnonymousClass000.A00(355), str2);
        }
        String str3 = jvb.A02;
        if (str3 != null) {
            r3.A0R("replied_to_media_id", str3);
        }
        r3.A0Z();
    }
}
