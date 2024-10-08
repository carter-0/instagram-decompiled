package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.Vnq  reason: case insensitive filesystem */
public abstract class C18226Vnq {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Vl0] */
    public static C18072Vl0 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("location".equals(A17)) {
                    obj.A01 = AnonymousClass41Q.parseFromJson(r3);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("search_subtitle".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("header_media".equals(A17)) {
                    obj.A00 = C17013VEn.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C18072Vl0 vl0) {
        r3.A0c();
        if (vl0.A01 != null) {
            r3.A0q("location");
            AnonymousClass41Q.A00(r3, vl0.A01);
        }
        C41846B3n.A10(r3, vl0.A04);
        String str = vl0.A03;
        if (str != null) {
            r3.A0R("subtitle", str);
        }
        String str2 = vl0.A02;
        if (str2 != null) {
            r3.A0R("search_subtitle", str2);
        }
        if (vl0.A00 != null) {
            r3.A0q("header_media");
            UXL uxl = vl0.A00;
            r3.A0c();
            if (uxl.A00 != null) {
                16P.A03(r3, "media");
                Iterator it = uxl.A00.iterator();
                while (it.hasNext()) {
                    C41848B3p.A1O(r3, it);
                }
                r3.A0Y();
            }
            1XY.A00(r3, uxl);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
