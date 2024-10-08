package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;

public final class WSH implements C232262tL {
    public final MultiProductComponent A00;
    public final String A01;
    public final AnonymousClass0eM A02 = C20699WxV.A00(this, 31);

    public WSH(MultiProductComponent multiProductComponent, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = multiProductComponent;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Object obj2;
        WSH wsh = (WSH) obj;
        Object value = this.A02.getValue();
        if (wsh != null) {
            obj2 = wsh.A02.getValue();
        } else {
            obj2 = null;
        }
        return 0qQ.A0K(value, obj2);
    }
}
