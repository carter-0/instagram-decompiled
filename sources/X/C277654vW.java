package X;

import java.io.IOException;

/* renamed from: X.4vW  reason: invalid class name and case insensitive filesystem */
public abstract class C277654vW {
    public static C277664vX parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Boolean bool = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("tap_state_animation_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("tap_state_bottom_call_controls_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r9.A0d());
                } else if ("tap_to_show_pill_enabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(r9.A0d());
                }
                r9.A0z();
            }
            if (bool == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("tap_state_animation_enabled", "IGLiveHaloCallControlsImpl");
            } else if (bool2 == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("tap_state_bottom_call_controls_enabled", "IGLiveHaloCallControlsImpl");
            } else if (bool3 != null || !(r9 instanceof 0c9)) {
                return new C277664vX(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                ((0c9) r9).A03.A00("tap_to_show_pill_enabled", "IGLiveHaloCallControlsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
