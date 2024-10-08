package X;

import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import java.io.IOException;

/* renamed from: X.D1l  reason: case insensitive filesystem */
public abstract class C45686D1l {
    public static ProductCollectionLink parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            ShoppingDestinationMetadata shoppingDestinationMetadata = null;
            String str4 = null;
            String str5 = null;
            MultiProductComponentDestinationType multiProductComponentDestinationType = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("button_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("destination_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(585).equals(A17)) {
                    shoppingDestinationMetadata = C45691D1q.parseFromJson(r11);
                } else if ("destination_subtitle".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("destination_title".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("destination_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    multiProductComponentDestinationType = (MultiProductComponentDestinationType) MultiProductComponentDestinationType.A01.get(str);
                    if (multiProductComponentDestinationType == null) {
                        multiProductComponentDestinationType = MultiProductComponentDestinationType.UNRECOGNIZED;
                    }
                }
                r11.A0z();
            }
            if (multiProductComponentDestinationType != null || !(r11 instanceof 0c9)) {
                return new ProductCollectionLink(multiProductComponentDestinationType, shoppingDestinationMetadata, str2, str3, str4, str5);
            }
            AnonymousClass7TF.A1L("destination_type", r11, "ProductCollectionLink");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ProductCollectionLink productCollectionLink) {
        r2.A0c();
        String str = productCollectionLink.A02;
        if (str != null) {
            r2.A0R("button_text", str);
        }
        String str2 = productCollectionLink.A03;
        if (str2 != null) {
            r2.A0R("destination_id", str2);
        }
        ShoppingDestinationMetadata shoppingDestinationMetadata = productCollectionLink.A01;
        if (shoppingDestinationMetadata != null) {
            r2.A0q(AnonymousClass000.A00(585));
            C45691D1q.A00(r2, shoppingDestinationMetadata);
        }
        String str3 = productCollectionLink.A04;
        if (str3 != null) {
            r2.A0R("destination_subtitle", str3);
        }
        String str4 = productCollectionLink.A05;
        if (str4 != null) {
            r2.A0R("destination_title", str4);
        }
        MultiProductComponentDestinationType multiProductComponentDestinationType = productCollectionLink.A00;
        if (multiProductComponentDestinationType != null) {
            r2.A0R("destination_type", multiProductComponentDestinationType.A00);
        }
        r2.A0Z();
    }
}
