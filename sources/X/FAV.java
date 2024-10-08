package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

public final class FAV {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C67089Mi7 A03;
    public final 2Dm A04;

    public FAV(Activity activity, Fragment fragment, UserSession userSession) {
        0qQ.A0B(fragment, 3);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = C67089Mi7.A00(userSession, AnonymousClass7TE.A0u());
        this.A04 = 1bJ.A00(userSession);
    }

    public static final String A00(String str, List list) {
        if (str.length() > 0) {
            return str;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A1A.append(DbT.A0y((DirectShareTarget) list.get(i)));
            DbY.A1V(A1A, list, i);
        }
        return DbT.A10(A1A);
    }
}
