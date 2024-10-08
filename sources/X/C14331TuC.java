package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.TuC  reason: case insensitive filesystem */
public class C14331TuC extends C249703kE implements AnonymousClass2xU {
    public C52435GSn A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final C14332TuD A04;
    public final IgImageButton A05;
    public final Activity A06;
    public final Context A07;
    public final ConstraintLayout A08;
    public final UserSession A09;
    public final IgView A0A;

    public void DQp(AnonymousClass3W1 r2, int i) {
        C14332TuD tuD;
        0qQ.A0B(r2, 0);
        if (i == 50 && !(this instanceof C14351Tug) && (tuD = this.A04) != null) {
            tuD.DQp(r2, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14331TuC(Activity activity, Context context, View view, UserSession userSession) {
        super(view);
        C14332TuD tuD;
        AnonymousClass7TG.A1Q(context, userSession);
        this.A01 = view;
        this.A07 = context;
        this.A09 = userSession;
        this.A06 = activity;
        this.A05 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.image_button);
        this.A08 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.ad_overlay);
        this.A03 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.profile_pic);
        this.A02 = DbW.A0B(view, R.id.label_top_sponsored);
        this.A0A = (IgView) AnonymousClass7TE.A0b(view, R.id.top_legibility_gradient);
        if (view instanceof ViewGroup) {
            tuD = new C14332TuD(activity, context, (ViewGroup) view, userSession);
        } else {
            tuD = null;
        }
        this.A04 = tuD;
    }
}
