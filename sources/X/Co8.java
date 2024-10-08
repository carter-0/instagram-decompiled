package X;

import java.io.IOException;

public abstract class Co8 {
    public static C45360Cv2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45360Cv2 cv2 = new C45360Cv2();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("countdown_id".equals(A17)) {
                    cv2.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("source_media_id".equals(A17)) {
                    cv2.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(311).equals(A17)) {
                    cv2.A00 = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return cv2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
