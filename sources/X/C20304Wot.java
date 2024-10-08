package X;

import android.view.animation.AlphaAnimation;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Wot  reason: case insensitive filesystem */
public final class C20304Wot implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ IgSimpleImageView A01;
    public final /* synthetic */ boolean A02;

    public C20304Wot(AlphaAnimation alphaAnimation, IgSimpleImageView igSimpleImageView, boolean z) {
        this.A01 = igSimpleImageView;
        this.A00 = alphaAnimation;
        this.A02 = z;
    }

    public final void run() {
        IgSimpleImageView igSimpleImageView = this.A01;
        igSimpleImageView.startAnimation(this.A00);
        igSimpleImageView.setVisibility(DbW.A01(this.A02 ? 1 : 0));
    }
}
