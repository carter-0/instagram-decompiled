package X;

import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VEy  reason: case insensitive filesystem */
public abstract class C17024VEy {
    public static final ArrayList A00(IGTVShoppingInfoIntf iGTVShoppingInfoIntf) {
        ArrayList arrayList;
        0qQ.A0B(iGTVShoppingInfoIntf, 0);
        List<ProductWrapperIntf> Bga = iGTVShoppingInfoIntf.Bga();
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
        return new ArrayList(arrayList);
    }
}
