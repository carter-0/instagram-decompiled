package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* renamed from: X.Wcw  reason: case insensitive filesystem */
public final class C19633Wcw implements X53 {
    public final /* synthetic */ ProductTile A00;
    public final /* synthetic */ UAV A01;

    public C19633Wcw(ProductTile productTile, UAV uav) {
        this.A01 = uav;
        this.A00 = productTile;
    }

    public final void DZt(C243373Ym r4) {
        0qQ.A0B(r4, 0);
        UAV uav = this.A01;
        C16675UzB B5W = uav.A00.B5W();
        if (B5W != null && B5W == C16675UzB.SAVED && r4 == C243373Ym.NOT_SAVED) {
            Product product = this.A00.A07;
            if (product != null) {
                UAV.A01(uav, product.A0H);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
