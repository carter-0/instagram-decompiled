package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KFe  reason: case insensitive filesystem */
public final class C61628KFe extends C232222tE {
    public final Activity A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60572Jnh(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlights_in_grid_empty_state, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C60572Jnh jnh = (C60572Jnh) r6;
        0qQ.A0B(jnh, 1);
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass7TF.A1B(activity, 1, userSession);
        LY7.A00(jnh.A00, 32, activity, userSession);
    }

    public final Class modelClass() {
        return KGF.class;
    }

    public C61628KFe(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
