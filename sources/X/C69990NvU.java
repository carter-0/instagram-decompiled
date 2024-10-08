package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.NvU  reason: case insensitive filesystem */
public abstract class C69990NvU {
    public static final void A00(Drawable drawable, View view, IgSimpleImageView igSimpleImageView, C62320sa r9) {
        View view2 = view;
        IgSimpleImageView igSimpleImageView2 = igSimpleImageView;
        AnonymousClass7TF.A1H(igSimpleImageView, view);
        Context A0S = AnonymousClass7TE.A0S(igSimpleImageView);
        float A00 = C61380mr.A00(A0S, 30.0f);
        if (drawable != null) {
            igSimpleImageView.setImageDrawable(drawable);
        } else {
            igSimpleImageView.setImageResource(R.drawable.instagram_heart_pano_filled_24);
        }
        DbU.A14(A0S, igSimpleImageView, R.color.igds_creation_tools_pink);
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setScaleX(0.0f);
        igSimpleImageView.setScaleY(0.0f);
        if (view.getVisibility() != 0) {
            view.setVisibility(4);
        }
        float A002 = C61380mr.A00(A0S, 4.5f);
        ViewPropertyAnimator interpolator = C66581MXm.A0D(C66581MXm.A0E(igSimpleImageView2.animate(), 2.0f).translationY(-A00)).setInterpolator(new DecelerateInterpolator());
        0qQ.A07(interpolator);
        interpolator.withEndAction(new C73216PYu(igSimpleImageView2, new C73385Pbi(view2, igSimpleImageView2, new C73090PVx(view), r9, A002)));
    }
}
