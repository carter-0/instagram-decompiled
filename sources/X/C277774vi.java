package X;

import java.io.IOException;

/* renamed from: X.4vi  reason: invalid class name and case insensitive filesystem */
public abstract class C277774vi {
    public static C277784vj parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("dont_change_comments_height".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("is_broadcast_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            if (bool == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("dont_change_comments_height", "IGLiveCommentSubscriptionImpl");
            } else if (bool2 != null || !(r7 instanceof 0c9)) {
                return new C277784vj(bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r7).A03.A00("is_broadcast_enabled", "IGLiveCommentSubscriptionImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
