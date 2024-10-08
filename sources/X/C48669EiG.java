package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiG  reason: case insensitive filesystem */
public abstract class C48669EiG {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        AnonymousClass4VG r0;
        C49599EzI ezI = (C49599EzI) C308206Td.A0F(r8, C49599EzI.class, R.id.bloks_action_listener);
        if (ezI == null || r9.A00.size() <= 0) {
            return null;
        }
        Integer A00 = C49083Ep1.A00(DbY.A0h(r9, 0));
        0qQ.A0B(A00, 0);
        2bu r4 = ezI.A02;
        AnonymousClass4UC r3 = (AnonymousClass4UC) ezI.A01;
        UserSession userSession = r4.A07;
        if (182.A06(0Tu.A05, userSession, 36327000893307000L)) {
            int intValue = A00.intValue();
            if (intValue == 1) {
                r0 = r3.A08.A01;
            } else if (intValue == 2) {
                r0 = r3.A08.A02;
            } else if (intValue != 3) {
                return null;
            } else {
                r0 = r3.A08.A00;
            }
            A00 = r0 != null ? r0.A02 : null;
        } else {
            Integer num = AnonymousClass05K.A01;
            AnonymousClass4V7 r02 = r3.A08;
            if (A00 != num && r02.A02 == null) {
                return null;
            }
        }
        r4.A01(userSession, r3, A00);
        return null;
    }
}
