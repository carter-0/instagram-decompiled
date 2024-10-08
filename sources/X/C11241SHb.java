package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.SHb  reason: case insensitive filesystem */
public final class C11241SHb {
    public final QJL A00;
    public final QJI A01;
    public final QJJ A02;
    public final QJK A03;
    public final QJH A04;

    private SIB A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        String A012 = instantExperiencesJSBridgeCall.A01();
        switch (A012.hashCode()) {
            case -2010971576:
                if (A012.equals("canMakePayment")) {
                    return this.A02;
                }
                break;
            case -1167572077:
                if (A012.equals("paymentsCheckout")) {
                    return this.A04;
                }
                break;
            case -267636863:
                if (A012.equals("requestAutoFill")) {
                    return this.A00;
                }
                break;
            case -257417255:
                if (A012.equals("paymentsChargeRequst")) {
                    return this.A03;
                }
                break;
            case 1722704025:
                if (A012.equals("saveAutofillData")) {
                    return this.A01;
                }
                break;
        }
        0KC.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", new Object[]{A012});
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QJI, X.SIB] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.QJH, X.SIB] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.QJJ, X.SIB] */
    public C11241SHb(SF6 sf6, C10662Rvw rvw, C7902QcU qcU, R8a r8a, UserSession userSession) {
        this.A00 = new QJL(sf6, qcU, r8a, userSession, Executors.newSingleThreadExecutor());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ? sib = new SIB(qcU);
        sib.A02 = userSession;
        sib.A01 = r8a;
        sib.A03 = newSingleThreadExecutor;
        sib.A00 = rvw;
        this.A01 = sib;
        this.A04 = new SIB(qcU);
        this.A02 = new SIB(qcU);
        this.A03 = new QJK(qcU, userSession);
    }

    public final void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        try {
            SIB A002 = A00(instantExperiencesJSBridgeCall);
            if (A002 != null) {
                A002.A02(instantExperiencesJSBridgeCall);
            }
        } catch (RKR e) {
            instantExperiencesJSBridgeCall.A03(new InstantExperiencesCallResult(e.A00, e.getMessage()));
            SIB A003 = A00(instantExperiencesJSBridgeCall);
            if (A003 != null) {
                A003.A01(instantExperiencesJSBridgeCall);
            }
        }
    }
}
