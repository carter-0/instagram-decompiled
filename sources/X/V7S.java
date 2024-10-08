package X;

import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7S {
    public static Map A00(C21038XAr xAr) {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = null;
        if (xAr.Aai() != null) {
            IGNativeSmartTextOverlayStylingAlignment Aai = xAr.Aai();
            if (Aai != null) {
                str3 = Aai.A00;
            } else {
                str3 = null;
            }
            linkedHashMap.put("alignment", str3);
        }
        if (xAr.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", xAr.getBackgroundColor());
        }
        if (xAr.B75() != null) {
            linkedHashMap.put("font_color", xAr.B75());
        }
        if (xAr.B7A() != null) {
            linkedHashMap.put("font_size", xAr.B7A());
        }
        if (xAr.B7B() != null) {
            IGNativeSmartTextOverlayStylingFontStyle B7B = xAr.B7B();
            if (B7B != null) {
                str2 = B7B.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("font_style", str2);
        }
        if (xAr.BMh() != null) {
            linkedHashMap.put("line_height", AnonymousClass7TH.A0D(xAr.BMh()));
        }
        if (xAr.BPG() != null) {
            linkedHashMap.put("max_number_of_lines", xAr.BPG());
        }
        if (xAr.C4q() != null) {
            IGNativeSmartTextOverlayTextAlignmentEnum C4q = xAr.C4q();
            if (C4q != null) {
                str = C4q.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("text_alignment", str);
        }
        if (xAr.C59() != null) {
            IGNativeSmartTextOverlayFontStyleEnum C59 = xAr.C59();
            if (C59 != null) {
                str4 = C59.A00;
            }
            linkedHashMap.put("text_font_style", str4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
