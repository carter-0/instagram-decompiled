package X;

import android.app.Activity;
import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class FkH implements X4O {
    public final /* synthetic */ C47498E5d A00;

    public FkH(C47498E5d e5d) {
        this.A00 = e5d;
    }

    public final void Dc9(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C47498E5d e5d = this.A00;
        if (e5d.A03 == null) {
            e5d.A03 = new C16165Upq((Activity) e5d.getActivity(), (View) gradientSpinnerAvatarView, (C230222pE) new C50896Fkb(this, 19));
        }
        AnonymousClass32A r2 = new AnonymousClass32A(e5d, e5d.A01, DbV.A0f(e5d));
        r2.A05 = e5d.A03;
        r2.A0C = e5d.A07;
        Reel reel = e5d.A02;
        reel.getClass();
        r2.A08(reel, AnonymousClass3BQ.CONTEXT_SHEET_USER, gradientSpinnerAvatarView);
    }
}
