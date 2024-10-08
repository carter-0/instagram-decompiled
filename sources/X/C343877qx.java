package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7qx  reason: invalid class name and case insensitive filesystem */
public final class C343877qx {
    public boolean A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());
    public final C343787qn[] A02;

    public final C343707qf A00(C343727qh r3) {
        C343707qf r0 = (C343707qf) this.A01.get(r3);
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException("Component not available. Did you add specify the dependency or the plugin configuration?");
    }

    public C343877qx(C343787qn[] r2) {
        this.A02 = r2;
    }
}
