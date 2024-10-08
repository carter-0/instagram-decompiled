package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8K {
    public static Map A00(C21033XAm xAm) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAm.getId() != null) {
            C41845B3m.A0x(xAm.getId(), linkedHashMap);
        }
        if (xAm.CSq() != null) {
            linkedHashMap.put("is_exclusive", xAm.CSq());
        }
        if (xAm.BW8() != null) {
            linkedHashMap.put("next_id", xAm.BW8());
        }
        if (xAm.Bwb() != null) {
            linkedHashMap.put("single_choice_answer", xAm.Bwb());
        }
        if (xAm.getText() != null) {
            linkedHashMap.put("text", xAm.getText());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
