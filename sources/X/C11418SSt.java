package X;

import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SSt  reason: case insensitive filesystem */
public final class C11418SSt {
    public static final LoggingPolicy A00 = new LoggingPolicy("payments_offsite_partners", AnonymousClass7TE.A1C());
    public static final C11418SSt A01 = new Object();
    public static final Map A02 = Pxh.A0v(AnonymousClass7TE.A1L("USER_HAS_CARD", C8892REj.USER_INFO_PAYMENT_METHODS_BASIC_CARDS), AnonymousClass7TE.A1L("USER_HAS_TOKENIZED_CARD", C8892REj.USER_INFO_PAYMENT_METHODS_TOKENIZED_CARDS), AnonymousClass7TE.A1L("USER_HAS_SHIPPING_ADDRESS", C8892REj.USER_INFO_PAYER_ADDRESS), AnonymousClass7TE.A1L("USER_HAS_EMAIL", C8892REj.USER_INFO_PAYER_EMAIL), AnonymousClass7TE.A1L("USER_HAS_PHONE", C8892REj.USER_INFO_PAYER_PHONE));
    public static final Set A03 = C51967G9n.A0t(new String[]{"USER_HAS_CARD", "USER_HAS_TOKENIZED_CARD", "USER_HAS_EMAIL", "USER_HAS_PHONE", "USER_HAS_SHIPPING_ADDRESS"}, 0);

    public static final LoggingContext A00(String str, String str2) {
        0qQ.A0B(str, 0);
        long parseLong = Long.parseLong(str2);
        LoggingPolicy loggingPolicy = A00;
        Set set = 0sl.A00;
        return new LoggingContext(loggingPolicy, str, set, set, parseLong, false);
    }

    public static final LinkedHashMap A01(C10857RzI rzI, String str, String str2, Map map) {
        0qQ.A0B(map, 3);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.putAll(map);
        Pxj.A1U(A1H, str2, str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (rzI.A01 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        }
        if (rzI.A00 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
        }
        if (rzI.A0A != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
        }
        if (AnonymousClass7TE.A1b(rzI.A0C)) {
            A1C.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        if (rzI.A06 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
        }
        if (rzI.A09 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
        }
        A1H.put("CHANGED_FIELDS", A1C);
        return A1H;
    }

    public static final void A03(C8902REu rEu, Map map) {
        0qQ.A0B(map, 1);
        AnonymousClass2E0.A01().A0B.Cgl(rEu.name(), map);
    }

    public final LinkedHashMap A04(ECPPaymentResponseParams eCPPaymentResponseParams, String str, String str2, String str3) {
        0qQ.A0B(eCPPaymentResponseParams, 0);
        0eP A1L = AnonymousClass7TE.A1L("logging_context", A00(str2, str));
        List<ECPOffer> list = eCPPaymentResponseParams.A0S;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (ECPOffer eCPOffer : list) {
            A0r.add(eCPOffer.A00);
        }
        LinkedHashMap A07 = 0Yt.A07(AnonymousClass7TH.A0h("VIEW_NAME", "merchant_validation", A1L, AnonymousClass7TE.A1L("APPLIED_DISCOUNTS", A0r), AnonymousClass7TE.A1L("CONTAINER_IDS", AnonymousClass7TE.A1I(eCPPaymentResponseParams.A0B))));
        Pxi.A1I(eCPPaymentResponseParams.A04, A07);
        Long l = eCPPaymentResponseParams.A08;
        if (l != null) {
            A07.put("CREDENTIAL_ID", l);
        }
        if (str3 != null) {
            A07.put(AnonymousClass000.A00(109), str3);
        }
        return A07;
    }

    public static final LinkedHashMap A02(PaymentRequest paymentRequest, String str, String str2) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Pxj.A1U(A1H, str2, str);
        A1H.put("PARTNER_MERCHANT_ID", paymentRequest.content.paymentConfiguration.partnerMerchantId);
        A1H.put("PARTNER_ID", paymentRequest.content.paymentConfiguration.partnerId);
        A1H.put("MERCHANT_REQUEST_ID", paymentRequest.content.paymentConfiguration.requestId);
        return A1H;
    }
}
