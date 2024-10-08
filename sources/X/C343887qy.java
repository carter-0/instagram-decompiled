package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7qy  reason: invalid class name and case insensitive filesystem */
public final class C343887qy {
    public boolean A00;
    public final ArrayList A01 = new ArrayList();
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = new HashMap(1);
    public final C343787qn[] A04;

    public final C343917r1 A00(C343937r3 r3) {
        C343917r1 r0 = (C343917r1) this.A02.get(r3);
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException("CoreComponent not available. Did you add specify component dependency or the plugin configuration?");
    }

    public final void A01(String str, String str2, String str3) {
        if (str != null) {
            ((C344037rD) A00(C344037rD.A00)).Egr(str);
        }
        if (str2 != null) {
            ((C344037rD) A00(C344037rD.A00)).Egs(str2);
        }
        if (str3 != null) {
            ((C344037rD) A00(C344037rD.A00)).EVV(str3);
        }
    }

    public C343887qy(C343787qn[] r3) {
        this.A04 = r3;
    }
}
