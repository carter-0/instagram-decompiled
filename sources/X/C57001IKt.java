package X;

import java.util.Map;

/* renamed from: X.IKt  reason: case insensitive filesystem */
public final class C57001IKt implements AnonymousClass2hV {
    public final /* synthetic */ AnonymousClass3LF A00;

    public C57001IKt(AnonymousClass3LF r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        long parseLong = Long.parseLong((String) obj);
        Map map = C52314GNg.A00;
        if (map.isEmpty()) {
            for (C238863Ds r2 : C238863Ds.values()) {
                map.put(Long.valueOf(r2.A00), r2);
            }
        }
        Object obj2 = map.get(Long.valueOf(parseLong));
        if (obj2 == null) {
            return "";
        }
        return obj2.toString();
    }
}
