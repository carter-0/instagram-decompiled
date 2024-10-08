package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7jx  reason: invalid class name and case insensitive filesystem */
public final class C339657jx {
    public C342437ob A00;
    public List A01 = new ArrayList();

    public final UpcomingEvent A00(UserSession userSession) {
        Object obj;
        0qQ.A0B(userSession, 0);
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UpcomingEvent upcomingEvent = (UpcomingEvent) obj;
            UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
            if (BNJ != null && BNJ.CbF() && C18810W3l.A0A(upcomingEvent)) {
                break;
            }
        }
        return (UpcomingEvent) obj;
    }
}
