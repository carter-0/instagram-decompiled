package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44920CnD {
    public static Map A00(ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productCheckoutPropertiesIntf.Ajx() != null) {
            A1H.put("can_add_to_bag", productCheckoutPropertiesIntf.Ajx());
        }
        if (productCheckoutPropertiesIntf.Ak9() != null) {
            A1H.put("can_enable_restock_reminder", productCheckoutPropertiesIntf.Ak9());
        }
        if (productCheckoutPropertiesIntf.Akj() != null) {
            A1H.put("can_show_inventory_quantity", productCheckoutPropertiesIntf.Akj());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCheckoutPropertiesIntf.Ati() != null) {
            CurrencyAmountInfo Ati = productCheckoutPropertiesIntf.Ati();
            if (Ati != null) {
                treeUpdaterJNI = Ati.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("currency_amount", treeUpdaterJNI);
        }
        if (productCheckoutPropertiesIntf.B8M() != null) {
            A1H.put("full_inventory_quantity", productCheckoutPropertiesIntf.B8M());
        }
        if (productCheckoutPropertiesIntf.BBC() != null) {
            A1H.put("has_free_shipping", productCheckoutPropertiesIntf.BBC());
        }
        if (productCheckoutPropertiesIntf.BBD() != null) {
            A1H.put("has_free_two_day_shipping", productCheckoutPropertiesIntf.BBD());
        }
        if (productCheckoutPropertiesIntf.getIgReferrerFbid() != null) {
            A1H.put("ig_referrer_fbid", productCheckoutPropertiesIntf.getIgReferrerFbid());
        }
        if (productCheckoutPropertiesIntf.BIk() != null) {
            A1H.put("inventory_quantity", productCheckoutPropertiesIntf.BIk());
        }
        if (productCheckoutPropertiesIntf.CVv() != null) {
            A1H.put("is_item_in_cart", productCheckoutPropertiesIntf.CVv());
        }
        if (productCheckoutPropertiesIntf.CaB() != null) {
            A1H.put("is_purchase_protected", productCheckoutPropertiesIntf.CaB());
        }
        if (productCheckoutPropertiesIntf.Cbv() != null) {
            A1H.put("is_shopify_merchant", productCheckoutPropertiesIntf.Cbv());
        }
        if (productCheckoutPropertiesIntf.BeS() != null) {
            A1H.put("pre_order_estimate_fulfill_date", productCheckoutPropertiesIntf.BeS());
        }
        if (productCheckoutPropertiesIntf.BgA() != null) {
            A1H.put("product_group_has_inventory", productCheckoutPropertiesIntf.BgA());
        }
        if (productCheckoutPropertiesIntf.getReceiverId() != null) {
            A1H.put("receiver_id", productCheckoutPropertiesIntf.getReceiverId());
        }
        if (productCheckoutPropertiesIntf.Btf() != null) {
            ShippingAndReturnsMetadataIntf Btf = productCheckoutPropertiesIntf.Btf();
            if (Btf != null) {
                treeUpdaterJNI2 = Btf.FHC();
            }
            A1H.put("shipping_and_return", treeUpdaterJNI2);
        }
        if (productCheckoutPropertiesIntf.CAB() != null) {
            A1H.put("two_day_shipping_metadata", productCheckoutPropertiesIntf.CAB());
        }
        if (productCheckoutPropertiesIntf.CF8() != null) {
            A1H.put("viewer_purchase_limit", productCheckoutPropertiesIntf.CF8());
        }
        return 0Yt.A0B(A1H);
    }
}
