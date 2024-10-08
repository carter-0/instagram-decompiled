package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.888  reason: invalid class name */
public final class AnonymousClass888 {
    public final UserSession A00;
    public final C279284yO A01;

    public AnonymousClass888(UserSession userSession, C279284yO r3, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r3, 3);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public static final boolean A00(AnonymousClass888 r4, String str) {
        UserSession userSession;
        0Tu r2;
        long j;
        C279284yO r3 = r4.A01;
        if (0qQ.A0K(r3, AnonymousClass9QA.A00) || 0qQ.A0K(r3, AnonymousClass80M.A00) || (r3 instanceof AnonymousClass80O)) {
            return true;
        }
        if (r3 instanceof C363138jC) {
            userSession = r4.A00;
            r2 = 0Tu.A05;
            j = 36330595780936383L;
        } else if (r3 instanceof AnonymousClass80L) {
            userSession = r4.A00;
            r2 = 0Tu.A05;
            j = 36330595781067457L;
        } else if (r3 instanceof C3494180h) {
            userSession = r4.A00;
            r2 = 0Tu.A05;
            j = 36330595781001920L;
        } else {
            0f9 AEf = 0wj.A01.AEf("unsupported_destination", 817894773);
            AEf.ABQ("camera_destination", r3.A02);
            AEf.ABQ("calling_method", str);
            AEf.ABQ("nav_chain", String.valueOf(AnonymousClass1QI.A00.A02.A00));
            AEf.report();
            return false;
        }
        return 182.A06(r2, userSession, j);
    }
}
