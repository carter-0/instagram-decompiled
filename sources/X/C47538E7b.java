package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.E7b  reason: case insensitive filesystem */
public final class C47538E7b extends C247303g7 {
    public C47170Drl A00;
    public final UserSession A01;
    public final C49490EwV A02;
    public final FollowRequestsRepository A03;
    public final C334007aW A04;
    public final C49714F2z A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C66217MIy(this, 49));
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final FollowRequestsActionDataSource A09;

    public C47538E7b(UserSession userSession, C49490EwV ewV, FollowRequestsActionDataSource followRequestsActionDataSource, FollowRequestsRepository followRequestsRepository, C334007aW r13, C49714F2z f2z) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TG.A1S(f2z, ewV);
        this.A01 = userSession;
        this.A04 = r13;
        this.A09 = followRequestsActionDataSource;
        this.A03 = followRequestsRepository;
        this.A05 = f2z;
        this.A02 = ewV;
        List list = 0sn.A00;
        this.A00 = new C47170Drl(ENI.A00, list, list, list.size(), -1, 0, 0);
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A07 = r0;
        this.A08 = 0u9.A04(r0);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A02(this, new AnonymousClass64X(A002).A00(FW3.class), 29);
        A02(this, new AnonymousClass64X(A002).A00(FW4.class), 30);
        A02(this, new AnonymousClass64X(A002).A00(C64659Lfl.class), 31);
        A02(this, new AnonymousClass64X(A002).A00(C64660Lfm.class), 32);
        A02(this, followRequestsActionDataSource.A0A, 33);
    }

    public static void A02(C247303g7 r2, AnonymousClass0r6 r3, int i) {
        AnonymousClass11O.A03(r2.A03(), new C61860pz(new MH3(r2, (AnonymousClass4D7) null, i), r3));
    }

    public final void A04(AnonymousClass8ZF r3, boolean z) {
        super.A04(r3, true);
        this.A04.A04(r3, true);
    }

    public static final Object A00(C47538E7b e7b, String str, AnonymousClass4D7 r6, boolean z) {
        Object obj;
        Object A022;
        Iterator it = e7b.A00.A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(DbS.A0q(obj), str)) {
                break;
            }
        }
        User user = (User) obj;
        if (user == null || (A022 = e7b.A09.A02(user, r6, new C66217MIy(e7b, 48), z)) != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A022;
    }

    public static final Object A01(C47538E7b e7b, String str, AnonymousClass4D7 r8, boolean z) {
        Object obj;
        Object A032;
        C47170Drl drl = e7b.A00;
        List list = drl.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            DbY.A1T(DbS.A0q(next), str, next, A1C);
        }
        int i = drl.A03 - 1;
        Iterator it = drl.A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(DbS.A0q(obj), str)) {
                break;
            }
        }
        User user = (User) obj;
        if (user == null || (A032 = e7b.A09.A03(user, r8, new GL8(i, 16, e7b, A1C), z)) != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A032;
    }
}
