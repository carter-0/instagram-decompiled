package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class FdM implements C358618bC {
    public final /* synthetic */ ESO A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ String A02;

    public FdM(ESO eso, Boolean bool, String str) {
        this.A00 = eso;
        this.A02 = str;
        this.A01 = bool;
    }

    public final boolean onToggle(boolean z) {
        ESO eso = this.A00;
        UserSession userSession = eso.A00;
        if (z) {
            C319606qt A012 = C319606qt.A01(userSession);
            String str = this.A02;
            Integer num = AnonymousClass05K.A0N;
            UserSession userSession2 = eso.A00;
            Context context = eso.getContext();
            Boolean bool = this.A01;
            A012.A08(context, eso, userSession2, bool, bool, num, str, true);
            return true;
        }
        boolean A0J = C319606qt.A01(userSession).A0J(eso.A00.A06);
        C358248ab A0U = DbW.A0U(eso);
        int i = 2131971975;
        if (A0J) {
            i = 2131952964;
        }
        A0U.A09(i);
        int i2 = 2131971976;
        if (A0J) {
            i2 = 2131952965;
        }
        DbU.A1J(eso, A0U, i2);
        A0U.A0I(new FIG(2, eso, A0J), 2131971974);
        DbX.A16(C50020FJf.A00(eso, 10), A0U);
        return false;
    }
}
