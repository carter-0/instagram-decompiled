package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public final class C244813bn {
    public final synchronized void A00(int i) {
        Map map = (Map) C244803bm.A07.getValue();
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new ArrayList();
            map.put(valueOf, obj);
        }
        ((List) obj).add(Boolean.valueOf(AnonymousClass2VL.A01()));
    }
}
