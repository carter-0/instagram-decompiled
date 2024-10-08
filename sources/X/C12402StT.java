package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PickupFulfillmentOption;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentDetailsChangedContent;
import com.facebookpay.offsite.models.message.PaymentDetailsChangedEvent;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdate;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedResponse;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StT  reason: case insensitive filesystem */
public final class C12402StT implements ECPHandler {
    public final /* synthetic */ CheckoutHandler A00;

    public final void CIH(SUj sUj) {
        C8902REu rEu;
        String message;
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        CheckoutHandler checkoutHandler = this.A00;
        A1H.putAll(checkoutHandler.A0F);
        A1H.put("REQUEST_TIMESTAMP", C51968G9o.A0u());
        ECPPaymentResponseParams eCPPaymentResponseParams = CheckoutHandler.A00(checkoutHandler).A00;
        if (!(eCPPaymentResponseParams == null || (str = eCPPaymentResponseParams.A0C) == null)) {
            A1H.put("CONTAINER_TYPE", str);
        }
        if (SUj.A0V(sUj)) {
            ECPPaymentResponseParams eCPPaymentResponseParams2 = (ECPPaymentResponseParams) sUj.A01;
            if (eCPPaymentResponseParams2 != null) {
                Map map = null;
                PaymentResponseContent A02 = SQ3.A02(eCPPaymentResponseParams2, (PaymentRequest) null);
                AnonymousClass2Fj r4 = checkoutHandler.A0P;
                String valueOf = String.valueOf(C12435SuM.A09.getAndIncrement());
                String str2 = checkoutHandler.A0B;
                if (str2 == null) {
                    str2 = "";
                }
                PaymentResponse paymentResponse = new PaymentResponse(valueOf, str2, A02, System.currentTimeMillis(), (String) checkoutHandler.A0V.get(), MessageType$Companion.PAYMENT_RESPONSE, (PaymentError) null);
                String str3 = eCPPaymentResponseParams2.A00;
                if (str3 != null) {
                    map = AnonymousClass7TF.A0w("EXTERNAL_CONFIRMATION_URL", str3);
                }
                r4.A0B(new PaymentResponseWithAdditionalData(paymentResponse, map));
                checkoutHandler.A0H(C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS, A1H);
                CheckoutHandler.A04(checkoutHandler);
                return;
            }
            rEu = C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL;
            JTP.A1R("RETRYABLE", A1H, false);
            A1H.put("ERROR_CODE", "PAYPAL_AUTHORIZATION_ERROR");
        } else if (SUj.A0S(sUj)) {
            JTP.A1R("RETRYABLE", A1H, true);
            A1H.put("ERROR_CODE", "PAYPAL_AUTHORIZATION_ERROR");
            Throwable th = sUj.A02;
            if (!(th == null || (message = th.getMessage()) == null)) {
                LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                Locale locale = Locale.ROOT;
                0qQ.A08(locale);
                A1H2.put(DbT.A12(locale, "ERROR_MESSAGE"), message);
                A1H.put("EVENT_EXTRA", A1H2);
            }
            rEu = C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL;
        } else {
            return;
        }
        checkoutHandler.A0H(rEu, A1H);
    }

    public final void CIW() {
    }

    public final AnonymousClass2Fj E2B() {
        return SUj.A00((Object) null);
    }

    public final void ELf(C10857RzI rzI) {
        TransactionInfo transactionInfo;
        C10857RzI rzI2 = rzI;
        0qQ.A0B(rzI2, 0);
        CheckoutHandler checkoutHandler = this.A00;
        String A0C = checkoutHandler.A0C((PaymentRequestContent) null);
        checkoutHandler.A0H(C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_INIT, C11418SSt.A01(rzI2, CheckoutHandler.A02(checkoutHandler), A0C, checkoutHandler.A0F));
        AtomicReference atomicReference = checkoutHandler.A0W;
        if (!0qQ.A0K(atomicReference.get(), "0")) {
            checkoutHandler.A0H(C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL, C11418SSt.A01(rzI2, CheckoutHandler.A02(checkoutHandler), A0C, checkoutHandler.A0F));
            return;
        }
        AnonymousClass2Fj r1 = checkoutHandler.A0R;
        SUj A0W = Pxe.A0W(r1);
        if (A0W != null && (transactionInfo = (TransactionInfo) A0W.A01) != null) {
            SUj.A0L(r1, transactionInfo);
            String valueOf = String.valueOf(C12435SuM.A09.getAndIncrement());
            long currentTimeMillis = System.currentTimeMillis();
            List Bb2 = checkoutHandler.A0A().Bb2(rzI2);
            if (AnonymousClass7TE.A1b(Bb2)) {
                S7g A002 = CheckoutHandler.A00(checkoutHandler);
                ShippingAddress shippingAddress = rzI2.A01;
                ShippingAddress shippingAddress2 = rzI2.A00;
                String str = rzI2.A0A;
                List list = rzI2.A0C;
                String str2 = rzI2.A06;
                String str3 = rzI2.A09;
                A002.A01 = C11090S9p.A01(transactionInfo, shippingAddress, shippingAddress2, (String) null, str, str2, str3, rzI2.A05, rzI2.A08, list);
                atomicReference.set(valueOf);
                if (checkoutHandler.A0A().B1I()) {
                    SQB.A01((AnonymousClass07Z) null, ((C10883Rzj) checkoutHandler.A0X.getValue()).A00(C11432SUd.A01(rzI2)), new C11648Sdq(9, (Object) checkoutHandler, (Object) rzI2));
                    return;
                }
                AnonymousClass2Fj r2 = checkoutHandler.A0N;
                ShippingAddress shippingAddress3 = rzI2.A01;
                String BkQ = checkoutHandler.A0A().BkQ();
                String str4 = rzI2.A0A;
                List list2 = rzI2.A0C;
                r2.A0B(new PaymentDetailsChangedEvent(valueOf, new PaymentDetailsChangedContent(C11090S9p.A01(transactionInfo, shippingAddress3, shippingAddress2, BkQ, str4, rzI2.A06, rzI2.A09, rzI2.A05, rzI2.A08, list2), Bb2), currentTimeMillis, (String) null, MessageType$Companion.PAYMENT_DETAILS_CHANGED, (PaymentError) null));
                return;
            }
            checkoutHandler.A0I(new PaymentDetailsUpdatedResponse(valueOf, new PaymentDetailsUpdate((PaymentDetailsUpdatedError) null, (PaymentDetailsUpdatedError) null, CheckoutHandler.A00(checkoutHandler).A01, (List) null), currentTimeMillis, (String) null, MessageType$Companion.PAYMENT_DETAILS_UPDATED, (PaymentError) null), true);
        }
    }

    public final void ERR(C13219TQk tQk) {
    }

    public C12402StT(CheckoutHandler checkoutHandler) {
        this.A00 = checkoutHandler;
    }

    public final void CIX(boolean z) {
        CheckoutHandler checkoutHandler = this.A00;
        if (checkoutHandler.A0K) {
            long currentTimeMillis = System.currentTimeMillis();
            checkoutHandler.A0U.A01(new S1K(currentTimeMillis, (Integer) null), currentTimeMillis);
        }
        if (checkoutHandler.A03 != null) {
            checkoutHandler.A0A().AZu().A01();
        }
        SUj.A0L(checkoutHandler.A0R, (Object) null);
        checkoutHandler.A0Q.A0B((Object) null);
        checkoutHandler.A0N.A0B((Object) null);
        checkoutHandler.A0P.A0B((Object) null);
        checkoutHandler.A09 = null;
        checkoutHandler.A0F();
    }

    public final AnonymousClass2Fj CJ4(ECPPaymentResponseParams eCPPaymentResponseParams) {
        0Df r8;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        C11023S6a s6a;
        Date date;
        Integer num;
        Date date2;
        Integer num2;
        String str4;
        CheckoutHandler checkoutHandler = this.A00;
        AnonymousClass2Fj r17 = checkoutHandler.A0Q;
        if (!SUj.A0R(r17)) {
            ECPPaymentResponseParams eCPPaymentResponseParams2 = eCPPaymentResponseParams;
            checkoutHandler.A08 = eCPPaymentResponseParams2.A0D;
            String str5 = null;
            SUj.A0L(r17, (Object) null);
            AnonymousClass0K0 r15 = GraphQlCallInput.A02;
            0Df r11 = null;
            String str6 = eCPPaymentResponseParams2.A0K;
            if (str6 != null) {
                r11 = r15.A02();
                0Df.A00(r11, str6, "pickup_person_email");
            }
            String str7 = eCPPaymentResponseParams2.A0N;
            if (str7 != null) {
                0Df A03 = C41845B3m.A03(r15, str7, "raw_phone_number");
                try {
                    PhoneNumberUtil phoneNumberUtil = checkoutHandler.A00;
                    if (phoneNumberUtil == null || (str4 = phoneNumberUtil.A0H(phoneNumberUtil.A0F(str7, (String) null))) == null) {
                        str4 = Pxh.A0w().getCountry();
                    }
                } catch (C231962sh unused) {
                    str4 = Pxh.A0w().getCountry();
                }
                0Df.A00(A03, str4, "country_code");
                if (r11 == null) {
                    r11 = r15.A02();
                }
                r11.A0E(A03, "pickup_person_phone");
            }
            String str8 = eCPPaymentResponseParams2.A0L;
            if (str8 != null) {
                if (r11 == null) {
                    r11 = r15.A02();
                }
                0Df.A00(r11, str8, "pickup_person_name");
            }
            String str9 = eCPPaymentResponseParams2.A0M;
            if (str9 != null) {
                if (r11 == null) {
                    r11 = r15.A02();
                }
                0Df.A00(r11, str9, "pickup_notes");
            }
            FulfillmentOption fulfillmentOption = eCPPaymentResponseParams2.A01;
            if (fulfillmentOption != null) {
                boolean z = fulfillmentOption instanceof PickupFulfillmentOption;
                if (z) {
                    ShippingAddress shippingAddress = ((PickupFulfillmentOption) fulfillmentOption).A02;
                    0Df A032 = C41845B3m.A03(r15, shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
                    0Df.A00(A032, shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    0Df.A00(A032, shippingAddress.A02, "country_code");
                    0Df.A00(A032, shippingAddress.A08, "street");
                    0Df.A00(A032, shippingAddress.A09, "street2");
                    0Df.A00(A032, shippingAddress.A06, ServerW3CShippingAddressConstants.POSTAL_CODE);
                    if (r11 == null) {
                        r11 = r15.A02();
                    }
                    r11.A0E(A032, "pickup_address");
                }
                if (z) {
                    date = ((PickupFulfillmentOption) fulfillmentOption).A06;
                } else {
                    date = fulfillmentOption.A03;
                }
                if (date != null) {
                    num = Integer.valueOf((int) date.getTime());
                } else {
                    num = null;
                }
                r8 = r15.A02();
                0Df.A00(r8, num, "fulfillment_start_date_time");
                if (z) {
                    date2 = ((PickupFulfillmentOption) fulfillmentOption).A05;
                } else {
                    date2 = fulfillmentOption.A02;
                }
                if (date2 != null) {
                    num2 = Integer.valueOf((int) date2.getTime());
                } else {
                    num2 = null;
                }
                0Df.A00(r8, num2, "fulfillment_end_date_time");
                if (z) {
                    0Df.A00(r8, "PICKUP", "fulfillment_type");
                } else {
                    0Df.A00(r8, "SHIPPING", "fulfillment_type");
                }
            } else {
                r8 = null;
            }
            String str10 = eCPPaymentResponseParams2.A0E;
            String str11 = eCPPaymentResponseParams2.A0A;
            TransactionInfo transactionInfo = eCPPaymentResponseParams2.A03;
            CurrencyAmount A033 = C11432SUd.A03(transactionInfo);
            2IV A0R = Pxe.A0R();
            A0R.A09(A033.A01, "amount");
            A0R.A09(A033.A00, "currency_code");
            String str12 = eCPPaymentResponseParams2.A0H;
            String str13 = eCPPaymentResponseParams2.A0F;
            String str14 = eCPPaymentResponseParams2.A0G;
            ShippingAddress shippingAddress2 = eCPPaymentResponseParams2.A07;
            if (shippingAddress2 != null) {
                str5 = shippingAddress2.A04;
            }
            List<ECPOffer> list = eCPPaymentResponseParams2.A0S;
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            for (ECPOffer next : list) {
                2IV A0R2 = Pxe.A0R();
                String str15 = next.A01;
                String str16 = next.A00;
                if (str15 == str16) {
                    str15 = null;
                }
                A0R2.A09(str15, "offer_id");
                A0R2.A09(str16, "offer_code");
                A0p.add(A0R2);
            }
            ArrayList<PriceInfo> arrayList2 = transactionInfo.A08;
            if (arrayList2 != null) {
                ArrayList<PriceInfo> A1C = AnonymousClass7TE.A1C();
                Iterator<PriceInfo> it = arrayList2.iterator();
                while (it.hasNext()) {
                    PriceInfo next2 = it.next();
                    RFW rfw = next2.A01;
                    if (rfw == RFW.DISCOUNT || rfw == RFW.PRE_TAX_DISCOUNT) {
                        A1C.add(next2);
                    }
                }
                arrayList = AnonymousClass7TF.A0p(A1C);
                for (PriceInfo priceInfo : A1C) {
                    2IV A0R3 = Pxe.A0R();
                    2IV A0R4 = Pxe.A0R();
                    CurrencyAmount currencyAmount = priceInfo.A00;
                    A0R4.A09(currencyAmount.A01, "amount");
                    A0R4.A09(currencyAmount.A00, "currency_code");
                    A0R3.A06(A0R4, "amount");
                    A0R3.A09(priceInfo.A04, DialogModule.KEY_TITLE);
                    arrayList.add(A0R3);
                }
            } else {
                arrayList = null;
            }
            String str17 = checkoutHandler.A0A;
            String str18 = checkoutHandler.A06;
            String str19 = checkoutHandler.A07;
            if (CheckoutHandler.A08(checkoutHandler)) {
                str = checkoutHandler.A05;
                if (str == null) {
                    0qQ.A0F("availabilityRequestDomain");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                str = null;
            }
            if (!CheckoutHandler.A08(checkoutHandler) || (s6a = CheckoutHandler.A00(checkoutHandler).A04) == null) {
                str2 = null;
            } else {
                str2 = s6a.A01;
            }
            if (CheckoutHandler.A08(checkoutHandler)) {
                str3 = CheckoutHandler.A02(checkoutHandler);
            } else {
                str3 = null;
            }
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A07(str10, "order_id");
            graphQlCallInput.A07(str11, "typed_container_id");
            graphQlCallInput.A06(A0R, "total_amount");
            graphQlCallInput.A07(str12, "buyer_phone_number");
            graphQlCallInput.A07(str13, "buyer_email");
            graphQlCallInput.A07(str14, "buyer_name");
            graphQlCallInput.A07(str5, "shipping_address_id");
            graphQlCallInput.A05("discounts", A0p);
            graphQlCallInput.A05("discount_lines", arrayList);
            graphQlCallInput.A07(str17, "pixel_id");
            graphQlCallInput.A07(str18, "event_id");
            graphQlCallInput.A07(str19, "user_external_id");
            graphQlCallInput.A07(str, "event_source_url");
            graphQlCallInput.A07(str2, "ad_id");
            graphQlCallInput.A07(str3, "payment_product_id");
            0Df A02 = graphQlCallInput.A02();
            if (r8 == null) {
                r8 = r15.A02();
            }
            A02.A0E(r8, "fulfillment_info");
            0Df A022 = graphQlCallInput.A02();
            if (r11 == null) {
                r11 = r15.A02();
            }
            A022.A0E(r11, "pickup_info");
            AnonymousClass7TE.A1Z(new MHP((Object) checkoutHandler, (Object) graphQlCallInput, (Object) eCPPaymentResponseParams2, (AnonymousClass4D7) null, 47), checkoutHandler.A0Z);
            return r17;
        }
        throw AnonymousClass7TE.A0z("Update order mutation is already in progress. Cannot handle new payment responses from ECP concurrently");
    }

    public final void Ep6(SUj sUj) {
        CheckoutHandler checkoutHandler = this.A00;
        AnonymousClass2Fj r1 = checkoutHandler.A0R;
        SUj A0W = Pxe.A0W(r1);
        PaymentDetails paymentDetails = null;
        if (A0W == null || A0W.A01 == null) {
            S7g A002 = CheckoutHandler.A00(checkoutHandler);
            TransactionInfo transactionInfo = (TransactionInfo) sUj.A01;
            if (transactionInfo != null) {
                paymentDetails = C11090S9p.A01(transactionInfo, (ShippingAddress) null, (ShippingAddress) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null);
            }
            A002.A01 = paymentDetails;
            r1.A0B(sUj);
        }
    }

    public final AnonymousClass2Fj FHY() {
        return this.A00.A0R;
    }

    public final AnonymousClass2Fj AH8() {
        return JTO.A0K();
    }

    public final void CIS(C10749RxT rxT, LoggingContext loggingContext, Integer num) {
        Map A0w;
        Map map;
        String str;
        String str2;
        CheckoutHandler checkoutHandler;
        switch (num.intValue()) {
            case 0:
                checkoutHandler = this.A00;
                if (checkoutHandler.A0K) {
                    long currentTimeMillis = System.currentTimeMillis();
                    checkoutHandler.A0U.A01(new S1K(currentTimeMillis, AnonymousClass05K.A00), currentTimeMillis);
                }
                Object obj = checkoutHandler.A0V.get();
                0qQ.A07(obj);
                str2 = (String) obj;
                map = null;
                str = "ABORTED";
                break;
            case 1:
                checkoutHandler = this.A00;
                Object obj2 = checkoutHandler.A0V.get();
                0qQ.A07(obj2);
                str2 = (String) obj2;
                map = null;
                str = "INTERNAL_ERROR";
                break;
            case 2:
                checkoutHandler = this.A00;
                Object obj3 = checkoutHandler.A0V.get();
                0qQ.A07(obj3);
                str2 = (String) obj3;
                map = null;
                str = "CHECKOUT_ERROR_RISK";
                break;
            case 3:
                break;
            case 4:
                CheckoutHandler checkoutHandler2 = this.A00;
                Object obj4 = checkoutHandler2.A0V.get();
                0qQ.A07(obj4);
                CheckoutHandler.A05(checkoutHandler2, (String) obj4, "DISMISSED_FOR_SESSION", (Map) null, (Map) null, (Map) null);
                if (checkoutHandler2.A03 != null) {
                    checkoutHandler2.A0A().AZu().A01();
                    break;
                }
                break;
            case 5:
                CheckoutHandler checkoutHandler3 = this.A00;
                String A002 = C9649ReT.A00(((C8122QhE) checkoutHandler3).A00);
                if (A002 == null) {
                    A0w = null;
                } else {
                    A0w = AnonymousClass7TF.A0w("UNINJECT_MERCHANT_JS", A002);
                }
                if (checkoutHandler3.A03 != null) {
                    checkoutHandler3.A0A().AZu().A01();
                }
                Object obj5 = checkoutHandler3.A0V.get();
                0qQ.A07(obj5);
                CheckoutHandler.A05(checkoutHandler3, (String) obj5, "CHECKOUT_UNAVAILABLE", (Map) null, (Map) null, A0w);
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        CheckoutHandler.A05(checkoutHandler, str2, str, map, map, map);
        CheckoutHandler checkoutHandler4 = this.A00;
        SUj.A0L(checkoutHandler4.A0R, (Object) null);
        checkoutHandler4.A0Q.A0B((Object) null);
        checkoutHandler4.A0N.A0B((Object) null);
        checkoutHandler4.A0P.A0B((Object) null);
        checkoutHandler4.A09 = null;
        checkoutHandler4.A0F();
    }
}
