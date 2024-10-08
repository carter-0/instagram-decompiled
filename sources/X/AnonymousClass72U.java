package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.72U  reason: invalid class name */
public abstract class AnonymousClass72U {
    public static final ClipsDraftRepository A00(Activity activity, UserSession userSession) {
        0qQ.A0B(activity, 0);
        0qQ.A0B(userSession, 1);
        return (ClipsDraftRepository) userSession.A01(ClipsDraftRepository.class, new C377429Lu(21, activity, userSession));
    }
}
