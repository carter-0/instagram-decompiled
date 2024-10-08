package X;

import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.S9b  reason: case insensitive filesystem */
public abstract class C11081S9b {
    public static final ArrayList A00(CheckoutConfiguration checkoutConfiguration, C10750RxU rxU, LoggingPolicy loggingPolicy, OtcInput otcInput, String str, String str2, String str3, String str4, boolean z) {
        RFA rfa;
        LoggingPolicy loggingPolicy2;
        Set A0y;
        Set A0y2;
        ImmutableList requiredCompactedEnumListField;
        ImmutableList A0E;
        RGA rga;
        int ordinal;
        String str5 = str;
        String str6 = str3;
        int A02 = DbW.A02(0, str5, str6);
        String A0n = C51972G9s.A0n();
        C10750RxU rxU2 = rxU;
        QTG qtg = rxU2.A03;
        if (qtg == null || (rga = (RGA) qtg.getOptionalEnumField(3, "payment_mode", RGA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null || (ordinal = rga.ordinal()) == 1 || ordinal != A02) {
            rfa = RFA.LIVE;
        } else {
            rfa = RFA.TEST;
        }
        String str7 = rfa.A00;
        OtcInput otcInput2 = otcInput;
        String str8 = str2;
        String str9 = str4;
        SJK sjk = new SJK((2IV) null, (2IV) null, (2IV) null, otcInput2, ImmutableList.of(), ImmutableList.of(), ImmutableList.of(), str5, A0n, str8, str7, "PRE_FETCH", (String) null, str6, str9, (String) null);
        long parseLong = Long.parseLong(str8);
        QT9 qt9 = rxU2.A02;
        if (qt9 == null || (loggingPolicy2 = C11432SUd.A0E(qt9)) == null) {
            loggingPolicy2 = loggingPolicy;
        }
        Set set = 0sl.A00;
        LoggingContext loggingContext = new LoggingContext(loggingPolicy2, str5, set, set, parseLong, false);
        if (z) {
            ECPRepositoryImpl A01 = C11353SOm.A01();
            ImmutableList of = ImmutableList.of("ONE_TIME_CHECKOUT_OPTION");
            0qQ.A07(of);
            SJK A00 = SJK.A00(sjk, (OtcInput) null, of, 65527);
            0qQ.A07(C8282QnO.A01(new C11542Sc3(3, A00, A01), AnonymousClass2E0.A06()));
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (qtg != null) {
            ImmutableList of2 = ImmutableList.of();
            0qQ.A07(of2);
            ImmutableList requiredCompactedEnumListField2 = qtg.getRequiredCompactedEnumListField(1, "supported_container_types", RGB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            0qQ.A07(requiredCompactedEnumListField2);
            ArrayList A0F = C11432SUd.A0F(requiredCompactedEnumListField2);
            ArrayList A0p = AnonymousClass7TF.A0p(A0F);
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                A0p.add(((C8914RFh) it.next()).A01);
            }
            ImmutableList A0K = DbU.A0K(A0p);
            ImmutableList requiredCompactedEnumListField3 = qtg.getRequiredCompactedEnumListField(A02, "payment_action_types", RG9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            0qQ.A07(requiredCompactedEnumListField3);
            ArrayList A0G = C11432SUd.A0G(requiredCompactedEnumListField3);
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0G);
            Iterator it2 = A0G.iterator();
            while (it2.hasNext()) {
                A0p2.add(((REB) it2.next()).name());
            }
            SJK sjk2 = new SJK((2IV) null, (2IV) null, (2IV) null, otcInput2, of2, A0K, DbU.A0K(A0p2), str5, A0n, str8, str7, "PRE_FETCH", (String) null, str6, str9, (String) null);
            QXO qxo = rxU2.A00;
            if (qxo == null || (A0E = qxo.A0E()) == null) {
                A0y = DbS.A0y();
            } else {
                A0y = 00k.A0j(C11432SUd.A0I(A0E));
            }
            CheckoutConfiguration checkoutConfiguration2 = checkoutConfiguration;
            if (checkoutConfiguration != null) {
                A0y.addAll(checkoutConfiguration2.A0H);
            }
            if (qxo == null || (requiredCompactedEnumListField = qxo.getRequiredCompactedEnumListField(3, "request_fields", C8928RFw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
                A0y2 = DbS.A0y();
            } else {
                A0y2 = 00k.A0j(C11432SUd.A0J(requiredCompactedEnumListField));
            }
            if (checkoutConfiguration != null) {
                A0y2.addAll(checkoutConfiguration2.A0I);
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            AnonymousClass2gB A012 = Stc.A01(sjk2, loggingContext, AnonymousClass2E0.A01().A0D, "PERSISTENT_UP_TO_DATE");
            A012.A09(C11649Sdr.A00(A012, 24));
            0qQ.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            A1C2.add(A012);
            if (A0y.contains(REn.UX_SHIPPING_ADDRESS)) {
                A01(AnonymousClass2E0.A01().A0F.A02(sjk, loggingContext, false), A1C2);
            }
            if (A0y2.contains(C8891REi.REQUEST_PAYER_NAME) || A0y2.contains(C8891REi.REQUEST_PAYER_EMAIL) || A0y2.contains(C8891REi.REQUEST_PAYER_PHONE)) {
                A01(AnonymousClass2E0.A01().A01.A08(sjk, loggingContext, false), A1C2);
            }
            A01(AnonymousClass2E0.A01().A0G.A00(sjk), A1C2);
            A1C.addAll(A1C2);
            A01(SIP.A00(C9619Rdx.A00("PERSISTENT_UP_TO_DATE"), sjk2, AnonymousClass2E0.A01().A0E), A1C);
        }
        return A1C;
    }

    public static void A01(2Fk r3, AbstractCollection abstractCollection) {
        r3.A09(new C11649Sdr(r3, 24));
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
        abstractCollection.add(r3);
    }
}
