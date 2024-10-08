package X;

import java.io.IOException;

public abstract class O1W {
    public static JV7 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            JV7 jv7 = new JV7(29);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("gif_media_id".equals(A17)) {
                    jv7.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("gif_url".equals(A17)) {
                    jv7.A00 = AnonymousClass53C.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1257).equals(A17)) {
                    jv7.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return jv7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
