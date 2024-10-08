package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.Collections;

public final class ITD implements C231802sQ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C54228H3x A01;

    public ITD(UserSession userSession, C54228H3x h3x) {
        this.A00 = userSession;
        this.A01 = h3x;
    }

    public final /* bridge */ /* synthetic */ boolean Esp(Object obj) {
        SavedCollection savedCollection = (SavedCollection) obj;
        0qQ.A0B(savedCollection, 0);
        C54665HMw hMw = savedCollection.A07;
        if (hMw == C54665HMw.ALL_MEDIA_AUTO_COLLECTION || hMw == C54665HMw.SAVED_ENTRYPOINT_COLLECTION) {
            if (Collections.unmodifiableList(savedCollection.A0L).size() > 0) {
                return true;
            }
            return false;
        } else if (0qQ.A0K(savedCollection.A0F, "my_favs") && AnonymousClass0t1.A01.A01(this.A00).A1o()) {
            return false;
        } else {
            if (this.A01.A05) {
                return savedCollection.A0B.booleanValue();
            }
            User user = savedCollection.A08;
            if (user != null) {
                String id = user.getId();
                UserSession userSession = this.A00;
                if (C51966G9m.A1W(userSession, id) || I31.A00(userSession)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }
}
