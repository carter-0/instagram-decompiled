package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;

public final class P0Q implements C74384Pu0 {
    public static final P0Q A00 = new Object();

    public final void A8C(UserSession userSession, OIH oih, AddMessageContent addMessageContent, C254703su r8, C331237Qc r9) {
        Collection collection;
        0qQ.A0B(userSession, 0);
        C51974G9v.A1M(r8, addMessageContent, oih);
        if (addMessageContent.addMessageContentCase_ == 7) {
            collection = (Collection) addMessageContent.addMessageContent_;
        } else {
            collection = Collection.DEFAULT_INSTANCE;
        }
        0qQ.A07(collection);
        C71051OaT.A00(userSession, collection, r8, Long.valueOf(oih.A00), oih.A0B);
    }

    public final boolean FMq(AddMessageContent addMessageContent) {
        0qQ.A0B(addMessageContent, 0);
        return AnonymousClass7TF.A1S(addMessageContent.addMessageContentCase_, 7);
    }
}
