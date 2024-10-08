package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentItem;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.UriUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TGl  reason: case insensitive filesystem */
public final class C12978TGl implements Runnable {
    public final /* synthetic */ C12435SuM A00;
    public final /* synthetic */ PaymentRequest A01;

    public C12978TGl(C12435SuM suM, PaymentRequest paymentRequest) {
        this.A00 = suM;
        this.A01 = paymentRequest;
    }

    public final void run() {
        RFA rfa;
        PaymentCurrencyAmount paymentCurrencyAmount;
        String name;
        C12435SuM suM = this.A00;
        C11023S6a A002 = suM.A00();
        if (A002 != null) {
            PaymentRequest paymentRequest = this.A01;
            CheckoutHandler checkoutHandler = (CheckoutHandler) suM.A07.getValue();
            PaymentRequestContent paymentRequestContent = paymentRequest.content;
            AnonymousClass2Fj A0K = JTO.A0K();
            if (!A002.A06 || checkoutHandler.A03 == null || !0qQ.A0K(CheckoutHandler.A02(checkoutHandler), C9650ReU.A00(paymentRequestContent))) {
                CheckoutHandler.A03(A0K, checkoutHandler, MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, paymentRequest.msgId);
            } else {
                String A0C = checkoutHandler.A0C(paymentRequest.content);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                LinkedHashMap A0D = checkoutHandler.A0D(paymentRequest, A002, A0C);
                A0D.put("INITIATOR", AvailabilityInitiator$Companion.INITIATOR_JS_SDK);
                checkoutHandler.A0H(C8902REu.CLIENT_LOAD_OFFSITEAVAILABILITY_INIT, A0D);
                String str = A002.A03;
                if (str != null) {
                    A1H.put("sdkFeatureFlags", str);
                }
                CheckoutHandler.A00(checkoutHandler).A04 = A002;
                UriUtils uriUtils = UriUtils.INSTANCE;
                String uriAuthorityAndPath = uriUtils.toUriAuthorityAndPath(A002.A04);
                0qQ.A0B(uriAuthorityAndPath, 0);
                checkoutHandler.A05 = uriAuthorityAndPath;
                checkoutHandler.A0E = str;
                checkoutHandler.A0V.set("0");
                PaymentRequestContent paymentRequestContent2 = paymentRequest.content;
                PaymentConfiguration paymentConfiguration = paymentRequestContent2.paymentConfiguration;
                checkoutHandler.A0A = paymentConfiguration.pixelId;
                checkoutHandler.A06 = paymentConfiguration.eventId;
                checkoutHandler.A07 = paymentConfiguration.externalId;
                String str2 = paymentRequest.msgId;
                String str3 = checkoutHandler.A05;
                if (str3 != null) {
                    LoggingPolicy loggingPolicy = C11418SSt.A00;
                    boolean BbL = checkoutHandler.A0A().BbL();
                    boolean z = checkoutHandler.A0a;
                    C51972G9s.A1C(str2, loggingPolicy);
                    PaymentConfiguration paymentConfiguration2 = paymentRequestContent2.paymentConfiguration;
                    0qQ.A0B(paymentConfiguration2, 0);
                    PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo(Pxe.A12(Locale.ROOT, "%s::%s", Pxf.A1X(paymentConfiguration2.partnerId, paymentConfiguration2.partnerMerchantId, 2)), paymentConfiguration2.merchantName, (String) null, (String) null);
                    String A003 = C9650ReU.A00(paymentRequestContent2);
                    String uriAuthorityAndPath2 = uriUtils.toUriAuthorityAndPath(str3);
                    Set A0y = JTP.A0y(REn.UX_SHIPPING_ADDRESS);
                    Set A0t = C51967G9n.A0t(new C8891REi[]{C8891REi.REQUEST_PAYER_EMAIL, C8891REi.REQUEST_PAYER_NAME, C8891REi.REQUEST_PAYER_PHONE}, 0);
                    PaymentMode paymentMode = paymentRequestContent2.paymentConfiguration.mode;
                    if (paymentMode == null || (name = paymentMode.name()) == null || (rfa = RFA.valueOf(name)) == null) {
                        rfa = RFA.LIVE;
                    }
                    String uriAuthorityAndPath3 = uriUtils.toUriAuthorityAndPath(str3);
                    ArrayList A1L = 0sr.A1L(new REB[]{REB.CHARGE});
                    PaymentItem paymentItem = paymentRequestContent2.paymentDetails.total;
                    if (paymentItem == null || (paymentCurrencyAmount = paymentItem.amount) == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                    CurrencyAmount A004 = SQ3.A00(paymentCurrencyAmount);
                    Set<PaymentContainerType> keySet = paymentRequestContent2.paymentConfiguration.supportedContainers.keySet();
                    ArrayList A0r = AnonymousClass7TG.A0r(keySet);
                    Iterator<PaymentContainerType> it = keySet.iterator();
                    while (it.hasNext()) {
                        C11083S9d.A01(A0r, it);
                    }
                    checkoutHandler.A02 = new ECPAvailabilityRequestParams(new ECPPaymentConfiguration(A004, (KnownData) null, rfa, (String) null, uriAuthorityAndPath3, A1L, A0r, (ArrayList) null, (Map) null, (Set) null), paymentReceiverInfo, loggingPolicy, A0C, str2, A003, uriAuthorityAndPath2, A0y, A0t, 0, BbL, !z, true);
                    C262224Cq r5 = checkoutHandler.A0Z;
                    checkoutHandler.A0G = 1Eo.A04(19B.A00, new JTw((Object) A1H, (Object) paymentRequest, (Object) A002, (Object) A0K, (Object) checkoutHandler, (Object) A0D, (AnonymousClass4D7) null, 5), r5);
                } else {
                    0qQ.A0F("availabilityRequestDomain");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            Dba.A16(suM.A02, A0K, new TYA(49, (Object) suM, (Object) paymentRequest), 23);
        }
    }
}
