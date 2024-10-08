package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdx  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44377Cdx {
    public static Map A00(C2808054e r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Ac1() != null) {
            A1H.put("app_action_text", r3.Ac1());
        }
        if (r3.Ac4() != null) {
            A1H.put("app_icon_url", r3.Ac4());
        }
        if (r3.getContentUrl() != null) {
            A1H.put("content_url", r3.getContentUrl());
        }
        if (r3.getId() != null) {
            C41845B3m.A0x(r3.getId(), A1H);
        }
        if (r3.BMi() != null) {
            A1H.put("link", r3.BMi());
        }
        if (r3.getName() != null) {
            C41845B3m.A0z(r3.getName(), A1H);
        }
        if (r3.Bf8() != null) {
            A1H.put("preview_url", r3.Bf8());
        }
        return 0Yt.A0B(A1H);
    }
}
