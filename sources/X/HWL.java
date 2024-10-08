package X;

import android.content.Context;
import com.instagram.clips.drafts.model.validation.ClipsDraftValidator;
import com.instagram.common.session.UserSession;

public abstract class HWL {
    public static final ClipsDraftValidator A00(Context context, UserSession userSession, Integer num) {
        AnonymousClass7TG.A1N(context, userSession);
        return new ClipsDraftValidator(2MV.A00(context, userSession), userSession, num);
    }
}
