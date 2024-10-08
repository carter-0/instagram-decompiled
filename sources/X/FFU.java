package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class FFU {
    public static final boolean A02(UserSession userSession) {
        Boolean BBh;
        Boolean BBS;
        0qQ.A0B(userSession, 0);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (!182.A06(0Tu.A05, userSession, 36317427413095549L) || !A0Q.isVerified() || (((BBh = A0Q.A03.BBh()) != null && BBh.booleanValue()) || (BBS = A0Q.A03.BBS()) == null || !BBS.booleanValue())) {
            return false;
        }
        return true;
    }

    public static final void A00(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131964915);
        A0Y.A08(2131964914);
        A0Y.A0Q(FJJ.A00, C358278ae.DEFAULT, 2131964913);
        DbT.A1V(A0Y);
    }

    public static final void A01(Context context, C62320sa r3) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131964919);
        A0Y.A08(2131964916);
        A0Y.A0J(C50020FJf.A00(r3, 45), 2131964917);
        DbY.A1M(A0Y, 2131964918);
    }

    public static final boolean A03(UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        if (!182.A06(0Tu.A05, userSession, 36317427413095549L) || !A0j.isVerified()) {
            return false;
        }
        Boolean BBh = A0j.A03.BBh();
        if (BBh != null && BBh.booleanValue()) {
            return false;
        }
        Boolean BBS = A0j.A03.BBS();
        if (BBS == null || !BBS.booleanValue()) {
            return true;
        }
        return false;
    }
}
