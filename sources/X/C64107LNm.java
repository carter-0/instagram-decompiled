package X;

import java.util.Map;

/* renamed from: X.LNm  reason: case insensitive filesystem */
public final class C64107LNm {
    public static final C64107LNm A01 = new C64107LNm();
    public final Map A00 = AnonymousClass7TE.A1E();

    public final void A00(C71392co r3, String str) {
        if (str != null) {
            Map map = this.A00;
            if (!map.containsKey(r3)) {
                map.put(r3, str);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("configName is required");
    }

    public C64107LNm() {
        A00(C71392co.A02, "default config");
    }
}
