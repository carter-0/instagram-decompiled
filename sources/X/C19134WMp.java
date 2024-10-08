package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.ProductWrapperIntf;

/* renamed from: X.WMp  reason: case insensitive filesystem */
public final class C19134WMp implements 1UV {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C19134WMp(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str, int i) {
        this.A00 = i;
        this.A01 = shoppingMoreProductsFragment;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String id;
        switch (this.A00) {
            case 0:
                id = ((ProductFeedItem) obj).getId();
                break;
            case 1:
                ProductWrapperIntf productWrapperIntf = (ProductWrapperIntf) obj;
                if (productWrapperIntf.Bg5() != null && productWrapperIntf.Bg5().getProductId() != null) {
                    id = productWrapperIntf.Bg5().getProductId();
                    break;
                } else {
                    return false;
                }
            default:
                id = ((Tag) obj).getId();
                break;
        }
        return id.equals(this.A02);
    }
}
