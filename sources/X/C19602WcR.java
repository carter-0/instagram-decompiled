package X;

import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.User;

/* renamed from: X.WcR  reason: case insensitive filesystem */
public final class C19602WcR implements C20929X4u {
    public final /* synthetic */ ProductCollectionFragment A00;

    public C19602WcR(ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
    }

    public final void CtC(User user) {
        String A0b;
        ProductCollectionFragment productCollectionFragment = this.A00;
        if (C13988Tno.A0b(user) == null) {
            A0b = "";
        } else {
            A0b = C13988Tno.A0b(user);
        }
        ProductCollectionFragment.A00(productCollectionFragment, A0b, "shopping_product_collection_page", "shopping_product_collection_page");
    }
}
