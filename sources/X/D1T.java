package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import java.io.IOException;
import java.util.ArrayList;

public final class D1T {
    public static C54077Gz1 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C54077Gz1 gz1 = new C54077Gz1();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r5, A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C55923Hpk parseFromJson = C44850Cm0.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    gz1.A0B = arrayList;
                } else if ("container_module".equals(A0q)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r5), 0);
                } else if ("client_gap_rules".equals(A0q)) {
                    C233492vo parseFromJson2 = C250043ko.parseFromJson(r5);
                    0qQ.A0B(parseFromJson2, 0);
                    gz1.A06 = parseFromJson2;
                } else if (C273654mx.A00(628).equals(A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    gz1.A09 = A0l;
                } else if (Location.EXTRAS.equals(A0q)) {
                    ContextualAdResponseExtrasImpl parseFromJson3 = HTY.parseFromJson(r5);
                    0qQ.A0B(parseFromJson3, 0);
                    gz1.A01 = parseFromJson3;
                } else if (C41845B3m.A1V(A0q)) {
                    gz1.A0D = r5.A0d();
                } else if ("multi_ads_info".equals(A0q)) {
                    gz1.A03 = C44223Cak.parseFromJson(r5);
                } else if (AnonymousClass000.A00(1656).equals(A0q)) {
                    gz1.A02 = CWK.parseFromJson(r5);
                } else {
                    1XY.A01(r5, gz1, A0q);
                }
                r5.A0z();
            }
            return gz1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
