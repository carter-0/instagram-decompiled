package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B52 {
    public static Map A00(C250443lS r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.Apl() != null) {
            List<C250423lQ> Apl = r4.Apl();
            ArrayList arrayList = null;
            if (Apl != null) {
                arrayList = new ArrayList();
                for (C250423lQ r0 : Apl) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            linkedHashMap.put("conditions", arrayList);
        }
        if (r4.BwJ() != null) {
            linkedHashMap.put("signal", r4.BwJ());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
