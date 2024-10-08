package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.HdJ  reason: case insensitive filesystem */
public abstract class C55167HdJ {
    public static C56538I0n parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C56538I0n i0n = new C56538I0n();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(75).equals(A17)) {
                    i0n.A03 = r4.A0y();
                } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A17)) {
                    i0n.A04 = AnonymousClass1Zw.parseFromJson(r4);
                } else if ("container_module".equals(A17)) {
                    i0n.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("radio_type".equals(A17)) {
                    i0n.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("is_carousel_bumped_post".equals(A17)) {
                    i0n.A07 = r4.A0d();
                } else if ("feed_position".equals(A17)) {
                    i0n.A01 = r4.A1D();
                } else if ("carousel_index".equals(A17)) {
                    i0n.A00 = r4.A1D();
                } else if (AnonymousClass000.A00(1742).equals(A17)) {
                    i0n.A02 = r4.A1D();
                } else if (AnonymousClass000.A00(674).equals(A17)) {
                    i0n.A09 = r4.A0d();
                } else if (AnonymousClass000.A00(1512).equals(A17)) {
                    i0n.A0A = r4.A0d();
                }
                r4.A0z();
            }
            return i0n;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
