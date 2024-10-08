package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.direct.securityalert.data.room.SecurityAlertDatabase;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

/* renamed from: X.JaC  reason: case insensitive filesystem */
public abstract class C59837JaC {
    public static final SecurityAlertLocalDataSource A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C62154KbC A00 = C59838JaD.A00(userSession);
        C63249Ktu ktu = SecurityAlertDatabase.A00;
        C62880wX r4 = C61170le.A00;
        Class<SecurityAlertDatabase> cls = SecurityAlertDatabase.class;
        Object A002 = r4.A00(cls);
        if (A002 == null) {
            synchronized (ktu) {
                A002 = (IgDeviceScopedRoomDatabase) r4.A00(cls);
                if (A002 == null) {
                    1VA A003 = 1V9.A00(r4.A06(), cls, "ig_security_alert");
                    1VC.A00(A003, 170156951, 170156951, true);
                    A003.A01();
                    A002 = (IgDeviceScopedRoomDatabase) A003.A00();
                    r4.A04(cls, A002);
                }
            }
        }
        return (SecurityAlertLocalDataSource) userSession.A01(SecurityAlertLocalDataSource.class, new C58195Inz(17, A002, userSession, A00));
    }
}
