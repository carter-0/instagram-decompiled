package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Nvn  reason: case insensitive filesystem */
public abstract class C70009Nvn {
    public static final NYU A00(Context context, UserSession userSession, AnonymousClass9HC r22, AnonymousClass7LQ r23, AnonymousClass7L2 r24, 1Xj r25) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        AnonymousClass9HC r2 = r22;
        AnonymousClass7L2 r4 = r24;
        C51973G9u.A0r(3, userSession2, r4, r2);
        1Xj r6 = r25;
        User A2A = r6.A2A(userSession2);
        if (A2A != null) {
            float A0l = r6.A0l();
            ImageUrl A1Q = r6.A1Q();
            String id = r6.getId();
            if (id != null) {
                1iA BR7 = r6.BR7();
                String B2y = r6.A0C.B2y();
                AnonymousClass7LQ r1 = r23;
                C254703su r0 = r1.A0e;
                String A0g = r0.A0g();
                boolean A1W = AnonymousClass7TF.A1W(r6.A1u(), 1sw.A04);
                String id2 = A2A.getId();
                String str = r0.A1u;
                0qQ.A07(str);
                C68868Na0 na0 = new C68868Na0(BR7, id, B2y, A0g, id2, str, -1, A1W);
                return new NYU(A1Q, C66580MXl.A0Y(context2, userSession2, r2, r1, r0), C66582MXn.A0U(userSession2, r2, r1, r4, r0), na0, A0l, r6.A17());
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0w("Cannot get author for given media");
    }
}
