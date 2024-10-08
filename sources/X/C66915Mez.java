package X;

import java.util.Map;

/* renamed from: X.Mez  reason: case insensitive filesystem */
public final class C66915Mez {
    public final C61410nE A00;
    public final Map A01 = AnonymousClass7TE.A1E();

    public final Object A00(String str, Object obj) {
        C70704OGz oGz;
        Map map = this.A01;
        synchronized (map) {
            oGz = (C70704OGz) map.get(str);
        }
        if (oGz != null) {
            return oGz.A03;
        }
        return obj;
    }

    public final void A01(String str, String str2, boolean z) {
        Map map = this.A01;
        synchronized (map) {
            C70704OGz oGz = (C70704OGz) map.get(str);
            if (oGz != null && oGz.A04.equals(str2)) {
                if (!z) {
                    map.remove(str);
                } else if (!oGz.A01) {
                    oGz.A01 = true;
                    oGz.A00 = System.currentTimeMillis();
                }
            }
        }
    }

    public C66915Mez(C61410nE r2) {
        this.A00 = r2;
    }
}
