package X;

import com.instagram.api.schemas.RIXUCoverPreviewType;
import java.io.IOException;

/* renamed from: X.KqH  reason: case insensitive filesystem */
public abstract class C63026KqH {
    public static C61074JwC parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C61074JwC jwC = null;
            Integer num = null;
            Integer num2 = null;
            RIXUCoverPreviewType rIXUCoverPreviewType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("elements".equals(A17)) {
                    jwC = C69755Nre.parseFromJson(r8);
                } else if ("preview_length_in_sec".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("preview_stagger_in_sec".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else if ("preview_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    rIXUCoverPreviewType = (RIXUCoverPreviewType) RIXUCoverPreviewType.A01.get(str);
                    if (rIXUCoverPreviewType == null) {
                        rIXUCoverPreviewType = RIXUCoverPreviewType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            return new C61074JwC(1, jwC, num, num2, rIXUCoverPreviewType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
