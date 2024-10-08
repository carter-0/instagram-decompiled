package X;

import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class Cc5 {
    public static ProductPivotsButtonImpl parseFromJson(16F r14) {
        String str;
        String str2;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ProductPivotsButtonActionType productPivotsButtonActionType = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ProductPivotsButtonActionType productPivotsButtonActionType2 = null;
            User user = null;
            String str7 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("action".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                    productPivotsButtonActionType = (ProductPivotsButtonActionType) ProductPivotsButtonActionType.A01.get(str2);
                    if (productPivotsButtonActionType == null) {
                        productPivotsButtonActionType = ProductPivotsButtonActionType.UNRECOGNIZED;
                    }
                } else if ("button_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("destination_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("destination_subtitle".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("destination_title".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if ("destination_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    productPivotsButtonActionType2 = (ProductPivotsButtonActionType) ProductPivotsButtonActionType.A01.get(str);
                    if (productPivotsButtonActionType2 == null) {
                        productPivotsButtonActionType2 = ProductPivotsButtonActionType.UNRECOGNIZED;
                    }
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r14, false);
                } else if (C41845B3m.A1A(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (productPivotsButtonActionType != null || !(r14 instanceof 0c9)) {
                return new ProductPivotsButtonImpl(productPivotsButtonActionType, productPivotsButtonActionType2, user, str3, str4, str5, str6, str7);
            }
            AnonymousClass7TF.A1L("action", r14, "ProductPivotsButtonImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
