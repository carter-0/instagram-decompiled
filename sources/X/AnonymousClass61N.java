package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.61N  reason: invalid class name */
public final class AnonymousClass61N {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final boolean A01(int i) {
        boolean z = this.A00.get(Integer.valueOf(i));
        if (z == null) {
            z = false;
        }
        return ((Boolean) z).booleanValue();
    }

    public final void A00(int i, boolean z) {
        this.A00.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
