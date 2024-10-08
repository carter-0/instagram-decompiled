package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.W0q  reason: case insensitive filesystem */
public abstract class C18769W0q {
    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.VcS] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.WRh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v18, types: [X.VYE, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (X.AnonymousClass7TF.A1Y(r4.Cbv(), r11) == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.payments.checkout.CheckoutLaunchParams A00(com.instagram.common.session.UserSession r17, com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf r18, com.instagram.user.model.User r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.Set r33) {
        /*
            java.lang.String r16 = ""
            r8 = 0
            r1 = r32
            r0 = r17
            boolean r11 = X.AnonymousClass7TF.A1U(r8, r0, r1)
            r14 = r20
            r0 = r19
            r4 = r18
            X.C51974G9v.A1M(r0, r4, r14)
            r2 = 5
            r17 = r21
            r0 = r17
            X.0qQ.A0B(r0, r2)
            r0 = 11
            r2 = r28
            r3 = r27
            X.DbW.A1P(r3, r0, r2)
            r0 = 15
            r9 = r31
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0q(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0031:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r5.next()
            X.W0O r0 = (X.W0O) r0
            com.instagram.model.payments.common.ProductItem r0 = A02(r0)
            r7.add(r0)
            goto L_0x0031
        L_0x0045:
            java.lang.String r10 = r4.getReceiverId()
            java.lang.String r6 = r4.getIgReferrerFbid()
            java.lang.Boolean r0 = r4.Cbv()
            if (r0 == 0) goto L_0x005e
            java.lang.Boolean r0 = r4.Cbv()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r11)
            r5 = 1
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            X.VcS r12 = new X.VcS
            r12.<init>()
            r12.A06 = r14
            r0 = r25
            r12.A01 = r0
            r0 = r26
            r12.A03 = r0
            r12.A00 = r3
            r12.A07 = r2
            r0 = r29
            r12.A02 = r0
            r0 = r30
            r12.A05 = r0
            r0 = r23
            r12.A0A = r0
            r12.A09 = r9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x017c }
            r3.<init>()     // Catch:{ IOException -> 0x017c }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ IOException -> 0x017c }
        L_0x0089:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x017c }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r15.next()     // Catch:{ IOException -> 0x017c }
            X.W0O r0 = (X.W0O) r0     // Catch:{ IOException -> 0x017c }
            com.instagram.model.payments.common.ProductItem r1 = A02(r0)     // Catch:{ IOException -> 0x017c }
            java.lang.String r13 = r1.A03     // Catch:{ IOException -> 0x017c }
            int r4 = r1.A00     // Catch:{ IOException -> 0x017c }
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r1.A01     // Catch:{ IOException -> 0x017c }
            java.lang.String r2 = r1.A02     // Catch:{ IOException -> 0x017c }
            X.VYE r1 = new X.VYE     // Catch:{ IOException -> 0x017c }
            r1.<init>()     // Catch:{ IOException -> 0x017c }
            r1.A03 = r13     // Catch:{ IOException -> 0x017c }
            r1.A00 = r4     // Catch:{ IOException -> 0x017c }
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r0.FEe()     // Catch:{ IOException -> 0x017c }
            r1.A01 = r0     // Catch:{ IOException -> 0x017c }
            r1.A02 = r2     // Catch:{ IOException -> 0x017c }
            r3.add(r1)     // Catch:{ IOException -> 0x017c }
            goto L_0x0089
        L_0x00b6:
            r1 = r10
            if (r10 != 0) goto L_0x00bb
            r1 = r16
        L_0x00bb:
            r0 = r6
            if (r6 != 0) goto L_0x00c0
            r0 = r16
        L_0x00c0:
            java.lang.String r4 = "cart"
            X.WRh r15 = new X.WRh     // Catch:{ IOException -> 0x017c }
            r15.<init>()     // Catch:{ IOException -> 0x017c }
            r15.A00 = r3     // Catch:{ IOException -> 0x017c }
            X.Uwg r13 = X.C16536Uwg.UPDATE_CHECKOUT_API     // Catch:{ IOException -> 0x017c }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x017c }
            r3.<init>()     // Catch:{ IOException -> 0x017c }
            X.17W r2 = X.AnonymousClass7TF.A0K(r3)     // Catch:{ IOException -> 0x017c }
            A03(r2, r13, r1, r0)     // Catch:{ IOException -> 0x017c }
            java.lang.String r13 = "merchant_igid"
            r2.A0R(r13, r14)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "extra_data"
            r2.A0q(r0)     // Catch:{ IOException -> 0x017c }
            X.1Ow r1 = X.VK4.A00     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "SHOPPING"
            X.1OW r0 = X.1Ow.A00(r1, r0)     // Catch:{ IOException -> 0x017c }
            r0.ENE(r2, r15)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "ig_attribution_data"
            r2.A0q(r0)     // Catch:{ IOException -> 0x017c }
            r2.A0c()     // Catch:{ IOException -> 0x017c }
            java.lang.String r1 = r12.A04     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = "marketer_igid"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x00fd:
            java.lang.String r0 = r12.A06     // Catch:{ IOException -> 0x017c }
            if (r0 == 0) goto L_0x0104
            r2.A0R(r13, r0)     // Catch:{ IOException -> 0x017c }
        L_0x0104:
            java.lang.String r1 = r12.A07     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x010d
            java.lang.String r0 = "prior_module"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x010d:
            java.lang.String r1 = r12.A08     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = "prior_module_igid"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x0116:
            java.lang.String r1 = r12.A00     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x011f
            java.lang.String r0 = "entry_point"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x011f:
            java.lang.String r1 = r12.A01     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x0128
            java.lang.String r0 = "global_bag_entry_point"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x0128:
            java.lang.String r1 = r12.A03     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x0131
            java.lang.String r0 = "global_bag_prior_module"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x0131:
            java.lang.String r1 = r12.A02     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x013a
            java.lang.String r0 = "global_bag_id"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x013a:
            java.lang.String r1 = r12.A05     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x0143
            java.lang.String r0 = "merchant_bag_id"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x0143:
            java.lang.String r1 = r12.A0A     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x014c
            java.lang.String r0 = "tracking_token"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x014c:
            java.lang.String r1 = r12.A09     // Catch:{ IOException -> 0x017c }
            if (r1 == 0) goto L_0x0155
            java.lang.String r0 = "shopping_session_id"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x017c }
        L_0x0155:
            r2.A0Z()     // Catch:{ IOException -> 0x017c }
            r2.A0Z()     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "is_from_shopping_bag"
            r2.A0S(r0, r11)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "is_from_drops_onboarding"
            r2.A0S(r0, r8)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "add_to_bag_on_checkout_dismiss"
            r2.A0S(r0, r8)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "is_cart_rebranding_enabled"
            r2.A0S(r0, r11)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = "source"
            r2.A0R(r0, r4)     // Catch:{ IOException -> 0x017c }
            r2.A0Z()     // Catch:{ IOException -> 0x017c }
            java.lang.String r4 = X.AnonymousClass7TG.A0k(r2, r3)     // Catch:{ IOException -> 0x017c }
            goto L_0x0184
        L_0x017c:
            java.lang.String r0 = "Unable to launch checkout"
            r1 = r22
            X.0wb.A03(r1, r0)
            r4 = 0
        L_0x0184:
            if (r10 != 0) goto L_0x0188
            r10 = r16
        L_0x0188:
            if (r6 != 0) goto L_0x018c
            r6 = r16
        L_0x018c:
            r3 = 0
            java.lang.String r2 = "IG_NMOR_SHOPPING"
            com.instagram.model.payments.checkout.CheckoutLaunchParams r1 = new com.instagram.model.payments.checkout.CheckoutLaunchParams
            r1.<init>()
            r1.A06 = r10
            r1.A07 = r6
            r0 = r17
            r1.A02 = r0
            r1.A04 = r2
            r1.A09 = r7
            r0 = r24
            r1.A00 = r0
            r1.A05 = r4
            r1.A0B = r8
            r1.A0C = r5
            r1.A08 = r9
            r0 = r33
            r1.A0A = r0
            r1.A03 = r3
            r1.A01 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18769W0q.A00(com.instagram.common.session.UserSession, com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Set):com.instagram.model.payments.checkout.CheckoutLaunchParams");
    }

    public static void A03(17Z r3, C16536Uwg uwg, String str, String str2) {
        r3.A0q("checkout_configuration");
        r3.A0c();
        r3.A0R("version", "1.1.2");
        r3.A0q("order_status_model");
        r3.A0c();
        r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, uwg.A00);
        r3.A0Z();
        r3.A0q("payment_info");
        r3.A0c();
        r3.A0R("payment_item_type", "IG_NMOR_SHOPPING");
        r3.A0R("ig_receiver_id", str);
        r3.A0R(AnonymousClass000.A00(4864), str2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    public static final ProductItem A02(W0O w0o) {
        Product A03 = w0o.A03();
        if (A03 != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = A03.A01;
            ProductCheckoutProperties productCheckoutProperties = productDetailsProductItemDict.A0C;
            if (productCheckoutProperties != null) {
                CurrencyAmountInfo currencyAmountInfo = productCheckoutProperties.A00;
                if (currencyAmountInfo != null) {
                    ProductLaunchInformation productLaunchInformation = productDetailsProductItemDict.A0F;
                    String str = null;
                    if (productLaunchInformation != null) {
                        str = String.valueOf(Long.valueOf(DbY.A04(productLaunchInformation.BLg())));
                    }
                    String str2 = A03.A0H;
                    int A02 = w0o.A02();
                    ? obj = new Object();
                    obj.A03 = str2;
                    obj.A01 = currencyAmountInfo.FEe();
                    obj.A00 = A02;
                    obj.A02 = str;
                    return obj;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.VcS] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [X.WRh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.VYE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        if (r0 == false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.payments.checkout.CheckoutLaunchParams A01(com.instagram.user.model.Product r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.Set r32, boolean r33) {
        /*
            r7 = 0
            java.lang.String r17 = ""
            r2 = 1
            r11 = r19
            X.0qQ.A0B(r11, r2)
            r19 = r20
            r1 = r21
            r10 = r22
            r0 = r19
            X.C51974G9v.A1M(r0, r1, r10)
            r0 = 5
            r8 = r28
            r13 = r23
            X.DbW.A1P(r13, r0, r8)
            r5 = r18
            java.util.List r0 = java.util.Collections.singletonList(r5)
            java.util.ArrayList r6 = X.DbV.A15(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x002a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r12 = r14.next()
            com.instagram.user.model.Product r12 = (com.instagram.user.model.Product) r12
            com.instagram.user.model.ProductDetailsProductItemDict r4 = r12.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r4.A0C
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0074
            com.instagram.model.payments.CurrencyAmountInfo r9 = r0.A00
            if (r9 == 0) goto L_0x006e
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r4.A0F
            r4 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Long r0 = r0.BLg()
            long r3 = X.DbY.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L_0x0057:
            java.lang.String r0 = r12.A0H
            com.instagram.model.payments.common.ProductItem r3 = new com.instagram.model.payments.common.ProductItem
            r3.<init>()
            r3.A03 = r0
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r9.FEe()
            r3.A01 = r0
            r3.A00 = r2
            r3.A02 = r4
            r6.add(r3)
            goto L_0x002a
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x007a:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r5.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r3 = r0.A0C
            if (r3 == 0) goto L_0x01f2
            java.lang.String r0 = r3.A0H
            r5 = 0
            if (r0 == 0) goto L_0x00b5
            java.lang.String r9 = java.lang.String.valueOf(r0)
        L_0x0089:
            java.lang.String r4 = r3.A0G
            java.lang.Boolean r3 = r3.A09
            if (r3 == 0) goto L_0x009a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r3.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            X.VcS r12 = new X.VcS
            r12.<init>()
            r0 = r24
            r12.A04 = r0
            r12.A06 = r11
            r12.A07 = r10
            r0 = r25
            r12.A08 = r0
            r12.A00 = r13
            r0 = r26
            r12.A0A = r0
            r12.A09 = r8
            goto L_0x00b7
        L_0x00b5:
            r9 = r5
            goto L_0x0089
        L_0x00b7:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b9 }
            r10.<init>()     // Catch:{ IOException -> 0x01b9 }
            java.util.Iterator r16 = r6.iterator()     // Catch:{ IOException -> 0x01b9 }
        L_0x00c0:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x01b9 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r15 = r16.next()     // Catch:{ IOException -> 0x01b9 }
            com.instagram.model.payments.common.ProductItem r15 = (com.instagram.model.payments.common.ProductItem) r15     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r14 = r15.A03     // Catch:{ IOException -> 0x01b9 }
            int r13 = r15.A00     // Catch:{ IOException -> 0x01b9 }
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r15.A01     // Catch:{ IOException -> 0x01b9 }
            r18 = r0
            java.lang.String r15 = r15.A02     // Catch:{ IOException -> 0x01b9 }
            X.VYE r0 = new X.VYE     // Catch:{ IOException -> 0x01b9 }
            r0.<init>()     // Catch:{ IOException -> 0x01b9 }
            r0.A03 = r14     // Catch:{ IOException -> 0x01b9 }
            r0.A00 = r13     // Catch:{ IOException -> 0x01b9 }
            com.instagram.model.payments.CurrencyAmountInfoImpl r13 = r18.FEe()     // Catch:{ IOException -> 0x01b9 }
            r0.A01 = r13     // Catch:{ IOException -> 0x01b9 }
            r0.A02 = r15     // Catch:{ IOException -> 0x01b9 }
            r10.add(r0)     // Catch:{ IOException -> 0x01b9 }
            goto L_0x00c0
        L_0x00eb:
            r0 = r9
            if (r9 != 0) goto L_0x00f0
            r0 = r17
        L_0x00f0:
            r15 = r4
            if (r4 != 0) goto L_0x00f5
            r15 = r17
        L_0x00f5:
            X.WRh r14 = new X.WRh     // Catch:{ IOException -> 0x01b9 }
            r14.<init>()     // Catch:{ IOException -> 0x01b9 }
            r14.A00 = r10     // Catch:{ IOException -> 0x01b9 }
            X.Uwg r13 = X.C16536Uwg.UPDATE_CHECKOUT_API     // Catch:{ IOException -> 0x01b9 }
            java.io.StringWriter r16 = new java.io.StringWriter     // Catch:{ IOException -> 0x01b9 }
            r16.<init>()     // Catch:{ IOException -> 0x01b9 }
            X.17W r10 = X.AnonymousClass7TF.A0K(r16)     // Catch:{ IOException -> 0x01b9 }
            A03(r10, r13, r0, r15)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r13 = "merchant_igid"
            r10.A0R(r13, r11)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "extra_data"
            r10.A0q(r0)     // Catch:{ IOException -> 0x01b9 }
            X.1Ow r11 = X.VK4.A00     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "SHOPPING"
            X.1OW r0 = X.1Ow.A00(r11, r0)     // Catch:{ IOException -> 0x01b9 }
            r0.ENE(r10, r14)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "ig_attribution_data"
            r10.A0q(r0)     // Catch:{ IOException -> 0x01b9 }
            r10.A0c()     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r11 = r12.A04     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0130
            java.lang.String r0 = "marketer_igid"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0130:
            java.lang.String r0 = r12.A06     // Catch:{ IOException -> 0x01b9 }
            if (r0 == 0) goto L_0x0137
            r10.A0R(r13, r0)     // Catch:{ IOException -> 0x01b9 }
        L_0x0137:
            java.lang.String r11 = r12.A07     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0140
            java.lang.String r0 = "prior_module"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0140:
            java.lang.String r11 = r12.A08     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0149
            java.lang.String r0 = "prior_module_igid"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0149:
            java.lang.String r11 = r12.A00     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0152
            java.lang.String r0 = "entry_point"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0152:
            java.lang.String r11 = r12.A01     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x015b
            java.lang.String r0 = "global_bag_entry_point"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x015b:
            java.lang.String r11 = r12.A03     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0164
            java.lang.String r0 = "global_bag_prior_module"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0164:
            java.lang.String r11 = r12.A02     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x016d
            java.lang.String r0 = "global_bag_id"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x016d:
            java.lang.String r11 = r12.A05     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0176
            java.lang.String r0 = "merchant_bag_id"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0176:
            java.lang.String r11 = r12.A0A     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x017f
            java.lang.String r0 = "tracking_token"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x017f:
            java.lang.String r11 = r12.A09     // Catch:{ IOException -> 0x01b9 }
            if (r11 == 0) goto L_0x0188
            java.lang.String r0 = "shopping_session_id"
            r10.A0R(r0, r11)     // Catch:{ IOException -> 0x01b9 }
        L_0x0188:
            r10.A0Z()     // Catch:{ IOException -> 0x01b9 }
            r10.A0Z()     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "is_from_shopping_bag"
            r10.A0S(r0, r7)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "is_from_drops_onboarding"
            r10.A0S(r0, r7)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "add_to_bag_on_checkout_dismiss"
            r11 = r33
            r10.A0S(r0, r11)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "is_cart_rebranding_enabled"
            r10.A0S(r0, r2)     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r0 = "source"
            r2 = r29
            r10.A0R(r0, r2)     // Catch:{ IOException -> 0x01b9 }
            r10.A0Z()     // Catch:{ IOException -> 0x01b9 }
            r10.A0Z()     // Catch:{ IOException -> 0x01b9 }
            r10.close()     // Catch:{ IOException -> 0x01b9 }
            java.lang.String r5 = r16.toString()     // Catch:{ IOException -> 0x01b9 }
            goto L_0x01be
        L_0x01b9:
            java.lang.String r0 = "Unable to launch checkout"
            X.0wb.A03(r1, r0)
        L_0x01be:
            if (r9 != 0) goto L_0x01c2
            r9 = r17
        L_0x01c2:
            if (r4 != 0) goto L_0x01c6
            r4 = r17
        L_0x01c6:
            java.lang.String r2 = "IG_NMOR_SHOPPING"
            com.instagram.model.payments.checkout.CheckoutLaunchParams r1 = new com.instagram.model.payments.checkout.CheckoutLaunchParams
            r1.<init>()
            r1.A06 = r9
            r1.A07 = r4
            r0 = r19
            r1.A02 = r0
            r1.A04 = r2
            r1.A09 = r6
            r0 = r27
            r1.A00 = r0
            r1.A05 = r5
            r1.A0B = r7
            r1.A0C = r3
            r1.A08 = r8
            r0 = r32
            r1.A0A = r0
            r0 = r30
            r1.A03 = r0
            r0 = r31
            r1.A01 = r0
            return r1
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18769W0q.A01(com.instagram.user.model.Product, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, boolean):com.instagram.model.payments.checkout.CheckoutLaunchParams");
    }
}
