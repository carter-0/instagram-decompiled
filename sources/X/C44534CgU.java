package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;

/* renamed from: X.CgU  reason: case insensitive filesystem */
public abstract class C44534CgU {
    public static TextWithEntitiesBlockDict parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            TextWithEntities textWithEntities = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("block_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("depth".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("text_with_entities".equals(A17)) {
                    textWithEntities = Ci4.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new TextWithEntitiesBlockDict(textWithEntities, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
