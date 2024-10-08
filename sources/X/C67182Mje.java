package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.Mje  reason: case insensitive filesystem */
public final class C67182Mje extends C232232tF {
    public static C230012om A04;
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C67164MjM A02;
    public final AnonymousClass0eM A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68012Mye(DbT.A0D(layoutInflater, viewGroup, R.layout.recommended_user_row, false));
    }

    public static final AnonymousClass6KM A00(C67334MmA mmA, String str) {
        AnonymousClass6KM r1 = new AnonymousClass6KM("recommended_users_direct_inbox", mmA.A01.getId(), str);
        String str2 = mmA.A02;
        if (str2 != null) {
            r1.A07 = str2;
        }
        r1.A00 = mmA.A00;
        return r1;
    }

    public final C230012om A01() {
        if (182.A06(0Tu.A05, this.A01, 36330754694988547L)) {
            return (C230012om) this.A03.getValue();
        }
        return A04;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        C67334MmA mmA = (C67334MmA) r10;
        C68012Mye mye = (C68012Mye) r11;
        boolean A1U = AnonymousClass7TF.A1U(0, mmA, mye);
        IgdsPeopleCell igdsPeopleCell = mye.A01;
        igdsPeopleCell.A01();
        User user = mmA.A01;
        C71405Ok4.A01(mye.A00, 66, mmA, this);
        FollowButton followButton = mye.A02;
        followButton.A0A = A1U;
        followButton.A09 = !mmA.A03;
        C267064at r1 = followButton.A0J;
        UserSession userSession = this.A01;
        AnonymousClass4DH r4 = this.A00;
        r1.A03(r4, userSession, user);
        r1.A07(new C69208NhO(0, mmA, this));
        igdsPeopleCell.A05(followButton, (AnonymousClass3Z5) null);
        igdsPeopleCell.A08(user.getUsername(), user.isVerified());
        igdsPeopleCell.A03(userSession, new C49550Exl(r4, user), (User) null);
        C71399Ojy.A00(igdsPeopleCell, user, this, mmA, 11);
        String BxN = user.A03.BxN();
        if (BxN == null || BxN.equals("")) {
            igdsPeopleCell.A07(user.getFullName());
        } else {
            igdsPeopleCell.A07(BxN);
        }
        if (A04 == null && !182.A06(0Tu.A05, userSession, 36330754694988547L)) {
            A04 = new C230012om(r4, userSession);
        }
        C67164MjM mjM = this.A02;
        N4Q n4q = new N4Q(user, mmA.A02, mmA.A00);
        C66633Ma2 ma2 = mjM.A00;
        2el r5 = (2el) ma2.A2u.getValue();
        if (r5 != null) {
            UserSession A0p = ma2.A0p();
            AnonymousClass4DH r3 = ma2.A1J;
            C72269Oze oze = new C72269Oze(r3, A0p, r3.getModuleName(), ma2.A2X);
            C2354830a A002 = AnonymousClass30Y.A00(n4q, (Object) null, DbS.A0q(n4q.A01));
            A002.A00(oze);
            C51967G9n.A0z(igdsPeopleCell, A002, r5);
        }
    }

    public final Class modelClass() {
        return C67334MmA.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r6) {
        C68012Mye mye = (C68012Mye) r6;
        0qQ.A0B(mye, 0);
        if (182.A06(0Tu.A05, this.A01, 36330754695054084L)) {
            C67164MjM mjM = this.A02;
            IgdsPeopleCell igdsPeopleCell = mye.A01;
            0qQ.A0B(igdsPeopleCell, 0);
            2el r0 = (2el) mjM.A00.A2u.getValue();
            if (r0 != null) {
                r0.A04(igdsPeopleCell);
            }
        }
    }

    public C67182Mje(AnonymousClass4DH r1, UserSession userSession, C67164MjM mjM, AnonymousClass0eM r4) {
        this.A01 = userSession;
        this.A02 = mjM;
        this.A00 = r1;
        this.A03 = r4;
    }
}
