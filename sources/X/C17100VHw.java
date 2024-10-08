package X;

import android.content.Context;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;

/* renamed from: X.VHw  reason: case insensitive filesystem */
public abstract class C17100VHw {
    public static final WSR A00(Context context, AnonymousClass0iw r14, ProductFeedItem productFeedItem, X72 x72, int i, int i2, boolean z) {
        0qQ.A0B(productFeedItem, 0);
        UnavailableProductImpl unavailableProductImpl = productFeedItem.A05;
        if (unavailableProductImpl != null) {
            String id = productFeedItem.getId();
            0qQ.A07(id);
            User user = unavailableProductImpl.A00;
            X72 x722 = x72;
            return new WSR(r14, user.Bh3(), user.Bh3(), Integer.valueOf(JTR.A05(context)), id, user.getUsername(), new MJB(unavailableProductImpl, i, x722, i2, 6), new C20614Wvv(10, x722, productFeedItem), z);
        }
        throw new NullPointerException("Missing unavailable product");
    }
}
