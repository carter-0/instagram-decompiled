package X;

import java.io.IOException;

/* renamed from: X.4vf  reason: invalid class name and case insensitive filesystem */
public abstract class C277744vf {
    public static C277754vg parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            Boolean bool = null;
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("android_is_required_mvvm_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("is_broadcast_level_expand_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r11.A0d());
                } else if ("is_host_comment_liking_enabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(r11.A0d());
                } else if ("is_host_comment_reply_redesign_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(r11.A0d());
                }
                r11.A0z();
            }
            if (bool == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("android_is_required_mvvm_enabled", "IGLiveCommentInteractionsImpl");
            } else if (bool2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("is_broadcast_level_expand_enabled", "IGLiveCommentInteractionsImpl");
            } else if (bool3 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("is_host_comment_liking_enabled", "IGLiveCommentInteractionsImpl");
            } else if (bool4 != null || !(r11 instanceof 0c9)) {
                return new C277754vg(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                ((0c9) r11).A03.A00("is_host_comment_reply_redesign_enabled", "IGLiveCommentInteractionsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
