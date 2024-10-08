package X;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dm6  reason: case insensitive filesystem */
public final class C46830Dm6 extends 2Rw {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C255773uh A02;
    public final ReelDashboardFragment A03;
    public final List A04;

    public final void onBindViewHolder(C249703kE r9, int i) {
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A01;
        C46971DoP doP = (C46971DoP) r9;
        ReelDashboardFragment reelDashboardFragment = this.A03;
        Reel reel = (Reel) this.A04.get(i);
        AnonymousClass0iw r2 = this.A00;
        AnonymousClass7TG.A1P(doP, reel);
        User A0D = reel.A0D();
        if (A0D != null) {
            DbU.A1H(doP.A01, A0D);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = doP.A02;
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r2, A0D.Bh3());
            gradientSpinnerAvatarView.setGradientSpinnerActivated(AnonymousClass7TF.A1Q((2O0.A00(userSession).A02(reel) > 0 ? 1 : (2O0.A00(userSession).A02(reel) == 0 ? 0 : -1))));
            FPH.A00(doP.A00, reelDashboardFragment, doP, reel, 55);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46971DoP(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.prompt_reply, false));
    }

    public C46830Dm6(AnonymousClass0iw r7, UserSession userSession, C255773uh r9, ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass7TG.A1U(r7, userSession, r9);
        0qQ.A0B(reelDashboardFragment, 4);
        this.A00 = r7;
        this.A01 = userSession;
        this.A02 = r9;
        this.A03 = reelDashboardFragment;
        ImmutableList A0K = DbU.A0K(r9.A0m);
        ArrayList A0r = AnonymousClass7TG.A0r(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            C61122JxY jxY = (C61122JxY) it.next();
            String str = jxY.A01;
            User user = jxY.A00;
            Reel reel = new Reel(new 1Nr(user), str, DbV.A1Z(user, this.A01.A06));
            ReelStore.A03(this.A01).A0X(reel);
            A0r.add(reel);
        }
        this.A04 = A0r;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-377493833);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(308620118, A032);
        return size;
    }
}
