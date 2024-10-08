package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.VtO  reason: case insensitive filesystem */
public final class C18524VtO {
    public final C53368Gms A01(Map map, double d) {
        List list;
        Object obj = null;
        if (map != null) {
            obj = map.get("quality_buckets");
        }
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            return new C53368Gms(0, 1024, 1);
        }
        return A00(list, d);
    }

    public static final C53368Gms A00(List list, double d) {
        Object obj;
        Object obj2;
        Map map;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (d >= ((double) DbW.A04(((Map) obj).get("min_bandwidth_in_mbps"), "null cannot be cast to non-null type kotlin.Int")) * 1000.0d) {
                break;
            }
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            obj2 = map2.get("bucket");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof Map) || (map = (Map) obj2) == null) {
            return null;
        }
        Object obj3 = map.get("lod");
        if (obj3 != null) {
            int A0M = AnonymousClass7TE.A0M(obj3);
            Object obj4 = map.get("texture_size");
            if (obj4 != null) {
                return new C53368Gms(A0M, AnonymousClass7TE.A0M(obj4), 1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
