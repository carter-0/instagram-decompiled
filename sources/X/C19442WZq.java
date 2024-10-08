package X;

import android.app.Activity;
import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.WZq  reason: case insensitive filesystem */
public final class C19442WZq implements X4O {
    public final /* synthetic */ C15362UbE A00;

    public C19442WZq(C15362UbE ubE) {
        this.A00 = ubE;
    }

    public final void Dc9(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C15362UbE ubE = this.A00;
        if (ubE.A05 == null) {
            ubE.A05 = new C16165Upq((Activity) ubE.getActivity(), (View) gradientSpinnerAvatarView, (C230222pE) new C19489Wab(this, 6));
        }
        AnonymousClass32A r2 = new AnonymousClass32A(ubE, ubE.A01, new AnonymousClass328(ubE));
        r2.A05 = ubE.A05;
        r2.A0C = ubE.A09;
        Reel reel = ubE.A06.A02;
        reel.getClass();
        r2.A08(reel, AnonymousClass3BQ.CONTEXT_SHEET_HASHTAG, gradientSpinnerAvatarView);
    }
}
