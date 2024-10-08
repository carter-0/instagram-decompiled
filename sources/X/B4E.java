package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4E {
    public static Map A00(C65531dc r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.getItems() != null) {
            List<C2809354u> items = r4.getItems();
            ArrayList arrayList = null;
            if (items != null) {
                arrayList = new ArrayList();
                for (C2809354u r0 : items) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            linkedHashMap.put(DialogModule.KEY_ITEMS, arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
