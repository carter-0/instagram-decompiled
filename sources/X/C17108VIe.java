package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.VIe  reason: case insensitive filesystem */
public abstract class C17108VIe {
    public static final void A00(17Z r3, ULH ulh) {
        r3.A0c();
        String str = ulh.A09;
        if (str != null) {
            r3.A0R("tag", str);
        }
        C16537Uwh uwh = ulh.A07;
        0qQ.A0B(uwh, 0);
        r3.A0R("source", uwh.A00);
        r3.A0S("bounce_in", ulh.A0B);
        r3.A0S("fade_in", ulh.A0J);
        r3.A0S("touch_enabled_by_default", ulh.A0N);
        r3.A0S("removable_by_trash_can", ulh.A0M);
        r3.A0S("fully_visible_on_screen", ulh.A0L);
        r3.A0S("fully_visible_on_alignment_guide", ulh.A0K);
        r3.A0S("contour_path_enabled", ulh.A0C);
        r3.A0O("min_scale_factor", ulh.A01);
        r3.A0O("max_scale_factor", ulh.A00);
        List list = ulh.A0A;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "starting_offset", list);
            while (A0s.hasNext()) {
                r3.A0f(AnonymousClass7TE.A04(A0s.next()));
            }
            r3.A0Y();
        }
        r3.A0O("starting_scale_factor", ulh.A04);
        r3.A0O("starting_normalized_width", ulh.A02);
        r3.A0O("starting_rotation", ulh.A03);
        r3.A0P("starting_layer", ulh.A05);
        r3.A0S("enable_rotate_gesture", ulh.A0G);
        r3.A0S("enable_scale_gesture", ulh.A0H);
        r3.A0S("enable_horizontal_translation", ulh.A0F);
        r3.A0S("enable_vertical_translation", ulh.A0I);
        r3.A0S("enable_bouncy_press_down", ulh.A0D);
        String str2 = ulh.A08;
        if (str2 != null) {
            r3.A0R("content_description", str2);
        }
        C15031UKk uKk = ulh.A06;
        if (uKk != null) {
            r3.A0q("bounds_spec");
            r3.A0c();
            C16567UxK uxK = uKk.A08;
            if (uxK != null) {
                r3.A0P("bounds_spec_type", uxK.A00);
            }
            r3.A0O("bias_x", uKk.A00);
            r3.A0O("bias_y", uKk.A01);
            r3.A0O("normalized_center_x", uKk.A04);
            r3.A0O("normalized_center_y", uKk.A05);
            r3.A0P("gravity", uKk.A06);
            r3.A0O("gravity_offset_x", uKk.A02);
            r3.A0O("gravity_offset_y", uKk.A03);
            C15048ULb uLb = uKk.A07;
            if (uLb != null) {
                r3.A0q("rect");
                r3.A0c();
                r3.A0P("left", uLb.A01);
                r3.A0P("top", uLb.A03);
                r3.A0P("right", uLb.A02);
                r3.A0P("bottom", uLb.A00);
                r3.A0Z();
            }
            r3.A0Z();
        }
        r3.A0S("enable_bulk_remove_drawables_by_tag", ulh.A0E);
        r3.A0S("unlink_drawable_when_removed", ulh.A0O);
        r3.A0Z();
    }
}
