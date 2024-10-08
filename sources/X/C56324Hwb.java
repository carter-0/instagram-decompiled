package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hwb  reason: case insensitive filesystem */
public final class C56324Hwb {
    public static C54071Gyu parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A17)) {
                    r1.A00 = AnonymousClass1Zw.parseFromJson(r4);
                } else if (AnonymousClass000.A00(141).equals(A17)) {
                    r1.A07 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("comment_post_error".equals(A17)) {
                        r1.A04 = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(2901).equals(A17)) {
                        r1.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("mitigation".equals(A17)) {
                        r1.A05 = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(3631).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C41846B3n.A1E(r4, arrayList);
                            }
                        }
                        r1.A06 = arrayList;
                    } else if ("cause".equals(A17)) {
                        r1.A03 = AnonymousClass7TG.A0l(r4);
                    } else if ("comment_creation_key".equals(A17)) {
                        r1.A01 = AnonymousClass7TG.A0l(r4);
                    } else {
                        1XY.A01(r4, r1, A17);
                    }
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
