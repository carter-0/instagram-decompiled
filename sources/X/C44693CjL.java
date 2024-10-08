package X;

import com.instagram.api.schemas.MessagingOffPlatformShareType;
import java.io.IOException;

/* renamed from: X.CjL  reason: case insensitive filesystem */
public abstract class C44693CjL {
    public static AnonymousClass1lH parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1lH r1 = new AnonymousClass1lH();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("prompt_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A01 = A0l;
                } else if (AnonymousClass000.A00(373).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3975).equals(A17)) {
                    MessagingOffPlatformShareType messagingOffPlatformShareType = (MessagingOffPlatformShareType) MessagingOffPlatformShareType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (messagingOffPlatformShareType == null) {
                        messagingOffPlatformShareType = MessagingOffPlatformShareType.UNRECOGNIZED;
                    }
                    r1.A00 = messagingOffPlatformShareType;
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
