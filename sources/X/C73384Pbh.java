package X;

import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.Pbh  reason: case insensitive filesystem */
public final class C73384Pbh implements Runnable {
    public final /* synthetic */ C59671JTb A00;
    public final /* synthetic */ IgSimpleImageView A01;
    public final /* synthetic */ IgSimpleImageView A02;
    public final /* synthetic */ C63939LEc A03;
    public final /* synthetic */ IgBouncyUfiButtonImageView A04;

    public C73384Pbh(C59671JTb jTb, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, C63939LEc lEc, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        this.A02 = igSimpleImageView;
        this.A01 = igSimpleImageView2;
        this.A04 = igBouncyUfiButtonImageView;
        this.A03 = lEc;
        this.A00 = jTb;
    }

    public final void run() {
        ViewPropertyAnimator withEndAction = C66581MXm.A0E(this.A02.animate(), 0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200).withEndAction(new C73088PVv(this.A01));
        0qQ.A07(withEndAction);
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A04;
        withEndAction.setUpdateListener(new C71167Oeg(1, withEndAction, this.A00, this.A03, igBouncyUfiButtonImageView)).start();
    }
}
