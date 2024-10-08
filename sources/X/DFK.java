package X;

public final class DFK implements AnonymousClass2Kv {
    public final /* synthetic */ 1P0 A00;

    public DFK(1P0 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.CvZ] */
    /* JADX WARNING: type inference failed for: r55v0, types: [X.VPJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r54v0, types: [java.lang.Object, X.VTh] */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Object, X.VjN] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f1, code lost:
        if (r5 == null) goto L_0x02f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r66) {
        /*
            r65 = this;
            r11 = 0
            r21 = r66
            if (r66 == 0) goto L_0x002e
            X.3lr r3 = X.C41845B3m.A0U(r21)
            if (r3 == 0) goto L_0x002e
            java.lang.Class<X.C51> r2 = X.C51.class
            java.lang.String r1 = "xfb_commerce_cart_add_product(data:$input)"
            r0 = 248770542(0xed3efee, float:5.224656E-30)
            r3.A03(r2, r1, r0)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x002e
            java.lang.Class<X.C4m> r2 = X.C43664C4m.class
            java.lang.String r1 = "global_cart"
            r0 = -349296092(0xffffffffeb2e2a24, float:-2.105521E26)
            X.3lr r2 = r3.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x002e
            r1 = 1
            java.lang.String r0 = "total_item_count"
            r2.getCoercedIntField(r1, r0)
        L_0x002e:
            java.lang.String r20 = "CommerceCartAddProductToCartController"
            if (r66 == 0) goto L_0x02b8
            X.3lr r3 = X.C41845B3m.A0U(r21)
            if (r3 == 0) goto L_0x02f3
            java.lang.Class<X.C51> r2 = X.C51.class
            java.lang.String r1 = "xfb_commerce_cart_add_product(data:$input)"
            r0 = 248770542(0xed3efee, float:5.224656E-30)
            X.3lr r13 = r3.A03(r2, r1, r0)
            if (r13 == 0) goto L_0x02f3
            java.lang.Class<X.C50> r2 = X.C50.class
            java.lang.String r1 = "updated_cart"
            r0 = 663920955(0x2792a13b, float:4.0697947E-15)
            X.3lr r3 = r13.A02(r2, r1, r0)
            X.C50 r3 = (X.C50) r3
            if (r3 == 0) goto L_0x02f3
            java.lang.Class<X.C4z> r19 = X.C43677C4z.class
            r4 = 3
            java.lang.String r18 = "products"
            r2 = 1579045904(0x5e1e5410, float:2.85219034E18)
            r1 = r18
            r0 = r19
            X.3lr r5 = r3.getOptionalTreeField(r4, r1, r0, r2)
            r57 = 0
            if (r5 == 0) goto L_0x02bc
            java.lang.Class<X.C4y> r4 = X.C43676C4y.class
            r1 = 0
            java.lang.String r2 = "edges"
            r0 = 864446243(0x33866723, float:6.258622E-8)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r1, r2, r4, r0)
            if (r0 == 0) goto L_0x02bc
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
        L_0x007e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02ba
            X.3lr r5 = X.C41845B3m.A0V(r16)
            java.lang.Class<X.C4x> r4 = X.C43675C4x.class
            java.lang.String r2 = "node"
            r0 = -1705539862(0xffffffff9a5786ea, float:-4.456994E-23)
            X.3lr r12 = r5.getOptionalTreeField(r1, r2, r4, r0)
            if (r12 == 0) goto L_0x02bc
            java.lang.Class<X.C4w> r4 = X.C43674C4w.class
            java.lang.String r2 = "product"
            r0 = -20831674(0xfffffffffec22246, float:-1.2902409E38)
            X.3lr r2 = r12.A02(r4, r2, r0)
            if (r2 == 0) goto L_0x02bc
            java.lang.Class<X.C4u> r6 = X.C43672C4u.class
            r5 = 4
            java.lang.String r4 = "shop_merchant"
            r0 = 1349773655(0x5073e957, float:1.63686226E10)
            X.3lr r4 = r2.getOptionalTreeField(r5, r4, r6, r0)
            if (r4 == 0) goto L_0x02bc
            java.lang.String r0 = "merchant_ig_id"
            java.lang.String r0 = r4.getOptionalStringField(r1, r0)
            if (r0 == 0) goto L_0x02bc
            com.instagram.user.model.User r44 = X.DDs.A00(r3, r0)
            if (r44 == 0) goto L_0x02bc
            java.lang.String r0 = "strong_id__"
            java.lang.String r56 = r2.getOptionalStringField(r1, r0)
            if (r56 == 0) goto L_0x02bc
            r50 = r11
            r53 = r11
            java.lang.String r0 = "name"
            java.lang.String r55 = r2.A08(r0)
            java.lang.String r0 = "description"
            java.lang.String r52 = r2.A0A(r0)
            java.lang.Class<X.C4v> r6 = X.C43673C4v.class
            r5 = 9
            java.lang.String r4 = "strikethrough_price"
            r0 = 161037556(0x9993cf4, float:3.689073E-33)
            X.3lr r4 = r2.getOptionalTreeField(r5, r4, r6, r0)
            if (r4 == 0) goto L_0x00ef
            java.lang.String r0 = "formatted_amount"
            java.lang.String r0 = r4.getOptionalStringField(r1, r0)
            if (r0 == 0) goto L_0x00ef
            r53 = r0
        L_0x00ef:
            java.lang.Class<X.C4t> r6 = X.C43671C4t.class
            r5 = 10
            java.lang.String r4 = "listing_price"
            r0 = 959275891(0x392d6373, float:1.6535613E-4)
            X.3lr r4 = r2.getOptionalTreeField(r5, r4, r6, r0)
            if (r4 == 0) goto L_0x0108
            java.lang.String r0 = "formatted_amount(strip_currency_zeros:true)"
            java.lang.String r0 = r4.getOptionalStringField(r1, r0)
            if (r0 == 0) goto L_0x0108
            r50 = r0
        L_0x0108:
            r4 = 5
            java.lang.String r0 = "has_viewer_saved"
            java.lang.Boolean r47 = X.C41846B3n.A0d(r2, r0, r4)
            r4 = 6
            java.lang.String r0 = "ig_is_product_editable_on_mobile"
            java.lang.Boolean r48 = X.C41846B3n.A0d(r2, r0, r4)
            r4 = 7
            java.lang.String r0 = "has_variants"
            java.lang.Boolean r46 = X.C41846B3n.A0d(r2, r0, r4)
            X.EWZ r4 = X.EWZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r10 = 8
            java.lang.String r0 = "ig_capability_review_status"
            java.lang.Enum r0 = r2.getOptionalEnumField(r10, r0, r4)
            X.EWZ r0 = (X.EWZ) r0
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = r0.name()
            if (r0 == 0) goto L_0x02b4
            com.instagram.api.schemas.ProductReviewStatus r41 = com.instagram.api.schemas.ProductReviewStatus.valueOf(r0)
        L_0x0135:
            r4 = 11
            java.lang.String r0 = "can_viewer_see_rnr"
            java.lang.Boolean r45 = X.C41846B3n.A0d(r2, r0, r4)
            r4 = 12
            java.lang.String r0 = "is_in_stock"
            java.lang.Boolean r49 = X.C41846B3n.A0d(r2, r0, r4)
            java.lang.Class<X.C4r> r6 = X.C43669C4r.class
            r5 = 13
            java.lang.String r4 = "checkout_info"
            r0 = -1663869471(0xffffffff9cd35de1, float:-1.3987076E-21)
            X.3lr r0 = r2.getOptionalTreeField(r5, r4, r6, r0)
            if (r0 == 0) goto L_0x02b1
            java.lang.Class<X.C4s> r7 = X.C43670C4s.class
            r4 = 2
            java.lang.String r6 = "current_price"
            r5 = 1609016551(0x5fe7a4e7, float:3.338344E19)
            X.3lr r2 = r2.getOptionalTreeField(r4, r6, r7, r5)
            java.lang.String r5 = "can_add_to_bag"
            java.lang.Boolean r25 = X.C41846B3n.A0d(r0, r5, r1)
            r5 = 1
            java.lang.String r6 = "can_enable_restock_reminder"
            java.lang.Boolean r26 = X.C41846B3n.A0d(r0, r6, r5)
            java.lang.String r6 = "can_show_inventory_quantity"
            java.lang.Boolean r27 = X.C41846B3n.A0d(r0, r6, r4)
            if (r2 == 0) goto L_0x02ae
            java.lang.String r6 = "amount"
            java.lang.String r9 = r2.getOptionalStringField(r1, r6)
            java.lang.String r6 = "amount_with_offset"
            java.lang.String r8 = r2.getOptionalStringField(r5, r6)
            java.lang.String r6 = "currency"
            java.lang.String r7 = r2.getOptionalStringField(r4, r6)
            r6 = 3
            java.lang.String r4 = "offset"
            java.lang.Integer r2 = X.C41846B3n.A0g(r2, r4, r6)
            com.instagram.model.payments.CurrencyAmountInfoImpl r15 = new com.instagram.model.payments.CurrencyAmountInfoImpl
            r15.<init>(r2, r9, r8, r7)
        L_0x0193:
            r4 = 3
            java.lang.String r2 = "full_inventory_quantity"
            java.lang.Integer r34 = X.C41846B3n.A0g(r0, r2, r4)
            r7 = 4
            java.lang.String r6 = "has_free_shipping"
            java.lang.Boolean r28 = X.C41846B3n.A0d(r0, r6, r7)
            r7 = 5
            java.lang.String r6 = "has_free_two_day_shipping"
            java.lang.Boolean r29 = X.C41846B3n.A0d(r0, r6, r7)
            java.lang.Integer r35 = X.C41846B3n.A0g(r0, r2, r4)
            r4 = 7
            java.lang.String r2 = "is_purchase_protected"
            java.lang.Boolean r31 = X.C41846B3n.A0d(r0, r2, r4)
            java.lang.String r2 = "is_shopify_merchant"
            java.lang.Boolean r32 = X.C41846B3n.A0d(r0, r2, r10)
            r4 = 9
            java.lang.String r2 = "pre_order_estimate_fulfill_date"
            int r2 = r0.getCoercedIntField(r4, r2)
            long r6 = (long) r2
            java.lang.Long r38 = java.lang.Long.valueOf(r6)
            r4 = 10
            java.lang.String r2 = "product_group_has_inventory"
            java.lang.Boolean r33 = X.C41846B3n.A0d(r0, r2, r4)
            r4 = 17
            java.lang.String r2 = "receiver_id"
            java.lang.String r40 = r0.getOptionalStringField(r4, r2)
            java.lang.Class<X.C4o> r7 = X.C43666C4o.class
            r6 = 12
            java.lang.String r4 = "estimated_delivery_window"
            r2 = 1370600876(0x51b1b5ac, float:9.5407145E10)
            X.3lr r2 = r0.getOptionalTreeField(r6, r4, r7, r2)
            r64 = 0
            if (r2 == 0) goto L_0x02ab
            java.lang.String r4 = "maximum_date"
            long r8 = r2.getCoercedTimeField(r1, r4)
            java.lang.String r4 = "minimum_date"
            long r6 = r2.getCoercedTimeField(r5, r4)
            com.instagram.model.payments.DeliveryWindowInfoImpl r14 = new com.instagram.model.payments.DeliveryWindowInfoImpl
            r14.<init>(r8, r6)
        L_0x01f8:
            r4 = 13
            java.lang.String r2 = "is_final_sale"
            java.lang.Boolean r62 = X.C41846B3n.A0d(r0, r2, r4)
            java.lang.Class<X.C4p> r7 = X.C43667C4p.class
            r6 = 14
            java.lang.String r4 = "return_cost"
            r2 = 1584357529(0x5e6f6099, float:4.3122387E18)
            X.3lr r2 = r0.getOptionalTreeField(r6, r4, r7, r2)
            if (r2 == 0) goto L_0x02a7
            java.lang.String r4 = "amount"
            java.lang.String r6 = r2.getOptionalStringField(r1, r4)
            java.lang.String r4 = "amount_with_offset"
            java.lang.String r4 = r2.getOptionalStringField(r5, r4)
            com.instagram.model.payments.CurrencyAmountInfoImpl r59 = X.C41848B3p.A19(r2, r6, r4)
        L_0x021f:
            r4 = 15
            java.lang.String r2 = "return_policy_time"
            java.lang.Integer r63 = X.C41846B3n.A0g(r0, r2, r4)
            java.lang.Class<X.C4q> r8 = X.C43668C4q.class
            r7 = 16
            java.lang.String r6 = "shipping_cost"
            r4 = -549792721(0xffffffffdf3ad42f, float:-1.3462437E19)
            X.3lr r2 = r0.getOptionalTreeField(r7, r6, r8, r4)
            if (r2 == 0) goto L_0x02a4
            java.lang.String r9 = "amount"
            java.lang.String r10 = r2.getOptionalStringField(r1, r9)
            java.lang.String r9 = "amount_with_offset"
            java.lang.String r5 = r2.getOptionalStringField(r5, r9)
            com.instagram.model.payments.CurrencyAmountInfoImpl r60 = X.C41848B3p.A19(r2, r10, r5)
        L_0x0246:
            X.3lr r2 = r0.getOptionalTreeField(r7, r6, r8, r4)
            if (r2 == 0) goto L_0x0252
            java.lang.String r4 = "formatted_amount(strip_currency_zeros:true)"
            java.lang.String r64 = r2.A0B(r4)
        L_0x0252:
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r24 = new com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata
            r58 = r24
            r61 = r14
            r58.<init>(r59, r60, r61, r62, r63, r64)
            r4 = 18
            java.lang.String r2 = "two_day_shipping_qe_signal"
            java.lang.Integer r36 = X.C41846B3n.A0g(r0, r2, r4)
            r4 = 11
            java.lang.String r2 = "viewer_purchase_limit"
            java.lang.Integer r37 = X.C41846B3n.A0g(r0, r2, r4)
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r22 = new com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties
            r23 = r15
            r30 = r11
            r39 = r11
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x0276:
            r42 = r22
            r43 = r11
            r51 = r11
            r54 = r11
            com.instagram.user.model.Product r6 = X.W2E.A01(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            java.lang.String r0 = "quantity"
            int r5 = r12.getCoercedIntField(r1, r0)
            X.W0O r4 = new X.W0O
            r4.<init>()
            X.VjN r2 = new X.VjN
            r2.<init>()
            com.instagram.model.shopping.productfeed.ProductTile r0 = new com.instagram.model.shopping.productfeed.ProductTile
            r0.<init>(r6)
            r2.A00 = r0
            r4.A01 = r5
            r4.A02 = r2
            r0 = r17
            r0.add(r4)
            goto L_0x007e
        L_0x02a4:
            r60 = r11
            goto L_0x0246
        L_0x02a7:
            r59 = r11
            goto L_0x021f
        L_0x02ab:
            r14 = r11
            goto L_0x01f8
        L_0x02ae:
            r15 = 0
            goto L_0x0193
        L_0x02b1:
            r22 = r11
            goto L_0x0276
        L_0x02b4:
            r41 = r11
            goto L_0x0135
        L_0x02b8:
            r4 = r11
            goto L_0x030a
        L_0x02ba:
            r57 = r17
        L_0x02bc:
            java.lang.Class<X.C4m> r2 = X.C43664C4m.class
            r4 = 0
            java.lang.String r1 = "global_cart"
            r0 = -349296092(0xffffffffeb2e2a24, float:-2.105521E26)
            X.3lr r1 = r13.getOptionalTreeField(r4, r1, r2, r0)
            if (r1 == 0) goto L_0x02f3
            java.lang.String r0 = "strong_id__"
            java.lang.String r6 = r1.getOptionalStringField(r4, r0)
            if (r6 == 0) goto L_0x02f3
            java.lang.Class<X.C4n> r2 = X.C43665C4n.class
            java.lang.String r1 = "merchant"
            r0 = 1000975349(0x3ba9abf5, float:0.0051779696)
            X.3lr r1 = r3.A04(r2, r1, r0)
            if (r1 == 0) goto L_0x0318
            java.lang.String r0 = "ig_id"
            int r1 = r1.getCoercedIntField(r4, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0318
            if (r1 <= 0) goto L_0x0318
            java.lang.String r5 = r0.toString()
            if (r5 != 0) goto L_0x0373
        L_0x02f3:
            java.lang.Object r4 = r21.Bny()
            X.3lr r3 = X.C41845B3m.A0U(r21)
            if (r3 == 0) goto L_0x030a
            java.lang.Class<X.C51> r2 = X.C51.class
            java.lang.String r1 = "xfb_commerce_cart_add_product(data:$input)"
            r0 = 248770542(0xed3efee, float:5.224656E-30)
            X.3lr r11 = r3.A03(r2, r1, r0)
            X.C51 r11 = (X.C51) r11
        L_0x030a:
            r0 = r21
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r4, r11}
            java.lang.String r1 = "The addProductToCartCallback was not updated because a null ShoppingCartResponse was generated based on result %s result.result %s xfbCommerceCartAddProduct %s"
            r0 = r20
            X.0KC.A0O(r0, r1, r2)
            return
        L_0x0318:
            r5 = 3
            r2 = 1579045904(0x5e1e5410, float:2.85219034E18)
            r1 = r18
            r0 = r19
            X.3lr r5 = r3.getOptionalTreeField(r5, r1, r0, r2)
            if (r5 == 0) goto L_0x02f3
            java.lang.Class<X.C4y> r2 = X.C43676C4y.class
            java.lang.String r1 = "edges"
            r0 = 864446243(0x33866723, float:6.258622E-8)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x02f3
            java.util.Iterator r8 = r0.iterator()
        L_0x0337:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02f3
            X.3lr r5 = X.C41845B3m.A0V(r8)
            if (r5 == 0) goto L_0x0337
            java.lang.Class<X.C4x> r2 = X.C43675C4x.class
            java.lang.String r1 = "node"
            r0 = -1705539862(0xffffffff9a5786ea, float:-4.456994E-23)
            X.3lr r5 = r5.getOptionalTreeField(r4, r1, r2, r0)
            if (r5 == 0) goto L_0x0337
            java.lang.Class<X.C4w> r2 = X.C43674C4w.class
            java.lang.String r1 = "product"
            r0 = -20831674(0xfffffffffec22246, float:-1.2902409E38)
            X.3lr r7 = r5.A02(r2, r1, r0)
            if (r7 == 0) goto L_0x0337
            java.lang.Class<X.C4u> r5 = X.C43672C4u.class
            r2 = 4
            java.lang.String r1 = "shop_merchant"
            r0 = 1349773655(0x5073e957, float:1.63686226E10)
            X.3lr r1 = r7.getOptionalTreeField(r2, r1, r5, r0)
            if (r1 == 0) goto L_0x0337
            java.lang.String r0 = "merchant_ig_id"
            java.lang.String r5 = r1.getOptionalStringField(r4, r0)
            if (r5 == 0) goto L_0x0337
        L_0x0373:
            if (r57 == 0) goto L_0x02f3
            boolean r0 = r57.isEmpty()
            if (r0 != 0) goto L_0x02f3
            com.instagram.user.model.User r2 = X.DDs.A00(r3, r5)
            if (r2 == 0) goto L_0x02f3
            r1 = 1
            java.lang.String r0 = "item_count"
            int r1 = r3.getCoercedIntField(r1, r0)
            X.CvZ r0 = new X.CvZ
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r0.A02 = r6
            r0.A03 = r5
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
            X.VPJ r55 = new X.VPJ
            r55.<init>()
            X.VTh r54 = new X.VTh
            r54.<init>()
            X.VvF r52 = new X.VvF
            r53 = r11
            r56 = r2
            r58 = r4
            r52.<init>(r53, r54, r55, r56, r57, r58)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r52)
            X.CG8 r1 = new X.CG8
            r1.<init>()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A02 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A03 = r0
            r1.A02 = r3
            r1.A01 = r2
            r0 = r65
            X.1P0 r0 = r0.A00
            r0.onSuccess(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFK.invoke(X.3JD):void");
    }
}
