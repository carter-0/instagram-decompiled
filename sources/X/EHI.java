package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public final class EHI extends C232232tF {
    public View A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final E64 A03;
    public final Context A04;

    public EHI(Context context, AnonymousClass0iw r3, UserSession userSession, E64 e64) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A04 = context;
        this.A03 = e64;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C47234DtL dtL = (C47234DtL) r8;
        C46966DoK doK = (C46966DoK) r9;
        boolean A1Z = AnonymousClass7TG.A1Z(dtL, doK);
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        E64 e64 = this.A03;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1D(r3, A1Z ? 1 : 0, e64);
        IgTextView igTextView = doK.A01;
        User user = dtL.A01;
        DbU.A1H(igTextView, user);
        C244273av.A0B(igTextView, user.isVerified());
        GradientSpinnerAvatarView gradientSpinnerAvatarView = doK.A02;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r3, user.Bh3());
        gradientSpinnerAvatarView.setGradientSpinnerActivated(AnonymousClass7TF.A1Q((2O0.A00(userSession).A02(dtL.A00) > 0 ? 1 : (2O0.A00(userSession).A02(dtL.A00) == 0 ? 0 : -1))));
        gradientSpinnerAvatarView.setGradientColor((RingSpec) AnonymousClass3Mk.A0C.getValue());
        FPH.A00(doK.A00, e64, dtL, doK, 32);
    }

    public final Class modelClass() {
        return C47234DtL.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_participants_grid_item, false);
        this.A00 = A0D;
        return new C46966DoK(A0D);
    }
}
