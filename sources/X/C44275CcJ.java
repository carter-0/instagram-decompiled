package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CcJ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44275CcJ {
    public static Map A00(ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productVariantPossibleValueDictIntf.getId() != null) {
            C41845B3m.A0x(productVariantPossibleValueDictIntf.getId(), A1H);
        }
        productVariantPossibleValueDictIntf.isPreselected();
        A1H.put("is_preselected", Boolean.valueOf(productVariantPossibleValueDictIntf.isPreselected()));
        if (productVariantPossibleValueDictIntf.getName() != null) {
            C41845B3m.A0z(productVariantPossibleValueDictIntf.getName(), A1H);
        }
        if (productVariantPossibleValueDictIntf.getNormalizedValue() != null) {
            A1H.put("normalized_value", productVariantPossibleValueDictIntf.getNormalizedValue());
        }
        if (productVariantPossibleValueDictIntf.getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, productVariantPossibleValueDictIntf.getValue());
        }
        if (productVariantPossibleValueDictIntf.CFr() != null) {
            ProductVariantVisualStyle CFr = productVariantPossibleValueDictIntf.CFr();
            0qQ.A0B(CFr, 0);
            A1H.put("visual_style", CFr.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
