package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class KUO extends C60692Jpd {
    public final Fragment A00;
    public final UserSession A01;
    public final IgLinearLayout A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KUO(View view, Fragment fragment, UserSession userSession, boolean z) {
        super(view);
        AnonymousClass7TG.A1Q(fragment, userSession);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = z;
        this.A02 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.mk_profiles_container);
    }
}
