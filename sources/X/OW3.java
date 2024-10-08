package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class OW3 {
    public Context A00;
    public C314826iu A01;
    public UserSession A02;
    public C314836iv A03;

    public OW3(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = new C314826iu(C314816it.SHARING, userSession);
        this.A03 = new C314836iv(userSession, context);
    }

    public final void A00(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        Context context = this.A00;
        String str = "context";
        if (context != null) {
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131973673);
            A0Y.A08(2131973672);
            DbU.A16(context, A0Y, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
            A0Y.A0I(new C71183Of1(1, runnable, this), 2131976057);
            A0Y.A0H(new C71183Of1(0, runnable, this), 2131954735);
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
            if (182.A06(r2, userSession, 36318015821715192L) || 182.A06(r2, userSession, 36322473998821582L)) {
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

    public OW3() {
    }
}
