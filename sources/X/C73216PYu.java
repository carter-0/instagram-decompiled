package X;

import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.PYu  reason: case insensitive filesystem */
public final class C73216PYu implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ Runnable A01;

    public C73216PYu(IgSimpleImageView igSimpleImageView, Runnable runnable) {
        this.A00 = igSimpleImageView;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.postDelayed(this.A01, 250);
    }
}
