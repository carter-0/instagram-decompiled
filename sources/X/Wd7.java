package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.UnavailableProductImpl;

public final class Wd7 implements X56 {
    public final /* synthetic */ ProductCollectionFragment A00;

    public Wd7(ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
    }

    public final void DZy(ProductFeedItem productFeedItem) {
        ProductCollectionFragment productCollectionFragment = this.A00;
        C15482UdX udX = productCollectionFragment.A05;
        C15952UlT ulT = udX.A0I;
        String id = productFeedItem.getId();
        0qQ.A07(id);
        ulT.A0D(id);
        udX.A00();
        1Ng A002 = AnonymousClass1Nd.A00(productCollectionFragment.A00);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        unavailableProductImpl.getClass();
        A002.A00(new WQK(unavailableProductImpl));
    }
}
