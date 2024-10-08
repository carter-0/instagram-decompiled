package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.SUd  reason: case insensitive filesystem */
public abstract class C11432SUd {
    public static final QNI A00(ECPPaymentResponseParams eCPPaymentResponseParams, String str) {
        boolean z;
        String str2;
        CurrencyAmount currencyAmount;
        String str3;
        String str4;
        AnonymousClass0K0 r8 = null;
        0Df r7 = null;
        ShippingAddress shippingAddress = eCPPaymentResponseParams.A07;
        2IV r3 = null;
        if (shippingAddress == null || (str4 = shippingAddress.A04) == null) {
            z = false;
        } else {
            r8 = GraphQlCallInput.A02;
            Boolean A0v = AnonymousClass7TE.A0v();
            0Df A03 = C41845B3m.A03(r8, A0v, "is_default");
            A0K(A03, shippingAddress, A0v);
            r7 = r8.A02();
            r7.A0E(A03, "address");
            0Df.A00(r7, str4, "address_id");
            z = true;
        }
        AnonymousClass0K0 r4 = GraphQlCallInput.A02;
        0Df r5 = null;
        String str5 = eCPPaymentResponseParams.A0G;
        if (str5 != null) {
            r5 = r4.A02();
            0Df.A00(r5, str5, "payer_name");
        }
        String str6 = eCPPaymentResponseParams.A0F;
        if (str6 != null) {
            if (r5 == null) {
                r5 = r4.A02();
            }
            0Df.A00(r5, str6, "payer_email");
        }
        String str7 = eCPPaymentResponseParams.A0H;
        if (str7 != null) {
            if (r5 == null) {
                r5 = r4.A02();
            }
            0Df.A00(r5, str7, "payer_phone");
        }
        if (z) {
            if (r5 == null) {
                r5 = r4.A02();
            }
            if (r7 == null) {
                r7 = r8.A02();
            }
            r5.A0E(r7, "shipping_address_details");
        }
        ShippingOption shippingOption = eCPPaymentResponseParams.A02;
        if (shippingOption != null) {
            0Df A032 = C41845B3m.A03(r4, shippingOption.A03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int intValue = shippingOption.A01.intValue();
            if (intValue == 0) {
                str3 = "SHIPPING";
            } else if (intValue != 1) {
                str3 = "PICKUP";
            } else {
                str3 = OffsiteShippingType$Companion.DELIVERY;
            }
            0Df.A00(A032, str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            0Df.A00(A032, shippingOption.A04, "label");
            2IV A0R = Pxe.A0R();
            CurrencyAmount currencyAmount2 = shippingOption.A00;
            A0R.A09(currencyAmount2.A01, "amount");
            A0R.A09(currencyAmount2.A00, "currency_code");
            C66580MXl.A1M(A032, A0R, "price");
            0Df.A00(A032, shippingOption.A02, DevServerEntity.COLUMN_DESCRIPTION);
            String A00 = C66579MXk.A00(163);
            if (r5 == null) {
                r5 = r4.A02();
            }
            r5.A0E(A032, A00);
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams.A01;
        if (fulfillmentOption != null) {
            0Df A033 = C41845B3m.A03(r4, fulfillmentOption.A00(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            boolean z2 = fulfillmentOption instanceof PickupFulfillmentOption;
            if (z2) {
                str2 = ((PickupFulfillmentOption) fulfillmentOption).A04;
            } else {
                str2 = fulfillmentOption.A01;
            }
            0Df.A00(A033, str2, "label");
            2IV A0R2 = Pxe.A0R();
            if (z2) {
                currencyAmount = ((PickupFulfillmentOption) fulfillmentOption).A00;
            } else {
                currencyAmount = fulfillmentOption.A00;
            }
            A0R2.A09(currencyAmount.A01, "amount");
            A0R2.A09(currencyAmount.A00, "currency_code");
            C66580MXl.A1M(A033, A0R2, "price");
            String A002 = C66579MXk.A00(163);
            if (r5 == null) {
                r5 = r4.A02();
            }
            r5.A0E(A033, A002);
        }
        Boolean valueOf = Boolean.valueOf(eCPPaymentResponseParams.A0T);
        if (r5 == null) {
            r5 = r4.A02();
        }
        0Df.A00(r5, valueOf, "email_optin_checkbox_value");
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A07(eCPPaymentResponseParams.A0R, Py7.A00());
        2IV A0R3 = Pxe.A0R();
        if (str == null) {
            str = eCPPaymentResponseParams.A0E;
        }
        A0R3.A09(str, "order_id");
        A0R3.A09(eCPPaymentResponseParams.A0P, "receiver_id");
        A0R3.A09(eCPPaymentResponseParams.A0O, "product_id");
        A0R3.A09(eCPPaymentResponseParams.A0Q, TraceFieldType.RequestID);
        A0R3.A09(eCPPaymentResponseParams.A0B, "payment_container_id");
        Pxf.A1E(r5, A0R3, "return_fields");
        graphQlCallInput.A05("submit_payment_container_input_list", AnonymousClass7TE.A1I(A0R3));
        graphQlCallInput.A07(Pxi.A0Y(), "client_mutation_id");
        OtcInput otcInput = eCPPaymentResponseParams.A05;
        if (otcInput != null) {
            r3 = C11300SKk.A00(otcInput);
        }
        graphQlCallInput.A06(r3, "one_time_checkout_input");
        return graphQlCallInput;
    }

    public static final REn A05(C298525tb r1) {
        int A02 = DbU.A02(r1, 0);
        if (A02 == 28) {
            return REn.UX_SHIPPING_ADDRESS;
        }
        if (A02 == 29) {
            return REn.UX_FULFILLMENT_OPTIONS;
        }
        if (A02 == 17) {
            return REn.ONE_TIME_CHECKOUT_OPTION;
        }
        if (A02 == 16) {
            return REn.NUX_PAYMENT_RECEIVER;
        }
        if (A02 != 12) {
            return null;
        }
        return REn.UX_INCENTIVES;
    }

    public static final C8891REi A06(C8928RFw rFw) {
        int A02 = DbU.A02(rFw, 0);
        if (A02 == 6) {
            return C8891REi.REQUEST_PAYER_NAME;
        }
        if (A02 == 4) {
            return C8891REi.REQUEST_PAYER_EMAIL;
        }
        if (A02 == 8) {
            return C8891REi.REQUEST_PAYER_PHONE;
        }
        if (A02 != 2) {
            return null;
        }
        return C8891REi.REQUEST_BILLING_ADDRESS;
    }

    public static final CheckoutConfiguration A07(QXO qxo, boolean z) {
        QXO qxo2 = qxo;
        ImmutableList A0E = qxo2.A0E();
        0qQ.A07(A0E);
        LinkedHashSet A0I = A0I(A0E);
        LinkedHashSet A0H = A0H(qxo2);
        String A07 = qxo2.A07("checkout_button_label");
        boolean coercedBooleanField = qxo2.getCoercedBooleanField(1, "full_billing_required");
        Boolean valueOf = Boolean.valueOf(z);
        return new CheckoutConfiguration((APMConfiguration) null, (C8942RGk) null, (C8942RGk) null, valueOf, valueOf, valueOf, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, false, (Integer) null, (String) null, A07, (String) null, A0I, A0H, 1, coercedBooleanField, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.CheckoutResponse A08(X.C10797RyJ r7) {
        /*
            r3 = 0
            if (r7 == 0) goto L_0x006d
            X.QSl r1 = r7.A01
            r2 = 0
            java.lang.String r0 = "is_ecp_available"
            java.lang.Boolean r5 = X.C41846B3n.A0d(r1, r0, r2)
            X.QT7 r1 = r7.A02
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "is_link_available"
            java.lang.Boolean r4 = X.C41846B3n.A0d(r1, r0, r2)
        L_0x0016:
            X.QT7 r6 = r7.A02
            if (r6 == 0) goto L_0x0064
            java.lang.Class<X.QT6> r2 = X.QT6.class
            java.lang.String r1 = "link_unavailable_reason"
            r0 = -1861959087(0xffffffff9104c251, float:-1.0472842E-28)
            X.3lr r2 = r6.A02(r2, r1, r0)
            if (r2 == 0) goto L_0x0064
            java.lang.Class<X.QRu> r1 = X.C7653QRu.class
            r0 = 289198793(0x113cd2c9, float:1.4895538E-28)
            X.3lr r6 = r2.A01(r1, r0)
            if (r6 == 0) goto L_0x0064
            java.lang.Class<X.QRt> r2 = X.C7652QRt.class
            java.lang.String r1 = "user_facing_error"
            r0 = 563395528(0x2194bbc8, float:1.0078575E-18)
            X.3lr r2 = r6.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x0064
            java.lang.Class<X.QVG> r1 = X.QVG.class
            r0 = 736683160(0x2be8e498, float:1.6548039E-12)
            X.3lr r1 = r2.A01(r1, r0)
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "error_description"
            java.lang.String r2 = r1.A0C(r0)
            if (r2 == 0) goto L_0x0064
        L_0x0053:
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            boolean r0 = X.0qQ.A0K(r5, r1)
            if (r0 != 0) goto L_0x0073
            boolean r0 = X.0qQ.A0K(r4, r1)
            if (r0 != 0) goto L_0x0073
            return r3
        L_0x0064:
            X.QSl r1 = r7.A01
            java.lang.String r0 = "ecp_availability_reason"
            java.lang.String r2 = r1.A08(r0)
            goto L_0x0053
        L_0x006d:
            r5 = r3
        L_0x006e:
            r4 = r3
            if (r7 != 0) goto L_0x0016
            r2 = r3
            goto L_0x0053
        L_0x0073:
            java.lang.String r1 = "CHECKOUT_NOT_AVAILABLE"
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = new com.facebookpay.expresscheckout.models.CheckoutResponse
            r0.<init>(r3, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A08(X.RyJ):com.facebookpay.expresscheckout.models.CheckoutResponse");
    }

    public static final TransactionInfo A0B(C7680QSv qSv, TransactionInfo transactionInfo) {
        String str;
        C250663lr r6;
        ShippingOptions shippingOptions;
        Object obj;
        ArrayList arrayList;
        List list;
        ArrayList<ShippingOption> arrayList2;
        ShippingOption shippingOption;
        ImmutableList requiredCompactedStringListField;
        C250663lr reinterpretIfFulfillsType;
        C250663lr optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        String A08;
        String optionalStringField;
        C7680QSv qSv2 = qSv;
        0qQ.A0B(qSv2, 0);
        Class<C7678QSt> cls = C7678QSt.class;
        Class<QT0> cls2 = QT0.class;
        C250663lr optionalTreeField2 = ((C250663lr) qSv2.getRequiredCompactedTreeListField(1, "price_items", cls, 1908452541).get(0)).reinterpretRequired(0, cls2, 754339802).getOptionalTreeField(0, "amount", C7683QSy.class, -298466489);
        if (optionalTreeField2 != null) {
            str = optionalTreeField2.getOptionalStringField(0, "currency");
        } else {
            str = null;
        }
        if (str != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ImmutableList requiredCompactedTreeListField2 = qSv2.getRequiredCompactedTreeListField(1, "price_items", cls, 1908452541);
            if (requiredCompactedTreeListField2 != null) {
                C249803kO A0J = C66580MXl.A0J(requiredCompactedTreeListField2);
                while (A0J.hasNext()) {
                    QT0 qt0 = (QT0) C41845B3m.A0V(A0J).reinterpretRequired(0, cls2, 754339802);
                    0qQ.A07(qt0);
                    A0L(qt0, A1C);
                }
                C250663lr A04 = qSv2.A04(C7679QSu.class, "shipping_options", 419976308);
                if (A04 != null) {
                    r6 = A04.reinterpretRequired(0, QT4.class, 1977287373);
                } else {
                    r6 = null;
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (r6 != null) {
                    C249803kO A0J2 = C66580MXl.A0J(r6.getRequiredCompactedTreeListField(1, "shipping_options", QT3.class, -1606485828));
                    while (A0J2.hasNext()) {
                        C250663lr reinterpretRequired = C41845B3m.A0V(A0J2).reinterpretRequired(0, QT2.class, 678135786);
                        String optionalStringField2 = reinterpretRequired.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (optionalStringField2 != null) {
                            Integer A00 = C11085S9f.A00(Pxi.A0g(reinterpretRequired, RG1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1));
                            String A09 = reinterpretRequired.A09("label");
                            if (A09 != null) {
                                Class<QT1> cls3 = QT1.class;
                                C250663lr optionalTreeField3 = reinterpretRequired.getOptionalTreeField(3, "price", cls3, -1977525879);
                                if (optionalTreeField3 == null || (A08 = optionalTreeField3.A08("currency_code")) == null) {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                C250663lr optionalTreeField4 = reinterpretRequired.getOptionalTreeField(3, "price", cls3, -1977525879);
                                if (optionalTreeField4 == null || (optionalStringField = optionalTreeField4.getOptionalStringField(0, "amount")) == null) {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                CurrencyAmount currencyAmount = new CurrencyAmount(A08, optionalStringField);
                                String A0B = reinterpretRequired.A0B(DevServerEntity.COLUMN_DESCRIPTION);
                                if (A0B != null) {
                                    A1C2.add(new ShippingOption(currencyAmount, A00, optionalStringField2, A09, A0B));
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    shippingOptions = new ShippingOptions(r6.getOptionalStringField(0, "default_selection_id"), A1C2);
                } else {
                    shippingOptions = null;
                }
                Iterator it = C41845B3m.A0X(qSv2, C7674QSp.class, "components", 5, 1421538184).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C250663lr) obj).getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C298525tb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == C298525tb.INCENTIVES) {
                        break;
                    }
                }
                C250663lr r4 = (C250663lr) obj;
                if (r4 == null || (reinterpretIfFulfillsType = r4.reinterpretIfFulfillsType(1, "PAYFBPayComponentIncentives", C7673QSo.class, 943059052)) == null || (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, "all_eligible_incentives", C7672QSn.class, 101418297)) == null || (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "incentives", C7671QSm.class, 187178854)) == null) {
                    arrayList = 0sn.A00;
                } else {
                    arrayList = AnonymousClass7TE.A1C();
                    Iterator it2 = requiredCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        String optionalStringField3 = C41845B3m.A0V(it2).getOptionalStringField(0, "promo_code");
                        if (optionalStringField3 != null) {
                            arrayList.add(optionalStringField3);
                        }
                    }
                }
                TransactionInfo transactionInfo2 = transactionInfo;
                String str2 = transactionInfo2.A05;
                ArrayList<PriceInfo> arrayList3 = transactionInfo2.A07;
                PromoCodeList promoCodeList = new PromoCodeList(arrayList);
                C250663lr optionalTreeField5 = qSv2.getOptionalTreeField(4, "offer_credential_ids", C7677QSs.class, 2025254103);
                if (optionalTreeField5 == null || (requiredCompactedStringListField = optionalTreeField5.getRequiredCompactedStringListField(0, "credential_ids")) == null) {
                    list = 0sn.A00;
                } else {
                    list = 00k.A0a(requiredCompactedStringListField);
                }
                String str3 = transactionInfo2.A06;
                Integer num = transactionInfo2.A04;
                if (num == null) {
                    if (shippingOptions == null || (arrayList2 = shippingOptions.A01) == null || (shippingOption = (ShippingOption) 00k.A0J(arrayList2)) == null) {
                        num = null;
                    } else {
                        num = shippingOption.A01;
                    }
                }
                return new TransactionInfo((FulfillmentOptions) null, (PickupInfo) null, promoCodeList, shippingOptions, num, str, str2, str3, A1C, arrayList3, list);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final boolean A0M(QXD qxd) {
        C7800QXl A0E;
        QRN A0F;
        C250663lr A01;
        C7800QXl A0E2;
        QRL A0E3;
        QXO qxo;
        ImmutableList A0E4;
        if (qxd == null || (A0E = qxd.A0E()) == null || (A0F = A0E.A0F()) == null || (A01 = A0F.A01(C7670QSl.class, -633919572)) == null || !A01.getCoercedBooleanField(0, "is_ecp_available") || (A0E2 = qxd.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (qxo = (QXO) A0E3.A01(QXO.class, -1333706087)) == null || (A0E4 = qxo.A0E()) == null) {
            return false;
        }
        C298525tb r2 = C298525tb.ONE_TIME_CHECKOUT_OPTION;
        Iterator it = A0E4.iterator();
        while (it.hasNext()) {
            if (it.next() == r2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r3.contains(r0) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0O(com.facebookpay.expresscheckout.models.ECPPaymentRequest r6, X.C298525tb r7) {
        /*
            r0 = 1
            r5 = 28
            X.0qQ.A0B(r7, r0)
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x0051
            java.util.Set<X.REn> r4 = r0.A0H
            java.util.Set<X.REi> r3 = r0.A0I
        L_0x000f:
            int r2 = r7.ordinal()
            r1 = 1
            if (r2 == r5) goto L_0x005d
            r0 = 29
            if (r2 == r0) goto L_0x0058
            switch(r2) {
                case 6: goto L_0x0034;
                case 9: goto L_0x0058;
                case 12: goto L_0x0062;
                case 22: goto L_0x001e;
                case 25: goto L_0x0053;
                default: goto L_0x001d;
            }
        L_0x001d:
            return r1
        L_0x001e:
            r1 = 0
            if (r3 == 0) goto L_0x001d
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_NAME
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x004f
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_EMAIL
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x004f
            X.REi r0 = X.C8891REi.REQUEST_PICKUP_PHONE
            goto L_0x0049
        L_0x0034:
            r1 = 0
            if (r3 == 0) goto L_0x001d
            X.REi r0 = X.C8891REi.REQUEST_PAYER_NAME
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x004f
            X.REi r0 = X.C8891REi.REQUEST_PAYER_EMAIL
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x004f
            X.REi r0 = X.C8891REi.REQUEST_PAYER_PHONE
        L_0x0049:
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x001d
        L_0x004f:
            r1 = 1
            return r1
        L_0x0051:
            r4 = r3
            goto L_0x000f
        L_0x0053:
            if (r4 == 0) goto L_0x006b
            X.REn r0 = X.REn.UX_PROMO_CODE
            goto L_0x0066
        L_0x0058:
            if (r4 == 0) goto L_0x006b
            X.REn r0 = X.REn.UX_FULFILLMENT_OPTIONS
            goto L_0x0066
        L_0x005d:
            if (r4 == 0) goto L_0x006b
            X.REn r0 = X.REn.UX_SHIPPING_ADDRESS
            goto L_0x0066
        L_0x0062:
            if (r4 == 0) goto L_0x006b
            X.REn r0 = X.REn.UX_INCENTIVES
        L_0x0066:
            boolean r1 = r4.contains(r0)
            return r1
        L_0x006b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A0O(com.facebookpay.expresscheckout.models.ECPPaymentRequest, X.5tb):boolean");
    }

    public static final CurrencyAmount A02(CurrencyAmount currencyAmount, SUj sUj) {
        ArrayList<PriceInfo> arrayList;
        float parseFloat = Float.parseFloat(currencyAmount.A01);
        TransactionInfo transactionInfo = (TransactionInfo) sUj.A01;
        if (!(transactionInfo == null || (arrayList = transactionInfo.A08) == null)) {
            ArrayList<PriceInfo> A1C = AnonymousClass7TE.A1C();
            Iterator<PriceInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                PriceInfo next = it.next();
                RFW rfw = next.A01;
                if (rfw == RFW.DISCOUNT || rfw == RFW.PRE_TAX_DISCOUNT) {
                    A1C.add(next);
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            for (PriceInfo priceInfo : A1C) {
                parseFloat -= Float.parseFloat(priceInfo.A00.A01);
                A0r.add(C60340gF.A00);
            }
        }
        String str = currencyAmount.A00;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%.2f", Float.valueOf(parseFloat));
        0qQ.A07(formatStrLocaleSafe);
        return new CurrencyAmount(str, formatStrLocaleSafe);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.common.models.CurrencyAmount A03(com.facebookpay.expresscheckout.models.TransactionInfo r5) {
        /*
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r3 = r0.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.RFW r1 = r0.A01
            X.RFW r0 = X.RFW.TOTAL
            if (r1 != r0) goto L_0x0009
        L_0x001c:
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L_0x0025
        L_0x0020:
            com.facebookpay.common.models.CurrencyAmount r0 = r2.A00
            return r0
        L_0x0023:
            r2 = r4
            goto L_0x001c
        L_0x0025:
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A07
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r3 = r0.iterator()
        L_0x002d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.RFW r1 = r0.A01
            X.RFW r0 = X.RFW.TOTAL
            if (r1 != r0) goto L_0x002d
            r4 = r2
        L_0x0041:
            r2 = r4
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L_0x0047
            goto L_0x0020
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A03(com.facebookpay.expresscheckout.models.TransactionInfo):com.facebookpay.common.models.CurrencyAmount");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r4 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r10 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r4 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r0 = r4.A06;
        r3 = X.AnonymousClass7TF.A0p(r0);
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r1.hasNext() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r3.add(r1.next().name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r11 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        r11 = com.google.common.collect.ImmutableList.of();
        X.0qQ.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r0 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r0 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r1 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        return new X.SJK(r5, r16, (X.2IV) null, r18, r9, r10, r11, r12, r13, r14, r15, r21, r1, r19, (java.lang.String) null, r2.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.SJK A04(X.2IV r16, com.facebookpay.expresscheckout.models.ECPPaymentRequest r17, com.facebookpay.otc.models.OtcInput r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r13 = r20
            r0 = 0
            r2 = r17
            X.0qQ.A0B(r2, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r4 = r2.A03
            r7 = 0
            if (r4 == 0) goto L_0x0064
            com.facebookpay.common.models.CurrencyAmount r0 = r4.A00
            if (r0 == 0) goto L_0x0064
            java.lang.String r3 = r0.A01
            java.lang.String r1 = r0.A00
            if (r3 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            X.2IV r5 = X.Pxe.A0R()
            java.lang.String r0 = "amount"
            r5.A09(r3, r0)
            java.lang.String r0 = "currency_code"
            r5.A09(r1, r0)
        L_0x0027:
            java.lang.String r12 = r2.A0A
            if (r20 != 0) goto L_0x002f
            java.lang.String r13 = X.Pxi.A0Y()
        L_0x002f:
            java.lang.String r14 = r2.A08
            com.google.common.collect.ImmutableList r9 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r9)
            if (r4 == 0) goto L_0x0040
            X.RFA r0 = r4.A02
            java.lang.String r15 = r0.A00
            if (r15 != 0) goto L_0x0046
        L_0x0040:
            X.RFA r0 = X.RFA.LIVE
            java.lang.String r15 = r0.A00
            if (r4 == 0) goto L_0x006d
        L_0x0046:
            java.util.ArrayList<X.RFh> r0 = r4.A07
            if (r0 == 0) goto L_0x006d
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            X.RFh r0 = (X.C8914RFh) r0
            java.lang.String r0 = r0.A01
            r3.add(r0)
            goto L_0x0052
        L_0x0064:
            r5 = r7
            goto L_0x0027
        L_0x0066:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            if (r10 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r10)
            if (r4 == 0) goto L_0x009b
        L_0x0076:
            java.util.ArrayList<X.REB> r0 = r4.A06
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0080:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r1.next()
            X.REB r0 = (X.REB) r0
            java.lang.String r0 = r0.name()
            r3.add(r0)
            goto L_0x0080
        L_0x0094:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            if (r11 == 0) goto L_0x009b
            goto L_0x00a2
        L_0x009b:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r11)
        L_0x00a2:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r2.A05
            if (r0 == 0) goto L_0x00c2
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x00ac
            java.lang.String r1 = r0.A02
        L_0x00ac:
            java.lang.String r0 = r2.A07
            X.SJK r4 = new X.SJK
            r6 = r16
            r8 = r18
            r18 = r19
            r16 = r21
            r17 = r1
            r19 = r7
            r20 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        L_0x00c2:
            r1 = r7
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A04(X.2IV, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String):X.SJK");
    }

    public static final ECPPaymentConfiguration A0A(QTG qtg, TransactionInfo transactionInfo, String str) {
        RFA rfa;
        CurrencyAmount currencyAmount;
        C8881RDy rDy;
        int ordinal;
        ImmutableList requiredCompactedEnumListField = qtg.getRequiredCompactedEnumListField(1, "supported_container_types", RGB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField);
        ArrayList A0F = A0F(requiredCompactedEnumListField);
        RGA rga = (RGA) qtg.getOptionalEnumField(3, "payment_mode", RGA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (rga == null || (ordinal = rga.ordinal()) == 1 || ordinal != 2) {
            rfa = RFA.LIVE;
        } else {
            rfa = RFA.TEST;
        }
        String A07 = qtg.A07("security_origin");
        ImmutableList requiredCompactedEnumListField2 = qtg.getRequiredCompactedEnumListField(2, "payment_action_types", RG9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField2);
        ArrayList A0G = A0G(requiredCompactedEnumListField2);
        if (transactionInfo != null) {
            currencyAmount = A03(transactionInfo);
        } else {
            currencyAmount = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            int ordinal2 = ((C8914RFh) it.next()).ordinal();
            if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 5 || ordinal2 == 2) {
                rDy = C8881RDy.CARDS;
            } else if (ordinal2 == 4) {
                rDy = C8881RDy.PAYPAL_OTC;
            }
            A1C.add(rDy);
        }
        return new ECPPaymentConfiguration(currencyAmount, (KnownData) null, rfa, str, A07, A0G, A0F, (ArrayList) null, (Map) null, 00k.A0k(A1C));
    }

    public static final LoggingPolicy A0E(QT9 qt9) {
        String A07 = qt9.A07("logging_policy_product");
        if (A07 == null) {
            return null;
        }
        ImmutableList requiredCompactedTreeListField = qt9.getRequiredCompactedTreeListField(1, "client_suppression_policy", QT8.class, -1598475777);
        ArrayList A15 = DbV.A15(requiredCompactedTreeListField);
        Iterator it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            C8933RGb rGb = (C8933RGb) A0V.getOptionalEnumField(2, "suppression_mode", C8933RGb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (rGb != null) {
                A15.add(new ClientSuppressionPolicy(rGb, (C21263XRi) A0V.getOptionalEnumField(1, "payload_field", C21263XRi.A02), A0V.A07(TraceFieldType.AdhocEventName)));
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        00k.A0r(A15, A1C);
        return new LoggingPolicy(A07, A1C);
    }

    public static LinkedHashSet A0H(C250663lr r3) {
        ImmutableList requiredCompactedEnumListField = r3.getRequiredCompactedEnumListField(3, "request_fields", C8928RFw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField);
        return A0J(requiredCompactedEnumListField);
    }

    public static void A0K(0Df r2, ShippingAddress shippingAddress, Object obj) {
        0Df.A00(r2, shippingAddress.A05, "label");
        0Df.A00(r2, shippingAddress.A00, "care_of");
        0Df.A00(r2, shippingAddress.A08, "street_1");
        0Df.A00(r2, shippingAddress.A09, "street_2");
        0Df.A00(r2, shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
        0Df.A00(r2, shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        0Df.A00(r2, shippingAddress.A06, "postal_code");
        0Df.A00(r2, shippingAddress.A02, "country_code");
        0Df.A00(r2, obj, "provide_suggestion");
    }

    public static final void A0L(QT0 qt0, ArrayList arrayList) {
        String str;
        String A08;
        RFB rfb;
        Class<C7683QSy> cls = C7683QSy.class;
        C250663lr optionalTreeField = qt0.getOptionalTreeField(0, "amount", cls, -298466489);
        if (optionalTreeField != null) {
            str = optionalTreeField.getOptionalStringField(0, "currency");
        } else {
            str = null;
        }
        if (str != null) {
            C250663lr optionalTreeField2 = qt0.getOptionalTreeField(0, "amount", cls, -298466489);
            if (optionalTreeField2 == null || (A08 = optionalTreeField2.A08("amount")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            CurrencyAmount currencyAmount = new CurrencyAmount(str, A08);
            C8931RFz rFz = C8931RFz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (qt0.getOptionalEnumField(4, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, rFz) != null) {
                String A0g = Pxi.A0g(qt0, rFz, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 4);
                0qQ.A0B(A0g, 0);
                rfb = (RFB) RFB.A01.get(A0g);
                if (rfb == null) {
                    throw AnonymousClass7TF.A0W("PriceInfoStatus is not found for identifier => ", A0g);
                }
            } else {
                rfb = null;
            }
            String A082 = qt0.A08("label");
            if (A082 != null) {
                String A0g2 = Pxi.A0g(qt0, RG0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 3);
                0qQ.A0B(A0g2, 0);
                RFW rfw = (RFW) RFW.A01.get(A0g2);
                if (rfw != null) {
                    arrayList.add(new PriceInfo(currencyAmount, rfb, rfw, (Integer) null, A082, (String) null, (String) null, (String) null));
                    return;
                }
                throw AnonymousClass7TF.A0W("PriceInfoType is not found for identifier => ", A0g2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final boolean A0N(ECPPaymentRequest eCPPaymentRequest) {
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration == null) {
            return false;
        }
        int i = checkoutConfiguration.A00;
        if (i == 0 || i == 8) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0P(com.facebookpay.expresscheckout.models.TransactionInfo r4) {
        /*
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r4.A08
            r4 = 1
            if (r0 == 0) goto L_0x0023
            java.util.Iterator r3 = r0.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.RFW r1 = r0.A01
            X.RFW r0 = X.RFW.DISCOUNT
            if (r1 == r0) goto L_0x0020
            X.RFW r0 = X.RFW.PRE_TAX_DISCOUNT
            if (r1 != r0) goto L_0x0009
        L_0x0020:
            if (r2 == 0) goto L_0x0023
            return r4
        L_0x0023:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A0P(com.facebookpay.expresscheckout.models.TransactionInfo):boolean");
    }

    public static final QNI A01(C10857RzI rzI) {
        String str;
        2IV A0R = Pxe.A0R();
        A0R.A09("UPDATE_CHECKOUT", "request_type");
        ShippingAddress shippingAddress = rzI.A01;
        if (shippingAddress != null) {
            AnonymousClass0K0 r1 = GraphQlCallInput.A02;
            Boolean A0v = AnonymousClass7TE.A0v();
            0Df A03 = C41845B3m.A03(r1, A0v, "is_default");
            A0K(A03, shippingAddress, A0v);
            Pxf.A1E(A03, A0R, "shipping_address");
            ShippingAddress shippingAddress2 = rzI.A01;
            if (shippingAddress2 != null) {
                str = shippingAddress2.A04;
            } else {
                str = null;
            }
            A0R.A09(str, "shipping_address_id");
        }
        String str2 = rzI.A0A;
        if (str2 != null) {
            2IV A0R2 = Pxe.A0R();
            A0R2.A09(str2, "selected_shipping_option_id");
            A0R2.A09(rzI.A0A, "shipping_option_group_id");
            A0R.A05("shipping_options_snapshot", AnonymousClass7TE.A1I(A0R2));
        }
        String str3 = rzI.A0G;
        if (str3 != null) {
            A0R.A09(str3, "receiver_id");
        }
        String str4 = rzI.A0F;
        if (str4 != null) {
            A0R.A09(str4, "order_id");
        }
        String str5 = rzI.A05;
        if (str5 != null) {
            A0R.A09(str5, "email_id");
        }
        String str6 = rzI.A08;
        if (str6 != null) {
            A0R.A09(str6, "selected_phone_id");
        }
        List list = rzI.A0C;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            2IV A0R3 = Pxe.A0R();
            A0R3.A09(A18, "selected_coupon_code");
            A0R3.A09("PROMO_CODE", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A0r.add(A0R3);
        }
        A0R.A05("incentives_snapshot", A0r);
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str7 = rzI.A04;
        if (str7 != null) {
            A1C.add(str7);
        }
        A1C.addAll(rzI.A0B);
        if (DbT.A1b(A1C)) {
            A0R.A05("credential_ids", A1C);
        }
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        LoggingContext loggingContext = rzI.A0E;
        graphQlCallInput.A07(loggingContext.A02, Py7.A00());
        graphQlCallInput.A07(String.valueOf(loggingContext.A00), "product_id");
        graphQlCallInput.A05("handle_checkout_event_list", AnonymousClass7TE.A1I(A0R));
        graphQlCallInput.A07(Pxi.A0Y(), "client_mutation_id");
        return graphQlCallInput;
    }

    public static final C10797RyJ A09(C7800QXl qXl) {
        C7670QSl qSl;
        QTJ A0E;
        QXO qxo;
        QTG qtg;
        QT7 qt7;
        String A08;
        C250663lr A03;
        QRN A0F = qXl.A0F();
        C13925TlT tlT = null;
        if (A0F != null) {
            qSl = (C7670QSl) A0F.A01(C7670QSl.class, -633919572);
        } else {
            qSl = null;
        }
        if (qSl != null) {
            QXC A0I = qXl.A0I();
            if (A0I == null || (A0E = A0I.A0E()) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            QRL A0E2 = qXl.A0E();
            if (A0E2 == null || (qxo = (QXO) A0E2.A01(QXO.class, -1333706087)) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            QRT A0H = qXl.A0H();
            if (A0H == null || (qtg = (QTG) A0H.A01(QTG.class, 1367251747)) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            C250663lr optionalTreeField = qXl.getOptionalTreeField(8, "link_availability", QRR.class, 2014570284);
            if (optionalTreeField != null) {
                qt7 = (QT7) optionalTreeField.A01(QT7.class, 1435096333);
            } else {
                qt7 = null;
            }
            C250663lr optionalTreeField2 = qXl.getOptionalTreeField(10, "embedded_bloks_apm_buttons", QRQ.class, -803301311);
            if (!(optionalTreeField2 == null || (A03 = optionalTreeField2.A03(QRP.class, "component", 356680169)) == null)) {
                tlT = (C13925TlT) A03.A01(C7801QXm.class, -708877377);
            }
            ImmutableList requiredCompactedTreeListField = qXl.getRequiredCompactedTreeListField(11, "ecp_custom_fields", QRO.class, 516679119);
            ArrayList A15 = DbV.A15(requiredCompactedTreeListField);
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                C8932RGa rGa = (C8932RGa) A0V.getOptionalEnumField(0, "key", C8932RGa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (!(rGa == null || (A08 = A0V.A08(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) == null)) {
                    A15.add(new CheckoutPayloadKeyValue(rGa, A08));
                }
            }
            return new C10797RyJ(qxo, qSl, qt7, qtg, A0E, tlT, AnonymousClass7TE.A1D(A15));
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        r9 = X.C7649QRq.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.TransactionInfo A0C(X.QTR r25) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.QTM> r4 = X.QTM.class
            r2 = 2
            java.lang.String r1 = "price_items"
            r0 = -984404767(0xffffffffc5532ce1, float:-3378.805)
            r5 = r25
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r2, r1, r4, r0)
            java.lang.String r14 = "Required value was null."
            if (r0 == 0) goto L_0x013f
            X.3kO r4 = X.C66580MXl.A0J(r0)
        L_0x001b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0037
            X.3lr r2 = X.C41845B3m.A0V(r4)
            java.lang.Class<X.QT0> r1 = X.QT0.class
            r0 = 754339802(0x2cf64fda, float:7.000606E-12)
            X.3lr r0 = r2.A01(r1, r0)
            X.QT0 r0 = (X.QT0) r0
            X.0qQ.A07(r0)
            A0L(r0, r3)
            goto L_0x001b
        L_0x0037:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.QTO> r6 = X.QTO.class
            r4 = 3
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1127336367(0x4331c9af, float:177.78783)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r4, r1, r6, r0)
            if (r0 == 0) goto L_0x013a
            X.3kO r13 = X.C66580MXl.A0J(r0)
        L_0x0051:
            boolean r0 = r13.hasNext()
            r15 = 0
            if (r0 == 0) goto L_0x00fb
            X.3lr r7 = X.C41845B3m.A0V(r13)
            java.lang.Class<X.QTN> r12 = X.QTN.class
            java.lang.String r11 = "amount"
            r10 = -506729295(0xffffffffe1cbecb1, float:-4.7021806E20)
            X.3lr r0 = r7.A03(r12, r11, r10)
            if (r0 == 0) goto L_0x00f6
            java.lang.Class<X.QRq> r9 = X.C7649QRq.class
            r8 = 98567921(0x5e006f1, float:2.1067409E-35)
            X.3lr r1 = r0.A01(r9, r8)
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "currency"
            java.lang.String r6 = r1.A07(r0)
            if (r6 == 0) goto L_0x00f6
            X.3lr r0 = r7.A03(r12, r11, r10)
            if (r0 == 0) goto L_0x00f1
            X.3lr r0 = r0.A01(r9, r8)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r0.A08(r11)
            if (r0 == 0) goto L_0x00f1
            com.facebookpay.common.models.CurrencyAmount r1 = new com.facebookpay.common.models.CurrencyAmount
            r1.<init>(r6, r0)
            X.RFz r8 = X.C8931RFz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ IllegalArgumentException -> 0x00b9 }
            java.lang.String r6 = "status"
            java.lang.Enum r0 = r7.getOptionalEnumField(r4, r6, r8)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            if (r0 == 0) goto L_0x00b9
            java.lang.String r6 = X.Pxi.A0g(r7, r8, r6, r4)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            java.util.Map r0 = X.RFB.A01     // Catch:{ IllegalArgumentException -> 0x00b9 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            X.RFB r0 = (X.RFB) r0     // Catch:{ IllegalArgumentException -> 0x00b9 }
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            java.lang.String r0 = "PriceInfoStatus is not found for identifier => "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r6)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00b9 }
        L_0x00b8:
            r15 = r0
        L_0x00b9:
            java.lang.String r0 = "label"
            java.lang.String r20 = r7.A08(r0)
            if (r20 == 0) goto L_0x00ec
            r18 = 0
            r6 = 5
            java.lang.String r0 = "quantity"
            int r0 = r7.getCoercedIntField(r6, r0)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "description"
            java.lang.String r22 = r7.A09(r0)
            java.lang.String r0 = "icon_uri"
            java.lang.String r23 = r7.A0B(r0)
            com.facebookpay.expresscheckout.models.PriceInfo r0 = new com.facebookpay.expresscheckout.models.PriceInfo
            r17 = r15
            r21 = r18
            r16 = r1
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r0)
            goto L_0x0051
        L_0x00ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x00f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x00f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x00fb:
            java.lang.Class<X.QTL> r4 = X.QTL.class
            java.lang.String r1 = "currency_amount"
            r0 = -1520792753(0xffffffffa55a8b4f, float:-1.8955685E-16)
            X.3lr r1 = r5.A02(r4, r1, r0)
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "currency"
            java.lang.String r20 = r1.A07(r0)
            if (r20 == 0) goto L_0x0135
            java.lang.String r0 = "country_code"
            java.lang.String r21 = r5.A07(r0)
            X.0sn r1 = X.0sn.A00
            com.facebookpay.expresscheckout.models.PromoCodeList r0 = new com.facebookpay.expresscheckout.models.PromoCodeList
            r0.<init>(r1)
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            com.facebookpay.expresscheckout.models.TransactionInfo r14 = new com.facebookpay.expresscheckout.models.TransactionInfo
            r16 = r15
            r18 = r15
            r19 = r15
            r22 = r15
            r23 = r3
            r24 = r2
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r14
        L_0x0135:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x013a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11432SUd.A0C(X.QTR):com.facebookpay.expresscheckout.models.TransactionInfo");
    }

    public static final C21267XRm A0D(C7798QXj qXj) {
        C21267XRm xRm;
        C21267XRm xRm2 = null;
        if (qXj.A0E() != null) {
            C7709QTy A0E = qXj.A0E();
            if (A0E == null || (xRm2 = (C21267XRm) A0E.getOptionalEnumField(3, "credential_type", C21267XRm.A09)) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (qXj.A0F() != null) {
            C7710QTz A0F = qXj.A0F();
            if (A0F != null && (xRm = (C21267XRm) A0F.getOptionalEnumField(1, "credential_type", C21267XRm.A09)) != null) {
                return xRm;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        return xRm2;
    }

    public static final ArrayList A0F(List list) {
        C8914RFh rFh;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            switch (((RGB) it.next()).ordinal()) {
                case 1:
                    rFh = C8914RFh.BASIC_CARD_V1;
                    break;
                case 3:
                    rFh = C8914RFh.ECOM_TOKEN_V1;
                    break;
                case 4:
                    rFh = C8914RFh.FB_TOKEN_V1;
                    break;
                case 5:
                    rFh = C8914RFh.FIRMLY_TOKEN_V1;
                    break;
                case 6:
                    rFh = C8914RFh.META_PAYMENT_V1;
                    break;
                case 7:
                    rFh = C8914RFh.PAYPAL_OTC_V1;
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Unrecognized GraphQLPaymentContainerTypes");
            }
            A0r.add(rFh);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        00k.A0r(A0r, A1C);
        return A1C;
    }

    public static final ArrayList A0G(List list) {
        REB reb;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((RG9) it.next()).ordinal();
            if (ordinal == 1) {
                reb = REB.AUTH;
            } else if (ordinal == 2) {
                reb = REB.CAPTURE;
            } else if (ordinal == 3) {
                reb = REB.CHARGE;
            } else {
                throw AnonymousClass7TE.A0w("Unrecognized GraphQLPaymentContainerActionType");
            }
            A0r.add(reb);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        00k.A0r(A0r, A1C);
        return A1C;
    }

    public static final LinkedHashSet A0I(List list) {
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            REn A05 = A05((C298525tb) it.next());
            if (A05 != null) {
                A0y.add(A05);
            }
        }
        return A0y;
    }

    public static final LinkedHashSet A0J(List list) {
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8891REi A06 = A06((C8928RFw) it.next());
            if (A06 != null) {
                A0y.add(A06);
            }
        }
        return A0y;
    }
}
