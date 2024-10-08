package X;

import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import java.io.IOException;

/* renamed from: X.CYf  reason: case insensitive filesystem */
public abstract class C44166CYf {
    public static IGAdCreativeStory9x16CaptionDataImpl parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Float f = null;
            Float f2 = null;
            String str4 = null;
            Integer num2 = null;
            CaptionTextFontStyle captionTextFontStyle = null;
            Integer num3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if (C273654mx.A00(598).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (C273654mx.A00(599).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("caption_box_width_pct".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("caption_center_x_pct".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r14);
                } else if ("caption_center_y_pct".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r14);
                } else if ("caption_color".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("caption_font_size".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r14);
                } else if ("caption_font_style".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    captionTextFontStyle = (CaptionTextFontStyle) CaptionTextFontStyle.A01.get(str);
                    if (captionTextFontStyle == null) {
                        captionTextFontStyle = CaptionTextFontStyle.UNRECOGNIZED;
                    }
                } else if ("caption_num_lines".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r14);
                } else if ("caption_tap_area_more_present".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else {
                    bool2 = C41847B3o.A0z(r14, bool2, A17, "caption_tap_area_underline_present");
                }
                r14.A0z();
            }
            return new IGAdCreativeStory9x16CaptionDataImpl(captionTextFontStyle, bool, bool2, f, f2, num, num2, num3, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
