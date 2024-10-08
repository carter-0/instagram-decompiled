package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.73X  reason: invalid class name */
public final class AnonymousClass73X implements View.OnClickListener {
    public final /* synthetic */ C330047Lf A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ GradientSpinnerAvatarView A02;

    public AnonymousClass73X(C330047Lf r1, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.A01 = reel;
        this.A00 = r1;
        this.A02 = gradientSpinnerAvatarView;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(304126816);
        Reel reel = this.A01;
        if (reel != null) {
            this.A00.DcA(reel, this.A02);
        }
        AnonymousClass0fD.A0C(-1194306657, A05);
    }
}
