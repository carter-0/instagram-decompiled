package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DkZ  reason: case insensitive filesystem */
public final class C46746DkZ extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final List A02;

    public C46746DkZ(UserSession userSession, EWM ewm, boolean z) {
        EWM ewm2;
        AnonymousClass7TG.A1O(userSession, ewm);
        01N A1H = 0jo.A1H();
        if (!z) {
            ewm2 = EWM.INDEFINITE;
        } else if (182.A06(0Tu.A05, userSession, 36327615073761845L)) {
            ewm2 = EWM.THREE_MONTHS;
        } else {
            ewm2 = EWM.ONE_MONTH;
        }
        A1H.add(ewm2);
        A1H.add(EWM.ONE_WEEK);
        A1H.add(EWM.ONE_DAY);
        01N A1I = 0jo.A1I(A1H);
        this.A02 = A1I;
        02z A10 = DbS.A10(new N4R(ewm, (List) A1I));
        this.A00 = A10;
        this.A01 = 10b.A03(A10);
    }
}
