package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8J {
    public static Map A00(C21026XAf xAf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAf.Arb() != null) {
            linkedHashMap.put("count", xAf.Arb());
        }
        if (xAf.BDf() != null) {
            linkedHashMap.put("hint_text", xAf.BDf());
        }
        if (xAf.CUj() != null) {
            linkedHashMap.put("is_hint_row", xAf.CUj());
        }
        if (xAf.getText() != null) {
            linkedHashMap.put("text", xAf.getText());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
