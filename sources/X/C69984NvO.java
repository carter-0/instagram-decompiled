package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.NvO  reason: case insensitive filesystem */
public abstract class C69984NvO {
    public static final boolean A00(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object A1a : list) {
                if (C66583MXo.A1a(A1a, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
