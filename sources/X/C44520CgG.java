package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44520CgG {
    public static Map A00(DTT dtt) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtt.B1r() != null) {
            A1H.put("entity", dtt.B1r().FHC());
        }
        if (dtt.BMP() != null) {
            A1H.put("length", dtt.BMP());
        }
        dtt.getOffset();
        return C41845B3m.A0u("offset", Integer.valueOf(dtt.getOffset()), A1H);
    }
}
