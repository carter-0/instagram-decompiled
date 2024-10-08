package X;

import java.util.LinkedHashMap;

/* renamed from: X.Q3i  reason: case insensitive filesystem */
public abstract class C7306Q3i {
    public static final C7305Q3h A00(C7305Q3h... q3hArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C7305Q3h q3h : q3hArr) {
            linkedHashMap.putAll(q3h.A00);
            linkedHashMap2.putAll(q3h.A01);
        }
        return new C7305Q3h(0Yt.A0B(linkedHashMap2), 0Yt.A0B(linkedHashMap));
    }
}
