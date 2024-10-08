package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FWk  reason: case insensitive filesystem */
public final class C50279FWk implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50279FWk(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Object obj2;
        User user;
        int i;
        int A03 = AnonymousClass0fD.A03(2059802043);
        C323996yR r15 = (C323996yR) obj;
        int A032 = AnonymousClass0fD.A03(-313560611);
        UserDetailFragment userDetailFragment = this.A00;
        User user2 = userDetailFragment.A10.A03;
        if (user2 == null) {
            i = -29235416;
        } else {
            userDetailFragment.A0z.A0S(user2, true);
            Context requireContext = userDetailFragment.requireContext();
            Resources A05 = DbV.A05(userDetailFragment);
            List list = r15.A00;
            Map map = r15.A01;
            String username = user2.getUsername();
            AnonymousClass7TF.A1B(A05, 1, list);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                String id = A0k.getId();
                if (map.get(id) == EVQ.FOLLOWED) {
                    A1C.add(A0k);
                } else if (map.get(id) == EVQ.REQUESTED) {
                    A1C2.add(A0k);
                }
            }
            C310336ap A0a = DbS.A0a();
            A0a.A01 = 5000;
            DbW.A0t(A05, A0a);
            if (A1C.size() == 1) {
                user = (User) A1C.get(0);
                A0a.A0D = DbV.A0w(A05, user.getUsername(), username, 2131962552);
                A0a.A0B(C310356ar.CIRCULAR);
            } else {
                if (A1C.size() > 1) {
                    A0a.A0D = A05.getString(2131962550, new Object[]{((User) A1C.get(0)).getUsername(), Integer.valueOf(A1C.size() - 1), username});
                    A0a.A0B(C310356ar.AVATAR);
                    A0a.A09 = ((User) A1C.get(0)).Bh3();
                    obj2 = A1C.get(1);
                } else if (A1C2.size() == 1) {
                    A0a.A0D = DbV.A0w(A05, ((User) A1C2.get(0)).getUsername(), username, 2131962553);
                    A0a.A0B(C310356ar.CIRCULAR);
                    user = (User) A1C2.get(0);
                } else if (A1C2.size() > 1) {
                    A0a.A0D = A05.getString(2131962551, new Object[]{((User) A1C2.get(0)).getUsername(), Integer.valueOf(A1C2.size() - 1), username});
                    A0a.A0B(C310356ar.AVATAR);
                    A0a.A09 = ((User) A1C2.get(0)).Bh3();
                    obj2 = A1C2.get(1);
                } else {
                    1Cn r1 = new 1Cn(requireContext);
                    if (!r1.A07(false) && r1.A05()) {
                        C59689JTv.A09(requireContext, AnonymousClass7TF.A0e(A05, username, 2131962548));
                    }
                    A0a.A05();
                    A0a.A0H = "follow_from_error";
                    DbT.A1D(A05, A0a, 2131962549);
                    DbY.A1N(A0a);
                    i = 1046258315;
                }
                A0a.A07 = ((User) obj2).Bh3();
                DbY.A1N(A0a);
                i = 1046258315;
            }
            A0a.A09 = user.Bh3();
            DbY.A1N(A0a);
            i = 1046258315;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-66932007, A03);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return true;
    }
}
