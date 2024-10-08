package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.L8c  reason: case insensitive filesystem */
public final class C63821L8c {
    public final View A00;
    public final ConstraintLayout A01;
    public final RoundedCornerFrameLayout A02;
    public final AnonymousClass0eM A03;

    public C63821L8c(View view, Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        C66305MMo mMo = new C66305MMo(userSession, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66305MMo(new C66305MMo(fragment, 45), 46));
        this.A03 = DbS.A0I(new C66305MMo(A002, 47), mMo, new MJ6(16, (Object) null, A002), DbS.A0z(C60127Jg8.class));
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.iglive_media_layout);
        this.A02 = roundedCornerFrameLayout;
        ViewParent parent = roundedCornerFrameLayout.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.A01 = (ConstraintLayout) parent;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.iglive_dimmer_view);
        Context A0S = AnonymousClass7TE.A0S(roundedCornerFrameLayout);
        ((C60127Jg8) this.A03.getValue()).A00.Epw(Float.valueOf(((float) 0nA.A09(A0S)) / ((float) 0nA.A08(A0S))));
    }
}
