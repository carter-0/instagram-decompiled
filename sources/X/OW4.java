package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class OW4 {
    public Context A00;
    public C314826iu A01;
    public UserSession A02;
    public C314836iv A03;

    public OW4(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = new C314826iu(C314816it.THREAD_COMPOSER, userSession);
        this.A03 = new C314836iv(userSession, context);
    }

    public final void A00() {
        UserSession userSession = this.A02;
        String str = "userSession";
        if (userSession != null) {
            0Tu r2 = 0Tu.A05;
            String A04 = 182.A04(r2, userSession, 36885423952560739L);
            String A042 = 182.A04(r2, userSession, 36885423952495202L);
            Context context = this.A00;
            str = "context";
            if (context != null) {
                C358248ab A0Y = DbS.A0Y(context);
                if (A04.length() == 0) {
                    A04 = C51967G9n.A0p(context, 2131975285);
                }
                A0Y.A05 = A04;
                if (A042.length() == 0) {
                    A042 = C51967G9n.A0p(context, 2131975284);
                }
                A0Y.A0q(A042);
                DbU.A16(context, A0Y, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
                C71249OgE.A02(A0Y, this, 8, 2131976057);
                C71249OgE.A03(A0Y, this, 7, 2131954735);
                Dialog A022 = A0Y.A02();
                C314826iu r0 = this.A01;
                if (r0 == null) {
                    str = "audLogging";
                } else {
                    r0.A01();
                    AnonymousClass0fN.A00(A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A01() {
        String str;
        UserSession userSession = this.A02;
        if (userSession == null) {
            str = "userSession";
        } else {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36318015822960388L) || 182.A06(r2, userSession, 36322473998952655L)) {
                C314836iv r0 = this.A03;
                if (r0 == null) {
                    str = "rollingDeprecationUtil";
                } else if (!r0.A00()) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public OW4() {
    }
}
