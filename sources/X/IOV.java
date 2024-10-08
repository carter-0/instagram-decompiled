package X;

import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class IOV implements C232262tL {
    public final ProductDetailsProductItemDictIntf A00;
    public final String A01;

    public IOV(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        0qQ.A0B(productDetailsProductItemDictIntf, 1);
        this.A00 = productDetailsProductItemDictIntf;
        String productId = productDetailsProductItemDictIntf.getProductId();
        this.A01 = productId == null ? "" : productId;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        IOV iov = (IOV) obj;
        0qQ.A0B(iov, 0);
        return 0qQ.A0K(this.A01, iov.A01);
    }
}
