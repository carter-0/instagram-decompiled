package X;

import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import java.util.ArrayList;

public abstract class VHJ {
    public static final C16260UrN A00(ProductTileMedia productTileMedia, Product product) {
        Object ura;
        ArrayList arrayList = new ArrayList();
        if (productTileMedia != null) {
            ura = new C16270UrX(productTileMedia);
        } else {
            0qQ.A0A(product);
            0qQ.A0B(product, 1);
            ura = new C16273Ura(product.A07, 002.A0R(product.A0H, "_image_0"), product.A0I);
        }
        arrayList.add(ura);
        return new C16260UrN(C18481Vsa.A04, (C16276Urd) null, "hero_carousel", arrayList, false, true);
    }
}
