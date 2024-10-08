package X;

import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.Product;

/* renamed from: X.Wcr  reason: case insensitive filesystem */
public final class C19628Wcr implements X52 {
    public final int A00;
    public final Object A01;

    public C19628Wcr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dbi(Product product) {
        if (this.A00 != 0) {
            UAV.A01((UAV) this.A01, product.A0H);
            return;
        }
        C15482UdX udX = ((ProductCollectionFragment) this.A01).A05;
        String str = product.A0H;
        0qQ.A0B(str, 0);
        udX.A0I.A0D(str);
        udX.A00();
    }
}
