package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.JTz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C59692JTz {
    public static Map A00(AnonymousClass16l r4) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.AeD() != null) {
            linkedHashMap.put("available_theme_colors", r4.AeD());
        }
        String str2 = null;
        if (r4.Aen() != null) {
            ImageUrl Aen = r4.Aen();
            if (Aen != null) {
                str = Aen.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("background_image_url", str);
        }
        if (r4.getEmoji() != null) {
            linkedHashMap.put("emoji", r4.getEmoji());
        }
        if (r4.B0q() != null) {
            linkedHashMap.put("emoji_color", r4.B0q());
        }
        if (r4.B9f() != null) {
            linkedHashMap.put("gradient", r4.B9f());
        }
        if (r4.CPI() != null) {
            linkedHashMap.put("is_background_image_blurred", r4.CPI());
        }
        if (r4.BTW() != null) {
            linkedHashMap.put(DatePickerDialogModule.ARG_MODE, r4.BTW());
        }
        if (r4.Brt() != null) {
            linkedHashMap.put("selected_theme_color", r4.Brt());
        }
        if (r4.Bs5() != null) {
            linkedHashMap.put("selfie_sticker", r4.Bs5());
        }
        if (r4.Bs6() != null) {
            ImageUrl Bs6 = r4.Bs6();
            if (Bs6 != null) {
                str2 = Bs6.getUrl();
            }
            linkedHashMap.put("selfie_url", str2);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
