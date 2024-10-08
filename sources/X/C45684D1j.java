package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import java.io.IOException;

/* renamed from: X.D1j  reason: case insensitive filesystem */
public abstract class C45684D1j {
    public static ProductCheckoutProperties parseFromJson(16F r22) {
        16F r3 = r22;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            Integer num = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str = null;
            Integer num2 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Long l = null;
            Boolean bool9 = null;
            String str2 = null;
            ShippingAndReturnsMetadata shippingAndReturnsMetadata = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("can_add_to_bag".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("can_enable_restock_reminder".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r3);
                } else if ("can_show_inventory_quantity".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r3);
                } else if ("currency_amount".equals(A17)) {
                    currencyAmountInfoImpl = C45675D1a.parseFromJson(r3);
                } else if ("full_inventory_quantity".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r3);
                } else if ("has_free_shipping".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r3);
                } else if ("has_free_two_day_shipping".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r3);
                } else if ("ig_referrer_fbid".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("inventory_quantity".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r3);
                } else if ("is_item_in_cart".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r3);
                } else if ("is_purchase_protected".equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r3);
                } else if ("is_shopify_merchant".equals(A17)) {
                    bool8 = AnonymousClass7TF.A0S(r3);
                } else if ("pre_order_estimate_fulfill_date".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if ("product_group_has_inventory".equals(A17)) {
                    bool9 = AnonymousClass7TF.A0S(r3);
                } else if ("receiver_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("shipping_and_return".equals(A17)) {
                    shippingAndReturnsMetadata = C44922CnF.parseFromJson(r3);
                } else if ("two_day_shipping_metadata".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r3);
                } else {
                    num4 = C41847B3o.A13(r3, num4, A17, "viewer_purchase_limit");
                }
                r3.A0z();
            }
            return new ProductCheckoutProperties(currencyAmountInfoImpl, shippingAndReturnsMetadata, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2, num3, num4, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r5, ProductCheckoutProperties productCheckoutProperties) {
        r5.A0c();
        Boolean bool = productCheckoutProperties.A02;
        if (bool != null) {
            r5.A0S("can_add_to_bag", bool.booleanValue());
        }
        Boolean bool2 = productCheckoutProperties.A03;
        if (bool2 != null) {
            r5.A0S("can_enable_restock_reminder", bool2.booleanValue());
        }
        Boolean bool3 = productCheckoutProperties.A04;
        if (bool3 != null) {
            r5.A0S("can_show_inventory_quantity", bool3.booleanValue());
        }
        CurrencyAmountInfo currencyAmountInfo = productCheckoutProperties.A00;
        if (currencyAmountInfo != null) {
            r5.A0q("currency_amount");
            C45675D1a.A00(r5, currencyAmountInfo.FEe());
        }
        Integer num = productCheckoutProperties.A0B;
        if (num != null) {
            r5.A0P("full_inventory_quantity", num.intValue());
        }
        Boolean bool4 = productCheckoutProperties.A05;
        if (bool4 != null) {
            r5.A0S("has_free_shipping", bool4.booleanValue());
        }
        Boolean bool5 = productCheckoutProperties.A06;
        if (bool5 != null) {
            r5.A0S("has_free_two_day_shipping", bool5.booleanValue());
        }
        String str = productCheckoutProperties.A0G;
        if (str != null) {
            r5.A0R("ig_referrer_fbid", str);
        }
        Integer num2 = productCheckoutProperties.A0C;
        if (num2 != null) {
            r5.A0P("inventory_quantity", num2.intValue());
        }
        Boolean bool6 = productCheckoutProperties.A07;
        if (bool6 != null) {
            r5.A0S("is_item_in_cart", bool6.booleanValue());
        }
        Boolean bool7 = productCheckoutProperties.A08;
        if (bool7 != null) {
            r5.A0S("is_purchase_protected", bool7.booleanValue());
        }
        Boolean bool8 = productCheckoutProperties.A09;
        if (bool8 != null) {
            r5.A0S("is_shopify_merchant", bool8.booleanValue());
        }
        Long l = productCheckoutProperties.A0F;
        if (l != null) {
            r5.A0Q("pre_order_estimate_fulfill_date", l.longValue());
        }
        Boolean bool9 = productCheckoutProperties.A0A;
        if (bool9 != null) {
            r5.A0S("product_group_has_inventory", bool9.booleanValue());
        }
        String str2 = productCheckoutProperties.A0H;
        if (str2 != null) {
            r5.A0R("receiver_id", str2);
        }
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = productCheckoutProperties.A01;
        if (shippingAndReturnsMetadata != null) {
            r5.A0q("shipping_and_return");
            r5.A0c();
            DeliveryWindowInfo deliveryWindowInfo = shippingAndReturnsMetadata.A02;
            if (deliveryWindowInfo != null) {
                r5.A0q("estimated_delivery_window");
                DeliveryWindowInfoImpl FEf = deliveryWindowInfo.FEf();
                r5.A0c();
                r5.A0Q("maximum_date", FEf.A00);
                r5.A0Q("minimum_date", FEf.A01);
                r5.A0Z();
            }
            Boolean bool10 = shippingAndReturnsMetadata.A03;
            if (bool10 != null) {
                r5.A0S("is_final_sale", bool10.booleanValue());
            }
            CurrencyAmountInfo currencyAmountInfo2 = shippingAndReturnsMetadata.A00;
            if (currencyAmountInfo2 != null) {
                r5.A0q("return_cost");
                C45675D1a.A00(r5, currencyAmountInfo2.FEe());
            }
            Integer num3 = shippingAndReturnsMetadata.A04;
            if (num3 != null) {
                r5.A0P("return_policy_time", num3.intValue());
            }
            CurrencyAmountInfo currencyAmountInfo3 = shippingAndReturnsMetadata.A01;
            if (currencyAmountInfo3 != null) {
                r5.A0q("shipping_cost");
                C45675D1a.A00(r5, currencyAmountInfo3.FEe());
            }
            String str3 = shippingAndReturnsMetadata.A05;
            if (str3 != null) {
                r5.A0R("shipping_cost_stripped", str3);
            }
            r5.A0Z();
        }
        Integer num4 = productCheckoutProperties.A0D;
        if (num4 != null) {
            r5.A0P("two_day_shipping_metadata", num4.intValue());
        }
        Integer num5 = productCheckoutProperties.A0E;
        if (num5 != null) {
            r5.A0P("viewer_purchase_limit", num5.intValue());
        }
        r5.A0Z();
    }
}
