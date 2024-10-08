package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ShoppingPivotItemType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Cc6 {
    public static BBQ parseFromJson(16F r15) {
        String str;
        String str2;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            ProductPivotsButtonImpl productPivotsButtonImpl = null;
            Integer num = null;
            C250533lb r5 = null;
            ArrayList arrayList = null;
            String str3 = null;
            ShoppingPivotItemType shoppingPivotItemType = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            String str5 = null;
            ProductPivotsSourceMediaType productPivotsSourceMediaType = null;
            String str6 = null;
            Integer num2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("button".equals(A17)) {
                    productPivotsButtonImpl = Cc5.parseFromJson(r15);
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if ("item_client_gap_rules".equals(A17)) {
                    r5 = C250523la.parseFromJson(r15);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            BGO parseFromJson = C44349CdV.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("pivot_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("pivot_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                    shoppingPivotItemType = (ShoppingPivotItemType) ShoppingPivotItemType.A01.get(str2);
                    if (shoppingPivotItemType == null) {
                        shoppingPivotItemType = ShoppingPivotItemType.UNRECOGNIZED;
                    }
                } else if ("products".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C41846B3n.A1G(r15, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("source_media_author_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("source_media_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if (AnonymousClass000.A00(5274).equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    productPivotsSourceMediaType = (ProductPivotsSourceMediaType) ProductPivotsSourceMediaType.A01.get(str);
                    if (productPivotsSourceMediaType == null) {
                        productPivotsSourceMediaType = ProductPivotsSourceMediaType.UNRECOGNIZED;
                    }
                } else if (!C41845B3m.A1E(A17)) {
                    num2 = C41847B3o.A13(r15, num2, A17, "view_state_item_type");
                } else if (r15.A11() == 16L.A0G) {
                    str6 = null;
                } else {
                    str6 = r15.A1P();
                }
                r15.A0z();
            }
            return new BBQ(productPivotsButtonImpl, productPivotsSourceMediaType, r5, shoppingPivotItemType, num, num2, str3, str4, str5, str6, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
