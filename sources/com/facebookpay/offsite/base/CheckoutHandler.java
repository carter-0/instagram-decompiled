package com.facebookpay.offsite.base;

import X.00k;
import X.0Tu;
import X.0Yt;
import X.0qQ;
import X.0sm;
import X.182;
import X.1ES;
import X.1GK;
import X.1Hj;
import X.1OC;
import X.1QY;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass1O9;
import X.AnonymousClass2Fj;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9D0;
import X.C10577RuX;
import X.C11023S6a;
import X.C11090S9p;
import X.C11297SKg;
import X.C11353SOm;
import X.C11418SSt;
import X.C11431STx;
import X.C12402StT;
import X.C12435SuM;
import X.C13222TQn;
import X.C13326TUz;
import X.C13349TVw;
import X.C13864Til;
import X.C262204Co;
import X.C262224Cq;
import X.C51974G9v;
import X.C60340gF;
import X.C66581MXm;
import X.C73949PmT;
import X.C8021QfA;
import X.C8122QhE;
import X.C8766R8r;
import X.C8902REu;
import X.C9649ReT;
import X.C9650ReU;
import X.C9828Rhq;
import X.C9971RkQ;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.Dbb;
import X.JTO;
import X.JTP;
import X.MHD;
import X.OV5;
import X.Pxe;
import X.Pxj;
import X.Q6J;
import X.S51;
import X.S7g;
import X.SUj;
import X.T7Z;
import X.TNJ;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.MessageParamsKt;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import com.facebookpay.offsite.models.message.PaymentDataError;
import com.facebookpay.offsite.models.message.PaymentDataErrorField;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdate;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError;
import com.facebookpay.offsite.models.message.PaymentDetailsUpdatedResponse;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CheckoutHandler {
    public PhoneNumberUtil A00;
    public DefaultPaymentMethodFields A01;
    public ECPAvailabilityRequestParams A02;
    public C13864Til A03;
    public Q6J A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public Map A0F;
    public C262204Co A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final Fragment A0M;
    public final AnonymousClass2Fj A0N;
    public final AnonymousClass2Fj A0O;
    public final AnonymousClass2Fj A0P;
    public final AnonymousClass2Fj A0Q;
    public final AnonymousClass2Fj A0R;
    public final C12402StT A0S = new C12402StT(this);
    public final OV5 A0T = new OV5();
    public final S51 A0U;
    public final AtomicReference A0V;
    public final AtomicReference A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final C262224Cq A0Z;
    public final boolean A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0255, code lost:
        if (((X.0xa) r4.A0U.A09.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false) != false) goto L_0x0257;
     */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0621 A[LOOP:10: B:228:0x061b->B:230:0x0621, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x07af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2Fj A09(com.facebookpay.offsite.models.message.PaymentRequest r62, java.lang.String r63, java.util.List r64, java.util.List r65) {
        /*
            r61 = this;
            r12 = 1
            r1 = r62
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            r4 = r61
            java.lang.String r16 = r4.A0C(r0)
            java.util.LinkedHashMap r15 = X.AnonymousClass7TE.A1H()
            java.lang.String r2 = A02(r4)
            r0 = r16
            java.util.LinkedHashMap r0 = X.C11418SSt.A02(r1, r2, r0)
            long r2 = r1.timeStamp
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r6.putAll(r0)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "PROACTIVE_CHECKOUT"
            r6.put(r0, r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "REQUEST_TIMESTAMP"
            r6.put(r0, r2)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.supportedContainers
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x0048:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0064
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r2.getValue()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0048
            X.JTR.A1U(r5, r2)
            goto L_0x0048
        L_0x0064:
            java.util.Collection r0 = r5.values()
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0070:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r9.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<*, *>"
            X.0qQ.A0C(r2, r0)
            java.util.ArrayList r5 = X.JTQ.A0f(r2)
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r2)
        L_0x008a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r8)
            java.lang.Object r2 = r7.getKey()
            java.lang.String r0 = "requireCVV"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r7.getValue()
            boolean r2 = X.AnonymousClass7TF.A1Y(r0, r12)
            r0 = 1
            if (r2 != 0) goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.add(r0)
            goto L_0x008a
        L_0x00b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            boolean r0 = r5.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            goto L_0x0070
        L_0x00c5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            boolean r0 = r3.contains(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "REQUIRE_CVV"
            r6.put(r0, r3)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r3 = r0.paymentOptions
            boolean r0 = r3.requestPayerEmail
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "requestPayerEmail"
            r5.add(r0)
        L_0x00e8:
            boolean r0 = r3.requestPayerName
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "requestPayerName"
            r5.add(r0)
        L_0x00f2:
            boolean r0 = r3.requestPayerPhone
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "requestPayerPhone"
            r5.add(r0)
        L_0x00fc:
            boolean r0 = r3.requestShipping
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "requestShipping"
            r5.add(r0)
        L_0x0106:
            boolean r0 = r3.requestBillingAddress
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "requestBilling"
            r5.add(r0)
        L_0x0110:
            java.lang.Boolean r0 = r3.requestPickupEmail
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "requestPickupEmail"
            r5.add(r0)
        L_0x011e:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            java.lang.Boolean r0 = r0.requestPickupPhone
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "requestPickupPhone"
            r5.add(r0)
        L_0x0130:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            java.lang.Boolean r0 = r0.requestPickupName
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "requestPickupName"
            r5.add(r0)
        L_0x0142:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r3 = r0.paymentOptions
            java.lang.String r2 = r3.billingAddressMode
            if (r2 == 0) goto L_0x0153
            java.lang.String r0 = "billingAddressMode="
            java.lang.String r0 = X.002.A0R(r0, r2)
            r5.add(r0)
        L_0x0153:
            boolean r0 = r3.allowOfferCodes
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "allowOfferCodes"
            r5.add(r0)
        L_0x015c:
            java.lang.String r0 = "PAYMENT_OPTIONS"
            r6.put(r0, r5)
            java.lang.String r14 = "EVENT_EXTRA"
            r6.put(r14, r15)
            X.REu r0 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_INIT
            r4.A0H(r0, r6)
            java.lang.String r0 = "user_click_ecpentry_atomic"
            A06(r4, r0, r6)
            X.S7g r0 = A00(r4)
            r0.A03 = r1
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r2 = r0.paymentConfiguration
            java.lang.String r0 = r2.requestId
            r4.A0B = r0
            java.lang.String r0 = r2.pixelId
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = r4.A0A
        L_0x0185:
            r4.A0A = r0
            java.lang.String r0 = r2.eventId
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = r4.A06
        L_0x018d:
            r4.A06 = r0
            java.lang.String r0 = r2.externalId
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = r4.A07
        L_0x0195:
            r4.A07 = r0
            boolean r0 = r4.A0H
            if (r0 != 0) goto L_0x01aa
            java.lang.String r9 = "CHECKOUT_UNAVAILABLE"
        L_0x019d:
            java.lang.String r0 = r1.msgId
            r12 = 0
        L_0x01a0:
            r7 = r4
            r8 = r0
            r10 = r6
            r11 = r15
            A05(r7, r8, r9, r10, r11, r12)
        L_0x01a7:
            X.2Fj r0 = r4.A0P
            return r0
        L_0x01aa:
            java.lang.String r2 = r2.partnerId
            X.S7g r0 = A00(r4)
            java.lang.String r0 = r0.A03()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01bd
            java.lang.String r9 = "PARTNER_MISMATCH"
            goto L_0x019d
        L_0x01bd:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            java.lang.String r2 = r0.partnerMerchantId
            X.S7g r0 = A00(r4)
            java.lang.String r0 = r0.A04()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r9 = "MERCHANT_MISMATCH"
            goto L_0x019d
        L_0x01d4:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0V
            r59 = r0
            java.lang.Object r2 = r59.get()
            java.lang.String r0 = "0"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01e8
            java.lang.String r9 = "“MULTIPLE_CHECKOUT_REQUEST"
            goto L_0x019d
        L_0x01e8:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            if (r0 == 0) goto L_0x01f7
            boolean r0 = r4.A0J
            if (r0 != 0) goto L_0x01f7
            java.lang.String r9 = "CHECKOUT_ERROR"
            goto L_0x019d
        L_0x01f7:
            X.Til r0 = r4.A0A()
            boolean r0 = r0.B1C()
            if (r0 == 0) goto L_0x0214
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r2 = r0.mode
            X.S7g r0 = A00(r4)
            com.facebookpay.offsite.models.message.PaymentMode r0 = r0.A01()
            if (r2 == r0) goto L_0x0214
            java.lang.String r9 = "PAYMENT_MODE_MISMATCH"
            goto L_0x019d
        L_0x0214:
            java.lang.String r2 = r4.A05
            if (r2 == 0) goto L_0x07c8
            com.facebookpay.offsite.models.message.UriUtils r8 = com.facebookpay.offsite.models.message.UriUtils.INSTANCE
            r60 = r63
            r0 = r60
            java.lang.String r0 = r8.toUriAuthorityAndPath(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x022c
            java.lang.String r9 = "SECURITY_ERROR"
            goto L_0x019d
        L_0x022c:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            if (r0 == 0) goto L_0x0257
            X.Til r0 = r4.A0A()
            boolean r0 = r0.Buf()
            if (r0 == 0) goto L_0x0257
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x0257
            X.S51 r0 = r4.A0U
            X.0eM r0 = r0.A09
            java.lang.Object r3 = r0.getValue()
            X.0xa r3 = (X.0xa) r3
            java.lang.String r2 = "proactive_checkout_should_stop_showing_banner"
            r0 = 0
            boolean r2 = r3.getBoolean(r2, r0)
            r0 = 1
            if (r2 == 0) goto L_0x0258
        L_0x0257:
            r0 = 0
        L_0x0258:
            r4.A0L = r0
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.C11353SOm.A01()
            X.RxU r0 = r0.A01
            if (r0 == 0) goto L_0x0280
            X.QXO r7 = r0.A00
            if (r7 == 0) goto L_0x0280
            java.lang.Class<X.QSd> r5 = X.C7662QSd.class
            r3 = 6
            java.lang.String r2 = "ecp_banner_config"
            r0 = 105337408(0x6475240, float:3.7488168E-35)
            X.3lr r5 = r7.getOptionalTreeField(r3, r2, r5, r0)
            if (r5 == 0) goto L_0x0280
            X.RGk r3 = X.C8942RGk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 0
            java.lang.String r0 = "nux"
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedEnumListField(r2, r0, r3)
            if (r0 != 0) goto L_0x0286
        L_0x0280:
            X.RGk r0 = X.C8942RGk.META_PAY_BANNER
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0286:
            r27 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x028c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r0 = r3.next()
            X.RGk r0 = (X.C8942RGk) r0
            int r2 = r0.ordinal()
            r0 = 5
            if (r2 != r0) goto L_0x028c
            X.RGk r27 = X.C8942RGk.META_PAY_BANNER
            goto L_0x028c
        L_0x02a2:
            boolean r3 = r4.A0L
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.C11353SOm.A01()
            X.RxU r0 = r0.A01
            if (r0 == 0) goto L_0x02f4
            X.QXO r9 = r0.A00
            if (r9 == 0) goto L_0x02f4
            java.lang.Class<X.QSd> r7 = X.C7662QSd.class
            r5 = 6
            java.lang.String r2 = "ecp_banner_config"
            r0 = 105337408(0x6475240, float:3.7488168E-35)
            X.3lr r5 = r9.getOptionalTreeField(r5, r2, r7, r0)
            if (r5 == 0) goto L_0x02f4
            X.RGk r2 = X.C8942RGk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "pux"
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedEnumListField(r12, r0, r2)
        L_0x02c7:
            r5 = 2
            r2 = 7
            if (r0 != 0) goto L_0x02d7
            X.RGk r7 = X.C8942RGk.CREDENTIAL_ACQUISITION_SOURCE_BANNER
            X.RGk r0 = X.C8942RGk.PROACTIVE_CHECKOUT_BANNER
            X.RGk[] r0 = new X.C8942RGk[]{r7, r0}
            java.util.List r0 = X.0sr.A1P(r0)
        L_0x02d7:
            r28 = 0
            java.util.Iterator r7 = r0.iterator()
        L_0x02dd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02f6
            java.lang.Object r0 = r7.next()
            X.RGk r0 = (X.C8942RGk) r0
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x02dd
            if (r3 == 0) goto L_0x02dd
            X.RGk r28 = X.C8942RGk.PROACTIVE_CHECKOUT_BANNER
            goto L_0x02dd
        L_0x02f4:
            r0 = 0
            goto L_0x02c7
        L_0x02f6:
            r0 = r4
            X.QhE r0 = (X.C8122QhE) r0
            java.lang.String r7 = r0.A00
            r33 = 0
            if (r7 == 0) goto L_0x07ba
            com.facebookpay.offsite.models.message.PaymentRequestContent r3 = r1.content
            java.lang.String r2 = r1.msgId
            r58 = r2
            com.facebookpay.logging.LoggingPolicy r19 = X.C11418SSt.A00
            X.Til r2 = r0.A0A()
            java.lang.String r11 = r2.AcA()
            X.Til r2 = r0.A0A()
            boolean r2 = r2.B7H()
            if (r2 == 0) goto L_0x040c
            r57 = r33
        L_0x031b:
            X.Til r2 = r0.A0A()
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r10 = X.C9648ReS.A00(r2, r1)
            X.Til r2 = r0.A0A()
            java.util.Set r49 = r2.AbC(r1)
            X.Til r2 = r0.A0A()
            boolean r34 = r2.CQ6()
            java.util.Map r9 = X.C9970RkP.A00
            com.facebookpay.offsite.models.message.PaymentRequestContent r2 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r2 = r2.paymentOptions
            java.lang.String r2 = r2.ctaType
            java.lang.Number r2 = X.C51966G9m.A14(r2, r9)
            if (r2 == 0) goto L_0x034d
            int r9 = r2.intValue()
            X.Q6J r2 = r0.A04
            if (r2 == 0) goto L_0x034d
            java.lang.String r33 = r2.getString(r9)
        L_0x034d:
            X.Til r2 = r0.A0A()
            boolean r35 = r2.B1F()
            X.Til r2 = r0.A0A()
            boolean r36 = r2.B1G()
            X.Til r2 = r0.A0A()
            boolean r37 = r2.B13()
            X.Til r2 = r0.A0A()
            java.lang.Boolean r30 = r2.B1E()
            X.Til r2 = r0.A0A()
            java.lang.Boolean r31 = r2.B1A()
            X.Til r2 = r0.A0A()
            java.lang.Boolean r32 = r2.CPY()
            X.Til r0 = r0.A0A()
            boolean r38 = r0.Bub()
            r13 = 0
            X.0qQ.A0B(r3, r13)
            r2 = r58
            r0 = r19
            X.DbW.A1N(r2, r5, r0)
            java.lang.String r56 = X.C9650ReU.A00(r3)
            if (r10 != 0) goto L_0x03b3
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            X.0qQ.A0B(r0, r13)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r0.partnerId
            java.lang.String r2 = r0.partnerMerchantId
            java.lang.Object[] r5 = X.Pxf.A1X(r9, r2, r5)
            java.lang.String r2 = "%s::%s"
            java.lang.String r5 = X.Pxe.A12(r10, r2, r5)
            java.lang.String r2 = r0.merchantName
            r0 = 0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r10 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r10.<init>(r5, r2, r0, r0)
        L_0x03b3:
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r3.paymentOptions
            r29 = r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r21 = X.SQ3.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r2 = r0.mode
            if (r2 == 0) goto L_0x03cd
            java.lang.String r2 = r2.name()
            if (r2 == 0) goto L_0x03cd
            X.RFA r42 = X.RFA.valueOf(r2)
            if (r42 != 0) goto L_0x03cf
        L_0x03cd:
            X.RFA r42 = X.RFA.LIVE
        L_0x03cf:
            java.lang.String r0 = r0.containerContext
            r20 = r0
            java.lang.String r44 = r8.toUriAuthorityAndPath(r7)
            X.REB r0 = X.REB.CHARGE
            X.REB[] r0 = new X.REB[]{r0}
            java.util.ArrayList r45 = X.0sr.A1L(r0)
            com.facebookpay.offsite.models.message.PaymentDetails r0 = r3.paymentDetails
            com.facebookpay.offsite.models.message.PaymentItem r0 = r0.total
            if (r0 == 0) goto L_0x0409
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r0 = r0.amount
            if (r0 == 0) goto L_0x0409
            com.facebookpay.common.models.CurrencyAmount r40 = X.SQ3.A00(r0)
        L_0x03ef:
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.supportedContainers
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x03ff:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0416
            X.C11083S9d.A01(r9, r0)
            goto L_0x03ff
        L_0x0409:
            r40 = 0
            goto L_0x03ef
        L_0x040c:
            X.S7g r2 = A00(r0)
            java.lang.String r2 = r2.A07
            r57 = r2
            goto L_0x031b
        L_0x0416:
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.supportedContainers
            java.util.LinkedHashMap r5 = X.C51975G9x.A0o(r0)
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r0)
        L_0x0422:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0442
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r8)
            java.lang.Object r0 = r7.getKey()
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = (com.facebookpay.offsite.models.message.PaymentContainerType) r0
            java.lang.String r0 = r0.getType()
            X.RFh r2 = X.C11083S9d.A00(r0)
            java.lang.Object r0 = r7.getValue()
            r5.put(r2, r0)
            goto L_0x0422
        L_0x0442:
            java.util.LinkedHashMap r8 = X.C51975G9x.A0o(r5)
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r5)
        L_0x044a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0493
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r18)
            java.lang.Object r7 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.ArrayList r5 = X.JTQ.A0f(r0)
            java.util.Iterator r17 = X.AnonymousClass7TF.A0u(r0)
        L_0x0466:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x047c
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r17)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.AnonymousClass7TF.A1I(r2, r0, r5)
            goto L_0x0466
        L_0x047c:
            X.0eP[] r0 = new X.0eP[r13]
            java.lang.Object[] r2 = r5.toArray(r0)
            X.0eP[] r2 = (X.0eP[]) r2
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            X.0eP[] r0 = (X.0eP[]) r0
            android.os.Bundle r0 = X.Q21.A00(r0)
            r8.put(r7, r0)
            goto L_0x044a
        L_0x0493:
            java.util.ListIterator r2 = r64.listIterator()
            boolean r0 = r2.hasNext()
            r24 = 0
            if (r0 == 0) goto L_0x04fd
            java.lang.Object r0 = r2.next()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = r0.A00
            java.lang.String r5 = "given-name"
            java.lang.Object r2 = r0.get(r5)
            if (r2 != 0) goto L_0x0558
            java.lang.String r2 = "family-name"
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0558
            r25 = r24
        L_0x04b9:
            java.lang.String r2 = "email"
            java.lang.String r53 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "tel"
            java.lang.String r54 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "address-line1"
            java.lang.String r5 = X.DbT.A11(r2, r0)
            if (r5 != 0) goto L_0x051d
            java.lang.String r5 = "address-level1"
            java.lang.Object r5 = r0.get(r5)
            if (r5 != 0) goto L_0x051d
            java.lang.String r5 = "address-level2"
            java.lang.Object r5 = r0.get(r5)
            if (r5 != 0) goto L_0x051d
            java.lang.String r5 = "country"
            java.lang.Object r5 = r0.get(r5)
            if (r5 != 0) goto L_0x051d
            r22 = r24
        L_0x04e8:
            if (r25 != 0) goto L_0x04f0
            if (r53 != 0) goto L_0x04f0
            if (r54 != 0) goto L_0x04f0
            if (r22 == 0) goto L_0x04fd
        L_0x04f0:
            java.lang.String r55 = "IAW"
            com.facebookpay.expresscheckout.models.KnownData r24 = new com.facebookpay.expresscheckout.models.KnownData
            r50 = r24
            r51 = r22
            r52 = r25
            r50.<init>(r51, r52, r53, r54, r55)
        L_0x04fd:
            com.facebookpay.offsite.models.message.PaymentDetails r0 = r3.paymentDetails
            java.util.List<com.facebookpay.offsite.models.message.PaymentOffer> r2 = r0.offers
            if (r2 == 0) goto L_0x056a
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x050b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x056b
            java.lang.Object r2 = r3.next()
            com.facebookpay.offsite.models.message.PaymentOffer r2 = (com.facebookpay.offsite.models.message.PaymentOffer) r2
            java.lang.String r2 = r2.code
            r0.add(r2)
            goto L_0x050b
        L_0x051d:
            java.lang.String r5 = "ent_id"
            java.lang.String r23 = X.DbT.A11(r5, r0)
            java.lang.String r26 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "address-line2"
            java.lang.String r27 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "address-level2"
            java.lang.String r28 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "address-level1"
            java.lang.String r29 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "country"
            java.lang.String r30 = X.DbT.A11(r2, r0)
            java.lang.String r2 = "postal-code"
            java.lang.String r31 = X.DbT.A11(r2, r0)
            com.facebookpay.shippingaddress.model.ShippingAddress r22 = new com.facebookpay.shippingaddress.model.ShippingAddress
            r32 = r24
            r33 = r13
            r34 = r13
            r35 = r13
            r36 = r13
            r37 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x04e8
        L_0x0558:
            java.lang.String r7 = X.DbT.A11(r5, r0)
            java.lang.String r5 = " "
            java.lang.String r2 = "family-name"
            java.lang.String r2 = X.DbT.A11(r2, r0)
            java.lang.String r25 = X.002.A0g(r7, r5, r2)
            goto L_0x04b9
        L_0x056a:
            r0 = 0
        L_0x056b:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r23 = new com.facebookpay.expresscheckout.models.ECPPaymentConfiguration
            r39 = r23
            r41 = r24
            r43 = r20
            r46 = r9
            r47 = r0
            r48 = r8
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            com.instagram.common.session.UserSession r5 = X.C11431STx.A00()
            X.0Tu r0 = X.0Tu.A06
            r2 = 36314498245986961(0x8103d800260a91, double:3.02877314528506E-306)
            boolean r5 = X.182.A06(r0, r5, r2)
            int r2 = r11.hashCode()
            r3 = 628339271(0x2573b247, float:2.1137293E-16)
            r0 = -1
            if (r2 == r3) goto L_0x065a
            r3 = 628339369(0x2573b2a9, float:2.1137423E-16)
            if (r2 == r3) goto L_0x062b
            r0 = 1632225371(0x6149c85b, float:2.3263954E20)
            if (r2 != r0) goto L_0x0689
            java.lang.String r0 = "META_PAY_APP_STYLE_IG"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0689
            X.RFs r26 = X.C8924RFs.A0Y
            X.RFs r28 = X.C8924RFs.A0Z
            X.RFs r29 = X.C8924RFs.A0a
            X.RFs r30 = X.C8924RFs.A0V
        L_0x05af:
            r25 = 0
            X.RFs r31 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r34 = X.Pxh.A0V()
            X.RFs r32 = X.C8924RFs.A0D
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r24 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r27 = r26
            r33 = r25
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x05c2:
            r20 = 0
            java.lang.String r2 = A02(r4)
            r0 = r16
            java.util.LinkedHashMap r0 = X.C11418SSt.A02(r1, r2, r0)
            r4.A0F = r0
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentDetails r3 = r0.paymentDetails
            com.facebookpay.offsite.models.message.PaymentItem r2 = r3.total
            if (r2 == 0) goto L_0x0629
            com.facebookpay.offsite.models.message.PaymentOptions r2 = r0.paymentOptions
            java.lang.String r2 = r2.shippingType
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            java.lang.String r0 = r0.acquirerCountryCode
            com.facebookpay.expresscheckout.models.TransactionInfo r2 = X.C11090S9p.A00(r3, r2, r0)
        L_0x05e4:
            r3 = r59
            r0 = r58
            r3.set(r0)
            X.S7g r3 = A00(r4)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentDetails r0 = r0.paymentDetails
            r3.A01 = r0
            if (r2 == 0) goto L_0x05fc
            X.2Fj r0 = r4.A0R
            X.SUj.A0K(r0, r2)
        L_0x05fc:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            if (r0 == 0) goto L_0x0611
            X.Til r0 = r4.A0A()
            r0.BNr()
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x07b3
            r4.A0K = r12
        L_0x0611:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
            java.util.LinkedHashMap r3 = r4.A0E(r0)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r3)
        L_0x061b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x06b2
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)
            X.Dbb.A1V(r0, r15)
            goto L_0x061b
        L_0x0629:
            r2 = 0
            goto L_0x05e4
        L_0x062b:
            java.lang.String r2 = "META_CHECKOUT_APP_STYLE_IG"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0689
            if (r38 == 0) goto L_0x0657
            X.RFs r26 = X.C8924RFs.A0X
        L_0x0637:
            X.RFs r28 = X.C8924RFs.A0Z
            X.RFs r29 = X.C8924RFs.A0a
            X.RFs r30 = X.C8924RFs.A0V
            r33 = 0
            com.facebookpay.expresscheckout.models.AuthScreenStyle r2 = new com.facebookpay.expresscheckout.models.AuthScreenStyle
            r2.<init>(r0)
            X.RFs r31 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r34 = X.Pxh.A0V()
            X.RFs r32 = X.C8924RFs.A0D
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r24 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r25 = r2
            r27 = r26
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x05c2
        L_0x0657:
            X.RFs r26 = X.C8924RFs.A0W
            goto L_0x0637
        L_0x065a:
            java.lang.String r2 = "META_CHECKOUT_APP_STYLE_FB"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0689
            if (r38 == 0) goto L_0x0686
            X.RFs r26 = X.C8924RFs.A0I
        L_0x0666:
            X.RFs r28 = X.C8924RFs.A0E
            X.RFs r29 = X.C8924RFs.A0F
            X.RFs r30 = X.C8924RFs.A0A
            X.RFs r32 = X.C8924RFs.A0L
            com.facebookpay.expresscheckout.models.AuthScreenStyle r2 = new com.facebookpay.expresscheckout.models.AuthScreenStyle
            r2.<init>(r0)
            r33 = 0
            X.RFs r31 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r34 = X.Pxh.A0V()
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r24 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r25 = r2
            r27 = r26
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x05c2
        L_0x0686:
            X.RFs r26 = X.C8924RFs.A0H
            goto L_0x0666
        L_0x0689:
            if (r5 == 0) goto L_0x06a8
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r24 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            X.RFs r26 = X.C8924RFs.A0K
            X.RFs r28 = X.C8924RFs.A0E
            X.RFs r29 = X.C8924RFs.A0F
            X.RFs r30 = X.C8924RFs.A0A
            r25 = 0
            X.RFs r31 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r34 = X.Pxh.A0V()
            X.RFs r32 = X.C8924RFs.A0D
            r27 = r26
            r33 = r25
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x05c2
        L_0x06a8:
            X.RFs r26 = X.C8924RFs.A0J
            X.RFs r28 = X.C8924RFs.A0E
            X.RFs r29 = X.C8924RFs.A0F
            X.RFs r30 = X.C8924RFs.A0A
            goto L_0x05af
        L_0x06b2:
            r6.put(r14, r3)
            X.REu r0 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS
            r4.A0H(r0, r6)
            java.lang.String r32 = "DEFAULT_VALUE"
            X.Til r0 = r4.A0A()
            r0.Ci2()
            X.2Fj r5 = X.JTO.A0K()
            X.0eM r0 = r4.A0Y
            java.lang.Object r3 = r0.getValue()
            X.S3F r3 = (X.S3F) r3
            if (r3 == 0) goto L_0x07af
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            java.lang.String r29 = X.C9650ReU.A00(r0)
            com.facebookpay.offsite.models.message.PaymentRequestContent r7 = r1.content
            java.lang.String r1 = "SECURITY_ORIGIN"
            r0 = r60
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r0)
            X.S7g r0 = A00(r4)
            X.S6a r0 = r0.A04
            if (r0 == 0) goto L_0x07ab
            java.lang.String r1 = r0.A01
        L_0x06eb:
            java.lang.String r0 = "AD_ID"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r6)
            java.util.ArrayList r0 = X.SQ3.A03(r7, r0)
            r1 = r65
            java.util.ArrayList r33 = X.00k.A0S(r1, r0)
            r22 = r20
            r25 = r10
            r26 = r2
            r27 = r19
            r28 = r16
            r30 = r58
            r31 = r57
            r34 = r13
            r35 = r13
            r19 = r3
            X.2Fj r0 = r19.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r0 = r0.A02()
        L_0x0717:
            r5.A0B(r0)
            java.lang.Object r0 = r5.A02()
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = (com.facebookpay.expresscheckout.models.CheckoutResponse) r0
            if (r0 == 0) goto L_0x07a7
            java.lang.String r1 = r0.A00
        L_0x0724:
            java.lang.String r0 = "CHECKOUT_NOT_AVAILABLE"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r5 = r10.A02
            X.Q6J r0 = r4.A04
            if (r0 == 0) goto L_0x01a7
            r1 = 2131961290(0x7f1325ca, float:1.9559273E38)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)
            r1 = 2131961289(0x7f1325c9, float:1.955927E38)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r1)
            X.RFe r18 = X.C8911RFe.A05
            com.facebookpay.common.models.ErrorDialogContent r1 = new com.facebookpay.common.models.ErrorDialogContent
            r17 = r1
            r19 = r20
            r21 = r20
            r24 = r20
            r25 = r20
            r26 = r20
            r27 = r20
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.SIG r3 = X.AnonymousClass2E0.A0H()
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            android.graphics.drawable.Drawable r17 = r2.A04(r0)
            java.lang.String r22 = r1.A05(r0)
            java.lang.String r23 = r1.A02(r0)
            java.lang.String r24 = r1.A03(r0)
            X.RGf r18 = r1.A00()
            boolean r28 = r1.A06()
            X.RuV r2 = r1.A00
            if (r2 == 0) goto L_0x07a5
            java.lang.String r2 = r2.A02
        L_0x077b:
            java.lang.String r26 = r1.A04(r0)
            X.RGf r19 = r1.A01()
            X.RuV r1 = r1.A01
            if (r1 == 0) goto L_0x07a3
            java.lang.String r1 = r1.A02
        L_0x0789:
            X.Svb r21 = new X.Svb
            r53 = r21
            r54 = r4
            r55 = r16
            r58 = r5
            r53.<init>(r54, r55, r56, r57, r58)
            r25 = r2
            r27 = r1
            X.SOk r1 = X.SA0.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.SIG.A00(r0, r1, r3)
            goto L_0x01a7
        L_0x07a3:
            r1 = 0
            goto L_0x0789
        L_0x07a5:
            r2 = 0
            goto L_0x077b
        L_0x07a7:
            r1 = r20
            goto L_0x0724
        L_0x07ab:
            r1 = r20
            goto L_0x06eb
        L_0x07af:
            r0 = r20
            goto L_0x0717
        L_0x07b3:
            java.lang.String r0 = r1.msgId
            r12 = 0
            java.lang.String r9 = "CHECKOUT_ERROR"
            goto L_0x01a0
        L_0x07ba:
            java.lang.String r2 = "IAWOffsiteMessageHandler"
            java.lang.String r0 = "Webview url is empty"
            X.0KC.A0C(r2, r0)
            java.lang.String r0 = r1.msgId
            r12 = 0
            java.lang.String r9 = "ECP_LAUNCH_PARAMS_NULL"
            goto L_0x01a0
        L_0x07c8:
            java.lang.String r0 = "availabilityRequestDomain"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A09(com.facebookpay.offsite.models.message.PaymentRequest, java.lang.String, java.util.List, java.util.List):X.2Fj");
    }

    public final Object A0B(AnonymousClass2Fj r12, PaymentRequest paymentRequest, C11023S6a s6a, Boolean bool, List list, Map map, Map map2, AnonymousClass4D7 r19) {
        AnonymousClass2Fj r2 = r12;
        PaymentRequest paymentRequest2 = paymentRequest;
        C11023S6a s6a2 = s6a;
        Map map3 = map;
        Map map4 = map2;
        if (A0A().Bfx() == AnonymousClass05K.A01) {
            A0G(r12, paymentRequest, s6a, map3, map4);
        } else {
            Object A012 = A01(r2, this, paymentRequest2, s6a2, bool, list, map3, map4, r19);
            if (A012 == 1Hj.A02) {
                return A012;
            }
        }
        return C60340gF.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r12.equals("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS") != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r7 = java.lang.System.currentTimeMillis();
        r9 = r3.A01;
        r10 = r9.A09;
        r8 = X.C51970G9q.A1T(((r7 - X.DbW.A06((X.0xa) r10.getValue(), "proactive_checkout_cooldown_start_time_ms")) > X.AnonymousClass7TE.A0R(X.AnonymousClass7TE.A14(r9.A04)) ? 1 : ((r7 - X.DbW.A06((X.0xa) r10.getValue(), "proactive_checkout_cooldown_start_time_ms")) == X.AnonymousClass7TE.A0R(X.AnonymousClass7TE.A14(r9.A04)) ? 0 : -1)));
        r6 = X.DbW.A06((X.0xa) r10.getValue(), "proactive_checkout_cooldown_start_time_ms");
        r5 = ((X.0xa) r10.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false);
        r4 = r9.A00();
        r2.put("proactiveCheckoutCooldownActive", java.lang.String.valueOf(r8));
        r2.put("proactiveCheckoutCooldownStartTimeMs", java.lang.String.valueOf(r6));
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (r0 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
        if (r1 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        if (r1.A00 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (r1.A01 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r2.put("proactiveCheckoutHasValidPaymentMethod", java.lang.String.valueOf(r0));
        r2.put("proactiveCheckoutShouldShowBanner", java.lang.String.valueOf(r3.A0L));
        r2.put("proactiveCheckoutShouldStopShowingBanner", java.lang.String.valueOf(r5));
        r2.put("proactiveCheckoutSessionList", X.Pxf.A0f(r4));
        r2.put("proactiveCheckoutIsGKEnabled", java.lang.String.valueOf(r3.A0A().BbL()));
        r2.put("proactiveCheckoutEligibleWithoutGK", java.lang.String.valueOf(r3.A0J));
        r2.put("proactiveCheckoutEligibleWithGK", java.lang.String.valueOf(r3.A0I));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e7, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r12.equals(r0) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap A0E(java.lang.String r12) {
        /*
            r11 = this;
            r3 = r11
            X.QhE r3 = (X.C8122QhE) r3
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            int r1 = r12.hashCode()
            r0 = -1732568701(0xffffffff98bb1983, float:-4.8364127E-24)
            if (r1 == r0) goto L_0x00e8
            r0 = 967462192(0x39aa4d30, float:3.2482436E-4)
            if (r1 == r0) goto L_0x0023
            r0 = 1182280542(0x46782b5e, float:15882.842)
            if (r1 != r0) goto L_0x0022
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
        L_0x001c:
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x002b
        L_0x0022:
            return r2
        L_0x0023:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0022
        L_0x002b:
            long r7 = java.lang.System.currentTimeMillis()
            X.S51 r9 = r3.A01
            X.0eM r10 = r9.A09
            java.lang.Object r0 = r10.getValue()
            X.0xa r0 = (X.0xa) r0
            java.lang.String r6 = "proactive_checkout_cooldown_start_time_ms"
            long r0 = X.DbW.A06(r0, r6)
            long r7 = r7 - r0
            X.0eM r0 = r9.A04
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            long r4 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            boolean r8 = X.C51970G9q.A1T(r0)
            java.lang.Object r0 = r10.getValue()
            X.0xa r0 = (X.0xa) r0
            long r6 = X.DbW.A06(r0, r6)
            java.lang.Object r4 = r10.getValue()
            X.0xa r4 = (X.0xa) r4
            java.lang.String r1 = "proactive_checkout_should_stop_showing_banner"
            r0 = 0
            boolean r5 = r4.getBoolean(r1, r0)
            java.util.List r4 = r9.A00()
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "proactiveCheckoutCooldownActive"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "proactiveCheckoutCooldownStartTimeMs"
            r2.put(r0, r1)
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = r3.A01
            if (r0 == 0) goto L_0x0092
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r1 = r0.A00
            if (r1 == 0) goto L_0x0092
            X.RGo r0 = r1.A00
            if (r0 == 0) goto L_0x0092
            java.lang.String r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutHasValidPaymentMethod"
            r2.put(r0, r1)
            boolean r0 = r3.A0L
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutShouldShowBanner"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "proactiveCheckoutShouldStopShowingBanner"
            r2.put(r0, r1)
            java.lang.String r1 = X.Pxf.A0f(r4)
            java.lang.String r0 = "proactiveCheckoutSessionList"
            r2.put(r0, r1)
            X.Til r0 = r3.A0A()
            boolean r0 = r0.BbL()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutIsGKEnabled"
            r2.put(r0, r1)
            boolean r0 = r3.A0J
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithoutGK"
            r2.put(r0, r1)
            boolean r0 = r3.A0I
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithGK"
            r2.put(r0, r1)
            return r2
        L_0x00e8:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL"
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0E(java.lang.String):java.util.LinkedHashMap");
    }

    public final void A0F() {
        this.A0B = null;
        this.A0A = null;
        this.A06 = null;
        this.A07 = null;
        this.A0V.set("0");
        this.A0W.set("0");
        this.A0F = 0Yt.A0E();
        this.A08 = null;
        this.A01 = null;
        this.A0J = false;
        this.A0I = false;
        this.A0K = false;
        this.A0L = false;
        if (this.A03 != null) {
            A0A().clear();
        }
        C262204Co r0 = this.A0G;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
    }

    public final void A0G(AnonymousClass2Fj r5, PaymentRequest paymentRequest, C11023S6a s6a, Map map, Map map2) {
        String str;
        0qQ.A0B(paymentRequest, 0);
        C51974G9v.A1M(s6a, map, map2);
        C8902REu rEu = C8902REu.CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL;
        if (A0A().Bfw()) {
            A07(s6a, map2);
            rEu = C8902REu.CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS;
            this.A0H = true;
            if (A0A().B17()) {
                A0J(s6a.A04, map);
            }
            str = MessageAvailabilityResponseId$Companion.AVAILABLE;
        } else {
            map2.put("ERROR_CODE", "AVAILABILITY_PRODUCT_VERIFICATION");
            str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
        }
        map.put("CACHE_AVAILABLE", Boolean.valueOf(C11353SOm.A01().A06(C9650ReU.A00(paymentRequest.content))));
        if (r5 != null) {
            A03(r5, this, str, paymentRequest.msgId);
        }
        A0A().E33(map);
        map.put("EVENT_EXTRA", map2);
        A0H(rEu, map);
    }

    public final void A0I(PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse, boolean z) {
        TransactionInfo transactionInfo;
        PaymentDetails paymentDetails;
        TransactionInfo transactionInfo2;
        SUj A0A2;
        List<PaymentDataError> errors;
        String str;
        Integer num;
        C8902REu rEu;
        ArrayList arrayList;
        PaymentDetailsUpdatedError paymentDetailsUpdatedError;
        Collection<PaymentDataError> values;
        PaymentDetailsUpdatedError paymentDetailsUpdatedError2;
        Collection<PaymentDataError> values2;
        List errors2;
        PaymentDetails paymentDetails2;
        String str2;
        String str3;
        Integer num2;
        W3CShippingAddress w3CShippingAddress;
        W3CShippingAddress w3CShippingAddress2;
        PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse2 = paymentDetailsUpdatedResponse;
        0qQ.A0B(paymentDetailsUpdatedResponse2, 0);
        List list = null;
        boolean z2 = true;
        String A0C2 = A0C((PaymentRequestContent) null);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("isShortCircuit", String.valueOf(z));
        this.A0W.set("0");
        AnonymousClass2Fj r6 = this.A0R;
        SUj A0W2 = Pxe.A0W(r6);
        if (A0W2 != null) {
            transactionInfo = (TransactionInfo) A0W2.A01;
        } else {
            transactionInfo = null;
        }
        PaymentDetails paymentDetails3 = A00(this).A01;
        S7g A002 = A00(this);
        PaymentDetailsUpdate paymentDetailsUpdate = paymentDetailsUpdatedResponse2.content;
        if (paymentDetailsUpdate != null) {
            paymentDetails = paymentDetailsUpdate.paymentDetails;
        } else {
            paymentDetails = null;
        }
        A002.A01 = paymentDetails;
        PaymentDetails paymentDetails4 = A00(this).A01;
        if (paymentDetails4 != null) {
            if (paymentDetails3 != null) {
                w3CShippingAddress2 = paymentDetails3.shippingAddress;
            } else {
                w3CShippingAddress2 = null;
            }
            paymentDetails4.shippingAddress = w3CShippingAddress2;
        }
        PaymentDetails paymentDetails5 = A00(this).A01;
        if (paymentDetails5 != null) {
            if (paymentDetails3 != null) {
                w3CShippingAddress = paymentDetails3.billingAddress;
            } else {
                w3CShippingAddress = null;
            }
            paymentDetails5.billingAddress = w3CShippingAddress;
        }
        PaymentDetailsUpdate paymentDetailsUpdate2 = paymentDetailsUpdatedResponse2.content;
        if (paymentDetailsUpdate2 == null || (paymentDetails2 = paymentDetailsUpdate2.paymentDetails) == null) {
            transactionInfo2 = null;
        } else {
            if (!(transactionInfo == null || (num2 = transactionInfo.A04) == null)) {
                int intValue = num2.intValue();
                if (intValue == 2) {
                    str2 = "PICKUP";
                } else if (intValue == 1) {
                    str2 = OffsiteShippingType$Companion.DELIVERY;
                }
                str3 = transactionInfo.A05;
                transactionInfo2 = C11090S9p.A00(paymentDetails2, str2, str3);
            }
            str2 = "SHIPPING";
            if (transactionInfo == null) {
                str3 = null;
                transactionInfo2 = C11090S9p.A00(paymentDetails2, str2, str3);
            }
            str3 = transactionInfo.A05;
            transactionInfo2 = C11090S9p.A00(paymentDetails2, str2, str3);
        }
        PaymentDetailsUpdate paymentDetailsUpdate3 = paymentDetailsUpdatedResponse2.content;
        if ((paymentDetailsUpdate3 == null || (errors2 = MessageParamsKt.getErrors(paymentDetailsUpdate3)) == null || errors2.isEmpty()) && paymentDetailsUpdatedResponse2.error == null) {
            A0A2 = SUj.A09(transactionInfo2);
        } else {
            z2 = false;
            if (transactionInfo2 != null || transactionInfo == null) {
                PaymentError paymentError = paymentDetailsUpdatedResponse2.error;
                if (paymentError != null) {
                    A0A2 = SUj.A0A((Object) null, new C8021QfA(paymentError.message));
                } else {
                    PaymentDetailsUpdate paymentDetailsUpdate4 = paymentDetailsUpdatedResponse2.content;
                    if (!(paymentDetailsUpdate4 == null || (errors = MessageParamsKt.getErrors(paymentDetailsUpdate4)) == null)) {
                        ArrayList A0r = AnonymousClass7TG.A0r(errors);
                        for (PaymentDataError paymentDataError : errors) {
                            PaymentDataErrorField paymentDataErrorField = paymentDataError.field;
                            if (paymentDataErrorField != null) {
                                str = paymentDataErrorField.toString();
                            } else {
                                str = null;
                            }
                            String name = paymentDataError.reason.name();
                            ArrayList A0v = DbS.A0v(r12);
                            for (Integer A022 : AnonymousClass05K.A00(13)) {
                                A0v.add(C11297SKg.A02(A022));
                            }
                            if (!A0v.contains(name) || name == null) {
                                num = AnonymousClass05K.A1F;
                            } else {
                                num = C11297SKg.A00(name);
                            }
                            A0r.add(new C10577RuX(str, num, paymentDataError.message));
                        }
                        list = 00k.A0a(A0r);
                    }
                    A0A2 = SUj.A0A(transactionInfo2, new C13222TQn(list));
                }
            } else {
                A0A2 = SUj.A09(transactionInfo);
            }
        }
        r6.A0B(A0A2);
        if (z2) {
            rEu = C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS;
        } else {
            rEu = C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL;
        }
        String A023 = A02(this);
        Map map = this.A0F;
        0qQ.A0B(map, 3);
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        A1H2.putAll(map);
        Pxj.A1U(A1H2, A0C2, A023);
        PaymentDetailsUpdate paymentDetailsUpdate5 = paymentDetailsUpdatedResponse2.content;
        ArrayList arrayList2 = null;
        if (paymentDetailsUpdate5 == null || (paymentDetailsUpdatedError2 = paymentDetailsUpdate5.shippingAddressErrors) == null || (values2 = paymentDetailsUpdatedError2.values()) == null) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass7TF.A0p(values2);
            for (PaymentDataError paymentDataError2 : values2) {
                DbU.A1X(paymentDataError2.reason, arrayList);
            }
        }
        PaymentDetailsUpdate paymentDetailsUpdate6 = paymentDetailsUpdatedResponse2.content;
        if (!(paymentDetailsUpdate6 == null || (paymentDetailsUpdatedError = paymentDetailsUpdate6.offerCodeErrors) == null || (values = paymentDetailsUpdatedError.values()) == null)) {
            arrayList2 = AnonymousClass7TF.A0p(values);
            for (PaymentDataError paymentDataError3 : values) {
                DbU.A1X(paymentDataError3.reason, arrayList2);
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (arrayList != null) {
            A1C.addAll(arrayList);
        }
        if (arrayList2 != null) {
            A1C.addAll(arrayList2);
        }
        PaymentError paymentError2 = paymentDetailsUpdatedResponse2.error;
        if (paymentError2 != null) {
            A1C.add(paymentError2.code);
        }
        A1H2.put("ERROR_CODE", A1C.toString());
        A1H2.put("REQUEST_TIMESTAMP", Long.valueOf(paymentDetailsUpdatedResponse2.timeStamp));
        A1H2.put("EVENT_EXTRA", A1H);
        A0H(rEu, A1H2);
    }

    public static final void A05(CheckoutHandler checkoutHandler, String str, String str2, Map map, Map map2, Map map3) {
        AnonymousClass2Fj r1 = checkoutHandler.A0P;
        String valueOf = String.valueOf(C12435SuM.A09.getAndIncrement());
        String str3 = checkoutHandler.A0B;
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String A0r = DbS.A0r(str2, (AbstractMap) C9971RkQ.A00.getValue());
        if (A0r == null) {
            A0r = "No error message";
        }
        r1.A0B(new PaymentResponseWithAdditionalData(new PaymentResponse(valueOf, str3, (PaymentResponseContent) null, currentTimeMillis, str, MessageType$Companion.PAYMENT_RESPONSE, new PaymentError(str2, A0r)), map3));
        if (map != null) {
            map.put("ERROR_CODE", str2);
            LinkedHashMap A0E2 = checkoutHandler.A0E("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL");
            Map map4 = map2;
            if (map2 != null) {
                Iterator A0s = AnonymousClass7TF.A0s(A0E2);
                while (A0s.hasNext()) {
                    Dbb.A1V(AnonymousClass7TE.A1J(A0s), map4);
                }
            } else {
                map.put("EVENT_EXTRA", A0E2);
            }
            checkoutHandler.A0H(C8902REu.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL, map);
        }
    }

    public static final void A06(CheckoutHandler checkoutHandler, String str, Map map) {
        if (checkoutHandler.A0a) {
            C11353SOm.A00().Cgl(str, map);
        }
    }

    public static final boolean A08(CheckoutHandler checkoutHandler) {
        if (checkoutHandler.A05 == null || A00(checkoutHandler).A03() == null || A00(checkoutHandler).A04() == null || checkoutHandler.A03 == null) {
            return false;
        }
        return true;
    }

    public final C13864Til A0A() {
        C13864Til til = this.A03;
        if (til != null) {
            return til;
        }
        0qQ.A0F("selectedProductConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (X.0qQ.A0K(r2, r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0C(com.facebookpay.offsite.models.message.PaymentRequestContent r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x0037
            boolean r0 = A08(r3)
            if (r0 == 0) goto L_0x0040
            X.S7g r0 = A00(r3)
            java.lang.String r2 = r0.A04()
            r0 = 0
            if (r4 == 0) goto L_0x003e
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = r1.partnerMerchantId
        L_0x001b:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0037
            X.S7g r1 = A00(r3)
            java.lang.String r2 = r1.A03()
            if (r4 == 0) goto L_0x0031
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = r1.partnerId
        L_0x0031:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0040
        L_0x0037:
            java.lang.String r0 = X.C2818159r.A01()
        L_0x003b:
            r3.A09 = r0
            return r0
        L_0x003e:
            r1 = r0
            goto L_0x001b
        L_0x0040:
            java.lang.String r0 = r3.A09
            if (r0 != 0) goto L_0x003b
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0C(com.facebookpay.offsite.models.message.PaymentRequestContent):java.lang.String");
    }

    public final LinkedHashMap A0D(PaymentRequest paymentRequest, C11023S6a s6a, String str) {
        PaymentRequestContent paymentRequestContent = paymentRequest.content;
        String A022 = A02(this);
        long j = paymentRequest.timeStamp;
        0sm A0E2 = 0Yt.A0E();
        DbW.A1N(paymentRequestContent, 0, A0E2);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Pxj.A1U(A1H, str, A022);
        A1H.put("MERCHANT_REQUEST_ID", paymentRequestContent.paymentConfiguration.requestId);
        A1H.put("PARTNER_MERCHANT_ID", paymentRequestContent.paymentConfiguration.partnerMerchantId);
        A1H.put("PARTNER_ID", paymentRequestContent.paymentConfiguration.partnerId);
        A1H.put("REQUEST_TIMESTAMP", Long.valueOf(j));
        A1H.put("EVENT_EXTRA", A0E2);
        String str2 = s6a.A01;
        if (str2 != null) {
            A1H.put("AD_ID", str2);
        }
        String str3 = s6a.A02;
        if (str3 != null) {
            A1H.put("IAB_SESSION_ID", str3);
        }
        return A1H;
    }

    public final void A0J(String str, Map map) {
        C8122QhE qhE = (C8122QhE) this;
        Map map2 = map;
        0qQ.A0B(map2, 1);
        String A002 = C9649ReT.A00(str);
        if (A002 != null) {
            UserSession A003 = C11431STx.A00();
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, A003, 36313514697361455L)) {
                qhE.A0H(C8902REu.CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_INIT, map2);
                if (qhE.A0T.A00(A002) != null) {
                    JTP.A1R("CACHE_AVAILABLE", map2, true);
                    qhE.A0H(C8902REu.CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_SUCCESS, map2);
                    qhE.A0O.A0A(A002);
                    return;
                }
                JTP.A1R("CACHE_AVAILABLE", map2, false);
                C9828Rhq rhq = qhE.A02;
                String A042 = 182.A04(r4, C11431STx.A00(), 36876464651042928L);
                C73949PmT pmT = new C73949PmT(qhE, map2, A002, 3);
                C13349TVw tVw = new C13349TVw(42, map2, qhE);
                String A12 = Pxe.A12(Locale.US, "https://%s.com/meta_checkout/merchant.js", C66581MXm.A1b(A042, 1));
                1OC A012 = AnonymousClass9D0.A01(1GK.A06.A00(new TNJ(A002, A12), 1208430023, 3, false, false).A02(new 1QY((AnonymousClass1O9) null), 1699372004, 3, true, false).A01(new T7Z(rhq, 3), 25281092, 3), "MetaCheckoutScript", A12);
                A012.A00 = new C8766R8r(3, tVw, pmT);
                1ES.A03(A012);
            }
        }
    }

    public final void A0K(Map map) {
        if (this.A03 != null && !map.containsKey("PRODUCT_ID") && A02(this).length() != 0 && TextUtils.isDigitsOnly(A02(this))) {
            map.put("PRODUCT_ID", DbV.A0q(A02(this)));
        }
    }

    public CheckoutHandler(Fragment fragment, FragmentActivity fragmentActivity, S51 s51, C262224Cq r6, boolean z) {
        this.A0M = fragment;
        this.A0a = z;
        this.A0U = s51;
        this.A0Z = r6;
        this.A0Y = AnonymousClass0eN.A01(new C13349TVw(41, fragmentActivity, this));
        this.A0Q = JTO.A0K();
        this.A0P = JTO.A0K();
        this.A0V = new AtomicReference("0");
        this.A0F = 0Yt.A0E();
        this.A0W = new AtomicReference("0");
        this.A0N = JTO.A0K();
        this.A0O = JTO.A0K();
        this.A0R = SUj.A00((Object) null);
        this.A0X = AnonymousClass0eN.A01(C13326TUz.A00);
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            Q6J A002 = Q6J.A00(fragmentActivity);
            this.A04 = A002;
            this.A00 = PhoneNumberUtil.A01(A002);
        }
    }

    public static S7g A00(CheckoutHandler checkoutHandler) {
        return checkoutHandler.A0A().An6();
    }

    public static String A02(CheckoutHandler checkoutHandler) {
        return checkoutHandler.A0A().getProductId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.A01 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r5 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r10.A0A().BbL() == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass2Fj r9, com.facebookpay.offsite.base.CheckoutHandler r10, java.lang.String r11, java.lang.String r12) {
        /*
            long r6 = java.lang.System.currentTimeMillis()
            X.S51 r4 = r10.A0U
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r2 = r10.A01
            X.Til r0 = r10.A0A()
            boolean r1 = r0.BnP()
            X.S7g r0 = A00(r10)
            X.S6a r0 = r0.A04
            if (r0 == 0) goto L_0x009c
            java.lang.String r5 = r0.A01
        L_0x001a:
            r8 = 0
            if (r2 == 0) goto L_0x009a
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L_0x009a
            X.RGo r0 = r0.A00
        L_0x0023:
            r3 = 0
            if (r0 == 0) goto L_0x002f
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.A01
            r2 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1 = 0
            if (r5 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            java.lang.String r0 = "AVAILABLE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0065
            if (r2 == 0) goto L_0x0065
            if (r1 == 0) goto L_0x0065
            X.0eM r0 = r4.A09
            java.lang.Object r1 = r0.getValue()
            X.0xa r1 = (X.0xa) r1
            java.lang.String r0 = "proactive_checkout_cooldown_start_time_ms"
            long r0 = X.DbW.A06(r1, r0)
            long r6 = r6 - r0
            X.0eM r0 = r4.A04
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r0 = X.C51970G9q.A1T(r0)
            if (r0 != 0) goto L_0x0065
            r3 = 1
        L_0x0065:
            r10.A0J = r3
            if (r3 == 0) goto L_0x0074
            X.Til r0 = r10.A0A()
            boolean r1 = r0.BbL()
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            r10.A0I = r0
            java.util.concurrent.atomic.AtomicLong r0 = X.C12435SuM.A09
            long r0 = r0.getAndIncrement()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            boolean r1 = r10.A0J
            java.lang.String r0 = r10.A0E
            com.facebookpay.offsite.models.message.AvailableMessageContent r3 = new com.facebookpay.offsite.models.message.AvailableMessageContent
            r3.<init>(r11, r1, r0)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "fbpayAvailableResponse"
            com.facebookpay.offsite.models.message.AvailabilityResponse r1 = new com.facebookpay.offsite.models.message.AvailabilityResponse
            r6 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.A0B(r1)
            return
        L_0x009a:
            r0 = r8
            goto L_0x0023
        L_0x009c:
            r5 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A03(X.2Fj, com.facebookpay.offsite.base.CheckoutHandler, java.lang.String, java.lang.String):void");
    }

    public static final void A04(CheckoutHandler checkoutHandler) {
        ECPPaymentResponseParams eCPPaymentResponseParams = A00(checkoutHandler).A00;
        if (A08(checkoutHandler) && eCPPaymentResponseParams != null) {
            AnonymousClass7TE.A1Z(new MHD((Object) eCPPaymentResponseParams, (Object) checkoutHandler, (AnonymousClass4D7) null, 10), checkoutHandler.A0Z);
        }
    }

    private final void A07(C11023S6a s6a, Map map) {
        map.put("isNuxUser", String.valueOf(A00(this).A06));
        map.put("clickSourceFromIAW", s6a.A00);
        Map map2 = s6a.A05;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.putAll(A0E("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"));
    }

    public final void A0H(C8902REu rEu, Map map) {
        AnonymousClass7TG.A1N(rEu, map);
        if (this.A0a) {
            A0K(map);
            C11418SSt.A03(rEu, map);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: com.facebookpay.expresscheckout.models.DefaultCreditCardFields} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.JUK, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A01(X.AnonymousClass2Fj r35, com.facebookpay.offsite.base.CheckoutHandler r36, com.facebookpay.offsite.models.message.PaymentRequest r37, X.C11023S6a r38, java.lang.Boolean r39, java.util.List r40, java.util.Map r41, java.util.Map r42, X.AnonymousClass4D7 r43) {
        /*
            r1 = r36
            r2 = r37
            r3 = r35
            r8 = r38
            r4 = r41
            r5 = r42
            r10 = 4
            r11 = r43
            boolean r0 = X.JUK.A02(r10, r11)
            if (r0 == 0) goto L_0x0341
            r7 = r11
            X.JUK r7 = (X.JUK) r7
            int r9 = r7.A00
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r9 & r6
            if (r0 == 0) goto L_0x0341
            int r9 = r9 - r6
            r7.A00 = r9
        L_0x0023:
            java.lang.Object r13 = r7.A09
            X.1Hj r23 = X.1Hj.A02
            int r9 = r7.A00
            java.lang.String r22 = "AVAILABILITY_PRODUCT_VERIFICATION"
            java.lang.String r21 = "NOT_AVAILABLE"
            java.lang.String r20 = "ERROR_CODE"
            r19 = 2
            r18 = 0
            r6 = 1
            if (r9 == 0) goto L_0x0114
            if (r9 == r6) goto L_0x01c8
            r0 = r19
            if (r9 != r0) goto L_0x0348
            java.lang.Object r11 = r7.A08
            X.QXO r11 = (X.QXO) r11
            java.lang.Object r10 = r7.A07
            X.0rm r10 = (X.0rm) r10
            java.lang.Object r5 = r7.A06
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r7.A05
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r8 = r7.A04
            X.S6a r8 = (X.C11023S6a) r8
            java.lang.Object r3 = r7.A03
            X.2Fj r3 = (X.AnonymousClass2Fj) r3
            java.lang.Object r2 = r7.A02
            com.facebookpay.offsite.models.message.PaymentRequest r2 = (com.facebookpay.offsite.models.message.PaymentRequest) r2
            java.lang.Object r1 = r7.A01
            com.facebookpay.offsite.base.CheckoutHandler r1 = (com.facebookpay.offsite.base.CheckoutHandler) r1
            X.0eS.A00(r13)
        L_0x005f:
            boolean r0 = X.AnonymousClass7TE.A1a(r13)
            if (r0 != 0) goto L_0x010d
            X.S7g r12 = A00(r1)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r13 = X.C11353SOm.A01()
            com.google.common.collect.ImmutableList r0 = r11.A0E()
            X.0qQ.A07(r0)
            java.util.LinkedHashSet r9 = X.C11432SUd.A0I(r0)
            java.util.LinkedHashSet r7 = X.C11432SUd.A0H(r11)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            java.lang.String r0 = X.C9650ReU.A00(r0)
            boolean r0 = r13.A07(r0, r9, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.A06 = r0
            X.Til r0 = r1.A0A()
            boolean r0 = r0.Bfw()
            if (r0 == 0) goto L_0x0334
            r1.A07(r8, r5)
            X.REu r0 = X.C8902REu.CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS
            r10.A00 = r0
            r1.A0H = r6
            X.S7g r0 = A00(r1)
            com.facebookpay.offsite.models.message.PaymentRequest r0 = r0.A02
            if (r0 == 0) goto L_0x0112
            java.lang.String r6 = com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(r0)
        L_0x00ab:
            java.lang.String r0 = "JS_SDK"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x00c2
            X.Til r0 = r1.A0A()
            boolean r0 = r0.B17()
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = r8.A04
            r1.A0J(r0, r4)
        L_0x00c2:
            java.lang.String r21 = "AVAILABLE"
        L_0x00c4:
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r6 = X.C11353SOm.A01()
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            java.lang.String r0 = X.C9650ReU.A00(r0)
            boolean r0 = r6.A06(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "CACHE_AVAILABLE"
            r4.put(r0, r6)
            if (r21 == 0) goto L_0x010d
            X.S7g r0 = A00(r1)
            com.facebookpay.offsite.models.message.PaymentRequest r0 = r0.A02
            if (r0 == 0) goto L_0x0110
            java.lang.String r6 = com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(r0)
        L_0x00e9:
            java.lang.String r0 = "JS_SDK"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x00fa
            if (r3 == 0) goto L_0x00fa
            java.lang.String r2 = r2.msgId
            r0 = r21
            A03(r3, r1, r0, r2)
        L_0x00fa:
            X.Til r0 = r1.A0A()
            r0.E33(r4)
            java.lang.String r0 = "EVENT_EXTRA"
            r4.put(r0, r5)
            java.lang.Object r0 = r10.A00
            X.REu r0 = (X.C8902REu) r0
            r1.A0H(r0, r4)
        L_0x010d:
            X.0gF r23 = X.C60340gF.A00
            return r23
        L_0x0110:
            r6 = 0
            goto L_0x00e9
        L_0x0112:
            r6 = 0
            goto L_0x00ab
        L_0x0114:
            X.0eS.A00(r13)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            java.lang.String r0 = r1.A0C(r0)
            com.facebookpay.offsite.models.message.PaymentRequestContent r9 = r2.content
            java.lang.String r38 = X.C9650ReU.A00(r9)
            X.S7g r9 = A00(r1)
            java.lang.String r9 = r9.A07
            r16 = r9
            X.Til r9 = r1.A0A()
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r9 = X.C9648ReS.A00(r9, r2)
            if (r9 == 0) goto L_0x0157
            java.lang.String r9 = r9.A02
            r15 = r9
        L_0x0138:
            com.facebookpay.offsite.models.message.PaymentRequestContent r9 = r2.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r9 = r9.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r9 = r9.mode
            if (r9 == 0) goto L_0x015a
            java.lang.String r10 = r9.toString()
            r9 = 0
            X.0qQ.A0B(r10, r9)
            java.util.Map r9 = X.RFA.A01
            java.lang.Object r9 = r9.get(r10)
            if (r9 != 0) goto L_0x015a
            java.lang.String r0 = "PaymentEnv is not found for identifier => "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r10)
            throw r0
        L_0x0157:
            r15 = r18
            goto L_0x0138
        L_0x015a:
            com.facebookpay.logging.LoggingPolicy r36 = X.C11418SSt.A00
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            r9 = r39
            boolean r9 = X.0qQ.A0K(r9, r13)
            if (r9 == 0) goto L_0x01c5
            com.facebookpay.offsite.models.message.PaymentRequestContent r9 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r14 = r9.paymentOptions
            r31 = 0
            X.AnonymousClass2E0.A0D()
            X.AnonymousClass2E0.A0D()
            com.instagram.common.session.UserSession r12 = X.C11431STx.A00()
            X.0Tu r11 = X.0Tu.A06
            r9 = 36313428797622230(0x8102df000f07d6, double:3.028096821832881E-306)
            boolean r34 = X.182.A06(r11, r12, r9)
            X.AnonymousClass2E0.A0D()
            r25 = r18
            r27 = r13
            r28 = r18
            r29 = r18
            r30 = r18
            r32 = r6
            r33 = r6
            r35 = r31
            r24 = r18
            r26 = r14
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r35 = X.SQ3.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x019e:
            r7.A01 = r1
            r7.A02 = r2
            r7.A03 = r3
            r7.A04 = r8
            r7.A05 = r4
            r7.A06 = r5
            r7.A07 = r0
            r7.A00 = r6
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r34 = X.C11353SOm.A01()
            r41 = r40
            r37 = r0
            r39 = r16
            r40 = r15
            r42 = r7
            java.lang.Object r13 = r34.A04(r35, r36, r37, r38, r39, r40, r41, r42)
            r9 = r23
            if (r13 != r9) goto L_0x01e7
            return r23
        L_0x01c5:
            r35 = r18
            goto L_0x019e
        L_0x01c8:
            java.lang.Object r0 = r7.A07
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r7.A06
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r7.A05
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r8 = r7.A04
            X.S6a r8 = (X.C11023S6a) r8
            java.lang.Object r3 = r7.A03
            X.2Fj r3 = (X.AnonymousClass2Fj) r3
            java.lang.Object r2 = r7.A02
            com.facebookpay.offsite.models.message.PaymentRequest r2 = (com.facebookpay.offsite.models.message.PaymentRequest) r2
            java.lang.Object r1 = r7.A01
            com.facebookpay.offsite.base.CheckoutHandler r1 = (com.facebookpay.offsite.base.CheckoutHandler) r1
            X.0eS.A00(r13)
        L_0x01e7:
            X.SUj r13 = (X.SUj) r13
            X.S7g r9 = A00(r1)
            r9.A04 = r8
            X.S7g r9 = A00(r1)
            r9.A02 = r2
            X.S7g r9 = A00(r1)
            r9.A05 = r13
            X.Til r16 = r1.A0A()
            java.lang.Object r12 = r13.A01
            com.facebookpay.expresscheckout.models.CheckoutAvailability r12 = (com.facebookpay.expresscheckout.models.CheckoutAvailability) r12
            r14 = 0
            if (r12 == 0) goto L_0x021f
            X.RyJ r9 = r12.A00
            X.QSl r9 = r9.A01
            r11 = r9
            X.RGR r10 = X.RGR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r9 = 3
            java.lang.String r15 = "ecp_branding_update_topics"
            com.google.common.collect.ImmutableList r10 = r11.getRequiredCompactedEnumListField(r9, r15, r10)
            if (r10 == 0) goto L_0x021f
            X.RGR r9 = X.RGR.HEADER
            boolean r9 = r10.contains(r9)
            if (r9 != r6) goto L_0x021f
            r14 = 1
        L_0x021f:
            r9 = r16
            r9.Ekm(r14)
            X.0rm r10 = X.C51965G9l.A11()
            X.REu r9 = X.C8902REu.CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL
            r10.A00 = r9
            X.RDz r9 = r13.A00
            if (r9 == 0) goto L_0x0352
            int r11 = r9.ordinal()
            r9 = r19
            if (r11 == r9) goto L_0x033d
            if (r11 == r6) goto L_0x02ee
            r17 = 0
            r9 = r17
            if (r11 != r9) goto L_0x0352
            if (r12 == 0) goto L_0x034d
            X.RyJ r9 = r12.A00
            r24 = r9
            X.QXO r11 = r9.A00
            X.Til r9 = r1.A0A()
            boolean r9 = r9.BbL()
            if (r9 == 0) goto L_0x02eb
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r13 = X.C11353SOm.A01()
            com.facebookpay.offsite.models.message.PaymentRequestContent r9 = r2.content
            java.lang.String r14 = X.C9650ReU.A00(r9)
            X.0eM r9 = r13.A08
            java.lang.Object r16 = r9.getValue()
            r9 = r16
            X.Stc r9 = (X.Stc) r9
            r16 = r9
            r13 = 0
            X.SJ1 r15 = new X.SJ1
            r15.<init>(r13, r14)
            r9 = r16
            X.SUj r9 = r9.A07(r15)
            if (r9 == 0) goto L_0x0297
            java.lang.Object r14 = r9.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r14 = (com.facebookpay.paymentmethod.model.PaymentMethod) r14
            if (r14 == 0) goto L_0x0297
            boolean r9 = r14 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r9 == 0) goto L_0x0291
            com.facebookpay.paymentmethod.model.CreditCard r14 = (com.facebookpay.paymentmethod.model.CreditCard) r14
            if (r14 == 0) goto L_0x0291
            X.RGo r9 = r14.A01()
            java.lang.String r14 = X.Pxj.A0q(r14)
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r13 = new com.facebookpay.expresscheckout.models.DefaultCreditCardFields
            r13.<init>(r9, r14)
        L_0x0291:
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r9 = new com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields
            r9.<init>(r13)
            r13 = r9
        L_0x0297:
            r1.A01 = r13
            java.lang.String r12 = r12.A01
            if (r12 == 0) goto L_0x02a3
            X.S7g r9 = A00(r1)
            r9.A07 = r12
        L_0x02a3:
            r9 = r24
            X.QSl r13 = r9.A01
            java.lang.String r12 = "is_ecp_available"
            r9 = r17
            java.lang.Boolean r9 = X.C41846B3n.A0d(r13, r12, r9)
            boolean r9 = X.AnonymousClass7TF.A1Y(r9, r6)
            if (r9 == 0) goto L_0x030d
            X.Til r13 = r1.A0A()
            X.IoR r12 = new X.IoR
            r24 = r12
            r25 = r17
            r26 = r8
            r27 = r4
            r28 = r3
            r29 = r5
            r30 = r2
            r31 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r7.A01 = r1
            r7.A02 = r2
            r7.A03 = r3
            r7.A04 = r8
            r7.A05 = r4
            r7.A06 = r5
            r7.A07 = r10
            r7.A08 = r11
            r9 = r19
            r7.A00 = r9
            java.lang.Boolean r13 = r13.EsL(r0, r7, r12)
            r0 = r23
            if (r13 != r0) goto L_0x005f
            return r23
        L_0x02eb:
            r13 = r18
            goto L_0x0297
        L_0x02ee:
            java.lang.String r6 = "UNKNOWN"
            r0 = r20
            r5.put(r0, r6)
            java.util.Locale r6 = java.util.Locale.ROOT
            X.0qQ.A08(r6)
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r20 = X.DbT.A12(r6, r0)
            java.lang.Throwable r0 = r13.A02
            if (r0 == 0) goto L_0x030a
            java.lang.String r22 = r0.getMessage()
            if (r22 != 0) goto L_0x0334
        L_0x030a:
            java.lang.String r22 = "No error message"
            goto L_0x0334
        L_0x030d:
            X.S7g r9 = A00(r1)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r8 = X.C11353SOm.A01()
            com.google.common.collect.ImmutableList r0 = r11.A0E()
            X.0qQ.A07(r0)
            java.util.LinkedHashSet r7 = X.C11432SUd.A0I(r0)
            java.util.LinkedHashSet r6 = X.C11432SUd.A0H(r11)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            java.lang.String r0 = X.C9650ReU.A00(r0)
            boolean r0 = r8.A07(r0, r7, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A06 = r0
        L_0x0334:
            r6 = r20
            r0 = r22
            r5.put(r6, r0)
            goto L_0x00c4
        L_0x033d:
            r21 = r18
            goto L_0x00c4
        L_0x0341:
            X.JUK r7 = new X.JUK
            r7.<init>(r1, r11, r10)
            goto L_0x0023
        L_0x0348:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x034d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0352:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A01(X.2Fj, com.facebookpay.offsite.base.CheckoutHandler, com.facebookpay.offsite.models.message.PaymentRequest, X.S6a, java.lang.Boolean, java.util.List, java.util.Map, java.util.Map, X.4D7):java.lang.Object");
    }
}
