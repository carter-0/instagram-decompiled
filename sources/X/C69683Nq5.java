package X;

import java.util.Map;

/* renamed from: X.Nq5  reason: case insensitive filesystem */
public abstract class C69683Nq5 {
    public static Object A00(String str, Map map) {
        if (map.get("metadata") == null) {
            return null;
        }
        Map map2 = (Map) map.get("metadata");
        if (!map2.containsKey("graphql")) {
            return null;
        }
        Map map3 = (Map) map2.get("graphql");
        if (map3.containsKey(str)) {
            return map3.get(str);
        }
        return null;
    }
}
