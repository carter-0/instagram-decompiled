package X;

import com.instagram.api.schemas.WordOffset;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ChI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44584ChI {
    public static Map A00(WordOffset wordOffset) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        wordOffset.getEndIndex();
        A1H.put("end_index", Integer.valueOf(wordOffset.getEndIndex()));
        wordOffset.B1W();
        A1H.put("end_offset_ms", Integer.valueOf(wordOffset.B1W()));
        wordOffset.Byf();
        A1H.put("start_index", Integer.valueOf(wordOffset.Byf()));
        wordOffset.Byi();
        A1H.put("start_offset_ms", Integer.valueOf(wordOffset.Byi()));
        wordOffset.C9N();
        return C41845B3m.A0u("trailing_space", Boolean.valueOf(wordOffset.C9N()), A1H);
    }
}
