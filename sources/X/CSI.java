package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

public final class CSI extends 17P implements C46271DTa {
    public ProductDetailsProductItemDictIntf A00;

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final C46271DTa EAA(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    public final C42132BIl FFk(1E9 r3) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r3);
        } else {
            productDetailsProductItemDict = null;
        }
        return new C42132BIl(productDetailsProductItemDict);
    }

    public final C42132BIl FFl(1E6 r2) {
        return FFk(C41847B3o.A0p());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.DTa, X.CSI] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bfu() != null) {
            A0t.put("product", C41846B3n.A0Q(Bfu()));
        }
        return C41846B3n.A0P(this, A0t);
    }
}
