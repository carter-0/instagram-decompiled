package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.user.model.Product;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vfw  reason: case insensitive filesystem */
public final class C17785Vfw {
    public final Map A00;

    public final boolean A00(Product product) {
        List<ProductVariantPossibleValueDictIntf> list = product.A0O;
        if (list == null) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ProductVariantPossibleValueDictIntf id : list) {
            if (!this.A00.containsKey(id.getId())) {
                return true;
            }
        }
        return false;
    }

    public C17785Vfw(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = linkedHashMap;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }
}
