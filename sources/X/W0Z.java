package X;

import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class W0Z {
    public static HashMap A00(ViewManager viewManager, Map map, Map map2) {
        HashMap hashMap = new HashMap();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            C22263XyL xyL = C18401Vr3.A00;
            if (xyL.enableFabricRenderer() && xyL.useFabricInterop()) {
                exportedCustomBubblingEventTypeConstants = A01(exportedCustomBubblingEventTypeConstants);
            }
            A02(map, exportedCustomBubblingEventTypeConstants);
            hashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            C22263XyL xyL2 = C18401Vr3.A00;
            if (xyL2.enableFabricRenderer() && xyL2.useFabricInterop()) {
                exportedCustomDirectEventTypeConstants = A01(exportedCustomDirectEventTypeConstants);
            }
            A02(map2, exportedCustomDirectEventTypeConstants);
            hashMap.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            hashMap.put("Constants", exportedViewConstants);
        }
        Map commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            hashMap.put("Commands", commandsMap);
        }
        Map nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            hashMap.put("NativeProps", nativeProps);
        }
        return hashMap;
    }

    public static Map A01(Map map) {
        String A0R;
        HashSet hashSet = new HashSet();
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            Object next = A16.next();
            if (next instanceof String) {
                String str = (String) next;
                if (!str.startsWith("top")) {
                    hashSet.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Object obj = map.get(A18);
            if (A18.startsWith("on")) {
                A0R = A18.substring(2);
            } else {
                A0R = 002.A0R(A18.substring(0, 1).toUpperCase(), A18.substring(1));
            }
            map.put(002.A0R("top", A0R), obj);
        }
        return map;
    }

    public static void A02(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            Iterator A16 = DbV.A16(map2);
            while (A16.hasNext()) {
                Object next = A16.next();
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 == null || !(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(next, obj);
                } else {
                    if (!(obj2 instanceof HashMap)) {
                        HashMap hashMap = new HashMap((Map) obj2);
                        obj2 = hashMap;
                        map.replace(next, hashMap);
                    }
                    A02((Map) obj2, (Map) obj);
                }
            }
        }
    }
}
