package X;

import java.util.Map;

/* renamed from: X.Emq  reason: case insensitive filesystem */
public abstract class C48952Emq {
    public static final EWI A00(String str) {
        Map map = EWI.A01;
        if (map == null) {
            0qQ.A0F("reverseMap");
            throw AnonymousClass00P.createAndThrow();
        }
        EWI ewi = (EWI) map.get(str);
        if (ewi == null) {
            return EWI.UNKNOWN;
        }
        return ewi;
    }
}
