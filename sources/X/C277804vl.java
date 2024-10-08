package X;

import java.io.IOException;

/* renamed from: X.4vl  reason: invalid class name and case insensitive filesystem */
public abstract class C277804vl {
    public static C277814vm parseFromJson(16F r18) {
        16F r1 = r18;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("aspect_ratio_change_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("comment_redesign_combined_test_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("is_aspect_ratio_16_9".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("viewer_redesign_combined_test_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("viewer_redesign_v2_combined_test_enabled".equals(A0q)) {
                    bool5 = Boolean.valueOf(r1.A0d());
                }
                r1.A0z();
            }
            if (bool == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("aspect_ratio_change_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            } else if (bool2 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("comment_redesign_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            } else if (bool3 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("is_aspect_ratio_16_9", "IGLiveViewerRedesignBroadcasterImpl");
            } else if (bool4 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("viewer_redesign_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            } else if (bool5 != null || !(r1 instanceof 0c9)) {
                return new C277814vm(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
            } else {
                ((0c9) r1).A03.A00("viewer_redesign_v2_combined_test_enabled", "IGLiveViewerRedesignBroadcasterImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
