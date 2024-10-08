package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.PaZ  reason: case insensitive filesystem */
public final class C73314PaZ implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ C62320sa A02;

    public C73314PaZ(IgSimpleImageView igSimpleImageView, Runnable runnable, C62320sa r3) {
        this.A01 = runnable;
        this.A02 = r3;
        this.A00 = igSimpleImageView;
    }

    public final void run() {
        this.A01.run();
        this.A02.invoke();
        IgSimpleImageView igSimpleImageView = this.A00;
        igSimpleImageView.setTranslationY(0.0f);
        igSimpleImageView.setTranslationX(0.0f);
        igSimpleImageView.setScaleY(1.0f);
        igSimpleImageView.setScaleX(1.0f);
        igSimpleImageView.setVisibility(8);
    }
}
