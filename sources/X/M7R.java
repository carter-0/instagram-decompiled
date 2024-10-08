package X;

import com.instagram.common.ui.base.IgSimpleImageView;

public final class M7R implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ Runnable A01;

    public M7R(IgSimpleImageView igSimpleImageView, Runnable runnable) {
        this.A00 = igSimpleImageView;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.postDelayed(this.A01, 600);
    }
}
