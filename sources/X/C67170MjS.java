package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MjS  reason: case insensitive filesystem */
public final class C67170MjS extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A01;
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        if (DbS.A04(DbS.A0J(userSession, 0), userSession, 36609906094446532L) > 0) {
            A01 = 2Su.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.layout_listview_empty_state);
        } else {
            A01 = C3254972u.A01(layoutInflater, viewGroup);
        }
        return new AnonymousClass730(A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C67289MlO mlO = (C67289MlO) r3;
        AnonymousClass730 r42 = (AnonymousClass730) r4;
        AnonymousClass7TG.A1N(mlO, r42);
        C3254972u.A02(mlO.A02, r42, mlO.A03);
    }

    public final Class modelClass() {
        return C67289MlO.class;
    }

    public C67170MjS(UserSession userSession) {
        this.A00 = userSession;
    }
}
