package X;

import java.io.IOException;

/* renamed from: X.CZr  reason: case insensitive filesystem */
public abstract class C44204CZr {
    public static BFK parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("ads_display_mode".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("disable_liker_list_navigation".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("display_mode".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r14);
                } else if ("hide_view_count".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("is_daisy".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r14);
                } else if ("is_in_daisy_controls".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r14);
                } else if ("show_author_view_likes_button".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r14);
                } else if ("show_count_in_likers_list".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r14);
                } else if ("show_daisy_liker_list_header".equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r14);
                } else if ("show_learn_more".equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r14);
                } else if ("show_view_count_in_likers_list".equals(A17)) {
                    bool9 = AnonymousClass7TF.A0S(r14);
                }
                r14.A0z();
            }
            return new BFK(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
