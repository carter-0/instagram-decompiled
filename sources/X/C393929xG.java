package X;

import com.instagram.common.gallery.GeneratedMediaMetadata;
import java.io.IOException;

/* renamed from: X.9xG  reason: invalid class name and case insensitive filesystem */
public abstract class C393929xG {
    public static GeneratedMediaMetadata parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("generated_media_prompt".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("is_internal".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                }
                r7.A0z();
            }
            if (bool != null || !(r7 instanceof 0c9)) {
                return new GeneratedMediaMetadata(str, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("is_internal", r7, "GeneratedMediaMetadata");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
