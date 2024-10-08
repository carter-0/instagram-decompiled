package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.Hx2  reason: case insensitive filesystem */
public final class C56351Hx2 {
    public static K1R parseFromJson(16F r8) {
        HMR hmr;
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A17)) {
                    r1.A00 = C63476Kxf.parseFromJson(r8);
                } else if (AnonymousClass000.A00(141).equals(A17)) {
                    r8.A0d();
                } else if ("is_offensive".equals(A17)) {
                    r1.A01 = r8.A0d();
                } else if (AnonymousClass000.A00(393).equals(A17)) {
                    String A1Q = r8.A1Q();
                    HMR[] values = HMR.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            hmr = null;
                            break;
                        }
                        hmr = values[i];
                        if (0qQ.A0K(hmr.A00, A1Q)) {
                            break;
                        }
                        i++;
                    }
                    0qQ.A0B(hmr, 0);
                } else {
                    1XY.A01(r8, r1, A17);
                }
                r8.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
