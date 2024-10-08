package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnE  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44921CnE {
    public static Map A00(ShippingAndReturnsMetadataIntf shippingAndReturnsMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (shippingAndReturnsMetadataIntf.B2B() != null) {
            DeliveryWindowInfo B2B = shippingAndReturnsMetadataIntf.B2B();
            if (B2B != null) {
                treeUpdaterJNI2 = B2B.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("estimated_delivery_window", treeUpdaterJNI2);
        }
        if (shippingAndReturnsMetadataIntf.CTd() != null) {
            A1H.put("is_final_sale", shippingAndReturnsMetadataIntf.CTd());
        }
        if (shippingAndReturnsMetadataIntf.Bo7() != null) {
            CurrencyAmountInfo Bo7 = shippingAndReturnsMetadataIntf.Bo7();
            if (Bo7 != null) {
                treeUpdaterJNI = Bo7.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("return_cost", treeUpdaterJNI);
        }
        if (shippingAndReturnsMetadataIntf.Bo9() != null) {
            A1H.put("return_policy_time", shippingAndReturnsMetadataIntf.Bo9());
        }
        if (shippingAndReturnsMetadataIntf.Btg() != null) {
            CurrencyAmountInfo Btg = shippingAndReturnsMetadataIntf.Btg();
            if (Btg != null) {
                treeUpdaterJNI3 = Btg.FHC();
            }
            A1H.put("shipping_cost", treeUpdaterJNI3);
        }
        if (shippingAndReturnsMetadataIntf.getShippingCostStripped() != null) {
            A1H.put("shipping_cost_stripped", shippingAndReturnsMetadataIntf.getShippingCostStripped());
        }
        return 0Yt.A0B(A1H);
    }
}
