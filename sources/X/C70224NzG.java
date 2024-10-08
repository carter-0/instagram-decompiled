package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.NzG  reason: case insensitive filesystem */
public abstract class C70224NzG {
    public static C65561e1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65561e1 r0 = new C65561e1();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A17)) {
                    OG7 parseFromJson = C70873OPm.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
