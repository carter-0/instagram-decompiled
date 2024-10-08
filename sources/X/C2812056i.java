package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.56i  reason: invalid class name and case insensitive filesystem */
public final class C2812056i {
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    public static void A00(C2812356l r0, C2812356l r1, String str) {
        if (r0.A02.remove(r1)) {
            Map map = r1.A03;
            if (map == null || map.remove(str) == null) {
                throw new RuntimeException(002.A0R("Tried to remove non-existent input with name: ", str));
            }
            return;
        }
        throw new RuntimeException("Tried to remove non-existent input!");
    }
}
