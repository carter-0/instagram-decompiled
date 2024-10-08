package X;

import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CZf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44192CZf {
    public static Map A00(InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (inlineStyleAtRangeDictIntf.BHI() != null) {
            A1H.put("inline_style", inlineStyleAtRangeDictIntf.BHI());
        }
        if (inlineStyleAtRangeDictIntf.BMP() != null) {
            A1H.put("length", inlineStyleAtRangeDictIntf.BMP());
        }
        if (inlineStyleAtRangeDictIntf.BXp() != null) {
            A1H.put("offset", inlineStyleAtRangeDictIntf.BXp());
        }
        return 0Yt.A0B(A1H);
    }
}
