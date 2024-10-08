package X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.List;

public final class U9N extends C232322tW {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A05(int i, int i2) {
        return 0qQ.A0K(((ProductFeedItem) this.A01.get(i)).getId(), ((ProductFeedItem) this.A00.get(i2)).getId());
    }

    public final boolean A04(int i, int i2) {
        return A05(i, i2);
    }
}
