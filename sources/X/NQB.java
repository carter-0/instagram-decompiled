package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class NQB extends C232232tF {
    public final Context A00;
    public final UserSession A01;

    public NQB(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68081Mzm(this.A00, DbU.A09(layoutInflater, viewGroup, R.layout.immersive_catch_up_clips_item_layout, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        User A11;
        C53503GpZ gpZ = (C53503GpZ) r18;
        C68081Mzm mzm = (C68081Mzm) r19;
        boolean A1U = AnonymousClass7TF.A1U(0, gpZ, mzm);
        1Xj r4 = gpZ.A00.A02;
        if (r4 != null && (A11 = C51966G9m.A11(r4)) != null) {
            mzm.A01.setUrl(A11.Bh3(), new C71856Orx());
            DbU.A1H(mzm.A00, A11);
            C14044Tol tol = mzm.A03;
            String str = r4.A0M;
            tol.A09(mzm.A02, r4.A2D(), new C263754Nf((Object) r4, 0), str, "ImmsersiveCatchUpClipsItemViewHolder", 1.0f, -1, 0, A1U, A1U);
        }
    }

    public final Class modelClass() {
        return C53503GpZ.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C68081Mzm mzm = (C68081Mzm) r4;
        0qQ.A0B(mzm, 0);
        mzm.A03.A0D("stop", false);
    }
}
