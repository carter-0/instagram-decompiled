package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WcK  reason: case insensitive filesystem */
public final class C19595WcK implements X6x {
    public final /* synthetic */ C17882VhZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void DoS(ProductGroup productGroup) {
        ProductVariantDimension productVariantDimension;
        ProductGroup productGroup2 = productGroup;
        if (productGroup != null) {
            for (ProductVariantDimension productVariantDimension2 : productGroup2.A02) {
                if ("size".equals(productVariantDimension2.A02)) {
                    C17882VhZ vhZ = this.A00;
                    Product A022 = W2E.A02(this.A03);
                    String str = this.A02;
                    String str2 = this.A01;
                    C19676Wde wde = new C19676Wde(vhZ.A00, vhZ.A04, (Product) null);
                    Iterator it = productGroup2.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            productVariantDimension = null;
                            break;
                        }
                        productVariantDimension = (ProductVariantDimension) it.next();
                        if ("color".equals(productVariantDimension.A02)) {
                            break;
                        }
                    }
                    C17987VjP vjP = new C17987VjP(productGroup2, productVariantDimension2);
                    C18562VuE vuE = new C18562VuE(productGroup2, A022);
                    if (!(str2 == null || productVariantDimension == null)) {
                        vjP.A01(productVariantDimension, str2);
                        vuE.A01(productVariantDimension, str2);
                    }
                    wde.A01(new C19581Wc5(vhZ, wde, vuE, str), new VariantSelectorModel(productVariantDimension2, vjP.A00().A01(), (List) null, vjP.A00().A00(), Collections.unmodifiableList(productGroup2.A02).indexOf(productVariantDimension2), -1), (C273414mX) null, false);
                    return;
                }
            }
        }
        this.A00.A00(W2E.A02(this.A03), this.A02);
    }

    public C19595WcK(C17882VhZ vhZ, String str, String str2, String str3) {
        this.A00 = vhZ;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public final void DED() {
        C18695Vwt.A01(this.A00.A00);
    }
}
