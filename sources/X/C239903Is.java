package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.3Is  reason: invalid class name and case insensitive filesystem */
public final class C239903Is {
    public final int A00;
    public final Map A01;

    public C239903Is(int i, Map map) {
        this.A00 = i;
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        0qQ.A07(unmodifiableMap);
        this.A01 = unmodifiableMap;
    }
}
