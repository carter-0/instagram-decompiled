package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainer;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public abstract class SQ3 {
    public static final CurrencyAmount A00(PaymentCurrencyAmount paymentCurrencyAmount) {
        0qQ.A0B(paymentCurrencyAmount, 0);
        return new CurrencyAmount(paymentCurrencyAmount.currency, paymentCurrencyAmount.value);
    }

    public static final CheckoutConfiguration A01(C8942RGk rGk, C8942RGk rGk2, PaymentOptions paymentOptions, Boolean bool, Boolean bool2, Boolean bool3, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str2;
        Boolean bool4;
        Integer num;
        PaymentOptions paymentOptions2 = paymentOptions;
        0qQ.A0B(paymentOptions2, 0);
        LinkedHashSet A0y = DbS.A0y();
        boolean A01 = C11431STx.A01();
        if (paymentOptions2.requestShipping || ((A01 && 0qQ.A0K(paymentOptions2.shippingType, "PICKUP")) || 0qQ.A0K(paymentOptions2.fulfillmentType, "PICKUP"))) {
            A0y.add(REn.UX_FULFILLMENT_OPTIONS);
        }
        if (paymentOptions2.requestShipping) {
            A0y.add(REn.UX_SHIPPING_ADDRESS);
        }
        if (paymentOptions2.allowOfferCodes) {
            A0y.add(REn.UX_INCENTIVES);
        }
        LinkedHashSet A0y2 = DbS.A0y();
        A0y2.add(C8891REi.REQUEST_BILLING_ADDRESS);
        if (paymentOptions2.requestPayerEmail) {
            A0y2.add(C8891REi.REQUEST_PAYER_EMAIL);
        }
        if (paymentOptions2.requestPayerName) {
            A0y2.add(C8891REi.REQUEST_PAYER_NAME);
        }
        if (paymentOptions2.requestPayerPhone) {
            A0y2.add(C8891REi.REQUEST_PAYER_PHONE);
        }
        if (0qQ.A0K(paymentOptions2.requestPickupName, true)) {
            A0y2.add(C8891REi.REQUEST_PICKUP_NAME);
        }
        if (0qQ.A0K(paymentOptions2.requestPickupEmail, true)) {
            A0y2.add(C8891REi.REQUEST_PICKUP_EMAIL);
        }
        if (0qQ.A0K(paymentOptions2.requestPickupPhone, true)) {
            A0y2.add(C8891REi.REQUEST_PICKUP_PHONE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(A0y);
        0qQ.A07(unmodifiableSet);
        Set unmodifiableSet2 = Collections.unmodifiableSet(A0y2);
        0qQ.A07(unmodifiableSet2);
        if (paymentOptions2.requestPayerEmail) {
            str2 = paymentOptions2.marketingPrivacyPolicyUrl;
        } else {
            str2 = null;
        }
        String str3 = paymentOptions2.marketingPrivacyPolicyUrl;
        if (str3 == null || str3.length() == 0) {
            bool4 = null;
        } else {
            bool4 = paymentOptions2.defaultMarketingEmailOptOut;
        }
        String str4 = paymentOptions2.fulfillmentType;
        if (str4 != null) {
            Locale locale = Locale.ROOT;
            0qQ.A08(locale);
            num = C11084S9e.A00(Pxf.A0n(locale, str4));
        } else {
            num = null;
        }
        return new CheckoutConfiguration((APMConfiguration) null, rGk, rGk2, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(A01), bool4, Boolean.valueOf(z), bool, bool2, bool3, num, (String) null, str, str2, unmodifiableSet, unmodifiableSet2, 1, true, false, z5);
    }

    public static final PaymentResponseContent A02(ECPPaymentResponseParams eCPPaymentResponseParams, PaymentRequest paymentRequest) {
        String str;
        PaymentMode paymentMode;
        PaymentContainerType paymentContainerType;
        W3CShippingAddress w3CShippingAddress;
        W3CShippingAddress w3CShippingAddress2;
        String str2;
        String str3;
        PaymentRequestContent paymentRequestContent;
        PaymentOptions paymentOptions;
        ShippingAddress shippingAddress;
        PaymentRequestContent paymentRequestContent2;
        PaymentConfiguration paymentConfiguration;
        ECPPaymentResponseParams eCPPaymentResponseParams2 = eCPPaymentResponseParams;
        0qQ.A0B(eCPPaymentResponseParams2, 0);
        PaymentRequest paymentRequest2 = paymentRequest;
        if (paymentRequest == null || (paymentRequestContent2 = paymentRequest2.content) == null || (paymentConfiguration = paymentRequestContent2.paymentConfiguration) == null || (str = paymentConfiguration.requestId) == null) {
            str = eCPPaymentResponseParams2.A0Q;
        }
        String str4 = eCPPaymentResponseParams2.A0A;
        String str5 = eCPPaymentResponseParams2.A0J;
        Locale locale = Locale.ROOT;
        0qQ.A08(locale);
        if ("LIVE".equals(Pxf.A0n(locale, str5))) {
            paymentMode = PaymentMode.LIVE;
        } else {
            paymentMode = PaymentMode.TEST;
        }
        String str6 = eCPPaymentResponseParams2.A0I;
        String str7 = eCPPaymentResponseParams2.A0C;
        if (str7 != null) {
            paymentContainerType = PaymentContainerType.Companion.fromString(str7);
        } else {
            paymentContainerType = null;
        }
        PaymentContainer paymentContainer = new PaymentContainer(str4, paymentMode, str6, paymentContainerType);
        String str8 = eCPPaymentResponseParams2.A09;
        String str9 = eCPPaymentResponseParams2.A0G;
        String str10 = eCPPaymentResponseParams2.A0F;
        String str11 = eCPPaymentResponseParams2.A0H;
        ShippingAddress shippingAddress2 = eCPPaymentResponseParams2.A07;
        if (shippingAddress2 != null) {
            w3CShippingAddress = C11299SKj.A00(shippingAddress2);
        } else {
            w3CShippingAddress = null;
        }
        if (paymentRequest == null || (paymentRequestContent = paymentRequest2.content) == null || (paymentOptions = paymentRequestContent.paymentOptions) == null || !paymentOptions.requestBillingAddress || (shippingAddress = eCPPaymentResponseParams2.A06) == null) {
            w3CShippingAddress2 = null;
        } else {
            w3CShippingAddress2 = C11299SKj.A00(shippingAddress);
        }
        ShippingOption shippingOption = eCPPaymentResponseParams2.A02;
        if (shippingOption != null) {
            str2 = shippingOption.A03;
        } else {
            str2 = null;
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams2.A01;
        if (fulfillmentOption != null) {
            str3 = fulfillmentOption.A00();
        } else {
            str3 = null;
        }
        return new PaymentResponseContent(str, paymentContainer, str8, str9, str10, str11, w3CShippingAddress, w3CShippingAddress2, str2, str3, eCPPaymentResponseParams2.A0L, eCPPaymentResponseParams2.A0K, eCPPaymentResponseParams2.A0N, (ArrayList) null, Boolean.valueOf(eCPPaymentResponseParams2.A0T));
    }

    public static final ArrayList A03(PaymentRequestContent paymentRequestContent, 0eP... r8) {
        String name;
        ArrayList A0q = AnonymousClass7TF.A0q(paymentRequestContent, 0);
        int i = 0;
        while (true) {
            if (i < 2) {
                if (0qQ.A0K(r8[i].A00, "PROCESSING_MODE")) {
                    break;
                }
                i++;
            } else {
                PaymentMode paymentMode = paymentRequestContent.paymentConfiguration.mode;
                if (paymentMode != null && (name = paymentMode.name()) != null) {
                    Pxi.A1L("PROCESSING_MODE", name, A0q);
                }
            }
        }
        Pxi.A1L("CONTAINER_CONTEXT", paymentRequestContent.paymentConfiguration.containerContext, A0q);
        String str = paymentRequestContent.paymentConfiguration.merchantName;
        if (str != null) {
            Pxi.A1L("MERCHANT_NAME", str, A0q);
        }
        PaymentConfiguration paymentConfiguration = paymentRequestContent.paymentConfiguration;
        0qQ.A0B(paymentConfiguration, 0);
        String str2 = new PaymentReceiverInfo((String) null, paymentConfiguration.merchantName, (String) null, Pxe.A12(Locale.ROOT, "%s::%s", Pxf.A1X(paymentConfiguration.partnerId, paymentConfiguration.partnerMerchantId, 2))).A00;
        if (str2 != null) {
            Pxi.A1L("CLIENT_RECEIVER_ID", str2, A0q);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i2 = 0;
        do {
            0eP r0 = r8[i2];
            String str3 = (String) r0.A01;
            if (str3 != null) {
                Pxi.A1L((String) r0.A00, str3, A1C);
            }
            i2++;
        } while (i2 < 2);
        018.A18(A0q, A1C.toArray(new CheckoutSetupKeyValue[0]));
        return A0q;
    }
}
