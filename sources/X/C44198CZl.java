package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CZl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44198CZl {
    public static Map A00(C46297DUa dUa) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUa.getBackgroundColor() != null) {
            A1H.put("background_color", dUa.getBackgroundColor());
        }
        if (dUa.B0s() != null) {
            A1H.put("emphasis_style", dUa.B0s());
        }
        if (dUa.getId() != null) {
            C41845B3m.A0x(dUa.getId(), A1H);
        }
        if (dUa.BZ0() != null) {
            A1H.put("original_caption_uri", dUa.BZ0());
        }
        if (dUa.Bzi() != null) {
            A1H.put("sticker_style", dUa.Bzi());
        }
        if (dUa.getTextColor() != null) {
            A1H.put("text_color", dUa.getTextColor());
        }
        if (dUa.C9X() != null) {
            List<C46250DSf> C9X = dUa.C9X();
            ArrayList arrayList = null;
            if (C9X != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46250DSf dSf : C9X) {
                    if (dSf != null) {
                        arrayList.add(dSf.FHC());
                    }
                }
            }
            A1H.put("translated_captions", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
