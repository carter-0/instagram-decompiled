package X;

import java.io.IOException;

/* renamed from: X.3IX  reason: invalid class name */
public abstract class AnonymousClass3IX {
    public static AnonymousClass3IY parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Float f = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("avg_core_sessions_per_day".equals(A0q)) {
                    f = new Float(r13.A0U());
                } else if ("follow_count".equals(A0q)) {
                    num = Integer.valueOf(r13.A1D());
                } else if ("is_high_me_user".equals(A0q)) {
                    bool = Boolean.valueOf(r13.A0d());
                } else if ("is_high_usage_likelihood".equals(A0q)) {
                    bool2 = Boolean.valueOf(r13.A0d());
                } else if ("is_teen".equals(A0q)) {
                    bool3 = Boolean.valueOf(r13.A0d());
                } else if ("lness28_score".equals(A0q)) {
                    num2 = Integer.valueOf(r13.A1D());
                } else if ("stories_imp_bucket".equals(A0q)) {
                    num3 = Integer.valueOf(r13.A1D());
                } else if ("viewer_swipe_preload_count".equals(A0q)) {
                    num4 = Integer.valueOf(r13.A1D());
                } else if ("viewer_tap_preload_count".equals(A0q)) {
                    num5 = Integer.valueOf(r13.A1D());
                } else if ("warm_start_refresh_timer_in_seconds".equals(A0q)) {
                    num6 = Integer.valueOf(r13.A1D());
                }
                r13.A0z();
            }
            return new AnonymousClass3IY(bool, bool2, bool3, f, num, num2, num3, num4, num5, num6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
