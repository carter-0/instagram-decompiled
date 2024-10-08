package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class S7g {
    public ECPPaymentResponseParams A00 = null;
    public PaymentDetails A01 = null;
    public PaymentRequest A02 = null;
    public PaymentRequest A03 = null;
    public C11023S6a A04 = null;
    public SUj A05 = null;
    public Boolean A06 = null;
    public String A07 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S7g) {
                S7g s7g = (S7g) obj;
                if (!0qQ.A0K(this.A02, s7g.A02) || !0qQ.A0K(this.A05, s7g.A05) || !0qQ.A0K(this.A04, s7g.A04) || !0qQ.A0K(this.A06, s7g.A06) || !0qQ.A0K(this.A07, s7g.A07) || !0qQ.A0K(this.A00, s7g.A00) || !0qQ.A0K(this.A03, s7g.A03) || !0qQ.A0K(this.A01, s7g.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final PaymentReceiverInfo A00() {
        CheckoutAvailability checkoutAvailability;
        SUj sUj = this.A05;
        if (sUj == null || (checkoutAvailability = (CheckoutAvailability) sUj.A01) == null) {
            return null;
        }
        QTJ qtj = checkoutAvailability.A00.A04;
        return new PaymentReceiverInfo(qtj.A07("strong_id__"), qtj.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), qtj.A09("image"), (String) null);
    }

    public final PaymentMode A01() {
        CheckoutAvailability checkoutAvailability;
        RGA rga;
        int ordinal;
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        PaymentMode paymentMode;
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest != null && (paymentRequestContent = paymentRequest.content) != null && (paymentConfiguration = paymentRequestContent.paymentConfiguration) != null && (paymentMode = paymentConfiguration.mode) != null) {
            return paymentMode;
        }
        SUj sUj = this.A05;
        if (sUj == null || (checkoutAvailability = (CheckoutAvailability) sUj.A01) == null || (rga = (RGA) checkoutAvailability.A00.A03.getOptionalEnumField(3, "payment_mode", RGA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null || (ordinal = rga.ordinal()) == 1 || ordinal != 2) {
            return PaymentMode.LIVE;
        }
        return PaymentMode.TEST;
    }

    public final String A02() {
        CheckoutAvailability checkoutAvailability;
        Object obj;
        SUj sUj = this.A05;
        if (sUj != null) {
            checkoutAvailability = (CheckoutAvailability) sUj.A01;
        } else {
            checkoutAvailability = null;
        }
        if (checkoutAvailability == null) {
            return null;
        }
        Iterator it = checkoutAvailability.A00.A06.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CheckoutPayloadKeyValue) obj).A00 == C8932RGa.CLIENT_RECEIVER_ID) {
                break;
            }
        }
        CheckoutPayloadKeyValue checkoutPayloadKeyValue = (CheckoutPayloadKeyValue) obj;
        if (checkoutPayloadKeyValue != null) {
            return checkoutPayloadKeyValue.A01;
        }
        return null;
    }

    public final Set A05() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        Map<PaymentContainerType, Map<String, Object>> map;
        Set<PaymentContainerType> keySet;
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null || (map = paymentConfiguration.supportedContainers) == null || (keySet = map.keySet()) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(keySet);
        Iterator<PaymentContainerType> it = keySet.iterator();
        while (it.hasNext()) {
            C11083S9d.A01(A0r, it);
        }
        return 00k.A0k(A0r);
    }

    public final Set A06() {
        CheckoutAvailability checkoutAvailability;
        ImmutableList requiredCompactedEnumListField;
        SUj sUj = this.A05;
        if (sUj == null || (checkoutAvailability = (CheckoutAvailability) sUj.A01) == null || (requiredCompactedEnumListField = checkoutAvailability.A00.A03.getRequiredCompactedEnumListField(1, "supported_container_types", RGB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            return null;
        }
        return 00k.A0k(C11432SUd.A0F(requiredCompactedEnumListField));
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String A03() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        String A022 = A02();
        if (A022 != null) {
            return 00l.A0L(A022, "::", A022);
        }
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null) {
            return null;
        }
        return paymentConfiguration.partnerId;
    }

    public final String A04() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        String A022 = A02();
        if (A022 != null) {
            return 00l.A0K(A022, "::", A022);
        }
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null) {
            return null;
        }
        return paymentConfiguration.partnerMerchantId;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CheckoutSessionData(availabilityRequest=");
        A1A.append(this.A02);
        A1A.append(", availabilityResponse=");
        A1A.append(this.A05);
        A1A.append(", availabilityInfo=");
        A1A.append(this.A04);
        A1A.append(", isNUXUser=");
        A1A.append(this.A06);
        A1A.append(", orderId=");
        A1A.append(this.A07);
        A1A.append(", ecpPaymentResponseParams=");
        A1A.append(this.A00);
        A1A.append(", paymentRequest=");
        A1A.append(this.A03);
        A1A.append(", paymentDetails=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
