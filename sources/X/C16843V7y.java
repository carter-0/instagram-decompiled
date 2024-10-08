package X;

import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.V7y  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16843V7y {
    public static Map A00(NoteCustomTheme noteCustomTheme) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (noteCustomTheme.AYd() != null) {
            NoteActivationType AYd = noteCustomTheme.AYd();
            if (AYd != null) {
                str = AYd.A00;
            } else {
                str = null;
            }
            linkedHashMap.put(C273654mx.A00(229), str);
        }
        if (noteCustomTheme.Aej() != null) {
            linkedHashMap.put("background_color_hex", noteCustomTheme.Aej());
        }
        if (noteCustomTheme.Aur() != null) {
            linkedHashMap.put(C273654mx.A00(263), noteCustomTheme.Aur());
        }
        if (noteCustomTheme.C1z() != null) {
            linkedHashMap.put(C273654mx.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), noteCustomTheme.C1z());
        }
        if (noteCustomTheme.C54() != null) {
            linkedHashMap.put("text_color_hex", noteCustomTheme.C54());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
