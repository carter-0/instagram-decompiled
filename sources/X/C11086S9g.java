package X;

import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.S9g  reason: case insensitive filesystem */
public abstract class C11086S9g {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2YM] */
    public static final QDM A00(Fragment fragment, ECPPaymentRequest eCPPaymentRequest, LoggingContext loggingContext) {
        C13908Tl8 suQ;
        0qQ.A0B(loggingContext, 1);
        C13875Tiw A00 = SMR.A00(fragment);
        if (A00 == null || (suQ = (C13908Tl8) ((C8134QhS) A00).A08.getValue()) == null) {
            suQ = new SuQ(fragment);
        }
        return JTO.A0L(new Se5(JTO.A0L(new Object(), suQ).A00(QDL.class), loggingContext, JTO.A0L(new C7418QCh(suQ, eCPPaymentRequest), suQ).A01(QDH.class, "246423e6-8ba8-11ec-a8a3-0242ac120002")), suQ).A00(QDM.class);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2YM] */
    public static final QDN A01(Fragment fragment, ECPPaymentRequest eCPPaymentRequest, LoggingContext loggingContext) {
        C13908Tl8 suQ;
        LoggingContext loggingContext2 = loggingContext;
        0qQ.A0B(loggingContext, 1);
        C13875Tiw A00 = SMR.A00(fragment);
        if (A00 == null || (suQ = (C13908Tl8) ((C8134QhS) A00).A08.getValue()) == null) {
            suQ = new SuQ(fragment);
        }
        QDH A01 = JTO.A0L(new C7418QCh(suQ, eCPPaymentRequest), suQ).A01(QDH.class, "246423e6-8ba8-11ec-a8a3-0242ac120002");
        QDL A002 = JTO.A0L(new Object(), suQ).A00(QDL.class);
        QDT A003 = JTO.A0L(new C11658Se0(A01), suQ).A00(QDT.class);
        QDU A004 = JTO.A0L(new C11655Sdx(A01), suQ).A00(QDU.class);
        QDR A005 = JTO.A0L(new C11657Sdz(A01), suQ).A00(QDR.class);
        QDQ A006 = JTO.A0L(new C11659Se1(A01), suQ).A00(QDQ.class);
        return JTO.A0L(new C11664Se7(A004, JTO.A0L(new C11656Sdy(A01), suQ).A00(C7434QCz.class), A005, A002, loggingContext2, A01, A003, JTO.A0L(new C11662Se4(A002, A01), suQ).A00(QDJ.class), A006, JTO.A0L(new C11660Se2(A01), suQ).A00(QDS.class), JTO.A0L(new C11661Se3(A01), suQ).A00(QD3.class)), suQ).A00(QDN.class);
    }
}
