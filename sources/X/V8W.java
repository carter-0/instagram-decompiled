package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class V8W {
    public static Map A00(C274454oN r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.B80() != null) {
            List<C21037XAq> B80 = r4.B80();
            ArrayList arrayList = null;
            if (B80 != null) {
                arrayList = new ArrayList();
                for (C21037XAq xAq : B80) {
                    if (xAq != null) {
                        arrayList.add(xAq.FHC());
                    }
                }
            }
            linkedHashMap.put("fragments", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
