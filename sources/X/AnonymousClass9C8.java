package X;

import java.util.AbstractMap;

/* renamed from: X.9C8  reason: invalid class name */
public final class AnonymousClass9C8 {
    public static C41537Avf A00(Object obj, Object obj2) {
        C41537Avf avf = (C41537Avf) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!avf.A00) {
                avf = avf.A02();
            }
            C41537Avf.A01(avf);
            if (!abstractMap.isEmpty()) {
                avf.putAll(abstractMap);
            }
        }
        return avf;
    }
}
