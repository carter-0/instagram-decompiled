package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VEx  reason: case insensitive filesystem */
public abstract class C17023VEx {
    public static final List A00(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        ArrayList arrayList;
        List<ProductWrapperIntf> Bga = clipsShoppingInfoIntf.Bga();
        if (Bga != null) {
            for (ProductWrapperIntf Bg5 : Bga) {
                ProductDetailsProductItemDictIntf Bg52 = Bg5.Bg5();
                if (Bg52 != null) {
                    arrayList.add(C14502TxO.A00(Bg52));
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        return arrayList;
    }
}
