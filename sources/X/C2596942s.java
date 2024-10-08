package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.42s  reason: invalid class name and case insensitive filesystem */
public final class C2596942s {
    public C73550Peh A00;
    public final Map A01;
    public final Map A02;

    public final Object A00(C299305uu r3) {
        Object obj;
        String str = r3.A01;
        if (str != null && (obj = this.A02.get(str)) != null) {
            return obj;
        }
        String str2 = r3.A00;
        if (str2 != null) {
            return this.A01.get(str2);
        }
        return null;
    }

    public final void A01(C299305uu r4, Object obj) {
        String str = r4.A01;
        boolean z = false;
        if (str != null) {
            z = true;
        }
        17k.A0G(z, "Insertion key can only have either igid or fbid set");
        if (str != null) {
            this.A02.put(str, obj);
        }
    }

    public C2596942s(C2596942s r3) {
        this.A02 = new HashMap(r3.A02);
        this.A01 = new HashMap(r3.A01);
    }

    public C2596942s() {
        this.A02 = new HashMap();
        this.A01 = new HashMap();
    }
}
