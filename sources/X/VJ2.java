package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;

public abstract class VJ2 {
    public static final void A00(Activity activity, AnonymousClass0iw r7, UserSession userSession, Hashtag hashtag) {
        Activity activity2 = activity;
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity2, W0l.A00(hashtag, r7.getModuleName(), "DEFAULT"), userSession, ModalActivity.class, "hashtag_feed");
        r0.A02 = r7;
        r0.A08();
        r0.A0C(activity);
    }
}
