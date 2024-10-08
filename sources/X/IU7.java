package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

public final class IU7 implements C242813Wa {
    public final UserSession A00;
    public final C52476GUc A01;
    public final C242813Wa A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass32A A04;
    public final String A05;

    public IU7(AnonymousClass4DH r2, UserSession userSession, C52476GUc gUc, C242813Wa r5, AnonymousClass32A r6, String str) {
        0qQ.A0B(r5, 1);
        C51974G9v.A1S(userSession, r2, gUc, r6, str);
        this.A02 = r5;
        this.A00 = userSession;
        this.A03 = r2;
        this.A01 = gUc;
        this.A04 = r6;
        this.A05 = str;
    }

    public static C242813Wa A00(IU7 iu7, Object obj) {
        0qQ.A0B(obj, 0);
        return iu7.A02;
    }

    public final void CuN(1Xj r7, AnonymousClass3W1 r8, Integer num, String str, boolean z) {
        C51974G9v.A1K(r7, r8, num);
        this.A02.CuN(r7, r8, num, str, z);
    }

    public final void D2Z(1Xj r6, AnonymousClass3W1 r7) {
        AnonymousClass7TF.A1H(r6, r7);
        UserSession userSession = this.A00;
        User A2A = r6.A2A(userSession);
        if (A2A == null) {
            throw AnonymousClass7TE.A0y();
        } else if (A2A.A0G() == FollowStatus.A06) {
            AnonymousClass4DH r3 = this.A03;
            1OC A002 = C54964HZu.A00(userSession, A2A.getId());
            A002.A00 = new C15625Ufr(11, r7, A2A, this);
            r3.schedule(A002);
        } else if (A2A.A0G() == FollowStatus.A05 && r7.A2v) {
            r7.A2v = false;
            C52476GUc.A00(this.A01);
        }
    }

    public final void D2q(1Xj r1, AnonymousClass3W1 r2, String str) {
    }

    public final void D2u(1Xj r7, AnonymousClass3W1 r8, Boolean bool, int i, boolean z) {
        AnonymousClass7TG.A1N(r7, r8);
        this.A02.D2u(r7, r8, bool, i, z);
    }

    public final void D2z(1Xj r12, AnonymousClass3W1 r13, Reel reel, AnonymousClass3N3 r15) {
        AnonymousClass7TF.A1C(reel, 0, r15);
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r4 = this.A04;
        r4.A0C = this.A05;
        r4.A05 = new C16165Upq((Activity) this.A03.getActivity(), r15.AeY(), (C230222pE) new C57304IWn(this, 1));
        r4.A05(reel, AnonymousClass3BQ.EXPLORE_FEED_ITEM_HEADER, r15, A1I, A1I, A1I);
    }

    public final void D3K(1Xj r7, AnonymousClass3W1 r8, String str, int i, boolean z) {
        AnonymousClass7TG.A1T(r7, r8, str);
        this.A02.D3K(r7, r8, str, i, z);
    }

    public final C2360732i BD7() {
        return this.A02.BD7();
    }

    public final void D2r() {
        this.A02.D2r();
    }

    public final void CnN(View view, String str) {
        AnonymousClass7TG.A1N(view, str);
        this.A02.CnN(view, str);
    }

    public final void Cna(View view, String str) {
        AnonymousClass7TG.A1N(view, str);
        this.A02.Cna(view, str);
    }

    public final void Cx1(1Xj r2) {
        A00(this, r2).Cx1(r2);
    }

    public final void Cy5(AnonymousClass3ZH r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.Cy5(r2, r3);
    }

    public final void Cy7(1Xj r2, String str) {
        AnonymousClass7TG.A1N(str, r2);
        this.A02.Cy7(r2, str);
    }

    public final void D2C(1Xj r2, AnonymousClass3W1 r3, User user, int i) {
        AnonymousClass7TG.A1T(user, r2, r3);
        this.A02.D2C(r2, r3, user, i);
    }

    public final void D2D(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2D(r2, r3);
    }

    public final void D2E(User user) {
        A00(this, user).D2E(user);
    }

    public final void D2I(1Xj r2) {
        A00(this, r2).D2I(r2);
    }

    public final void D2J(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2J(r2, r3, i);
    }

    public final void D2L(1Xj r2) {
        A00(this, r2).D2L(r2);
    }

    public final void D2O(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2O(r2, r3, i, z);
    }

    public final void D2P(1Xj r2, AnonymousClass3W1 r3, int i, boolean z) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2P(r2, r3, i, z);
    }

    public final void D2U(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2U(r2, r3);
    }

    public final void D2c(1Xj r2) {
        A00(this, r2).D2c(r2);
    }

    public final void D2f(1Xj r2, AnonymousClass3W1 r3, Hashtag hashtag, int i) {
        AnonymousClass7TG.A1T(r2, hashtag, r3);
        this.A02.D2f(r2, r3, hashtag, i);
    }

    public final void D2h(1Xj r2) {
        A00(this, r2).D2h(r2);
    }

    public final void D2k(1Xj r2) {
        A00(this, r2).D2k(r2);
    }

    public final void D2l(String str) {
        A00(this, str).D2l(str);
    }

    public final void D2m(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2m(r2, r3, i);
    }

    public final void D2n(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D2n(r2, r3);
    }

    public final void D2w(1Xj r2, AnonymousClass3W1 r3, Reel reel, AnonymousClass3N3 r5) {
        C51974G9v.A1O(reel, r2, r3, r5);
        this.A02.D2w(r2, r3, reel, r5);
    }

    public final void D30(1Xj r2) {
        A00(this, r2).D30(r2);
    }

    public final void D3B(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D3B(r2, r3, i);
    }

    public final void D3C(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D3C(r2, r3);
    }

    public final void D3D(1Xj r2, AnonymousClass3W1 r3, boolean z) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D3D(r2, r3, z);
    }

    public final void D3I(1Xj r2, AnonymousClass3W1 r3, boolean z) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D3I(r2, r3, z);
    }

    public final void D3L(User user) {
        A00(this, user).D3L(user);
    }

    public final void D3M(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.D3M(r2, r3, i);
    }

    public final void D3N(1Xj r2) {
        A00(this, r2).D3N(r2);
    }

    public final void D3b(AnonymousClass8ZN r2, C67231sQ r3, 1Xj r4, AnonymousClass3W1 r5) {
        C51974G9v.A1O(r4, r5, r2, r3);
        this.A02.D3b(r2, r3, r4, r5);
    }

    public final View.OnTouchListener D3c(1Xj r2) {
        return A00(this, r2).D3c(r2);
    }

    public final void D3d(1Xj r2, boolean z) {
        A00(this, r2).D3d(r2, z);
    }

    public final void D3x(1Xj r2) {
        A00(this, r2).D3x(r2);
    }

    public final void D44(1Xj r2) {
        A00(this, r2).D44(r2);
    }

    public final void D4B(String str) {
        A00(this, str).D4B(str);
    }

    public final void D4L(1Xj r2) {
        A00(this, r2).D4L(r2);
    }

    public final void DQd(View view, 1Xj r3) {
        AnonymousClass7TG.A1N(r3, view);
        this.A02.DQd(view, r3);
    }

    public final void DV6(String str) {
        A00(this, str).DV6(str);
    }

    public final void DVd(1Xj r2) {
        A00(this, r2).DVd(r2);
    }

    public final void DVe(1Xj r2, AnonymousClass3W1 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.DVe(r2, r3);
    }

    public final void DbT(1Xj r2) {
        A00(this, r2).DbT(r2);
    }

    public final View.OnTouchListener Dsc(1Xj r2, String str, String str2) {
        AnonymousClass7TG.A1T(r2, str, str2);
        return this.A02.Dsc(r2, str, str2);
    }

    public final View.OnTouchListener Dsd(1Xj r2, String str, String str2) {
        AnonymousClass7TG.A1T(r2, str, str2);
        return this.A02.Dsd(r2, str, str2);
    }

    public final View.OnTouchListener Dsk(1Xj r2, String str, String str2) {
        AnonymousClass7TG.A1T(r2, str, str2);
        return this.A02.Dsk(r2, str, str2);
    }

    public final void Dtz(1Xj r2) {
        A00(this, r2).Dtz(r2);
    }
}
