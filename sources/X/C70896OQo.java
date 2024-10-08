package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mapquery.MapQuery;
import java.io.IOException;

/* renamed from: X.OQo  reason: case insensitive filesystem */
public abstract class C70896OQo {
    public static MapQuery parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            MapQuery mapQuery = new MapQuery();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    mapQuery.A00 = A0l;
                } else if (C41845B3m.A19(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    mapQuery.A01 = A0l2;
                } else if ("style".equals(A0q)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    mapQuery.A03 = A0l3;
                } else if ("queryType".equals(A0q)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    mapQuery.A02 = A0l4;
                }
                r4.A0z();
            }
            return mapQuery;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, MapQuery mapQuery) {
        r2.A0c();
        r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, mapQuery.A00);
        r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mapQuery.A01);
        r2.A0R("style", mapQuery.A03);
        r2.A0R("queryType", mapQuery.A02);
        r2.A0Z();
    }
}
