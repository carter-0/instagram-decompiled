package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Mf  reason: invalid class name and case insensitive filesystem */
public abstract class C306456Mf {
    public static final C3034268t A00(Map map) {
        0qQ.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new BloksScript((C276634te) null, (String) entry.getValue(), (List) null, -1));
        }
        return new C3034268t(linkedHashMap);
    }
}
