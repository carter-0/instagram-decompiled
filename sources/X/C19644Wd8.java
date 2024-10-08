package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.Wd8  reason: case insensitive filesystem */
public final class C19644Wd8 implements X56 {
    public final /* synthetic */ WishListFeedFragment A00;

    public C19644Wd8(WishListFeedFragment wishListFeedFragment) {
        this.A00 = wishListFeedFragment;
    }

    public final void DZy(ProductFeedItem productFeedItem) {
        C15483UdY udY = this.A00.A01;
        C15952UlT ulT = udY.A06;
        String id = productFeedItem.getId();
        0qQ.A07(id);
        ulT.A0D(id);
        C15483UdY.A01(udY);
    }
}
