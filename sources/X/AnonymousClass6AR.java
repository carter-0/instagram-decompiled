package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6AR  reason: invalid class name */
public abstract class AnonymousClass6AR {
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, X.6AS] */
    public static final AnonymousClass6AT A00(UserSession userSession) {
        boolean A03;
        boolean A032;
        0qQ.A0B(userSession, 0);
        boolean A01 = 2HM.A00(userSession).A01();
        boolean booleanValue = ((Boolean) 2HM.A00(userSession).A0V.get()).booleanValue();
        2HM.A00(userSession).A0d.get();
        2HM.A00(userSession).A0e.get();
        boolean booleanValue2 = ((Boolean) 2HM.A00(userSession).A0f.get()).booleanValue();
        2HM.A00(userSession).A1K.get();
        2HM.A00(userSession).A0w.get();
        boolean A00 = AnonymousClass45R.A00(userSession);
        C66611MYx mYx = C66612MYy.A00;
        if (A00) {
            A03 = mYx.A02(userSession, true);
        } else {
            A03 = mYx.A03(userSession, true);
        }
        int A002 = new Object().A00(userSession);
        boolean booleanValue3 = ((Boolean) 2HM.A00(userSession).A0K.A00()).booleanValue();
        if (AnonymousClass45R.A00(userSession)) {
            A032 = C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965806581148L), true);
        } else {
            A032 = mYx.A03(userSession, true);
        }
        return new AnonymousClass6AT(A002, ((Number) 2HM.A00(userSession).A05.get()).longValue(), A01, booleanValue, booleanValue2, A03, booleanValue3, A032, ((Boolean) 2HM.A00(userSession).A1O.get()).booleanValue());
    }
}
