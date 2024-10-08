package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import java.io.IOException;

/* renamed from: X.9xH  reason: invalid class name and case insensitive filesystem */
public abstract class C393939xH {
    public static ImmersiveMediaFields parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ImmersiveMediaFields immersiveMediaFields = new ImmersiveMediaFields();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("glbUrl".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    immersiveMediaFields.A00 = str;
                } else if (AnonymousClass000.A00(3407).equals(A17)) {
                    immersiveMediaFields.A01 = r3.A0d();
                }
                r3.A0z();
            }
            return immersiveMediaFields;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
