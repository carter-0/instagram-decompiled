package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vmq  reason: case insensitive filesystem */
public abstract class C18176Vmq {
    public static C64085LMd parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C64085LMd lMd = new C64085LMd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r5, A0q)) {
                    lMd.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("uri".equals(A0q)) {
                    lMd.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("cache_key".equals(A0q)) {
                    lMd.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("string_identifiers".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    lMd.A03 = arrayList;
                }
                r5.A0z();
            }
            return lMd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C64085LMd lMd) {
        r2.A0c();
        C41846B3n.A0y(r2, lMd.A01);
        String str = lMd.A02;
        if (str != null) {
            r2.A0R("uri", str);
        }
        String str2 = lMd.A00;
        if (str2 != null) {
            r2.A0R("cache_key", str2);
        }
        if (lMd.A03 != null) {
            16P.A03(r2, "string_identifiers");
            Iterator it = lMd.A03.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r2, it);
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
