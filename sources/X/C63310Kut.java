package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* renamed from: X.Kut  reason: case insensitive filesystem */
public abstract class C63310Kut {
    public static final MainFeedLocalDataSource A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (MainFeedLocalDataSource) userSession.A01(MainFeedLocalDataSource.class, MML.A00(userSession, 18));
    }
}
