package X;

import android.animation.Animator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.9qc  reason: invalid class name and case insensitive filesystem */
public final class C390029qc extends AnonymousClass4HM {
    public final /* synthetic */ C339807kC A00;

    public C390029qc(C339807kC r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C339807kC r2 = this.A00;
        IgSimpleImageView igSimpleImageView = r2.A07;
        igSimpleImageView.setScaleType(r2.A05);
        igSimpleImageView.getLayoutParams().width = r2.A02;
    }
}
