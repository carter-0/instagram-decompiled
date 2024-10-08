package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class GTR {
    public static Map A00(C2801550j r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.getMediaId() != null) {
            linkedHashMap.put("media_id", r3.getMediaId());
        }
        if (r3.Bkc() != null) {
            linkedHashMap.put("reel_id", r3.Bkc());
        }
        if (r3.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
