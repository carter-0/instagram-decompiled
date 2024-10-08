package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.5LX  reason: invalid class name */
public final class AnonymousClass5LX implements AnonymousClass5LY {
    public final int BsZ(int i, Object obj, Object obj2) {
        AbstractMap abstractMap = (AbstractMap) obj;
        AnonymousClass5LK r11 = (AnonymousClass5LK) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                int A00 = C7189Pyc.A00(i << 3);
                AnonymousClass5LL r3 = r11.A00;
                int A002 = C7190Pyd.A00(r3.A00, key, 1) + C7190Pyd.A00(r3.A01, value, 2);
                i2 += A00 + C7189Pyc.A00(A002) + A002;
            }
        }
        return i2;
    }
}
