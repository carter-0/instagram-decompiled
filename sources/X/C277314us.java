package X;

import com.instagram.direct.model.mentions.MentionedEntity;
import java.io.IOException;

/* renamed from: X.4us  reason: invalid class name and case insensitive filesystem */
public abstract class C277314us {
    public static MentionedEntity parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            MentionedEntity mentionedEntity = new MentionedEntity();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("fbid".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    mentionedEntity.A03 = str;
                } else if ("offset".equals(A0q)) {
                    mentionedEntity.A01 = r4.A1D();
                } else if ("length".equals(A0q)) {
                    mentionedEntity.A00 = r4.A1D();
                } else if ("interop_user_type".equals(A0q)) {
                    mentionedEntity.A02 = r4.A1D();
                }
                r4.A0z();
            }
            return mentionedEntity;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, MentionedEntity mentionedEntity) {
        r2.A0c();
        String str = mentionedEntity.A03;
        if (str != null) {
            r2.A0R("fbid", str);
        }
        r2.A0P("offset", mentionedEntity.A01);
        r2.A0P("length", mentionedEntity.A00);
        r2.A0P("interop_user_type", mentionedEntity.A02);
        r2.A0Z();
    }
}
