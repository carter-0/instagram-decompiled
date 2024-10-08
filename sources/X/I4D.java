package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.user.model.User;

public final class I4D {
    public static final I4D A00 = new Object();

    public static final ReelsVisualRepliesModel A00(User user, String str, String str2) {
        String A0E = 0nH.A0E(-1);
        return new ReelsVisualRepliesModel(new MediaVCRTappableData(user, Float.valueOf(Float.MAX_VALUE), C51967G9n.A0g(), A0E, str, str2, (String) null, "0", 0nH.A0E(-1), (String) null, false), false);
    }

    public final void A01(Activity activity, 28D r6, AnonymousClass4DH r7, C335377cr r8, UserSession userSession) {
        String str;
        0qQ.A0B(userSession, 2);
        1Au.A00(userSession).A0M();
        C56044Hrt A0C = C250563lf.A0C(r6);
        String str2 = null;
        if (r8 != null) {
            str2 = r8.A02;
        }
        if (str2 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (r8 == null || (str = r8.A03) == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            A0C.A05 = A00(r8.A00, str2, str);
            I3M.A00(activity, A0C.A00(), r7, r6, userSession);
        }
    }
}
