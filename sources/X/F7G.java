package X;

import android.content.Context;
import com.instagram.user.model.User;

public abstract class F7G {
    public static final String A00(Context context, Integer num) {
        int i;
        if (num == AnonymousClass05K.A00) {
            i = 2131974062;
        } else if (num == AnonymousClass05K.A01) {
            i = 2131974060;
        } else if (num != AnonymousClass05K.A0C) {
            return "";
        } else {
            i = 2131974061;
        }
        return AnonymousClass7TE.A16(context, i);
    }

    public static final String A01(User user, Integer num) {
        C274674os Bx1;
        C274674os Bwz;
        if (num == AnonymousClass05K.A00) {
            Bwz = user.A03.Bx2();
        } else if (num == AnonymousClass05K.A01) {
            Bwz = user.A03.Bwz();
        } else if (num != AnonymousClass05K.A0C || user.A03.Bx1() == null || (Bx1 = user.A03.Bx1()) == null) {
            return "";
        } else {
            Bx1.Bao();
            return "";
        }
        if (Bwz != null) {
            return Bwz.Bao();
        }
        return "";
    }
}
