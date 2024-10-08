package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Cb7 {
    public static Map A00(C267564bl r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Afn() != null) {
            A1H.put("bio", r3.Afn());
        }
        if (r3.Afq() != null) {
            A1H.put("biography", r3.Afq());
        }
        r3.Aqa();
        A1H.put("content_empty", Boolean.valueOf(r3.Aqa()));
        r3.COl();
        A1H.put("is_anonymous_profile_picture", Boolean.valueOf(r3.COl()));
        r3.Ca2();
        A1H.put(C273654mx.A00(163), Boolean.valueOf(r3.Ca2()));
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        if (r3.Bh8() != null) {
            A1H.put("profile_picture_url", r3.Bh8());
        }
        r3.BrZ();
        return C41845B3m.A0u("selected_audience_count", Integer.valueOf(r3.BrZ()), A1H);
    }
}
