package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;

/* renamed from: X.Nvk  reason: case insensitive filesystem */
public abstract class C70006Nvk {
    public static final C328707Fv A00(Context context, UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, DirectAnimatedMedia directAnimatedMedia) {
        GifUrlImpl gifUrlImpl;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        0qQ.A0B(context, 0);
        C51973G9u.A0r(1, userSession, r12, r10);
        C254703su r1 = r11.A0e;
        0qQ.A07(r1);
        User user = r11.A0K;
        String str = null;
        if (directAnimatedMedia != null) {
            gifUrlImpl = directAnimatedMedia.A02;
        } else {
            gifUrlImpl = null;
        }
        DirectMessageIdentifier A0V = r1.A0V();
        if (user != null) {
            str = user.getUsername();
        }
        if (directAnimatedMedia == null || (bool2 = directAnimatedMedia.A04) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        AnonymousClass7FE A0U = C66582MXn.A0U(userSession, r10, r11, r12, r1);
        AnonymousClass7FT A0Y = C66580MXl.A0Y(context, userSession, r10, r11, r1);
        if (directAnimatedMedia == null || (bool = directAnimatedMedia.A03) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        return new C328707Fv(A0Y, A0U, A0V, gifUrlImpl, str, z, false, z2);
    }
}
