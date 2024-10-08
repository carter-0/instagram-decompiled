package X;

import java.util.HashMap;

/* renamed from: X.FxU  reason: case insensitive filesystem */
public final class C51636FxU extends HashMap {
    public final int A00;

    public C51636FxU(String str, int i) {
        this.A00 = i;
        put("url", str);
    }

    public C51636FxU() {
        this.A00 = 0;
        put(C48103EVv.GOOGLE, ENO.class);
        put(C48103EVv.FACEBOOK, ENP.class);
    }
}
