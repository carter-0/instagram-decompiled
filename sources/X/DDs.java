package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class DDs {
    public static final User createMerchant(DXK dxk, String str) {
        SimpleImageUrl simpleImageUrl;
        String str2 = str;
        boolean A1U = AnonymousClass7TF.A1U(0, dxk, str);
        Parcelable.Creator creator = User.CREATOR;
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.NONE;
        C250663lr r11 = (C250663lr) dxk;
        String A09 = r11.A09("profile_image_url");
        if (A09 != null) {
            simpleImageUrl = new SimpleImageUrl(A09);
        } else {
            simpleImageUrl = null;
        }
        return 1aC.A02(merchantCheckoutStyle, SellerShoppableFeedType.A06, simpleImageUrl, (Boolean) null, false, (Boolean) null, str2, (String) null, r11.getOptionalStringField(A1U ? 1 : 0, AnonymousClass9NJ.A00(61, 8, 97)));
    }

    public static final ShippingAndReturnsMetadata createShippingAndReturn(DXL dxl) {
        DeliveryWindowInfoImpl deliveryWindowInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl2;
        0qQ.A0B(dxl, 0);
        C250663lr r14 = (C250663lr) dxl;
        C250663lr optionalTreeField = r14.getOptionalTreeField(12, "estimated_delivery_window", BdE.class, 1464035300);
        String str = null;
        if (optionalTreeField != null) {
            deliveryWindowInfoImpl = new DeliveryWindowInfoImpl(optionalTreeField.getCoercedTimeField(0, "maximum_date"), optionalTreeField.getCoercedTimeField(1, "minimum_date"));
        } else {
            deliveryWindowInfoImpl = null;
        }
        Boolean A0d = C41846B3n.A0d(r14, "is_final_sale", 13);
        C250663lr optionalTreeField2 = r14.getOptionalTreeField(14, "return_cost", BdF.class, 837738522);
        if (optionalTreeField2 != null) {
            currencyAmountInfoImpl = C41848B3p.A19(optionalTreeField2, optionalTreeField2.getOptionalStringField(0, "amount"), optionalTreeField2.A08("amount_with_offset"));
        } else {
            currencyAmountInfoImpl = null;
        }
        Integer A0g = C41846B3n.A0g(r14, "return_policy_time", 15);
        Class<BdG> cls = BdG.class;
        C250663lr optionalTreeField3 = r14.getOptionalTreeField(16, "shipping_cost", cls, -1058977092);
        if (optionalTreeField3 != null) {
            currencyAmountInfoImpl2 = C41848B3p.A19(optionalTreeField3, optionalTreeField3.getOptionalStringField(0, "amount"), optionalTreeField3.A08("amount_with_offset"));
        } else {
            currencyAmountInfoImpl2 = null;
        }
        C250663lr optionalTreeField4 = r14.getOptionalTreeField(16, "shipping_cost", cls, -1058977092);
        if (optionalTreeField4 != null) {
            str = optionalTreeField4.A0B("formatted_amount(strip_currency_zeros:true)");
        }
        return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, A0d, A0g, str);
    }

    public static final User A00(C50 c50, String str) {
        C250663lr optionalTreeField = c50.getOptionalTreeField(2, "merchant", C43665C4n.class, 1000975349);
        SimpleImageUrl simpleImageUrl = null;
        if (optionalTreeField == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.NONE;
        String optionalStringField = optionalTreeField.getOptionalStringField(2, "profile_image_url");
        if (optionalStringField != null) {
            simpleImageUrl = new SimpleImageUrl(optionalStringField);
        }
        return 1aC.A02(merchantCheckoutStyle, SellerShoppableFeedType.A06, simpleImageUrl, (Boolean) null, false, (Boolean) null, str, (String) null, optionalTreeField.A08(AnonymousClass9NJ.A00(61, 8, 97)));
    }

    public static final ProductCheckoutProperties createProductCheckoutProperties(DXM dxm, DXL dxl) {
        DXM dxm2 = dxm;
        DXL dxl2 = dxl;
        boolean A1U = AnonymousClass7TF.A1U(0, dxm2, dxl2);
        C250663lr r0 = (C250663lr) dxl2;
        Boolean A0d = C41846B3n.A0d(r0, "can_add_to_bag", 0);
        Boolean A0d2 = C41846B3n.A0d(r0, "can_enable_restock_reminder", A1U ? 1 : 0);
        Boolean A0d3 = C41846B3n.A0d(r0, "can_show_inventory_quantity", 2);
        C250663lr r7 = (C250663lr) dxm2;
        CurrencyAmountInfoImpl currencyAmountInfoImpl = new CurrencyAmountInfoImpl(C41846B3n.A0g(r7, "offset", 3), r7.A07("amount"), r7.getOptionalStringField(A1U, "amount_with_offset"), r7.A09("currency"));
        Integer A0g = C41846B3n.A0g(r0, "full_inventory_quantity", 3);
        Boolean A0d4 = C41846B3n.A0d(r0, "has_free_shipping", 4);
        Boolean A0d5 = C41846B3n.A0d(r0, "has_free_two_day_shipping", 5);
        Integer A0g2 = C41846B3n.A0g(r0, "full_inventory_quantity", 3);
        Boolean A0d6 = C41846B3n.A0d(r0, "is_purchase_protected", 7);
        Boolean A0d7 = C41846B3n.A0d(r0, "is_shopify_merchant", 8);
        Long valueOf = Long.valueOf((long) r0.getCoercedIntField(9, "pre_order_estimate_fulfill_date"));
        return new ProductCheckoutProperties(currencyAmountInfoImpl, createShippingAndReturn(dxl2), A0d, A0d2, A0d3, A0d4, A0d5, (Boolean) null, A0d6, A0d7, C41846B3n.A0d(r0, "product_group_has_inventory", 10), A0g, A0g2, C41846B3n.A0g(r0, "two_day_shipping_qe_signal", 18), C41846B3n.A0g(r0, "viewer_purchase_limit", 11), valueOf, (String) null, r0.getOptionalStringField(17, "receiver_id"));
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, X.VjN] */
    public static final List createShoppingCartItem(DXN dxn, User user) {
        ImmutableList A06;
        C250663lr optionalTreeField;
        String A0k;
        C250663lr optionalTreeField2;
        ProductCheckoutProperties productCheckoutProperties;
        String str;
        String name;
        String A07;
        String A072;
        DXN dxn2 = dxn;
        User user2 = user;
        0qQ.A0B(user2, 1);
        if (dxn == null || (A06 = ((C250663lr) dxn2).A06(BdM.class, "edges", 980062615)) == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            Class<BdL> cls = BdL.class;
            C250663lr A03 = A0V.A03(cls, "node", -1109366972);
            if (!(A03 == null || (optionalTreeField = A03.getOptionalTreeField(1, "product", BdK.class, 292231587)) == null || (A0k = C41845B3m.A0k(optionalTreeField)) == null || (optionalTreeField2 = A0V.getOptionalTreeField(0, "node", cls, -1109366972)) == null)) {
                int coercedIntField = optionalTreeField2.getCoercedIntField(0, "quantity");
                DXL dxl = (DXL) optionalTreeField.getOptionalTreeField(13, "checkout_info", C8V.class, -1761359578);
                DXM dxm = (DXM) optionalTreeField.A04(C8W.class, "current_price", -1067939739);
                if (dxl == null || dxm == null) {
                    productCheckoutProperties = null;
                } else {
                    productCheckoutProperties = createProductCheckoutProperties(dxm, dxl);
                }
                String str2 = null;
                String str3 = null;
                String optionalStringField = optionalTreeField.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String A0A = optionalTreeField.A0A(DevServerEntity.COLUMN_DESCRIPTION);
                C250663lr optionalTreeField3 = optionalTreeField.getOptionalTreeField(9, "strikethrough_price", BdJ.class, 141350089);
                if (!(optionalTreeField3 == null || (A072 = optionalTreeField3.A07("formatted_amount")) == null)) {
                    str3 = A072;
                }
                C250663lr optionalTreeField4 = optionalTreeField.getOptionalTreeField(10, "listing_price", BdH.class, -1259573883);
                if (!(optionalTreeField4 == null || (A07 = optionalTreeField4.A07("formatted_amount(strip_currency_zeros:true)")) == null)) {
                    str2 = A07;
                }
                Boolean A0d = C41846B3n.A0d(optionalTreeField, "has_viewer_saved", 5);
                Boolean A0d2 = C41846B3n.A0d(optionalTreeField, "ig_is_product_editable_on_mobile", 6);
                Boolean A0d3 = C41846B3n.A0d(optionalTreeField, "has_variants", 7);
                EWZ ewz = (EWZ) optionalTreeField.getOptionalEnumField(8, "ig_capability_review_status", EWZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (ewz == null || (name = ewz.name()) == null) {
                    str = null;
                } else {
                    str = name.toLowerCase(Locale.ROOT);
                    0qQ.A07(str);
                }
                ProductReviewStatus productReviewStatus = (ProductReviewStatus) ProductReviewStatus.A01.get(str);
                if (productReviewStatus == null) {
                    productReviewStatus = ProductReviewStatus.UNRECOGNIZED;
                }
                Product A01 = W2E.A01(productReviewStatus, productCheckoutProperties, (ProductImageContainer) null, user2, C41846B3n.A0d(optionalTreeField, "can_viewer_see_rnr", 11), A0d3, A0d, A0d2, C41846B3n.A0d(optionalTreeField, "is_in_stock", 12), str2, (String) null, A0A, str3, (String) null, optionalStringField, A0k);
                W0O w0o = new W0O();
                ? obj = new Object();
                obj.A00 = new ProductTile(A01);
                w0o.A01 = coercedIntField;
                w0o.A02 = obj;
                A1C.add(w0o);
            }
        }
        return A1C;
    }
}
