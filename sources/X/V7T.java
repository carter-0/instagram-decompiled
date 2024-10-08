package X;

import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import java.io.IOException;

public abstract class V7T {
    public static UN6 parseFromJson(16F r12) {
        String str;
        String str2;
        String str3;
        String str4;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle = null;
            Float f = null;
            Integer num2 = null;
            IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum = null;
            IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("alignment".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                    iGNativeSmartTextOverlayStylingAlignment = (IGNativeSmartTextOverlayStylingAlignment) IGNativeSmartTextOverlayStylingAlignment.A01.get(str4);
                    if (iGNativeSmartTextOverlayStylingAlignment == null) {
                        iGNativeSmartTextOverlayStylingAlignment = IGNativeSmartTextOverlayStylingAlignment.UNRECOGNIZED;
                    }
                } else if ("background_color".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("font_color".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                } else if ("font_size".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("font_style".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                    iGNativeSmartTextOverlayStylingFontStyle = (IGNativeSmartTextOverlayStylingFontStyle) IGNativeSmartTextOverlayStylingFontStyle.A01.get(str3);
                    if (iGNativeSmartTextOverlayStylingFontStyle == null) {
                        iGNativeSmartTextOverlayStylingFontStyle = IGNativeSmartTextOverlayStylingFontStyle.UNRECOGNIZED;
                    }
                } else if ("line_height".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r12);
                } else if ("max_number_of_lines".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                } else if ("text_alignment".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                    iGNativeSmartTextOverlayTextAlignmentEnum = (IGNativeSmartTextOverlayTextAlignmentEnum) IGNativeSmartTextOverlayTextAlignmentEnum.A01.get(str2);
                    if (iGNativeSmartTextOverlayTextAlignmentEnum == null) {
                        iGNativeSmartTextOverlayTextAlignmentEnum = IGNativeSmartTextOverlayTextAlignmentEnum.UNRECOGNIZED;
                    }
                } else if ("text_font_style".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    iGNativeSmartTextOverlayFontStyleEnum = (IGNativeSmartTextOverlayFontStyleEnum) IGNativeSmartTextOverlayFontStyleEnum.A01.get(str);
                    if (iGNativeSmartTextOverlayFontStyleEnum == null) {
                        iGNativeSmartTextOverlayFontStyleEnum = IGNativeSmartTextOverlayFontStyleEnum.UNRECOGNIZED;
                    }
                }
                r12.A0z();
            }
            return new UN6(iGNativeSmartTextOverlayFontStyleEnum, iGNativeSmartTextOverlayStylingAlignment, iGNativeSmartTextOverlayStylingFontStyle, iGNativeSmartTextOverlayTextAlignmentEnum, f, num, num2, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
