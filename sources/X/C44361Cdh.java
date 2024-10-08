package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cdh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44361Cdh {
    public static Map A00(AnonymousClass3IM r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BX3() != null) {
            A1H.put(AnonymousClass000.A00(1646), r4.BX3());
        }
        if (r4.BxC() != null) {
            A1H.put(AnonymousClass000.A00(1825), r4.BxC());
        }
        if (r4.BxD() != null) {
            A1H.put(AnonymousClass000.A00(1826), r4.BxD());
        }
        if (r4.BxE() != null) {
            A1H.put(AnonymousClass000.A00(1827), r4.BxE());
        }
        if (r4.BxF() != null) {
            A1H.put(AnonymousClass000.A00(1828), r4.BxF());
        }
        List Bzx = r4.Bzx();
        if (Bzx != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(Bzx);
            Iterator it = Bzx.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("stories", A0r);
        }
        if (r4.C8c() != null) {
            A1H.put(AnonymousClass000.A00(1897), r4.C8c());
        }
        if (r4.C8m() != null) {
            A1H.put(C273654mx.A00(414), r4.C8m());
        }
        if (r4.C8n() != null) {
            A1H.put(AnonymousClass000.A00(1898), r4.C8n());
        }
        return 0Yt.A0B(A1H);
    }
}
