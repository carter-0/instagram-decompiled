package X;

import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.suggestedusers.database.SuggestedUsersDatabase;

public final class L7A {
    public final UserSession A00;
    public final SuggestedUsersDatabase A01;
    public final C262224Cq A02;

    public L7A(UserSession userSession) {
        this.A00 = userSession;
        C65609Lwk lwk = SuggestedUsersDatabase.A00;
        Class<SuggestedUsersDatabase> cls = SuggestedUsersDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (lwk) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, lwk, cls);
                    1VC.A00(A0F, 966282908, 879196953, true);
                    igRoomDatabase = JTS.A0W(A0F, userSession, cls);
                }
            }
        }
        this.A01 = (SuggestedUsersDatabase) igRoomDatabase;
        this.A02 = DbY.A0r(AnonymousClass12T.A00, 879196953);
    }
}
