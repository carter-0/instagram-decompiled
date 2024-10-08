package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CnC {
    public static CGI parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGI cgi = new CGI();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1E(A17)) {
                    cgi.A00 = AnonymousClass7TG.A0l(r4);
                } else if (DialogModule.KEY_ITEMS.equals(A17) || "suggested_brands".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            ShoppingBrandWithProductsImpl parseFromJson = C44344CdQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cgi.A01 = arrayList;
                } else {
                    1XY.A01(r4, cgi, A17);
                }
                r4.A0z();
            }
            return cgi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
