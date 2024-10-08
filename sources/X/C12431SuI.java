package X;

import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentItem;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOffer;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentPickupInfo;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentUXFlags;
import com.facebookpay.offsite.models.message.SessionUsageType;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SuI  reason: case insensitive filesystem */
public abstract class C12431SuI implements C13864Til {
    public S7g A00;
    public boolean A01;

    public final List Bb2(C10857RzI rzI) {
        List<PaymentOffer> list;
        String str;
        ShippingAddress shippingAddress;
        W3CShippingAddress w3CShippingAddress;
        String str2;
        PaymentPickupInfo paymentPickupInfo;
        String str3;
        W3CShippingAddress w3CShippingAddress2;
        String str4;
        ArrayList A1C = AnonymousClass7TE.A1C();
        S7g s7g = this.A00;
        PaymentDetails paymentDetails = s7g.A01;
        if (paymentDetails == null || (list = paymentDetails.offers) == null) {
            list = 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (PaymentOffer paymentOffer : list) {
            A0r.add(paymentOffer.code);
        }
        if (!0su.A0c(A0r.toArray(new String[0]), rzI.A0C.toArray(new String[0]))) {
            A1C.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        String str5 = rzI.A0A;
        String str6 = null;
        if (str5 != null) {
            PaymentDetails paymentDetails2 = s7g.A01;
            if (paymentDetails2 != null) {
                str4 = paymentDetails2.shippingOptionId;
            } else {
                str4 = null;
            }
            if (!0qQ.A0K(str4, str5)) {
                A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
            }
        }
        ShippingAddress shippingAddress2 = rzI.A01;
        if (shippingAddress2 != null) {
            PaymentDetails paymentDetails3 = s7g.A01;
            if (paymentDetails3 != null) {
                w3CShippingAddress2 = paymentDetails3.shippingAddress;
            } else {
                w3CShippingAddress2 = null;
            }
            if (!C11299SKj.A02(w3CShippingAddress2, C11299SKj.A01(shippingAddress2, (String) null))) {
                A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
            }
        }
        String str7 = rzI.A06;
        if (str7 != null) {
            PaymentDetails paymentDetails4 = s7g.A01;
            if (paymentDetails4 != null) {
                str3 = paymentDetails4.fulfillmentOptionId;
            } else {
                str3 = null;
            }
            if (!0qQ.A0K(str3, str7)) {
                A1C.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
            }
        }
        String str8 = rzI.A09;
        if (str8 != null) {
            PaymentDetails paymentDetails5 = s7g.A01;
            if (paymentDetails5 == null || (paymentPickupInfo = paymentDetails5.pickupInfo) == null) {
                str2 = null;
            } else {
                str2 = paymentPickupInfo.pickupRadiusZipCode;
            }
            if (!0qQ.A0K(str2, str8)) {
                A1C.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
            }
        }
        if (A01() == null && (shippingAddress = rzI.A00) != null) {
            PaymentDetails paymentDetails6 = s7g.A01;
            if (paymentDetails6 != null) {
                w3CShippingAddress = paymentDetails6.billingAddress;
            } else {
                w3CShippingAddress = null;
            }
            if (!C11299SKj.A02(w3CShippingAddress, C11299SKj.A01(shippingAddress, (String) null))) {
                A1C.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
            }
        }
        if (A01() != null) {
            String str9 = rzI.A05;
            if (str9 != null) {
                PaymentDetails paymentDetails7 = s7g.A01;
                if (paymentDetails7 != null) {
                    str = paymentDetails7.emailId;
                } else {
                    str = null;
                }
                if (!0qQ.A0K(str, str9)) {
                    A1C.add(PaymentDetailChangeTypes$Companion.EMAIL);
                }
            }
            String str10 = rzI.A08;
            if (str10 != null) {
                PaymentDetails paymentDetails8 = s7g.A01;
                if (paymentDetails8 != null) {
                    str6 = paymentDetails8.phoneId;
                }
                if (!0qQ.A0K(str6, str10)) {
                    A1C.add(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
                }
            }
        }
        if (A01() == null || !0qQ.A0K(rzI.A03, "DEFAULT") || A1C.size() != 1) {
            return A1C;
        }
        if (A1C.contains(PaymentDetailChangeTypes$Companion.OFFERS) || A1C.contains(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID) || A1C.contains(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID)) {
            return 0sn.A00;
        }
        return A1C;
    }

    private final boolean A00() {
        String str;
        String str2;
        S7g s7g = this.A00;
        PaymentReceiverInfo A002 = s7g.A00();
        if (A002 != null) {
            str = A002.A02;
        } else {
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            UserSession A003 = C11431STx.A00();
            0Tu r6 = 0Tu.A06;
            if (00l.A0Q(182.A04(r6, A003, 36884852720796235L), new char[]{','}, 0).contains(str)) {
                C11023S6a s6a = s7g.A04;
                if (s6a == null || (str2 = s6a.A01) == null || str2.length() == 0) {
                    return true;
                }
                if (00l.A0Q(182.A04(r6, C11431STx.A00(), 36884852720927308L), new char[]{','}, 0).contains(str2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.ReR, java.lang.Object] */
    public final C9647ReR A01() {
        S7g s7g = this.A00;
        if (0qQ.A0K(s7g.A03(), "FIRMLY_TEST") || 0qQ.A0K(s7g.A03(), "FIRMLY_PROD")) {
            return new Object();
        }
        return null;
    }

    public final PaymentRequest AMa() {
        if (A01() == null) {
            return null;
        }
        S7g s7g = this.A00;
        String A03 = s7g.A03();
        String A04 = s7g.A04();
        PaymentMode A012 = s7g.A01();
        0qQ.A0B(A012, 2);
        if (A03 == null || A04 == null) {
            return null;
        }
        boolean z = !DbX.A0x(182.A04(0Tu.A05, C11431STx.A00(), 36876464651370609L)).contains(Pxe.A12(Locale.ROOT, "%s::%s", Pxf.A1X(A03, A04, 2)));
        return new PaymentRequest("", new PaymentRequestContent(new PaymentDetails((PaymentItem) null, AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C(), (String) null, (String) null, (W3CShippingAddress) null, (W3CShippingAddress) null, (List) null, (PaymentPickupInfo) null, (String) null, (String) null), new PaymentOptions(false, z, z, true, true, (String) null, (String) null, (String) null, true, false, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null), new PaymentConfiguration("", A03, A04, AnonymousClass7TF.A0w(PaymentContainerType.FIRMLY_TOKEN_V1, 0Yt.A0E()), A012, (String) null, (String) null, "", "", JTP.A0y(PaymentUXFlags.META_CHECKOUT), (SessionUsageType) null, (String) null, (String) null, (String) null)), System.currentTimeMillis(), (String) null, MessageType$Companion.PAYMENT_REQUEST, (PaymentError) null);
    }

    public final Set AbC(PaymentRequest paymentRequest) {
        01I r2 = new 01I();
        Set<PaymentContainerType> keySet = paymentRequest.content.paymentConfiguration.supportedContainers.keySet();
        ArrayList A0r = AnonymousClass7TG.A0r(keySet);
        Iterator<PaymentContainerType> it = keySet.iterator();
        while (it.hasNext()) {
            C11083S9d.A01(A0r, it);
        }
        0sl A06 = this.A00.A06();
        if (A06 == null) {
            A06 = 0sl.A00;
        }
        Set A0l = 00k.A0l(A0r, 00k.A0k(A06));
        if (A0l.contains(C8914RFh.BASIC_CARD_V1) || A0l.contains(C8914RFh.ECOM_TOKEN_V1) || A0l.contains(C8914RFh.FIRMLY_TOKEN_V1)) {
            r2.add(C8881RDy.CARDS);
        }
        if (A0l.contains(C8914RFh.PAYPAL_OTC_V1)) {
            r2.add(C8881RDy.PAYPAL_OTC);
        }
        return 0kH.A04(r2);
    }

    public final S7g An6() {
        return this.A00;
    }

    public final boolean B13() {
        return true;
    }

    public final Boolean B1E() {
        return null;
    }

    public final boolean B1F() {
        return true;
    }

    public final boolean B1G() {
        return true;
    }

    public final boolean Bfw() {
        String str;
        Set A05;
        SUj sUj;
        CheckoutAvailability checkoutAvailability;
        ImmutableList requiredCompactedEnumListField;
        Set set;
        Boolean bool;
        C8892REj rEj;
        Set A052;
        S7g s7g = this.A00;
        PaymentRequest paymentRequest = s7g.A02;
        if (paymentRequest != null) {
            str = OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(paymentRequest);
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, AvailabilityInitiator$Companion.INITIATOR_JS_SDK)) {
            return true;
        }
        Set A06 = s7g.A06();
        if (!(A06 == null || (A05 = s7g.A05()) == null || 00k.A0l(A05, A06).isEmpty())) {
            if (A01() != null) {
                return true;
            }
            if (!182.A06(0Tu.A05, C11431STx.A00(), 36313514697033771L) || (sUj = s7g.A05) == null || (checkoutAvailability = (CheckoutAvailability) sUj.A01) == null || (requiredCompactedEnumListField = checkoutAvailability.A00.A01.getRequiredCompactedEnumListField(2, "availability_conditions", RGQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null || !requiredCompactedEnumListField.contains(RGQ.MC_PUX_C)) {
                return true;
            }
            Set A062 = s7g.A06();
            if (A062 == null || (A052 = s7g.A05()) == null) {
                set = 0sl.A00;
            } else {
                set = 00k.A0l(A052, A062);
            }
            List<C8914RFh> A0a = 00k.A0a(set);
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C8914RFh ordinal : A0a) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0 || ordinal2 == 5) {
                    rEj = C8892REj.USER_INFO_PAYMENT_METHODS_BASIC_CARDS;
                } else if (ordinal2 == 2) {
                    rEj = C8892REj.USER_INFO_PAYMENT_METHODS_TOKENIZED_CARDS;
                }
                A1C.add(rEj);
            }
            if (AnonymousClass7TE.A1b(A1C)) {
                LinkedHashMap A002 = C9624Re3.A00(00k.A0k(A1C));
                if (!A002.isEmpty()) {
                    Iterator it = A1C.iterator();
                    if (it.hasNext()) {
                        Object obj = A002.get(it.next());
                        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null || !bool.booleanValue()) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean BnP() {
        return false;
    }

    public final boolean Bub() {
        return this.A01;
    }

    public final boolean Buf() {
        return false;
    }

    public final Boolean CPY() {
        String str;
        PaymentReceiverInfo A002 = this.A00.A00();
        if (A002 == null || (str = A002.A00) == null) {
            return null;
        }
        Object obj = DbV.A18(str, "::").get(1);
        AnonymousClass2E0.A0D();
        return Boolean.valueOf(0sn.A00.contains(obj));
    }

    public final void E33(Map map) {
        ArrayList arrayList;
        S7g s7g = this.A00;
        if (s7g.A02 != null) {
            C58751Iwy iwy = new C58751Iwy(39, map, this, C9624Re3.A00(03t.A0K(C8892REj.values())));
            for (Object invoke : C11418SSt.A03) {
                iwy.invoke(invoke);
            }
            Set<C8914RFh> A05 = s7g.A05();
            if (A05 != null) {
                arrayList = AnonymousClass7TG.A0r(A05);
                for (C8914RFh rFh : A05) {
                    arrayList.add(rFh.A00);
                }
            } else {
                arrayList = 0sn.A00;
            }
            map.put("MERCHANT_CONTAINER_TYPES", arrayList);
        }
    }

    public final void Ekm(boolean z) {
        this.A01 = z;
    }

    public final void clear() {
        S7g s7g = this.A00;
        s7g.A07 = null;
        s7g.A06 = null;
        s7g.A00 = null;
        s7g.A03 = null;
        s7g.A01 = null;
    }

    public final String getProductId() {
        return "1302814060304063";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S7g, java.lang.Object] */
    public C12431SuI() {
        ? obj = new Object();
        obj.A02 = null;
        obj.A05 = null;
        obj.A04 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A00 = null;
        obj.A03 = null;
        obj.A01 = null;
        this.A00 = obj;
    }

    public final boolean B17() {
        return AnonymousClass7TF.A1V(A01());
    }

    public final Boolean B1A() {
        if (A00()) {
            return null;
        }
        Boolean A0R = AnonymousClass7TF.A0R(0Tu.A06, C11431STx.A00(), 36321902767253329L);
        0qQ.A0A(A0R);
        return A0R;
    }

    public final boolean B1C() {
        if (A01() != null) {
            return false;
        }
        return true;
    }

    public final boolean B1I() {
        return AnonymousClass7TF.A1V(A01());
    }

    public final boolean B7H() {
        return AnonymousClass7TF.A1V(A01());
    }

    public final boolean C2I() {
        return AnonymousClass7TF.A1V(A01());
    }

    public final boolean CQ6() {
        if (A01() != null) {
            return false;
        }
        return 182.A06(0Tu.A05, C11431STx.A00(), 36313514697295918L);
    }

    public final void Ci2() {
        Set set;
        Set A05;
        if (A00()) {
            S7g s7g = this.A00;
            Set A06 = s7g.A06();
            if (A06 == null || (A05 = s7g.A05()) == null) {
                set = 0sl.A00;
            } else {
                set = 00k.A0l(A05, A06);
            }
            if (set.contains(C8914RFh.ECOM_TOKEN_V1)) {
                if (!182.A06(0Tu.A06, C11431STx.A00(), 36321902767581011L) || AnonymousClass2E0.A01().A0D.A0C(new SJ1((OtcInput) null, "1302814060304063"), RFC.TOKENIZED_CARD)) {
                    182.A06(0Tu.A05, C11431STx.A00(), 36313514697558065L);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.0r1, java.lang.Object] */
    public final Boolean EsL(String str, AnonymousClass4D7 r6, C62320sa r7) {
        boolean z;
        String str2;
        if (A01() == null) {
            if (182.A06(0Tu.A05, C11431STx.A00(), 36313514697033771L)) {
                PaymentRequest paymentRequest = this.A00.A02;
                if (paymentRequest != null) {
                    str2 = OffsiteInitAvailabilityRequestKt.isIAWAvailabilityRequest(paymentRequest);
                } else {
                    str2 = null;
                }
                if (!0qQ.A0K(str2, AvailabilityInitiator$Companion.INITIATOR_JS_SDK)) {
                    AnonymousClass2gB A05 = AnonymousClass2E0.A01().A0D.A05(new SJ1((OtcInput) null, "1302814060304063"));
                    ? obj = new Object();
                    obj.A00 = C51969G9p.A1a(A05.A08, 2Fk.A0A);
                    A05.A09(new C11637Sdf(0, r7, this, obj, A05));
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
