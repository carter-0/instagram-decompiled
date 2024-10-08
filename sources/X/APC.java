package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class APC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ AZU A01;

    public APC(IgSimpleImageView igSimpleImageView, AZU azu) {
        this.A00 = igSimpleImageView;
        this.A01 = azu;
    }

    public final void onGlobalLayout() {
        IgSimpleImageView igSimpleImageView = this.A00;
        ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        AZU azu = this.A01;
        igSimpleImageView.setLayoutParams(new FrameLayout.LayoutParams(azu.A0G, azu.A0F));
    }
}
