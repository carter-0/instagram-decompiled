package X;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.83A  reason: invalid class name */
public final class AnonymousClass83A {
    public String A00;
    public final AnonymousClass839 A01;
    public final Map A02 = new LinkedHashMap();
    public final 05G A03 = 106.A01(0sn.A00);

    public static final void A00(AnonymousClass83A r1, Map map) {
        r1.A03.Epw(00k.A0a(map.values()));
    }

    public final void A01(String str) {
        Map map = this.A02;
        if (map.remove(str) != null) {
            File A002 = this.A01.A00(str);
            try {
                if (A002.exists()) {
                    A002.delete();
                }
            } catch (IOException | SecurityException unused) {
            }
            A00(this, map);
        }
    }

    public AnonymousClass83A(AnonymousClass839 r2) {
        this.A01 = r2;
    }
}
