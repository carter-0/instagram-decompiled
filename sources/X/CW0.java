package X;

import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CW0 {
    public static Map A00(ColorAtTextRangeDictIntf colorAtTextRangeDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (colorAtTextRangeDictIntf.BD2() != null) {
            A1H.put("hex_rgb_color", colorAtTextRangeDictIntf.BD2());
        }
        if (colorAtTextRangeDictIntf.BD3() != null) {
            A1H.put("hex_rgb_color_dark", colorAtTextRangeDictIntf.BD3());
        }
        if (colorAtTextRangeDictIntf.BMP() != null) {
            A1H.put("length", colorAtTextRangeDictIntf.BMP());
        }
        if (colorAtTextRangeDictIntf.BXp() != null) {
            A1H.put("offset", colorAtTextRangeDictIntf.BXp());
        }
        return 0Yt.A0B(A1H);
    }
}
