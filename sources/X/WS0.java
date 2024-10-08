package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class WS0 implements C232262tL {
    public final MultiProductComponent A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product_collection";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WS0 ws0 = (WS0) obj;
        0qQ.A0B(ws0, 0);
        return 0qQ.A0K(this.A01, ws0.A01);
    }

    public WS0(MultiProductComponent multiProductComponent) {
        this.A00 = multiProductComponent;
        this.A01 = new ArrayList(Collections.unmodifiableList(multiProductComponent.A03.A03));
    }
}
