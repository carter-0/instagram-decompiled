package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class U9Q extends C232322tW {
    public FBProductItemDetailsDictImpl A00;
    public Product A01;
    public List A02;
    public List A03;
    public final 2Ru A04;

    public final int A02() {
        return this.A02.size();
    }

    public final int A03() {
        return this.A03.size();
    }

    public final boolean A04(int i, int i2) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        Object obj = ((C17967Vj1) this.A03.get(i)).A01;
        if (!(obj instanceof C19278WSl)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.shopping.viewmodel.destination.ProductFeedGridRowViewModel");
        C19278WSl wSl = (C19278WSl) obj;
        Object obj2 = ((C17967Vj1) this.A02.get(i2)).A01;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.shopping.viewmodel.destination.ProductFeedGridRowViewModel");
        C19278WSl wSl2 = (C19278WSl) obj2;
        Iterator it = wSl.A05.iterator();
        while (it.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
            int intValue = productFeedItem.A06.intValue();
            if (intValue == 2) {
                Product product = this.A01;
                if (product != null && 0qQ.A0K(productFeedItem.A02(), product)) {
                    return false;
                }
                if (this.A00 != null) {
                    ProductTile productTile = productFeedItem.A02;
                    if (productTile != null) {
                        fBProductItemDetailsDict = C18768W0o.A01(productTile);
                    } else {
                        fBProductItemDetailsDict = null;
                    }
                    if (0qQ.A0K(fBProductItemDetailsDict, this.A00)) {
                        return false;
                    }
                }
                if (!0qQ.A0K(wSl.A09, wSl2.A09)) {
                    return false;
                }
            } else if (intValue == 0 && 0qQ.A0K(productFeedItem.A01, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05(int i, int i2) {
        return 0qQ.A0K(00k.A0O(this.A03, i), 00k.A0O(this.A02, i2));
    }

    public final void A06() {
        2Ru r6 = this.A04;
        ArrayList arrayList = new ArrayList();
        int count = r6.getCount();
        for (int i = 0; i < count; i++) {
            arrayList.add(new C17967Vj1(r6.getItemViewType(i), r6.getItem(i)));
        }
        this.A02 = arrayList;
        C232332tX.A00(this).A03(r6);
        this.A03 = arrayList;
        this.A01 = null;
        this.A00 = null;
    }

    public U9Q(2Ru r2) {
        this.A04 = r2;
        0sn r0 = 0sn.A00;
        this.A03 = r0;
        this.A02 = r0;
    }
}
