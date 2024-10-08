package X;

import android.app.Activity;
import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.WZr  reason: case insensitive filesystem */
public final class C19443WZr implements X4O {
    public final /* synthetic */ C15361UbD A00;

    public C19443WZr(C15361UbD ubD) {
        this.A00 = ubD;
    }

    public final void Dc9(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C15361UbD ubD = this.A00;
        if (ubD.A02 == null) {
            ubD.A02 = new C16165Upq((Activity) ubD.getActivity(), (View) gradientSpinnerAvatarView, (C230222pE) new C19489Wab(this, 7));
        }
        AnonymousClass32A r2 = new AnonymousClass32A(ubD, ubD.A00, new AnonymousClass328(ubD));
        r2.A05 = ubD.A02;
        r2.A0C = ubD.A05;
        Reel reel = ubD.A04.A01;
        reel.getClass();
        r2.A08(reel, AnonymousClass3BQ.CONTEXT_SHEET_LOCATION, gradientSpinnerAvatarView);
    }
}
