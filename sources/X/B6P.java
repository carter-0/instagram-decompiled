package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B6P {
    public static Map A00(C2801750l r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.AZX() != null) {
            List<C2801550j> AZX = r4.AZX();
            ArrayList arrayList = null;
            if (AZX != null) {
                arrayList = new ArrayList();
                for (C2801550j r0 : AZX) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            linkedHashMap.put("added_to", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
