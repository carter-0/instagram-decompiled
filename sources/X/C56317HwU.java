package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.HwU  reason: case insensitive filesystem */
public abstract class C56317HwU {
    public static final AnonymousClass62P A00(UserSession userSession, Integer num) {
        List A1P;
        HNM hnm;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                hnm = HNM.CREATE_NOTE_LOCATION_EDUCATION;
            } else if (intValue != 2) {
                hnm = HNM.MAP_LOCATION_EDUCATION;
            } else {
                hnm = HNM.SHARE_LOCATION_EDUCATION;
            }
            A1P = AnonymousClass7TE.A1I(hnm);
        } else {
            A1P = 0sr.A1P(new HNM[]{HNM.NOTES_NUX, HNM.NOTES_WITH_LOCATION_NUX});
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1P) {
            if (((HNM) next).A01(userSession)) {
                A1C.add(next);
            }
        }
        return AnonymousClass62Q.A00(A1C);
    }

    public static final boolean A01(UserSession userSession, Integer num) {
        AnonymousClass62P<HNM> A00 = A00(userSession, num);
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            for (HNM A01 : A00) {
                if (A01.A01(userSession)) {
                    return true;
                }
            }
        }
        return false;
    }
}
