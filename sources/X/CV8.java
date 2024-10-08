package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class CV8 {
    public static BrandedContentGatingInfo A00(Integer num, String str, List list, List list2, Map map) {
        HashMap hashMap;
        ArrayList arrayList = null;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BrandedContentGatingCountryMinimumAge) it.next()).F0w());
            }
        }
        return new BrandedContentGatingInfo(num, str, hashMap, arrayList, list2);
    }
}
