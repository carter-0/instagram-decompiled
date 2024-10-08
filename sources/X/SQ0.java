package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class SQ0 {
    public static final ECPPaymentRequest A01(C10797RyJ ryJ, ECPPaymentRequest eCPPaymentRequest, TransactionInfo transactionInfo) {
        String str;
        Set set;
        Set set2;
        CheckoutConfiguration checkoutConfiguration;
        C10797RyJ ryJ2 = ryJ;
        QTJ qtj = ryJ2.A04;
        String optionalStringField = qtj.getOptionalStringField(0, "strong_id__");
        String A08 = qtj.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        String A09 = qtj.A09("image");
        ECPPaymentRequest eCPPaymentRequest2 = eCPPaymentRequest;
        PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest2.A05;
        APMConfiguration aPMConfiguration = null;
        if (paymentReceiverInfo != null) {
            str = paymentReceiverInfo.A00;
        } else {
            str = null;
        }
        PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(optionalStringField, A08, A09, str);
        QXO qxo = ryJ2.A00;
        ImmutableList A0E = qxo.A0E();
        if (A0E != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0E.iterator();
            while (it.hasNext()) {
                C298525tb r0 = (C298525tb) it.next();
                0qQ.A0A(r0);
                REn A05 = C11432SUd.A05(r0);
                if (A05 != null) {
                    A1C.add(A05);
                }
            }
            set = 00k.A0k(A1C);
        } else {
            set = null;
        }
        ImmutableList requiredCompactedEnumListField = qxo.getRequiredCompactedEnumListField(3, "request_fields", C8928RFw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (requiredCompactedEnumListField != null) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = requiredCompactedEnumListField.iterator();
            while (it2.hasNext()) {
                C8928RFw rFw = (C8928RFw) it2.next();
                0qQ.A0A(rFw);
                C8891REi A06 = C11432SUd.A06(rFw);
                if (A06 != null) {
                    A1C2.add(A06);
                }
            }
            set2 = 00k.A0k(A1C2);
        } else {
            set2 = null;
        }
        CheckoutConfiguration checkoutConfiguration2 = eCPPaymentRequest2.A01;
        if (checkoutConfiguration2 != null) {
            APMConfiguration aPMConfiguration2 = checkoutConfiguration2.A01;
            if (aPMConfiguration2 == null) {
                C13925TlT tlT = ryJ2.A05;
                if (tlT != null) {
                    aPMConfiguration = new APMConfigurationImpl(tlT);
                }
            } else {
                aPMConfiguration = aPMConfiguration2;
            }
            Set<REn> set3 = checkoutConfiguration2.A0H;
            Set set4 = 0sl.A00;
            Set A0n = 00k.A0n(set4, set3);
            if (set == null) {
                set = set4;
            }
            Set A0n2 = 00k.A0n(A0n, set);
            Set A0n3 = 00k.A0n(set4, checkoutConfiguration2.A0I);
            if (set2 == null) {
                set2 = set4;
            }
            Set A0n4 = 00k.A0n(A0n3, set2);
            String str2 = checkoutConfiguration2.A0E;
            boolean z = checkoutConfiguration2.A0J;
            String str3 = checkoutConfiguration2.A0G;
            C8942RGk rGk = checkoutConfiguration2.A02;
            C8942RGk rGk2 = checkoutConfiguration2.A03;
            Boolean bool = checkoutConfiguration2.A09;
            Boolean bool2 = checkoutConfiguration2.A0A;
            Boolean bool3 = checkoutConfiguration2.A05;
            Boolean bool4 = checkoutConfiguration2.A0C;
            String str4 = checkoutConfiguration2.A0F;
            Boolean bool5 = checkoutConfiguration2.A04;
            Boolean bool6 = checkoutConfiguration2.A06;
            Integer num = checkoutConfiguration2.A0D;
            Boolean bool7 = checkoutConfiguration2.A08;
            int i = checkoutConfiguration2.A00;
            boolean z2 = checkoutConfiguration2.A0K;
            Boolean bool8 = checkoutConfiguration2.A07;
            boolean z3 = checkoutConfiguration2.A0L;
            Boolean bool9 = checkoutConfiguration2.A0B;
            AnonymousClass7TG.A1O(A0n2, A0n4);
            checkoutConfiguration = new CheckoutConfiguration(aPMConfiguration, rGk, rGk2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, str3, str2, str4, A0n2, A0n4, i, z, z2, z3);
        } else {
            checkoutConfiguration = null;
        }
        ECPPaymentConfiguration eCPPaymentConfiguration = eCPPaymentRequest2.A03;
        if (eCPPaymentConfiguration == null) {
            QTG qtg = ryJ2.A03;
            TransactionInfo transactionInfo2 = transactionInfo;
            if (transactionInfo != null) {
                String str5 = eCPPaymentRequest2.A07;
                if (str5 != null) {
                    eCPPaymentConfiguration = C11432SUd.A0A(qtg, transactionInfo2, str5);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        String str6 = eCPPaymentRequest2.A0A;
        String str7 = eCPPaymentRequest2.A08;
        EcpUIConfiguration ecpUIConfiguration = eCPPaymentRequest2.A04;
        String str8 = eCPPaymentRequest2.A07;
        return new ECPPaymentRequest(checkoutConfiguration, eCPPaymentRequest2.A02, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo2, eCPPaymentRequest2.A06, str6, str7, eCPPaymentRequest2.A09, str8, eCPPaymentRequest2.A00, false);
    }

    public static final PuxTermsConditionItem A00(C7740QVd qVd) {
        C7X c7x;
        C7X c7x2;
        C7X c7x3;
        ArrayList arrayList;
        if (qVd == null) {
            return new PuxTermsConditionItem((C7X) null, (C7X) null, (C7X) null, (C7X) null, RH6.A0m, (String) null, (String) null, (List) null, (List) null, false);
        }
        C7X c7x4 = null;
        String A07 = qVd.A07("body_text");
        C250663lr optionalTreeField = qVd.getOptionalTreeField(5, "cta_text", C42261BXe.class, -2098970173);
        if (optionalTreeField != null) {
            c7x = Pxj.A0R(optionalTreeField);
        } else {
            c7x = null;
        }
        String A08 = qVd.A08("sheet_header");
        ImmutableList requiredCompactedStringListField = qVd.getRequiredCompactedStringListField(2, "sheet_body_text");
        C250663lr optionalTreeField2 = qVd.getOptionalTreeField(3, "payments_terms", C42262BXf.class, 281542544);
        if (optionalTreeField2 != null) {
            c7x2 = Pxj.A0R(optionalTreeField2);
        } else {
            c7x2 = null;
        }
        C250663lr optionalTreeField3 = qVd.getOptionalTreeField(4, "privacy_policy_terms", C42263BXg.class, 1178531916);
        if (optionalTreeField3 != null) {
            c7x3 = Pxj.A0R(optionalTreeField3);
        } else {
            c7x3 = null;
        }
        ImmutableList requiredCompactedTreeListField = qVd.getRequiredCompactedTreeListField(6, "terms_actions", C42264BXh.class, 934810415);
        0qQ.A0A(requiredCompactedTreeListField);
        if (AnonymousClass7TE.A1b(requiredCompactedTreeListField)) {
            arrayList = AnonymousClass7TG.A0r(requiredCompactedTreeListField);
            Iterator it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                arrayList.add(C41845B3m.A0V(it).A01(C7X.class, 1825808236));
            }
        } else {
            arrayList = null;
        }
        C250663lr optionalTreeField4 = qVd.getOptionalTreeField(7, "body_text_with_multiple_actions", C42260BXd.class, -424149810);
        if (optionalTreeField4 != null) {
            c7x4 = Pxj.A0R(optionalTreeField4);
        }
        return new PuxTermsConditionItem(c7x, c7x2, c7x3, c7x4, RH6.A0m, A07, A08, requiredCompactedStringListField, arrayList, false);
    }

    public static final ShippingAddress A02(QVN qvn, boolean z) {
        boolean z2;
        String str;
        QVN qvn2 = qvn;
        if (qvn != null) {
            String A07 = qvn2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String A08 = qvn2.A08("label");
            String A09 = qvn2.A09("care_of");
            String A0A = qvn2.A0A("street1");
            String A0B = qvn2.A0B("street2");
            String A0C = qvn2.A0C("city_name");
            String optionalStringField = qvn2.getOptionalStringField(6, "state_name");
            String optionalStringField2 = qvn2.getOptionalStringField(7, "country_name");
            String optionalStringField3 = qvn2.getOptionalStringField(9, "postal_code");
            boolean hasFieldValue = qvn2.hasFieldValue("verified");
            boolean coercedBooleanField = qvn2.getCoercedBooleanField(8, "verified");
            boolean coercedBooleanField2 = qvn2.getCoercedBooleanField(10, "is_default");
            Class<QSI> cls = QSI.class;
            C250663lr reinterpretIfFulfillsType = qvn2.reinterpretIfFulfillsType(11, "ExternalMailingAddress", cls, 1012555557);
            if (reinterpretIfFulfillsType != null) {
                z2 = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
            } else {
                z2 = true;
            }
            C250663lr reinterpretIfFulfillsType2 = qvn2.reinterpretIfFulfillsType(11, "ExternalMailingAddress", cls, 1012555557);
            if (reinterpretIfFulfillsType2 != null) {
                str = reinterpretIfFulfillsType2.A08("external_source_label");
            } else {
                str = null;
            }
            return new ShippingAddress(A07, A08, A09, A0A, A0B, A0C, optionalStringField, optionalStringField2, optionalStringField3, str, hasFieldValue, coercedBooleanField, coercedBooleanField2, z, z2);
        }
        throw AnonymousClass7TE.A0z("Cannot convert null object to a valid shipping address");
    }

    public static final boolean A03(C298525tb r3, List list) {
        for (Object obj : list) {
            if (obj == r3) {
                return true;
            }
        }
        return false;
    }
}
