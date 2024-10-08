package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CgP  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44529CgP {
    public static Map A00(C46318DUv dUv) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUv.B0s() != null) {
            A1H.put("emphasis_style", dUv.B0s());
        }
        if (dUv.B79() != null) {
            A1H.put("font_size", AnonymousClass7TH.A0D(dUv.B79()));
        }
        if (dUv.getId() != null) {
            C41845B3m.A0x(dUv.getId(), A1H);
        }
        if (dUv.COk() != null) {
            A1H.put("is_animated", dUv.COk());
        }
        if (dUv.CTq() != null) {
            A1H.put("is_flig_enabled", dUv.CTq());
        }
        if (dUv.getText() != null) {
            C41845B3m.A10(dUv.getText(), A1H);
        }
        if (dUv.C4s() != null) {
            A1H.put("text_alignment", dUv.C4s());
        }
        if (dUv.getTextColor() != null) {
            A1H.put("text_color", dUv.getTextColor());
        }
        if (dUv.C5C() != null) {
            A1H.put("text_format", dUv.C5C());
        }
        if (dUv.C9Y() != null) {
            List<C46270DSz> C9Y = dUv.C9Y();
            ArrayList arrayList = null;
            if (C9Y != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46270DSz dSz : C9Y) {
                    if (dSz != null) {
                        arrayList.add(dSz.FHC());
                    }
                }
            }
            A1H.put("translated_text", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
