package X;

import java.io.IOException;

/* renamed from: X.4vc  reason: invalid class name and case insensitive filesystem */
public abstract class C277714vc {
    public static C277724vd parseFromJson(16F r11) {
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
                if ("join_request_system_comment_delay_5_else_0".equals(A0q)) {
                    bool = Boolean.valueOf(r11.A0d());
                } else if ("share_system_comment_delay_10_else_5".equals(A0q)) {
                    bool2 = Boolean.valueOf(r11.A0d());
                } else if ("show_join_request_system_comment".equals(A0q)) {
                    bool3 = Boolean.valueOf(r11.A0d());
                } else if ("show_share_system_comment".equals(A0q)) {
                    bool4 = Boolean.valueOf(r11.A0d());
                }
                r11.A0z();
            }
            if (bool == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("join_request_system_comment_delay_5_else_0", "IGLiveShareSystemCommentImpl");
            } else if (bool2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("share_system_comment_delay_10_else_5", "IGLiveShareSystemCommentImpl");
            } else if (bool3 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("show_join_request_system_comment", "IGLiveShareSystemCommentImpl");
            } else if (bool4 != null || !(r11 instanceof 0c9)) {
                return new C277724vd(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                ((0c9) r11).A03.A00("show_share_system_comment", "IGLiveShareSystemCommentImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
