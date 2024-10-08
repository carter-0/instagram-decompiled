package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.user.model.User;

/* renamed from: X.Nvi  reason: case insensitive filesystem */
public abstract class C70004Nvi {
    public static final NYR A00(Context context, UserSession userSession, AnonymousClass9HC r7, AnonymousClass7LQ r8, DirectAnimatedMedia directAnimatedMedia) {
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A0w(1, userSession, directAnimatedMedia, r7);
        User user = r8.A0K;
        return new NYR(C66580MXl.A0Y(context, userSession, r7, r8, r8.A0e), directAnimatedMedia.A02, C51971G9r.A0t(user), false);
    }
}
