package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3Wv  reason: invalid class name and case insensitive filesystem */
public final class C242953Wv implements C242963Ww {
    public final 0hq A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;

    public final void Dkj(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void Dkl(String str) {
        FragmentActivity activity;
        if (!(!AnonymousClass06S.A01(this.A00)) && (activity = this.A01.getActivity()) != null) {
            UserSession userSession = this.A02;
            String str2 = str;
            List<User> list = (List) C55171HdN.A00(userSession).A00.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (User id : list) {
                    arrayList.add(id.getId());
                }
                C309516Yo r1 = new C309516Yo(activity, userSession);
                r1.A08();
                r1.A0B((Bundle) null, C46339Dch.A00().A00.CrG(userSession, str2, (String) null, arrayList, (HashMap) null, false));
                r1.A04();
            }
        }
    }

    public C242953Wv(Fragment fragment, 0hq r2, UserSession userSession, AnonymousClass4DU r4) {
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = fragment;
        this.A00 = r2;
    }
}
