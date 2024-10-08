package X;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.TrR  reason: case insensitive filesystem */
public final class C14187TrR {
    public final /* synthetic */ C324426zG A00;
    public final /* synthetic */ C324416zF A01;
    public final /* synthetic */ boolean A02;

    public C14187TrR(C324426zG r1, C324416zF r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void A00() {
        C324426zG r6 = this.A00;
        IgSimpleImageView igSimpleImageView = r6.A03;
        igSimpleImageView.getVisibility();
        if (igSimpleImageView.getVisibility() != 8) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setFillAfter(true);
            igSimpleImageView.post(new C20304Wot(alphaAnimation, igSimpleImageView, false));
        }
        ViewGroup viewGroup = r6.A01;
        viewGroup.getVisibility();
        if (viewGroup.getVisibility() != 8) {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200);
            alphaAnimation2.setFillAfter(true);
            viewGroup.post(new C20305Wou(viewGroup, alphaAnimation2, false));
        }
    }

    public final void A01() {
        if (this.A02) {
            C324426zG r5 = this.A00;
            IgSimpleImageView igSimpleImageView = r5.A03;
            if (igSimpleImageView.getVisibility() != 0) {
                igSimpleImageView.getVisibility();
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200);
                alphaAnimation.setFillAfter(false);
                igSimpleImageView.post(new C20304Wot(alphaAnimation, igSimpleImageView, true));
            }
            ViewGroup viewGroup = r5.A01;
            if (viewGroup.getVisibility() != 0) {
                viewGroup.getVisibility();
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(200);
                alphaAnimation2.setFillAfter(false);
                viewGroup.post(new C20305Wou(viewGroup, alphaAnimation2, true));
            }
        }
    }
}
