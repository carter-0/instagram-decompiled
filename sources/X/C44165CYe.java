package X;

import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYe  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44165CYe {
    public static Map A00(IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGAdCreativeStory9x16CaptionData.AlO() != null) {
            A1H.put(C273654mx.A00(598), iGAdCreativeStory9x16CaptionData.AlO());
        }
        if (iGAdCreativeStory9x16CaptionData.AlP() != null) {
            A1H.put(C273654mx.A00(599), iGAdCreativeStory9x16CaptionData.AlP());
        }
        if (iGAdCreativeStory9x16CaptionData.AlQ() != null) {
            A1H.put("caption_box_width_pct", iGAdCreativeStory9x16CaptionData.AlQ());
        }
        if (iGAdCreativeStory9x16CaptionData.AlR() != null) {
            A1H.put("caption_center_x_pct", AnonymousClass7TH.A0D(iGAdCreativeStory9x16CaptionData.AlR()));
        }
        if (iGAdCreativeStory9x16CaptionData.AlS() != null) {
            A1H.put("caption_center_y_pct", AnonymousClass7TH.A0D(iGAdCreativeStory9x16CaptionData.AlS()));
        }
        if (iGAdCreativeStory9x16CaptionData.AlT() != null) {
            A1H.put("caption_color", iGAdCreativeStory9x16CaptionData.AlT());
        }
        if (iGAdCreativeStory9x16CaptionData.AlU() != null) {
            A1H.put("caption_font_size", iGAdCreativeStory9x16CaptionData.AlU());
        }
        if (iGAdCreativeStory9x16CaptionData.AlV() != null) {
            CaptionTextFontStyle AlV = iGAdCreativeStory9x16CaptionData.AlV();
            if (AlV != null) {
                str = AlV.A00;
            } else {
                str = null;
            }
            A1H.put("caption_font_style", str);
        }
        if (iGAdCreativeStory9x16CaptionData.AlY() != null) {
            A1H.put("caption_num_lines", iGAdCreativeStory9x16CaptionData.AlY());
        }
        if (iGAdCreativeStory9x16CaptionData.AlZ() != null) {
            A1H.put("caption_tap_area_more_present", iGAdCreativeStory9x16CaptionData.AlZ());
        }
        if (iGAdCreativeStory9x16CaptionData.Ala() != null) {
            A1H.put("caption_tap_area_underline_present", iGAdCreativeStory9x16CaptionData.Ala());
        }
        return 0Yt.A0B(A1H);
    }
}
