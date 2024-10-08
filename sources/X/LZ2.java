package X;

import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class LZ2 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ AnonymousClass7JI A01;

    public LZ2(IgSimpleImageView igSimpleImageView, AnonymousClass7JI r2) {
        this.A00 = igSimpleImageView;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        IgSimpleImageView igSimpleImageView = this.A00;
        igSimpleImageView.getViewTreeObserver().removeOnPreDrawListener(this);
        AnonymousClass7JI.A03(igSimpleImageView, this.A01);
        return true;
    }
}
